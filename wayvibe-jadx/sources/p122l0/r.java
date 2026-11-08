package p122l0;

import F0.AbstractC0388f;
import F0.AbstractC0395m;
import F0.InterfaceC0394l;
import W.d;
import Z8.c;
import p067g0.q;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f21915b = new r();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f21916c = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f21917a = new d(new s[16]);

    public final boolean a(c cVar) {
        if (this == f21915b) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        if (this == f21916c) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        d dVar = this.f21917a;
        if (!dVar.m()) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
        }
        int i10 = dVar.f12758c;
        if (i10 <= 0) {
            return false;
        }
        Object[] objArr = dVar.f12756a;
        int i11 = 0;
        boolean z10 = false;
        do {
            InterfaceC0394l interfaceC0394l = (s) objArr[i11];
            if (!((q) interfaceC0394l).getNode().isAttached()) {
                throw new IllegalStateException("visitChildren called on an unattached node");
            }
            d dVar2 = new d(new q[16]);
            q qVar = (q) interfaceC0394l;
            q child$ui_release = qVar.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                AbstractC0388f.b(dVar2, qVar.getNode());
            } else {
                dVar2.b(child$ui_release);
            }
            while (dVar2.m()) {
                q qVarF = (q) dVar2.o(dVar2.f12758c - 1);
                if ((qVarF.getAggregateChildKindSet$ui_release() & 1024) == 0) {
                    AbstractC0388f.b(dVar2, qVarF);
                } else {
                    while (qVarF != null) {
                        if ((qVarF.getKindSet$ui_release() & 1024) != 0) {
                            d dVar3 = null;
                            while (qVarF != null) {
                                if (qVarF instanceof y) {
                                    y yVar = (y) qVarF;
                                    if (yVar.o0().f21904a ? ((Boolean) cVar.invoke(yVar)).booleanValue() : f.j(yVar, 7, cVar)) {
                                        z10 = true;
                                        break;
                                    }
                                } else if (((qVarF.getKindSet$ui_release() & 1024) != 0) && (qVarF instanceof AbstractC0395m)) {
                                    int i12 = 0;
                                    for (q child$ui_release2 = ((AbstractC0395m) qVarF).f3813b; child$ui_release2 != null; child$ui_release2 = child$ui_release2.getChild$ui_release()) {
                                        if ((child$ui_release2.getKindSet$ui_release() & 1024) != 0) {
                                            i12++;
                                            if (i12 == 1) {
                                                qVarF = child$ui_release2;
                                            } else {
                                                if (dVar3 == null) {
                                                    dVar3 = new d(new q[16]);
                                                }
                                                if (qVarF != null) {
                                                    dVar3.b(qVarF);
                                                    qVarF = null;
                                                }
                                                dVar3.b(child$ui_release2);
                                            }
                                        }
                                    }
                                    if (i12 == 1) {
                                    }
                                }
                                qVarF = AbstractC0388f.f(dVar3);
                            }
                            break;
                        }
                        qVarF = qVarF.getChild$ui_release();
                    }
                }
            }
            i11++;
        } while (i11 < i10);
        return z10;
    }
}
