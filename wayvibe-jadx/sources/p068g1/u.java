package p068g1;

import B8.V;
import C.C0157o;
import D0.InterfaceC0195v;
import G0.AbstractC0451a;
import G0.m1;
import U.AbstractC0909s;
import U.C0880d;
import U.C0891i0;
import U.C0906q;
import U.C0908r0;
import U.D;
import U.InterfaceC0898m;
import U.U;
import Z8.a;
import Z8.e;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import app.nagakiba.wayvibe.R;
import com.apple.android.music.playback.model.MediaPlayerException;
import java.util.UUID;
import kotlin.jvm.internal.m;
import p009a5.o;
import p028c1.b;
import p028c1.i;
import p028c1.j;
import p028c1.k;
import p048e0.x;
import p133m0.c;

/* JADX INFO: loaded from: classes.dex */
public final class u extends AbstractC0451a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f20029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y f20030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f20031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f20032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w f20033e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final WindowManager f20034f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final WindowManager.LayoutParams f20035g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public x f20036h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public k f20037i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0891i0 f20038j;
    public final C0891i0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public i f20039l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final D f20040m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Rect f20041n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final x f20042o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f20043p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0891i0 f20044q;
    public boolean r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int[] f20045s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(a aVar, y yVar, String str, View view, b bVar, x xVar, UUID uuid) {
        super(view.getContext());
        w vVar = Build.VERSION.SDK_INT >= 29 ? new v() : new w();
        this.f20029a = aVar;
        this.f20030b = yVar;
        this.f20031c = str;
        this.f20032d = view;
        this.f20033e = vVar;
        Object systemService = view.getContext().getSystemService("window");
        m.d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f20034f = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        y yVar2 = this.f20030b;
        boolean zB = j.b(view);
        boolean z10 = yVar2.f20047b;
        int i10 = yVar2.f20046a;
        if (z10 && zB) {
            i10 |= 8192;
        } else if (z10 && !zB) {
            i10 &= -8193;
        }
        layoutParams.flags = i10;
        layoutParams.type = 1002;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.f20035g = layoutParams;
        this.f20036h = xVar;
        this.f20037i = k.Ltr;
        U u10 = U.f11815f;
        this.f20038j = C0880d.K(null, u10);
        this.k = C0880d.K(null, u10);
        this.f20040m = C0880d.D(new Z0.b(this, 6));
        this.f20041n = new Rect();
        this.f20042o = new x(new i(this, 2));
        setId(android.R.id.content);
        androidx.lifecycle.U.i(this, androidx.lifecycle.U.e(view));
        androidx.lifecycle.U.j(this, androidx.lifecycle.U.f(view));
        p206t6.b.Z(this, p206t6.b.C(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(bVar.O((float) 8));
        setOutlineProvider(new m1(2));
        this.f20044q = C0880d.K(n.f20007a, u10);
        this.f20045s = new int[2];
    }

    private final e getContent() {
        return (e) this.f20044q.getValue();
    }

    private final int getDisplayHeight() {
        return Math.round(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayWidth() {
        return Math.round(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC0195v getParentLayoutCoordinates() {
        return (InterfaceC0195v) this.k.getValue();
    }

    private final void setContent(e eVar) {
        this.f20044q.setValue(eVar);
    }

    private final void setParentLayoutCoordinates(InterfaceC0195v interfaceC0195v) {
        this.k.setValue(interfaceC0195v);
    }

    @Override // G0.AbstractC0451a
    public final void Content(InterfaceC0898m interfaceC0898m, int i10) {
        int i11;
        C0906q c0906q = (C0906q) interfaceC0898m;
        c0906q.V(-857613600);
        if ((i10 & 6) == 0) {
            i11 = (c0906q.h(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && c0906q.z()) {
            c0906q.N();
        } else {
            getContent().invoke(c0906q, 0);
        }
        C0908r0 c0908r0S = c0906q.s();
        if (c0908r0S != null) {
            c0908r0S.f11954d = new C0157o(this, i10, 6);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        if (keyEvent.getKeyCode() == 4 && this.f20030b.f20048c) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                a aVar = this.f20029a;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e(AbstractC0909s abstractC0909s, e eVar) {
        setParentCompositionContext(abstractC0909s);
        setContent(eVar);
        this.r = true;
    }

    public final void f(a aVar, y yVar, String str, k kVar) {
        this.f20029a = aVar;
        this.f20031c = str;
        if (!m.b(this.f20030b, yVar)) {
            WindowManager.LayoutParams layoutParams = this.f20035g;
            this.f20030b = yVar;
            boolean zB = j.b(this.f20032d);
            boolean z10 = yVar.f20047b;
            int i10 = yVar.f20046a;
            if (z10 && zB) {
                i10 |= 8192;
            } else if (z10 && !zB) {
                i10 &= -8193;
            }
            layoutParams.flags = i10;
            this.f20033e.getClass();
            this.f20034f.updateViewLayout(this, layoutParams);
        }
        int i11 = s.f20023a[kVar.ordinal()];
        int i12 = 1;
        if (i11 == 1) {
            i12 = 0;
        } else if (i11 != 2) {
            throw new V();
        }
        super.setLayoutDirection(i12);
    }

    public final void g() {
        InterfaceC0195v parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.q()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jV = parentLayoutCoordinates.v();
            long jG = parentLayoutCoordinates.g(0L);
            long jA = S9.b.a(Math.round(c.d(jG)), Math.round(c.e(jG)));
            int i10 = (int) (jA >> 32);
            int i11 = (int) (jA & 4294967295L);
            i iVar = new i(i10, i11, ((int) (jV >> 32)) + i10, ((int) (jV & 4294967295L)) + i11);
            if (iVar.equals(this.f20039l)) {
                return;
            }
            this.f20039l = iVar;
            i();
        }
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f20040m.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.f20035g;
    }

    public final k getParentLayoutDirection() {
        return this.f20037i;
    }

    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final j m910getPopupContentSizebOM6tXw() {
        return (j) this.f20038j.getValue();
    }

    public final x getPositionProvider() {
        return this.f20036h;
    }

    @Override // G0.AbstractC0451a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.r;
    }

    public final String getTestTag() {
        return this.f20031c;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    public final void h(InterfaceC0195v interfaceC0195v) {
        setParentLayoutCoordinates(interfaceC0195v);
        g();
    }

    public final void i() {
        j jVarM910getPopupContentSizebOM6tXw;
        i iVar = this.f20039l;
        if (iVar == null || (jVarM910getPopupContentSizebOM6tXw = m910getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        w wVar = this.f20033e;
        wVar.getClass();
        View view = this.f20032d;
        Rect rect = this.f20041n;
        view.getWindowVisibleDisplayFrame(rect);
        long jF = p025b9.a.f(rect.right - rect.left, rect.bottom - rect.top);
        kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
        xVar.f21872a = 0L;
        this.f20042o.c(this, b.f19981g, new t(xVar, this, iVar, jF, jVarM910getPopupContentSizebOM6tXw.f15858a));
        WindowManager.LayoutParams layoutParams = this.f20035g;
        long j10 = xVar.f21872a;
        layoutParams.x = (int) (j10 >> 32);
        layoutParams.y = (int) (j10 & 4294967295L);
        if (this.f20030b.f20050e) {
            wVar.a(this, (int) (jF >> 32), (int) (jF & 4294967295L));
        }
        this.f20034f.updateViewLayout(this, layoutParams);
    }

    @Override // G0.AbstractC0451a
    public final void internalOnLayout$ui_release(boolean z10, int i10, int i11, int i12, int i13) {
        super.internalOnLayout$ui_release(z10, i10, i11, i12, i13);
        this.f20030b.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f20035g;
        layoutParams.width = childAt.getMeasuredWidth();
        layoutParams.height = childAt.getMeasuredHeight();
        this.f20033e.getClass();
        this.f20034f.updateViewLayout(this, layoutParams);
    }

    @Override // G0.AbstractC0451a
    public final void internalOnMeasure$ui_release(int i10, int i11) {
        this.f20030b.getClass();
        super.internalOnMeasure$ui_release(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), MediaPlayerException.ERROR_UNKNOWN), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), MediaPlayerException.ERROR_UNKNOWN));
    }

    @Override // G0.AbstractC0451a, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f20042o.d();
        if (!this.f20030b.f20048c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.f20043p == null) {
            this.f20043p = k.a(this.f20029a);
        }
        k.b(this, this.f20043p);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        x xVar = this.f20042o;
        o oVar = xVar.f19550g;
        if (oVar != null) {
            oVar.b();
        }
        xVar.b();
        if (Build.VERSION.SDK_INT >= 33) {
            k.c(this, this.f20043p);
        }
        this.f20043p = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f20030b.f20049d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            a aVar = this.f20029a;
            if (aVar != null) {
                aVar.invoke();
                return true;
            }
        } else {
            if (motionEvent == null || motionEvent.getAction() != 4) {
                return super.onTouchEvent(motionEvent);
            }
            a aVar2 = this.f20029a;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        }
        return true;
    }

    public final void setParentLayoutDirection(k kVar) {
        this.f20037i = kVar;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m911setPopupContentSizefhxjrPA(j jVar) {
        this.f20038j.setValue(jVar);
    }

    public final void setPositionProvider(x xVar) {
        this.f20036h = xVar;
    }

    public final void setTestTag(String str) {
        this.f20031c = str;
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    public AbstractC0451a getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
    }
}
