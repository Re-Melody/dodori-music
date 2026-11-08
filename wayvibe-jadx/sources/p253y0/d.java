package p253y0;

import F0.AbstractC0388f;
import R8.a;
import S8.c;
import Z0.b;
import com.apple.android.music.playback.model.MediaPlayerException;
import kotlin.jvm.internal.n;
import p028c1.o;
import p119k9.C;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f28735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f28736b = new b(this, 17);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C f28737c;

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(long j10, long j11, c cVar) {
        b bVar;
        long j12;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i10 = bVar.f28731c;
            if ((i10 & MediaPlayerException.ERROR_UNKNOWN) != 0) {
                bVar.f28731c = i10 - MediaPlayerException.ERROR_UNKNOWN;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        b bVar2 = bVar;
        Object objZ = bVar2.f28729a;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = bVar2.f28731c;
        if (i11 == 0) {
            Q5.b.T(objZ);
            g gVar = this.f28735a;
            g gVar2 = null;
            if (gVar != null && gVar.isAttached()) {
                gVar2 = (g) AbstractC0388f.k(gVar);
            }
            if (gVar2 != null) {
                bVar2.f28731c = 1;
                objZ = gVar2.Z(j10, j11, bVar2);
                if (objZ == aVar) {
                    return aVar;
                }
            } else {
                j12 = 0;
            }
            return new o(j12);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Q5.b.T(objZ);
        j12 = ((o) objZ).f15864a;
        return new o(j12);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(long j10, c cVar) {
        c cVar2;
        long j11;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i10 = cVar2.f28734c;
            if ((i10 & MediaPlayerException.ERROR_UNKNOWN) != 0) {
                cVar2.f28734c = i10 - MediaPlayerException.ERROR_UNKNOWN;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objP = cVar2.f28732a;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = cVar2.f28734c;
        if (i11 == 0) {
            Q5.b.T(objP);
            g gVar = this.f28735a;
            g gVar2 = null;
            if (gVar != null && gVar.isAttached()) {
                gVar2 = (g) AbstractC0388f.k(gVar);
            }
            if (gVar2 != null) {
                cVar2.f28734c = 1;
                objP = gVar2.P(j10, cVar2);
                if (objP == aVar) {
                    return aVar;
                }
            } else {
                j11 = 0;
            }
            return new o(j11);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Q5.b.T(objP);
        j11 = ((o) objP).f15864a;
        return new o(j11);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Z8.a, kotlin.jvm.internal.n] */
    public final C c() {
        C c3 = (C) this.f28736b.invoke();
        if (c3 != null) {
            return c3;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }
}
