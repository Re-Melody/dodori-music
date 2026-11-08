package P;

import U.C0880d;
import U.C0891i0;
import U.U;
import com.apple.android.music.playback.model.MediaPlayerException;
import p119k9.C2036u;
import p119k9.F;
import p230w.AbstractC2272e;
import p230w.C2271d;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p133m0.c f9422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f9423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Float f9425d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p133m0.c f9426e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C2271d f9427f = AbstractC2272e.a(0.0f);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C2271d f9428g = AbstractC2272e.a(0.0f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C2271d f9429h = AbstractC2272e.a(0.0f);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C2036u f9430i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0891i0 f9431j;
    public final C0891i0 k;

    public p(p133m0.c cVar, float f10, boolean z10) {
        this.f9422a = cVar;
        this.f9423b = f10;
        this.f9424c = z10;
        C2036u c2036u = new C2036u(true);
        c2036u.E(null);
        this.f9430i = c2036u;
        Boolean bool = Boolean.FALSE;
        U u10 = U.f11815f;
        this.f9431j = C0880d.K(bool, u10);
        this.k = C0880d.K(bool, u10);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0083  */
    /* JADX WARN: Code duplicated, block: B:35:0x0087 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(S8.c cVar) throws Throwable {
        i iVar;
        p pVar;
        Object objH;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i10 = iVar.f9409d;
            if ((i10 & MediaPlayerException.ERROR_UNKNOWN) != 0) {
                iVar.f9409d = i10 - MediaPlayerException.ERROR_UNKNOWN;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        Object obj = iVar.f9407b;
        R8.a aVar = R8.a.COROUTINE_SUSPENDED;
        int i11 = iVar.f9409d;
        M8.D d10 = M8.D.f8402a;
        if (i11 == 0) {
            Q5.b.T(obj);
            iVar.f9406a = this;
            iVar.f9409d = 1;
            Object objH2 = F.h(new m(this, null), iVar);
            if (objH2 != aVar) {
                objH2 = d10;
            }
            if (objH2 != aVar) {
                pVar = this;
            }
            return aVar;
        }
        if (i11 == 1) {
            pVar = iVar.f9406a;
            Q5.b.T(obj);
        } else {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.b.T(obj);
                return d10;
            }
            pVar = iVar.f9406a;
            Q5.b.T(obj);
        }
        iVar.f9406a = null;
        iVar.f9409d = 3;
        pVar.getClass();
        objH = F.h(new o(pVar, null), iVar);
        if (objH != aVar) {
            objH = d10;
        }
        if (objH != aVar) {
            return aVar;
        }
        return d10;
        pVar.f9431j.setValue(Boolean.TRUE);
        iVar.f9406a = pVar;
        iVar.f9409d = 2;
        if (pVar.f9430i.m(iVar) != aVar) {
            iVar.f9406a = null;
            iVar.f9409d = 3;
            pVar.getClass();
            objH = F.h(new o(pVar, null), iVar);
            if (objH != aVar) {
                objH = d10;
            }
            if (objH != aVar) {
                return d10;
            }
        }
        return aVar;
    }
}
