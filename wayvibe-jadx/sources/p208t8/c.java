package p208t8;

import A6.B;
import B2.e;
import android.content.Context;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.concurrent.Executor;
import p023b7.d;
import p023b7.q;
import p023b7.r;
import p098j.u;
import p234w3.a;
import p234w3.h;
import p234w3.i;
import p241x.AbstractC2315s;
import p250x8.m;
import p268z7.b;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements OnCompleteListener, d, e, OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26958b;

    public /* synthetic */ c(Object obj, int i10) {
        this.f26957a = i10;
        this.f26958b = obj;
    }

    @Override // B2.e
    public void accept(Object obj) {
        a aVar = (a) obj;
        switch (this.f26957a) {
            case 3:
                i iVar = (i) this.f26958b;
                iVar.getClass();
                h hVar = new h(aVar.f27848b, u.d(aVar.f27847a, aVar.f27849c));
                iVar.f27862c.add(hVar);
                long j10 = iVar.f27869j;
                if (j10 == -9223372036854775807L || aVar.f27848b >= j10) {
                    iVar.a(hVar);
                }
                break;
            default:
                ((B) this.f26958b).a(aVar);
                break;
        }
    }

    @Override // p023b7.d
    public Object b(r rVar) {
        return new p217u7.c((Context) rVar.a(Context.class), ((W6.h) rVar.a(W6.h.class)).f(), rVar.f(q.a(p217u7.d.class)), rVar.d(b.class), (Executor) rVar.g((q) this.f26958b));
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        Object obj = this.f26958b;
        switch (this.f26957a) {
            case 0:
                HashMap map = d.f26959c;
                l lVar = (l) obj;
                if (!task.isSuccessful()) {
                    lVar.a(task.getException());
                } else {
                    lVar.c();
                }
                break;
            default:
                HashMap map2 = d.f26959c;
                k kVar = (k) obj;
                if (!task.isSuccessful()) {
                    kVar.a(task.getException());
                } else {
                    kVar.b(task.getResult());
                }
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        AbstractC2315s.e((m) this.f26958b, new p250x8.a(p250x8.c.AUTHORIZE_FAILURE, exc.getMessage(), null));
    }
}
