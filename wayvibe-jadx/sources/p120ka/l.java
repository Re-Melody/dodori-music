package p120ka;

import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends i {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final HashSet f21842y;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f21843v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f21844w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f21845x;

    static {
        HashSet hashSet = new HashSet();
        f21842y = hashSet;
        hashSet.add(14);
    }

    @Override // p120ka.f, p120ka.a
    public final boolean b(int i10) {
        return Math.abs(this.f21845x) >= this.f21844w && super.b(14);
    }

    @Override // p120ka.f
    public final boolean c() {
        MotionEvent motionEvent = this.f21799e;
        ArrayList arrayList = this.f21821l;
        float x10 = motionEvent.getX(motionEvent.findPointerIndex(((Integer) arrayList.get(0)).intValue()));
        MotionEvent motionEvent2 = this.f21799e;
        float x11 = (motionEvent2.getX(motionEvent2.findPointerIndex(((Integer) arrayList.get(1)).intValue())) + x10) / 2.0f;
        MotionEvent motionEvent3 = this.f21798d;
        float x12 = motionEvent3.getX(motionEvent3.findPointerIndex(((Integer) arrayList.get(0)).intValue()));
        MotionEvent motionEvent4 = this.f21798d;
        float x13 = ((motionEvent4.getX(motionEvent4.findPointerIndex(((Integer) arrayList.get(1)).intValue())) + x12) / 2.0f) - x11;
        this.f21845x += x13;
        if (this.f21830q && x13 != 0.0f) {
            this.f21802h.getClass();
            throw new ClassCastException();
        }
        if (!b(14)) {
            return false;
        }
        this.f21802h.getClass();
        throw new ClassCastException();
    }

    @Override // p120ka.f
    public final boolean e() {
        if (!super.e()) {
            HashMap map = this.f21822m;
            ArrayList arrayList = this.f21821l;
            e eVar = (e) map.get(new h((Integer) arrayList.get(0), (Integer) arrayList.get(1)));
            if (Math.abs(Math.toDegrees(Math.abs(Math.atan2(eVar.f21817d, eVar.f21816c))) - 90.0d) <= this.f21843v) {
                return false;
            }
        }
        return true;
    }

    @Override // p120ka.f
    public final void g() {
        this.f21845x = 0.0f;
    }

    @Override // p120ka.i
    public final void i() {
        super.i();
        this.f21802h.getClass();
        throw new ClassCastException();
    }

    @Override // p120ka.i
    public final HashSet j() {
        return f21842y;
    }
}
