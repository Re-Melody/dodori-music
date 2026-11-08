package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1180a f18425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f18427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18428d;

    public d0(AbstractC1180a abstractC1180a, String str, Object[] objArr) {
        this.f18425a = abstractC1180a;
        this.f18426b = str;
        this.f18427c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f18428d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.f18428d = i10 | (cCharAt2 << i12);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            }
        }
    }

    public final a0 a() {
        int i10 = this.f18428d;
        if ((i10 & 1) != 0) {
            return a0.PROTO2;
        }
        return (i10 & 4) == 4 ? a0.EDITIONS : a0.PROTO3;
    }
}
