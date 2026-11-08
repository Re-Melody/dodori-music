package org.maplibre.android.maps.renderer.egl;

import android.opengl.GLSurfaceView;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
import org.maplibre.android.log.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements GLSurfaceView.EGLConfigChooser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25016a;

    public d(boolean z10) {
        this.f25016a = z10;
    }

    public static int a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10) {
        int[] iArr = new int[1];
        if (!egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i10, iArr)) {
            Logger.e("Mbgl-EGLConfigChooser", String.format(p086ha.a.f20365a, "eglGetConfigAttrib(%d) returned error %d", Integer.valueOf(i10), Integer.valueOf(egl10.eglGetError())));
        }
        return iArr[0];
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005c  */
    @Override // android.opengl.GLSurfaceView.EGLConfigChooser
    public final EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
        boolean z10;
        EGLConfig eGLConfig;
        b bVar;
        String str = Build.FINGERPRINT;
        if (str.startsWith("generic") || str.startsWith("unknown")) {
            z10 = true;
        } else {
            String str2 = Build.MODEL;
            if (str2.contains("google_sdk") || str2.contains("Emulator") || str2.contains("Android SDK built for x86") || ((Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) || "google_sdk".equals(Build.PRODUCT) || System.getProperty("ro.kernel.qemu") != null || Build.MANUFACTURER.contains("Genymotion"))) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        Logger.i("Mbgl-EGLConfigChooser", "In emulator: " + z10);
        int[] iArr = {12327, 12344, 12339, 4, 12320, 16, 12324, 5, 12323, 6, 12322, 5, 12321, this.f25016a ? 8 : 0, 12325, 16, 12326, 8, z10 ? 12344 : 12351, 12430, 12352, 64, 12344};
        int[] iArr2 = new int[1];
        if (!egl10.eglChooseConfig(eGLDisplay, iArr, null, 0, iArr2)) {
            Logger.e("Mbgl-EGLConfigChooser", String.format(p086ha.a.f20365a, "eglChooseConfig(NULL) returned error %d", Integer.valueOf(egl10.eglGetError())));
        }
        if (iArr2[0] < 1) {
            Logger.e("Mbgl-EGLConfigChooser", "eglChooseConfig() returned no configs.");
        }
        int i10 = iArr2[0];
        EGLConfig[] eGLConfigArr = new EGLConfig[i10];
        EGL10 egl11 = egl10;
        EGLDisplay eGLDisplay2 = eGLDisplay;
        if (!egl11.eglChooseConfig(eGLDisplay2, iArr, eGLConfigArr, i10, iArr2)) {
            Logger.e("Mbgl-EGLConfigChooser", String.format(p086ha.a.f20365a, "eglChooseConfig() returned error %d", Integer.valueOf(egl11.eglGetError())));
        }
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10) {
            EGLConfig eGLConfig2 = eGLConfigArr[i11];
            if (eGLConfig2 != null) {
                int i13 = i12 + 1;
                int iA = a(egl11, eGLDisplay2, eGLConfig2, 12327);
                int iA2 = a(egl11, eGLDisplay2, eGLConfig2, 12320);
                int iA3 = a(egl11, eGLDisplay2, eGLConfig2, 12324);
                int iA4 = a(egl11, eGLDisplay2, eGLConfig2, 12323);
                int iA5 = a(egl11, eGLDisplay2, eGLConfig2, 12322);
                int iA6 = a(egl11, eGLDisplay2, eGLConfig2, 12321);
                a(egl11, eGLDisplay2, eGLConfig2, 12350);
                int iA7 = a(egl11, eGLDisplay2, eGLConfig2, 12325);
                int iA8 = a(egl11, eGLDisplay2, eGLConfig2, 12326);
                if ((iA7 == 24 || iA7 == 16) & (iA8 == 8) & (a(egl11, eGLDisplay2, eGLConfig2, 12338) == 0) & (a(egl11, eGLDisplay2, eGLConfig2, 12337) == 0)) {
                    if (iA2 == 16 && iA3 == 5 && iA4 == 6 && iA5 == 5 && iA6 == 0) {
                        bVar = b.Format16Bit;
                    } else if (iA2 == 32 && iA3 == 8 && iA4 == 8 && iA5 == 8 && iA6 == 0) {
                        bVar = b.Format32BitNoAlpha;
                    } else if (iA2 == 32 && iA3 == 8 && iA4 == 8 && iA5 == 8 && iA6 == 8) {
                        bVar = b.Format32BitAlpha;
                    } else {
                        bVar = (iA2 == 24 && iA3 == 8 && iA4 == 8 && iA5 == 8 && iA6 == 0) ? b.Format24Bit : b.Unknown;
                    }
                    b bVar2 = bVar;
                    c cVar = (iA7 == 16 && iA8 == 8) ? c.Format16Depth8Stencil : c.Format24Depth8Stencil;
                    boolean z11 = iA != 12344;
                    if (bVar2 != b.Unknown) {
                        arrayList.add(new a(bVar2, cVar, z11, i13, eGLConfig2));
                    }
                }
                i12 = i13;
            }
            i11++;
            egl11 = egl10;
            eGLDisplay2 = eGLDisplay;
            eGLConfigArr = eGLConfigArr;
            i10 = i10;
        }
        Collections.sort(arrayList);
        if (arrayList.size() == 0) {
            Logger.e("Mbgl-EGLConfigChooser", "No matching configurations after filtering");
            eGLConfig = null;
        } else {
            a aVar = (a) arrayList.get(0);
            if (aVar.f25013c) {
                Logger.w("Mbgl-EGLConfigChooser", "Chosen config has a caveat.");
            }
            eGLConfig = aVar.f25015e;
        }
        if (eGLConfig == null) {
            Logger.e("Mbgl-EGLConfigChooser", "No config chosen");
        }
        return eGLConfig;
    }
}
