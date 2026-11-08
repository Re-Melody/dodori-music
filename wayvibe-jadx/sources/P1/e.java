package P1;

import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f9519a = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CharSequence charSequence, String type) {
        super(charSequence != null ? charSequence.toString() : null);
        m.f(type, "type");
    }
}
