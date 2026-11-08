package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class I {
    public static D a(long j10, Object obj) {
        D d10 = (D) n0.f18472c.i(j10, obj);
        if (((AbstractC1181b) d10).f18411a) {
            return d10;
        }
        int size = d10.size();
        D dE = d10.e(size == 0 ? 10 : size * 2);
        n0.p(obj, j10, dE);
        return dE;
    }
}
