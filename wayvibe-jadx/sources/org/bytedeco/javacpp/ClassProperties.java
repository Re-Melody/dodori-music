package org.bytedeco.javacpp;

import V0.p;
import com.amazon.a.a.o.c.a.b;
import com.revenuecat.purchases.common.localrules.DeviceDimensionProvider;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bytedeco.javacpp.annotation.Platform;
import org.bytedeco.javacpp.annotation.Properties;

/* JADX INFO: loaded from: classes2.dex */
public class ClassProperties extends HashMap<String, List<String>> {
    String[] defaultNames;
    List<Class> effectiveClasses;
    List<Class> inheritedClasses;
    boolean loaded;
    String pathSeparator;
    String platform;
    String platformExtension;
    String platformRoot;

    public ClassProperties() {
        this.defaultNames = new String[0];
        this.inheritedClasses = null;
        this.effectiveClasses = null;
        this.loaded = false;
    }

    public void addAll(String str, String... strArr) {
        if (strArr != null) {
            addAll(str, Arrays.asList(strArr));
        }
    }

    public List<String> get(String str) {
        List<String> list = (List) super.get((Object) str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        put(str, arrayList);
        return arrayList;
    }

    public List<Class> getEffectiveClasses() {
        return this.effectiveClasses;
    }

    public List<Class> getInheritedClasses() {
        return this.inheritedClasses;
    }

    public String getProperty(String str) {
        return getProperty(str, null);
    }

    public boolean isLoaded() {
        return this.loaded;
    }

    public void load(Class cls, boolean z10) {
        Platform[] platformArrValue;
        String str;
        String[] strArr;
        int i10;
        boolean z11;
        Class enclosingClass = Loader.getEnclosingClass(cls);
        ArrayList arrayList = new ArrayList();
        arrayList.add(0, enclosingClass);
        while (!enclosingClass.isAnnotationPresent(Properties.class) && !enclosingClass.isAnnotationPresent(Platform.class) && enclosingClass.getSuperclass() != null && enclosingClass.getSuperclass() != Object.class && enclosingClass.getSuperclass() != Pointer.class) {
            enclosingClass = enclosingClass.getSuperclass();
            arrayList.add(0, enclosingClass);
        }
        if (this.effectiveClasses == null) {
            this.effectiveClasses = arrayList;
        }
        Properties properties = (Properties) enclosingClass.getAnnotation(Properties.class);
        if (properties == null) {
            Platform platform = (Platform) enclosingClass.getAnnotation(Platform.class);
            platformArrValue = platform != null ? new Platform[]{platform} : null;
        } else {
            Class[] clsArrInherit = properties.inherit();
            if (z10 && clsArrInherit != null) {
                if (this.inheritedClasses == null) {
                    this.inheritedClasses = new ArrayList();
                }
                for (Class cls2 : clsArrInherit) {
                    load(cls2, z10);
                    if (!this.inheritedClasses.contains(cls2)) {
                        this.inheritedClasses.add(cls2);
                    }
                }
            }
            String strTarget = properties.target();
            if (strTarget.length() > 0) {
                addAll("target", strTarget);
            }
            String strGlobal = properties.global();
            if (strGlobal.length() != 0) {
                strTarget = (strTarget.length() <= 0 || strGlobal.startsWith(strTarget)) ? strGlobal : p.B(strTarget, ".", strGlobal);
            }
            if (strTarget.length() > 0) {
                addAll("global", strTarget);
            }
            String strHelper = properties.helper();
            if (strHelper.length() > 0) {
                addAll("helper", strHelper);
            }
            String[] strArrNames = properties.names();
            if (strArrNames.length > 0) {
                this.defaultNames = strArrNames;
            }
            platformArrValue = properties.value();
        }
        String[] strArr2 = new String[0];
        String[] strArr3 = new String[0];
        String[] strArr4 = new String[0];
        String[] strArr5 = new String[0];
        String[] strArr6 = new String[0];
        String[] strArr7 = new String[0];
        String[] strArrIncluderesource = new String[0];
        String[] strArr8 = new String[0];
        String[] strArr9 = new String[0];
        String[] strArr10 = new String[0];
        String[] strArr11 = new String[0];
        String[] strArr12 = new String[0];
        String[] strArr13 = new String[0];
        String[] strArr14 = new String[0];
        String[] strArr15 = new String[0];
        String[] strArr16 = new String[0];
        String[] strArrResourcepath = new String[0];
        String[] strArr17 = new String[0];
        String[] strArr18 = new String[0];
        String strConcat = "jni".concat(enclosingClass.getSimpleName());
        List<String> list = get("global");
        if (list == null || list.size() <= 0) {
            str = strConcat;
        } else {
            String str2 = list.get(list.size() - 1);
            str = "jni" + str2.substring(str2.lastIndexOf(46) + 1);
        }
        Platform[] platformArr = platformArrValue != null ? platformArrValue : new Platform[0];
        int length = platformArr.length;
        String[] strArrCinclude = strArr6;
        String[] strArrLinkpath = strArr9;
        String[] strArrIncludepath = strArr7;
        String[] strArrCompiler = strArr8;
        String[] strArrPreload = strArr16;
        String[] strArrResource = strArr17;
        String[] strArr19 = strArr15;
        String[] strArr20 = strArr18;
        String[] strArrPreloadpath = strArr14;
        String strLibrary = str;
        String[] strArrPragma = strArr2;
        Platform[] platformArr2 = platformArrValue;
        String[] strArrExclude = strArr4;
        String[] strArrLinkresource = strArr10;
        String[] strArrLink = strArr11;
        String[] strArrFrameworkpath = strArr12;
        Platform[] platformArr3 = platformArr;
        String[] strArrDefine = strArr3;
        String[] strArrFramework = strArr13;
        Class cls3 = enclosingClass;
        String[] strArrInclude = strArr5;
        int i11 = 0;
        while (i11 < length) {
            Platform platform2 = platformArr3[i11];
            int i12 = length;
            int i13 = i11;
            String[][] strArr21 = {platform2.value().length > 0 ? platform2.value() : this.defaultNames, platform2.not()};
            boolean[] zArr = new boolean[2];
            zArr[0] = false;
            zArr[1] = false;
            int i14 = 0;
            for (int i15 = 2; i14 < i15; i15 = 2) {
                String[] strArr22 = strArr21[i14];
                int i16 = i14;
                int length2 = strArr22.length;
                int i17 = 0;
                while (i17 < length2) {
                    int i18 = length2;
                    int i19 = i17;
                    if (this.platform.startsWith(strArr22[i17])) {
                        zArr[i16] = true;
                        break;
                    } else {
                        i17 = i19 + 1;
                        length2 = i18;
                    }
                }
                i14 = i16 + 1;
            }
            if ((strArr21[0].length == 0 || zArr[0]) && (strArr21[1].length == 0 || !zArr[1])) {
                boolean z12 = platform2.extension().length == 0 || (Loader.isLoadLibraries() && this.platformExtension == null);
                String[] strArrExtension = platform2.extension();
                boolean z13 = z12;
                int length3 = strArrExtension.length;
                int i20 = 0;
                while (true) {
                    if (i20 >= length3) {
                        z11 = z13;
                        break;
                    }
                    int i21 = length3;
                    String str3 = strArrExtension[i20];
                    int i22 = i20;
                    String str4 = this.platformExtension;
                    if (str4 != null && str4.length() > 0 && this.platformExtension.endsWith(str3)) {
                        z11 = true;
                        break;
                    } else {
                        i20 = i22 + 1;
                        length3 = i21;
                    }
                }
                if (z11) {
                    if (platform2.pragma().length > 0) {
                        strArrPragma = platform2.pragma();
                    }
                    if (platform2.define().length > 0) {
                        strArrDefine = platform2.define();
                    }
                    if (platform2.exclude().length > 0) {
                        strArrExclude = platform2.exclude();
                    }
                    if (platform2.include().length > 0) {
                        strArrInclude = platform2.include();
                    }
                    if (platform2.cinclude().length > 0) {
                        strArrCinclude = platform2.cinclude();
                    }
                    if (platform2.includepath().length > 0) {
                        strArrIncludepath = platform2.includepath();
                    }
                    if (platform2.includeresource().length > 0) {
                        strArrIncluderesource = platform2.includeresource();
                    }
                    if (platform2.compiler().length > 0) {
                        strArrCompiler = platform2.compiler();
                    }
                    if (platform2.linkpath().length > 0) {
                        strArrLinkpath = platform2.linkpath();
                    }
                    if (platform2.linkresource().length > 0) {
                        strArrLinkresource = platform2.linkresource();
                    }
                    if (platform2.link().length > 0) {
                        strArrLink = platform2.link();
                    }
                    if (platform2.frameworkpath().length > 0) {
                        strArrFrameworkpath = platform2.frameworkpath();
                    }
                    if (platform2.framework().length > 0) {
                        strArrFramework = platform2.framework();
                    }
                    String[] strArrPreloadresource = platform2.preloadresource().length > 0 ? platform2.preloadresource() : strArr19;
                    if (platform2.preloadpath().length > 0) {
                        strArrPreloadpath = platform2.preloadpath();
                    }
                    if (platform2.preload().length > 0) {
                        strArrPreload = platform2.preload();
                    }
                    if (platform2.resourcepath().length > 0) {
                        strArrResourcepath = platform2.resourcepath();
                    }
                    if (platform2.resource().length > 0) {
                        strArrResource = platform2.resource();
                    }
                    String[] strArrExtension2 = platform2.extension().length > 0 ? platform2.extension() : strArr20;
                    if (platform2.library().length() > 0) {
                        strLibrary = platform2.library();
                    }
                    strArr20 = strArrExtension2;
                    strArr19 = strArrPreloadresource;
                }
            }
            i11 = i13 + 1;
            length = i12;
        }
        int i23 = 0;
        while (true) {
            strArr = strArrFramework;
            if (i23 >= strArrIncluderesource.length) {
                break;
            }
            String str5 = strArrIncluderesource[i23];
            if (str5.startsWith("/")) {
                i10 = i23;
                strArrLinkpath = strArrLinkpath;
            } else {
                i10 = i23;
                String strReplace = cls.getName().replace(b.f16463a, '/');
                int iLastIndexOf = strReplace.lastIndexOf(47);
                if (iLastIndexOf >= 0) {
                    str5 = strReplace.substring(0, iLastIndexOf + 1) + str5;
                }
                strArrIncluderesource[i10] = p134m1.b.k("/", str5);
            }
            i23 = i10 + 1;
            strArrFramework = strArr;
            strArrFrameworkpath = strArrFrameworkpath;
            strArrLink = strArrLink;
            strArrLinkpath = strArrLinkpath;
        }
        String[] strArr23 = strArrFrameworkpath;
        String[] strArr24 = strArrLinkpath;
        String[] strArr25 = strArrLink;
        int i24 = 0;
        while (i24 < strArrLinkresource.length) {
            String str6 = strArrLinkresource[i24];
            if (str6.startsWith("/")) {
                i24 = i24;
            } else {
                String strReplace2 = cls.getName().replace(b.f16463a, '/');
                int iLastIndexOf2 = strReplace2.lastIndexOf(47);
                if (iLastIndexOf2 >= 0) {
                    str6 = strReplace2.substring(0, iLastIndexOf2 + 1) + str6;
                }
                strArrLinkresource[i24] = p134m1.b.k("/", str6);
            }
            i24++;
        }
        addAll("platform.pragma", strArrPragma);
        addAll("platform.define", strArrDefine);
        addAll("platform.exclude", strArrExclude);
        addAll("platform.include", strArrInclude);
        addAll("platform.cinclude", strArrCinclude);
        addAll("platform.includepath", strArrIncludepath);
        addAll("platform.includeresource", strArrIncluderesource);
        addAll("platform.compiler.*", strArrCompiler);
        addAll("platform.linkpath", strArr24);
        addAll("platform.linkresource", strArrLinkresource);
        addAll("platform.link", strArr25);
        addAll("platform.frameworkpath", strArr23);
        addAll("platform.framework", strArr);
        addAll("platform.preloadresource", strArr19);
        addAll("platform.preloadpath", strArrPreloadpath);
        addAll("platform.preload", strArrPreload);
        addAll("platform.resourcepath", strArrResourcepath);
        addAll("platform.resource", strArrResource);
        addAll("platform.extension", strArr20);
        setProperty("platform.library", strLibrary);
        try {
            if (LoadEnabled.class.isAssignableFrom(cls3)) {
                ((LoadEnabled) cls3.newInstance()).init(this);
            }
        } catch (ClassCastException | IllegalAccessException | InstantiationException unused) {
        }
        if (platformArr2 == null || platformArr2.length <= 0) {
            return;
        }
        this.loaded = true;
    }

    public String setProperty(String str, String str2) {
        List<String> list = get(str);
        String str3 = list.isEmpty() ? null : list.get(0);
        list.clear();
        addAll(str, str2);
        return str3;
    }

    public void addAll(String str, Collection<String> collection) {
        if (collection != null) {
            String str2 = (str.equals("platform.compiler") || str.equals("platform.sysroot") || str.equals("platform.toolchain") || str.equals("platform.includepath") || str.equals("platform.linkpath")) ? this.platformRoot : null;
            List<String> list = get(str);
            Iterator<String> it = collection.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next != null) {
                    if (str2 != null && !new File(next).isAbsolute() && new File(str2.concat(next)).exists()) {
                        next = str2.concat(next);
                    }
                    if (!list.contains(next)) {
                        list.add(next);
                    }
                }
            }
        }
    }

    public String getProperty(String str, String str2) {
        List<String> list = get(str);
        return list.isEmpty() ? str2 : list.get(0);
    }

    public ClassProperties(java.util.Properties properties) {
        this.defaultNames = new String[0];
        this.inheritedClasses = null;
        this.effectiveClasses = null;
        this.loaded = false;
        this.platform = properties.getProperty(DeviceDimensionProvider.KEY_PLATFORM);
        this.platformExtension = properties.getProperty("platform.extension");
        this.platformRoot = properties.getProperty("platform.root");
        this.pathSeparator = properties.getProperty("platform.path.separator");
        String str = this.platformRoot;
        if (str == null || str.length() == 0) {
            this.platformRoot = ".";
        }
        String str2 = this.platformRoot;
        String str3 = File.separator;
        if (!str2.endsWith(str3)) {
            this.platformRoot = p134m1.b.m(new StringBuilder(), this.platformRoot, str3);
        }
        for (Map.Entry entry : properties.entrySet()) {
            String str4 = (String) entry.getKey();
            String str5 = (String) entry.getValue();
            if (str5 != null && str5.length() != 0) {
                if (!str4.equals("platform.includepath") && !str4.equals("platform.includeresource") && !str4.equals("platform.include") && !str4.equals("platform.linkpath") && !str4.equals("platform.linkresource") && !str4.equals("platform.link") && !str4.equals("platform.preloadpath") && !str4.equals("platform.preloadresource") && !str4.equals("platform.preload") && !str4.equals("platform.resourcepath") && !str4.equals("platform.resource") && !str4.equals("platform.frameworkpath") && !str4.equals("platform.framework") && !str4.equals("platform.library.suffix") && !str4.equals("platform.extension")) {
                    setProperty(str4, str5);
                } else {
                    addAll(str4, str5.split(this.pathSeparator));
                }
            }
        }
    }
}
