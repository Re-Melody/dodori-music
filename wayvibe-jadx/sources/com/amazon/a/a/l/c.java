package com.amazon.a.a.l;

import android.app.Activity;
import android.content.Intent;
import com.amazon.a.a.c.f;
import com.amazon.a.a.k.d;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class c implements d, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f16212a = new com.amazon.a.a.o.c("ActivityResultManagerImpl");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Random f16213b = new Random();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f16214c = 65535;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.n.b f16215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.a.a f16216e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private f f16217f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private AtomicReference<a> f16218g = new AtomicReference<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private BlockingQueue<com.amazon.a.a.l.a> f16219h = new LinkedBlockingQueue();

    @Override // com.amazon.a.a.k.d
    public void e() {
        this.f16217f.a(new com.amazon.a.a.c.c<com.amazon.a.a.a.a.a>() { // from class: com.amazon.a.a.l.c.1
            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.d b() {
                return com.amazon.a.a.c.d.MIDDLE;
            }

            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.b a() {
                return com.amazon.a.a.a.a.b.RESUME;
            }

            @Override // com.amazon.a.a.c.c
            public void a(com.amazon.a.a.a.a.a aVar) {
                a aVar2 = (a) c.this.f16218g.get();
                if (aVar2 != null) {
                    aVar2.b(aVar.b());
                }
            }
        });
    }

    private int b() {
        return f16213b.nextInt(f16214c) + 1;
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Intent f16223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f16224b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Activity f16225c;

        public a(Intent intent, int i10) {
            this.f16223a = intent;
            this.f16224b = i10;
        }

        public void a(Activity activity) {
            c.f16212a.a("Calling startActivityForResult from: " + activity);
            activity.startActivityForResult(this.f16223a, this.f16224b);
            this.f16225c = activity;
        }

        public void b(Activity activity) {
            c.f16212a.b("Context changed while awaiting result!");
            if (this.f16225c != null) {
                c.f16212a.b("Finishing activity from old context: " + this.f16225c);
                this.f16225c.finishActivity(this.f16224b);
            }
            a(activity);
        }

        public int a() {
            return this.f16224b;
        }
    }

    @Override // com.amazon.a.a.l.b
    public com.amazon.a.a.l.a a(Intent intent) {
        final a aVar = new a(intent, b());
        AtomicReference<a> atomicReference = this.f16218g;
        do {
            if (atomicReference.compareAndSet(null, aVar)) {
                com.amazon.a.a.o.c cVar = f16212a;
                cVar.a("Starting activity for result: " + intent + ", " + intent.getFlags() + ", requestId: " + aVar.a());
                this.f16215d.b(com.amazon.a.a.n.b.d.FOREGROUND, new com.amazon.a.a.n.a() { // from class: com.amazon.a.a.l.c.2
                    @Override // com.amazon.a.a.n.a
                    public void a() {
                        Activity activityB = c.this.f16216e.b();
                        if (activityB == null) {
                            c.f16212a.a("No activity to call startActivityForResult on. startActivityForResult when an activity becomes visible");
                        } else {
                            aVar.a(activityB);
                        }
                    }
                });
                try {
                    cVar.a("Blocking for request: " + aVar.a());
                    return this.f16219h.take();
                } catch (InterruptedException unused) {
                    f16212a.a("Interrupted while awaiting for request, returning null");
                    return null;
                } finally {
                    f16212a.a("Received Response: " + aVar.a());
                    this.f16218g.set(null);
                }
            }
        } while (atomicReference.get() == null);
        f16212a.b("StartActivityForResult called while ActivityResultManager is already awaiting a result");
        return null;
    }

    @Override // com.amazon.a.a.l.b
    public boolean a(com.amazon.a.a.l.a aVar) {
        if (com.amazon.a.a.o.c.f16456a) {
            f16212a.a("Recieved ActivityResult: " + aVar);
        }
        a aVar2 = this.f16218g.get();
        if (aVar2 == null) {
            if (com.amazon.a.a.o.c.f16456a) {
                f16212a.a("We don't have a current open request, returning");
            }
            return false;
        }
        if (aVar2.a() != aVar.b()) {
            if (com.amazon.a.a.o.c.f16456a) {
                f16212a.a("We don't have a request with code: " + aVar.b() + ", returning");
            }
            return false;
        }
        if (com.amazon.a.a.o.c.f16456a) {
            f16212a.a("Signaling thread waiting for request: " + aVar.b());
        }
        this.f16219h.add(aVar);
        return true;
    }
}
