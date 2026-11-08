package p259y8;

import M8.D;
import Q5.b;
import R8.a;
import com.apple.android.music.playback.model.MediaPlayerException;
import p069g2.d;
import p151n9.InterfaceC2106h;

/* JADX INFO: renamed from: y8.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2362m implements InterfaceC2106h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2106h f29166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f29167c;

    public /* synthetic */ C2362m(InterfaceC2106h interfaceC2106h, d dVar, int i10) {
        this.f29165a = i10;
        this.f29166b = interfaceC2106h;
        this.f29167c = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p151n9.InterfaceC2106h
    public final Object emit(Object obj, Q8.d dVar) {
        C2361l c2361l;
        s sVar;
        w wVar;
        y yVar;
        switch (this.f29165a) {
            case 0:
                if (dVar instanceof C2361l) {
                    c2361l = (C2361l) dVar;
                    int i10 = c2361l.f29163b;
                    if ((i10 & MediaPlayerException.ERROR_UNKNOWN) != 0) {
                        c2361l.f29163b = i10 - MediaPlayerException.ERROR_UNKNOWN;
                    } else {
                        c2361l = new C2361l(this, dVar);
                    }
                } else {
                    c2361l = new C2361l(this, dVar);
                }
                Object obj2 = c2361l.f29162a;
                a aVar = a.COROUTINE_SUSPENDED;
                int i11 = c2361l.f29163b;
                if (i11 == 0) {
                    b.T(obj2);
                    Object objC = ((p069g2.b) obj).c(this.f29167c);
                    c2361l.f29163b = 1;
                    if (this.f29166b.emit(objC, c2361l) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b.T(obj2);
                }
                return D.f8402a;
            case 1:
                if (dVar instanceof s) {
                    sVar = (s) dVar;
                    int i12 = sVar.f29188b;
                    if ((i12 & MediaPlayerException.ERROR_UNKNOWN) != 0) {
                        sVar.f29188b = i12 - MediaPlayerException.ERROR_UNKNOWN;
                    } else {
                        sVar = new s(this, dVar);
                    }
                } else {
                    sVar = new s(this, dVar);
                }
                Object obj3 = sVar.f29187a;
                a aVar2 = a.COROUTINE_SUSPENDED;
                int i13 = sVar.f29188b;
                if (i13 == 0) {
                    b.T(obj3);
                    Object objC2 = ((p069g2.b) obj).c(this.f29167c);
                    sVar.f29188b = 1;
                    if (this.f29166b.emit(objC2, sVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b.T(obj3);
                }
                return D.f8402a;
            case 2:
                if (dVar instanceof w) {
                    wVar = (w) dVar;
                    int i14 = wVar.f29207b;
                    if ((i14 & MediaPlayerException.ERROR_UNKNOWN) != 0) {
                        wVar.f29207b = i14 - MediaPlayerException.ERROR_UNKNOWN;
                    } else {
                        wVar = new w(this, dVar);
                    }
                } else {
                    wVar = new w(this, dVar);
                }
                Object obj4 = wVar.f29206a;
                a aVar3 = a.COROUTINE_SUSPENDED;
                int i15 = wVar.f29207b;
                if (i15 == 0) {
                    b.T(obj4);
                    Object objC3 = ((p069g2.b) obj).c(this.f29167c);
                    wVar.f29207b = 1;
                    if (this.f29166b.emit(objC3, wVar) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b.T(obj4);
                }
                return D.f8402a;
            default:
                if (dVar instanceof y) {
                    yVar = (y) dVar;
                    int i16 = yVar.f29215b;
                    if ((i16 & MediaPlayerException.ERROR_UNKNOWN) != 0) {
                        yVar.f29215b = i16 - MediaPlayerException.ERROR_UNKNOWN;
                    } else {
                        yVar = new y(this, dVar);
                    }
                } else {
                    yVar = new y(this, dVar);
                }
                Object obj5 = yVar.f29214a;
                a aVar4 = a.COROUTINE_SUSPENDED;
                int i17 = yVar.f29215b;
                if (i17 == 0) {
                    b.T(obj5);
                    Object objC4 = ((p069g2.b) obj).c(this.f29167c);
                    yVar.f29215b = 1;
                    if (this.f29166b.emit(objC4, yVar) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b.T(obj5);
                }
                return D.f8402a;
        }
    }
}
