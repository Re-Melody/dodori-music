package org.bytedeco.javacpp.tools;

import B2.AbstractC0112b;
import V0.p;
import com.google.android.gms.common.api.f;
import com.revenuecat.purchases.common.events.BackendEvent;
import com.revenuecat.purchases.common.localrules.DeviceDimensionProvider;
import com.revenuecat.purchases.common.networking.ETagPayloadStore;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.jar.JarOutputStream;
import java.util.zip.ZipEntry;
import org.apache.tika.utils.StringUtils;
import org.bytedeco.javacpp.ClassProperties;
import org.bytedeco.javacpp.Loader;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
public class Builder {
    String[] buildCommand;
    ClassScanner classScanner;
    boolean compile;
    Collection<String> compilerOptions;
    boolean copyLibs;
    boolean copyResources;
    boolean deleteJniFiles;
    String encoding;
    Map<String, String> environmentVariables;
    boolean generate;
    boolean header;
    String jarPrefix;
    final Logger logger;
    File outputDirectory;
    String outputName;
    Properties properties;
    File workingDirectory;

    public Builder() {
        this(Logger.create(Builder.class));
    }

    public static void main(String[] strArr) throws IOException {
        Builder builder = new Builder();
        int length = 0;
        boolean z10 = false;
        String[] strArr2 = null;
        while (length < strArr.length) {
            if ("-help".equals(strArr[length]) || "--help".equals(strArr[length])) {
                printHelp();
                System.exit(0);
            } else if ("-classpath".equals(strArr[length]) || "-cp".equals(strArr[length]) || "-lib".equals(strArr[length])) {
                length++;
                builder.classPaths(strArr[length]);
            } else if ("-encoding".equals(strArr[length])) {
                length++;
                builder.encoding(strArr[length]);
            } else if ("-d".equals(strArr[length])) {
                length++;
                builder.outputDirectory(strArr[length]);
            } else if ("-o".equals(strArr[length])) {
                length++;
                builder.outputName(strArr[length]);
            } else if ("-nocpp".equals(strArr[length]) || "-nogenerate".equals(strArr[length])) {
                builder.generate(false);
            } else if ("-cpp".equals(strArr[length]) || "-nocompile".equals(strArr[length])) {
                builder.compile(false);
            } else if ("-nodelete".equals(strArr[length])) {
                builder.deleteJniFiles(false);
            } else if ("-header".equals(strArr[length])) {
                builder.header(true);
            } else if ("-copylibs".equals(strArr[length])) {
                builder.copyLibs(true);
            } else if ("-copyresources".equals(strArr[length])) {
                builder.copyResources(true);
            } else if ("-jarprefix".equals(strArr[length])) {
                length++;
                builder.jarPrefix(strArr[length]);
            } else if ("-properties".equals(strArr[length])) {
                length++;
                builder.properties(strArr[length]);
            } else if ("-propertyfile".equals(strArr[length])) {
                length++;
                builder.propertyFile(strArr[length]);
            } else if (strArr[length].startsWith("-D")) {
                builder.property(strArr[length]);
            } else if ("-Xcompiler".equals(strArr[length])) {
                length++;
                builder.compilerOptions(strArr[length]);
            } else if ("-exec".equals(strArr[length])) {
                strArr2 = (String[]) Arrays.copyOfRange(strArr, length + 1, strArr.length);
                length = strArr.length;
            } else if (strArr[length].startsWith("-")) {
                builder.logger.error("Invalid option \"" + strArr[length] + "\"");
                printHelp();
                System.exit(1);
            } else {
                String strSubstring = strArr[length];
                if (strSubstring.endsWith(".java")) {
                    ArrayList arrayList = new ArrayList(Arrays.asList("javac", "-cp"));
                    String property = System.getProperty("java.class.path");
                    for (String str : builder.classScanner.getClassLoader().getPaths()) {
                        property = b.m(AbstractC0112b.o(property), File.pathSeparator, str);
                    }
                    arrayList.add(property);
                    arrayList.add(strSubstring);
                    int iExecuteCommand = builder.executeCommand(arrayList, builder.workingDirectory, builder.environmentVariables);
                    if (iExecuteCommand != 0) {
                        throw new RuntimeException("Could not compile " + strSubstring + ": " + iExecuteCommand);
                    }
                    strSubstring = strSubstring.replace(File.separatorChar, com.amazon.a.a.o.c.a.b.f16463a).replace('/', com.amazon.a.a.o.c.a.b.f16463a).substring(0, strSubstring.length() - 5);
                }
                builder.classesOrPackages(strSubstring);
                z10 = true;
            }
            length++;
        }
        if (!z10) {
            builder.classesOrPackages(null);
        }
        File[] fileArrBuild = builder.build();
        Collection<Class> classes = builder.classScanner.getClasses();
        if (fileArrBuild == null || fileArrBuild.length <= 0 || classes.isEmpty() || strArr2 == null) {
            return;
        }
        Class next = classes.iterator().next();
        ArrayList arrayList2 = new ArrayList(Arrays.asList("java", "-cp"));
        String property2 = System.getProperty("java.class.path");
        for (String str2 : builder.classScanner.getClassLoader().getPaths()) {
            property2 = b.m(AbstractC0112b.o(property2), File.pathSeparator, str2);
        }
        arrayList2.add(property2);
        arrayList2.add(next.getCanonicalName());
        arrayList2.addAll(Arrays.asList(strArr2));
        System.exit(builder.executeCommand(arrayList2, builder.workingDirectory, builder.environmentVariables));
    }

    public static void printHelp() {
        String implementationVersion = Builder.class.getPackage().getImplementationVersion();
        if (implementationVersion == null) {
            implementationVersion = "unknown";
        }
        System.out.println("JavaCPP version " + implementationVersion + "\nCopyright (C) 2011-2018 Samuel Audet <samuel.audet@gmail.com>\nProject site: https://github.com/bytedeco/javacpp");
        System.out.println();
        System.out.println("Usage: java -jar javacpp.jar [options] [class or package (suffixed with .* or .**)] [commands]");
        System.out.println();
        System.out.println("where options include:");
        System.out.println();
        System.out.println("    -classpath <path>      Load user classes from path");
        System.out.println("    -encoding <name>       Character encoding used for input and output files");
        System.out.println("    -d <directory>         Output all generated files to directory");
        System.out.println("    -o <name>              Output everything in a file named after given name");
        System.out.println("    -nogenerate            Do not try to generate C++ source files, only try to parse header files");
        System.out.println("    -nocompile             Do not compile or delete the generated C++ source files");
        System.out.println("    -nodelete              Do not delete generated C++ JNI files after compilation");
        System.out.println("    -header                Generate header file with declarations of callbacks functions");
        System.out.println("    -copylibs              Copy to output directory dependent libraries (link and preload)");
        System.out.println("    -copyresources         Copy to output directory resources listed in properties");
        System.out.println("    -jarprefix <prefix>    Also create a JAR file named \"<prefix>-<platform>.jar\"");
        System.out.println("    -properties <resource> Load all properties from resource");
        System.out.println("    -propertyfile <file>   Load all properties from file");
        System.out.println("    -D<property>=<value>   Set property to value");
        System.out.println("    -Xcompiler <option>    Pass option directly to compiler");
        System.out.println();
        System.out.println("and where optional commands include:");
        System.out.println();
        System.out.println("    -exec [args...]        After build, call java command on the first class");
        System.out.println();
    }

    /* JADX WARN: Code duplicated, block: B:154:0x03ad A[LOOP:10: B:152:0x03a4->B:154:0x03ad, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:252:0x03b4 A[EDGE_INSN: B:252:0x03b4->B:155:0x03b4 BREAK  A[LOOP:10: B:152:0x03a4->B:154:0x03ad], SYNTHETIC] */
    public File[] build() throws IOException {
        String str;
        String str2;
        Iterator it;
        String str3;
        Iterator it2;
        File file;
        File file2;
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        byte[] bArr;
        int i10;
        FileInputStream fileInputStream2;
        String[] strArr = this.buildCommand;
        String str4 = "platform.link";
        String str5 = "platform.preload";
        boolean z10 = true;
        if (strArr != null && strArr.length > 0) {
            List<String> listAsList = Arrays.asList(strArr);
            String property = this.properties.getProperty("platform.buildpath", "");
            String property2 = this.properties.getProperty("platform.linkresource", "");
            String property3 = this.properties.getProperty("platform.buildresource", "");
            String property4 = this.properties.getProperty("platform.path.separator");
            if (property.length() > 0 || property3.length() > 0) {
                ArrayList arrayList = new ArrayList();
                ClassProperties classProperties = null;
                for (Class cls : this.classScanner.getClasses()) {
                    if (Loader.getEnclosingClass(cls) == cls) {
                        classProperties = Loader.loadProperties(cls, this.properties, z10);
                        if (classProperties.isLoaded()) {
                            arrayList.addAll(classProperties.get("platform.preload"));
                            arrayList.addAll(classProperties.get("platform.link"));
                        } else {
                            this.logger.warn("Could not load platform properties for " + cls);
                        }
                        z10 = true;
                    }
                }
                if (classProperties == null) {
                    classProperties = new ClassProperties(this.properties);
                }
                String[] strArrSplit = property3.split(property4);
                int length = strArrSplit.length;
                for (int i11 = 0; i11 < length; i11++) {
                    File[] fileArrCacheResources = Loader.cacheResources(strArrSplit[i11]);
                    int length2 = fileArrCacheResources.length;
                    int i12 = 0;
                    while (i12 < length2) {
                        File file3 = fileArrCacheResources[i12];
                        String canonicalPath = file3.getCanonicalPath();
                        if (property.length() > 0 && !property.endsWith(property4)) {
                            property = p.n(property, property4);
                        }
                        property = p.n(property, canonicalPath);
                        ArrayList arrayList2 = new ArrayList();
                        String[] strArrSplit2 = property2.split(property4);
                        String[] strArr2 = strArrSplit;
                        int length3 = strArrSplit2.length;
                        int i13 = length;
                        int i14 = 0;
                        while (i14 < length3) {
                            int i15 = length3;
                            File[] fileArrCacheResources2 = Loader.cacheResources(strArrSplit2[i14]);
                            int i16 = i14;
                            int length4 = fileArrCacheResources2.length;
                            int i17 = 0;
                            while (i17 < length4) {
                                int i18 = i17;
                                String canonicalPath2 = fileArrCacheResources2[i17].getCanonicalPath();
                                if (canonicalPath2.startsWith(canonicalPath) && !canonicalPath2.equals(canonicalPath)) {
                                    arrayList2.add(canonicalPath2);
                                }
                                i17 = i18 + 1;
                            }
                            i14 = i16 + 1;
                            length3 = i15;
                        }
                        File[] fileArrListFiles = file3.listFiles();
                        if (fileArrListFiles != null) {
                            int length5 = fileArrListFiles.length;
                            int i19 = 0;
                            while (i19 < length5) {
                                Loader.createLibraryLink(fileArrListFiles[i19].getAbsolutePath(), classProperties, null, (String[]) arrayList2.toArray(new String[arrayList2.size()]));
                                i19++;
                                fileArrListFiles = fileArrListFiles;
                            }
                        }
                        i12++;
                        strArrSplit = strArr2;
                        length = i13;
                    }
                }
                if (property.length() > 0) {
                    if (this.environmentVariables == null) {
                        this.environmentVariables = new LinkedHashMap();
                    }
                    this.environmentVariables.put("BUILD_PATH", property);
                    this.environmentVariables.put("BUILD_PATH_SEPARATOR", property4);
                }
            }
            int iExecuteCommand = executeCommand(listAsList, this.workingDirectory, this.environmentVariables);
            if (iExecuteCommand == 0) {
                return null;
            }
            throw new RuntimeException(b.j(iExecuteCommand, "Process exited with an error: "));
        }
        if (this.classScanner.getClasses().isEmpty()) {
            return null;
        }
        ArrayList arrayList3 = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Class cls2 : this.classScanner.getClasses()) {
            if (Loader.getEnclosingClass(cls2) == cls2) {
                ClassProperties classPropertiesLoadProperties = Loader.loadProperties(cls2, this.properties, false);
                if (classPropertiesLoadProperties.isLoaded()) {
                    try {
                        if (Arrays.asList(cls2.getInterfaces()).contains(BuildEnabled.class)) {
                            ((BuildEnabled) cls2.newInstance()).init(this.logger, this.properties, this.encoding);
                        }
                    } catch (ClassCastException | IllegalAccessException | InstantiationException unused) {
                    }
                    String property5 = classPropertiesLoadProperties.getProperty("global");
                    if (property5 != null && !cls2.getName().equals(property5)) {
                        Iterator<Class> it3 = this.classScanner.getClasses().iterator();
                        boolean zEquals = false;
                        while (it3.hasNext()) {
                            zEquals |= it3.next().getName().equals(property5);
                        }
                        if (!this.generate || !zEquals) {
                            File file4 = parse(this.classScanner.getClassLoader().getPaths(), cls2);
                            if (file4 != null) {
                                arrayList3.add(file4);
                            }
                        }
                    }
                }
                if (!classPropertiesLoadProperties.isLoaded()) {
                    classPropertiesLoadProperties = Loader.loadProperties(cls2, this.properties, true);
                }
                if (classPropertiesLoadProperties.isLoaded()) {
                    String property6 = this.outputName;
                    if (property6 == null) {
                        property6 = classPropertiesLoadProperties.getProperty("platform.library", "");
                    }
                    if (this.generate && property6.length() != 0) {
                        LinkedHashSet linkedHashSet = (LinkedHashSet) linkedHashMap.get(property6);
                        if (linkedHashSet == null) {
                            linkedHashSet = new LinkedHashSet();
                            linkedHashMap.put(property6, linkedHashSet);
                        }
                        linkedHashSet.addAll(classPropertiesLoadProperties.getEffectiveClasses());
                    }
                } else {
                    this.logger.warn("Could not load platform properties for " + cls2);
                }
            }
        }
        Iterator it4 = linkedHashMap.keySet().iterator();
        int i20 = 0;
        while (it4.hasNext()) {
            String str6 = (String) it4.next();
            LinkedHashSet linkedHashSet2 = (LinkedHashSet) linkedHashMap.get(str6);
            Class[] clsArr = (Class[]) linkedHashSet2.toArray(new Class[linkedHashSet2.size()]);
            File[] fileArrGenerateAndCompile = generateAndCompile(clsArr, str6, i20 == 0, i20 == linkedHashMap.size() + (-1));
            if (fileArrGenerateAndCompile == null || fileArrGenerateAndCompile.length <= 0) {
                str = str4;
                str2 = str5;
                it = it4;
            } else {
                File parentFile = fileArrGenerateAndCompile[fileArrGenerateAndCompile.length - 1].getParentFile();
                arrayList3.addAll(Arrays.asList(fileArrGenerateAndCompile));
                if (this.copyLibs) {
                    ClassProperties classPropertiesLoadProperties2 = Loader.loadProperties(clsArr, this.properties, false);
                    ArrayList<String> arrayList4 = new ArrayList();
                    arrayList4.addAll(classPropertiesLoadProperties2.get(str5));
                    arrayList4.addAll(classPropertiesLoadProperties2.get(str4));
                    ClassProperties classPropertiesLoadProperties3 = Loader.loadProperties(clsArr, this.properties, true);
                    for (String str7 : arrayList4) {
                        str4 = str4;
                        if (!str7.trim().endsWith("#") && str7.trim().length() != 0) {
                            try {
                                str3 = str5;
                                try {
                                    it2 = it4;
                                    try {
                                        file = new File(new URI(Loader.findLibrary(null, classPropertiesLoadProperties2, str7)[0].toURI().toString().split("#")[0]));
                                    } catch (Exception unused2) {
                                        try {
                                            file = new File(new URI(Loader.findLibrary(null, classPropertiesLoadProperties3, str7)[0].toURI().toString().split("#")[0]));
                                        } catch (Exception unused3) {
                                            this.logger.warn("Could not find library ".concat(str7));
                                        }
                                    }
                                } catch (Exception unused4) {
                                    it2 = it4;
                                    file = new File(new URI(Loader.findLibrary(null, classPropertiesLoadProperties3, str7)[0].toURI().toString().split("#")[0]));
                                    file2 = new File(parentFile, file.getName());
                                    if (file.exists()) {
                                        this.logger.info("Copying " + file);
                                        fileInputStream = new FileInputStream(file);
                                        fileOutputStream = new FileOutputStream(file2);
                                        bArr = new byte[ETagPayloadStore.CHUNK_CHARS];
                                        while (true) {
                                            i10 = fileInputStream.read(bArr);
                                            fileInputStream2 = fileInputStream;
                                            if (i10 != -1) {
                                                break;
                                            }
                                            fileOutputStream.write(bArr, 0, i10);
                                            fileInputStream = fileInputStream2;
                                        }
                                        fileOutputStream.close();
                                        fileInputStream2.close();
                                        arrayList3.add(file2);
                                    }
                                    str5 = str3;
                                    it4 = it2;
                                }
                            } catch (Exception unused5) {
                                str3 = str5;
                            }
                            file2 = new File(parentFile, file.getName());
                            if (file.exists() && !arrayList3.contains(file2)) {
                                this.logger.info("Copying " + file);
                                fileInputStream = new FileInputStream(file);
                                fileOutputStream = new FileOutputStream(file2);
                                bArr = new byte[ETagPayloadStore.CHUNK_CHARS];
                                while (true) {
                                    i10 = fileInputStream.read(bArr);
                                    fileInputStream2 = fileInputStream;
                                    if (i10 != -1) {
                                        break;
                                        break;
                                    }
                                    fileOutputStream.write(bArr, 0, i10);
                                    fileInputStream = fileInputStream2;
                                }
                                fileOutputStream.close();
                                fileInputStream2.close();
                                arrayList3.add(file2);
                            }
                            str5 = str3;
                            it4 = it2;
                        }
                    }
                }
                str = str4;
                str2 = str5;
                it = it4;
                if (this.copyResources) {
                    List<String> list = Loader.loadProperties(clsArr, this.properties, false).get("platform.resource");
                    List<String> list2 = Loader.loadProperties(clsArr, this.properties, true).get("platform.resourcepath");
                    Path path = parentFile.toPath();
                    for (String str8 : list) {
                        final Path pathResolve = path.resolve(str8);
                        if (!Files.exists(pathResolve, new LinkOption[0])) {
                            Files.createDirectories(pathResolve, new FileAttribute[0]);
                        }
                        Iterator<String> it5 = list2.iterator();
                        while (it5.hasNext()) {
                            final Path path2 = Paths.get(it5.next(), str8);
                            if (Files.exists(path2, new LinkOption[0])) {
                                this.logger.info("Copying " + path2);
                                Files.walkFileTree(path2, EnumSet.of(FileVisitOption.FOLLOW_LINKS), f.API_PRIORITY_OTHER, new SimpleFileVisitor<Path>() { // from class: org.bytedeco.javacpp.tools.Builder.2
                                    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
                                    public /* bridge */ /* synthetic */ FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes basicFileAttributes) {
                                        return preVisitDirectory(org.apache.tika.io.b.f(obj), basicFileAttributes);
                                    }

                                    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
                                    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) {
                                        return visitFile(org.apache.tika.io.b.f(obj), basicFileAttributes);
                                    }

                                    public FileVisitResult preVisitDirectory(Path path3, BasicFileAttributes basicFileAttributes) {
                                        Path pathResolve2 = pathResolve.resolve(path2.relativize(path3));
                                        try {
                                            Files.copy(path3, pathResolve2, StandardCopyOption.REPLACE_EXISTING);
                                        } catch (DirectoryNotEmptyException | FileAlreadyExistsException e2) {
                                            if (!Files.isDirectory(pathResolve2, new LinkOption[0])) {
                                                throw e2;
                                            }
                                        }
                                        return FileVisitResult.CONTINUE;
                                    }

                                    public FileVisitResult visitFile(Path path3, BasicFileAttributes basicFileAttributes) throws IOException {
                                        Files.copy(path3, pathResolve.resolve(path2.relativize(path3)), StandardCopyOption.REPLACE_EXISTING);
                                        return FileVisitResult.CONTINUE;
                                    }
                                });
                            }
                        }
                    }
                }
            }
            i20++;
            str4 = str;
            str5 = str2;
            it4 = it;
        }
        File[] fileArr = (File[]) arrayList3.toArray(new File[arrayList3.size()]);
        if (this.jarPrefix != null && fileArr.length > 0) {
            File file5 = new File(this.jarPrefix + "-" + this.properties.getProperty(DeviceDimensionProvider.KEY_PLATFORM) + this.properties.getProperty("platform.extension", "") + ".jar");
            File parentFile2 = file5.getParentFile();
            if (parentFile2 != null && !parentFile2.exists()) {
                parentFile2.mkdir();
            }
            createJar(file5, this.outputDirectory == null ? this.classScanner.getClassLoader().getPaths() : null, fileArr);
        }
        System.setProperty("org.bytedeco.javacpp.loadlibraries", com.amazon.a.a.o.b.af);
        return fileArr;
    }

    public Builder buildCommand(String[] strArr) {
        this.buildCommand = strArr;
        return this;
    }

    public Builder classPaths(String str) {
        classPaths(str == null ? null : str.split(File.pathSeparator));
        return this;
    }

    public Builder classesOrPackages(String... strArr) {
        if (strArr == null) {
            this.classScanner.addPackage(null, true);
            return this;
        }
        for (String str : strArr) {
            this.classScanner.addClassOrPackage(str);
        }
        return this;
    }

    public int compile(String[] strArr, String str, ClassProperties classProperties, File file) {
        int i10;
        char c3;
        ArrayList arrayList = new ArrayList();
        includeJavaPaths(classProperties, this.header);
        String platform = Loader.getPlatform();
        arrayList.add(classProperties.getProperty("platform.compiler"));
        String property = classProperties.getProperty("platform.sysroot.prefix", "");
        for (String str2 : classProperties.get("platform.sysroot")) {
            if (new File(str2).isDirectory()) {
                if (property.endsWith(StringUtils.SPACE)) {
                    arrayList.add(property.trim());
                    arrayList.add(str2);
                } else {
                    arrayList.add(property + str2);
                }
            }
        }
        String property2 = classProperties.getProperty("platform.toolchain.prefix", "");
        for (String str3 : classProperties.get("platform.toolchain")) {
            if (new File(str3).isDirectory()) {
                if (property2.endsWith(StringUtils.SPACE)) {
                    arrayList.add(property2.trim());
                    arrayList.add(str3);
                } else {
                    arrayList.add(property2 + str3);
                }
            }
        }
        String property3 = classProperties.getProperty("platform.includepath.prefix", "");
        for (String str4 : classProperties.get("platform.includepath")) {
            if (new File(str4).isDirectory()) {
                if (property3.endsWith(StringUtils.SPACE)) {
                    arrayList.add(property3.trim());
                    arrayList.add(str4);
                } else {
                    arrayList.add(property3 + str4);
                }
            }
        }
        Iterator<String> it = classProperties.get("platform.includeresource").iterator();
        while (true) {
            i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            File[] fileArrCacheResources = Loader.cacheResources(it.next());
            int length = fileArrCacheResources.length;
            while (i10 < length) {
                File file2 = fileArrCacheResources[i10];
                if (file2.isDirectory()) {
                    if (property3.endsWith(StringUtils.SPACE)) {
                        arrayList.add(property3.trim());
                        arrayList.add(file2.getCanonicalPath());
                    } else {
                        StringBuilder sbO = AbstractC0112b.o(property3);
                        sbO.append(file2.getCanonicalPath());
                        arrayList.add(sbO.toString());
                    }
                }
                i10++;
            }
        }
        boolean z10 = true;
        for (int length2 = strArr.length - 1; length2 >= 0; length2--) {
            arrayList.add(strArr[length2]);
        }
        List<String> list = classProperties.get("platform.compiler.*");
        if (!list.contains("!default") && !list.contains("default")) {
            list.add(0, "default");
        }
        for (String str5 : list) {
            if (str5 != null && str5.length() != 0) {
                String strConcat = "platform.compiler.".concat(str5);
                String property4 = classProperties.getProperty(strConcat);
                if (property4 != null && property4.length() > 0) {
                    arrayList.addAll(Arrays.asList(property4.split(StringUtils.SPACE)));
                } else if (!"!default".equals(str5) && !"default".equals(str5)) {
                    this.logger.warn("Could not get the property named \"" + strConcat + "\"");
                }
            }
        }
        arrayList.addAll(this.compilerOptions);
        String property5 = classProperties.getProperty("platform.compiler.output");
        int i11 = 1;
        while (true) {
            c3 = 2;
            if (i11 >= 2 && property5 == null) {
                break;
            }
            boolean z11 = z10;
            if (property5 != null && property5.length() > 0) {
                arrayList.addAll(Arrays.asList(property5.split(StringUtils.SPACE)));
            }
            if (property5 == null || property5.length() == 0 || property5.endsWith(StringUtils.SPACE)) {
                arrayList.add(str);
            } else {
                arrayList.add(((String) arrayList.remove(arrayList.size() - 1)) + str);
            }
            i11++;
            property5 = classProperties.getProperty("platform.compiler.output" + i11);
            z10 = z11;
        }
        String property6 = classProperties.getProperty("platform.linkpath.prefix", "");
        String property7 = classProperties.getProperty("platform.linkpath.prefix2");
        for (String str6 : classProperties.get("platform.linkpath")) {
            if (new File(str6).isDirectory()) {
                if (property6.endsWith(StringUtils.SPACE)) {
                    arrayList.add(property6.trim());
                    arrayList.add(str6);
                } else {
                    arrayList.add(property6 + str6);
                }
                if (property7 != null) {
                    if (property7.endsWith(StringUtils.SPACE)) {
                        arrayList.add(property7.trim());
                        arrayList.add(str6);
                    } else {
                        arrayList.add(property7 + str6);
                    }
                }
            }
        }
        Iterator<String> it2 = classProperties.get("platform.linkresource").iterator();
        while (it2.hasNext()) {
            File[] fileArrCacheResources2 = Loader.cacheResources(it2.next());
            int length3 = fileArrCacheResources2.length;
            int i12 = 0;
            while (i12 < length3) {
                File file3 = fileArrCacheResources2[i12];
                if (file3.isDirectory()) {
                    if (property6.endsWith(StringUtils.SPACE)) {
                        arrayList.add(property6.trim());
                        arrayList.add(file3.getCanonicalPath());
                    } else {
                        StringBuilder sbO2 = AbstractC0112b.o(property6);
                        sbO2.append(file3.getCanonicalPath());
                        arrayList.add(sbO2.toString());
                    }
                    if (property7 != null) {
                        if (property7.endsWith(StringUtils.SPACE)) {
                            arrayList.add(property7.trim());
                            arrayList.add(file3.getCanonicalPath());
                        } else {
                            StringBuilder sbO3 = AbstractC0112b.o(property7);
                            sbO3.append(file3.getCanonicalPath());
                            arrayList.add(sbO3.toString());
                        }
                    }
                } else {
                    z10 = z10;
                    c3 = c3;
                }
                i12++;
                c3 = c3;
                z10 = z10;
            }
        }
        boolean z12 = z10;
        char c9 = c3;
        String property8 = classProperties.getProperty("platform.link.prefix", "");
        String property9 = classProperties.getProperty("platform.link.suffix", "");
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (property8.endsWith(StringUtils.SPACE)) {
            arrayList2.addAll(Arrays.asList(property8.trim().split(StringUtils.SPACE)));
            property8 = "";
        } else {
            int iLastIndexOf = property8.lastIndexOf(StringUtils.SPACE);
            if (iLastIndexOf != -1) {
                arrayList2.addAll(Arrays.asList(property8.substring(0, iLastIndexOf).split(StringUtils.SPACE)));
                property8 = property8.substring(iLastIndexOf + 1);
            }
        }
        if (property9.startsWith(StringUtils.SPACE)) {
            arrayList3.addAll(Arrays.asList(property9.trim().split(StringUtils.SPACE)));
            property9 = "";
        } else {
            int iIndexOf = property9.indexOf(StringUtils.SPACE);
            if (iIndexOf != -1) {
                String strSubstring = property9.substring(0, iIndexOf);
                arrayList3.addAll(Arrays.asList(property9.substring(iIndexOf + 1).split(StringUtils.SPACE)));
                property9 = strSubstring;
            }
        }
        int size = arrayList.size();
        Iterator<String> it3 = classProperties.get("platform.link").iterator();
        while (it3.hasNext()) {
            String[] strArrSplit = it3.next().split("#")[0].split("@");
            String str7 = (strArrSplit.length == 3 && strArrSplit[z12 ? 1 : 0].length() == 0) ? strArrSplit[0] + strArrSplit[c9] : strArrSplit[0];
            ArrayList arrayList4 = new ArrayList();
            arrayList4.addAll(arrayList2);
            arrayList4.add(property8 + str7 + property9);
            arrayList4.addAll(arrayList3);
            arrayList.addAll(size, arrayList4);
        }
        String property10 = classProperties.getProperty("platform.frameworkpath.prefix", "");
        for (String str8 : classProperties.get("platform.frameworkpath")) {
            if (new File(str8).isDirectory()) {
                if (property10.endsWith(StringUtils.SPACE)) {
                    arrayList.add(property10.trim());
                    arrayList.add(str8);
                } else {
                    arrayList.add(property10 + str8);
                }
            }
        }
        String property11 = classProperties.getProperty("platform.framework.prefix", "");
        String property12 = classProperties.getProperty("platform.framework.suffix", "");
        for (String str9 : classProperties.get("platform.framework")) {
            if (property11.endsWith(StringUtils.SPACE) && property12.startsWith(StringUtils.SPACE)) {
                arrayList.add(property11.trim());
                arrayList.add(str9);
                arrayList.add(property12.trim());
            } else if (property11.endsWith(StringUtils.SPACE)) {
                arrayList.add(property11.trim());
                arrayList.add(str9 + property12);
            } else if (property12.startsWith(StringUtils.SPACE)) {
                arrayList.add(property11 + str9);
                arrayList.add(property12.trim());
            } else {
                arrayList.add(property11 + str9 + property12);
            }
        }
        boolean zStartsWith = platform.startsWith("windows");
        while (i10 < arrayList.size()) {
            String str10 = (String) arrayList.get(i10);
            if (str10 == null) {
                str10 = "";
            }
            if (str10.trim().isEmpty() && zStartsWith) {
                str10 = "\"\"";
            }
            arrayList.set(i10, str10);
            i10++;
        }
        return executeCommand(arrayList, file, this.environmentVariables);
    }

    public Builder compilerOptions(String... strArr) {
        if (strArr != null) {
            this.compilerOptions.addAll(Arrays.asList(strArr));
        }
        return this;
    }

    public Builder copyLibs(boolean z10) {
        this.copyLibs = z10;
        return this;
    }

    public Builder copyResources(boolean z10) {
        this.copyResources = z10;
        return this;
    }

    public void createJar(File file, String[] strArr, File... fileArr) throws IOException {
        this.logger.info("Creating " + file);
        JarOutputStream jarOutputStream = new JarOutputStream(new FileOutputStream(file));
        for (File file2 : fileArr) {
            String path = file2.getPath();
            if (strArr != null) {
                int length = strArr.length;
                String[] strArr2 = new String[length];
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    String canonicalPath = new File(strArr[i10]).getCanonicalPath();
                    if (path.startsWith(canonicalPath)) {
                        strArr2[i10] = path.substring(canonicalPath.length() + 1);
                    }
                }
                for (int i11 = 0; i11 < length; i11++) {
                    String str = strArr2[i11];
                    if (str != null && str.length() < path.length()) {
                        path = strArr2[i11];
                    }
                }
            }
            ZipEntry zipEntry = new ZipEntry(path.replace(File.separatorChar, '/'));
            zipEntry.setTime(file2.lastModified());
            jarOutputStream.putNextEntry(zipEntry);
            FileInputStream fileInputStream = new FileInputStream(file2);
            byte[] bArr = new byte[ETagPayloadStore.CHUNK_CHARS];
            while (true) {
                int i12 = fileInputStream.read(bArr);
                if (i12 != -1) {
                    jarOutputStream.write(bArr, 0, i12);
                }
            }
            fileInputStream.close();
            jarOutputStream.closeEntry();
        }
        jarOutputStream.close();
    }

    public Builder deleteJniFiles(boolean z10) {
        this.deleteJniFiles = z10;
        return this;
    }

    public Builder encoding(String str) {
        this.encoding = str;
        return this;
    }

    public Builder environmentVariables(Map<String, String> map) {
        this.environmentVariables = map;
        return this;
    }

    public int executeCommand(List<String> list, File file, Map<String, String> map) {
        String strN;
        boolean zStartsWith = Loader.getPlatform().startsWith("windows");
        int i10 = 0;
        while (true) {
            strN = "";
            if (i10 >= list.size()) {
                break;
            }
            String str = list.get(i10);
            strN = str != null ? str : "";
            if (strN.trim().isEmpty() && zStartsWith) {
                strN = "\"\"";
            }
            list.set(i10, strN);
            i10++;
        }
        for (String str2 : list) {
            boolean z10 = str2.indexOf(StringUtils.SPACE) > 0 || str2.isEmpty();
            if (z10) {
                StringBuilder sbO = AbstractC0112b.o(strN);
                sbO.append(zStartsWith ? "\"" : "'");
                strN = sbO.toString();
            }
            String strN2 = p.n(strN, str2);
            if (z10) {
                StringBuilder sbO2 = AbstractC0112b.o(strN2);
                sbO2.append(zStartsWith ? "\"" : "'");
                strN2 = sbO2.toString();
            }
            strN = p.n(strN2, StringUtils.SPACE);
        }
        this.logger.info(strN);
        ProcessBuilder processBuilder = new ProcessBuilder(list);
        if (file != null) {
            processBuilder.directory(file);
        }
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    processBuilder.environment().put(entry.getKey(), entry.getValue());
                }
            }
        }
        return processBuilder.inheritIO().start().waitFor();
    }

    public Builder generate(boolean z10) {
        this.generate = z10;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:104:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:107:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:109:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:110:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:113:0x03e9  */
    /* JADX WARN: Instruction removed from duplicated block: B:109:0x03b0, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:110:0x03d0, please report this as an issue */
    public File[] generateAndCompile(Class[] clsArr, String str, boolean z10, boolean z11) throws IOException {
        URI uri;
        ClassProperties classProperties;
        String str2;
        File file;
        File file2;
        String[] strArr;
        int i10;
        int i11;
        File[] fileArr;
        int iCompile;
        int i12;
        File file3 = this.outputDirectory;
        File canonicalFile = file3 != null ? file3.getCanonicalFile() : null;
        ClassProperties classPropertiesLoadProperties = Loader.loadProperties(clsArr, this.properties, true);
        String property = this.properties.getProperty(DeviceDimensionProvider.KEY_PLATFORM);
        String property2 = this.properties.getProperty("platform.extension");
        String str3 = "";
        String str4 = canonicalFile != null ? canonicalFile.getPath() + File.separator : "";
        String property3 = classPropertiesLoadProperties.getProperty("platform.source.suffix", ".cpp");
        String property4 = classPropertiesLoadProperties.getProperty("platform.library.path", "");
        String property5 = classPropertiesLoadProperties.getProperty("platform.library.prefix", "");
        int i13 = 1;
        String property6 = classPropertiesLoadProperties.getProperty("platform.library.suffix", "");
        File file4 = canonicalFile;
        String[] strArr2 = {str4, str4};
        if (file4 == null) {
            try {
                try {
                    String str5 = "/" + clsArr[0].getName().replace(com.amazon.a.a.o.c.a.b.f16463a, '/') + ".class";
                    String string = Loader.findResource(clsArr[0], str5).toString();
                    String strSubstring = string.substring(0, string.lastIndexOf(47) + 1);
                    int i14 = 1;
                    while (i14 < clsArr.length) {
                        StringBuilder sb = new StringBuilder();
                        int i15 = i14;
                        sb.append('/');
                        ClassProperties classProperties2 = classPropertiesLoadProperties;
                        String str6 = str3;
                        sb.append(clsArr[i15].getName().replace(com.amazon.a.a.o.c.a.b.f16463a, '/'));
                        sb.append(".class");
                        String string2 = Loader.findResource(clsArr[i15], sb.toString()).toString();
                        String strSubstring2 = string2.substring(0, string2.lastIndexOf(47) + 1);
                        String str7 = strSubstring2.length() > strSubstring.length() ? strSubstring2 : strSubstring;
                        if (strSubstring2.length() < strSubstring.length()) {
                            strSubstring = strSubstring2;
                        }
                        while (!str7.startsWith(strSubstring) && strSubstring.lastIndexOf(47) > 0) {
                            strSubstring = strSubstring.substring(0, strSubstring.lastIndexOf(47));
                        }
                        i14 = i15 + 1;
                        classPropertiesLoadProperties = classProperties2;
                        str3 = str6;
                    }
                    classProperties = classPropertiesLoadProperties;
                    str2 = str3;
                    URI uri2 = new URI(strSubstring);
                    try {
                        boolean zEquals = "file".equals(uri2.getScheme());
                        File canonicalFile2 = new File(this.classScanner.getClassLoader().getPaths()[0]).getCanonicalFile();
                        File file5 = zEquals ? new File(uri2) : new File(canonicalFile2, str5.substring(0, str5.lastIndexOf(47) + 1));
                        URI uri3 = new URI(string.substring(0, (string.length() - str5.length()) + 1));
                        try {
                            if (property4.length() > 0) {
                                file = zEquals ? new File(uri3) : canonicalFile2;
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(property);
                                sb2.append(property2 != null ? property2 : str2);
                                file = new File(file5, sb2.toString());
                            }
                            file2 = new File(file, property4);
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(file5.getPath());
                            String str8 = File.separator;
                            sb3.append(str8);
                            strArr = new String[]{canonicalFile2.getPath() + str8, sb3.toString()};
                        } catch (IllegalArgumentException e2) {
                            e = e2;
                            uri = uri3;
                            throw new RuntimeException("URI: " + uri, e);
                        }
                    } catch (IllegalArgumentException e4) {
                        e = e4;
                        uri = uri2;
                    }
                } catch (IllegalArgumentException e7) {
                    e = e7;
                    uri = null;
                }
            } catch (URISyntaxException e10) {
                throw new RuntimeException(e10);
            }
        } else {
            classProperties = classPropertiesLoadProperties;
            str2 = "";
            strArr = strArr2;
            file2 = file4;
        }
        if (!file2.exists()) {
            file2.mkdirs();
        }
        Generator generator = new Generator(this.logger, this.properties, this.encoding);
        String[] strArr3 = {p.r(new StringBuilder(), strArr[0], "jnijavacpp", property3), p.r(new StringBuilder(), strArr[1], str, property3)};
        String[] strArr4 = {null, this.header ? p.r(new StringBuilder(), strArr[1], str, ".h") : null};
        String[] strArr5 = {"_jnijavacpp", null};
        String[] strArr6 = {null, "_jnijavacpp"};
        String property7 = System.getProperty("java.class.path");
        String[] paths = this.classScanner.getClassLoader().getPaths();
        int length = paths.length;
        String strM = property7;
        int i16 = 0;
        while (i16 < length) {
            strM = b.m(AbstractC0112b.o(strM), File.pathSeparator, paths[i16]);
            i16++;
            strArr4 = strArr4;
            generator = generator;
        }
        String[] strArr7 = strArr4;
        Generator generator2 = generator;
        String[] strArr8 = {null, strM};
        Class<?>[][] clsArr2 = {null, clsArr};
        String[] strArr9 = {p.B(property5, "jnijavacpp", property6), p.B(property5, str, property6)};
        for (int i17 = 0; i17 < 2; i17++) {
            if (i17 != 0 || z10) {
                this.logger.info("Generating " + strArr3[i17]);
                if (!generator2.generate(strArr3[i17], strArr7[i17], strArr5[i17], strArr6[i17], strArr8[i17], clsArr2[i17])) {
                    this.logger.info("Nothing generated for " + strArr3[i17]);
                    return null;
                }
            }
        }
        if (!this.compile) {
            File[] fileArr2 = new File[2];
            for (int i18 = 0; i18 < 2; i18++) {
                fileArr2[i18] = new File(strArr3[i18]);
            }
            return fileArr2;
        }
        String lowerCase = this.properties.getProperty("platform.library.static", com.amazon.a.a.o.b.ag).toLowerCase();
        if (!lowerCase.equals(com.amazon.a.a.o.b.af) && !lowerCase.equals("t")) {
            if (lowerCase.equals(str2)) {
                i11 = 2;
                i10 = 0;
            } else {
                String str9 = strArr9[1];
                this.logger.info("Compiling " + file2.getPath() + File.separator + str9);
                iCompile = compile(strArr3, str9, classProperties, file2);
                i13 = 1;
                fileArr = new File[]{new File(file2, str9)};
            }
            if (iCompile == 0) {
                throw new RuntimeException(b.j(iCompile, "Process exited with an error: "));
            }
            for (i12 = i13; i12 >= 0; i12--) {
                if (i12 == 0 || z11) {
                    if (this.deleteJniFiles) {
                        this.logger.info("Deleting " + strArr3[i12]);
                        new File(strArr3[i12]).delete();
                    } else {
                        this.logger.info("Keeping " + strArr3[i12]);
                    }
                }
            }
            return fileArr;
        }
        i10 = 0;
        i11 = 2;
        File[] fileArr3 = new File[i11];
        int i19 = i10;
        while (i10 == 0 && i19 < i11) {
            if (i19 != 0 || z10) {
                this.logger.info("Compiling " + file2.getPath() + File.separator + strArr9[i19]);
                int iCompile2 = compile(new String[]{strArr3[i19]}, strArr9[i19], classProperties, file2);
                fileArr3[i19] = new File(file2, strArr9[i19]);
                i10 = iCompile2;
            }
            i19++;
            i11 = 2;
        }
        fileArr = fileArr3;
        iCompile = i10;
        if (iCompile == 0) {
            throw new RuntimeException(b.j(iCompile, "Process exited with an error: "));
        }
        while (i12 >= 0) {
            if (i12 == 0) {
                if (this.deleteJniFiles) {
                    this.logger.info("Deleting " + strArr3[i12]);
                    new File(strArr3[i12]).delete();
                } else {
                    this.logger.info("Keeping " + strArr3[i12]);
                }
            } else if (this.deleteJniFiles) {
                this.logger.info("Deleting " + strArr3[i12]);
                new File(strArr3[i12]).delete();
            } else {
                this.logger.info("Keeping " + strArr3[i12]);
            }
        }
        return fileArr;
    }

    public Builder header(boolean z10) {
        this.header = z10;
        return this;
    }

    public void includeJavaPaths(ClassProperties classProperties, boolean z10) {
        if (classProperties.getProperty(DeviceDimensionProvider.KEY_PLATFORM, "").startsWith(BackendEvent.Workflows.Context.WORKFLOW_CONTEXT_PLATFORM)) {
            return;
        }
        String platform = Loader.getPlatform();
        final String str = classProperties.getProperty("platform.link.prefix", "") + "jvm" + classProperties.getProperty("platform.link.suffix", "");
        final String str2 = classProperties.getProperty("platform.library.prefix", "") + "jvm" + classProperties.getProperty("platform.library.suffix", "");
        final String[] strArr = new String[2];
        final String[] strArr2 = new String[2];
        FilenameFilter filenameFilter = new FilenameFilter() { // from class: org.bytedeco.javacpp.tools.Builder.1
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str3) {
                if (new File(file, "jni.h").exists()) {
                    strArr[0] = file.getAbsolutePath();
                }
                if (new File(file, "jni_md.h").exists()) {
                    strArr[1] = file.getAbsolutePath();
                }
                if (new File(file, str).exists()) {
                    strArr2[0] = file.getAbsolutePath();
                }
                if (new File(file, str2).exists()) {
                    strArr2[1] = file.getAbsolutePath();
                }
                return new File(file, str3).isDirectory();
            }
        };
        try {
            ArrayList arrayList = new ArrayList(Arrays.asList(new File(System.getProperty("java.home")).getParentFile().getCanonicalFile().listFiles(filenameFilter)));
            while (true) {
                if (arrayList.isEmpty()) {
                    break;
                }
                File file = (File) arrayList.remove(arrayList.size() - 1);
                String path = file.getPath();
                File[] fileArrListFiles = file.listFiles(filenameFilter);
                if (path != null && fileArrListFiles != null) {
                    int length = fileArrListFiles.length;
                    for (int i10 = 0; i10 < length; i10++) {
                        File canonicalFile = fileArrListFiles[i10];
                        try {
                            canonicalFile = canonicalFile.getCanonicalFile();
                        } catch (IOException unused) {
                        }
                        if (!path.startsWith(canonicalFile.getPath())) {
                            arrayList.add(canonicalFile);
                        }
                    }
                }
            }
            String str3 = strArr[0];
            if (str3 != null && str3.equals(strArr[1])) {
                strArr[1] = null;
            } else if (strArr[0] == null && new File("/System/Library/Frameworks/JavaVM.framework/Headers/").isDirectory()) {
                strArr[0] = "/System/Library/Frameworks/JavaVM.framework/Headers/";
            }
            String str4 = strArr2[0];
            if (str4 != null && str4.equals(strArr2[1])) {
                strArr2[1] = null;
            }
            classProperties.addAll("platform.includepath", strArr);
            if (platform.equals(classProperties.getProperty(DeviceDimensionProvider.KEY_PLATFORM, platform))) {
                if (z10) {
                    classProperties.get("platform.link").add(0, "jvm");
                    classProperties.addAll("platform.linkpath", strArr2);
                }
                if (platform.startsWith("macosx")) {
                    classProperties.addAll("platform.framework", "JavaVM");
                }
            }
        } catch (IOException | NullPointerException e2) {
            this.logger.warn("Could not include header files from java.home:" + e2);
        }
    }

    public Builder jarPrefix(String str) {
        this.jarPrefix = str;
        return this;
    }

    public Builder outputDirectory(String str) {
        outputDirectory(str == null ? null : new File(str));
        return this;
    }

    public Builder outputName(String str) {
        this.outputName = str;
        return this;
    }

    public File parse(String[] strArr, Class cls) {
        return new Parser(this.logger, this.properties, this.encoding, null).parse(this.outputDirectory, strArr, cls);
    }

    public Builder properties(String str) {
        if (str != null) {
            this.properties = Loader.loadProperties(str, null);
        }
        return this;
    }

    public Builder property(String str) {
        int iIndexOf = str.indexOf(61);
        if (iIndexOf < 0) {
            iIndexOf = str.indexOf(58);
        }
        property(str.substring(2, iIndexOf), str.substring(iIndexOf + 1));
        return this;
    }

    public Builder propertyFile(String str) throws IOException {
        propertyFile(str == null ? null : new File(str));
        return this;
    }

    public Builder workingDirectory(String str) {
        workingDirectory(str == null ? null : new File(str));
        return this;
    }

    public Builder(Logger logger) {
        this.encoding = null;
        this.outputDirectory = null;
        this.outputName = null;
        this.jarPrefix = null;
        this.generate = true;
        this.compile = true;
        this.deleteJniFiles = true;
        this.header = false;
        this.copyLibs = false;
        this.copyResources = false;
        this.properties = null;
        this.classScanner = null;
        this.buildCommand = null;
        this.workingDirectory = null;
        this.environmentVariables = null;
        this.compilerOptions = null;
        this.logger = logger;
        System.setProperty("org.bytedeco.javacpp.loadlibraries", com.amazon.a.a.o.b.ag);
        this.properties = Loader.loadProperties();
        this.classScanner = new ClassScanner(logger, new ArrayList(), new UserClassLoader(Thread.currentThread().getContextClassLoader()));
        this.compilerOptions = new ArrayList();
    }

    public Builder classPaths(String... strArr) {
        this.classScanner.getClassLoader().addPaths(strArr);
        return this;
    }

    public Builder outputDirectory(File file) {
        this.outputDirectory = file;
        return this;
    }

    public Builder properties(Properties properties) {
        if (properties != null) {
            for (Map.Entry entry : properties.entrySet()) {
                property((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return this;
    }

    public Builder propertyFile(File file) throws IOException {
        if (file == null) {
            return this;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        Properties properties = new Properties();
        this.properties = properties;
        try {
            properties.load(new InputStreamReader(fileInputStream));
        } catch (NoSuchMethodError unused) {
            this.properties.load(fileInputStream);
        }
        fileInputStream.close();
        return this;
    }

    public Builder workingDirectory(File file) {
        this.workingDirectory = file;
        return this;
    }

    public Builder property(String str, String str2) {
        if (str.length() > 0 && str2.length() > 0) {
            this.properties.put(str, str2);
        }
        return this;
    }

    public Builder compile(boolean z10) {
        this.compile = z10;
        return this;
    }
}
