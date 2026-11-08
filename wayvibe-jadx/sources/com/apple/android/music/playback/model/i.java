package com.apple.android.music.playback.model;

import android.util.SparseArray;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f17444a = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f17445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f17446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f17447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f17448e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f17449f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f17450g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private SparseArray<byte[]> f17451h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private SparseArray<byte[]> f17452i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private SparseArray<byte[]> f17453j;
    private String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f17454l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f17455m;

    public i() {
        this(0L, "HQ", 1);
    }

    public long a() {
        return this.f17445b;
    }

    public int b() {
        return this.f17446c;
    }

    public String c() {
        return this.f17447d;
    }

    public long d() {
        return this.f17448e;
    }

    public String e() {
        return this.k;
    }

    public String f() {
        return this.f17454l;
    }

    public boolean g() {
        return this.f17455m;
    }

    public String h() {
        return this.f17449f;
    }

    public String i() {
        return this.f17450g;
    }

    public i(long j10, String str, int i10) {
        this.f17448e = -1L;
        this.f17445b = j10;
        this.f17447d = str;
        this.f17446c = i10;
        this.f17455m = false;
        this.f17449f = ".m4p";
        this.f17451h = new SparseArray<>(1);
        this.f17452i = new SparseArray<>(1);
        this.f17453j = new SparseArray<>(1);
        this.k = "";
        this.f17454l = "";
    }

    public void a(int i10) {
        this.f17446c = i10;
    }

    public void b(String str) {
        this.f17454l = str;
    }

    public void c(String str) {
        this.f17449f = str;
    }

    public void d(String str) {
        this.f17450g = str;
    }

    public void a(long j10) {
        if (j10 > 0) {
            this.f17448e = j10;
        }
    }

    public void a(String str) {
        this.k = str;
    }

    public void a(boolean z10) {
        this.f17455m = z10;
    }

    public void a(int i10, byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            bArr = f17444a;
        }
        this.f17451h.put(i10, bArr);
        if (bArr2 == null) {
            bArr2 = f17444a;
        }
        this.f17452i.put(i10, bArr2);
    }

    public void a(InputStream inputStream) throws IOException {
        com.apple.android.music.playback.f.g gVarA = com.apple.android.music.playback.f.g.a(inputStream);
        this.f17445b = gVarA.a("store-id");
        this.f17446c = gVarA.a("protection-type", 0);
        this.f17447d = gVarA.b("flavor");
        this.f17448e = gVarA.a("file-size");
        this.f17449f = gVarA.b("file-extension");
        for (String str : gVarA.a()) {
            if (str.startsWith("s1-")) {
                this.f17451h.put(Integer.parseInt(str.substring(3)), gVarA.a(str, f17444a));
            } else if (str.startsWith("s2-")) {
                this.f17452i.put(Integer.parseInt(str.substring(3)), gVarA.a(str, f17444a));
            } else if (str.startsWith("dp-")) {
                this.f17453j.put(Integer.parseInt(str.substring(3)), gVarA.c(str));
            }
        }
    }
}
