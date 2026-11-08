package p224v4;

import B8.V;
import p185r4.c;
import p185r4.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f27508a = new c();

    public static final boolean a(i iVar) {
        int i10 = d.f27507a[iVar.f25927e.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            return true;
        }
        if (i10 == 3) {
            return iVar.f25945y.f25895a == null && (iVar.f25942v instanceof p195s4.c);
        }
        throw new V();
    }
}
