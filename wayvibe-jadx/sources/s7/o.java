package s7;

import com.google.android.gms.tasks.Tasks;
import p152o.h1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h1 f26222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C8.d f26223c;

    public /* synthetic */ o(h1 h1Var, C8.d dVar, int i10) {
        this.f26221a = i10;
        this.f26222b = h1Var;
        this.f26223c = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26221a) {
            case 0:
                this.f26222b.d(this.f26223c);
                break;
            case 1:
                h1 h1Var = this.f26222b;
                h1Var.getClass();
                p207t7.r.a("GrpcCallProvider", "connectivityAttemptTimer elapsed. Resetting the channel.", new Object[0]);
                if (((p150n8.a) h1Var.f23360e) != null) {
                    p207t7.r.a("GrpcCallProvider", "Clearing the connectivityAttemptTimer", new Object[0]);
                    ((p150n8.a) h1Var.f23360e).U();
                    h1Var.f23360e = null;
                }
                ((p207t7.g) h1Var.f23358c).a(new o(h1Var, this.f26223c, 4));
                break;
            case 2:
                h1 h1Var2 = this.f26222b;
                h1Var2.getClass();
                ((p207t7.g) h1Var2.f23358c).a(new o(h1Var2, this.f26223c, 3));
                break;
            case 3:
                this.f26222b.d(this.f26223c);
                break;
            default:
                h1 h1Var3 = this.f26222b;
                h1Var3.getClass();
                this.f26223c.z();
                h1Var3.f23357b = Tasks.call(p207t7.m.f26936c, new T3.f(h1Var3, 2));
                break;
        }
    }
}
