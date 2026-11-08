package io.flutter.plugin.platform;

import A9.G;
import B2.AbstractC0112b;
import G0.x1;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.res.AssetFileDescriptor;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p045d8.AbstractActivityC1932d;
import p045d8.I;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements p150n8.n, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f20739b;

    public /* synthetic */ o(Object obj, int i10) {
        this.f20738a = i10;
        this.f20739b = obj;
    }

    @Override // p150n8.n
    public void a(boolean z10) {
        ((q) this.f20739b).r = z10;
    }

    @Override // io.flutter.plugin.platform.h
    public void b(int i10, int i11) {
        ((TextureRegistry$SurfaceProducer) this.f20739b).setSize(i10, i11);
    }

    @Override // p150n8.n
    public void c(int i10, int i11) {
        View view;
        switch (this.f20738a) {
            case 0:
                if (i11 != 0 && i11 != 1) {
                    throw new IllegalStateException(AbstractC0112b.f("Trying to set unknown direction value: ", i11, "(view id: ", i10, ")"));
                }
                q qVar = (q) this.f20739b;
                if (qVar.o(i10)) {
                    view = ((B) qVar.f20765j.get(Integer.valueOf(i10))).a();
                } else {
                    f fVar = (f) qVar.f20766l.get(i10);
                    if (fVar == null) {
                        V0.p.v(i10, "Setting direction to an unknown view with id: ", "PlatformViewsController");
                        return;
                    }
                    view = fVar.getView();
                }
                if (view == null) {
                    V0.p.v(i10, "Setting direction to a null view with id: ", "PlatformViewsController");
                    return;
                } else {
                    view.setLayoutDirection(i11);
                    return;
                }
            default:
                f fVar2 = (f) ((p) this.f20739b).f20748i.get(i10);
                if (fVar2 == null) {
                    V0.p.v(i10, "Setting direction to an unknown view with id: ", "PlatformViewsController2");
                    return;
                }
                View view2 = fVar2.getView();
                if (view2 == null) {
                    V0.p.v(i10, "Setting direction to a null view with id: ", "PlatformViewsController2");
                    return;
                } else {
                    view2.setLayoutDirection(i11);
                    return;
                }
        }
    }

    public void d(p150n8.k kVar) {
        p pVar = (p) this.f20739b;
        HashMap map = (HashMap) pVar.f20740a.f20739b;
        String str = kVar.f22983b;
        g gVar = (g) map.get(str);
        if (gVar == null) {
            throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str);
        }
        ByteBuffer byteBuffer = kVar.f22990i;
        Object objB = byteBuffer != null ? gVar.getCreateArgsCodec().b(byteBuffer) : null;
        Activity activity = pVar.f20742c;
        int i10 = kVar.f22982a;
        f fVarCreate = gVar.create(activity, i10, objB);
        View view = fVarCreate.getView();
        if (view == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        view.setLayoutDirection(kVar.f22988g);
        pVar.f20748i.put(i10, fVarCreate);
        p045d8.t tVar = pVar.f20743d;
        if (tVar == null) {
            return;
        }
        fVarCreate.onFlutterViewAttached(tVar);
    }

    /* JADX WARN: Type inference failed for: r7v8, types: [io.flutter.plugin.platform.m] */
    @Override // p150n8.n
    public long e(final p150n8.k kVar) {
        j jVar;
        long j10;
        final int i10 = 1;
        final int i11 = 0;
        final q qVar = (q) this.f20739b;
        q.a(qVar, kVar);
        SparseArray sparseArray = qVar.f20769o;
        int i12 = kVar.f22982a;
        if (sparseArray.get(i12) != null) {
            throw new IllegalStateException(p134m1.b.j(i12, "Trying to create an already created platform view, view id: "));
        }
        if (qVar.f20761f == null) {
            throw new IllegalStateException(p134m1.b.j(i12, "Texture registry is null. This means that platform views controller was detached, view id: "));
        }
        if (qVar.f20759d == null) {
            throw new IllegalStateException(p134m1.b.j(i12, "Flutter view is null. This means the platform views controller doesn't have an attached view, view id: "));
        }
        f fVarC = qVar.c(kVar, true);
        View view = fVarC.getView();
        if (view.getParent() != null) {
            throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
        }
        boolean zB0 = S9.b.B0(view, new A8.b(q.f20755x, i11));
        double d10 = kVar.f22985d;
        double d11 = kVar.f22984c;
        if (zB0) {
            if (kVar.f22989h == p150n8.j.TEXTURE_WITH_HYBRID_FALLBACK) {
                q.f(19);
                if (qVar.f20760e.IsSurfaceControlEnabled()) {
                    throw new IllegalStateException("Trying to create a Hybrid Composition view with HC++ enabled.");
                }
                return -2L;
            }
            if (!qVar.f20775v) {
                q.f(20);
                h hVarJ = q.j(qVar.f20761f);
                int iM = qVar.m(d11);
                int iM2 = qVar.m(d10);
                Activity activity = qVar.f20758c;
                ?? r10 = new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.m
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view2, boolean z10) {
                        switch (i10) {
                            case 0:
                                p150n8.k kVar2 = kVar;
                                q qVar2 = qVar;
                                int i13 = kVar2.f22982a;
                                if (!z10) {
                                    io.flutter.plugin.editing.l lVar = qVar2.f20762g;
                                    if (lVar != null) {
                                        lVar.b(i13);
                                    }
                                    break;
                                } else {
                                    p161o8.s sVar = (p161o8.s) qVar2.f20763h.f12825b;
                                    if (sVar != null) {
                                        sVar.a("viewFocused", Integer.valueOf(i13), null);
                                        break;
                                    }
                                }
                                break;
                            default:
                                q qVar3 = qVar;
                                if (!z10) {
                                    qVar3.getClass();
                                    break;
                                } else {
                                    W4.m mVar = qVar3.f20763h;
                                    p150n8.k kVar3 = kVar;
                                    p161o8.s sVar2 = (p161o8.s) mVar.f12825b;
                                    if (sVar2 != null) {
                                        sVar2.a("viewFocused", Integer.valueOf(kVar3.f22982a), null);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                };
                y yVar = B.f20699i;
                B b10 = null;
                if (iM != 0 && iM2 != 0) {
                    DisplayManager displayManager = (DisplayManager) activity.getSystemService("display");
                    DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
                    hVarJ.b(iM, iM2);
                    StringBuilder sb = new StringBuilder("flutter-vd#");
                    int i13 = kVar.f22982a;
                    sb.append(i13);
                    VirtualDisplay virtualDisplayCreateVirtualDisplay = displayManager.createVirtualDisplay(sb.toString(), iM, iM2, displayMetrics.densityDpi, hVarJ.getSurface(), 0, B.f20699i, null);
                    if (virtualDisplayCreateVirtualDisplay != null) {
                        b10 = new B(activity, qVar.f20764i, virtualDisplayCreateVirtualDisplay, fVarC, hVarJ, r10, i13);
                    }
                }
                if (b10 != null) {
                    qVar.f20765j.put(Integer.valueOf(i12), b10);
                    View view2 = fVarC.getView();
                    qVar.k.put(view2.getContext(), view2);
                    return hVarJ.getId();
                }
                throw new IllegalStateException("Failed creating virtual display for a " + kVar.f22983b + " with id: " + i12);
            }
        }
        q.f(23);
        int iM3 = qVar.m(d11);
        int iM4 = qVar.m(d10);
        if (qVar.f20775v) {
            jVar = new j(qVar.f20758c);
            j10 = -1;
        } else {
            h hVarJ2 = q.j(qVar.f20761f);
            j jVar2 = new j(qVar.f20758c);
            jVar2.f20726f = hVarJ2;
            Surface surface = hVarJ2.getSurface();
            if (surface != null) {
                Canvas canvasLockHardwareCanvas = surface.lockHardwareCanvas();
                try {
                    canvasLockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
                } catch (Throwable th) {
                    surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
                    throw th;
                }
            }
            long id = hVarJ2.getId();
            jVar = jVar2;
            j10 = id;
        }
        jVar.setTouchProcessor(qVar.f20757b);
        h hVar = jVar.f20726f;
        if (hVar != null) {
            hVar.b(iM3, iM4);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iM3, iM4);
        int iM5 = qVar.m(kVar.f22986e);
        int iM6 = qVar.m(kVar.f22987f);
        layoutParams.topMargin = iM5;
        layoutParams.leftMargin = iM6;
        jVar.setLayoutParams(layoutParams);
        View view3 = fVarC.getView();
        view3.setLayoutParams(new FrameLayout.LayoutParams(iM3, iM4));
        view3.setImportantForAccessibility(4);
        jVar.addView(view3);
        jVar.setOnDescendantFocusChangeListener(new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.m
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view4, boolean z10) {
                switch (i11) {
                    case 0:
                        p150n8.k kVar2 = kVar;
                        q qVar2 = qVar;
                        int i14 = kVar2.f22982a;
                        if (!z10) {
                            io.flutter.plugin.editing.l lVar = qVar2.f20762g;
                            if (lVar != null) {
                                lVar.b(i14);
                            }
                            break;
                        } else {
                            p161o8.s sVar = (p161o8.s) qVar2.f20763h.f12825b;
                            if (sVar != null) {
                                sVar.a("viewFocused", Integer.valueOf(i14), null);
                                break;
                            }
                        }
                        break;
                    default:
                        q qVar3 = qVar;
                        if (!z10) {
                            qVar3.getClass();
                            break;
                        } else {
                            W4.m mVar = qVar3.f20763h;
                            p150n8.k kVar3 = kVar;
                            p161o8.s sVar2 = (p161o8.s) mVar.f12825b;
                            if (sVar2 != null) {
                                sVar2.a("viewFocused", Integer.valueOf(kVar3.f22982a), null);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        qVar.f20759d.addView(jVar);
        sparseArray.append(i12, jVar);
        p045d8.t tVar = qVar.f20759d;
        if (tVar == null) {
            return j10;
        }
        fVarC.onFlutterViewAttached(tVar);
        return j10;
    }

    @Override // p150n8.n
    public void f(p150n8.l lVar) {
        switch (this.f20738a) {
            case 0:
                q qVar = (q) this.f20739b;
                float f10 = qVar.f20758c.getResources().getDisplayMetrics().density;
                int i10 = lVar.f22991a;
                if (!qVar.o(i10)) {
                    f fVar = (f) qVar.f20766l.get(i10);
                    if (fVar == null) {
                        V0.p.v(i10, "Sending touch to an unknown view with id: ", "PlatformViewsController");
                    } else {
                        View view = fVar.getView();
                        if (view == null) {
                            V0.p.v(i10, "Sending touch to a null view with id: ", "PlatformViewsController");
                        } else {
                            view.dispatchTouchEvent(qVar.l(f10, lVar, false));
                        }
                    }
                    break;
                } else {
                    B b10 = (B) qVar.f20765j.get(Integer.valueOf(i10));
                    MotionEvent motionEventL = qVar.l(f10, lVar, true);
                    SingleViewPresentation singleViewPresentation = b10.f20700a;
                    if (singleViewPresentation != null) {
                        singleViewPresentation.dispatchTouchEvent(motionEventL);
                        break;
                    }
                }
                break;
            default:
                p pVar = (p) this.f20739b;
                float f11 = pVar.f20742c.getResources().getDisplayMetrics().density;
                SparseArray sparseArray = pVar.f20748i;
                int i11 = lVar.f22991a;
                f fVar2 = (f) sparseArray.get(i11);
                if (fVar2 == null) {
                    V0.p.v(i11, "Sending touch to an unknown view with id: ", "PlatformViewsController2");
                } else {
                    View view2 = fVar2.getView();
                    if (view2 == null) {
                        V0.p.v(i11, "Sending touch to a null view with id: ", "PlatformViewsController2");
                    } else {
                        MotionEvent motionEventD = pVar.k.D(new I(lVar.f23005p));
                        List<List> list = (List) lVar.f22997g;
                        ArrayList arrayList = new ArrayList();
                        for (List list2 : list) {
                            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
                            pointerCoords.orientation = (float) ((Double) list2.get(0)).doubleValue();
                            pointerCoords.pressure = (float) ((Double) list2.get(1)).doubleValue();
                            pointerCoords.size = (float) ((Double) list2.get(2)).doubleValue();
                            double d10 = f11;
                            pointerCoords.toolMajor = (float) (((Double) list2.get(3)).doubleValue() * d10);
                            pointerCoords.toolMinor = (float) (((Double) list2.get(4)).doubleValue() * d10);
                            pointerCoords.touchMajor = (float) (((Double) list2.get(5)).doubleValue() * d10);
                            pointerCoords.touchMinor = (float) (((Double) list2.get(6)).doubleValue() * d10);
                            pointerCoords.x = (float) (((Double) list2.get(7)).doubleValue() * d10);
                            pointerCoords.y = (float) (((Double) list2.get(8)).doubleValue() * d10);
                            arrayList.add(pointerCoords);
                        }
                        int i12 = lVar.f22995e;
                        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) arrayList.toArray(new MotionEvent.PointerCoords[i12]);
                        if (motionEventD == null) {
                            List<List> list3 = (List) lVar.f22996f;
                            ArrayList arrayList2 = new ArrayList();
                            for (List list4 : list3) {
                                MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
                                pointerProperties.id = ((Integer) list4.get(0)).intValue();
                                pointerProperties.toolType = ((Integer) list4.get(1)).intValue();
                                arrayList2.add(pointerProperties);
                            }
                            motionEventD = MotionEvent.obtain(lVar.f22992b.longValue(), lVar.f22993c.longValue(), lVar.f22994d, lVar.f22995e, (MotionEvent.PointerProperties[]) arrayList2.toArray(new MotionEvent.PointerProperties[i12]), pointerCoordsArr, lVar.f22998h, lVar.f22999i, lVar.f23000j, lVar.k, lVar.f23001l, lVar.f23002m, lVar.f23003n, lVar.f23004o);
                        } else if (pointerCoordsArr.length >= 1) {
                            motionEventD.offsetLocation(pointerCoordsArr[0].x - motionEventD.getX(), pointerCoordsArr[0].y - motionEventD.getY());
                        }
                        view2.dispatchTouchEvent(motionEventD);
                    }
                }
                break;
        }
    }

    @Override // p150n8.n
    public void g(p150n8.m mVar, final Y7.d dVar) {
        h hVar;
        q qVar = (q) this.f20739b;
        int iM = qVar.m(mVar.f23007b);
        int iM2 = qVar.m(mVar.f23008c);
        int i10 = mVar.f23006a;
        if (!qVar.o(i10)) {
            f fVar = (f) qVar.f20766l.get(i10);
            j jVar = (j) qVar.f20769o.get(i10);
            if (fVar == null || jVar == null) {
                V0.p.v(i10, "Resizing unknown platform view with id: ", "PlatformViewsController");
                return;
            }
            if ((iM > jVar.getRenderTargetWidth() || iM2 > jVar.getRenderTargetHeight()) && (hVar = jVar.f20726f) != null) {
                hVar.b(iM, iM2);
            }
            ViewGroup.LayoutParams layoutParams = jVar.getLayoutParams();
            layoutParams.width = iM;
            layoutParams.height = iM2;
            jVar.setLayoutParams(layoutParams);
            View view = fVar.getView();
            if (view != null) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                layoutParams2.width = iM;
                layoutParams2.height = iM2;
                view.setLayoutParams(layoutParams2);
            }
            int iRound = (int) Math.round(((double) jVar.getRenderTargetWidth()) / ((double) qVar.h()));
            int iRound2 = (int) Math.round(((double) jVar.getRenderTargetHeight()) / ((double) qVar.h()));
            p150n8.o oVar = dVar.f13392b;
            HashMap map = new HashMap();
            map.put("width", Double.valueOf(iRound));
            map.put("height", Double.valueOf(iRound2));
            oVar.b(map);
            return;
        }
        final float fH = qVar.h();
        final B b10 = (B) qVar.f20765j.get(Integer.valueOf(i10));
        io.flutter.plugin.editing.l lVar = qVar.f20762g;
        if (lVar != null) {
            if (((io.flutter.plugin.editing.k) lVar.f20686e.f117c) == io.flutter.plugin.editing.k.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
                lVar.f20696p = true;
            }
            SingleViewPresentation singleViewPresentation = b10.f20700a;
            if (singleViewPresentation != null && singleViewPresentation.getView() != null) {
                b10.f20700a.getView().onInputConnectionLocked();
            }
        }
        Runnable runnable = new Runnable() { // from class: io.flutter.plugin.platform.n
            @Override // java.lang.Runnable
            public final void run() {
                q qVar2 = (q) this.f20734a.f20739b;
                io.flutter.plugin.editing.l lVar2 = qVar2.f20762g;
                B b11 = b10;
                if (lVar2 != null) {
                    if (((io.flutter.plugin.editing.k) lVar2.f20686e.f117c) == io.flutter.plugin.editing.k.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
                        lVar2.f20696p = false;
                    }
                    SingleViewPresentation singleViewPresentation2 = b11.f20700a;
                    if (singleViewPresentation2 != null && singleViewPresentation2.getView() != null) {
                        b11.f20700a.getView().onInputConnectionUnlocked();
                    }
                }
                double dH = qVar2.f20758c == null ? fH : qVar2.h();
                int iRound3 = (int) Math.round(((double) b11.f20705f.getWidth()) / dH);
                int iRound4 = (int) Math.round(((double) b11.f20705f.getHeight()) / dH);
                p150n8.o oVar2 = dVar.f13392b;
                HashMap map2 = new HashMap();
                map2.put("width", Double.valueOf(iRound3));
                map2.put("height", Double.valueOf(iRound4));
                oVar2.b(map2);
            }
        };
        int width = b10.f20705f.getWidth();
        h hVar2 = b10.f20705f;
        if (iM == width && iM2 == hVar2.getHeight()) {
            b10.a().postDelayed(runnable, 0L);
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            View viewA = b10.a();
            hVar2.b(iM, iM2);
            b10.f20707h.resize(iM, iM2, b10.f20703d);
            b10.f20707h.setSurface(hVar2.getSurface());
            viewA.postDelayed(runnable, 0L);
            return;
        }
        boolean zIsFocused = b10.a().isFocused();
        v vVarDetachState = b10.f20700a.detachState();
        b10.f20707h.setSurface(null);
        b10.f20707h.release();
        DisplayManager displayManager = (DisplayManager) b10.f20701b.getSystemService("display");
        hVar2.b(iM, iM2);
        b10.f20707h = displayManager.createVirtualDisplay("flutter-vd#" + b10.f20704e, iM, iM2, b10.f20703d, hVar2.getSurface(), 0, B.f20699i, null);
        View viewA2 = b10.a();
        viewA2.addOnAttachStateChangeListener(new x1(2, viewA2, runnable));
        SingleViewPresentation singleViewPresentation2 = new SingleViewPresentation(b10.f20701b, b10.f20707h.getDisplay(), b10.f20702c, vVarDetachState, b10.f20706g, zIsFocused);
        singleViewPresentation2.show();
        b10.f20700a.cancel();
        b10.f20700a = singleViewPresentation2;
    }

    @Override // io.flutter.plugin.platform.h
    public int getHeight() {
        return ((TextureRegistry$SurfaceProducer) this.f20739b).getHeight();
    }

    @Override // io.flutter.plugin.platform.h
    public long getId() {
        return ((TextureRegistry$SurfaceProducer) this.f20739b).id();
    }

    @Override // io.flutter.plugin.platform.h
    public Surface getSurface() {
        return ((TextureRegistry$SurfaceProducer) this.f20739b).getSurface();
    }

    @Override // io.flutter.plugin.platform.h
    public int getWidth() {
        return ((TextureRegistry$SurfaceProducer) this.f20739b).getWidth();
    }

    public CharSequence h(p150n8.d dVar) {
        AbstractActivityC1932d abstractActivityC1932d = (AbstractActivityC1932d) ((G) this.f20739b).f437c;
        ClipboardManager clipboardManager = (ClipboardManager) abstractActivityC1932d.getSystemService("clipboard");
        CharSequence charSequence = null;
        if (clipboardManager.hasPrimaryClip()) {
            try {
                try {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip != null) {
                        if (dVar != null) {
                            if (dVar == p150n8.d.PLAIN_TEXT) {
                            }
                        }
                        ClipData.Item itemAt = primaryClip.getItemAt(0);
                        CharSequence text = itemAt.getText();
                        if (text != null) {
                            return text;
                        }
                        try {
                            Uri uri = itemAt.getUri();
                            if (uri == null) {
                                Log.w("PlatformPlugin", "Clipboard item contained no textual content nor a URI to retrieve it from.");
                                return null;
                            }
                            String scheme = uri.getScheme();
                            if (!scheme.equals("content")) {
                                Log.w("PlatformPlugin", "Clipboard item contains a Uri with scheme '" + scheme + "'that is unhandled.");
                                return null;
                            }
                            AssetFileDescriptor assetFileDescriptorOpenTypedAssetFileDescriptor = abstractActivityC1932d.getContentResolver().openTypedAssetFileDescriptor(uri, "text/*", null);
                            CharSequence charSequenceCoerceToText = itemAt.coerceToText(abstractActivityC1932d);
                            if (assetFileDescriptorOpenTypedAssetFileDescriptor == null) {
                                return charSequenceCoerceToText;
                            }
                            try {
                                assetFileDescriptorOpenTypedAssetFileDescriptor.close();
                                return charSequenceCoerceToText;
                            } catch (IOException e2) {
                                charSequence = charSequenceCoerceToText;
                                e = e2;
                                Log.w("PlatformPlugin", "Failed to close AssetFileDescriptor while trying to read text from URI.", e);
                                return charSequence;
                            }
                        } catch (IOException e4) {
                            e = e4;
                            charSequence = text;
                        }
                    }
                } catch (FileNotFoundException unused) {
                    Log.w("PlatformPlugin", "Clipboard text was unable to be received from content URI.");
                    return charSequence;
                } catch (SecurityException e7) {
                    Log.w("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e7);
                    return charSequence;
                }
            } catch (IOException e10) {
                e = e10;
            }
        }
        return null;
    }

    public void i(String str, g gVar) {
        HashMap map = (HashMap) this.f20739b;
        if (map.containsKey(str)) {
            return;
        }
        map.put(str, gVar);
    }

    public void j(ArrayList arrayList) {
        G g3 = (G) this.f20739b;
        g3.getClass();
        int i10 = arrayList.isEmpty() ? 5894 : 1798;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            int i12 = e.f20716b[((p150n8.i) arrayList.get(i11)).ordinal()];
            if (i12 == 1) {
                i10 &= -5;
            } else if (i12 == 2) {
                i10 &= -515;
            }
        }
        g3.f436b = i10;
        g3.C();
    }

    @Override // p150n8.n
    public void k(p150n8.k kVar) {
        q qVar = (q) this.f20739b;
        qVar.getClass();
        q.f(19);
        q.a(qVar, kVar);
        if (qVar.f20760e.IsSurfaceControlEnabled()) {
            throw new IllegalStateException("Trying to create a Hybrid Composition view with HC++ enabled.");
        }
        qVar.c(kVar, false);
        q.f(19);
        if (qVar.f20760e.IsSurfaceControlEnabled()) {
            throw new IllegalStateException("Trying to create a Hybrid Composition view with HC++ enabled.");
        }
    }

    public void l(p150n8.h hVar) {
        int i10;
        G g3 = (G) this.f20739b;
        g3.getClass();
        if (hVar == p150n8.h.LEAN_BACK) {
            i10 = 1798;
        } else if (hVar == p150n8.h.IMMERSIVE) {
            i10 = 3846;
        } else if (hVar == p150n8.h.IMMERSIVE_STICKY) {
            i10 = 5894;
        } else if (hVar != p150n8.h.EDGE_TO_EDGE || Build.VERSION.SDK_INT < 29) {
            return;
        } else {
            i10 = 1792;
        }
        g3.f436b = i10;
        g3.C();
    }

    @Override // p150n8.n
    public void m(int i10, double d10, double d11) {
        q qVar = (q) this.f20739b;
        if (qVar.o(i10)) {
            return;
        }
        j jVar = (j) qVar.f20769o.get(i10);
        if (jVar == null) {
            V0.p.v(i10, "Setting offset for unknown platform view with id: ", "PlatformViewsController");
            return;
        }
        int iM = qVar.m(d10);
        int iM2 = qVar.m(d11);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) jVar.getLayoutParams();
        layoutParams.topMargin = iM;
        layoutParams.leftMargin = iM2;
        jVar.setLayoutParams(layoutParams);
    }

    public void n(p150n8.f fVar) {
        View decorView = ((AbstractActivityC1932d) ((G) this.f20739b).f437c).getWindow().getDecorView();
        switch (e.f20715a[fVar.ordinal()]) {
            case 1:
                decorView.performHapticFeedback(0);
                break;
            case 2:
                decorView.performHapticFeedback(1);
                break;
            case 3:
                decorView.performHapticFeedback(3);
                break;
            case 4:
                decorView.performHapticFeedback(6);
                break;
            case 5:
                decorView.performHapticFeedback(4);
                break;
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    decorView.performHapticFeedback(16);
                }
                break;
            case 7:
                if (Build.VERSION.SDK_INT >= 30) {
                    decorView.performHapticFeedback(3);
                }
                break;
            case 8:
                if (Build.VERSION.SDK_INT >= 30) {
                    decorView.performHapticFeedback(17);
                }
                break;
        }
    }

    @Override // p150n8.n
    public void q(int i10) {
        View view;
        switch (this.f20738a) {
            case 0:
                q qVar = (q) this.f20739b;
                if (qVar.o(i10)) {
                    view = ((B) qVar.f20765j.get(Integer.valueOf(i10))).a();
                } else {
                    f fVar = (f) qVar.f20766l.get(i10);
                    if (fVar == null) {
                        V0.p.v(i10, "Clearing focus on an unknown view with id: ", "PlatformViewsController");
                    } else {
                        view = fVar.getView();
                    }
                }
                if (view != null) {
                    view.clearFocus();
                } else {
                    V0.p.v(i10, "Clearing focus on a null view with id: ", "PlatformViewsController");
                }
                break;
            default:
                f fVar2 = (f) ((p) this.f20739b).f20748i.get(i10);
                if (fVar2 != null) {
                    View view2 = fVar2.getView();
                    if (view2 != null) {
                        view2.clearFocus();
                    } else {
                        V0.p.v(i10, "Clearing focus on a null view with id: ", "PlatformViewsController2");
                    }
                } else {
                    V0.p.v(i10, "Clearing focus on an unknown view with id: ", "PlatformViewsController2");
                }
                break;
        }
    }

    @Override // io.flutter.plugin.platform.h
    public void release() {
        ((TextureRegistry$SurfaceProducer) this.f20739b).release();
        this.f20739b = null;
    }

    @Override // io.flutter.plugin.platform.h
    public void scheduleFrame() {
        ((TextureRegistry$SurfaceProducer) this.f20739b).scheduleFrame();
    }

    @Override // p150n8.n
    public void y(int i10) {
        i iVar;
        switch (this.f20738a) {
            case 0:
                q qVar = (q) this.f20739b;
                f fVar = (f) qVar.f20766l.get(i10);
                if (fVar != null) {
                    if (fVar.getView() != null) {
                        View view = fVar.getView();
                        ViewGroup viewGroup = (ViewGroup) view.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(view);
                        }
                    }
                    qVar.f20766l.remove(i10);
                    try {
                        fVar.dispose();
                    } catch (RuntimeException e2) {
                        Log.e("PlatformViewsController", "Disposing platform view threw an exception", e2);
                    }
                    if (!qVar.o(i10)) {
                        SparseArray sparseArray = qVar.f20769o;
                        j jVar = (j) sparseArray.get(i10);
                        if (jVar == null) {
                            SparseArray sparseArray2 = qVar.f20767m;
                            p107j8.a aVar = (p107j8.a) sparseArray2.get(i10);
                            if (aVar != null) {
                                aVar.removeAllViews();
                                aVar.a();
                                ViewGroup viewGroup2 = (ViewGroup) aVar.getParent();
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(aVar);
                                }
                                sparseArray2.remove(i10);
                            }
                        } else {
                            jVar.removeAllViews();
                            h hVar = jVar.f20726f;
                            if (hVar != null) {
                                hVar.release();
                                jVar.f20726f = null;
                            }
                            ViewTreeObserver viewTreeObserver = jVar.getViewTreeObserver();
                            if (viewTreeObserver.isAlive() && (iVar = jVar.f20727g) != null) {
                                jVar.f20727g = null;
                                viewTreeObserver.removeOnGlobalFocusChangeListener(iVar);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) jVar.getParent();
                            if (viewGroup3 != null) {
                                viewGroup3.removeView(jVar);
                            }
                            sparseArray.remove(i10);
                        }
                    } else {
                        HashMap map = qVar.f20765j;
                        B b10 = (B) map.get(Integer.valueOf(i10));
                        View viewA = b10.a();
                        if (viewA != null) {
                            qVar.k.remove(viewA.getContext());
                        }
                        b10.f20700a.cancel();
                        b10.f20700a.detachState();
                        b10.f20707h.release();
                        b10.f20705f.release();
                        map.remove(Integer.valueOf(i10));
                    }
                } else {
                    V0.p.v(i10, "Disposing unknown platform view with id: ", "PlatformViewsController");
                }
                break;
            default:
                p pVar = (p) this.f20739b;
                f fVar2 = (f) pVar.f20748i.get(i10);
                if (fVar2 != null) {
                    if (fVar2.getView() != null) {
                        View view2 = fVar2.getView();
                        ViewGroup viewGroup4 = (ViewGroup) view2.getParent();
                        if (viewGroup4 != null) {
                            viewGroup4.removeView(view2);
                        }
                    }
                    pVar.f20748i.remove(i10);
                    try {
                        fVar2.dispose();
                    } catch (RuntimeException e4) {
                        Log.e("PlatformViewsController2", "Disposing platform view threw an exception", e4);
                    }
                    p107j8.a aVar2 = (p107j8.a) pVar.f20749j.get(i10);
                    if (aVar2 != null) {
                        aVar2.removeAllViews();
                        aVar2.a();
                        ViewGroup viewGroup5 = (ViewGroup) aVar2.getParent();
                        if (viewGroup5 != null) {
                            viewGroup5.removeView(aVar2);
                        }
                        pVar.f20749j.remove(i10);
                    }
                } else {
                    V0.p.v(i10, "Disposing unknown platform view with id: ", "PlatformViewsController2");
                }
                break;
        }
    }

    public o(int i10) {
        this.f20738a = i10;
        switch (i10) {
            case 4:
                break;
            default:
                this.f20739b = new HashMap();
                break;
        }
    }
}
