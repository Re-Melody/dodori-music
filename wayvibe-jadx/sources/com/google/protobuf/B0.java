package com.google.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1230a f18656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f18658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18659d;

    public B0(AbstractC1230a abstractC1230a, String str, Object[] objArr) {
        this.f18656a = abstractC1230a;
        this.f18657b = str;
        this.f18658c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f18659d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.f18659d = i10 | (cCharAt2 << i12);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            }
        }
    }

    public final EnumC1278y0 a() {
        int i10 = this.f18659d;
        if ((i10 & 1) != 0) {
            return EnumC1278y0.PROTO2;
        }
        return (i10 & 4) == 4 ? EnumC1278y0.EDITIONS : EnumC1278y0.PROTO3;
    }
}
