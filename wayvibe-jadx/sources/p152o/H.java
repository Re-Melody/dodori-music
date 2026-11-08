package p152o;

import p142n.B;

/* JADX INFO: loaded from: classes.dex */
public final class H extends AbstractViewOnTouchListenerC2167x0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ N f23220j;
    public final /* synthetic */ Q k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(Q q5, Q q9, N n6) {
        super(q9);
        this.k = q5;
        this.f23220j = n6;
    }

    @Override // p152o.AbstractViewOnTouchListenerC2167x0
    public final B b() {
        return this.f23220j;
    }

    @Override // p152o.AbstractViewOnTouchListenerC2167x0
    public final boolean c() {
        Q q5 = this.k;
        if (q5.getInternalPopup().b()) {
            return true;
        }
        q5.f23264f.l(q5.getTextDirection(), q5.getTextAlignment());
        return true;
    }
}
