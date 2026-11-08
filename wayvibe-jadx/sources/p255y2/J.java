package p255y2;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p206t6.b;
import p257y5.a;
import p257y5.c;

/* JADX INFO: loaded from: classes.dex */
public final class J implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28774a;

    public /* synthetic */ J(int i10) {
        this.f28774a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f28774a) {
            case 0:
                return new K(parcel);
            case 1:
                int iM0 = b.m0(parcel);
                String strW = null;
                String strW2 = null;
                int iT = 0;
                int iT2 = 0;
                int iT3 = 0;
                long jV = 0;
                while (parcel.dataPosition() < iM0) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 1:
                            iT = b.T(i10, parcel);
                            break;
                        case 2:
                            jV = b.V(i10, parcel);
                            break;
                        case 3:
                            strW = b.w(i10, parcel);
                            break;
                        case 4:
                            iT2 = b.T(i10, parcel);
                            break;
                        case 5:
                            iT3 = b.T(i10, parcel);
                            break;
                        case 6:
                            strW2 = b.w(i10, parcel);
                            break;
                        default:
                            b.e0(i10, parcel);
                            break;
                    }
                }
                b.B(iM0, parcel);
                return new a(iT, jV, strW, iT2, iT3, strW2);
            case 2:
                int iM1 = b.m0(parcel);
                String strW3 = null;
                int iT4 = 0;
                int iT5 = 0;
                Account account = null;
                while (parcel.dataPosition() < iM1) {
                    int i11 = parcel.readInt();
                    char c3 = (char) i11;
                    if (c3 == 1) {
                        iT4 = b.T(i11, parcel);
                    } else if (c3 == 2) {
                        iT5 = b.T(i11, parcel);
                    } else if (c3 == 3) {
                        strW3 = b.w(i11, parcel);
                    } else if (c3 != 4) {
                        b.e0(i11, parcel);
                    } else {
                        account = (Account) b.v(parcel, i11, Account.CREATOR);
                    }
                }
                b.B(iM1, parcel);
                return new p257y5.b(iT4, iT5, strW3, account);
            case 3:
                int iM2 = b.m0(parcel);
                ArrayList arrayListZ = null;
                int iT6 = 0;
                while (parcel.dataPosition() < iM2) {
                    int i12 = parcel.readInt();
                    char c9 = (char) i12;
                    if (c9 == 1) {
                        iT6 = b.T(i12, parcel);
                    } else if (c9 != 2) {
                        b.e0(i12, parcel);
                    } else {
                        arrayListZ = b.z(parcel, i12, a.CREATOR);
                    }
                }
                b.B(iM2, parcel);
                return new c(iT6, arrayListZ);
            case 4:
                return new p265z4.b(parcel);
            default:
                return new p265z4.a(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f28774a) {
            case 0:
                return new K[i10];
            case 1:
                return new a[i10];
            case 2:
                return new p257y5.b[i10];
            case 3:
                return new c[i10];
            case 4:
                return new p265z4.b[i10];
            default:
                return new p265z4.a[i10];
        }
    }
}
