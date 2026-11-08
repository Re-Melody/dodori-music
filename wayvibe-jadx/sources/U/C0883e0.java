package U;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: U.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0883e0 extends p048e0.B implements Parcelable, p048e0.q, InterfaceC0877b0, Y0 {
    public static final Parcelable.Creator<C0883e0> CREATOR = new C0881d0(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public I0 f11856b;

    public C0883e0(float f10) {
        I0 i10 = new I0(f10);
        if (p048e0.o.f19509a.get() != null) {
            I0 i11 = new I0(f10);
            i11.f19453a = 1;
            i10.f19454b = i11;
        }
        this.f11856b = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // U.Y0
    public Object getValue() {
        return Float.valueOf(m());
    }

    @Override // p048e0.A
    public final p048e0.C k() {
        return this.f11856b;
    }

    @Override // p048e0.q
    public final M0 l() {
        return U.f11815f;
    }

    public final float m() {
        return ((I0) p048e0.o.t(this.f11856b, this)).f11759c;
    }

    @Override // p048e0.A
    public final p048e0.C p(p048e0.C c3, p048e0.C c9, p048e0.C c10) {
        if (((I0) c9).f11759c == ((I0) c10).f11759c) {
            return c9;
        }
        return null;
    }

    @Override // p048e0.A
    public final void q(p048e0.C c3) {
        kotlin.jvm.internal.m.d(c3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f11856b = (I0) c3;
    }

    public final void r(float f10) {
        p048e0.i iVarK;
        I0 i10 = (I0) p048e0.o.i(this.f11856b);
        if (i10.f11759c == f10) {
            return;
        }
        I0 i11 = this.f11856b;
        synchronized (p048e0.o.f19510b) {
            iVarK = p048e0.o.k();
            ((I0) p048e0.o.o(i11, this, iVarK, i10)).f11759c = f10;
        }
        p048e0.o.n(iVarK, this);
    }

    @Override // U.InterfaceC0877b0
    public void setValue(Object obj) {
        r(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((I0) p048e0.o.i(this.f11856b)).f11759c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(m());
    }
}
