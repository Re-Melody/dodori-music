package U;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: U.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0885f0 extends p048e0.B implements Parcelable, Z, p048e0.q {
    public static final Parcelable.Creator<C0885f0> CREATOR = new C0881d0(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public J0 f11859b;

    public C0885f0(int i10) {
        J0 j10 = new J0(i10);
        if (p048e0.o.f19509a.get() != null) {
            J0 j11 = new J0(i10);
            j11.f19453a = 1;
            j10.f19454b = j11;
        }
        this.f11859b = j10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p048e0.A
    public final p048e0.C k() {
        return this.f11859b;
    }

    @Override // p048e0.q
    public final M0 l() {
        return U.f11815f;
    }

    public final int m() {
        return ((J0) p048e0.o.t(this.f11859b, this)).f11765c;
    }

    @Override // p048e0.A
    public final p048e0.C p(p048e0.C c3, p048e0.C c9, p048e0.C c10) {
        if (((J0) c9).f11765c == ((J0) c10).f11765c) {
            return c9;
        }
        return null;
    }

    @Override // p048e0.A
    public final void q(p048e0.C c3) {
        kotlin.jvm.internal.m.d(c3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f11859b = (J0) c3;
    }

    public final void r(int i10) {
        p048e0.i iVarK;
        J0 j10 = (J0) p048e0.o.i(this.f11859b);
        if (j10.f11765c != i10) {
            J0 j11 = this.f11859b;
            synchronized (p048e0.o.f19510b) {
                iVarK = p048e0.o.k();
                ((J0) p048e0.o.o(j11, this, iVarK, j10)).f11765c = i10;
            }
            p048e0.o.n(iVarK, this);
        }
    }

    public final String toString() {
        return "MutableIntState(value=" + ((J0) p048e0.o.i(this.f11859b)).f11765c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(m());
    }
}
