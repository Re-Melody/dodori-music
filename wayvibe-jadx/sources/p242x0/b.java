package p242x0;

import android.view.KeyEvent;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KeyEvent f28329a;

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return m.b(this.f28329a, ((b) obj).f28329a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f28329a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f28329a + ')';
    }
}
