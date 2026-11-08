package H5;

import D7.p1;
import L2.s;
import L2.t;
import L3.C0635l;
import L3.H;
import L3.J;
import V5.A;
import V5.C;
import V5.C0936b;
import V5.C0940f;
import V5.C0947m;
import V5.C0956w;
import V5.C0958y;
import V5.C0959z;
import V5.EnumC0937c;
import V5.F;
import V5.L;
import V5.Q;
import V5.S;
import V5.T;
import V5.U;
import V5.V;
import V5.f0;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.internal.fido.zzgx;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.util.ArrayList;
import org.apache.tika.utils.XMLReaderUtils;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6056a;

    public /* synthetic */ m(int i10) {
        this.f6056a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f6056a) {
            case 0:
                int iM0 = p206t6.b.m0(parcel);
                boolean zP = false;
                int iT = 0;
                long jV = -1;
                String strW = null;
                while (parcel.dataPosition() < iM0) {
                    int i10 = parcel.readInt();
                    char c3 = (char) i10;
                    if (c3 == 1) {
                        strW = p206t6.b.w(i10, parcel);
                    } else if (c3 == 2) {
                        iT = p206t6.b.T(i10, parcel);
                    } else if (c3 == 3) {
                        jV = p206t6.b.V(i10, parcel);
                    } else if (c3 != 4) {
                        p206t6.b.e0(i10, parcel);
                    } else {
                        zP = p206t6.b.P(i10, parcel);
                    }
                }
                p206t6.b.B(iM0, parcel);
                return new d(strW, zP, jV, iT);
            case 1:
                return new I4.a(parcel);
            case 2:
                return new I4.d(parcel);
            case 3:
                return new I4.e();
            case 4:
                return new I4.h(parcel);
            case 5:
                return new I4.i(parcel.readLong(), parcel.readLong());
            case 6:
                return new t(parcel);
            case 7:
                return new s(parcel);
            case 8:
                C0635l c0635l = new C0635l();
                c0635l.f7754a = parcel.readInt();
                c0635l.f7755b = parcel.readInt();
                c0635l.f7756c = parcel.readInt() == 1;
                return c0635l;
            case 9:
                H h10 = new H();
                h10.f7682a = parcel.readInt();
                h10.f7683b = parcel.readInt();
                h10.f7685d = parcel.readInt() == 1;
                int i11 = parcel.readInt();
                if (i11 > 0) {
                    int[] iArr = new int[i11];
                    h10.f7684c = iArr;
                    parcel.readIntArray(iArr);
                }
                return h10;
            case 10:
                J j10 = new J();
                j10.f7687a = parcel.readInt();
                j10.f7688b = parcel.readInt();
                int i12 = parcel.readInt();
                j10.f7689c = i12;
                if (i12 > 0) {
                    int[] iArr2 = new int[i12];
                    j10.f7690d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i13 = parcel.readInt();
                j10.f7691e = i13;
                if (i13 > 0) {
                    int[] iArr3 = new int[i13];
                    j10.f7692f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                j10.f7694h = parcel.readInt() == 1;
                j10.f7695i = parcel.readInt() == 1;
                j10.f7696j = parcel.readInt() == 1;
                j10.f7693g = parcel.readArrayList(H.class.getClassLoader());
                return j10;
            case 11:
                int iM1 = p206t6.b.m0(parcel);
                L5.a aVar = null;
                int iT2 = 0;
                while (parcel.dataPosition() < iM1) {
                    int i14 = parcel.readInt();
                    char c9 = (char) i14;
                    if (c9 == 1) {
                        iT2 = p206t6.b.T(i14, parcel);
                    } else if (c9 != 2) {
                        p206t6.b.e0(i14, parcel);
                    } else {
                        aVar = (L5.a) p206t6.b.v(parcel, i14, L5.a.CREATOR);
                    }
                }
                p206t6.b.B(iM1, parcel);
                return new L5.b(iT2, aVar);
            case 12:
                int iM2 = p206t6.b.m0(parcel);
                ArrayList arrayListZ = null;
                int iT3 = 0;
                while (parcel.dataPosition() < iM2) {
                    int i15 = parcel.readInt();
                    char c10 = (char) i15;
                    if (c10 == 1) {
                        iT3 = p206t6.b.T(i15, parcel);
                    } else if (c10 != 2) {
                        p206t6.b.e0(i15, parcel);
                    } else {
                        arrayListZ = p206t6.b.z(parcel, i15, L5.c.CREATOR);
                    }
                }
                p206t6.b.B(iM2, parcel);
                return new L5.a(iT3, arrayListZ);
            case 13:
                int iM3 = p206t6.b.m0(parcel);
                int iT4 = 0;
                String strW2 = null;
                int iT5 = 0;
                while (parcel.dataPosition() < iM3) {
                    int i16 = parcel.readInt();
                    char c11 = (char) i16;
                    if (c11 == 1) {
                        iT4 = p206t6.b.T(i16, parcel);
                    } else if (c11 == 2) {
                        strW2 = p206t6.b.w(i16, parcel);
                    } else if (c11 != 3) {
                        p206t6.b.e0(i16, parcel);
                    } else {
                        iT5 = p206t6.b.T(i16, parcel);
                    }
                }
                p206t6.b.B(iM3, parcel);
                return new L5.c(iT4, strW2, iT5);
            case 14:
                int iM4 = p206t6.b.m0(parcel);
                String strW3 = null;
                int iT6 = 0;
                M5.a aVar2 = null;
                while (parcel.dataPosition() < iM4) {
                    int i17 = parcel.readInt();
                    char c12 = (char) i17;
                    if (c12 == 1) {
                        iT6 = p206t6.b.T(i17, parcel);
                    } else if (c12 == 2) {
                        strW3 = p206t6.b.w(i17, parcel);
                    } else if (c12 != 3) {
                        p206t6.b.e0(i17, parcel);
                    } else {
                        aVar2 = (M5.a) p206t6.b.v(parcel, i17, M5.a.CREATOR);
                    }
                }
                p206t6.b.B(iM4, parcel);
                return new M5.g(aVar2, strW3, iT6);
            case 15:
                int iM5 = p206t6.b.m0(parcel);
                ArrayList arrayListZ2 = null;
                int iT7 = 0;
                String strW4 = null;
                while (parcel.dataPosition() < iM5) {
                    int i18 = parcel.readInt();
                    char c13 = (char) i18;
                    if (c13 == 1) {
                        iT7 = p206t6.b.T(i18, parcel);
                    } else if (c13 == 2) {
                        arrayListZ2 = p206t6.b.z(parcel, i18, M5.f.CREATOR);
                    } else if (c13 != 3) {
                        p206t6.b.e0(i18, parcel);
                    } else {
                        strW4 = p206t6.b.w(i18, parcel);
                    }
                }
                p206t6.b.B(iM5, parcel);
                return new M5.h(iT7, strW4, arrayListZ2);
            case 16:
                int iM6 = p206t6.b.m0(parcel);
                String strW5 = null;
                int iT8 = 0;
                ArrayList arrayListZ3 = null;
                while (parcel.dataPosition() < iM6) {
                    int i19 = parcel.readInt();
                    char c14 = (char) i19;
                    if (c14 == 1) {
                        iT8 = p206t6.b.T(i19, parcel);
                    } else if (c14 == 2) {
                        strW5 = p206t6.b.w(i19, parcel);
                    } else if (c14 != 3) {
                        p206t6.b.e0(i19, parcel);
                    } else {
                        arrayListZ3 = p206t6.b.z(parcel, i19, M5.g.CREATOR);
                    }
                }
                p206t6.b.B(iM6, parcel);
                return new M5.f(iT8, strW5, arrayListZ3);
            case 17:
                int iM7 = p206t6.b.m0(parcel);
                int iT9 = 0;
                Parcel parcel2 = null;
                M5.h hVar = null;
                while (parcel.dataPosition() < iM7) {
                    int i20 = parcel.readInt();
                    char c15 = (char) i20;
                    if (c15 == 1) {
                        iT9 = p206t6.b.T(i20, parcel);
                    } else if (c15 == 2) {
                        int iX = p206t6.b.X(i20, parcel);
                        int iDataPosition = parcel.dataPosition();
                        if (iX == 0) {
                            parcel2 = null;
                        } else {
                            Parcel parcelObtain = Parcel.obtain();
                            parcelObtain.appendFrom(parcel, iDataPosition, iX);
                            parcel.setDataPosition(iDataPosition + iX);
                            parcel2 = parcelObtain;
                        }
                    } else if (c15 != 3) {
                        p206t6.b.e0(i20, parcel);
                    } else {
                        hVar = (M5.h) p206t6.b.v(parcel, i20, M5.h.CREATOR);
                    }
                }
                p206t6.b.B(iM7, parcel);
                return new M5.d(iT9, parcel2, hVar);
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                N1.h hVar2 = new N1.h(parcel);
                hVar2.f8540a = parcel.readInt();
                return hVar2;
            case 19:
                return new ParcelImpl(parcel);
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                try {
                    return Transport.a(parcel.readString());
                } catch (U5.a e2) {
                    throw new RuntimeException(e2);
                }
            case 21:
                try {
                    return EnumC0937c.a(parcel.readString());
                } catch (C0936b e4) {
                    throw new RuntimeException(e4);
                }
            case 22:
                int iM8 = p206t6.b.m0(parcel);
                boolean zP2 = false;
                while (parcel.dataPosition() < iM8) {
                    int i21 = parcel.readInt();
                    if (((char) i21) != 1) {
                        p206t6.b.e0(i21, parcel);
                    } else {
                        zP2 = p206t6.b.P(i21, parcel);
                    }
                }
                p206t6.b.B(iM8, parcel);
                return new f0(zP2);
            case 23:
                int iM9 = p206t6.b.m0(parcel);
                long jV2 = 0;
                while (parcel.dataPosition() < iM9) {
                    int i22 = parcel.readInt();
                    if (((char) i22) != 1) {
                        p206t6.b.e0(i22, parcel);
                    } else {
                        jV2 = p206t6.b.V(i22, parcel);
                    }
                }
                p206t6.b.B(iM9, parcel);
                return new Q(jV2);
            case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                int iM10 = p206t6.b.m0(parcel);
                boolean zP3 = false;
                while (parcel.dataPosition() < iM10) {
                    int i23 = parcel.readInt();
                    if (((char) i23) != 1) {
                        p206t6.b.e0(i23, parcel);
                    } else {
                        zP3 = p206t6.b.P(i23, parcel);
                    }
                }
                p206t6.b.B(iM10, parcel);
                return new S(zP3);
            case 25:
                int iM11 = p206t6.b.m0(parcel);
                boolean zP4 = false;
                while (parcel.dataPosition() < iM11) {
                    int i24 = parcel.readInt();
                    if (((char) i24) != 1) {
                        p206t6.b.e0(i24, parcel);
                    } else {
                        zP4 = p206t6.b.P(i24, parcel);
                    }
                }
                p206t6.b.B(iM11, parcel);
                return new C0956w(zP4);
            case 26:
                int iM12 = p206t6.b.m0(parcel);
                String strW6 = null;
                while (parcel.dataPosition() < iM12) {
                    int i25 = parcel.readInt();
                    if (((char) i25) != 1) {
                        p206t6.b.e0(i25, parcel);
                    } else {
                        strW6 = p206t6.b.w(i25, parcel);
                    }
                }
                p206t6.b.B(iM12, parcel);
                return new T(strW6);
            case 27:
                int iM13 = p206t6.b.m0(parcel);
                int iT10 = 0;
                byte[] bArrT = null;
                byte[] bArrT2 = null;
                byte[] bArrT3 = null;
                while (parcel.dataPosition() < iM13) {
                    int i26 = parcel.readInt();
                    char c16 = (char) i26;
                    if (c16 == 1) {
                        bArrT = p206t6.b.t(i26, parcel);
                    } else if (c16 == 2) {
                        bArrT2 = p206t6.b.t(i26, parcel);
                    } else if (c16 == 3) {
                        bArrT3 = p206t6.b.t(i26, parcel);
                    } else if (c16 != 4) {
                        p206t6.b.e0(i26, parcel);
                    } else {
                        iT10 = p206t6.b.T(i26, parcel);
                    }
                }
                p206t6.b.B(iM13, parcel);
                return new U(bArrT == null ? null : zzgx.zzl(bArrT, 0, bArrT.length), bArrT2 == null ? null : zzgx.zzl(bArrT2, 0, bArrT2.length), bArrT3 != null ? zzgx.zzl(bArrT3, 0, bArrT3.length) : null, iT10);
            case 28:
                int iM14 = p206t6.b.m0(parcel);
                while (true) {
                    byte[][] bArr = null;
                    while (true) {
                        if (parcel.dataPosition() >= iM14) {
                            p206t6.b.B(iM14, parcel);
                            return new V(bArr);
                        }
                        int i27 = parcel.readInt();
                        if (((char) i27) != 1) {
                            p206t6.b.e0(i27, parcel);
                        } else {
                            int iX2 = p206t6.b.X(i27, parcel);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iX2 == 0) {
                            }
                            int i28 = parcel.readInt();
                            byte[][] bArr2 = new byte[i28][];
                            for (int i29 = 0; i29 < i28; i29++) {
                                bArr2[i29] = parcel.createByteArray();
                            }
                            parcel.setDataPosition(iDataPosition2 + iX2);
                            bArr = bArr2;
                        }
                        break;
                    }
                }
                break;
            default:
                int iM15 = p206t6.b.m0(parcel);
                C c17 = null;
                F f10 = null;
                byte[] bArrT4 = null;
                ArrayList arrayListZ4 = null;
                Double dQ = null;
                ArrayList arrayListZ5 = null;
                C0947m c0947m = null;
                Integer numU = null;
                L l10 = null;
                String strW7 = null;
                C0940f c0940f = null;
                String strW8 = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < iM15) {
                    int i30 = parcel.readInt();
                    switch ((char) i30) {
                        case 2:
                            c17 = (C) p206t6.b.v(parcel, i30, C.CREATOR);
                            break;
                        case 3:
                            f10 = (F) p206t6.b.v(parcel, i30, F.CREATOR);
                            break;
                        case 4:
                            bArrT4 = p206t6.b.t(i30, parcel);
                            break;
                        case 5:
                            arrayListZ4 = p206t6.b.z(parcel, i30, A.CREATOR);
                            break;
                        case 6:
                            dQ = p206t6.b.Q(i30, parcel);
                            break;
                        case 7:
                            arrayListZ5 = p206t6.b.z(parcel, i30, C0959z.CREATOR);
                            break;
                        case '\b':
                            c0947m = (C0947m) p206t6.b.v(parcel, i30, C0947m.CREATOR);
                            break;
                        case '\t':
                            numU = p206t6.b.U(i30, parcel);
                            break;
                        case '\n':
                            l10 = (L) p206t6.b.v(parcel, i30, L.CREATOR);
                            break;
                        case 11:
                            strW7 = p206t6.b.w(i30, parcel);
                            break;
                        case '\f':
                            c0940f = (C0940f) p206t6.b.v(parcel, i30, C0940f.CREATOR);
                            break;
                        case '\r':
                            strW8 = p206t6.b.w(i30, parcel);
                            break;
                        case 14:
                            resultReceiver = (ResultReceiver) p206t6.b.v(parcel, i30, ResultReceiver.CREATOR);
                            break;
                        default:
                            p206t6.b.e0(i30, parcel);
                            break;
                    }
                }
                p206t6.b.B(iM15, parcel);
                return new C0958y(c17, f10, bArrT4, arrayListZ4, dQ, arrayListZ5, c0947m, numU, l10, strW7, c0940f, strW8, resultReceiver);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f6056a) {
            case 0:
                return new d[i10];
            case 1:
                return new I4.a[i10];
            case 2:
                return new I4.d[i10];
            case 3:
                return new I4.e[i10];
            case 4:
                return new I4.h[i10];
            case 5:
                return new I4.i[i10];
            case 6:
                return new t[i10];
            case 7:
                return new s[i10];
            case 8:
                return new C0635l[i10];
            case 9:
                return new H[i10];
            case 10:
                return new J[i10];
            case 11:
                return new L5.b[i10];
            case 12:
                return new L5.a[i10];
            case 13:
                return new L5.c[i10];
            case 14:
                return new M5.g[i10];
            case 15:
                return new M5.h[i10];
            case 16:
                return new M5.f[i10];
            case 17:
                return new M5.d[i10];
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return new N1.h[i10];
            case 19:
                return new ParcelImpl[i10];
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                return new Transport[i10];
            case 21:
                return new EnumC0937c[i10];
            case 22:
                return new f0[i10];
            case 23:
                return new Q[i10];
            case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                return new S[i10];
            case 25:
                return new C0956w[i10];
            case 26:
                return new T[i10];
            case 27:
                return new U[i10];
            case 28:
                return new V[i10];
            default:
                return new C0958y[i10];
        }
    }
}
