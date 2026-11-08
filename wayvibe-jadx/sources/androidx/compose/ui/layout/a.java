package androidx.compose.ui.layout;

import D0.InterfaceC0197x;
import D0.L;
import Z8.c;
import Z8.f;
import p067g0.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final Object a(L l10) {
        Object objJ = l10.J();
        InterfaceC0197x interfaceC0197x = objJ instanceof InterfaceC0197x ? (InterfaceC0197x) objJ : null;
        if (interfaceC0197x != null) {
            return interfaceC0197x.l();
        }
        return null;
    }

    public static final r b(r rVar, f fVar) {
        return rVar.then(new LayoutElement(fVar));
    }

    public static final r c(r rVar, String str) {
        return rVar.then(new LayoutIdElement(str));
    }

    public static final r d(r rVar, c cVar) {
        return rVar.then(new OnGloballyPositionedElement(cVar));
    }

    public static final r e(r rVar, c cVar) {
        return rVar.then(new OnSizeChangedModifier(cVar));
    }
}
