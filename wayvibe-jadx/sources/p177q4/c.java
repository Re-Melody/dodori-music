package p177q4;

import D7.W;
import E9.E;
import E9.G;
import M8.j;
import android.graphics.Bitmap;
import java.io.EOFException;
import kotlin.jvm.internal.m;
import okhttp3.Headers;
import okhttp3.Response;
import okhttp3.internal._HeadersCommonKt;
import p097i9.k;
import p224v4.g;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f25658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f25659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f25660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f25661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f25662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Headers f25663f;

    public c(G g3) throws EOFException {
        j jVar = j.NONE;
        this.f25658a = W.R(jVar, new a(this));
        this.f25659b = W.R(jVar, new b(this));
        this.f25660c = Long.parseLong(g3.n(Long.MAX_VALUE));
        this.f25661d = Long.parseLong(g3.n(Long.MAX_VALUE));
        this.f25662e = Integer.parseInt(g3.n(Long.MAX_VALUE)) > 0;
        int i10 = Integer.parseInt(g3.n(Long.MAX_VALUE));
        Headers.Builder builder = new Headers.Builder();
        for (int i11 = 0; i11 < i10; i11++) {
            String strN = g3.n(Long.MAX_VALUE);
            Bitmap.Config[] configArr = g.f27510a;
            int iU0 = k.u0(strN, ':', 0, 6);
            if (iU0 == -1) {
                throw new IllegalArgumentException("Unexpected header: ".concat(strN).toString());
            }
            String strSubstring = strN.substring(0, iU0);
            m.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String name = k.S0(strSubstring).toString();
            String strSubstring2 = strN.substring(iU0 + 1);
            m.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
            m.f(name, "name");
            _HeadersCommonKt.b(name);
            _HeadersCommonKt.a(builder, name, strSubstring2);
        }
        this.f25663f = builder.b();
    }

    public final void a(E e2) {
        e2.c(this.f25660c);
        e2.j(10);
        e2.c(this.f25661d);
        e2.j(10);
        e2.c(this.f25662e ? 1L : 0L);
        e2.j(10);
        Headers headers = this.f25663f;
        e2.c(headers.size());
        e2.j(10);
        int size = headers.size();
        for (int i10 = 0; i10 < size; i10++) {
            e2.p(headers.c(i10));
            e2.p(": ");
            e2.p(headers.h(i10));
            e2.j(10);
        }
    }

    public c(Response response) {
        j jVar = j.NONE;
        this.f25658a = W.R(jVar, new a(this));
        this.f25659b = W.R(jVar, new b(this));
        this.f25660c = response.f24124l;
        this.f25661d = response.f24125m;
        this.f25662e = response.f24118e != null;
        this.f25663f = response.f24119f;
    }
}
