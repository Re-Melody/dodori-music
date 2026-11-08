package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry$ImageTextureEntry;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.flutter.view.u;
import io.flutter.view.v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import p045d8.C1933e;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlutterJNI f20628a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Surface f20630c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C1933e f20635h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f20629b = new AtomicLong(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f20631d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f20632e = new Handler();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashSet f20633f = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f20634g = new ArrayList();

    public k(FlutterJNI flutterJNI) {
        C1933e c1933e = new C1933e(this, 3);
        this.f20635h = c1933e;
        this.f20628a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(c1933e);
    }

    public final void a(l lVar) {
        this.f20628a.addIsDisplayingFlutterUiListener(lVar);
        if (this.f20631d) {
            lVar.b();
        }
    }

    public final void b(u uVar) {
        HashSet hashSet = this.f20633f;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((u) ((WeakReference) it.next()).get()) == null) {
                it.remove();
            }
        }
        hashSet.add(new WeakReference(uVar));
    }

    public final TextureRegistry$ImageTextureEntry c() {
        FlutterRenderer$ImageTextureRegistryEntry flutterRenderer$ImageTextureRegistryEntry = new FlutterRenderer$ImageTextureRegistryEntry(this, this.f20629b.getAndIncrement());
        flutterRenderer$ImageTextureRegistryEntry.id();
        this.f20628a.registerImageTexture(flutterRenderer$ImageTextureRegistryEntry.id(), flutterRenderer$ImageTextureRegistryEntry, false);
        return flutterRenderer$ImageTextureRegistryEntry;
    }

    public final TextureRegistry$SurfaceProducer d(v vVar) {
        if (Build.VERSION.SDK_INT < 29) {
            i iVarE = e();
            return new o(iVarE.f20603a, this.f20632e, this.f20628a, iVarE);
        }
        long andIncrement = this.f20629b.getAndIncrement();
        FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer = new FlutterRenderer$ImageReaderSurfaceProducer(this, andIncrement);
        boolean z10 = vVar == v.resetInBackground;
        this.f20628a.registerImageTexture(andIncrement, flutterRenderer$ImageReaderSurfaceProducer, z10);
        if (z10) {
            b(flutterRenderer$ImageReaderSurfaceProducer);
        }
        this.f20634g.add(flutterRenderer$ImageReaderSurfaceProducer);
        return flutterRenderer$ImageReaderSurfaceProducer;
    }

    public final i e() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        long andIncrement = this.f20629b.getAndIncrement();
        surfaceTexture.detachFromGLContext();
        i iVar = new i(this, andIncrement, surfaceTexture);
        this.f20628a.registerTexture(iVar.f20603a, iVar.f20604b);
        b(iVar);
        return iVar;
    }

    public final void f(int i10) {
        Iterator it = this.f20633f.iterator();
        while (it.hasNext()) {
            u uVar = (u) ((WeakReference) it.next()).get();
            if (uVar != null) {
                uVar.onTrimMemory(i10);
            } else {
                it.remove();
            }
        }
    }

    public final void g(l lVar) {
        this.f20628a.removeIsDisplayingFlutterUiListener(lVar);
    }

    public final void h(u uVar) {
        HashSet<WeakReference> hashSet = this.f20633f;
        for (WeakReference weakReference : hashSet) {
            if (weakReference.get() == uVar) {
                hashSet.remove(weakReference);
                return;
            }
        }
    }

    public final void i() {
        Iterator it = this.f20634g.iterator();
        while (it.hasNext()) {
            ((FlutterRenderer$ImageReaderSurfaceProducer) it.next()).getClass();
        }
    }

    public final void j() {
        if (this.f20630c != null) {
            this.f20628a.onSurfaceDestroyed();
            if (this.f20631d) {
                this.f20635h.a();
            }
            this.f20631d = false;
            this.f20630c = null;
        }
    }
}
