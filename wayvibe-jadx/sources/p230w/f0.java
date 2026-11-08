package p230w;

import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public interface f0 {
    default boolean a(Enum r10, Enum r11) {
        return m.b(r10, b()) && m.b(r11, c());
    }

    Object b();

    Object c();
}
