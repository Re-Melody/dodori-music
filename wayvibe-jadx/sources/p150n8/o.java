package p150n8;

import U.P;
import android.util.Log;
import p063f8.g;
import p161o8.p;
import p161o8.r;
import p161o8.s;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23011c;

    public /* synthetic */ o(int i10, Object obj, Object obj2) {
        this.f23009a = i10;
        this.f23011c = obj;
        this.f23010b = obj2;
    }

    @Override // p161o8.r
    public final void b(Object obj) {
        switch (this.f23009a) {
            case 0:
                ((P) this.f23011c).f11786c = (byte[]) this.f23010b;
                break;
            default:
                ((g) this.f23010b).a(((s) ((p) this.f23011c).f23830b).f23833c.b(obj));
                break;
        }
    }

    @Override // p161o8.r
    public final void c() {
        switch (this.f23009a) {
            case 0:
                break;
            default:
                ((g) this.f23010b).a(null);
                break;
        }
    }

    @Override // p161o8.r
    public final void d(Object obj, String str, String str2) {
        switch (this.f23009a) {
            case 0:
                Log.e("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
                break;
            default:
                ((g) this.f23010b).a(((s) ((p) this.f23011c).f23830b).f23833c.e(obj, str, str2));
                break;
        }
    }

    private final void a() {
    }
}
