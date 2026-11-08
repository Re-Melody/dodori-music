package org.bytedeco.javacpp.tools;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class UserClassLoader extends URLClassLoader {
    private List<String> paths;

    public UserClassLoader() {
        super(new URL[0]);
        this.paths = new ArrayList();
    }

    public void addPaths(String... strArr) {
        if (strArr == null) {
            return;
        }
        for (String str : strArr) {
            File file = new File(str);
            if (file.exists()) {
                this.paths.add(str);
                try {
                    addURL(file.toURI().toURL());
                } catch (MalformedURLException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
    }

    @Override // java.net.URLClassLoader, java.lang.ClassLoader
    public Class<?> findClass(String str) {
        if (this.paths.isEmpty()) {
            addPaths(System.getProperty("user.dir"));
        }
        return super.findClass(str);
    }

    public String[] getPaths() {
        if (this.paths.isEmpty()) {
            addPaths(System.getProperty("user.dir"));
        }
        List<String> list = this.paths;
        return (String[]) list.toArray(new String[list.size()]);
    }

    public UserClassLoader(ClassLoader classLoader) {
        super(new URL[0], classLoader);
        this.paths = new ArrayList();
    }
}
