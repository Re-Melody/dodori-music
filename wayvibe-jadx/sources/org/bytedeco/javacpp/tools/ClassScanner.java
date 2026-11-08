package org.bytedeco.javacpp.tools;

import B2.AbstractC0112b;
import V0.p;
import com.amazon.a.a.o.c.a.b;
import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.jar.JarInputStream;
import java.util.zip.ZipEntry;

/* JADX INFO: loaded from: classes2.dex */
class ClassScanner {
    final Collection<Class> classes;
    final UserClassLoader loader;
    final Logger logger;

    public ClassScanner(Logger logger, Collection<Class> collection, UserClassLoader userClassLoader) {
        this.logger = logger;
        this.classes = collection;
        this.loader = userClassLoader;
    }

    public void addClass(String str) {
        if (str == null) {
            return;
        }
        if (str.endsWith(".class")) {
            str = p.i(6, 0, str);
        }
        addClass(Class.forName(str, false, this.loader));
    }

    public void addClassOrPackage(String str) {
        if (str == null) {
            return;
        }
        String strReplace = str.replace('/', b.f16463a);
        if (strReplace.endsWith(".**")) {
            addPackage(p.i(3, 0, strReplace), true);
        } else if (strReplace.endsWith(".*")) {
            addPackage(p.i(2, 0, strReplace), false);
        } else {
            addClass(strReplace);
        }
    }

    public void addMatchingDir(String str, File file, String str2, boolean z10) {
        String string;
        File[] fileArrListFiles = file.listFiles();
        Arrays.sort(fileArrListFiles);
        for (File file2 : fileArrListFiles) {
            if (str == null) {
                string = file2.getName();
            } else {
                StringBuilder sbO = AbstractC0112b.o(str);
                sbO.append(file2.getName());
                string = sbO.toString();
            }
            if (file2.isDirectory()) {
                addMatchingDir(p.n(string, "/"), file2, str2, z10);
            } else {
                addMatchingFile(string, str2, z10);
            }
        }
    }

    public void addMatchingFile(String str, String str2, boolean z10) {
        if (str == null || !str.endsWith(".class")) {
            return;
        }
        if (str2 == null || ((z10 && str.startsWith(str2)) || str.regionMatches(0, str2, 0, Math.max(str.lastIndexOf(47), str2.lastIndexOf(47))))) {
            addClass(str.replace('/', b.f16463a));
        }
    }

    public void addPackage(String str, boolean z10) {
        String[] paths = this.loader.getPaths();
        String str2 = str == null ? null : str.replace(b.f16463a, '/') + "/";
        int size = this.classes.size();
        for (String str3 : paths) {
            File file = new File(str3);
            if (file.isDirectory()) {
                addMatchingDir(null, file, str2, z10);
            } else {
                JarInputStream jarInputStream = new JarInputStream(new FileInputStream(file));
                for (ZipEntry nextEntry = jarInputStream.getNextEntry(); nextEntry != null; nextEntry = jarInputStream.getNextEntry()) {
                    addMatchingFile(nextEntry.getName(), str2, z10);
                    jarInputStream.closeEntry();
                }
                jarInputStream.close();
            }
        }
        if (this.classes.size() == 0 && str == null) {
            this.logger.warn("No classes found in the unnamed package");
            Builder.printHelp();
        } else {
            if (size != this.classes.size() || str == null) {
                return;
            }
            this.logger.warn("No classes found in package ".concat(str));
        }
    }

    public UserClassLoader getClassLoader() {
        return this.loader;
    }

    public Collection<Class> getClasses() {
        return this.classes;
    }

    public void addClass(Class cls) {
        if (this.classes.contains(cls)) {
            return;
        }
        this.classes.add(cls);
    }
}
