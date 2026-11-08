package p063f8;

import A8.a;
import U.W0;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import p012a8.b;
import p161o8.d;
import p161o8.e;
import p161o8.f;
import p161o8.m;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements f, j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlutterJNI f19874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f19875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f19876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f19877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f19878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f19879f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f19880g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k f19881h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final WeakHashMap f19882i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f19883j;

    public i(FlutterJNI flutterJNI) {
        b bVar = new b(8, false);
        bVar.f14302b = (ExecutorService) W0.p().f11834d;
        this.f19875b = new HashMap();
        this.f19876c = new HashMap();
        this.f19877d = new Object();
        this.f19878e = new AtomicBoolean(false);
        this.f19879f = new HashMap();
        this.f19880g = 1;
        this.f19881h = new k();
        this.f19882i = new WeakHashMap();
        this.f19874a = flutterJNI;
        this.f19883j = bVar;
    }

    @Override // p161o8.f
    public final void a(String str, d dVar) {
        h(str, dVar, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [f8.c] */
    public final void c(final String str, final f fVar, final ByteBuffer byteBuffer, final int i10, final long j10) {
        e eVar = fVar != null ? fVar.f19867b : null;
        String strB = a.b("PlatformChannel ScheduleHandler on " + str);
        if (Build.VERSION.SDK_INT >= 29) {
            O3.a.a(i10, p046da.b.g0(strB));
        } else {
            String strG0 = p046da.b.g0(strB);
            try {
                if (p046da.b.f19440h == null) {
                    p046da.b.f19440h = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                }
                p046da.b.f19440h.invoke(null, Long.valueOf(p046da.b.f19438f), strG0, Integer.valueOf(i10));
            } catch (Exception e2) {
                p046da.b.J("asyncTraceBegin", e2);
            }
        }
        ?? r10 = new Runnable() { // from class: f8.c
            @Override // java.lang.Runnable
            public final void run() {
                long j11 = j10;
                FlutterJNI flutterJNI = this.f19857a.f19874a;
                StringBuilder sb = new StringBuilder("PlatformChannel ScheduleHandler on ");
                String str2 = str;
                sb.append(str2);
                String strB2 = a.b(sb.toString());
                int i11 = Build.VERSION.SDK_INT;
                int i12 = i10;
                if (i11 >= 29) {
                    O3.a.b(i12, p046da.b.g0(strB2));
                } else {
                    String strG1 = p046da.b.g0(strB2);
                    try {
                        if (p046da.b.f19441i == null) {
                            p046da.b.f19441i = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                        }
                        p046da.b.f19441i.invoke(null, Long.valueOf(p046da.b.f19438f), strG1, Integer.valueOf(i12));
                    } catch (Exception e4) {
                        p046da.b.J("asyncTraceEnd", e4);
                    }
                }
                try {
                    a.c("DartMessenger#handleMessageFromDart on " + str2);
                    f fVar2 = fVar;
                    ByteBuffer byteBuffer2 = byteBuffer;
                    try {
                        if (fVar2 != null) {
                            try {
                                try {
                                    fVar2.f19866a.s(byteBuffer2, new g(flutterJNI, i12));
                                } catch (Error e7) {
                                    Thread threadCurrentThread = Thread.currentThread();
                                    if (threadCurrentThread.getUncaughtExceptionHandler() == null) {
                                        throw e7;
                                    }
                                    threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, e7);
                                }
                            } catch (Exception e10) {
                                Log.e("DartMessenger", "Uncaught exception in binary message listener", e10);
                                flutterJNI.invokePlatformMessageEmptyResponseCallback(i12);
                            }
                        } else {
                            flutterJNI.invokePlatformMessageEmptyResponseCallback(i12);
                        }
                        if (byteBuffer2 != null && byteBuffer2.isDirect()) {
                            byteBuffer2.limit(0);
                        }
                        Trace.endSection();
                        flutterJNI.cleanupMessageData(j11);
                    } catch (Throwable th) {
                        try {
                            Trace.endSection();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    flutterJNI.cleanupMessageData(j11);
                    throw th3;
                }
            }
        };
        e eVar2 = eVar;
        if (eVar == null) {
            eVar2 = this.f19881h;
        }
        eVar2.a(r10);
    }

    @Override // p161o8.f
    public final void d(String str, ByteBuffer byteBuffer, e eVar) {
        a.c("DartMessenger#send on " + str);
        try {
            int i10 = this.f19880g;
            this.f19880g = i10 + 1;
            if (eVar != null) {
                this.f19879f.put(Integer.valueOf(i10), eVar);
            }
            FlutterJNI flutterJNI = this.f19874a;
            if (byteBuffer == null) {
                flutterJNI.dispatchEmptyPlatformMessage(str, i10);
            } else {
                flutterJNI.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i10);
            }
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // p161o8.f
    public final void f(String str, ByteBuffer byteBuffer) {
        d(str, byteBuffer, null);
    }

    @Override // p161o8.f
    public final p050e5.f g(m mVar) {
        b bVar = this.f19883j;
        bVar.getClass();
        h hVar = new h((ExecutorService) bVar.f14302b);
        p050e5.f fVar = new p050e5.f(27);
        this.f19882i.put(fVar, hVar);
        return fVar;
    }

    @Override // p161o8.f
    public final void h(String str, d dVar, p050e5.f fVar) {
        e eVar;
        if (dVar == null) {
            synchronized (this.f19877d) {
                this.f19875b.remove(str);
            }
            return;
        }
        if (fVar != null) {
            eVar = (e) this.f19882i.get(fVar);
            if (eVar == null) {
                throw new IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
            }
        } else {
            eVar = null;
        }
        synchronized (this.f19877d) {
            try {
                this.f19875b.put(str, new f(dVar, eVar));
                List<d> list = (List) this.f19876c.remove(str);
                if (list == null) {
                    return;
                }
                for (d dVar2 : list) {
                    c(str, (f) this.f19875b.get(str), dVar2.f19863a, dVar2.f19864b, dVar2.f19865c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
