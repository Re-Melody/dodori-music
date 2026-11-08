package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D f15465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15467c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ B f15468d;

    public A(B b10, D d10) {
        this.f15468d = b10;
        this.f15465a = d10;
    }

    public final void a(boolean z10) {
        if (z10 == this.f15466b) {
            return;
        }
        this.f15466b = z10;
        int i10 = z10 ? 1 : -1;
        B b10 = this.f15468d;
        int i11 = b10.f15471c;
        b10.f15471c = i10 + i11;
        if (!b10.f15472d) {
            b10.f15472d = true;
            while (true) {
                try {
                    int i12 = b10.f15471c;
                    if (i11 == i12) {
                        break;
                    }
                    boolean z11 = i11 == 0 && i12 > 0;
                    boolean z12 = i11 > 0 && i12 == 0;
                    if (z11) {
                        b10.e();
                    } else if (z12) {
                        b10.f();
                    }
                    i11 = i12;
                } catch (Throwable th) {
                    b10.f15472d = false;
                    throw th;
                }
            }
            b10.f15472d = false;
        }
        if (this.f15466b) {
            b10.c(this);
        }
    }

    public boolean d(InterfaceC1125u interfaceC1125u) {
        return false;
    }

    public abstract boolean e();

    public void b() {
    }
}
