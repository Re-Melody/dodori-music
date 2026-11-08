package E2;

import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CharSequence charSequence, String type) {
        super(charSequence != null ? charSequence.toString() : null);
        m.f(type, "type");
    }
}
