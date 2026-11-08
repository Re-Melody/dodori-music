package V5;

import B2.AbstractC0112b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new W(27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Enum f12685a;

    /* JADX WARN: Multi-variable type inference failed */
    public r(InterfaceC0935a interfaceC0935a) {
        com.google.android.gms.common.internal.E.h(interfaceC0935a);
        this.f12685a = (Enum) interfaceC0935a;
    }

    public static r e(int i10) throws C0951q {
        InterfaceC0935a interfaceC0935a;
        if (i10 != G.LEGACY_RS1.f()) {
            for (G g3 : G.values()) {
                if (g3.f() == i10) {
                    interfaceC0935a = g3;
                }
            }
            for (EnumC0952s enumC0952s : EnumC0952s.values()) {
                if (enumC0952s.f() == i10) {
                    interfaceC0935a = enumC0952s;
                }
            }
            throw new C0951q(AbstractC0112b.d(i10, "Algorithm with COSE value ", " not supported"));
        }
        interfaceC0935a = G.RS1;
        return new r(interfaceC0935a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [V5.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v3, types: [V5.a, java.lang.Enum] */
    public final boolean equals(Object obj) {
        return (obj instanceof r) && this.f12685a.f() == ((r) obj).f12685a.f();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12685a});
    }

    public final String toString() {
        return V0.p.o("COSEAlgorithmIdentifier{algorithm=", String.valueOf(this.f12685a), "}");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [V5.a, java.lang.Enum] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f12685a.f());
    }
}
