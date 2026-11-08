package com.apple.android.music.playback.c.b;

import W4.e;
import android.net.Uri;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class b implements W4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f17082a = "b";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.apple.android.music.playback.c.d f17083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f17084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f17085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Uri f17086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Uri f17087f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f17088g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Uri f17089h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f17090i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f17091j;
    private byte[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f17092l;

    public b(com.apple.android.music.playback.c.d dVar, int i10, String str, Uri uri, Uri uri2, boolean z10) {
        this.f17083b = dVar;
        this.f17084c = i10;
        this.f17085d = str;
        this.f17086e = uri;
        this.f17087f = uri2;
        this.f17088g = z10;
    }

    @Override // W4.c
    public long a(e eVar) {
        String str = eVar.f12802e;
        this.f17089h = eVar.f12798a;
        int iLastIndexOf = str.lastIndexOf("fmtVer:");
        String str2 = eVar.f12802e;
        this.f17090i = str2.substring(4, iLastIndexOf);
        this.f17091j = str2.substring(iLastIndexOf + 7);
        Objects.toString(this.f17089h);
        this.k = null;
        return 0L;
    }

    @Override // W4.c
    public void b() {
    }

    @Override // W4.c
    public int a(byte[] bArr, int i10, int i11) {
        if (this.k == null) {
            Uri uri = this.f17086e;
            String string = uri != null ? uri.toString() : "";
            Uri uri2 = this.f17087f;
            String strA = com.apple.android.music.foothill.a.a().a(this.f17083b, this.f17085d, this.f17089h.toString(), this.f17090i, this.f17091j, string, uri2 != null ? uri2.toString() : "", this.f17088g);
            strA.length();
            this.k = strA.getBytes();
            this.f17092l = 0;
        }
        byte[] bArr2 = this.k;
        int length = bArr2.length - 1;
        int i12 = this.f17092l;
        if (length <= i12) {
            return -1;
        }
        int iMin = Math.min(bArr2.length - i12, i11);
        System.arraycopy(this.k, this.f17092l, bArr, i10, iMin);
        this.f17092l += iMin;
        return iMin;
    }

    @Override // W4.c
    public Uri a() {
        Objects.toString(this.f17089h);
        return this.f17089h;
    }
}
