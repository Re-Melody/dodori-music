package Ea;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public interface b {
    void A(Object obj, String str);

    default boolean B(Fa.b bVar) {
        int iF = bVar.f();
        if (iF == 0) {
            return o();
        }
        if (iF == 10) {
            return g();
        }
        if (iF == 20) {
            return m();
        }
        if (iF == 30) {
            return f();
        }
        if (iF == 40) {
            return k();
        }
        throw new IllegalArgumentException("Level [" + bVar + "] not recognized.");
    }

    void C(String str, Object obj, Serializable serializable);

    void D(Integer num, String str);

    void E(String str, Serializable serializable);

    void F(String str, Object obj, Serializable serializable);

    boolean f();

    boolean g();

    String getName();

    void h(String str);

    void i(String str, Throwable th);

    boolean k();

    void l(String str, Object... objArr);

    boolean m();

    void n(String str);

    boolean o();

    void p(String str, Object obj, Serializable serializable);

    void q(String str, Object obj);

    void r(String str, Object... objArr);

    void s(Object... objArr);

    void t(Integer num, String str);

    void u(String str, Throwable th);

    void v(Object obj, String str);

    void w(String str, Throwable th);

    void warn(String str);

    void x(String str);

    void y(String str);

    void z(Object obj, Object obj2, String str);
}
