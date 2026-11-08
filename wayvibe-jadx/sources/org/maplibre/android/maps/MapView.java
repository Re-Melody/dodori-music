package org.maplibre.android.maps;

import B8.V;
import D8.Z;
import android.animation.Animator;
import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import app.nagakiba.wayvibe.R;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.tika.utils.XMLReaderUtils;
import org.maplibre.android.MapLibre;
import org.maplibre.android.camera.CameraPosition;
import org.maplibre.android.maps.renderer.MapRenderer;
import org.maplibre.android.storage.FileSource;

/* JADX INFO: loaded from: classes2.dex */
public class MapView extends FrameLayout {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f24855t = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2208f f24856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D f24857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C f24858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public H f24859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w f24860e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f24861f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public z f24862g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public x f24863h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public MapRenderer f24864i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f24865j;
    public qa.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public PointF f24866l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final B f24867m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C2203a f24868n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C2206d f24869o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C2216n f24870p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C2217o f24871q;
    public Bundle r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f24872s;

    public MapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24856a = new C2208f();
        this.f24857b = new D(this);
        this.f24858c = new C(this);
        this.f24867m = new B(this);
        this.f24868n = new C2203a(this);
        this.f24869o = new C2206d();
        Ha.b.f6244a.getClass();
        Ha.a.a(new Object[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p046da.d.f19444c, 0, 0);
        x xVar = new x();
        float f10 = context.getResources().getDisplayMetrics().density;
        xVar.f25041M = context.getFilesDir().getAbsolutePath();
        try {
            ga.a aVar = new ga.a(typedArrayObtainStyledAttributes);
            xVar.f25045a = new CameraPosition(aVar.f20133b, aVar.f20135d, aVar.f20134c, aVar.f20132a, null);
            xVar.f25034F = typedArrayObtainStyledAttributes.getString(5);
            String string = typedArrayObtainStyledAttributes.getString(4);
            if (!TextUtils.isEmpty(string)) {
                xVar.f25034F = string;
            }
            xVar.f25065w = typedArrayObtainStyledAttributes.getBoolean(53, true);
            xVar.f25062t = typedArrayObtainStyledAttributes.getBoolean(51, true);
            xVar.f25063u = typedArrayObtainStyledAttributes.getBoolean(42, true);
            xVar.f25061s = typedArrayObtainStyledAttributes.getBoolean(50, true);
            xVar.f25064v = typedArrayObtainStyledAttributes.getBoolean(52, true);
            xVar.f25066x = typedArrayObtainStyledAttributes.getBoolean(41, true);
            xVar.f25067y = typedArrayObtainStyledAttributes.getBoolean(49, true);
            xVar.f25059p = typedArrayObtainStyledAttributes.getFloat(13, 25.5f);
            xVar.f25058o = typedArrayObtainStyledAttributes.getFloat(14, 0.0f);
            xVar.r = typedArrayObtainStyledAttributes.getFloat(7, 60.0f);
            xVar.f25060q = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
            xVar.f25047c = typedArrayObtainStyledAttributes.getBoolean(33, true);
            xVar.f25049e = typedArrayObtainStyledAttributes.getInt(36, 8388661);
            float f11 = 4.0f * f10;
            xVar.f25050f = new int[]{(int) typedArrayObtainStyledAttributes.getDimension(38, f11), (int) typedArrayObtainStyledAttributes.getDimension(40, f11), (int) typedArrayObtainStyledAttributes.getDimension(39, f11), (int) typedArrayObtainStyledAttributes.getDimension(37, f11)};
            xVar.f25048d = typedArrayObtainStyledAttributes.getBoolean(35, true);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(34);
            if (drawable == null) {
                Resources resources = context.getResources();
                ThreadLocal threadLocal = A1.n.f140a;
                drawable = resources.getDrawable(2131230908, null);
            }
            xVar.f25051g = drawable;
            xVar.f25052h = typedArrayObtainStyledAttributes.getBoolean(43, true);
            xVar.f25053i = typedArrayObtainStyledAttributes.getInt(44, 8388691);
            xVar.f25054j = new int[]{(int) typedArrayObtainStyledAttributes.getDimension(46, f11), (int) typedArrayObtainStyledAttributes.getDimension(48, f11), (int) typedArrayObtainStyledAttributes.getDimension(47, f11), (int) typedArrayObtainStyledAttributes.getDimension(45, f11)};
            xVar.k = typedArrayObtainStyledAttributes.getColor(32, -1);
            xVar.f25055l = typedArrayObtainStyledAttributes.getBoolean(26, true);
            xVar.f25056m = typedArrayObtainStyledAttributes.getInt(27, 8388691);
            xVar.f25057n = new int[]{(int) typedArrayObtainStyledAttributes.getDimension(29, f10 * 92.0f), (int) typedArrayObtainStyledAttributes.getDimension(31, f11), (int) typedArrayObtainStyledAttributes.getDimension(30, f11), (int) typedArrayObtainStyledAttributes.getDimension(28, f11)};
            xVar.f25035G = typedArrayObtainStyledAttributes.getBoolean(24, false);
            xVar.f25036H = typedArrayObtainStyledAttributes.getBoolean(25, false);
            xVar.f25068z = typedArrayObtainStyledAttributes.getBoolean(16, true);
            xVar.f25029A = typedArrayObtainStyledAttributes.getInt(23, 4);
            xVar.f25030B = typedArrayObtainStyledAttributes.getBoolean(17, false);
            xVar.f25031C = typedArrayObtainStyledAttributes.getBoolean(19, true);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(20, 0);
            if (resourceId != 0) {
                xVar.f25032D = org.maplibre.android.utils.a.a(context.getResources().getStringArray(resourceId));
            } else {
                String string2 = typedArrayObtainStyledAttributes.getString(21);
                xVar.f25032D = org.maplibre.android.utils.a.a(string2 == null ? "sans-serif" : string2);
            }
            xVar.f25038J = typedArrayObtainStyledAttributes.getFloat(22, 0.0f);
            xVar.f25037I = typedArrayObtainStyledAttributes.getInt(18, -988703);
            xVar.f25039K = typedArrayObtainStyledAttributes.getBoolean(15, true);
            xVar.f25040L = typedArrayObtainStyledAttributes.getBoolean(0, false);
            xVar.f25042N = typedArrayObtainStyledAttributes.getInteger(2, 1048576);
            xVar.f25043O = typedArrayObtainStyledAttributes.getInteger(1, 5);
            xVar.f25044P = typedArrayObtainStyledAttributes.getInteger(3, 60);
            typedArrayObtainStyledAttributes.recycle();
            d(context, xVar);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static void setMapStrictModeEnabled(boolean z10) {
        synchronized (p046da.b.class) {
            p046da.b.f19433a = z10;
        }
    }

    public final ImageView a() {
        ImageView imageView = new ImageView(getContext());
        addView(imageView);
        imageView.setTag("attrView");
        imageView.getLayoutParams().width = -2;
        imageView.getLayoutParams().height = -2;
        imageView.setAdjustViewBounds(true);
        imageView.setClickable(true);
        imageView.setFocusable(true);
        imageView.setContentDescription(getResources().getString(R.string.maplibre_attributionsIconContentDescription));
        imageView.setImageDrawable(p046da.b.B(getContext(), R.drawable.maplibre_info_bg_selector, null));
        z zVar = new z(getContext(), this.f24860e);
        this.f24862g = zVar;
        imageView.setOnClickListener(zVar);
        return imageView;
    }

    public final qa.a b() {
        Context context = getContext();
        qa.a aVar = new qa.a(context);
        aVar.f25705a = 0.0f;
        aVar.f25706b = true;
        aVar.f25709e = false;
        aVar.setEnabled(false);
        int i10 = (int) (context.getResources().getDisplayMetrics().density * 48.0f);
        aVar.setLayoutParams(new ViewGroup.LayoutParams(i10, i10));
        this.k = aVar;
        addView(aVar);
        this.k.setTag("compassView");
        this.k.getLayoutParams().width = -2;
        this.k.getLayoutParams().height = -2;
        this.k.setContentDescription(getResources().getString(R.string.maplibre_compassContentDescription));
        qa.a aVar2 = this.k;
        C2206d c2206d = this.f24869o;
        aVar2.f25708d = new J(this, c2206d);
        aVar2.setOnClickListener(new z(this, c2206d));
        return this.k;
    }

    public final ImageView c() {
        ImageView imageView = new ImageView(getContext());
        addView(imageView);
        imageView.setTag("logoView");
        imageView.getLayoutParams().width = -2;
        imageView.getLayoutParams().height = -2;
        imageView.setImageDrawable(p046da.b.B(getContext(), 2131230915, null));
        return imageView;
    }

    public final void d(Context context, x xVar) {
        if (isInEditMode()) {
            return;
        }
        if (!MapLibre.hasInstance()) {
            throw new V();
        }
        setForeground(new ColorDrawable(xVar.f25037I));
        this.f24863h = xVar;
        setContentDescription(context.getString(R.string.maplibre_mapActionDescription));
        setWillNotDraw(false);
        MapRenderer mapRendererCreate = MapRenderer.create(xVar, getContext(), new p036d.o(this, 13));
        this.f24864i = mapRendererCreate;
        View view = mapRendererCreate.getView();
        this.f24861f = view;
        addView(view, 0);
        xVar.f25038J = getPixelRatio();
        this.f24859d = new NativeMapView(getContext(), xVar, this, this.f24856a, this.f24864i);
    }

    public final void e() {
        this.f24865j = true;
        C2208f c2208f = this.f24856a;
        c2208f.f24939a.clear();
        c2208f.f24940b.clear();
        c2208f.f24941c.clear();
        c2208f.f24942d.clear();
        c2208f.f24943e.clear();
        c2208f.f24944f.clear();
        c2208f.f24945g.clear();
        c2208f.f24946h.clear();
        c2208f.f24948j.clear();
        c2208f.k.clear();
        c2208f.f24949l.clear();
        c2208f.f24950m.clear();
        c2208f.f24951n.clear();
        c2208f.f24952o.clear();
        c2208f.f24953p.clear();
        c2208f.f24954q.clear();
        c2208f.r.clear();
        c2208f.f24955s.clear();
        c2208f.f24956t.clear();
        c2208f.f24957u.clear();
        c2208f.f24958v.clear();
        c2208f.f24959w.clear();
        c2208f.f24960x.clear();
        c2208f.f24961y.clear();
        c2208f.f24962z.clear();
        D d10 = this.f24857b;
        d10.f24845a.clear();
        MapView mapView = d10.f24846b;
        mapView.f24856a.f24950m.remove(d10);
        C2208f c2208f2 = mapView.f24856a;
        c2208f2.f24947i.remove(d10);
        c2208f2.f24943e.remove(d10);
        c2208f2.f24940b.remove(d10);
        c2208f2.f24941c.remove(d10);
        c2208f2.f24944f.remove(d10);
        C c3 = this.f24858c;
        c3.f24844b.f24856a.f24947i.remove(c3);
        qa.a aVar = this.k;
        if (aVar != null) {
            aVar.b();
        }
        w wVar = this.f24860e;
        if (wVar != null) {
            wVar.f25026j.getClass();
            M m8 = wVar.f25027l;
            if (m8 != null) {
                m8.f();
            }
            C2206d c2206d = wVar.f25021e;
            c2206d.f24932a.removeCallbacksAndMessages(null);
            c2206d.f24935d.clear();
            c2206d.f24936e.clear();
            c2206d.f24937f.clear();
            c2206d.f24938g.clear();
        }
        H h10 = this.f24859d;
        if (h10 != null) {
            ((NativeMapView) h10).i();
            this.f24859d = null;
        }
        MapRenderer mapRenderer = this.f24864i;
        if (mapRenderer != null) {
            mapRenderer.onDestroy();
        }
    }

    public final void f() {
        H h10 = this.f24859d;
        if (h10 == null || this.f24860e == null || this.f24865j) {
            return;
        }
        ((NativeMapView) h10).D();
    }

    public final void g() {
        if (!this.f24872s) {
            org.maplibre.android.net.b.c(getContext()).a();
            FileSource.b(getContext()).activate();
            this.f24872s = true;
        }
        w wVar = this.f24860e;
        if (wVar != null) {
            org.maplibre.android.location.w wVar2 = wVar.f25026j;
            wVar2.f24739p = true;
            wVar2.d();
        }
        MapRenderer mapRenderer = this.f24864i;
        if (mapRenderer != null) {
            mapRenderer.onStart();
        }
    }

    public w getMapLibreMap() {
        return this.f24860e;
    }

    public float getPixelRatio() {
        float f10 = this.f24863h.f25038J;
        return f10 == 0.0f ? getResources().getDisplayMetrics().density : f10;
    }

    public View getRenderView() {
        return this.f24861f;
    }

    public org.maplibre.android.maps.renderer.a getRenderingRefreshMode() {
        MapRenderer mapRenderer = this.f24864i;
        if (mapRenderer != null) {
            return mapRenderer.getRenderingRefreshMode();
        }
        throw new IllegalStateException("Calling MapView#getRenderingRefreshMode before mapRenderer is created.");
    }

    public Bitmap getViewContent() {
        setDrawingCacheEnabled(true);
        setDrawingCacheQuality(524288);
        buildDrawingCache();
        if (getDrawingCache() == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getDrawingCache());
        setDrawingCacheEnabled(false);
        destroyDrawingCache();
        return bitmapCreateBitmap;
    }

    public final void h() {
        z zVar = this.f24862g;
        if (zVar != null) {
            ((Q) zVar.f25072c).getClass();
            ViewOnClickListenerC2205c viewOnClickListenerC2205c = (ViewOnClickListenerC2205c) zVar.f25071b;
            AlertDialog alertDialog = viewOnClickListenerC2205c.f24931d;
            if (alertDialog != null && alertDialog.isShowing()) {
                viewOnClickListenerC2205c.f24931d.dismiss();
            }
        }
        if (this.f24860e != null) {
            this.f24870p.a();
            org.maplibre.android.location.w wVar = this.f24860e.f25026j;
            wVar.e();
            wVar.f24739p = false;
        }
        MapRenderer mapRenderer = this.f24864i;
        if (mapRenderer != null) {
            mapRenderer.onStop();
        }
        if (this.f24872s) {
            org.maplibre.android.net.b.c(getContext()).b();
            FileSource.b(getContext()).deactivate();
            this.f24872s = false;
        }
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        C2216n c2216n = this.f24870p;
        if (c2216n == null) {
            return super.onGenericMotionEvent(motionEvent);
        }
        c2216n.getClass();
        if ((motionEvent.getSource() & 2) != 2 || motionEvent.getActionMasked() != 8 || !c2216n.f24988c.f24905m) {
            return super.onGenericMotionEvent(motionEvent);
        }
        P p10 = c2216n.f24986a;
        p10.c();
        p10.n(motionEvent.getAxisValue(9), new PointF(motionEvent.getX(), motionEvent.getY()));
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        C2217o c2217o = this.f24871q;
        if (c2217o == null) {
            return super.onKeyDown(i10, keyEvent);
        }
        c2217o.getClass();
        double d10 = keyEvent.getRepeatCount() >= 5 ? 50.0d : 10.0d;
        if (i10 != 66) {
            P p10 = c2217o.f25005a;
            Q q5 = c2217o.f25006b;
            switch (i10) {
                case 19:
                    if (q5.f24906n) {
                        p10.c();
                        p10.i(0.0d, d10, 0L);
                        return true;
                    }
                    break;
                case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                    if (q5.f24906n) {
                        p10.c();
                        p10.i(0.0d, -d10, 0L);
                        return true;
                    }
                    break;
                case 21:
                    if (q5.f24906n) {
                        p10.c();
                        p10.i(d10, 0.0d, 0L);
                        return true;
                    }
                    break;
                case 22:
                    if (q5.f24906n) {
                        p10.c();
                        p10.i(-d10, 0.0d, 0L);
                        return true;
                    }
                    break;
            }
            return super.onKeyDown(i10, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyLongPress(int i10, KeyEvent keyEvent) {
        C2217o c2217o = this.f24871q;
        if (c2217o == null) {
            return super.onKeyLongPress(i10, keyEvent);
        }
        c2217o.getClass();
        if (i10 == 23 || i10 == 66) {
            Q q5 = c2217o.f25006b;
            if (q5.f24905m) {
                J j10 = q5.f24896c;
                c2217o.f25007c.h(false, new PointF(j10.f() / 2.0f, j10.c() / 2.0f), true);
                return true;
            }
        }
        return super.onKeyLongPress(i10, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        C2217o c2217o = this.f24871q;
        if (c2217o == null) {
            return super.onKeyUp(i10, keyEvent);
        }
        c2217o.getClass();
        if (!keyEvent.isCanceled() && (i10 == 23 || i10 == 66)) {
            Q q5 = c2217o.f25006b;
            if (q5.f24905m) {
                J j10 = q5.f24896c;
                c2217o.f25007c.h(true, new PointF(j10.f() / 2.0f, j10.c() / 2.0f), true);
                return true;
            }
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        H h10;
        if (isInEditMode() || (h10 = this.f24859d) == null) {
            return;
        }
        ((NativeMapView) h10).N(i10, i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zL;
        C2216n c2216n = this.f24870p;
        if (c2216n == null) {
            return super.onTouchEvent(motionEvent);
        }
        c2216n.getClass();
        if (motionEvent != null && (motionEvent.getButtonState() == 0 || motionEvent.getButtonState() == 1)) {
            int actionMasked = motionEvent.getActionMasked();
            P p10 = c2216n.f24986a;
            if (actionMasked == 0) {
                c2216n.a();
                ((NativeMapView) p10.f24883a).Q(true);
            }
            zL = c2216n.f24999o.l(motionEvent);
            int actionMasked2 = motionEvent.getActionMasked();
            ArrayList arrayList = c2216n.r;
            if (actionMasked2 == 1) {
                if (c2216n.f25003t) {
                    ((p120ka.d) c2216n.f24999o.f782i).f21801g = true;
                    c2216n.f25003t = false;
                }
                ((NativeMapView) p10.f24883a).Q(false);
                p10.h();
                if (!arrayList.isEmpty()) {
                    c2216n.f25002s.removeCallbacksAndMessages(null);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((Animator) it.next()).start();
                    }
                    arrayList.clear();
                }
            } else if (actionMasked2 == 3) {
                arrayList.clear();
                ((NativeMapView) p10.f24883a).Q(false);
                p10.h();
                if (c2216n.f25003t) {
                    ((p120ka.d) c2216n.f24999o.f782i).f21801g = true;
                    c2216n.f25003t = false;
                }
            } else if (actionMasked2 == 5 && c2216n.f25003t) {
                ((p120ka.d) c2216n.f24999o.f782i).f21801g = true;
                c2216n.f25003t = false;
            }
        } else {
            zL = false;
        }
        return zL || super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004d A[RETURN] */
    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        C2217o c2217o = this.f24871q;
        if (c2217o == null) {
            return super.onTrackballEvent(motionEvent);
        }
        c2217o.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            Z z10 = c2217o.f25008d;
            if (z10 != null) {
                z10.f2420b = true;
                c2217o.f25008d = null;
            }
            c2217o.f25008d = new Z(c2217o);
            new Handler(Looper.getMainLooper()).postDelayed(c2217o.f25008d, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        Q q5 = c2217o.f25006b;
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked == 3) {
                    Z z11 = c2217o.f25008d;
                    if (z11 != null) {
                        z11.f2420b = true;
                        c2217o.f25008d = null;
                        return true;
                    }
                }
            } else if (q5.f24906n) {
                P p10 = c2217o.f25005a;
                p10.c();
                p10.i(((double) motionEvent.getX()) * (-10.0d), ((double) motionEvent.getY()) * (-10.0d), 0L);
                return true;
            }
            if (super.onTrackballEvent(motionEvent)) {
                return false;
            }
        } else if (q5.f24905m) {
            if (c2217o.f25008d != null) {
                J j10 = q5.f24896c;
                c2217o.f25007c.h(true, new PointF(j10.f() / 2.0f, j10.c() / 2.0f), true);
            }
        } else if (super.onTrackballEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setMapLibreMap(w wVar) {
        this.f24860e = wVar;
    }

    public void setMaximumFps(int i10) {
        MapRenderer mapRenderer = this.f24864i;
        if (mapRenderer == null) {
            throw new IllegalStateException("Calling MapView#setMaximumFps before mapRenderer is created.");
        }
        mapRenderer.setMaximumFps(i10);
    }

    public void setRenderingRefreshMode(org.maplibre.android.maps.renderer.a aVar) {
        MapRenderer mapRenderer = this.f24864i;
        if (mapRenderer == null) {
            throw new IllegalStateException("Calling MapView#setRenderingRefreshMode before mapRenderer is created.");
        }
        mapRenderer.setRenderingRefreshMode(aVar);
    }

    public MapView(Context context, x xVar) {
        super(context);
        this.f24856a = new C2208f();
        this.f24857b = new D(this);
        this.f24858c = new C(this);
        this.f24867m = new B(this);
        this.f24868n = new C2203a(this);
        this.f24869o = new C2206d();
        Ha.b.f6244a.getClass();
        Ha.a.a(new Object[0]);
        d(context, xVar);
    }
}
