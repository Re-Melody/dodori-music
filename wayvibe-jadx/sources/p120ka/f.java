package p120ka;

import B8.C0116c;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p098j.u;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f extends a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f21819i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f21820j;
    public final u k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f21821l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final HashMap f21822m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public PointF f21823n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public DisplayMetrics f21824o;

    public f(Context context, C0116c c0116c) {
        super(context, c0116c);
        this.k = new u();
        this.f21821l = new ArrayList();
        this.f21822m = new HashMap();
        this.f21823n = new PointF();
        this.f21819i = ViewConfiguration.get(context).getScaledEdgeSlop();
        f();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0059  */
    /* JADX WARN: Code duplicated, block: B:30:0x0063  */
    /* JADX WARN: Code duplicated, block: B:86:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:? A[LOOP:4: B:28:0x005d->B:88:?, LOOP_END, SYNTHETIC] */
    @Override // p120ka.a
    public boolean a(MotionEvent motionEvent) {
        long j10;
        boolean z10;
        Iterator it;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            f();
        }
        int pointerCount = motionEvent.getPointerCount();
        ArrayList arrayList = this.f21821l;
        int size = arrayList.size();
        this.k.getClass();
        if (size == 0) {
            j10 = 0;
        } else if (Math.abs(pointerCount - size) > 1) {
            j10 = 255;
        } else if (pointerCount > size) {
            j10 = 5;
        } else if (pointerCount < size) {
            j10 = 255;
        } else {
            j10 = ((pointerCount == 1 ? 1L : 6L) << 8) + 2;
        }
        long j11 = actionMasked;
        if (j11 == j10) {
            if (actionMasked == 2) {
                it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (motionEvent.findPointerIndex(((Integer) it.next()).intValue()) == -1) {
                            z10 = true;
                        }
                    }
                }
            }
            z10 = false;
        } else {
            while (true) {
                if (j10 != 0) {
                    if (j11 == (j10 & 255)) {
                        if (actionMasked == 2) {
                            it = arrayList.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (motionEvent.findPointerIndex(((Integer) it.next()).intValue()) == -1) {
                                    }
                                }
                            }
                        }
                        z10 = false;
                    } else {
                        j10 >>= 8;
                    }
                }
                z10 = true;
            }
        }
        HashMap map = this.f21822m;
        if (z10) {
            if (this instanceof i) {
                i iVar = (i) this;
                if (iVar.f21830q) {
                    iVar.i();
                }
            }
            arrayList.clear();
            map.clear();
        }
        if (!z10 || actionMasked == 0) {
            int actionMasked2 = motionEvent.getActionMasked();
            if (actionMasked2 == 0 || actionMasked2 == 5) {
                arrayList.add(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())));
            } else if (actionMasked2 == 1 || actionMasked2 == 6) {
                arrayList.remove(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())));
            }
        }
        int pointerCount2 = motionEvent.getPointerCount();
        float x10 = 0.0f;
        float y6 = 0.0f;
        for (int i10 = 0; i10 < pointerCount2; i10++) {
            x10 += motionEvent.getX(i10);
            y6 += motionEvent.getY(i10);
        }
        float f10 = pointerCount2;
        this.f21823n = new PointF(x10 / f10, y6 / f10);
        if (z10) {
            Log.w("MultiFingerGesture", "Some MotionEvents were not passed to the library or events from different view trees are merged.");
            return false;
        }
        if (actionMasked == 2 && arrayList.size() >= d() && this.f21798d.getPressure() / this.f21799e.getPressure() > 0.67f) {
            map.clear();
            int i11 = 0;
            while (i11 < arrayList.size() - 1) {
                int i12 = i11 + 1;
                for (int i13 = i12; i13 < arrayList.size(); i13++) {
                    Integer num = (Integer) arrayList.get(i11);
                    int iIntValue = num.intValue();
                    Integer num2 = (Integer) arrayList.get(i13);
                    int iIntValue2 = num2.intValue();
                    MotionEvent motionEvent2 = this.f21799e;
                    float x11 = motionEvent2.getX(motionEvent2.findPointerIndex(iIntValue));
                    MotionEvent motionEvent3 = this.f21799e;
                    float y10 = motionEvent3.getY(motionEvent3.findPointerIndex(iIntValue));
                    MotionEvent motionEvent4 = this.f21799e;
                    float x12 = motionEvent4.getX(motionEvent4.findPointerIndex(iIntValue2));
                    MotionEvent motionEvent5 = this.f21799e;
                    float f11 = x12 - x11;
                    float y11 = motionEvent5.getY(motionEvent5.findPointerIndex(iIntValue2)) - y10;
                    MotionEvent motionEvent6 = this.f21798d;
                    float x13 = motionEvent6.getX(motionEvent6.findPointerIndex(iIntValue));
                    MotionEvent motionEvent7 = this.f21798d;
                    float y12 = motionEvent7.getY(motionEvent7.findPointerIndex(iIntValue));
                    MotionEvent motionEvent8 = this.f21798d;
                    float x14 = motionEvent8.getX(motionEvent8.findPointerIndex(iIntValue2));
                    MotionEvent motionEvent9 = this.f21798d;
                    map.put(new h(num, num2), new e(f11, y11, x14 - x13, motionEvent9.getY(motionEvent9.findPointerIndex(iIntValue2)) - y12));
                }
                i11 = i12;
            }
            if (!e()) {
                return c();
            }
        }
        return false;
    }

    @Override // p120ka.a
    public boolean b(int i10) {
        return super.b(i10) && !e();
    }

    public boolean c() {
        return false;
    }

    public int d() {
        return 2;
    }

    public boolean e() {
        DisplayMetrics displayMetrics = this.f21824o;
        float f10 = displayMetrics.widthPixels;
        float f11 = this.f21819i;
        float f12 = f10 - f11;
        float f13 = displayMetrics.heightPixels - f11;
        Iterator it = this.f21821l.iterator();
        while (it.hasNext()) {
            int iFindPointerIndex = this.f21798d.findPointerIndex(((Integer) it.next()).intValue());
            MotionEvent motionEvent = this.f21798d;
            float x10 = iFindPointerIndex < motionEvent.getPointerCount() ? motionEvent.getX(iFindPointerIndex) + (motionEvent.getRawX() - motionEvent.getX()) : 0.0f;
            MotionEvent motionEvent2 = this.f21798d;
            float y6 = iFindPointerIndex < motionEvent2.getPointerCount() ? motionEvent2.getY(iFindPointerIndex) + (motionEvent2.getRawY() - motionEvent2.getY()) : 0.0f;
            if (x10 < f11 || y6 < f11 || x10 > f12 || y6 > f13) {
                return true;
            }
        }
        Iterator it2 = this.f21822m.values().iterator();
        while (it2.hasNext()) {
            if (((e) it2.next()).f21818e < this.f21820j) {
                return true;
            }
        }
        return false;
    }

    public final void f() {
        WindowManager windowManager = this.f21796b;
        if (windowManager == null) {
            this.f21824o = this.f21795a.getResources().getDisplayMetrics();
        } else {
            this.f21824o = new DisplayMetrics();
            windowManager.getDefaultDisplay().getRealMetrics(this.f21824o);
        }
    }

    public abstract void g();
}
