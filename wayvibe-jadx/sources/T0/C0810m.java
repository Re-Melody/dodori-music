package T0;

import U.C0880d;
import U.C0891i0;
import U.Y0;
import com.apple.android.music.playback.model.MediaPlayerException;
import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import java.util.List;
import java.util.concurrent.CancellationException;
import p119k9.C2041z;

/* JADX INFO: renamed from: T0.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0810m implements Y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f11521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W f11522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.support.v4.media.session.t f11523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Z8.c f11524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0802e f11525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0891i0 f11526f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f11527g = true;

    public C0810m(List list, Object obj, W w10, android.support.v4.media.session.t tVar, Z8.c cVar, C0802e c0802e) {
        this.f11521a = list;
        this.f11522b = w10;
        this.f11523c = tVar;
        this.f11524d = cVar;
        this.f11525e = c0802e;
        this.f11526f = C0880d.K(obj, U.U.f11815f);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006a A[Catch: all -> 0x003b, TRY_ENTER, TryCatch #2 {all -> 0x003b, blocks: (B:13:0x0036, B:28:0x006a, B:30:0x0076), top: B:56:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0076 A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #2 {all -> 0x003b, blocks: (B:13:0x0036, B:28:0x006a, B:30:0x0076), top: B:56:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0092  */
    /* JADX WARN: Code duplicated, block: B:35:0x009b A[Catch: all -> 0x0059, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0059, blocks: (B:35:0x009b, B:37:0x00a9, B:41:0x00c5, B:20:0x0050), top: B:54:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c5 A[Catch: all -> 0x0059, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0059, blocks: (B:35:0x009b, B:37:0x00a9, B:41:0x00c5, B:20:0x0050), top: B:54:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0074 -> B:46:0x00da). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00d8 -> B:45:0x00d9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(S8.c r18) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: T0.C0810m.a(S8.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(InterfaceC0816t interfaceC0816t, S8.c cVar) {
        C0808k c0808k;
        if (cVar instanceof C0808k) {
            c0808k = (C0808k) cVar;
            int i10 = c0808k.f11517d;
            if ((i10 & MediaPlayerException.ERROR_UNKNOWN) != 0) {
                c0808k.f11517d = i10 - MediaPlayerException.ERROR_UNKNOWN;
            } else {
                c0808k = new C0808k(this, cVar);
            }
        } else {
            c0808k = new C0808k(this, cVar);
        }
        Object obj = c0808k.f11515b;
        R8.a aVar = R8.a.COROUTINE_SUSPENDED;
        int i11 = c0808k.f11517d;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                InterfaceC0816t interfaceC0816t2 = c0808k.f11514a;
                Q5.b.T(obj);
                return obj;
            }
            Q5.b.T(obj);
            C0809l c0809l = new C0809l(this, interfaceC0816t, null);
            c0808k.f11514a = interfaceC0816t;
            c0808k.f11517d = 1;
            Object objI = p119k9.F.I(HTTPTimeoutManager.MAIN_SOURCE_NO_FALLBACK_TIMEOUT_MS, c0809l, c0808k);
            return objI == aVar ? aVar : objI;
        } catch (CancellationException e2) {
            if (!p119k9.F.s(c0808k.getContext())) {
                throw e2;
            }
            return null;
        } catch (Exception e4) {
            p119k9.A a10 = (p119k9.A) c0808k.getContext().get(C2041z.f21792a);
            if (a10 != null) {
                c0808k.getContext();
                a10.e(new IllegalStateException("Unable to load font " + interfaceC0816t, e4));
            }
            return null;
        }
    }

    @Override // U.Y0
    public final Object getValue() {
        return this.f11526f.getValue();
    }
}
