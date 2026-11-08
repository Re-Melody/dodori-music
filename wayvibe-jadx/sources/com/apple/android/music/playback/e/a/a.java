package com.apple.android.music.playback.e.a;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f17250a = "a";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static a f17251e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f17252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<c> f17253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.apple.android.music.playback.d.a f17254d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Context f17255f;

    private a(Context context) throws Throwable {
        this.f17255f = context;
        com.apple.android.music.playback.d.a aVarA = com.apple.android.music.playback.d.a.a(context);
        this.f17254d = aVarA;
        this.f17252b = aVarA.b();
        b(context);
    }

    public static a a(Context context) {
        a aVar;
        synchronized (a.class) {
            try {
                if (f17251e == null) {
                    f17251e = new a(context);
                }
                aVar = f17251e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    private void b(Context context) throws Throwable {
        ObjectInputStream objectInputStream = null;
        try {
            try {
                ObjectInputStream objectInputStream2 = new ObjectInputStream(new FileInputStream(new File(context.getFilesDir(), "eq_config")));
                try {
                    objectInputStream2.readInt();
                    int i10 = objectInputStream2.readInt();
                    if (i10 > 0) {
                        this.f17253c = new ArrayList(i10);
                        for (int i11 = 0; i11 < i10; i11++) {
                            this.f17253c.add((c) objectInputStream2.readObject());
                        }
                    }
                    objectInputStream2.close();
                } catch (IOException unused) {
                    objectInputStream = objectInputStream2;
                    if (objectInputStream == null) {
                        return;
                    }
                    objectInputStream.close();
                } catch (ClassNotFoundException unused2) {
                    objectInputStream = objectInputStream2;
                    if (objectInputStream == null) {
                        return;
                    }
                    objectInputStream.close();
                } catch (Throwable th) {
                    th = th;
                    objectInputStream = objectInputStream2;
                    if (objectInputStream != null) {
                        try {
                            objectInputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused4) {
            } catch (ClassNotFoundException unused5) {
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException unused6) {
        }
    }

    @Override // com.apple.android.music.playback.e.a.b
    public boolean c() {
        return this.f17252b == -1;
    }

    @Override // com.apple.android.music.playback.e.a.b
    public boolean d() {
        return this.f17254d.a();
    }

    @Override // com.apple.android.music.playback.e.a.b
    public int e() {
        return this.f17254d.c();
    }

    @Override // com.apple.android.music.playback.e.a.b
    public int a() {
        return this.f17252b;
    }

    @Override // com.apple.android.music.playback.e.a.b
    public List<c> b() {
        return this.f17253c;
    }
}
