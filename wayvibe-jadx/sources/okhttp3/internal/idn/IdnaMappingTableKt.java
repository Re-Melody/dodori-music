package okhttp3.internal.idn;

import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class IdnaMappingTableKt {
    public static final int a(int i10, String str) {
        m.f(str, "<this>");
        char cCharAt = str.charAt(i10);
        return (cCharAt << 7) + str.charAt(i10 + 1);
    }
}
