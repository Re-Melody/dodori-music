package p135m2;

import androidx.fragment.app.F;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f22207a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(F fragment, String str) {
        super(str);
        m.f(fragment, "fragment");
        this.f22207a = fragment;
    }
}
