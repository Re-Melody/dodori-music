package K1;

import androidx.lifecycle.AbstractC1121p;
import androidx.lifecycle.InterfaceC1123s;

/* JADX INFO: renamed from: K1.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0611m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1121p f7318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC1123s f7319b;

    public C0611m(AbstractC1121p abstractC1121p, InterfaceC1123s interfaceC1123s) {
        this.f7318a = abstractC1121p;
        this.f7319b = interfaceC1123s;
        abstractC1121p.addObserver(interfaceC1123s);
    }
}
