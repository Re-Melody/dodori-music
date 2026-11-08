package V5;

import D7.p1;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.internal.fido.zzgx;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.util.ArrayList;
import org.apache.tika.utils.XMLReaderUtils;

/* JADX INFO: loaded from: classes.dex */
public final class W implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12633a;

    public /* synthetic */ W(int i10) {
        this.f12633a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f12633a) {
            case 0:
                int iM0 = p206t6.b.m0(parcel);
                String strW = null;
                String strW2 = null;
                byte[] bArrT = null;
                C0944j c0944j = null;
                C0943i c0943i = null;
                C0945k c0945k = null;
                C0941g c0941g = null;
                String strW3 = null;
                while (parcel.dataPosition() < iM0) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 1:
                            strW = p206t6.b.w(i10, parcel);
                            break;
                        case 2:
                            strW2 = p206t6.b.w(i10, parcel);
                            break;
                        case 3:
                            bArrT = p206t6.b.t(i10, parcel);
                            break;
                        case 4:
                            c0944j = (C0944j) p206t6.b.v(parcel, i10, C0944j.CREATOR);
                            break;
                        case 5:
                            c0943i = (C0943i) p206t6.b.v(parcel, i10, C0943i.CREATOR);
                            break;
                        case 6:
                            c0945k = (C0945k) p206t6.b.v(parcel, i10, C0945k.CREATOR);
                            break;
                        case 7:
                            c0941g = (C0941g) p206t6.b.v(parcel, i10, C0941g.CREATOR);
                            break;
                        case '\b':
                            strW3 = p206t6.b.w(i10, parcel);
                            break;
                        case '\t':
                            p206t6.b.w(i10, parcel);
                            break;
                        default:
                            p206t6.b.e0(i10, parcel);
                            break;
                    }
                }
                p206t6.b.B(iM0, parcel);
                return new C0957x(strW, strW2, bArrT, c0944j, c0943i, c0945k, c0941g, strW3);
            case 1:
                int iM1 = p206t6.b.m0(parcel);
                String strW4 = null;
                byte[] bArrT2 = null;
                ArrayList arrayListZ = null;
                while (parcel.dataPosition() < iM1) {
                    int i11 = parcel.readInt();
                    char c3 = (char) i11;
                    if (c3 == 2) {
                        strW4 = p206t6.b.w(i11, parcel);
                    } else if (c3 == 3) {
                        bArrT2 = p206t6.b.t(i11, parcel);
                    } else if (c3 != 4) {
                        p206t6.b.e0(i11, parcel);
                    } else {
                        arrayListZ = p206t6.b.z(parcel, i11, Transport.CREATOR);
                    }
                }
                p206t6.b.B(iM1, parcel);
                return new C0959z(strW4, bArrT2, arrayListZ);
            case 2:
                int iM2 = p206t6.b.m0(parcel);
                String strW5 = null;
                Integer numU = null;
                while (parcel.dataPosition() < iM2) {
                    int i12 = parcel.readInt();
                    char c9 = (char) i12;
                    if (c9 == 2) {
                        strW5 = p206t6.b.w(i12, parcel);
                    } else if (c9 != 3) {
                        p206t6.b.e0(i12, parcel);
                    } else {
                        numU = p206t6.b.U(i12, parcel);
                    }
                }
                p206t6.b.B(iM2, parcel);
                return new A(strW5, numU.intValue());
            case 3:
                int iM3 = p206t6.b.m0(parcel);
                byte[] bArrT3 = null;
                Double dQ = null;
                String strW6 = null;
                ArrayList arrayListZ2 = null;
                Integer numU2 = null;
                L l10 = null;
                String strW7 = null;
                C0940f c0940f = null;
                Long lW = null;
                String strW8 = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < iM3) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 2:
                            bArrT3 = p206t6.b.t(i13, parcel);
                            break;
                        case 3:
                            dQ = p206t6.b.Q(i13, parcel);
                            break;
                        case 4:
                            strW6 = p206t6.b.w(i13, parcel);
                            break;
                        case 5:
                            arrayListZ2 = p206t6.b.z(parcel, i13, C0959z.CREATOR);
                            break;
                        case 6:
                            numU2 = p206t6.b.U(i13, parcel);
                            break;
                        case 7:
                            l10 = (L) p206t6.b.v(parcel, i13, L.CREATOR);
                            break;
                        case '\b':
                            strW7 = p206t6.b.w(i13, parcel);
                            break;
                        case '\t':
                            c0940f = (C0940f) p206t6.b.v(parcel, i13, C0940f.CREATOR);
                            break;
                        case '\n':
                            lW = p206t6.b.W(i13, parcel);
                            break;
                        case 11:
                            strW8 = p206t6.b.w(i13, parcel);
                            break;
                        case '\f':
                            resultReceiver = (ResultReceiver) p206t6.b.v(parcel, i13, ResultReceiver.CREATOR);
                            break;
                        default:
                            p206t6.b.e0(i13, parcel);
                            break;
                    }
                }
                p206t6.b.B(iM3, parcel);
                return new B(bArrT3, dQ, strW6, arrayListZ2, numU2, l10, strW7, c0940f, lW, strW8, resultReceiver);
            case 4:
                int iM4 = p206t6.b.m0(parcel);
                String strW9 = null;
                String strW10 = null;
                String strW11 = null;
                while (parcel.dataPosition() < iM4) {
                    int i14 = parcel.readInt();
                    char c10 = (char) i14;
                    if (c10 == 2) {
                        strW9 = p206t6.b.w(i14, parcel);
                    } else if (c10 == 3) {
                        strW10 = p206t6.b.w(i14, parcel);
                    } else if (c10 != 4) {
                        p206t6.b.e0(i14, parcel);
                    } else {
                        strW11 = p206t6.b.w(i14, parcel);
                    }
                }
                p206t6.b.B(iM4, parcel);
                return new C(strW9, strW10, strW11);
            case 5:
                try {
                    return E.a(parcel.readString());
                } catch (D e2) {
                    throw new RuntimeException(e2);
                }
            case 6:
                int iM5 = p206t6.b.m0(parcel);
                byte[] bArrT4 = null;
                String strW12 = null;
                String strW13 = null;
                String strW14 = null;
                while (parcel.dataPosition() < iM5) {
                    int i15 = parcel.readInt();
                    char c11 = (char) i15;
                    if (c11 == 2) {
                        bArrT4 = p206t6.b.t(i15, parcel);
                    } else if (c11 == 3) {
                        strW12 = p206t6.b.w(i15, parcel);
                    } else if (c11 == 4) {
                        strW13 = p206t6.b.w(i15, parcel);
                    } else if (c11 != 5) {
                        p206t6.b.e0(i15, parcel);
                    } else {
                        strW14 = p206t6.b.w(i15, parcel);
                    }
                }
                p206t6.b.B(iM5, parcel);
                return new F(strW12, strW13, strW14, bArrT4);
            case 7:
                String string = parcel.readString();
                if (string == null) {
                    string = "";
                }
                try {
                    return I.a(string);
                } catch (H e4) {
                    throw new RuntimeException(e4);
                }
            case 8:
                int iM6 = p206t6.b.m0(parcel);
                String strW15 = null;
                while (parcel.dataPosition() < iM6) {
                    int i16 = parcel.readInt();
                    if (((char) i16) != 1) {
                        p206t6.b.e0(i16, parcel);
                    } else {
                        strW15 = p206t6.b.w(i16, parcel);
                    }
                }
                p206t6.b.B(iM6, parcel);
                return new X(strW15);
            case 9:
                try {
                    return J.a(parcel.readString());
                } catch (K e7) {
                    throw new RuntimeException(e7);
                }
            case 10:
                int iM7 = p206t6.b.m0(parcel);
                String strW16 = null;
                String strW17 = null;
                while (parcel.dataPosition() < iM7) {
                    int i17 = parcel.readInt();
                    char c12 = (char) i17;
                    if (c12 == 2) {
                        strW16 = p206t6.b.w(i17, parcel);
                    } else if (c12 != 3) {
                        p206t6.b.e0(i17, parcel);
                    } else {
                        strW17 = p206t6.b.w(i17, parcel);
                    }
                }
                p206t6.b.B(iM7, parcel);
                return new L(strW16, strW17);
            case 11:
                try {
                    return EnumC0939e.a(parcel.readString());
                } catch (C0938d e10) {
                    throw new RuntimeException(e10);
                }
            case 12:
                int iM8 = p206t6.b.m0(parcel);
                boolean zP = false;
                while (parcel.dataPosition() < iM8) {
                    int i18 = parcel.readInt();
                    if (((char) i18) != 1) {
                        p206t6.b.e0(i18, parcel);
                    } else {
                        zP = p206t6.b.P(i18, parcel);
                    }
                }
                p206t6.b.B(iM8, parcel);
                return new M(zP);
            case 13:
                try {
                    return N.a(parcel.readString());
                } catch (Y e11) {
                    throw new RuntimeException(e11);
                }
            case 14:
                int iM9 = p206t6.b.m0(parcel);
                ArrayList arrayListZ3 = null;
                while (parcel.dataPosition() < iM9) {
                    int i19 = parcel.readInt();
                    if (((char) i19) != 1) {
                        p206t6.b.e0(i19, parcel);
                    } else {
                        arrayListZ3 = p206t6.b.z(parcel, i19, P.CREATOR);
                    }
                }
                p206t6.b.B(iM9, parcel);
                return new O(arrayListZ3);
            case 15:
                int iM10 = p206t6.b.m0(parcel);
                int iT = 0;
                short s8 = 0;
                short s10 = 0;
                while (parcel.dataPosition() < iM10) {
                    int i20 = parcel.readInt();
                    char c13 = (char) i20;
                    if (c13 == 1) {
                        iT = p206t6.b.T(i20, parcel);
                    } else if (c13 == 2) {
                        p206t6.b.q0(parcel, i20, 4);
                        s8 = (short) parcel.readInt();
                    } else if (c13 != 3) {
                        p206t6.b.e0(i20, parcel);
                    } else {
                        p206t6.b.q0(parcel, i20, 4);
                        s10 = (short) parcel.readInt();
                    }
                }
                p206t6.b.B(iM10, parcel);
                return new P(iT, s8, s10);
            case 16:
                int iM11 = p206t6.b.m0(parcel);
                O o10 = null;
                Z z10 = null;
                C0942h c0942h = null;
                a0 a0Var = null;
                String strW18 = null;
                while (parcel.dataPosition() < iM11) {
                    int i21 = parcel.readInt();
                    char c14 = (char) i21;
                    if (c14 == 1) {
                        o10 = (O) p206t6.b.v(parcel, i21, O.CREATOR);
                    } else if (c14 == 2) {
                        z10 = (Z) p206t6.b.v(parcel, i21, Z.CREATOR);
                    } else if (c14 == 3) {
                        c0942h = (C0942h) p206t6.b.v(parcel, i21, C0942h.CREATOR);
                    } else if (c14 == 4) {
                        a0Var = (a0) p206t6.b.v(parcel, i21, a0.CREATOR);
                    } else if (c14 != 5) {
                        p206t6.b.e0(i21, parcel);
                    } else {
                        strW18 = p206t6.b.w(i21, parcel);
                    }
                }
                p206t6.b.B(iM11, parcel);
                return new C0941g(o10, z10, c0942h, a0Var, strW18);
            case 17:
                int iM12 = p206t6.b.m0(parcel);
                C0955v c0955v = null;
                c0 c0Var = null;
                M m8 = null;
                f0 f0Var = null;
                Q q5 = null;
                S s11 = null;
                d0 d0Var = null;
                T t10 = null;
                C0956w c0956w = null;
                V v3 = null;
                X x10 = null;
                U u10 = null;
                while (parcel.dataPosition() < iM12) {
                    int i22 = parcel.readInt();
                    switch ((char) i22) {
                        case 2:
                            c0955v = (C0955v) p206t6.b.v(parcel, i22, C0955v.CREATOR);
                            break;
                        case 3:
                            c0Var = (c0) p206t6.b.v(parcel, i22, c0.CREATOR);
                            break;
                        case 4:
                            m8 = (M) p206t6.b.v(parcel, i22, M.CREATOR);
                            break;
                        case 5:
                            f0Var = (f0) p206t6.b.v(parcel, i22, f0.CREATOR);
                            break;
                        case 6:
                            q5 = (Q) p206t6.b.v(parcel, i22, Q.CREATOR);
                            break;
                        case 7:
                            s11 = (S) p206t6.b.v(parcel, i22, S.CREATOR);
                            break;
                        case '\b':
                            d0Var = (d0) p206t6.b.v(parcel, i22, d0.CREATOR);
                            break;
                        case '\t':
                            t10 = (T) p206t6.b.v(parcel, i22, T.CREATOR);
                            break;
                        case '\n':
                            c0956w = (C0956w) p206t6.b.v(parcel, i22, C0956w.CREATOR);
                            break;
                        case 11:
                            v3 = (V) p206t6.b.v(parcel, i22, V.CREATOR);
                            break;
                        case '\f':
                            x10 = (X) p206t6.b.v(parcel, i22, X.CREATOR);
                            break;
                        case '\r':
                            u10 = (U) p206t6.b.v(parcel, i22, U.CREATOR);
                            break;
                        default:
                            p206t6.b.e0(i22, parcel);
                            break;
                    }
                }
                p206t6.b.B(iM12, parcel);
                return new C0940f(c0955v, c0Var, m8, f0Var, q5, s11, d0Var, t10, c0956w, v3, x10, u10);
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                int iM13 = p206t6.b.m0(parcel);
                boolean zP2 = false;
                while (parcel.dataPosition() < iM13) {
                    int i23 = parcel.readInt();
                    if (((char) i23) != 1) {
                        p206t6.b.e0(i23, parcel);
                    } else {
                        zP2 = p206t6.b.P(i23, parcel);
                    }
                }
                p206t6.b.B(iM13, parcel);
                return new C0942h(zP2);
            case 19:
                int iM14 = p206t6.b.m0(parcel);
                byte[] bArrT5 = null;
                byte[] bArrT6 = null;
                while (parcel.dataPosition() < iM14) {
                    int i24 = parcel.readInt();
                    char c15 = (char) i24;
                    if (c15 == 1) {
                        bArrT5 = p206t6.b.t(i24, parcel);
                    } else if (c15 != 2) {
                        p206t6.b.e0(i24, parcel);
                    } else {
                        bArrT6 = p206t6.b.t(i24, parcel);
                    }
                }
                p206t6.b.B(iM14, parcel);
                return new Z(bArrT5 == null ? null : zzgx.zzl(bArrT5, 0, bArrT5.length), bArrT6 != null ? zzgx.zzl(bArrT6, 0, bArrT6.length) : null);
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                int iM15 = p206t6.b.m0(parcel);
                byte[] bArrT7 = null;
                boolean zP3 = false;
                while (parcel.dataPosition() < iM15) {
                    int i25 = parcel.readInt();
                    char c16 = (char) i25;
                    if (c16 == 1) {
                        zP3 = p206t6.b.P(i25, parcel);
                    } else if (c16 != 2) {
                        p206t6.b.e0(i25, parcel);
                    } else {
                        bArrT7 = p206t6.b.t(i25, parcel);
                    }
                }
                p206t6.b.B(iM15, parcel);
                return new a0(zP3, bArrT7 != null ? zzgx.zzl(bArrT7, 0, bArrT7.length) : null);
            case 21:
                int iM16 = p206t6.b.m0(parcel);
                byte[] bArrT8 = null;
                byte[] bArrT9 = null;
                byte[] bArrT10 = null;
                byte[] bArrT11 = null;
                byte[] bArrT12 = null;
                while (parcel.dataPosition() < iM16) {
                    int i26 = parcel.readInt();
                    char c17 = (char) i26;
                    if (c17 == 2) {
                        bArrT8 = p206t6.b.t(i26, parcel);
                    } else if (c17 == 3) {
                        bArrT9 = p206t6.b.t(i26, parcel);
                    } else if (c17 == 4) {
                        bArrT10 = p206t6.b.t(i26, parcel);
                    } else if (c17 == 5) {
                        bArrT11 = p206t6.b.t(i26, parcel);
                    } else if (c17 != 6) {
                        p206t6.b.e0(i26, parcel);
                    } else {
                        bArrT12 = p206t6.b.t(i26, parcel);
                    }
                }
                p206t6.b.B(iM16, parcel);
                return new C0943i(bArrT8, bArrT9, bArrT10, bArrT11, bArrT12);
            case 22:
                int iM17 = p206t6.b.m0(parcel);
                byte[] bArrT13 = null;
                byte[] bArrT14 = null;
                byte[] bArrT15 = null;
                String[] strArr = null;
                while (parcel.dataPosition() < iM17) {
                    int i27 = parcel.readInt();
                    char c18 = (char) i27;
                    if (c18 == 2) {
                        bArrT13 = p206t6.b.t(i27, parcel);
                    } else if (c18 == 3) {
                        bArrT14 = p206t6.b.t(i27, parcel);
                    } else if (c18 == 4) {
                        bArrT15 = p206t6.b.t(i27, parcel);
                    } else if (c18 != 5) {
                        p206t6.b.e0(i27, parcel);
                    } else {
                        int iX = p206t6.b.X(i27, parcel);
                        int iDataPosition = parcel.dataPosition();
                        if (iX == 0) {
                            strArr = null;
                        } else {
                            String[] strArrCreateStringArray = parcel.createStringArray();
                            parcel.setDataPosition(iDataPosition + iX);
                            strArr = strArrCreateStringArray;
                        }
                    }
                }
                p206t6.b.B(iM17, parcel);
                return new C0944j(bArrT13, bArrT14, bArrT15, strArr);
            case 23:
                int iM18 = p206t6.b.m0(parcel);
                int iT2 = 0;
                String strW19 = null;
                int iT3 = 0;
                while (parcel.dataPosition() < iM18) {
                    int i28 = parcel.readInt();
                    char c19 = (char) i28;
                    if (c19 == 2) {
                        iT2 = p206t6.b.T(i28, parcel);
                    } else if (c19 == 3) {
                        strW19 = p206t6.b.w(i28, parcel);
                    } else if (c19 != 4) {
                        p206t6.b.e0(i28, parcel);
                    } else {
                        iT3 = p206t6.b.T(i28, parcel);
                    }
                }
                p206t6.b.B(iM18, parcel);
                return new C0945k(iT2, strW19, iT3);
            case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                int iM19 = p206t6.b.m0(parcel);
                String strW20 = null;
                Boolean boolValueOf = null;
                String strW21 = null;
                String strW22 = null;
                while (parcel.dataPosition() < iM19) {
                    int i29 = parcel.readInt();
                    char c20 = (char) i29;
                    if (c20 == 2) {
                        strW20 = p206t6.b.w(i29, parcel);
                    } else if (c20 == 3) {
                        int iX2 = p206t6.b.X(i29, parcel);
                        if (iX2 == 0) {
                            boolValueOf = null;
                        } else {
                            p206t6.b.r0(parcel, iX2, 4);
                            boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                        }
                    } else if (c20 == 4) {
                        strW21 = p206t6.b.w(i29, parcel);
                    } else if (c20 != 5) {
                        p206t6.b.e0(i29, parcel);
                    } else {
                        strW22 = p206t6.b.w(i29, parcel);
                    }
                }
                p206t6.b.B(iM19, parcel);
                return new C0947m(strW20, boolValueOf, strW21, strW22);
            case 25:
                int iM20 = p206t6.b.m0(parcel);
                C0958y c0958y = null;
                Uri uri = null;
                byte[] bArrT16 = null;
                while (parcel.dataPosition() < iM20) {
                    int i30 = parcel.readInt();
                    char c21 = (char) i30;
                    if (c21 == 2) {
                        c0958y = (C0958y) p206t6.b.v(parcel, i30, C0958y.CREATOR);
                    } else if (c21 == 3) {
                        uri = (Uri) p206t6.b.v(parcel, i30, Uri.CREATOR);
                    } else if (c21 != 4) {
                        p206t6.b.e0(i30, parcel);
                    } else {
                        bArrT16 = p206t6.b.t(i30, parcel);
                    }
                }
                p206t6.b.B(iM20, parcel);
                return new C0948n(c0958y, uri, bArrT16);
            case 26:
                int iM21 = p206t6.b.m0(parcel);
                B b10 = null;
                Uri uri2 = null;
                byte[] bArrT17 = null;
                while (parcel.dataPosition() < iM21) {
                    int i31 = parcel.readInt();
                    char c22 = (char) i31;
                    if (c22 == 2) {
                        b10 = (B) p206t6.b.v(parcel, i31, B.CREATOR);
                    } else if (c22 == 3) {
                        uri2 = (Uri) p206t6.b.v(parcel, i31, Uri.CREATOR);
                    } else if (c22 != 4) {
                        p206t6.b.e0(i31, parcel);
                    } else {
                        bArrT17 = p206t6.b.t(i31, parcel);
                    }
                }
                p206t6.b.B(iM21, parcel);
                return new C0949o(b10, uri2, bArrT17);
            case 27:
                try {
                    return r.e(parcel.readInt());
                } catch (C0951q e12) {
                    throw new RuntimeException(e12);
                }
            case 28:
                int iM22 = p206t6.b.m0(parcel);
                byte[] bArrT18 = null;
                byte[] bArrT19 = null;
                byte[] bArrT20 = null;
                long jV = 0;
                while (parcel.dataPosition() < iM22) {
                    int i32 = parcel.readInt();
                    char c23 = (char) i32;
                    if (c23 == 1) {
                        jV = p206t6.b.V(i32, parcel);
                    } else if (c23 == 2) {
                        bArrT18 = p206t6.b.t(i32, parcel);
                    } else if (c23 == 3) {
                        bArrT19 = p206t6.b.t(i32, parcel);
                    } else if (c23 != 4) {
                        p206t6.b.e0(i32, parcel);
                    } else {
                        bArrT20 = p206t6.b.t(i32, parcel);
                    }
                }
                p206t6.b.B(iM22, parcel);
                return new b0(jV, bArrT18, bArrT19, bArrT20);
            default:
                int iM23 = p206t6.b.m0(parcel);
                ArrayList arrayListZ4 = null;
                while (parcel.dataPosition() < iM23) {
                    int i33 = parcel.readInt();
                    if (((char) i33) != 1) {
                        p206t6.b.e0(i33, parcel);
                    } else {
                        arrayListZ4 = p206t6.b.z(parcel, i33, b0.CREATOR);
                    }
                }
                p206t6.b.B(iM23, parcel);
                return new c0(arrayListZ4);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        switch (this.f12633a) {
            case 0:
                return new C0957x[i10];
            case 1:
                return new C0959z[i10];
            case 2:
                return new A[i10];
            case 3:
                return new B[i10];
            case 4:
                return new C[i10];
            case 5:
                return new E[i10];
            case 6:
                return new F[i10];
            case 7:
                return new I[i10];
            case 8:
                return new X[i10];
            case 9:
                return new J[i10];
            case 10:
                return new L[i10];
            case 11:
                return new EnumC0939e[i10];
            case 12:
                return new M[i10];
            case 13:
                return new N[i10];
            case 14:
                return new O[i10];
            case 15:
                return new P[i10];
            case 16:
                return new C0941g[i10];
            case 17:
                return new C0940f[i10];
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return new C0942h[i10];
            case 19:
                return new Z[i10];
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                return new a0[i10];
            case 21:
                return new C0943i[i10];
            case 22:
                return new C0944j[i10];
            case 23:
                return new C0945k[i10];
            case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                return new C0947m[i10];
            case 25:
                return new C0948n[i10];
            case 26:
                return new C0949o[i10];
            case 27:
                return new r[i10];
            case 28:
                return new b0[i10];
            default:
                return new c0[i10];
        }
    }
}
