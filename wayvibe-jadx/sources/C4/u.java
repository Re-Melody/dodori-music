package C4;

import A9.G;
import D7.W;
import E.C0335b;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import io.flutter.plugin.platform.C1951b;
import io.flutter.view.TextureRegistry$ImageTextureEntry;

/* JADX INFO: loaded from: classes.dex */
public final class u implements io.flutter.plugin.platform.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f1475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f1477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f1478f;

    public u(E.u uVar, int i10, int i11, E.m mVar, G g3) {
        this.f1478f = uVar;
        this.f1475c = uVar;
        this.f1473a = i10;
        this.f1474b = i11;
        this.f1476d = mVar;
        this.f1477e = g3;
    }

    public long a(int i10, int i11) {
        int i12;
        E.u uVar = (E.u) this.f1475c;
        int[] iArr = uVar.f2973a;
        if (i11 == 1) {
            i12 = iArr[i10];
        } else {
            int i13 = (i11 + i10) - 1;
            int[] iArr2 = uVar.f2974b;
            i12 = (iArr2[i13] + iArr[i13]) - iArr2[i10];
        }
        if (i12 < 0) {
            i12 = 0;
        }
        if (i12 >= 0) {
            return W.t(i12, i12, 0, com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
        }
        S5.d.Q("width(" + i12 + ") must be >= 0");
        throw null;
    }

    @Override // io.flutter.plugin.platform.h
    public void b(int i10, int i11) {
        ImageReader imageReaderNewInstance;
        ImageReader imageReader = (ImageReader) this.f1476d;
        if (imageReader != null && this.f1473a == i10 && this.f1474b == i11) {
            return;
        }
        if (imageReader != null) {
            ((TextureRegistry$ImageTextureEntry) this.f1475c).pushImage(null);
            ((ImageReader) this.f1476d).close();
            this.f1476d = null;
        }
        this.f1473a = i10;
        this.f1474b = i11;
        int i12 = Build.VERSION.SDK_INT;
        Handler handler = (Handler) this.f1477e;
        C1951b c1951b = (C1951b) this.f1478f;
        if (i12 >= 33) {
            com.revenuecat.purchases.hybridcommon.ui.a.r();
            ImageReader.Builder builderE = com.revenuecat.purchases.hybridcommon.ui.a.e(this.f1473a, this.f1474b);
            builderE.setMaxImages(4);
            builderE.setImageFormat(34);
            builderE.setUsage(256L);
            imageReaderNewInstance = builderE.build();
            imageReaderNewInstance.setOnImageAvailableListener(c1951b, handler);
        } else {
            if (i12 < 29) {
                throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
            }
            imageReaderNewInstance = ImageReader.newInstance(i10, i11, 34, 4, 256L);
            imageReaderNewInstance.setOnImageAvailableListener(c1951b, handler);
        }
        this.f1476d = imageReaderNewInstance;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.List] */
    public E.s c(int i10) {
        A1.d dVarS = ((G) this.f1477e).s(i10);
        ?? r10 = dVarS.f117c;
        int size = r10.size();
        int i11 = dVarS.f116b;
        int i12 = (size == 0 || i11 + size == this.f1473a) ? 0 : this.f1474b;
        E.r[] rVarArr = new E.r[size];
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            int i15 = (int) ((C0335b) r10.get(i14)).f2877a;
            int i16 = i12;
            E.r rVarA = ((E.m) this.f1476d).a(i11 + i14, a(i13, i15), i13, i15, i16);
            i12 = i16;
            i13 += i15;
            rVarArr[i14] = rVarA;
        }
        return new E.s(i10, rVarArr, (E.u) this.f1478f, r10, i12);
    }

    @Override // io.flutter.plugin.platform.h
    public int getHeight() {
        return this.f1474b;
    }

    @Override // io.flutter.plugin.platform.h
    public long getId() {
        return ((TextureRegistry$ImageTextureEntry) this.f1475c).id();
    }

    @Override // io.flutter.plugin.platform.h
    public Surface getSurface() {
        return ((ImageReader) this.f1476d).getSurface();
    }

    @Override // io.flutter.plugin.platform.h
    public int getWidth() {
        return this.f1473a;
    }

    @Override // io.flutter.plugin.platform.h
    public void release() {
        if (((ImageReader) this.f1476d) != null) {
            ((TextureRegistry$ImageTextureEntry) this.f1475c).pushImage(null);
            ((ImageReader) this.f1476d).close();
            this.f1476d = null;
        }
        this.f1475c = null;
    }

    public u(long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2) {
        X4.a.k(iArr.length == jArr2.length);
        X4.a.k(jArr.length == jArr2.length);
        X4.a.k(iArr2.length == jArr2.length);
        this.f1475c = jArr;
        this.f1477e = iArr;
        this.f1474b = i10;
        this.f1476d = jArr2;
        this.f1478f = iArr2;
        this.f1473a = jArr.length;
    }

    public u(TextureRegistry$ImageTextureEntry textureRegistry$ImageTextureEntry) {
        this.f1473a = 0;
        this.f1474b = 0;
        this.f1477e = new Handler();
        this.f1478f = new C1951b(this);
        if (Build.VERSION.SDK_INT >= 29) {
            this.f1475c = textureRegistry$ImageTextureEntry;
            return;
        }
        throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
    }
}
