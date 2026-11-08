package L0;

import M8.D;
import P0.u;
import P0.z;
import com.apple.android.music.playback.model.MediaPlayerException;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f7461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f7462c;

    public j(int i10, e eVar) {
        this.f7460a = i10;
        this.f7462c = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    public float a(int i10, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        int i11 = 1;
        z zVar = (z) this.f7462c;
        if (z10) {
            int iC = u.c(zVar.f9508e, i10, z10);
            int lineStart = zVar.f9508e.getLineStart(iC);
            int iF = zVar.f(iC);
            if (i10 == lineStart || i10 == iF) {
                z13 = true;
            } else {
                z13 = false;
            }
        } else {
            z13 = false;
        }
        int i12 = i10 * 4;
        if (!z12) {
            i11 = z13 ? 2 : 3;
        } else if (z13) {
            i11 = 0;
        }
        int i13 = i12 + i11;
        if (this.f7460a == i13) {
            return this.f7461b;
        }
        float fH = z12 ? zVar.h(i10, z10) : zVar.i(i10, z10);
        if (z11) {
            this.f7460a = i13;
            this.f7461b = fH;
        }
        return fH;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(float f10, S8.c cVar) {
        i iVar;
        j jVar;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i10 = iVar.f7459d;
            if ((i10 & MediaPlayerException.ERROR_UNKNOWN) != 0) {
                iVar.f7459d = i10 - MediaPlayerException.ERROR_UNKNOWN;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        Object objInvoke = iVar.f7457b;
        R8.a aVar = R8.a.COROUTINE_SUSPENDED;
        int i11 = iVar.f7459d;
        if (i11 == 0) {
            Q5.b.T(objInvoke);
            Float f11 = new Float(f10);
            iVar.f7456a = this;
            iVar.f7459d = 1;
            objInvoke = ((e) this.f7462c).invoke(f11, iVar);
            if (objInvoke == aVar) {
                return aVar;
            }
            jVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar = iVar.f7456a;
            Q5.b.T(objInvoke);
        }
        jVar.f7461b += ((Number) objInvoke).floatValue();
        return D.f8402a;
    }

    public j(z zVar) {
        this.f7462c = zVar;
        this.f7460a = -1;
    }
}
