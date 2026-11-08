package Y7;

import android.location.Location;
import com.google.android.gms.tasks.OnFailureListener;
import kotlin.jvm.internal.m;
import p050e5.o;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements OnFailureListener, p042d5.a, o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p150n8.o f13392b;

    public /* synthetic */ d(p150n8.o oVar, int i10) {
        this.f13391a = i10;
        this.f13392b = oVar;
    }

    @Override // p050e5.o
    public void a(Location location) {
        this.f13392b.b(p206t6.b.i0(location));
    }

    @Override // p042d5.a
    public void b(p042d5.b bVar) {
        switch (this.f13391a) {
            case 2:
                this.f13392b.d(null, bVar.toString(), bVar.f());
                break;
            default:
                this.f13392b.d(null, bVar.toString(), bVar.f());
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception it) {
        m.f(it, "it");
        this.f13392b.d(null, "TASK_FAILURE", it.getMessage());
    }
}
