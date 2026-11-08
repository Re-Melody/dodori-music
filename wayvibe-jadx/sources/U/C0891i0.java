package U;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: U.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0891i0 extends p048e0.B implements Parcelable, p048e0.q {
    public static final Parcelable.Creator<C0891i0> CREATOR = new C0889h0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M0 f11872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public L0 f11873c;

    public C0891i0(Object obj, M0 m8) {
        this.f11872b = m8;
        L0 l10 = new L0(obj);
        if (p048e0.o.f19509a.get() != null) {
            L0 l11 = new L0(obj);
            l11.f19453a = 1;
            l10.f19454b = l11;
        }
        this.f11873c = l10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // U.Y0
    public final Object getValue() {
        return ((L0) p048e0.o.t(this.f11873c, this)).f11771c;
    }

    @Override // p048e0.A
    public final p048e0.C k() {
        return this.f11873c;
    }

    @Override // p048e0.q
    public final M0 l() {
        return this.f11872b;
    }

    @Override // p048e0.A
    public final p048e0.C p(p048e0.C c3, p048e0.C c9, p048e0.C c10) {
        if (this.f11872b.a(((L0) c9).f11771c, ((L0) c10).f11771c)) {
            return c9;
        }
        return null;
    }

    @Override // p048e0.A
    public final void q(p048e0.C c3) {
        kotlin.jvm.internal.m.d(c3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.f11873c = (L0) c3;
    }

    @Override // U.InterfaceC0877b0
    public final void setValue(Object obj) {
        p048e0.i iVarK;
        L0 l10 = (L0) p048e0.o.i(this.f11873c);
        if (this.f11872b.a(l10.f11771c, obj)) {
            return;
        }
        L0 l11 = this.f11873c;
        synchronized (p048e0.o.f19510b) {
            iVarK = p048e0.o.k();
            ((L0) p048e0.o.o(l11, this, iVarK, l10)).f11771c = obj;
        }
        p048e0.o.n(iVarK, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((L0) p048e0.o.i(this.f11873c)).f11771c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11;
        parcel.writeValue(getValue());
        U u10 = U.f11812c;
        M0 m8 = this.f11872b;
        if (kotlin.jvm.internal.m.b(m8, u10)) {
            i11 = 0;
        } else if (kotlin.jvm.internal.m.b(m8, U.f11815f)) {
            i11 = 1;
        } else {
            if (!kotlin.jvm.internal.m.b(m8, U.f11813d)) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i11 = 2;
        }
        parcel.writeInt(i11);
    }
}
