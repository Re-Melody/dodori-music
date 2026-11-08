package p120ka;

import B8.C0116c;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends i {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final HashSet f21808A;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public PointF f21809v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f21810w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public RectF f21811x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f21812y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final HashMap f21813z;

    static {
        HashSet hashSet = new HashSet();
        f21808A = hashSet;
        hashSet.add(13);
    }

    public d(Context context, C0116c c0116c) {
        super(context, c0116c);
        this.f21813z = new HashMap();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f  */
    @Override // p120ka.i, p120ka.f, p120ka.a
    public final boolean a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        HashMap map = this.f21813z;
        if (actionMasked == 0) {
            this.f21810w = true;
            map.put(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())), new b(motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex())));
        } else if (actionMasked == 1 || actionMasked == 3) {
            map.clear();
        } else if (actionMasked == 5) {
            this.f21810w = true;
            map.put(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())), new b(motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex())));
        } else if (actionMasked == 6) {
            this.f21810w = true;
            map.remove(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())));
        }
        return super.a(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x004f A[RETURN] */
    @Override // p120ka.f, p120ka.a
    public final boolean b(int i10) {
        if (super.b(13)) {
            Iterator it = this.f21813z.values().iterator();
            if (it.hasNext()) {
                b bVar = (b) it.next();
                boolean z10 = Math.abs(bVar.f21806d) >= this.f21812y || Math.abs(bVar.f21807e) >= this.f21812y;
                RectF rectF = this.f21811x;
                if (rectF != null) {
                    PointF pointF = this.f21823n;
                    if (!rectF.contains(pointF.x, pointF.y)) {
                        if (z10) {
                            return true;
                        }
                    }
                } else if (z10) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p120ka.f
    public final boolean c() {
        for (Integer num : this.f21821l) {
            int iIntValue = num.intValue();
            b bVar = (b) this.f21813z.get(num);
            MotionEvent motionEvent = this.f21798d;
            float x10 = motionEvent.getX(motionEvent.findPointerIndex(iIntValue));
            MotionEvent motionEvent2 = this.f21798d;
            float y6 = motionEvent2.getY(motionEvent2.findPointerIndex(iIntValue));
            float f10 = bVar.f21805c;
            bVar.f21805c = x10;
            bVar.f21806d = bVar.f21803a - x10;
            bVar.f21807e = bVar.f21804b - y6;
        }
        if (!this.f21830q) {
            if (!b(13) || !((c) this.f21802h).b(this)) {
                return false;
            }
            h();
            this.f21809v = this.f21823n;
            this.f21810w = false;
            return true;
        }
        PointF pointF = this.f21823n;
        PointF pointF2 = this.f21809v;
        float f11 = pointF2.x - pointF.x;
        float f12 = pointF2.y - pointF.y;
        this.f21809v = pointF;
        if (!this.f21810w) {
            return ((c) this.f21802h).a(this, f11, f12);
        }
        this.f21810w = false;
        return ((c) this.f21802h).a(this, 0.0f, 0.0f);
    }

    @Override // p120ka.f
    public final int d() {
        return 1;
    }

    @Override // p120ka.i
    public final void i() {
        super.i();
        ((c) this.f21802h).c(this);
    }

    @Override // p120ka.i
    public final HashSet j() {
        return f21808A;
    }

    @Override // p120ka.f
    public final void g() {
    }
}
