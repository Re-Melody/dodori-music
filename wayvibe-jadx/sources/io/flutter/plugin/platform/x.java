package io.flutter.plugin.platform;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* JADX INFO: loaded from: classes2.dex */
public final class x implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.i f20789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SurfaceTexture f20790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Surface f20791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20792d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20793e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f20794f = false;

    public x(io.flutter.embedding.engine.renderer.i iVar) {
        w wVar = new w(this);
        this.f20789a = iVar;
        this.f20790b = iVar.f20604b.surfaceTexture();
        iVar.f20606d = wVar;
    }

    @Override // io.flutter.plugin.platform.h
    public final void b(int i10, int i11) {
        this.f20792d = i10;
        this.f20793e = i11;
        SurfaceTexture surfaceTexture = this.f20790b;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i10, i11);
        }
    }

    @Override // io.flutter.plugin.platform.h
    public final int getHeight() {
        return this.f20793e;
    }

    @Override // io.flutter.plugin.platform.h
    public final long getId() {
        return this.f20789a.f20603a;
    }

    @Override // io.flutter.plugin.platform.h
    public final Surface getSurface() {
        Surface surface = this.f20791c;
        if (surface == null || this.f20794f) {
            if (surface != null) {
                surface.release();
                this.f20791c = null;
            }
            this.f20791c = new Surface(this.f20790b);
            this.f20794f = false;
        }
        SurfaceTexture surfaceTexture = this.f20790b;
        if (surfaceTexture == null || surfaceTexture.isReleased()) {
            return null;
        }
        return this.f20791c;
    }

    @Override // io.flutter.plugin.platform.h
    public final int getWidth() {
        return this.f20792d;
    }

    @Override // io.flutter.plugin.platform.h
    public final void release() {
        this.f20790b = null;
        Surface surface = this.f20791c;
        if (surface != null) {
            surface.release();
            this.f20791c = null;
        }
    }
}
