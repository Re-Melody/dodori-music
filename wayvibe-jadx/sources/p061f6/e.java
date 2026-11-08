package p061f6;

import B2.AbstractC0112b;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f19841a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TimeInterpolator f19843c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19844d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19845e = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f19842b = 150;

    public e(long j10) {
        this.f19841a = j10;
    }

    public final void a(ObjectAnimator objectAnimator) {
        objectAnimator.setStartDelay(this.f19841a);
        objectAnimator.setDuration(this.f19842b);
        objectAnimator.setInterpolator(b());
        objectAnimator.setRepeatCount(this.f19844d);
        objectAnimator.setRepeatMode(this.f19845e);
    }

    public final TimeInterpolator b() {
        TimeInterpolator timeInterpolator = this.f19843c;
        return timeInterpolator != null ? timeInterpolator : a.f19832a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f19841a == eVar.f19841a && this.f19842b == eVar.f19842b && this.f19844d == eVar.f19844d && this.f19845e == eVar.f19845e) {
            return b().getClass().equals(eVar.b().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f19841a;
        long j11 = this.f19842b;
        return ((((b().getClass().hashCode() + (((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31)) * 31) + this.f19844d) * 31) + this.f19845e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(e.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.f19841a);
        sb.append(" duration: ");
        sb.append(this.f19842b);
        sb.append(" interpolator: ");
        sb.append(b().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.f19844d);
        sb.append(" repeatMode: ");
        return AbstractC0112b.i(sb, this.f19845e, "}\n");
    }
}
