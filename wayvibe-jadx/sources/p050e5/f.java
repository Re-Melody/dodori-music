package p050e5;

import B4.a;
import D2.i;
import D2.t;
import D2.w;
import E4.d;
import E9.C0342c;
import E9.C0345f;
import G7.o;
import J3.e;
import M2.l;
import M2.q;
import N8.m;
import U6.k;
import V2.h;
import V2.p;
import X2.x;
import Z2.F;
import Z2.n;
import Z2.z;
import Z6.C1004i;
import android.content.Context;
import com.google.android.gms.internal.p002firebaseauthapi.zzae;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.crypto.tink.shaded.protobuf.C;
import com.google.firebase.components.ComponentRegistrar;
import com.google.protobuf.S;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import p165p2.b;
import p255y2.D;

/* JADX INFO: loaded from: classes.dex */
public final class f implements S, d, o, e, q, C, k, x, Z2.q, Continuation, b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static f f19592b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19593a;

    public /* synthetic */ f(int i10) {
        this.f19593a = i10;
    }

    public static final void a(C0345f c0345f) {
        A1.d dVar = C0345f.f3376h;
        if (C0345f.f3377i == null) {
            C0345f.f3377i = new C0345f();
            C0342c c0342c = new C0342c("Okio Watchdog");
            c0342c.setDaemon(true);
            c0342c.start();
        }
        long jNanoTime = System.nanoTime();
        long j10 = c0345f.f3363c;
        boolean z10 = c0345f.f3361a;
        if (j10 != 0 && z10) {
            c0345f.f3383g = Math.min(j10, c0345f.c() - jNanoTime) + jNanoTime;
        } else if (j10 != 0) {
            c0345f.f3383g = jNanoTime + j10;
        } else {
            if (!z10) {
                throw new AssertionError();
            }
            c0345f.f3383g = c0345f.c();
        }
        A1.d dVar2 = C0345f.f3376h;
        int i10 = dVar2.f116b + 1;
        dVar2.f116b = i10;
        C0345f[] c0345fArr = (C0345f[]) dVar2.f117c;
        if (i10 == c0345fArr.length) {
            C0345f[] c0345fArr2 = new C0345f[i10 * 2];
            m.m0(c0345fArr, 0, c0345fArr2, 0, 14);
            dVar2.f117c = c0345fArr2;
        }
        dVar2.i(i10, c0345f);
        if (c0345f.f3382f == 1) {
            C0345f.k.signal();
        }
    }

    public static C0345f e() throws InterruptedException {
        A1.d dVar = C0345f.f3376h;
        C0345f c0345f = ((C0345f[]) dVar.f117c)[1];
        if (c0345f == null) {
            long jNanoTime = System.nanoTime();
            C0345f.k.await(C0345f.f3379l, TimeUnit.MILLISECONDS);
            if (((C0345f[]) dVar.f117c)[1] != null || System.nanoTime() - jNanoTime < C0345f.f3380m) {
                return null;
            }
            return C0345f.f3377i;
        }
        long jNanoTime2 = c0345f.f3383g - System.nanoTime();
        if (jNanoTime2 > 0) {
            C0345f.k.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        dVar.o(c0345f);
        c0345f.f3381e = 2;
        return c0345f;
    }

    public static a f(h hVar, A1.d dVar) {
        IOException iOException = (IOException) dVar.f117c;
        if (!(iOException instanceof w)) {
            return null;
        }
        int i10 = ((w) iOException).f1907d;
        if (i10 != 403 && i10 != 404 && i10 != 410 && i10 != 416 && i10 != 500 && i10 != 503) {
            return null;
        }
        if (hVar.a(1)) {
            return new a(1, 300000L);
        }
        if (hVar.a(2)) {
            return new a(2, 60000L);
        }
        return null;
    }

    public static long m(A1.d dVar) {
        Throwable cause = (IOException) dVar.f117c;
        if ((cause instanceof D) || (cause instanceof FileNotFoundException) || (cause instanceof t) || (cause instanceof V2.m)) {
            return -9223372036854775807L;
        }
        int i10 = i.f1857b;
        while (cause != null) {
            if ((cause instanceof i) && ((i) cause).f1858a == 2008) {
                return -9223372036854775807L;
            }
            cause = cause.getCause();
        }
        return Math.min((dVar.f116b - 1) * PipesIterator.DEFAULT_QUEUE_SIZE, 5000);
    }

    @Override // Z2.q
    public F L(int i10, int i11) {
        return new n();
    }

    @Override // U6.k
    public Object c(String str, Provider provider) {
        return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
    }

    @Override // M2.q
    public p d(l lVar, M2.i iVar) {
        return new M2.p(lVar, iVar);
    }

    @Override // M2.q
    public p h() {
        return new M2.p(l.f8189n, null);
    }

    public int k(int i10) {
        return i10 == 7 ? 6 : 3;
    }

    public List n(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (p023b7.a aVar : componentRegistrar.getComponents()) {
            String str = aVar.f15771a;
            if (str != null) {
                A7.a aVar2 = new A7.a(0, str, aVar);
                aVar = new p023b7.a(str, aVar.f15772b, aVar.f15773c, aVar.f15774d, aVar2, aVar.f15776f);
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public /* synthetic */ Object then(Task task) {
        if (task.isSuccessful()) {
            return Tasks.forResult(null);
        }
        Exception exception = task.getException();
        return Tasks.forException(new C1004i("INTERNAL_ERROR", zzae.zzb(exception != null ? exception.getMessage() : "")));
    }

    @Override // G7.o
    public Object y() {
        switch (this.f19593a) {
            case 7:
                return new LinkedHashSet();
            default:
                return new ConcurrentHashMap();
        }
    }

    public f(Context context) {
        this.f19593a = 6;
        context.getApplicationContext();
    }

    @Override // Z2.q
    public void A() {
    }

    @Override // X2.x
    public void g() {
    }

    @Override // J3.e
    public void j() {
    }

    @Override // X2.x
    public void l() {
    }

    @Override // Z2.q
    public void b(z zVar) {
    }

    @Override // J3.e
    public void i(Serializable serializable, int i10) {
    }
}
