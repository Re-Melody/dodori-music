package p104j5;

import com.google.android.gms.internal.play_billing.zzkh;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzkh f21495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f21496b;

    public a(zzkh zzkhVar, c cVar) {
        if (zzkhVar == null) {
            throw new NullPointerException("Null payload");
        }
        this.f21495a = zzkhVar;
        if (cVar == null) {
            throw new NullPointerException("Null priority");
        }
        this.f21496b = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        return this.f21495a.equals(aVar.f21495a) && this.f21496b.equals(aVar.f21496b);
    }

    public final int hashCode() {
        return this.f21496b.hashCode() ^ (((1000003 * 1000003) ^ this.f21495a.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f21495a + ", priority=" + this.f21496b + "}";
    }
}
