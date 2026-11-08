package Y7;

import com.google.android.play.core.install.zza;
import p150n8.o;
import p161o8.h;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f13387b;

    public /* synthetic */ b(f fVar, int i10) {
        this.f13386a = i10;
        this.f13387b = fVar;
    }

    public final void a(zza zzaVar) {
        switch (this.f13386a) {
            case 0:
                h hVar = this.f13387b.f13399d;
                if (hVar != null) {
                    hVar.c(Integer.valueOf(zzaVar.f18236a));
                }
                break;
            default:
                f fVar = this.f13387b;
                h hVar2 = fVar.f13399d;
                int i10 = zzaVar.f18236a;
                if (hVar2 != null) {
                    hVar2.c(Integer.valueOf(i10));
                }
                if (i10 != 11) {
                    int i11 = zzaVar.f18239d;
                    if (i11 != 0) {
                        o oVar = fVar.f13401f;
                        if (oVar != null) {
                            oVar.d(null, "Error during installation", String.valueOf(i11));
                        }
                        fVar.f13401f = null;
                    }
                } else {
                    o oVar2 = fVar.f13401f;
                    if (oVar2 != null) {
                        oVar2.b(null);
                    }
                    fVar.f13401f = null;
                }
                break;
        }
    }
}
