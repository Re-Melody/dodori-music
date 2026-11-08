package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1062u f15030b = new C1062u(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15031a;

    public J(C1053k c1053k) {
        A.a(c1053k, "output");
        this.f15031a = c1053k;
        c1053k.f15127a = this;
    }

    public void a(int i10, C1049g c1049g) {
        ((C1053k) this.f15031a).C0(i10, c1049g);
    }

    public void b(int i10, Object obj, c0 c0Var) {
        C1053k c1053k = (C1053k) this.f15031a;
        c1053k.N0(i10, 3);
        c0Var.d((AbstractC1043a) obj, c1053k.f15127a);
        c1053k.N0(i10, 4);
    }

    public J() {
        Z z10 = Z.f15060c;
        P p10 = f15030b;
        try {
            p10 = (P) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
        }
        P[] pArr = {C1062u.f15155b, p10};
        I i10 = new I();
        i10.f15029a = pArr;
        Charset charset = A.f15023a;
        this.f15031a = i10;
    }
}
