package G0;

import android.view.PointerIcon;
import android.view.View;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import p262z0.C2441a;

/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final T f5121a = new T();

    public final void a(View view, p262z0.n nVar) {
        PointerIcon systemIcon = nVar instanceof C2441a ? PointerIcon.getSystemIcon(view.getContext(), ((C2441a) nVar).f29733b) : PointerIcon.getSystemIcon(view.getContext(), PipesIterator.DEFAULT_QUEUE_SIZE);
        if (kotlin.jvm.internal.m.b(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
