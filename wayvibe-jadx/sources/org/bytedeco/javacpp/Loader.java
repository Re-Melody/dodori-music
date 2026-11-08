package org.bytedeco.javacpp;

import B2.AbstractC0112b;
import V0.p;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.common.events.BackendEvent;
import com.revenuecat.purchases.common.localrules.DeviceDimensionProvider;
import com.revenuecat.purchases.common.networking.ETagPayloadStore;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.JarURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.WeakHashMap;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import org.apache.tika.metadata.MachineMetadata;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.javacpp.annotation.Name;
import org.bytedeco.javacpp.annotation.Platform;
import org.bytedeco.javacpp.tools.Logger;

/* JADX INFO: loaded from: classes2.dex */
public class Loader {
    private static final String PLATFORM;
    static File cacheDir;
    static Map<String, String> loadedLibraries;
    static WeakHashMap<Class<? extends Pointer>, HashMap<String, Integer>> memberOffsets;
    static boolean pathsFirst;
    static File tempDir;
    private static final Logger logger = Logger.create(Loader.class);
    private static Properties platformProperties = null;

    static {
        String lowerCase = System.getProperty("java.vm.name", "").toLowerCase();
        String lowerCase2 = System.getProperty("os.name", "").toLowerCase();
        String lowerCase3 = System.getProperty("os.arch", "").toLowerCase();
        String lowerCase4 = System.getProperty("sun.arch.abi", "").toLowerCase();
        String lowerCase5 = System.getProperty("sun.boot.library.path", "").toLowerCase();
        String str = "arm";
        if (lowerCase.startsWith("dalvik") && lowerCase2.startsWith("linux")) {
            lowerCase2 = BackendEvent.Workflows.Context.WORKFLOW_CONTEXT_PLATFORM;
        } else if (lowerCase.startsWith("robovm") && lowerCase2.startsWith("darwin")) {
            lowerCase2 = "ios";
            lowerCase3 = "arm";
        } else if (lowerCase2.startsWith("mac os x") || lowerCase2.startsWith("darwin")) {
            lowerCase2 = "macosx";
        } else {
            int iIndexOf = lowerCase2.indexOf(32);
            if (iIndexOf > 0) {
                lowerCase2 = lowerCase2.substring(0, iIndexOf);
            }
        }
        if (lowerCase3.equals("i386") || lowerCase3.equals("i486") || lowerCase3.equals("i586") || lowerCase3.equals("i686")) {
            str = "x86";
        } else if (lowerCase3.equals("amd64") || lowerCase3.equals(MachineMetadata.MACHINE_x86_64) || lowerCase3.equals("x64")) {
            str = "x86_64";
        } else if (lowerCase3.startsWith("aarch64") || lowerCase3.startsWith("armv8") || lowerCase3.startsWith("arm64")) {
            str = "arm64";
        } else if (lowerCase3.startsWith("arm") && (lowerCase4.equals("gnueabihf") || lowerCase5.contains("openjdk-armhf"))) {
            str = "armhf";
        } else if (!lowerCase3.startsWith("arm")) {
            str = lowerCase3;
        }
        PLATFORM = p.B(lowerCase2, "-", str);
        cacheDir = null;
        tempDir = null;
        loadedLibraries = new HashMap();
        pathsFirst = false;
        String lowerCase6 = System.getProperty("org.bytedeco.javacpp.pathsfirst", b.ag).toLowerCase();
        pathsFirst = lowerCase6.equals(b.af) || lowerCase6.equals("t") || lowerCase6.equals("");
        memberOffsets = new WeakHashMap<>();
    }

    @Name({"JavaCPP_addressof"})
    public static native Pointer addressof(String str);

    public static File cacheResource(String str) {
        return cacheResource(getCallerClass(2), str);
    }

    public static File[] cacheResources(String str) {
        return cacheResources(getCallerClass(2), str);
    }

    public static boolean checkPlatform(Class<?> cls, Properties properties) {
        Class<?> enclosingClass = getEnclosingClass(cls);
        while (!cls.isAnnotationPresent(org.bytedeco.javacpp.annotation.Properties.class) && !cls.isAnnotationPresent(Platform.class) && cls.getSuperclass() != null) {
            if (enclosingClass == null || cls.getSuperclass() != Object.class) {
                cls = cls.getSuperclass();
            } else {
                Class<?> cls2 = enclosingClass;
                enclosingClass = null;
                cls = cls2;
            }
        }
        org.bytedeco.javacpp.annotation.Properties properties2 = (org.bytedeco.javacpp.annotation.Properties) cls.getAnnotation(org.bytedeco.javacpp.annotation.Properties.class);
        if (properties2 != null) {
            Class[] clsArrInherit = properties2.inherit();
            String[] strArrNames = properties2.names();
            ArrayDeque arrayDeque = new ArrayDeque(Arrays.asList(clsArrInherit));
            while (arrayDeque.size() > 0 && (strArrNames == null || strArrNames.length == 0)) {
                org.bytedeco.javacpp.annotation.Properties properties3 = (org.bytedeco.javacpp.annotation.Properties) ((Class) arrayDeque.removeFirst()).getAnnotation(org.bytedeco.javacpp.annotation.Properties.class);
                if (properties3 != null) {
                    strArrNames = properties3.names();
                    arrayDeque.addAll(Arrays.asList(properties3.inherit()));
                }
            }
            Platform[] platformArrValue = properties2.value();
            if (platformArrValue != null && platformArrValue.length > 0) {
                for (Platform platform : platformArrValue) {
                    if (checkPlatform(platform, properties, strArrNames)) {
                        return true;
                    }
                }
            } else if (clsArrInherit != null && clsArrInherit.length > 0) {
                for (Class cls3 : clsArrInherit) {
                    if (checkPlatform(cls3, properties)) {
                        return true;
                    }
                }
            }
        } else if (checkPlatform((Platform) cls.getAnnotation(Platform.class), properties, new String[0])) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:97:0x01b4  */
    /* JADX WARN: Instruction removed from duplicated block: B:97:0x01b4, please report this as an issue */
    public static String createLibraryLink(String str, ClassProperties classProperties, String str2, String... strArr) {
        String string;
        String str3;
        Logger logger2;
        File file = new File(str);
        String parent = file.getParent();
        String name = file.getName();
        int i10 = 0;
        String[] strArrSplit = str2 != null ? str2.split("#") : new String[]{""};
        String[] strArrSplit2 = (strArrSplit.length > 1 ? strArrSplit[1] : strArrSplit[0]).split("@");
        String str4 = strArrSplit2[0];
        String str5 = strArrSplit2.length > 1 ? strArrSplit2[strArrSplit2.length - 1] : "";
        if (name.contains(str4)) {
            Iterator<String> it = classProperties.get("platform.library.suffix").iterator();
            while (true) {
                if (!it.hasNext()) {
                    string = null;
                    break;
                }
                String next = it.next();
                int iLastIndexOf = name.lastIndexOf(next);
                int iLastIndexOf2 = str5.length() != 0 ? name.lastIndexOf(str5) : name.indexOf(".");
                if (iLastIndexOf > 0 && iLastIndexOf2 > 0) {
                    StringBuilder sb = new StringBuilder();
                    if (iLastIndexOf >= iLastIndexOf2) {
                        iLastIndexOf = iLastIndexOf2;
                    }
                    sb.append(name.substring(0, iLastIndexOf));
                    sb.append(next);
                    string = sb.toString();
                    break;
                }
            }
            if (string == null) {
                Iterator<String> it2 = classProperties.get("platform.library.suffix").iterator();
                while (it2.hasNext()) {
                    if (name.endsWith(it2.next())) {
                        string = name;
                        break;
                    }
                }
            }
            if (string != null && string.length() > 0) {
                File file2 = new File(parent, string);
                try {
                    Path path = file2.toPath();
                    Path path2 = Paths.get(name, new String[0]);
                    if (!file2.exists() || !Files.isSymbolicLink(path) || !Files.readSymbolicLink(path).equals(path2)) {
                        if (!path2.isAbsolute() && !path2.equals(path.getFileName())) {
                            Logger logger3 = logger;
                            if (logger3.isDebugEnabled()) {
                                logger3.debug("Creating symbolic link " + path);
                            }
                            file2.delete();
                            Files.createSymbolicLink(path, path2, new FileAttribute[0]);
                        }
                    }
                    String string2 = file2.toString();
                    int length = strArr.length;
                    int i11 = 0;
                    while (i11 < length) {
                        String str6 = strArr[i11];
                        if (str6 != null) {
                            String[] strArr2 = {string, name};
                            int i12 = i10;
                            while (i12 < 2) {
                                File file3 = new File(str6, strArr2[i12]);
                                Path path3 = file3.toPath();
                                str3 = null;
                                try {
                                    String str7 = string2;
                                    Path pathResolve = Paths.get(str6, new String[i10]).relativize(Paths.get(parent, new String[i10])).resolve(name);
                                    if (!file3.exists() || !Files.isSymbolicLink(path3) || !Files.readSymbolicLink(path3).equals(pathResolve)) {
                                        if (!pathResolve.isAbsolute() && !pathResolve.equals(path3.getFileName())) {
                                            Logger logger4 = logger;
                                            if (logger4.isDebugEnabled()) {
                                                logger4.debug("Creating symbolic link " + path3);
                                            }
                                            file3.delete();
                                            i10 = 0;
                                            Files.createSymbolicLink(path3, pathResolve, new FileAttribute[0]);
                                        }
                                    }
                                    i12++;
                                    string2 = str7;
                                } catch (IOException e2) {
                                    e = e2;
                                    logger2 = logger;
                                    if (logger2.isDebugEnabled()) {
                                        logger2.debug("Failed to create symbolic link " + file2 + ": " + e);
                                    }
                                    return str3;
                                } catch (RuntimeException e4) {
                                    e = e4;
                                    logger2 = logger;
                                    if (logger2.isDebugEnabled()) {
                                        logger2.debug("Failed to create symbolic link " + file2 + ": " + e);
                                    }
                                    return str3;
                                }
                            }
                        }
                        i11++;
                        string2 = string2;
                    }
                    return string2;
                } catch (IOException e7) {
                    e = e7;
                    str3 = null;
                    logger2 = logger;
                    if (logger2.isDebugEnabled()) {
                        logger2.debug("Failed to create symbolic link " + file2 + ": " + e);
                    }
                    return str3;
                } catch (RuntimeException e10) {
                    e = e10;
                    str3 = null;
                    logger2 = logger;
                    if (logger2.isDebugEnabled()) {
                        logger2.debug("Failed to create symbolic link " + file2 + ": " + e);
                    }
                    return str3;
                }
            }
        }
        return str;
    }

    public static File extractResource(String str, File file, String str2, String str3) {
        return extractResource(getCallerClass(2), str, file, str2, str3);
    }

    public static File[] extractResources(String str, File file, String str2, String str3) {
        return extractResources(getCallerClass(2), str, file, str2, str3);
    }

    public static URL[] findLibrary(Class cls, ClassProperties classProperties, String str) {
        return findLibrary(cls, classProperties, str, pathsFirst);
    }

    public static URL findResource(Class cls, String str) throws IOException {
        URL[] urlArrFindResources = findResources(cls, str, 1);
        if (urlArrFindResources.length > 0) {
            return urlArrFindResources[0];
        }
        return null;
    }

    public static URL[] findResources(Class cls, String str) {
        return findResources(cls, str, -1);
    }

    public static File getCacheDir() throws IOException {
        if (cacheDir == null) {
            String[] strArr = {System.getProperty("org.bytedeco.javacpp.cachedir"), System.getProperty("user.home") + "/.javacpp/cache/", System.getProperty("java.io.tmpdir") + "/.javacpp-" + System.getProperty("user.name") + "/cache/"};
            for (int i10 = 0; i10 < 3; i10++) {
                String str = strArr[i10];
                if (str != null) {
                    try {
                        File file = new File(str);
                        if (file.exists() || file.mkdirs()) {
                            cacheDir = file;
                            break;
                        }
                    } catch (SecurityException unused) {
                        continue;
                    }
                }
            }
        }
        File file2 = cacheDir;
        if (file2 != null) {
            return file2;
        }
        throw new IOException("Could not create the cache: Set the \"org.bytedeco.javacpp.cachedir\" system property.");
    }

    public static Class getCallerClass(int i10) {
        Class[] classContext;
        try {
            classContext = new SecurityManager() { // from class: org.bytedeco.javacpp.Loader.1
                @Override // java.lang.SecurityManager
                public Class[] getClassContext() {
                    return super.getClassContext();
                }
            }.getClassContext();
        } catch (NoSuchMethodError | SecurityException e2) {
            logger.warn("Could not create an instance of SecurityManager: " + e2.getMessage());
            classContext = null;
        }
        int i11 = 0;
        if (classContext != null) {
            while (i11 < classContext.length) {
                if (classContext[i11] == Loader.class) {
                    return classContext[i10 + i11];
                }
                i11++;
            }
        } else {
            try {
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                while (i11 < stackTrace.length) {
                    if (Class.forName(stackTrace[i11].getClassName()) == Loader.class) {
                        return Class.forName(stackTrace[i10 + i11].getClassName());
                    }
                    i11++;
                }
            } catch (ClassNotFoundException e4) {
                logger.error("No definition for the class found : " + e4.getMessage());
            }
        }
        return null;
    }

    public static Class getEnclosingClass(Class cls) {
        while (cls.getEnclosingClass() != null && !cls.isAnnotationPresent(org.bytedeco.javacpp.annotation.Properties.class)) {
            if (cls.isAnnotationPresent(Platform.class)) {
                Platform platform = (Platform) cls.getAnnotation(Platform.class);
                if (platform.pragma().length > 0 || platform.define().length > 0 || platform.exclude().length > 0 || platform.include().length > 0 || platform.cinclude().length > 0 || platform.includepath().length > 0 || platform.includeresource().length > 0 || platform.compiler().length > 0 || platform.linkpath().length > 0 || platform.linkresource().length > 0 || platform.link().length > 0 || platform.frameworkpath().length > 0 || platform.framework().length > 0 || platform.preloadresource().length > 0 || platform.preloadpath().length > 0 || platform.preload().length > 0 || platform.resourcepath().length > 0 || platform.resource().length > 0 || platform.library().length() > 0) {
                    break;
                }
            }
            cls = cls.getEnclosingClass();
        }
        return cls;
    }

    @Cast({"JavaVM*"})
    @Name({"JavaCPP_getJavaVM"})
    public static native Pointer getJavaVM();

    public static synchronized Map<String, String> getLoadedLibraries() {
        return new HashMap(loadedLibraries);
    }

    public static String getPlatform() {
        return System.getProperty("org.bytedeco.javacpp.platform", PLATFORM);
    }

    public static File getTempDir() {
        if (tempDir == null) {
            File file = new File(System.getProperty("java.io.tmpdir"));
            for (int i10 = 0; i10 < 1000; i10++) {
                File file2 = new File(file, "javacpp" + System.nanoTime());
                if (file2.mkdir()) {
                    tempDir = file2;
                    file2.deleteOnExit();
                    break;
                }
            }
        }
        return tempDir;
    }

    public static boolean isLoadLibraries() {
        String lowerCase = System.getProperty("org.bytedeco.javacpp.loadlibraries", b.af).toLowerCase();
        return lowerCase.equals(b.af) || lowerCase.equals("t") || lowerCase.equals("");
    }

    public static String load() {
        return load(getCallerClass(2), loadProperties(), pathsFirst);
    }

    /* JADX WARN: Code duplicated, block: B:127:0x024a A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:4:0x0009, B:9:0x0012, B:11:0x001f, B:14:0x0025, B:15:0x002e, B:18:0x0033, B:19:0x0039, B:92:0x0183, B:94:0x0189, B:95:0x018d, B:97:0x0195, B:100:0x01ad, B:103:0x01b7, B:105:0x01c4, B:23:0x004a, B:26:0x0051, B:42:0x00a5, B:44:0x00ad, B:46:0x00bc, B:48:0x00c2, B:49:0x00cb, B:51:0x00d9, B:53:0x00df, B:61:0x00f2, B:63:0x00f8, B:65:0x00fe, B:68:0x0108, B:70:0x010f, B:80:0x0133, B:82:0x013d, B:84:0x0145, B:32:0x0075, B:34:0x007d, B:30:0x006a, B:111:0x01f7, B:113:0x0203, B:115:0x021d, B:116:0x0231, B:136:0x0287, B:138:0x028e, B:140:0x0294, B:141:0x0297, B:143:0x029f, B:144:0x02bb, B:125:0x0243, B:127:0x024a, B:129:0x0250, B:130:0x0253, B:132:0x0267, B:133:0x0283), top: B:147:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x0267 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:4:0x0009, B:9:0x0012, B:11:0x001f, B:14:0x0025, B:15:0x002e, B:18:0x0033, B:19:0x0039, B:92:0x0183, B:94:0x0189, B:95:0x018d, B:97:0x0195, B:100:0x01ad, B:103:0x01b7, B:105:0x01c4, B:23:0x004a, B:26:0x0051, B:42:0x00a5, B:44:0x00ad, B:46:0x00bc, B:48:0x00c2, B:49:0x00cb, B:51:0x00d9, B:53:0x00df, B:61:0x00f2, B:63:0x00f8, B:65:0x00fe, B:68:0x0108, B:70:0x010f, B:80:0x0133, B:82:0x013d, B:84:0x0145, B:32:0x0075, B:34:0x007d, B:30:0x006a, B:111:0x01f7, B:113:0x0203, B:115:0x021d, B:116:0x0231, B:136:0x0287, B:138:0x028e, B:140:0x0294, B:141:0x0297, B:143:0x029f, B:144:0x02bb, B:125:0x0243, B:127:0x024a, B:129:0x0250, B:130:0x0253, B:132:0x0267, B:133:0x0283), top: B:147:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x017f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x016e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:? A[Catch: all -> 0x0022, SYNTHETIC, TryCatch #0 {all -> 0x0022, blocks: (B:4:0x0009, B:9:0x0012, B:11:0x001f, B:14:0x0025, B:15:0x002e, B:18:0x0033, B:19:0x0039, B:92:0x0183, B:94:0x0189, B:95:0x018d, B:97:0x0195, B:100:0x01ad, B:103:0x01b7, B:105:0x01c4, B:23:0x004a, B:26:0x0051, B:42:0x00a5, B:44:0x00ad, B:46:0x00bc, B:48:0x00c2, B:49:0x00cb, B:51:0x00d9, B:53:0x00df, B:61:0x00f2, B:63:0x00f8, B:65:0x00fe, B:68:0x0108, B:70:0x010f, B:80:0x0133, B:82:0x013d, B:84:0x0145, B:32:0x0075, B:34:0x007d, B:30:0x006a, B:111:0x01f7, B:113:0x0203, B:115:0x021d, B:116:0x0231, B:136:0x0287, B:138:0x028e, B:140:0x0294, B:141:0x0297, B:143:0x029f, B:144:0x02bb, B:125:0x0243, B:127:0x024a, B:129:0x0250, B:130:0x0253, B:132:0x0267, B:133:0x0283), top: B:147:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ad A[Catch: all -> 0x0022, UnsatisfiedLinkError -> 0x0046, URISyntaxException -> 0x009a, IOException -> 0x009e, TryCatch #0 {all -> 0x0022, blocks: (B:4:0x0009, B:9:0x0012, B:11:0x001f, B:14:0x0025, B:15:0x002e, B:18:0x0033, B:19:0x0039, B:92:0x0183, B:94:0x0189, B:95:0x018d, B:97:0x0195, B:100:0x01ad, B:103:0x01b7, B:105:0x01c4, B:23:0x004a, B:26:0x0051, B:42:0x00a5, B:44:0x00ad, B:46:0x00bc, B:48:0x00c2, B:49:0x00cb, B:51:0x00d9, B:53:0x00df, B:61:0x00f2, B:63:0x00f8, B:65:0x00fe, B:68:0x0108, B:70:0x010f, B:80:0x0133, B:82:0x013d, B:84:0x0145, B:32:0x0075, B:34:0x007d, B:30:0x006a, B:111:0x01f7, B:113:0x0203, B:115:0x021d, B:116:0x0231, B:136:0x0287, B:138:0x028e, B:140:0x0294, B:141:0x0297, B:143:0x029f, B:144:0x02bb, B:125:0x0243, B:127:0x024a, B:129:0x0250, B:130:0x0253, B:132:0x0267, B:133:0x0283), top: B:147:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0145 A[Catch: all -> 0x0022, UnsatisfiedLinkError -> 0x0046, URISyntaxException -> 0x009a, IOException -> 0x009e, TRY_LEAVE, TryCatch #0 {all -> 0x0022, blocks: (B:4:0x0009, B:9:0x0012, B:11:0x001f, B:14:0x0025, B:15:0x002e, B:18:0x0033, B:19:0x0039, B:92:0x0183, B:94:0x0189, B:95:0x018d, B:97:0x0195, B:100:0x01ad, B:103:0x01b7, B:105:0x01c4, B:23:0x004a, B:26:0x0051, B:42:0x00a5, B:44:0x00ad, B:46:0x00bc, B:48:0x00c2, B:49:0x00cb, B:51:0x00d9, B:53:0x00df, B:61:0x00f2, B:63:0x00f8, B:65:0x00fe, B:68:0x0108, B:70:0x010f, B:80:0x0133, B:82:0x013d, B:84:0x0145, B:32:0x0075, B:34:0x007d, B:30:0x006a, B:111:0x01f7, B:113:0x0203, B:115:0x021d, B:116:0x0231, B:136:0x0287, B:138:0x028e, B:140:0x0294, B:141:0x0297, B:143:0x029f, B:144:0x02bb, B:125:0x0243, B:127:0x024a, B:129:0x0250, B:130:0x0253, B:132:0x0267, B:133:0x0283), top: B:147:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x016a  */
    /* JADX WARN: Code duplicated, block: B:91:0x0181  */
    /* JADX WARN: Instruction removed from duplicated block: B:132:0x0267, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:84:0x0145, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public static synchronized String loadLibrary(URL[] urlArr, String str, String... strArr) {
        UnsatisfiedLinkError unsatisfiedLinkError;
        Logger logger2;
        File file;
        int length;
        int i10;
        File parentFile;
        String str2;
        int i11;
        Logger logger3;
        UnsatisfiedLinkError unsatisfiedLinkError2;
        String str3;
        int i12;
        URL[] urlArr2 = urlArr;
        synchronized (Loader.class) {
            try {
                UnsatisfiedLinkError unsatisfiedLinkError3 = null;
                if (!isLoadLibraries()) {
                    return null;
                }
                String[] strArrSplit = str.split("#");
                int i13 = 0;
                String str4 = strArrSplit[0];
                if (strArrSplit.length > 1) {
                    str4 = strArrSplit[1];
                }
                String str5 = loadedLibraries.get(str4);
                try {
                    int length2 = urlArr2.length;
                    UnsatisfiedLinkError unsatisfiedLinkError4 = null;
                    int i14 = 0;
                    while (i14 < length2) {
                        try {
                            try {
                                try {
                                    URL url = urlArr2[i14];
                                    URI uri = url.toURI();
                                    try {
                                        file = new File(uri);
                                    } catch (Exception unused) {
                                        File fileCacheResource = cacheResource(url, str5);
                                        if (fileCacheResource == null) {
                                            try {
                                                try {
                                                    fileCacheResource = new File(new URI(uri.toString().split("#")[i13]));
                                                } catch (Exception e2) {
                                                    Logger logger4 = logger;
                                                    if (logger4.isDebugEnabled()) {
                                                        logger4.debug("Failed to access " + uri + ": " + e2);
                                                    }
                                                    file = unsatisfiedLinkError3;
                                                    if (file != 0) {
                                                        File parentFile2 = file.getParentFile();
                                                        length = strArr.length;
                                                        i10 = i13;
                                                        while (i10 < length) {
                                                            UnsatisfiedLinkError unsatisfiedLinkError5 = unsatisfiedLinkError3;
                                                            File file2 = new File(strArr[i10]);
                                                            parentFile = file2.getParentFile();
                                                            if (parentFile != null) {
                                                                str2 = str5;
                                                                i11 = length2;
                                                            } else {
                                                                str2 = str5;
                                                                i11 = length2;
                                                            }
                                                            i10++;
                                                            strArr = strArr;
                                                            unsatisfiedLinkError3 = unsatisfiedLinkError5;
                                                            str5 = str2;
                                                            length2 = i11;
                                                        }
                                                    }
                                                    unsatisfiedLinkError2 = unsatisfiedLinkError3;
                                                    str3 = str5;
                                                    i12 = length2;
                                                    if (str3 != null) {
                                                        return str3;
                                                    }
                                                    if (file == 0) {
                                                    }
                                                    i14++;
                                                    urlArr2 = urlArr;
                                                    unsatisfiedLinkError3 = unsatisfiedLinkError2;
                                                    str5 = str3;
                                                    length2 = i12;
                                                    i13 = 0;
                                                }
                                            } catch (IllegalArgumentException | URISyntaxException unused2) {
                                                fileCacheResource = new File(uri.getPath());
                                            }
                                        }
                                        file = fileCacheResource;
                                        if (file != 0 && strArr != 0) {
                                            File parentFile3 = file.getParentFile();
                                            length = strArr.length;
                                            i10 = i13;
                                            while (i10 < length) {
                                                UnsatisfiedLinkError unsatisfiedLinkError6 = unsatisfiedLinkError3;
                                                File file3 = new File(strArr[i10]);
                                                parentFile = file3.getParentFile();
                                                if (parentFile != null || parentFile.equals(parentFile3)) {
                                                    str2 = str5;
                                                    i11 = length2;
                                                } else {
                                                    File file4 = new File(parentFile3, file3.getName());
                                                    try {
                                                        Path path = file4.toPath();
                                                        Path path2 = file3.toPath();
                                                        if (file4.exists() && Files.isSymbolicLink(path) && Files.readSymbolicLink(path).equals(path2)) {
                                                            str2 = str5;
                                                            i11 = length2;
                                                        } else if (!path2.isAbsolute() || path2.equals(path)) {
                                                            str2 = str5;
                                                            i11 = length2;
                                                        } else {
                                                            Logger logger5 = logger;
                                                            if (logger5.isDebugEnabled()) {
                                                                str2 = str5;
                                                                try {
                                                                    StringBuilder sb = new StringBuilder();
                                                                    i11 = length2;
                                                                    try {
                                                                        sb.append("Creating symbolic link ");
                                                                        sb.append(path);
                                                                        sb.append(" to ");
                                                                        sb.append(path2);
                                                                        logger5.debug(sb.toString());
                                                                    } catch (IOException e4) {
                                                                        e = e4;
                                                                        logger3 = logger;
                                                                        if (logger3.isDebugEnabled()) {
                                                                            logger3.debug("Failed to create symbolic link " + file4 + " to " + file3 + ": " + e);
                                                                        }
                                                                        i10++;
                                                                        strArr = strArr;
                                                                        unsatisfiedLinkError3 = unsatisfiedLinkError6;
                                                                        str5 = str2;
                                                                        length2 = i11;
                                                                    } catch (RuntimeException e7) {
                                                                        e = e7;
                                                                        logger3 = logger;
                                                                        if (logger3.isDebugEnabled()) {
                                                                            logger3.debug("Failed to create symbolic link " + file4 + " to " + file3 + ": " + e);
                                                                        }
                                                                        i10++;
                                                                        strArr = strArr;
                                                                        unsatisfiedLinkError3 = unsatisfiedLinkError6;
                                                                        str5 = str2;
                                                                        length2 = i11;
                                                                    }
                                                                } catch (IOException e10) {
                                                                    e = e10;
                                                                    i11 = length2;
                                                                    logger3 = logger;
                                                                    if (logger3.isDebugEnabled()) {
                                                                        logger3.debug("Failed to create symbolic link " + file4 + " to " + file3 + ": " + e);
                                                                    }
                                                                    i10++;
                                                                    strArr = strArr;
                                                                    unsatisfiedLinkError3 = unsatisfiedLinkError6;
                                                                    str5 = str2;
                                                                    length2 = i11;
                                                                } catch (RuntimeException e11) {
                                                                    e = e11;
                                                                    i11 = length2;
                                                                    logger3 = logger;
                                                                    if (logger3.isDebugEnabled()) {
                                                                        logger3.debug("Failed to create symbolic link " + file4 + " to " + file3 + ": " + e);
                                                                    }
                                                                    i10++;
                                                                    strArr = strArr;
                                                                    unsatisfiedLinkError3 = unsatisfiedLinkError6;
                                                                    str5 = str2;
                                                                    length2 = i11;
                                                                }
                                                            } else {
                                                                str2 = str5;
                                                                i11 = length2;
                                                            }
                                                            file4.delete();
                                                            Files.createSymbolicLink(path, path2, new FileAttribute[0]);
                                                        }
                                                    } catch (IOException e12) {
                                                        e = e12;
                                                        str2 = str5;
                                                        i11 = length2;
                                                        logger3 = logger;
                                                        if (logger3.isDebugEnabled()) {
                                                            logger3.debug("Failed to create symbolic link " + file4 + " to " + file3 + ": " + e);
                                                        }
                                                        i10++;
                                                        strArr = strArr;
                                                        unsatisfiedLinkError3 = unsatisfiedLinkError6;
                                                        str5 = str2;
                                                        length2 = i11;
                                                    } catch (RuntimeException e13) {
                                                        e = e13;
                                                        str2 = str5;
                                                        i11 = length2;
                                                        logger3 = logger;
                                                        if (logger3.isDebugEnabled()) {
                                                            logger3.debug("Failed to create symbolic link " + file4 + " to " + file3 + ": " + e);
                                                        }
                                                        i10++;
                                                        strArr = strArr;
                                                        unsatisfiedLinkError3 = unsatisfiedLinkError6;
                                                        str5 = str2;
                                                        length2 = i11;
                                                    }
                                                }
                                                i10++;
                                                strArr = strArr;
                                                unsatisfiedLinkError3 = unsatisfiedLinkError6;
                                                str5 = str2;
                                                length2 = i11;
                                            }
                                        }
                                    }
                                    unsatisfiedLinkError2 = unsatisfiedLinkError3;
                                    str3 = str5;
                                    i12 = length2;
                                    if (str3 != null) {
                                        return str3;
                                    }
                                    if (file == 0 && file.exists()) {
                                        String absolutePath = file.getAbsolutePath();
                                        try {
                                            Logger logger6 = logger;
                                            if (logger6.isDebugEnabled()) {
                                                logger6.debug("Loading " + absolutePath);
                                            }
                                            loadedLibraries.put(str4, absolutePath);
                                            System.load(absolutePath);
                                            return absolutePath;
                                        } catch (UnsatisfiedLinkError e14) {
                                            unsatisfiedLinkError4 = e14;
                                            loadedLibraries.remove(str4);
                                            Logger logger7 = logger;
                                            if (logger7.isDebugEnabled()) {
                                                logger7.debug("Failed to load " + absolutePath + ": " + unsatisfiedLinkError4);
                                            }
                                        }
                                    }
                                    i14++;
                                    urlArr2 = urlArr;
                                    unsatisfiedLinkError3 = unsatisfiedLinkError2;
                                    str5 = str3;
                                    length2 = i12;
                                    i13 = 0;
                                } catch (IOException e15) {
                                    e = e15;
                                    unsatisfiedLinkError3 = unsatisfiedLinkError4;
                                    loadedLibraries.remove(str4);
                                    if (unsatisfiedLinkError3 != null) {
                                        e.initCause(unsatisfiedLinkError3);
                                    }
                                    unsatisfiedLinkError = new UnsatisfiedLinkError(e.toString());
                                    unsatisfiedLinkError.initCause(e);
                                    logger2 = logger;
                                    if (logger2.isDebugEnabled()) {
                                        throw unsatisfiedLinkError;
                                    }
                                    logger2.debug("Failed to extract for " + str + ": " + unsatisfiedLinkError);
                                    throw unsatisfiedLinkError;
                                }
                            } catch (URISyntaxException e16) {
                                e = e16;
                                unsatisfiedLinkError3 = unsatisfiedLinkError4;
                                loadedLibraries.remove(str4);
                                if (unsatisfiedLinkError3 != null && e.getCause() == null) {
                                    e.initCause(unsatisfiedLinkError3);
                                }
                                unsatisfiedLinkError = new UnsatisfiedLinkError(e.toString());
                                unsatisfiedLinkError.initCause(e);
                                logger2 = logger;
                                if (logger2.isDebugEnabled()) {
                                    throw unsatisfiedLinkError;
                                }
                                logger2.debug("Failed to extract for " + str + ": " + unsatisfiedLinkError);
                                throw unsatisfiedLinkError;
                            }
                        } catch (UnsatisfiedLinkError e17) {
                            e = e17;
                            unsatisfiedLinkError3 = unsatisfiedLinkError4;
                            loadedLibraries.remove(str4);
                            if (unsatisfiedLinkError3 != null && e.getCause() == null) {
                                e.initCause(unsatisfiedLinkError3);
                            }
                            Logger logger8 = logger;
                            if (logger8.isDebugEnabled()) {
                                logger8.debug("Failed to load for " + str + ": " + e);
                            }
                            throw e;
                        }
                    }
                    String str6 = unsatisfiedLinkError3;
                    String str7 = str5;
                    if (str7 != null) {
                        return str7;
                    }
                    if (str.trim().endsWith("#")) {
                        return str6;
                    }
                    String str8 = str.split("#")[0].split("@")[0];
                    Logger logger9 = logger;
                    if (logger9.isDebugEnabled()) {
                        logger9.debug("Loading library " + str8);
                    }
                    loadedLibraries.put(str4, str8);
                    System.loadLibrary(str8);
                    return str8;
                } catch (IOException e18) {
                    e = e18;
                    loadedLibraries.remove(str4);
                    if (unsatisfiedLinkError3 != null) {
                        e.initCause(unsatisfiedLinkError3);
                    }
                    unsatisfiedLinkError = new UnsatisfiedLinkError(e.toString());
                    unsatisfiedLinkError.initCause(e);
                    logger2 = logger;
                    if (logger2.isDebugEnabled()) {
                        throw unsatisfiedLinkError;
                    }
                    logger2.debug("Failed to extract for " + str + ": " + unsatisfiedLinkError);
                    throw unsatisfiedLinkError;
                } catch (UnsatisfiedLinkError e19) {
                    e = e19;
                } catch (URISyntaxException e20) {
                    e = e20;
                    loadedLibraries.remove(str4);
                    if (unsatisfiedLinkError3 != null) {
                        e.initCause(unsatisfiedLinkError3);
                    }
                    unsatisfiedLinkError = new UnsatisfiedLinkError(e.toString());
                    unsatisfiedLinkError.initCause(e);
                    logger2 = logger;
                    if (logger2.isDebugEnabled()) {
                        throw unsatisfiedLinkError;
                    }
                    logger2.debug("Failed to extract for " + str + ": " + unsatisfiedLinkError);
                    throw unsatisfiedLinkError;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Properties loadProperties() {
        String platform = getPlatform();
        Properties properties = platformProperties;
        if (properties != null && platform.equals(properties.getProperty(DeviceDimensionProvider.KEY_PLATFORM))) {
            return platformProperties;
        }
        Properties propertiesLoadProperties = loadProperties(platform, null);
        platformProperties = propertiesLoadProperties;
        return propertiesLoadProperties;
    }

    public static int offsetof(Class<? extends Pointer> cls, String str) {
        HashMap<String, Integer> map = memberOffsets.get(cls);
        while (map == null && cls.getSuperclass() != null) {
            cls = cls.getSuperclass().asSubclass(Pointer.class);
            map = memberOffsets.get(cls);
        }
        return map.get(str).intValue();
    }

    public static Class putMemberOffset(String str, String str2, int i10) {
        try {
            Class<?> cls = Class.forName(str.replace('/', com.amazon.a.a.o.c.a.b.f16463a), false, Loader.class.getClassLoader());
            if (str2 != null) {
                putMemberOffset((Class<? extends Pointer>) cls.asSubclass(Pointer.class), str2, i10);
            }
            return cls;
        } catch (ClassNotFoundException e2) {
            logger.warn("Loader.putMemberOffset(): " + e2);
            return null;
        }
    }

    public static int sizeof(Class<? extends Pointer> cls) {
        return offsetof(cls, "sizeof");
    }

    @Name({"JavaCPP_totalChips"})
    public static native int totalChips();

    @Name({"JavaCPP_totalCores"})
    public static native int totalCores();

    @Name({"JavaCPP_totalProcessors"})
    public static native int totalProcessors();

    public static URL[] findLibrary(Class cls, ClassProperties classProperties, String str, boolean z10) {
        String[] strArr;
        if (str.trim().endsWith("#")) {
            return new URL[0];
        }
        String[] strArrSplit = str.split("#");
        boolean z11 = strArrSplit.length > 1;
        String[] strArrSplit2 = strArrSplit[0].split("@");
        String[] strArrSplit3 = (z11 ? strArrSplit[1] : strArrSplit[0]).split("@");
        String str2 = strArrSplit2[0];
        String str3 = strArrSplit3[0];
        String str4 = strArrSplit2.length > 1 ? strArrSplit2[strArrSplit2.length - 1] : "";
        String str5 = strArrSplit3.length > 1 ? strArrSplit3[strArrSplit3.length - 1] : "";
        String property = classProperties.getProperty(DeviceDimensionProvider.KEY_PLATFORM);
        String[] strArr2 = (String[]) classProperties.get("platform.extension").toArray(new String[0]);
        String property2 = classProperties.getProperty("platform.library.prefix", "");
        String property3 = classProperties.getProperty("platform.library.suffix", "");
        String[] strArr3 = {AbstractC0112b.y(property2, str2, property3, str4), AbstractC0112b.y(property2, str2, str4, property3), p.B(property2, str2, property3)};
        String[] strArr4 = {AbstractC0112b.y(property2, str3, property3, str5), AbstractC0112b.y(property2, str3, str5, property3), p.B(property2, str3, property3)};
        String[] strArr5 = (String[]) classProperties.get("platform.library.suffix").toArray(new String[0]);
        if (strArr5.length > 1) {
            String[] strArr6 = new String[strArr5.length * 3];
            strArr = new String[strArr5.length * 3];
            strArr3 = strArr6;
            int i10 = 0;
            while (i10 < strArr5.length) {
                int i11 = i10 * 3;
                boolean z12 = z11;
                strArr3[i11] = p134m1.b.m(p.t(property2, str2), strArr5[i10], str4);
                int i12 = i11 + 1;
                strArr3[i12] = property2 + str2 + str4 + strArr5[i10];
                int i13 = i11 + 2;
                StringBuilder sbT = p.t(property2, str2);
                sbT.append(strArr5[i10]);
                strArr3[i13] = sbT.toString();
                strArr[i11] = p134m1.b.m(p.t(property2, str3), strArr5[i10], str5);
                strArr[i12] = property2 + str3 + str5 + strArr5[i10];
                StringBuilder sbT2 = p.t(property2, str3);
                sbT2.append(strArr5[i10]);
                strArr[i13] = sbT2.toString();
                i10++;
                z11 = z12;
            }
        } else {
            strArr = strArr4;
        }
        boolean z13 = z11;
        String[] strArr7 = strArr3;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(classProperties.get("platform.linkpath"));
        arrayList.addAll(classProperties.get("platform.preloadpath"));
        int i14 = 0;
        String[] strArr8 = (String[]) classProperties.get("platform.preloadresource").toArray(new String[0]);
        String property4 = System.getProperty("java.library.path", "");
        if (property4.length() > 0 && (z10 || !isLoadLibraries() || z13)) {
            arrayList.addAll(Arrays.asList(property4.split(File.pathSeparator)));
        }
        int i15 = 1;
        ArrayList arrayList2 = new ArrayList((arrayList.size() + 1) * strArr7.length);
        int i16 = 0;
        while (cls != null && i16 < strArr7.length) {
            String[] strArr9 = (String[]) Arrays.copyOf(strArr2, strArr2.length + i15);
            int length = strArr9.length;
            int i17 = i14;
            while (i17 < length) {
                String str6 = strArr9[i17];
                int i18 = i15;
                String[] strArr10 = (String[]) Arrays.copyOf(strArr8, strArr8.length + 1);
                int length2 = strArr10.length;
                String[] strArr11 = strArr8;
                int i19 = 0;
                while (i19 < length2) {
                    int i20 = i19;
                    String strConcat = strArr10[i20];
                    ArrayList arrayList3 = arrayList;
                    if (strConcat != null && !strConcat.endsWith("/")) {
                        strConcat = strConcat.concat("/");
                    }
                    int i21 = i16;
                    StringBuilder sb = new StringBuilder();
                    sb.append(strConcat == null ? "" : "/".concat(strConcat));
                    sb.append(property);
                    try {
                        URL urlFindResource = findResource(cls, p134m1.b.m(sb, str6 == null ? "" : str6, "/") + strArr7[i21]);
                        if (urlFindResource != null) {
                            if (z13) {
                                urlFindResource = new URL(urlFindResource + "#" + strArr[i21]);
                            }
                            if (!arrayList2.contains(urlFindResource)) {
                                arrayList2.add(urlFindResource);
                            }
                        }
                        i19 = i20 + 1;
                        arrayList = arrayList3;
                        i16 = i21;
                    } catch (IOException e2) {
                        throw new RuntimeException(e2);
                    }
                }
                i17++;
                strArr8 = strArr11;
                i15 = i18;
            }
            i16++;
            i14 = 0;
        }
        ArrayList arrayList4 = arrayList;
        int size = z10 ? 0 : arrayList2.size();
        for (int i22 = 0; arrayList4.size() > 0 && i22 < strArr7.length; i22++) {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                File file = new File((String) it.next(), strArr7[i22]);
                if (file.exists()) {
                    try {
                        URL url = file.toURI().toURL();
                        if (z13) {
                            url = new URL(url + "#" + strArr[i22]);
                        }
                        if (!arrayList2.contains(url)) {
                            int i23 = size + 1;
                            arrayList2.add(size, url);
                            size = i23;
                        }
                    } catch (IOException e4) {
                        throw new RuntimeException(e4);
                    }
                }
            }
        }
        return (URL[]) arrayList2.toArray(new URL[arrayList2.size()]);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0089  */
    /* JADX WARN: Code duplicated, block: B:35:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5 A[SYNTHETIC] */
    public static URL[] findResources(Class cls, String str, int i10) throws IOException {
        String strSubstring;
        ClassLoader classLoader;
        Enumeration<URL> resources;
        ArrayList arrayList;
        URL urlNextElement;
        int iLastIndexOf;
        if (i10 == 0) {
            return new URL[0];
        }
        while (str.contains("//")) {
            str = str.replace("//", "/");
        }
        URL resource = cls.getResource(str);
        if (resource != null && i10 == 1) {
            return new URL[]{resource};
        }
        if (!str.startsWith("/")) {
            String strReplace = cls.getName().replace(com.amazon.a.a.o.c.a.b.f16463a, '/');
            int iLastIndexOf2 = strReplace.lastIndexOf(47);
            strSubstring = iLastIndexOf2 >= 0 ? strReplace.substring(0, iLastIndexOf2 + 1) : "";
            classLoader = cls.getClassLoader();
            if (classLoader == null) {
                classLoader = ClassLoader.getSystemClassLoader();
            }
            resources = classLoader.getResources(strSubstring + str);
            arrayList = new ArrayList();
            if (resource != null) {
                arrayList.add(resource);
            }
            while (resource == null && !resources.hasMoreElements() && strSubstring.length() > 0) {
                iLastIndexOf = strSubstring.lastIndexOf(47, strSubstring.length() - 2);
                if (iLastIndexOf >= 0) {
                    strSubstring = strSubstring.substring(0, iLastIndexOf + 1);
                } else {
                    strSubstring = "";
                }
                resources = classLoader.getResources(strSubstring + str);
            }
            while (resources.hasMoreElements() && (i10 < 0 || arrayList.size() < i10)) {
                urlNextElement = resources.nextElement();
                if (!arrayList.contains(urlNextElement)) {
                    arrayList.add(urlNextElement);
                }
            }
            return (URL[]) arrayList.toArray(new URL[arrayList.size()]);
        }
        str = str.substring(1);
        classLoader = cls.getClassLoader();
        if (classLoader == null) {
            classLoader = ClassLoader.getSystemClassLoader();
        }
        resources = classLoader.getResources(strSubstring + str);
        arrayList = new ArrayList();
        if (resource != null) {
            arrayList.add(resource);
        }
        while (resource == null) {
            iLastIndexOf = strSubstring.lastIndexOf(47, strSubstring.length() - 2);
            if (iLastIndexOf >= 0) {
                strSubstring = strSubstring.substring(0, iLastIndexOf + 1);
            } else {
                strSubstring = "";
            }
            resources = classLoader.getResources(strSubstring + str);
        }
        while (resources.hasMoreElements()) {
            urlNextElement = resources.nextElement();
            if (!arrayList.contains(urlNextElement)) {
                arrayList.add(urlNextElement);
            }
        }
        return (URL[]) arrayList.toArray(new URL[arrayList.size()]);
    }

    public static String load(boolean z10) {
        return load(getCallerClass(2), loadProperties(), z10);
    }

    public static File cacheResource(Class cls, String str) {
        return cacheResource(findResource(cls, str));
    }

    public static File[] cacheResources(Class cls, String str) {
        URL[] urlArrFindResources = findResources(cls, str);
        File[] fileArr = new File[urlArrFindResources.length];
        for (int i10 = 0; i10 < urlArrFindResources.length; i10++) {
            fileArr[i10] = cacheResource(urlArrFindResources[i10]);
        }
        return fileArr;
    }

    public static File extractResource(Class cls, String str, File file, String str2, String str3) {
        return extractResource(findResource(cls, str), file, str2, str3);
    }

    public static File[] extractResources(Class cls, String str, File file, String str2, String str3) {
        URL[] urlArrFindResources = findResources(cls, str);
        File[] fileArr = new File[urlArrFindResources.length];
        for (int i10 = 0; i10 < urlArrFindResources.length; i10++) {
            fileArr[i10] = extractResource(urlArrFindResources[i10], file, str2, str3);
        }
        return fileArr;
    }

    public static File cacheResource(URL url) {
        return cacheResource(url, (String) null);
    }

    /* JADX WARN: Code duplicated, block: B:70:0x013d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:75:0x0148  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.OutputStream] */
    public static File extractResource(URL url, File file, String str, String str2) throws Throwable {
        File fileCreateTempFile;
        boolean zExists;
        ?? r10 = 0;
        File file2 = null;
        URLConnection uRLConnectionOpenConnection = url != null ? url.openConnection() : null;
        boolean z10 = false;
        if (uRLConnectionOpenConnection instanceof JarURLConnection) {
            JarURLConnection jarURLConnection = (JarURLConnection) uRLConnectionOpenConnection;
            JarFile jarFile = jarURLConnection.getJarFile();
            JarEntry jarEntry = jarURLConnection.getJarEntry();
            jarFile.getName();
            String name = jarEntry.getName();
            if (!name.endsWith("/")) {
                name = name.concat("/");
            }
            if (jarEntry.isDirectory() || jarFile.getJarEntry(name) != null) {
                Enumeration<JarEntry> enumerationEntries = jarFile.entries();
                while (enumerationEntries.hasMoreElements()) {
                    JarEntry jarEntryNextElement = enumerationEntries.nextElement();
                    String name2 = jarEntryNextElement.getName();
                    if (name2.startsWith(name)) {
                        File file3 = new File(file, name2.substring(name.length()));
                        if (jarEntryNextElement.isDirectory()) {
                            file3.mkdirs();
                        } else {
                            String string = url.toString();
                            file3 = extractResource(new URL(string.substring(0, string.indexOf("!/") + 2) + name2), file3, str, str2);
                        }
                        file3.setLastModified(jarEntryNextElement.getTime());
                    }
                }
                return file;
            }
        }
        InputStream inputStream = uRLConnectionOpenConnection != null ? uRLConnectionOpenConnection.getInputStream() : null;
        if (inputStream == null) {
            return null;
        }
        try {
            try {
                try {
                    if (str == null && str2 == null) {
                        if (file == null) {
                            file = new File(System.getProperty("java.io.tmpdir"));
                        }
                        if (file.isDirectory()) {
                            try {
                                fileCreateTempFile = new File(file, new File(new URI(url.toString().split("#")[0])).getName());
                            } catch (IllegalArgumentException | URISyntaxException unused) {
                                fileCreateTempFile = new File(file, new File(url.getPath()).getName());
                            }
                        } else {
                            fileCreateTempFile = file;
                            file = file.getParentFile();
                        }
                        if (file != null) {
                            try {
                                file.mkdirs();
                            } catch (IOException e2) {
                                e = e2;
                                file2 = fileCreateTempFile;
                                if (file2 != null) {
                                    file2.delete();
                                }
                                throw e;
                            }
                        }
                        zExists = fileCreateTempFile.exists();
                    } else {
                        fileCreateTempFile = File.createTempFile(str, str2, file);
                        zExists = false;
                    }
                    try {
                        fileCreateTempFile.delete();
                        FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                        try {
                            byte[] bArr = new byte[ETagPayloadStore.CHUNK_CHARS];
                            while (true) {
                                int i10 = inputStream.read(bArr);
                                if (i10 != -1) {
                                    fileOutputStream.write(bArr, 0, i10);
                                } else {
                                    inputStream.close();
                                    fileOutputStream.close();
                                    return fileCreateTempFile;
                                }
                            }
                        } catch (IOException e4) {
                            z10 = zExists;
                            file2 = fileCreateTempFile;
                            e = e4;
                            if (file2 != null) {
                                file2.delete();
                            }
                            throw e;
                        }
                    } catch (IOException e7) {
                        z10 = zExists;
                        e = e7;
                        file2 = fileCreateTempFile;
                        if (file2 != null && !z10) {
                            file2.delete();
                        }
                        throw e;
                    }
                } catch (Throwable th) {
                    th = th;
                    r10 = file;
                    inputStream.close();
                    if (r10 != 0) {
                        r10.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream.close();
                if (r10 != 0) {
                    r10.close();
                }
                throw th;
            }
        } catch (IOException e10) {
            e = e10;
        }
    }

    public static String load(Class cls) {
        return load(cls, loadProperties(), pathsFirst);
    }

    public static synchronized void putMemberOffset(Class<? extends Pointer> cls, String str, int i10) {
        try {
            HashMap<String, Integer> map = memberOffsets.get(cls);
            if (map == null) {
                WeakHashMap<Class<? extends Pointer>, HashMap<String, Integer>> weakHashMap = memberOffsets;
                HashMap<String, Integer> map2 = new HashMap<>();
                weakHashMap.put(cls, map2);
                map = map2;
            }
            map.put(str, Integer.valueOf(i10));
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0217  */
    /* JADX WARN: Code duplicated, block: B:111:0x0230 A[Catch: all -> 0x01f1, TRY_LEAVE, TryCatch #8 {all -> 0x01f1, blocks: (B:68:0x01ad, B:70:0x01b3, B:72:0x01b9, B:76:0x01c7, B:78:0x01cd, B:80:0x01d3, B:82:0x01d9, B:90:0x01f7, B:92:0x0205, B:109:0x0228, B:111:0x0230), top: B:279:0x0148 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x0249 A[Catch: all -> 0x021e, TRY_ENTER, TryCatch #33 {all -> 0x021e, blocks: (B:102:0x021a, B:106:0x0222, B:107:0x0225, B:119:0x0255, B:121:0x025a, B:122:0x025d, B:113:0x0249, B:115:0x024e, B:116:0x0251), top: B:290:0x0148 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x024e A[Catch: all -> 0x021e, TryCatch #33 {all -> 0x021e, blocks: (B:102:0x021a, B:106:0x0222, B:107:0x0225, B:119:0x0255, B:121:0x025a, B:122:0x025d, B:113:0x0249, B:115:0x024e, B:116:0x0251), top: B:290:0x0148 }] */
    /* JADX WARN: Code duplicated, block: B:170:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:181:0x0317 A[Catch: all -> 0x032f, RuntimeException -> 0x0331, IOException -> 0x0333, TRY_LEAVE, TryCatch #25 {IOException -> 0x0333, RuntimeException -> 0x0331, all -> 0x032f, blocks: (B:164:0x02e8, B:175:0x0305, B:177:0x030b, B:179:0x0311, B:181:0x0317, B:189:0x0335, B:191:0x0343), top: B:295:0x02e8 }] */
    /* JADX WARN: Code duplicated, block: B:205:0x0368  */
    /* JADX WARN: Code duplicated, block: B:207:0x036d A[Catch: all -> 0x0371, TRY_ENTER, TryCatch #7 {all -> 0x0371, blocks: (B:207:0x036d, B:211:0x0375, B:212:0x0378, B:227:0x03ae, B:229:0x03b3, B:230:0x03b6, B:221:0x03a2, B:223:0x03a7, B:224:0x03aa), top: B:278:0x026d }] */
    /* JADX WARN: Code duplicated, block: B:211:0x0375 A[Catch: all -> 0x0371, TryCatch #7 {all -> 0x0371, blocks: (B:207:0x036d, B:211:0x0375, B:212:0x0378, B:227:0x03ae, B:229:0x03b3, B:230:0x03b6, B:221:0x03a2, B:223:0x03a7, B:224:0x03aa), top: B:278:0x026d }] */
    /* JADX WARN: Code duplicated, block: B:216:0x0383 A[Catch: all -> 0x039b, TRY_LEAVE, TryCatch #29 {all -> 0x039b, blocks: (B:214:0x037b, B:216:0x0383), top: B:288:0x037b }] */
    /* JADX WARN: Code duplicated, block: B:221:0x03a2 A[Catch: all -> 0x0371, TRY_ENTER, TryCatch #7 {all -> 0x0371, blocks: (B:207:0x036d, B:211:0x0375, B:212:0x0378, B:227:0x03ae, B:229:0x03b3, B:230:0x03b6, B:221:0x03a2, B:223:0x03a7, B:224:0x03aa), top: B:278:0x026d }] */
    /* JADX WARN: Code duplicated, block: B:223:0x03a7 A[Catch: all -> 0x0371, TryCatch #7 {all -> 0x0371, blocks: (B:207:0x036d, B:211:0x0375, B:212:0x0378, B:227:0x03ae, B:229:0x03b3, B:230:0x03b6, B:221:0x03a2, B:223:0x03a7, B:224:0x03aa), top: B:278:0x026d }] */
    /* JADX WARN: Code duplicated, block: B:227:0x03ae A[Catch: all -> 0x0371, TryCatch #7 {all -> 0x0371, blocks: (B:207:0x036d, B:211:0x0375, B:212:0x0378, B:227:0x03ae, B:229:0x03b3, B:230:0x03b6, B:221:0x03a2, B:223:0x03a7, B:224:0x03aa), top: B:278:0x026d }] */
    /* JADX WARN: Code duplicated, block: B:229:0x03b3 A[Catch: all -> 0x0371, TryCatch #7 {all -> 0x0371, blocks: (B:207:0x036d, B:211:0x0375, B:212:0x0378, B:227:0x03ae, B:229:0x03b3, B:230:0x03b6, B:221:0x03a2, B:223:0x03a7, B:224:0x03aa), top: B:278:0x026d }] */
    /* JADX WARN: Code duplicated, block: B:236:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:242:0x03df  */
    /* JADX WARN: Code duplicated, block: B:246:0x03ec A[Catch: all -> 0x0401, TryCatch #15 {all -> 0x0401, blocks: (B:244:0x03e4, B:246:0x03ec, B:249:0x0403, B:251:0x0416, B:253:0x041e, B:255:0x0426, B:257:0x0434, B:259:0x043a, B:261:0x044e), top: B:284:0x03e4, outer: #32 }] */
    /* JADX WARN: Code duplicated, block: B:251:0x0416 A[Catch: all -> 0x0401, TryCatch #15 {all -> 0x0401, blocks: (B:244:0x03e4, B:246:0x03ec, B:249:0x0403, B:251:0x0416, B:253:0x041e, B:255:0x0426, B:257:0x0434, B:259:0x043a, B:261:0x044e), top: B:284:0x03e4, outer: #32 }] */
    /* JADX WARN: Code duplicated, block: B:257:0x0434 A[Catch: all -> 0x0401, TryCatch #15 {all -> 0x0401, blocks: (B:244:0x03e4, B:246:0x03ec, B:249:0x0403, B:251:0x0416, B:253:0x041e, B:255:0x0426, B:257:0x0434, B:259:0x043a, B:261:0x044e), top: B:284:0x03e4, outer: #32 }] */
    /* JADX WARN: Code duplicated, block: B:259:0x043a A[Catch: all -> 0x0401, TryCatch #15 {all -> 0x0401, blocks: (B:244:0x03e4, B:246:0x03ec, B:249:0x0403, B:251:0x0416, B:253:0x041e, B:255:0x0426, B:257:0x0434, B:259:0x043a, B:261:0x044e), top: B:284:0x03e4, outer: #32 }] */
    /* JADX WARN: Code duplicated, block: B:260:0x044c  */
    /* JADX WARN: Code duplicated, block: B:263:0x045a A[Catch: all -> 0x045e, TRY_ENTER, TryCatch #32 {all -> 0x045e, blocks: (B:263:0x045a, B:266:0x0460, B:267:0x0463, B:270:0x0467, B:272:0x046c, B:273:0x046f, B:244:0x03e4, B:246:0x03ec, B:249:0x0403, B:251:0x0416, B:253:0x041e, B:255:0x0426, B:257:0x0434, B:259:0x043a, B:261:0x044e), top: B:284:0x03e4, inners: #15 }] */
    /* JADX WARN: Code duplicated, block: B:284:0x03e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:111:0x0230, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:181:0x0317, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:216:0x0383, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:246:0x03ec, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.nio.channels.FileLock] */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.nio.channels.FileChannel] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.nio.channels.spi.AbstractInterruptibleChannel] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.nio.channels.spi.AbstractInterruptibleChannel] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.nio.channels.spi.AbstractInterruptibleChannel] */
    public static File cacheResource(URL url, String str) throws IOException {
        File file;
        File file2;
        long length;
        long jLastModified;
        File file3;
        boolean z10;
        FileLock fileLockLock;
        Logger logger2;
        URL url2;
        FileChannel fileChannel;
        Logger logger3;
        FileLock fileLock;
        FileChannel fileChannel2;
        FileChannel fileChannel3;
        FileLock fileLockLock2;
        Logger logger4;
        ?? r10;
        ?? channel = "Could not create symbolic link ";
        try {
            file = new File(new URI(url.toString().split("#")[0]));
        } catch (IllegalArgumentException | URISyntaxException unused) {
            file = new File(url.getPath());
        }
        String name = file.getName();
        File cacheDir2 = getCacheDir();
        File canonicalFile = cacheDir2.getCanonicalFile();
        String lowerCase = System.getProperty("org.bytedeco.javacpp.cachedir.nosubdir", b.ag).toLowerCase();
        boolean z11 = lowerCase.equals(b.af) || lowerCase.equals("t") || lowerCase.equals("");
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        boolean z12 = z11;
        if (uRLConnectionOpenConnection instanceof JarURLConnection) {
            JarURLConnection jarURLConnection = (JarURLConnection) uRLConnectionOpenConnection;
            JarFile jarFile = jarURLConnection.getJarFile();
            JarEntry jarEntry = jarURLConnection.getJarEntry();
            file2 = file;
            File file4 = new File(jarFile.getName());
            File file5 = new File(jarEntry.getName());
            length = jarEntry.getSize();
            jLastModified = jarEntry.getTime();
            if (!z12) {
                String name2 = file4.getName();
                String parent = file5.getParent();
                if (parent != null) {
                    name2 = p134m1.b.m(AbstractC0112b.o(name2), File.separator, parent);
                }
                file3 = new File(canonicalFile, name2);
                canonicalFile = file3;
            }
        } else {
            file2 = file;
            if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                long contentLength = uRLConnectionOpenConnection.getContentLength();
                jLastModified = uRLConnectionOpenConnection.getLastModified();
                if (z12) {
                    length = contentLength;
                } else {
                    StringBuilder sb = new StringBuilder();
                    length = contentLength;
                    sb.append(url.getHost());
                    sb.append(url.getPath());
                    String string = sb.toString();
                    file3 = new File(canonicalFile, string.substring(0, string.lastIndexOf(47) + 1));
                    canonicalFile = file3;
                }
            } else {
                length = file2.length();
                jLastModified = file2.lastModified();
                if (!z12) {
                    canonicalFile = new File(canonicalFile, file2.getParentFile().getName());
                }
            }
        }
        long j10 = jLastModified;
        if (url.getRef() != null) {
            String ref = url.getRef();
            boolean zEquals = ref.equals(name);
            name = ref;
            z10 = zEquals;
        } else {
            z10 = false;
        }
        File file6 = new File(canonicalFile, name);
        boolean z13 = z10;
        File file7 = new File(cacheDir2, ".lock");
        FileLock fileLock2 = null;
        FileLock fileLock3 = null;
         = 0;
        ?? r11 = 0;
        FileChannel channel2 = null;
        if (str != null && str.length() > 0) {
            synchronized (Runtime.getRuntime()) {
                try {
                    try {
                        try {
                            Path path = file6.toPath();
                            Path path2 = Paths.get(str, new String[0]);
                            if (file6.exists() && Files.isSymbolicLink(path) && Files.readSymbolicLink(path).equals(path2)) {
                                r10 = 0;
                            } else if (!path2.isAbsolute() || path2.equals(path)) {
                                r10 = 0;
                            } else {
                                Logger logger5 = logger;
                                if (logger5.isDebugEnabled()) {
                                    logger5.debug("Locking " + cacheDir2 + " to create symbolic link");
                                }
                                channel = new FileOutputStream(file7).getChannel();
                                try {
                                    fileLockLock2 = channel.lock();
                                    try {
                                        if (!file6.exists() || !Files.isSymbolicLink(path) || !Files.readSymbolicLink(path).equals(path2)) {
                                            if (path2.isAbsolute() && !path2.equals(path)) {
                                                if (logger5.isDebugEnabled()) {
                                                    logger5.debug("Creating symbolic link " + path + " to " + path2);
                                                }
                                                try {
                                                    file6.getParentFile().mkdirs();
                                                    Files.createSymbolicLink(path, path2, new FileAttribute[0]);
                                                } catch (FileAlreadyExistsException unused2) {
                                                    file6.delete();
                                                    Files.createSymbolicLink(path, path2, new FileAttribute[0]);
                                                }
                                            }
                                        }
                                        fileLock3 = fileLockLock2;
                                        r10 = channel;
                                    } catch (IOException e2) {
                                        e = e2;
                                        logger4 = logger;
                                        if (logger4.isDebugEnabled()) {
                                            logger4.debug("Failed to create symbolic link " + file6 + ": " + e);
                                        }
                                        if (fileLockLock2 != null) {
                                            fileLockLock2.release();
                                        }
                                        if (channel != 0) {
                                            channel.close();
                                        }
                                        return null;
                                    } catch (RuntimeException e4) {
                                        e = e4;
                                        logger4 = logger;
                                        if (logger4.isDebugEnabled()) {
                                            logger4.debug("Failed to create symbolic link " + file6 + ": " + e);
                                        }
                                        if (fileLockLock2 != null) {
                                            fileLockLock2.release();
                                        }
                                        if (channel != 0) {
                                            channel.close();
                                        }
                                        return null;
                                    }
                                } catch (IOException e7) {
                                    e = e7;
                                    fileLockLock2 = null;
                                    logger4 = logger;
                                    if (logger4.isDebugEnabled()) {
                                        logger4.debug("Failed to create symbolic link " + file6 + ": " + e);
                                    }
                                    if (fileLockLock2 != null) {
                                        fileLockLock2.release();
                                    }
                                    if (channel != 0) {
                                        channel.close();
                                    }
                                    return null;
                                } catch (RuntimeException e10) {
                                    e = e10;
                                    fileLockLock2 = null;
                                    logger4 = logger;
                                    if (logger4.isDebugEnabled()) {
                                        logger4.debug("Failed to create symbolic link " + file6 + ": " + e);
                                    }
                                    if (fileLockLock2 != null) {
                                        fileLockLock2.release();
                                    }
                                    if (channel != 0) {
                                        channel.close();
                                    }
                                    return null;
                                } catch (Throwable th) {
                                    th = th;
                                    if (r11 != 0) {
                                        r11.release();
                                    }
                                    if (channel != 0) {
                                        channel.close();
                                    }
                                    throw th;
                                }
                            }
                            if (fileLock3 != null) {
                                fileLock3.release();
                            }
                            if (r10 != 0) {
                                r10.close();
                            }
                        } catch (IOException e11) {
                            e = e11;
                            channel = 0;
                            fileLockLock2 = null;
                            logger4 = logger;
                            if (logger4.isDebugEnabled()) {
                                logger4.debug("Failed to create symbolic link " + file6 + ": " + e);
                            }
                            if (fileLockLock2 != null) {
                                fileLockLock2.release();
                            }
                            if (channel != 0) {
                                channel.close();
                            }
                            return null;
                        } catch (RuntimeException e12) {
                            e = e12;
                            channel = 0;
                            fileLockLock2 = null;
                            logger4 = logger;
                            if (logger4.isDebugEnabled()) {
                                logger4.debug("Failed to create symbolic link " + file6 + ": " + e);
                            }
                            if (fileLockLock2 != null) {
                                fileLockLock2.release();
                            }
                            if (channel != 0) {
                                channel.close();
                            }
                            return null;
                        } catch (Throwable th2) {
                            th = th2;
                            channel = 0;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        r11 = "Creating symbolic link ";
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        } else {
            if (file2.exists() && z13) {
                synchronized (Runtime.getRuntime()) {
                    try {
                        try {
                            Path path3 = file6.toPath();
                            Path path4 = file2.toPath();
                            if (file6.exists()) {
                                try {
                                    if (Files.isSymbolicLink(path3) && Files.readSymbolicLink(path3).equals(path4)) {
                                        fileLock = null;
                                        fileChannel2 = null;
                                    }
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    if (fileChannel2 != null) {
                                        fileChannel2.close();
                                    }
                                } catch (IOException e13) {
                                    e = e13;
                                    fileLockLock = null;
                                    try {
                                        logger3 = logger;
                                        if (logger3.isDebugEnabled()) {
                                            logger3.debug("Could not create symbolic link " + file6 + ": " + e);
                                        }
                                        if (fileLockLock != null) {
                                            fileLockLock.release();
                                        }
                                        if (channel2 != null) {
                                            channel2.close();
                                        }
                                        if (file6.exists()) {
                                            synchronized (Runtime.getRuntime()) {
                                                try {
                                                    try {
                                                        logger2 = logger;
                                                        if (logger2.isDebugEnabled()) {
                                                            logger2.debug("Locking " + cacheDir2 + " before extracting");
                                                        }
                                                        channel2 = new FileOutputStream(file7).getChannel();
                                                        fileLockLock = channel2.lock();
                                                        if (file6.exists()) {
                                                            if (logger2.isDebugEnabled()) {
                                                                StringBuilder sb2 = new StringBuilder("Extracting ");
                                                                url2 = url;
                                                                sb2.append(url2);
                                                                logger2.debug(sb2.toString());
                                                            } else {
                                                                url2 = url;
                                                            }
                                                            file6.delete();
                                                            extractResource(url2, file6, (String) null, (String) null);
                                                            file6.setLastModified(j10);
                                                        } else {
                                                            if (logger2.isDebugEnabled()) {
                                                                StringBuilder sb3 = new StringBuilder("Extracting ");
                                                                url2 = url;
                                                                sb3.append(url2);
                                                                logger2.debug(sb3.toString());
                                                            } else {
                                                                url2 = url;
                                                            }
                                                            file6.delete();
                                                            extractResource(url2, file6, (String) null, (String) null);
                                                            file6.setLastModified(j10);
                                                        }
                                                        if (fileLockLock != null) {
                                                            fileLockLock.release();
                                                        }
                                                        channel2.close();
                                                    } catch (Throwable th5) {
                                                        throw th5;
                                                    }
                                                } catch (Throwable th6) {
                                                    if (fileLockLock != null) {
                                                        fileLockLock.release();
                                                    }
                                                    if (channel2 != null) {
                                                        channel2.close();
                                                    }
                                                    throw th6;
                                                }
                                            }
                                        } else {
                                            synchronized (Runtime.getRuntime()) {
                                                logger2 = logger;
                                                if (logger2.isDebugEnabled()) {
                                                    logger2.debug("Locking " + cacheDir2 + " before extracting");
                                                }
                                                channel2 = new FileOutputStream(file7).getChannel();
                                                fileLockLock = channel2.lock();
                                                if (file6.exists()) {
                                                    if (logger2.isDebugEnabled()) {
                                                        StringBuilder sb4 = new StringBuilder("Extracting ");
                                                        url2 = url;
                                                        sb4.append(url2);
                                                        logger2.debug(sb4.toString());
                                                    } else {
                                                        url2 = url;
                                                    }
                                                    file6.delete();
                                                    extractResource(url2, file6, (String) null, (String) null);
                                                    file6.setLastModified(j10);
                                                } else {
                                                    if (logger2.isDebugEnabled()) {
                                                        StringBuilder sb5 = new StringBuilder("Extracting ");
                                                        url2 = url;
                                                        sb5.append(url2);
                                                        logger2.debug(sb5.toString());
                                                    } else {
                                                        url2 = url;
                                                    }
                                                    file6.delete();
                                                    extractResource(url2, file6, (String) null, (String) null);
                                                    file6.setLastModified(j10);
                                                }
                                                if (fileLockLock != null) {
                                                    fileLockLock.release();
                                                }
                                                channel2.close();
                                            }
                                        }
                                        return file6;
                                    } catch (Throwable th7) {
                                        th = th7;
                                        fileChannel = channel2;
                                        fileLock2 = fileLockLock;
                                        if (fileLock2 != null) {
                                            fileLock2.release();
                                        }
                                        if (fileChannel != null) {
                                            fileChannel.close();
                                        }
                                        throw th;
                                    }
                                } catch (RuntimeException e14) {
                                    e = e14;
                                    fileLockLock = null;
                                    logger3 = logger;
                                    if (logger3.isDebugEnabled()) {
                                        logger3.debug("Could not create symbolic link " + file6 + ": " + e);
                                    }
                                    if (fileLockLock != null) {
                                        fileLockLock.release();
                                    }
                                    if (channel2 != null) {
                                        channel2.close();
                                    }
                                    if (file6.exists()) {
                                        synchronized (Runtime.getRuntime()) {
                                            logger2 = logger;
                                            if (logger2.isDebugEnabled()) {
                                                logger2.debug("Locking " + cacheDir2 + " before extracting");
                                            }
                                            channel2 = new FileOutputStream(file7).getChannel();
                                            fileLockLock = channel2.lock();
                                            if (file6.exists()) {
                                                if (logger2.isDebugEnabled()) {
                                                    StringBuilder sb6 = new StringBuilder("Extracting ");
                                                    url2 = url;
                                                    sb6.append(url2);
                                                    logger2.debug(sb6.toString());
                                                } else {
                                                    url2 = url;
                                                }
                                                file6.delete();
                                                extractResource(url2, file6, (String) null, (String) null);
                                                file6.setLastModified(j10);
                                            } else {
                                                if (logger2.isDebugEnabled()) {
                                                    StringBuilder sb7 = new StringBuilder("Extracting ");
                                                    url2 = url;
                                                    sb7.append(url2);
                                                    logger2.debug(sb7.toString());
                                                } else {
                                                    url2 = url;
                                                }
                                                file6.delete();
                                                extractResource(url2, file6, (String) null, (String) null);
                                                file6.setLastModified(j10);
                                            }
                                            if (fileLockLock != null) {
                                                fileLockLock.release();
                                            }
                                            channel2.close();
                                        }
                                    } else {
                                        synchronized (Runtime.getRuntime()) {
                                            logger2 = logger;
                                            if (logger2.isDebugEnabled()) {
                                                logger2.debug("Locking " + cacheDir2 + " before extracting");
                                            }
                                            channel2 = new FileOutputStream(file7).getChannel();
                                            fileLockLock = channel2.lock();
                                            if (file6.exists()) {
                                                if (logger2.isDebugEnabled()) {
                                                    StringBuilder sb8 = new StringBuilder("Extracting ");
                                                    url2 = url;
                                                    sb8.append(url2);
                                                    logger2.debug(sb8.toString());
                                                } else {
                                                    url2 = url;
                                                }
                                                file6.delete();
                                                extractResource(url2, file6, (String) null, (String) null);
                                                file6.setLastModified(j10);
                                            } else {
                                                if (logger2.isDebugEnabled()) {
                                                    StringBuilder sb9 = new StringBuilder("Extracting ");
                                                    url2 = url;
                                                    sb9.append(url2);
                                                    logger2.debug(sb9.toString());
                                                } else {
                                                    url2 = url;
                                                }
                                                file6.delete();
                                                extractResource(url2, file6, (String) null, (String) null);
                                                file6.setLastModified(j10);
                                            }
                                            if (fileLockLock != null) {
                                                fileLockLock.release();
                                            }
                                            channel2.close();
                                        }
                                    }
                                    return file6;
                                } catch (Throwable th8) {
                                    th = th8;
                                    fileChannel = null;
                                    if (fileLock2 != null) {
                                        fileLock2.release();
                                    }
                                    if (fileChannel != null) {
                                        fileChannel.close();
                                    }
                                    throw th;
                                }
                            }
                            if (!path4.isAbsolute() || path4.equals(path3)) {
                                fileLock = null;
                                fileChannel2 = null;
                            } else {
                                Logger logger6 = logger;
                                if (logger6.isDebugEnabled()) {
                                    logger6.debug("Locking " + cacheDir2 + " to create symbolic link");
                                }
                                channel2 = new FileOutputStream(file7).getChannel();
                                try {
                                    fileLockLock = channel2.lock();
                                    try {
                                        try {
                                            if (file6.exists()) {
                                                try {
                                                    if (Files.isSymbolicLink(path3)) {
                                                        fileChannel3 = channel2;
                                                        try {
                                                            if (!Files.readSymbolicLink(path3).equals(path4)) {
                                                            }
                                                            fileChannel2 = fileChannel3;
                                                            fileLock = fileLockLock;
                                                        } catch (IOException e15) {
                                                            e = e15;
                                                            channel2 = fileChannel3;
                                                            logger3 = logger;
                                                            if (logger3.isDebugEnabled()) {
                                                                logger3.debug("Could not create symbolic link " + file6 + ": " + e);
                                                            }
                                                            if (fileLockLock != null) {
                                                                fileLockLock.release();
                                                            }
                                                            if (channel2 != null) {
                                                                channel2.close();
                                                            }
                                                            if (file6.exists()) {
                                                                synchronized (Runtime.getRuntime()) {
                                                                    logger2 = logger;
                                                                    if (logger2.isDebugEnabled()) {
                                                                        logger2.debug("Locking " + cacheDir2 + " before extracting");
                                                                    }
                                                                    channel2 = new FileOutputStream(file7).getChannel();
                                                                    fileLockLock = channel2.lock();
                                                                    if (file6.exists()) {
                                                                        if (logger2.isDebugEnabled()) {
                                                                            StringBuilder sb10 = new StringBuilder("Extracting ");
                                                                            url2 = url;
                                                                            sb10.append(url2);
                                                                            logger2.debug(sb10.toString());
                                                                        } else {
                                                                            url2 = url;
                                                                        }
                                                                        file6.delete();
                                                                        extractResource(url2, file6, (String) null, (String) null);
                                                                        file6.setLastModified(j10);
                                                                    } else {
                                                                        if (logger2.isDebugEnabled()) {
                                                                            StringBuilder sb11 = new StringBuilder("Extracting ");
                                                                            url2 = url;
                                                                            sb11.append(url2);
                                                                            logger2.debug(sb11.toString());
                                                                        } else {
                                                                            url2 = url;
                                                                        }
                                                                        file6.delete();
                                                                        extractResource(url2, file6, (String) null, (String) null);
                                                                        file6.setLastModified(j10);
                                                                    }
                                                                    if (fileLockLock != null) {
                                                                        fileLockLock.release();
                                                                    }
                                                                    channel2.close();
                                                                }
                                                            } else {
                                                                synchronized (Runtime.getRuntime()) {
                                                                    logger2 = logger;
                                                                    if (logger2.isDebugEnabled()) {
                                                                        logger2.debug("Locking " + cacheDir2 + " before extracting");
                                                                    }
                                                                    channel2 = new FileOutputStream(file7).getChannel();
                                                                    fileLockLock = channel2.lock();
                                                                    if (file6.exists()) {
                                                                        if (logger2.isDebugEnabled()) {
                                                                            StringBuilder sb12 = new StringBuilder("Extracting ");
                                                                            url2 = url;
                                                                            sb12.append(url2);
                                                                            logger2.debug(sb12.toString());
                                                                        } else {
                                                                            url2 = url;
                                                                        }
                                                                        file6.delete();
                                                                        extractResource(url2, file6, (String) null, (String) null);
                                                                        file6.setLastModified(j10);
                                                                    } else {
                                                                        if (logger2.isDebugEnabled()) {
                                                                            StringBuilder sb13 = new StringBuilder("Extracting ");
                                                                            url2 = url;
                                                                            sb13.append(url2);
                                                                            logger2.debug(sb13.toString());
                                                                        } else {
                                                                            url2 = url;
                                                                        }
                                                                        file6.delete();
                                                                        extractResource(url2, file6, (String) null, (String) null);
                                                                        file6.setLastModified(j10);
                                                                    }
                                                                    if (fileLockLock != null) {
                                                                        fileLockLock.release();
                                                                    }
                                                                    channel2.close();
                                                                }
                                                            }
                                                        } catch (RuntimeException e16) {
                                                            e = e16;
                                                            channel2 = fileChannel3;
                                                            logger3 = logger;
                                                            if (logger3.isDebugEnabled()) {
                                                                logger3.debug("Could not create symbolic link " + file6 + ": " + e);
                                                            }
                                                            if (fileLockLock != null) {
                                                                fileLockLock.release();
                                                            }
                                                            if (channel2 != null) {
                                                                channel2.close();
                                                            }
                                                            if (file6.exists()) {
                                                                synchronized (Runtime.getRuntime()) {
                                                                    logger2 = logger;
                                                                    if (logger2.isDebugEnabled()) {
                                                                        logger2.debug("Locking " + cacheDir2 + " before extracting");
                                                                    }
                                                                    channel2 = new FileOutputStream(file7).getChannel();
                                                                    fileLockLock = channel2.lock();
                                                                    if (file6.exists()) {
                                                                        if (logger2.isDebugEnabled()) {
                                                                            StringBuilder sb14 = new StringBuilder("Extracting ");
                                                                            url2 = url;
                                                                            sb14.append(url2);
                                                                            logger2.debug(sb14.toString());
                                                                        } else {
                                                                            url2 = url;
                                                                        }
                                                                        file6.delete();
                                                                        extractResource(url2, file6, (String) null, (String) null);
                                                                        file6.setLastModified(j10);
                                                                    } else {
                                                                        if (logger2.isDebugEnabled()) {
                                                                            StringBuilder sb15 = new StringBuilder("Extracting ");
                                                                            url2 = url;
                                                                            sb15.append(url2);
                                                                            logger2.debug(sb15.toString());
                                                                        } else {
                                                                            url2 = url;
                                                                        }
                                                                        file6.delete();
                                                                        extractResource(url2, file6, (String) null, (String) null);
                                                                        file6.setLastModified(j10);
                                                                    }
                                                                    if (fileLockLock != null) {
                                                                        fileLockLock.release();
                                                                    }
                                                                    channel2.close();
                                                                }
                                                            } else {
                                                                synchronized (Runtime.getRuntime()) {
                                                                    logger2 = logger;
                                                                    if (logger2.isDebugEnabled()) {
                                                                        logger2.debug("Locking " + cacheDir2 + " before extracting");
                                                                    }
                                                                    channel2 = new FileOutputStream(file7).getChannel();
                                                                    fileLockLock = channel2.lock();
                                                                    if (file6.exists()) {
                                                                        if (logger2.isDebugEnabled()) {
                                                                            StringBuilder sb16 = new StringBuilder("Extracting ");
                                                                            url2 = url;
                                                                            sb16.append(url2);
                                                                            logger2.debug(sb16.toString());
                                                                        } else {
                                                                            url2 = url;
                                                                        }
                                                                        file6.delete();
                                                                        extractResource(url2, file6, (String) null, (String) null);
                                                                        file6.setLastModified(j10);
                                                                    } else {
                                                                        if (logger2.isDebugEnabled()) {
                                                                            StringBuilder sb17 = new StringBuilder("Extracting ");
                                                                            url2 = url;
                                                                            sb17.append(url2);
                                                                            logger2.debug(sb17.toString());
                                                                        } else {
                                                                            url2 = url;
                                                                        }
                                                                        file6.delete();
                                                                        extractResource(url2, file6, (String) null, (String) null);
                                                                        file6.setLastModified(j10);
                                                                    }
                                                                    if (fileLockLock != null) {
                                                                        fileLockLock.release();
                                                                    }
                                                                    channel2.close();
                                                                }
                                                            }
                                                        } catch (Throwable th9) {
                                                            th = th9;
                                                            fileChannel = fileChannel3;
                                                            fileLock2 = fileLockLock;
                                                            if (fileLock2 != null) {
                                                                fileLock2.release();
                                                            }
                                                            if (fileChannel != null) {
                                                                fileChannel.close();
                                                            }
                                                            throw th;
                                                        }
                                                    } else {
                                                        fileChannel3 = channel2;
                                                    }
                                                    if (path4.isAbsolute() && !path4.equals(path3)) {
                                                        if (logger6.isDebugEnabled()) {
                                                            logger6.debug("Creating symbolic link " + path3 + " to " + path4);
                                                        }
                                                        try {
                                                            file6.getParentFile().mkdirs();
                                                            Files.createSymbolicLink(path3, path4, new FileAttribute[0]);
                                                        } catch (FileAlreadyExistsException unused3) {
                                                            file6.delete();
                                                            Files.createSymbolicLink(path3, path4, new FileAttribute[0]);
                                                        }
                                                    }
                                                    fileChannel2 = fileChannel3;
                                                    fileLock = fileLockLock;
                                                } catch (IOException e17) {
                                                    e = e17;
                                                    fileChannel3 = channel2;
                                                    channel2 = fileChannel3;
                                                    logger3 = logger;
                                                    if (logger3.isDebugEnabled()) {
                                                        logger3.debug("Could not create symbolic link " + file6 + ": " + e);
                                                    }
                                                    if (fileLockLock != null) {
                                                        fileLockLock.release();
                                                    }
                                                    if (channel2 != null) {
                                                        channel2.close();
                                                    }
                                                    if (file6.exists()) {
                                                        synchronized (Runtime.getRuntime()) {
                                                            logger2 = logger;
                                                            if (logger2.isDebugEnabled()) {
                                                                logger2.debug("Locking " + cacheDir2 + " before extracting");
                                                            }
                                                            channel2 = new FileOutputStream(file7).getChannel();
                                                            fileLockLock = channel2.lock();
                                                            if (file6.exists()) {
                                                                if (logger2.isDebugEnabled()) {
                                                                    StringBuilder sb18 = new StringBuilder("Extracting ");
                                                                    url2 = url;
                                                                    sb18.append(url2);
                                                                    logger2.debug(sb18.toString());
                                                                } else {
                                                                    url2 = url;
                                                                }
                                                                file6.delete();
                                                                extractResource(url2, file6, (String) null, (String) null);
                                                                file6.setLastModified(j10);
                                                            } else {
                                                                if (logger2.isDebugEnabled()) {
                                                                    StringBuilder sb19 = new StringBuilder("Extracting ");
                                                                    url2 = url;
                                                                    sb19.append(url2);
                                                                    logger2.debug(sb19.toString());
                                                                } else {
                                                                    url2 = url;
                                                                }
                                                                file6.delete();
                                                                extractResource(url2, file6, (String) null, (String) null);
                                                                file6.setLastModified(j10);
                                                            }
                                                            if (fileLockLock != null) {
                                                                fileLockLock.release();
                                                            }
                                                            channel2.close();
                                                        }
                                                    } else {
                                                        synchronized (Runtime.getRuntime()) {
                                                            logger2 = logger;
                                                            if (logger2.isDebugEnabled()) {
                                                                logger2.debug("Locking " + cacheDir2 + " before extracting");
                                                            }
                                                            channel2 = new FileOutputStream(file7).getChannel();
                                                            fileLockLock = channel2.lock();
                                                            if (file6.exists()) {
                                                                if (logger2.isDebugEnabled()) {
                                                                    StringBuilder sb110 = new StringBuilder("Extracting ");
                                                                    url2 = url;
                                                                    sb110.append(url2);
                                                                    logger2.debug(sb110.toString());
                                                                } else {
                                                                    url2 = url;
                                                                }
                                                                file6.delete();
                                                                extractResource(url2, file6, (String) null, (String) null);
                                                                file6.setLastModified(j10);
                                                            } else {
                                                                if (logger2.isDebugEnabled()) {
                                                                    StringBuilder sb111 = new StringBuilder("Extracting ");
                                                                    url2 = url;
                                                                    sb111.append(url2);
                                                                    logger2.debug(sb111.toString());
                                                                } else {
                                                                    url2 = url;
                                                                }
                                                                file6.delete();
                                                                extractResource(url2, file6, (String) null, (String) null);
                                                                file6.setLastModified(j10);
                                                            }
                                                            if (fileLockLock != null) {
                                                                fileLockLock.release();
                                                            }
                                                            channel2.close();
                                                        }
                                                    }
                                                } catch (RuntimeException e18) {
                                                    e = e18;
                                                    fileChannel3 = channel2;
                                                    channel2 = fileChannel3;
                                                    logger3 = logger;
                                                    if (logger3.isDebugEnabled()) {
                                                        logger3.debug("Could not create symbolic link " + file6 + ": " + e);
                                                    }
                                                    if (fileLockLock != null) {
                                                        fileLockLock.release();
                                                    }
                                                    if (channel2 != null) {
                                                        channel2.close();
                                                    }
                                                    if (file6.exists()) {
                                                        synchronized (Runtime.getRuntime()) {
                                                            logger2 = logger;
                                                            if (logger2.isDebugEnabled()) {
                                                                logger2.debug("Locking " + cacheDir2 + " before extracting");
                                                            }
                                                            channel2 = new FileOutputStream(file7).getChannel();
                                                            fileLockLock = channel2.lock();
                                                            if (file6.exists()) {
                                                                if (logger2.isDebugEnabled()) {
                                                                    StringBuilder sb112 = new StringBuilder("Extracting ");
                                                                    url2 = url;
                                                                    sb112.append(url2);
                                                                    logger2.debug(sb112.toString());
                                                                } else {
                                                                    url2 = url;
                                                                }
                                                                file6.delete();
                                                                extractResource(url2, file6, (String) null, (String) null);
                                                                file6.setLastModified(j10);
                                                            } else {
                                                                if (logger2.isDebugEnabled()) {
                                                                    StringBuilder sb113 = new StringBuilder("Extracting ");
                                                                    url2 = url;
                                                                    sb113.append(url2);
                                                                    logger2.debug(sb113.toString());
                                                                } else {
                                                                    url2 = url;
                                                                }
                                                                file6.delete();
                                                                extractResource(url2, file6, (String) null, (String) null);
                                                                file6.setLastModified(j10);
                                                            }
                                                            if (fileLockLock != null) {
                                                                fileLockLock.release();
                                                            }
                                                            channel2.close();
                                                        }
                                                    } else {
                                                        synchronized (Runtime.getRuntime()) {
                                                            logger2 = logger;
                                                            if (logger2.isDebugEnabled()) {
                                                                logger2.debug("Locking " + cacheDir2 + " before extracting");
                                                            }
                                                            channel2 = new FileOutputStream(file7).getChannel();
                                                            fileLockLock = channel2.lock();
                                                            if (file6.exists()) {
                                                                if (logger2.isDebugEnabled()) {
                                                                    StringBuilder sb114 = new StringBuilder("Extracting ");
                                                                    url2 = url;
                                                                    sb114.append(url2);
                                                                    logger2.debug(sb114.toString());
                                                                } else {
                                                                    url2 = url;
                                                                }
                                                                file6.delete();
                                                                extractResource(url2, file6, (String) null, (String) null);
                                                                file6.setLastModified(j10);
                                                            } else {
                                                                if (logger2.isDebugEnabled()) {
                                                                    StringBuilder sb115 = new StringBuilder("Extracting ");
                                                                    url2 = url;
                                                                    sb115.append(url2);
                                                                    logger2.debug(sb115.toString());
                                                                } else {
                                                                    url2 = url;
                                                                }
                                                                file6.delete();
                                                                extractResource(url2, file6, (String) null, (String) null);
                                                                file6.setLastModified(j10);
                                                            }
                                                            if (fileLockLock != null) {
                                                                fileLockLock.release();
                                                            }
                                                            channel2.close();
                                                        }
                                                    }
                                                }
                                            } else {
                                                fileChannel3 = channel2;
                                                if (path4.isAbsolute()) {
                                                    if (logger6.isDebugEnabled()) {
                                                        logger6.debug("Creating symbolic link " + path3 + " to " + path4);
                                                    }
                                                    file6.getParentFile().mkdirs();
                                                    Files.createSymbolicLink(path3, path4, new FileAttribute[0]);
                                                }
                                                fileChannel2 = fileChannel3;
                                                fileLock = fileLockLock;
                                            }
                                        } catch (IOException | RuntimeException e19) {
                                            e = e19;
                                        }
                                    } catch (Throwable th10) {
                                        th = th10;
                                        fileChannel3 = channel2;
                                    }
                                } catch (IOException e20) {
                                    e = e20;
                                    fileLockLock = null;
                                    logger3 = logger;
                                    if (logger3.isDebugEnabled()) {
                                        logger3.debug("Could not create symbolic link " + file6 + ": " + e);
                                    }
                                    if (fileLockLock != null) {
                                        fileLockLock.release();
                                    }
                                    if (channel2 != null) {
                                        channel2.close();
                                    }
                                    if (file6.exists()) {
                                        synchronized (Runtime.getRuntime()) {
                                            logger2 = logger;
                                            if (logger2.isDebugEnabled()) {
                                                logger2.debug("Locking " + cacheDir2 + " before extracting");
                                            }
                                            channel2 = new FileOutputStream(file7).getChannel();
                                            fileLockLock = channel2.lock();
                                            if (file6.exists()) {
                                                if (logger2.isDebugEnabled()) {
                                                    StringBuilder sb116 = new StringBuilder("Extracting ");
                                                    url2 = url;
                                                    sb116.append(url2);
                                                    logger2.debug(sb116.toString());
                                                } else {
                                                    url2 = url;
                                                }
                                                file6.delete();
                                                extractResource(url2, file6, (String) null, (String) null);
                                                file6.setLastModified(j10);
                                            } else {
                                                if (logger2.isDebugEnabled()) {
                                                    StringBuilder sb117 = new StringBuilder("Extracting ");
                                                    url2 = url;
                                                    sb117.append(url2);
                                                    logger2.debug(sb117.toString());
                                                } else {
                                                    url2 = url;
                                                }
                                                file6.delete();
                                                extractResource(url2, file6, (String) null, (String) null);
                                                file6.setLastModified(j10);
                                            }
                                            if (fileLockLock != null) {
                                                fileLockLock.release();
                                            }
                                            channel2.close();
                                        }
                                    } else {
                                        synchronized (Runtime.getRuntime()) {
                                            logger2 = logger;
                                            if (logger2.isDebugEnabled()) {
                                                logger2.debug("Locking " + cacheDir2 + " before extracting");
                                            }
                                            channel2 = new FileOutputStream(file7).getChannel();
                                            fileLockLock = channel2.lock();
                                            if (file6.exists()) {
                                                if (logger2.isDebugEnabled()) {
                                                    StringBuilder sb118 = new StringBuilder("Extracting ");
                                                    url2 = url;
                                                    sb118.append(url2);
                                                    logger2.debug(sb118.toString());
                                                } else {
                                                    url2 = url;
                                                }
                                                file6.delete();
                                                extractResource(url2, file6, (String) null, (String) null);
                                                file6.setLastModified(j10);
                                            } else {
                                                if (logger2.isDebugEnabled()) {
                                                    StringBuilder sb119 = new StringBuilder("Extracting ");
                                                    url2 = url;
                                                    sb119.append(url2);
                                                    logger2.debug(sb119.toString());
                                                } else {
                                                    url2 = url;
                                                }
                                                file6.delete();
                                                extractResource(url2, file6, (String) null, (String) null);
                                                file6.setLastModified(j10);
                                            }
                                            if (fileLockLock != null) {
                                                fileLockLock.release();
                                            }
                                            channel2.close();
                                        }
                                    }
                                    return file6;
                                } catch (RuntimeException e21) {
                                    e = e21;
                                    fileLockLock = null;
                                    logger3 = logger;
                                    if (logger3.isDebugEnabled()) {
                                        logger3.debug("Could not create symbolic link " + file6 + ": " + e);
                                    }
                                    if (fileLockLock != null) {
                                        fileLockLock.release();
                                    }
                                    if (channel2 != null) {
                                        channel2.close();
                                    }
                                    if (file6.exists()) {
                                        synchronized (Runtime.getRuntime()) {
                                            logger2 = logger;
                                            if (logger2.isDebugEnabled()) {
                                                logger2.debug("Locking " + cacheDir2 + " before extracting");
                                            }
                                            channel2 = new FileOutputStream(file7).getChannel();
                                            fileLockLock = channel2.lock();
                                            if (file6.exists()) {
                                                if (logger2.isDebugEnabled()) {
                                                    StringBuilder sb1110 = new StringBuilder("Extracting ");
                                                    url2 = url;
                                                    sb1110.append(url2);
                                                    logger2.debug(sb1110.toString());
                                                } else {
                                                    url2 = url;
                                                }
                                                file6.delete();
                                                extractResource(url2, file6, (String) null, (String) null);
                                                file6.setLastModified(j10);
                                            } else {
                                                if (logger2.isDebugEnabled()) {
                                                    StringBuilder sb1111 = new StringBuilder("Extracting ");
                                                    url2 = url;
                                                    sb1111.append(url2);
                                                    logger2.debug(sb1111.toString());
                                                } else {
                                                    url2 = url;
                                                }
                                                file6.delete();
                                                extractResource(url2, file6, (String) null, (String) null);
                                                file6.setLastModified(j10);
                                            }
                                            if (fileLockLock != null) {
                                                fileLockLock.release();
                                            }
                                            channel2.close();
                                        }
                                    } else {
                                        synchronized (Runtime.getRuntime()) {
                                            logger2 = logger;
                                            if (logger2.isDebugEnabled()) {
                                                logger2.debug("Locking " + cacheDir2 + " before extracting");
                                            }
                                            channel2 = new FileOutputStream(file7).getChannel();
                                            fileLockLock = channel2.lock();
                                            if (file6.exists()) {
                                                if (logger2.isDebugEnabled()) {
                                                    StringBuilder sb1112 = new StringBuilder("Extracting ");
                                                    url2 = url;
                                                    sb1112.append(url2);
                                                    logger2.debug(sb1112.toString());
                                                } else {
                                                    url2 = url;
                                                }
                                                file6.delete();
                                                extractResource(url2, file6, (String) null, (String) null);
                                                file6.setLastModified(j10);
                                            } else {
                                                if (logger2.isDebugEnabled()) {
                                                    StringBuilder sb1113 = new StringBuilder("Extracting ");
                                                    url2 = url;
                                                    sb1113.append(url2);
                                                    logger2.debug(sb1113.toString());
                                                } else {
                                                    url2 = url;
                                                }
                                                file6.delete();
                                                extractResource(url2, file6, (String) null, (String) null);
                                                file6.setLastModified(j10);
                                            }
                                            if (fileLockLock != null) {
                                                fileLockLock.release();
                                            }
                                            channel2.close();
                                        }
                                    }
                                    return file6;
                                } catch (Throwable th11) {
                                    th = th11;
                                    fileChannel = channel2;
                                    fileLock2 = null;
                                    if (fileLock2 != null) {
                                        fileLock2.release();
                                    }
                                    if (fileChannel != null) {
                                        fileChannel.close();
                                    }
                                    throw th;
                                }
                            }
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            if (fileChannel2 != null) {
                                fileChannel2.close();
                            }
                        } catch (IOException e22) {
                            e = e22;
                            channel2 = null;
                            fileLockLock = null;
                            logger3 = logger;
                            if (logger3.isDebugEnabled()) {
                                logger3.debug("Could not create symbolic link " + file6 + ": " + e);
                            }
                            if (fileLockLock != null) {
                                fileLockLock.release();
                            }
                            if (channel2 != null) {
                                channel2.close();
                            }
                            if (file6.exists()) {
                                synchronized (Runtime.getRuntime()) {
                                    logger2 = logger;
                                    if (logger2.isDebugEnabled()) {
                                        logger2.debug("Locking " + cacheDir2 + " before extracting");
                                    }
                                    channel2 = new FileOutputStream(file7).getChannel();
                                    fileLockLock = channel2.lock();
                                    if (file6.exists()) {
                                        if (logger2.isDebugEnabled()) {
                                            StringBuilder sb1114 = new StringBuilder("Extracting ");
                                            url2 = url;
                                            sb1114.append(url2);
                                            logger2.debug(sb1114.toString());
                                        } else {
                                            url2 = url;
                                        }
                                        file6.delete();
                                        extractResource(url2, file6, (String) null, (String) null);
                                        file6.setLastModified(j10);
                                    } else {
                                        if (logger2.isDebugEnabled()) {
                                            StringBuilder sb1115 = new StringBuilder("Extracting ");
                                            url2 = url;
                                            sb1115.append(url2);
                                            logger2.debug(sb1115.toString());
                                        } else {
                                            url2 = url;
                                        }
                                        file6.delete();
                                        extractResource(url2, file6, (String) null, (String) null);
                                        file6.setLastModified(j10);
                                    }
                                    if (fileLockLock != null) {
                                        fileLockLock.release();
                                    }
                                    channel2.close();
                                }
                            } else {
                                synchronized (Runtime.getRuntime()) {
                                    logger2 = logger;
                                    if (logger2.isDebugEnabled()) {
                                        logger2.debug("Locking " + cacheDir2 + " before extracting");
                                    }
                                    channel2 = new FileOutputStream(file7).getChannel();
                                    fileLockLock = channel2.lock();
                                    if (file6.exists()) {
                                        if (logger2.isDebugEnabled()) {
                                            StringBuilder sb1116 = new StringBuilder("Extracting ");
                                            url2 = url;
                                            sb1116.append(url2);
                                            logger2.debug(sb1116.toString());
                                        } else {
                                            url2 = url;
                                        }
                                        file6.delete();
                                        extractResource(url2, file6, (String) null, (String) null);
                                        file6.setLastModified(j10);
                                    } else {
                                        if (logger2.isDebugEnabled()) {
                                            StringBuilder sb1117 = new StringBuilder("Extracting ");
                                            url2 = url;
                                            sb1117.append(url2);
                                            logger2.debug(sb1117.toString());
                                        } else {
                                            url2 = url;
                                        }
                                        file6.delete();
                                        extractResource(url2, file6, (String) null, (String) null);
                                        file6.setLastModified(j10);
                                    }
                                    if (fileLockLock != null) {
                                        fileLockLock.release();
                                    }
                                    channel2.close();
                                }
                            }
                            return file6;
                        } catch (RuntimeException e23) {
                            e = e23;
                            channel2 = null;
                            fileLockLock = null;
                            logger3 = logger;
                            if (logger3.isDebugEnabled()) {
                                logger3.debug("Could not create symbolic link " + file6 + ": " + e);
                            }
                            if (fileLockLock != null) {
                                fileLockLock.release();
                            }
                            if (channel2 != null) {
                                channel2.close();
                            }
                            if (file6.exists()) {
                                synchronized (Runtime.getRuntime()) {
                                    logger2 = logger;
                                    if (logger2.isDebugEnabled()) {
                                        logger2.debug("Locking " + cacheDir2 + " before extracting");
                                    }
                                    channel2 = new FileOutputStream(file7).getChannel();
                                    fileLockLock = channel2.lock();
                                    if (file6.exists()) {
                                        if (logger2.isDebugEnabled()) {
                                            StringBuilder sb1118 = new StringBuilder("Extracting ");
                                            url2 = url;
                                            sb1118.append(url2);
                                            logger2.debug(sb1118.toString());
                                        } else {
                                            url2 = url;
                                        }
                                        file6.delete();
                                        extractResource(url2, file6, (String) null, (String) null);
                                        file6.setLastModified(j10);
                                    } else {
                                        if (logger2.isDebugEnabled()) {
                                            StringBuilder sb1119 = new StringBuilder("Extracting ");
                                            url2 = url;
                                            sb1119.append(url2);
                                            logger2.debug(sb1119.toString());
                                        } else {
                                            url2 = url;
                                        }
                                        file6.delete();
                                        extractResource(url2, file6, (String) null, (String) null);
                                        file6.setLastModified(j10);
                                    }
                                    if (fileLockLock != null) {
                                        fileLockLock.release();
                                    }
                                    channel2.close();
                                }
                            } else {
                                synchronized (Runtime.getRuntime()) {
                                    logger2 = logger;
                                    if (logger2.isDebugEnabled()) {
                                        logger2.debug("Locking " + cacheDir2 + " before extracting");
                                    }
                                    channel2 = new FileOutputStream(file7).getChannel();
                                    fileLockLock = channel2.lock();
                                    if (file6.exists()) {
                                        if (logger2.isDebugEnabled()) {
                                            StringBuilder sb11110 = new StringBuilder("Extracting ");
                                            url2 = url;
                                            sb11110.append(url2);
                                            logger2.debug(sb11110.toString());
                                        } else {
                                            url2 = url;
                                        }
                                        file6.delete();
                                        extractResource(url2, file6, (String) null, (String) null);
                                        file6.setLastModified(j10);
                                    } else {
                                        if (logger2.isDebugEnabled()) {
                                            StringBuilder sb11111 = new StringBuilder("Extracting ");
                                            url2 = url;
                                            sb11111.append(url2);
                                            logger2.debug(sb11111.toString());
                                        } else {
                                            url2 = url;
                                        }
                                        file6.delete();
                                        extractResource(url2, file6, (String) null, (String) null);
                                        file6.setLastModified(j10);
                                    }
                                    if (fileLockLock != null) {
                                        fileLockLock.release();
                                    }
                                    channel2.close();
                                }
                            }
                            return file6;
                        } catch (Throwable th12) {
                            th = th12;
                            fileLock2 = null;
                            fileChannel = null;
                        }
                    } catch (Throwable th13) {
                        throw th13;
                    }
                }
            } else {
                channel2 = null;
                fileLockLock = null;
            }
            if (file6.exists() || file6.length() != length || file6.lastModified() != j10 || !canonicalFile.equals(file6.getCanonicalFile().getParentFile())) {
                synchronized (Runtime.getRuntime()) {
                    logger2 = logger;
                    if (logger2.isDebugEnabled()) {
                        logger2.debug("Locking " + cacheDir2 + " before extracting");
                    }
                    channel2 = new FileOutputStream(file7).getChannel();
                    fileLockLock = channel2.lock();
                    if (file6.exists() || file6.length() != length || file6.lastModified() != j10 || !canonicalFile.equals(file6.getCanonicalFile().getParentFile())) {
                        if (logger2.isDebugEnabled()) {
                            StringBuilder sb11112 = new StringBuilder("Extracting ");
                            url2 = url;
                            sb11112.append(url2);
                            logger2.debug(sb11112.toString());
                        } else {
                            url2 = url;
                        }
                        file6.delete();
                        extractResource(url2, file6, (String) null, (String) null);
                        file6.setLastModified(j10);
                    }
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    channel2.close();
                }
            }
        }
        return file6;
    }

    public static String load(Class cls, Properties properties, boolean z10) {
        String canonicalPath;
        ArrayList arrayList;
        UnsatisfiedLinkError e2;
        int i10;
        if (!isLoadLibraries() || cls == null) {
            return null;
        }
        if (checkPlatform(cls, properties)) {
            Class enclosingClass = getEnclosingClass(cls);
            ClassProperties classPropertiesLoadProperties = loadProperties(enclosingClass, properties, true);
            List<String> list = classPropertiesLoadProperties.get("global");
            if (list.isEmpty()) {
                if (classPropertiesLoadProperties.getInheritedClasses() != null) {
                    Iterator<Class> it = classPropertiesLoadProperties.getInheritedClasses().iterator();
                    while (it.hasNext()) {
                        list.add(it.next().getName());
                    }
                }
                list.add(enclosingClass.getName());
            }
            for (String str : list) {
                try {
                    Logger logger2 = logger;
                    if (logger2.isDebugEnabled()) {
                        logger2.debug("Loading class " + str);
                    }
                    Class.forName(str, true, enclosingClass.getClassLoader());
                } catch (ClassNotFoundException e4) {
                    Logger logger3 = logger;
                    if (logger3.isDebugEnabled()) {
                        logger3.debug("Failed to load class " + str + ": " + e4);
                    }
                    NoClassDefFoundError noClassDefFoundError = new NoClassDefFoundError(e4.toString());
                    noClassDefFoundError.initCause(e4);
                    throw noClassDefFoundError;
                }
            }
            try {
                canonicalPath = getCacheDir().getCanonicalPath();
                while (true) {
                    try {
                        String property = classPropertiesLoadProperties.getProperty("platform.library");
                        if (i10 >= 0) {
                            property = property + "#" + property + i10;
                        }
                        String strLoadLibrary = loadLibrary(findLibrary(enclosingClass, classPropertiesLoadProperties, property, z10), property, (String[]) arrayList.toArray(new String[arrayList.size()]));
                        if (canonicalPath != null && strLoadLibrary != null && strLoadLibrary.startsWith(canonicalPath)) {
                            createLibraryLink(strLoadLibrary, classPropertiesLoadProperties, property, new String[0]);
                        }
                        return strLoadLibrary;
                    } catch (UnsatisfiedLinkError e7) {
                        Throwable cause = e7;
                        while (true) {
                            if (cause != null) {
                                if (!(cause instanceof UnsatisfiedLinkError) || !cause.getMessage().contains("already loaded in another classloader")) {
                                    cause = cause.getCause() != cause ? cause.getCause() : null;
                                }
                            } else {
                                if (e2 != null && e7.getCause() == null) {
                                    e7.initCause(e2);
                                }
                                throw e7;
                            }
                        }
                        i10++;
                    }
                }
            } catch (IOException unused) {
                canonicalPath = null;
            }
            ArrayList<String> arrayList2 = new ArrayList();
            arrayList = new ArrayList();
            arrayList2.addAll(classPropertiesLoadProperties.get("platform.preload"));
            arrayList2.addAll(classPropertiesLoadProperties.get("platform.link"));
            e2 = null;
            for (String str2 : arrayList2) {
                try {
                    String strLoadLibrary2 = loadLibrary(findLibrary(enclosingClass, classPropertiesLoadProperties, str2, z10), str2, new String[0]);
                    if (strLoadLibrary2 != null) {
                        arrayList.add(strLoadLibrary2);
                    }
                    if (canonicalPath != null && strLoadLibrary2 != null && strLoadLibrary2.startsWith(canonicalPath)) {
                        createLibraryLink(strLoadLibrary2, classPropertiesLoadProperties, str2, new String[0]);
                    }
                } catch (UnsatisfiedLinkError e10) {
                    e2 = e10;
                }
            }
            i10 = -1;
        } else {
            throw new UnsatisfiedLinkError("Platform \"" + properties.getProperty(DeviceDimensionProvider.KEY_PLATFORM) + "\" not supported by " + cls);
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0116  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x012a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0110 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public static Properties loadProperties(String str, String str2) {
        Logger logger2;
        String str3;
        Logger logger3;
        StringBuilder sb;
        String str4;
        if (str2 == null) {
            str2 = "generic";
        }
        Properties properties = new Properties();
        properties.put(DeviceDimensionProvider.KEY_PLATFORM, str);
        properties.put("platform.path.separator", File.pathSeparator);
        String strMapLibraryName = System.mapLibraryName("/");
        int iIndexOf = strMapLibraryName.indexOf(47);
        properties.put("platform.library.prefix", strMapLibraryName.substring(0, iIndexOf));
        properties.put("platform.library.suffix", strMapLibraryName.substring(iIndexOf + 1));
        InputStream resourceAsStream = Loader.class.getResourceAsStream("properties/" + str + ".properties");
        try {
            try {
                try {
                    properties.load(new InputStreamReader(resourceAsStream));
                } catch (NoSuchMethodError unused) {
                    properties.load(resourceAsStream);
                }
                if (resourceAsStream != null) {
                    try {
                        resourceAsStream.close();
                    } catch (IOException e2) {
                        e = e2;
                        logger3 = logger;
                        sb = new StringBuilder("Unable to close resource : ");
                        sb.append(e.getMessage());
                        logger3.error(sb.toString());
                    }
                }
            } catch (Exception unused2) {
                InputStream resourceAsStream2 = Loader.class.getResourceAsStream("properties/" + str2 + ".properties");
                try {
                    try {
                        properties.load(new InputStreamReader(resourceAsStream2));
                    } catch (Exception unused3) {
                        if (resourceAsStream2 != null) {
                            try {
                                resourceAsStream2.close();
                            } catch (IOException e4) {
                                logger2 = logger;
                                str3 = "Unable to close resource : " + e4.getMessage();
                                logger2.error(str3);
                                if (resourceAsStream != null) {
                                    try {
                                        resourceAsStream.close();
                                    } catch (IOException e7) {
                                        e = e7;
                                        logger3 = logger;
                                        sb = new StringBuilder("Unable to close resource : ");
                                        sb.append(e.getMessage());
                                        logger3.error(sb.toString());
                                    }
                                }
                                for (Map.Entry entry : System.getProperties().entrySet()) {
                                    str4 = (String) entry.getKey();
                                    String str5 = (String) entry.getValue();
                                    if (str4 == null) {
                                    }
                                }
                                return properties;
                            }
                        }
                        if (resourceAsStream != null) {
                            resourceAsStream.close();
                        }
                        while (r6.hasNext()) {
                            str4 = (String) entry.getKey();
                            String str6 = (String) entry.getValue();
                            if (str4 == null) {
                            }
                        }
                        return properties;
                    } catch (Throwable th) {
                        if (resourceAsStream2 != null) {
                            try {
                                resourceAsStream2.close();
                            } catch (IOException e10) {
                                logger.error("Unable to close resource : " + e10.getMessage());
                            }
                        }
                        throw th;
                    }
                } catch (NoSuchMethodError unused4) {
                    properties.load(resourceAsStream2);
                }
                if (resourceAsStream2 != null) {
                    try {
                        resourceAsStream2.close();
                    } catch (IOException e11) {
                        logger2 = logger;
                        str3 = "Unable to close resource : " + e11.getMessage();
                        logger2.error(str3);
                        if (resourceAsStream != null) {
                            resourceAsStream.close();
                        }
                        while (r6.hasNext()) {
                            str4 = (String) entry.getKey();
                            String str7 = (String) entry.getValue();
                            if (str4 == null) {
                            }
                        }
                        return properties;
                    }
                }
                if (resourceAsStream != null) {
                    resourceAsStream.close();
                }
            }
            while (r6.hasNext()) {
                str4 = (String) entry.getKey();
                String str8 = (String) entry.getValue();
                if (str4 == null && str8 != null && str4.startsWith("org.bytedeco.javacpp.platform.")) {
                    properties.put(str4.substring(str4.indexOf("platform.")), str8);
                }
            }
            return properties;
        } catch (Throwable th2) {
            if (resourceAsStream != null) {
                try {
                    resourceAsStream.close();
                } catch (IOException e12) {
                    logger.error("Unable to close resource : " + e12.getMessage());
                }
            }
            throw th2;
        }
    }

    public static boolean checkPlatform(Platform platform, Properties properties, String... strArr) {
        if (platform == null) {
            return true;
        }
        if (strArr == null) {
            strArr = new String[0];
        }
        String property = properties.getProperty(DeviceDimensionProvider.KEY_PLATFORM);
        String property2 = properties.getProperty("platform.extension");
        if (platform.value().length > 0) {
            strArr = platform.value();
        }
        String[][] strArr2 = {strArr, platform.not()};
        boolean[] zArr = new boolean[2];
        zArr[0] = false;
        zArr[1] = false;
        for (int i10 = 0; i10 < 2; i10++) {
            for (String str : strArr2[i10]) {
                if (property.startsWith(str)) {
                    zArr[i10] = true;
                    break;
                }
            }
        }
        if ((strArr2[0].length != 0 && !zArr[0]) || (strArr2[1].length != 0 && zArr[1])) {
            return false;
        }
        boolean z10 = platform.extension().length == 0 || (isLoadLibraries() && property2 == null);
        for (String str2 : platform.extension()) {
            if (property2 != null && property2.length() > 0 && property2.endsWith(str2)) {
                return true;
            }
        }
        return z10;
    }

    public static ClassProperties loadProperties(Class[] clsArr, Properties properties, boolean z10) {
        ClassProperties classProperties = new ClassProperties(properties);
        if (clsArr != null) {
            for (Class cls : clsArr) {
                classProperties.load(cls, z10);
            }
        }
        return classProperties;
    }

    public static ClassProperties loadProperties(Class cls, Properties properties, boolean z10) {
        ClassProperties classProperties = new ClassProperties(properties);
        if (cls != null) {
            classProperties.load(cls, z10);
        }
        return classProperties;
    }
}
