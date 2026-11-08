package p261z;

import M8.D;
import R8.a;
import S8.c;
import com.apple.android.music.playback.model.MediaPlayerException;
import p028c1.b;
import t9.d;

/* JADX INFO: renamed from: z.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2397d0 implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f29566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f29567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f29568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f29569d = new d();

    public C2397d0(b bVar) {
        this.f29566a = bVar;
    }

    @Override // p028c1.b
    public final float B(float f10) {
        return this.f29566a.B(f10);
    }

    @Override // p028c1.b
    public final float K() {
        return this.f29566a.K();
    }

    @Override // p028c1.b
    public final float O(float f10) {
        return this.f29566a.O(f10);
    }

    @Override // p028c1.b
    public final int Y(float f10) {
        return this.f29566a.Y(f10);
    }

    @Override // p028c1.b
    public final float a() {
        return this.f29566a.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(c cVar) {
        C2393b0 c2393b0;
        C2397d0 c2397d0;
        if (cVar instanceof C2393b0) {
            c2393b0 = (C2393b0) cVar;
            int i10 = c2393b0.f29549d;
            if ((i10 & MediaPlayerException.ERROR_UNKNOWN) != 0) {
                c2393b0.f29549d = i10 - MediaPlayerException.ERROR_UNKNOWN;
            } else {
                c2393b0 = new C2393b0(this, cVar);
            }
        } else {
            c2393b0 = new C2393b0(this, cVar);
        }
        Object obj = c2393b0.f29547b;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = c2393b0.f29549d;
        if (i11 == 0) {
            Q5.b.T(obj);
            c2393b0.f29546a = this;
            c2393b0.f29549d = 1;
            if (this.f29569d.c(c2393b0) == aVar) {
                return aVar;
            }
            c2397d0 = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2397d0 = c2393b0.f29546a;
            Q5.b.T(obj);
        }
        c2397d0.f29567b = false;
        c2397d0.f29568c = false;
        return D.f8402a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(c cVar) {
        C2395c0 c2395c0;
        C2397d0 c2397d0;
        if (cVar instanceof C2395c0) {
            c2395c0 = (C2395c0) cVar;
            int i10 = c2395c0.f29557d;
            if ((i10 & MediaPlayerException.ERROR_UNKNOWN) != 0) {
                c2395c0.f29557d = i10 - MediaPlayerException.ERROR_UNKNOWN;
            } else {
                c2395c0 = new C2395c0(this, cVar);
            }
        } else {
            c2395c0 = new C2395c0(this, cVar);
        }
        Object obj = c2395c0.f29555b;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = c2395c0.f29557d;
        if (i11 == 0) {
            Q5.b.T(obj);
            if (this.f29567b || this.f29568c) {
                c2397d0 = this;
            } else {
                c2395c0.f29554a = this;
                c2395c0.f29557d = 1;
                if (this.f29569d.c(c2395c0) == aVar) {
                    return aVar;
                }
                c2397d0 = this;
            }
            return Boolean.valueOf(c2397d0.f29567b);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c2397d0 = c2395c0.f29554a;
        Q5.b.T(obj);
        c2397d0.f29569d.e(null);
        return Boolean.valueOf(c2397d0.f29567b);
    }

    @Override // p028c1.b
    public final long g0(long j10) {
        return this.f29566a.g0(j10);
    }

    @Override // p028c1.b
    public final long i(float f10) {
        return this.f29566a.i(f10);
    }

    @Override // p028c1.b
    public final float i0(long j10) {
        return this.f29566a.i0(j10);
    }

    @Override // p028c1.b
    public final long j(long j10) {
        return this.f29566a.j(j10);
    }

    @Override // p028c1.b
    public final float p(long j10) {
        return this.f29566a.p(j10);
    }

    @Override // p028c1.b
    public final long y(float f10) {
        return this.f29566a.y(f10);
    }

    @Override // p028c1.b
    public final float z(int i10) {
        return this.f29566a.z(i10);
    }
}
