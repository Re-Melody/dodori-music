package B8;

import D8.x2;
import java.nio.charset.Charset;
import java.util.BitSet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f736a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final B6.c f737b = e0.f797e;

    public static c0 a(String str, x2 x2Var) {
        boolean z10 = false;
        if (!str.isEmpty() && str.charAt(0) == ':') {
            z10 = true;
        }
        BitSet bitSet = b0.f770d;
        return new c0(str, z10, x2Var);
    }
}
