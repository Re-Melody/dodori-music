package com.apple.android.music.playback.c.a;

import B2.AbstractC0112b;
import android.net.Uri;
import android.util.LruCache;
import com.apple.android.music.playback.c.d;
import com.apple.android.music.playback.model.PlayerMediaItem;
import com.apple.android.music.playback.model.h;
import com.apple.android.music.playback.model.i;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import p199t.C2230e;

/* JADX INFO: loaded from: classes.dex */
public final class a implements d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f17027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, File> f17028b = Collections.synchronizedMap(new C2230e(0));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, File> f17029c = Collections.synchronizedMap(new C2230e(0));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f17030d;

    /* JADX INFO: renamed from: com.apple.android.music.playback.c.a.a$a, reason: collision with other inner class name */
    public static final class C0013a implements Comparator<File> {
        private C0013a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            if (file == null && file2 == null) {
                return 0;
            }
            if (file == null) {
                return -1;
            }
            if (file2 == null) {
                return 1;
            }
            long jLastModified = file.lastModified();
            long jLastModified2 = file2.lastModified();
            if (jLastModified < jLastModified2) {
                return -1;
            }
            return jLastModified == jLastModified2 ? 0 : 1;
        }
    }

    public static final class b implements FilenameFilter {
        private b() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.endsWith(".nfo");
        }
    }

    public a(d dVar) throws Throwable {
        this.f17027a = dVar;
        long jD = dVar.d();
        if (jD > 0) {
            this.f17030d = new c((int) jD);
            d();
        } else {
            this.f17030d = null;
            e();
        }
        dVar.a(this);
    }

    private void d() throws Throwable {
        File fileC = this.f17027a.c();
        if (fileC != null) {
            File[] fileArrListFiles = fileC.listFiles(new b());
            Arrays.sort(fileArrListFiles, new C0013a());
            for (File file : fileArrListFiles) {
                i iVarA = a(file);
                if (iVarA != null && iVarA.d() != -1) {
                    String strB = b(iVarA);
                    StringBuilder sbO = AbstractC0112b.o(strB);
                    sbO.append(iVarA.h());
                    File file2 = new File(fileC, sbO.toString());
                    this.f17028b.put(strB, file);
                    this.f17029c.put(strB, file2);
                    this.f17030d.put(strB, file2);
                } else if (iVarA != null) {
                    StringBuilder sbO2 = AbstractC0112b.o(b(iVarA));
                    sbO2.append(iVarA.h());
                    File file3 = new File(fileC, sbO2.toString());
                    file.delete();
                    file3.delete();
                }
            }
        }
    }

    private void e() {
        File fileC = this.f17027a.c();
        if (fileC != null) {
            for (File file : fileC.listFiles()) {
                file.delete();
            }
        }
    }

    public synchronized void c() {
        c cVar = this.f17030d;
        if (cVar == null) {
            return;
        }
        try {
            cVar.evictAll();
        } catch (IllegalStateException unused) {
        }
        this.f17028b.clear();
        this.f17029c.clear();
        e();
    }

    public synchronized boolean b(String str) {
        boolean z10 = false;
        if (this.f17030d == null) {
            return false;
        }
        File file = this.f17028b.get(str);
        if (file == null) {
            return false;
        }
        i iVarA = a(file);
        if (iVarA != null && a(iVarA)) {
            z10 = true;
        }
        return z10;
    }

    public synchronized i a(long j10, int i10, String str) {
        i iVarA;
        if (this.f17030d == null) {
            return null;
        }
        int iA = a(h.f17442a, str);
        for (int i11 = 0; i11 <= iA; i11++) {
            String strB = b(j10, i10, h.f17442a[i11]);
            File file = this.f17028b.get(strB);
            if (file != null && (iVarA = a(file)) != null && a(iVarA)) {
                iVarA.d(Uri.fromFile(a(strB)).toString());
                return iVarA;
            }
        }
        return null;
    }

    public final class c extends LruCache<String, File> {
        public c(int i10) {
            super(i10);
        }

        @Override // android.util.LruCache
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void entryRemoved(boolean z10, String str, File file, File file2) {
            if (z10 || !(file == null || file.equals(file2))) {
                file.delete();
                File file3 = (File) a.this.f17028b.remove(str);
                if (file3 != null) {
                    file3.delete();
                }
                a.this.f17029c.remove(str);
            }
        }

        @Override // android.util.LruCache
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, File file) {
            long length;
            i iVarA;
            File file2 = (File) a.this.f17028b.get(str);
            if (file2 != null && (iVarA = a.this.a(file2)) != null) {
                length = iVarA.d();
            } else {
                length = file.length();
            }
            return (int) length;
        }
    }

    @Override // com.apple.android.music.playback.c.d.a
    public void b() {
        synchronized (this) {
            try {
                int iD = (int) this.f17027a.d();
                if (iD > 0) {
                    this.f17030d = new c(iD);
                    d();
                } else {
                    c();
                    this.f17030d = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static String b(i iVar) {
        return b(iVar.a(), iVar.b(), iVar.c());
    }

    public synchronized File a(String str) {
        try {
            if (this.f17030d == null) {
                return null;
            }
            File file = this.f17028b.get(str);
            File file2 = this.f17029c.get(str);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (file != null) {
                file.setLastModified(jCurrentTimeMillis);
            }
            if (file2 != null) {
                file2.setLastModified(jCurrentTimeMillis);
            }
            return file2;
        } catch (Throwable th) {
            throw th;
        }
    }

    private static String b(long j10, int i10, String str) {
        return j10 + "_" + i10 + "_" + str;
    }

    public synchronized boolean b(PlayerMediaItem playerMediaItem) {
        if (this.f17030d == null) {
            return false;
        }
        if (!playerMediaItem.f()) {
            return false;
        }
        try {
            long j10 = Long.parseLong(playerMediaItem.a());
            if (j10 == 0) {
                return false;
            }
            String[] strArr = h.f17442a;
            int iB = playerMediaItem.b();
            if (iB == 1) {
                return b(j10, 2, strArr) || b(j10, 6, strArr);
            }
            if (iB == 2) {
                return b(j10, 1, strArr) || b(j10, 2, strArr) || a(j10, 6, strArr);
            }
            if (iB != 3) {
                return false;
            }
            return b(j10, 3, strArr);
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public synchronized boolean a(PlayerMediaItem playerMediaItem) {
        if (this.f17030d == null) {
            return false;
        }
        if (!playerMediaItem.f()) {
            return false;
        }
        try {
            long j10 = Long.parseLong(playerMediaItem.a());
            if (j10 == 0) {
                return false;
            }
            String[] strArr = h.f17442a;
            int iB = playerMediaItem.b();
            if (iB == 1) {
                return a(j10, 2, strArr) || a(j10, 6, strArr);
            }
            if (iB == 2) {
                return a(j10, 1, strArr) || a(j10, 2, strArr) || a(j10, 6, strArr);
            }
            if (iB != 3) {
                return false;
            }
            return a(j10, 3, strArr);
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    @Override // com.apple.android.music.playback.c.d.a
    public void a() {
    }

    private synchronized boolean b(long j10, int i10, String[] strArr) {
        try {
            if (this.f17030d == null) {
                return false;
            }
            boolean z10 = false;
            for (String str : strArr) {
                String strB = b(j10, i10, str);
                File file = this.f17028b.get(strB);
                if (file != null) {
                    i iVarA = a(file);
                    boolean z11 = true;
                    if (iVarA != null) {
                        String strB2 = b(iVarA);
                        File file2 = this.f17029c.get(strB2);
                        if (file2 != null && file2.length() > 0 && file2.delete()) {
                            file2.getName();
                            z10 = true;
                        }
                        this.f17029c.remove(strB2);
                    }
                    if (file.length() <= 0 || !file.delete()) {
                        z11 = z10;
                    } else {
                        file.getName();
                    }
                    this.f17028b.remove(strB);
                    z10 = z11;
                }
            }
            return z10;
        } catch (Throwable th) {
            throw th;
        }
    }

    private boolean a(i iVar) {
        File file = this.f17029c.get(b(iVar));
        return (iVar == null || file == null || file.length() != iVar.d()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public i a(File file) throws Throwable {
        FileInputStream fileInputStream;
        i iVar = new i();
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                iVar.a(new FileInputStream(file));
                try {
                    fileInputStream.close();
                } catch (IOException unused) {
                }
                return iVar;
            } catch (IOException unused2) {
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (IOException unused5) {
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static int a(String[] strArr, String str) {
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (strArr[i10].equals(str)) {
                return i10;
            }
        }
        return strArr.length - 1;
    }

    private synchronized boolean a(long j10, int i10, String[] strArr) {
        if (this.f17030d == null) {
            return false;
        }
        for (String str : strArr) {
            if (b(b(j10, i10, str))) {
                return true;
            }
        }
        return false;
    }
}
