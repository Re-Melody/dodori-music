package V5;

import D7.p1;
import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.util.ArrayList;
import org.apache.tika.utils.XMLReaderUtils;

/* JADX INFO: loaded from: classes.dex */
public final class e0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12644a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f12644a) {
            case 0:
                int iM0 = p206t6.b.m0(parcel);
                while (parcel.dataPosition() < iM0) {
                    int i10 = parcel.readInt();
                    if (((char) i10) != 1) {
                        p206t6.b.e0(i10, parcel);
                    } else {
                        p206t6.b.P(i10, parcel);
                    }
                }
                p206t6.b.B(iM0, parcel);
                return new d0();
            case 1:
                try {
                    return EnumC0954u.h(parcel.readInt());
                } catch (C0953t e2) {
                    throw new IllegalArgumentException(e2);
                }
            case 2:
                int iM1 = p206t6.b.m0(parcel);
                String strW = null;
                while (parcel.dataPosition() < iM1) {
                    int i11 = parcel.readInt();
                    if (((char) i11) != 2) {
                        p206t6.b.e0(i11, parcel);
                    } else {
                        strW = p206t6.b.w(i11, parcel);
                    }
                }
                p206t6.b.B(iM1, parcel);
                return new C0955v(strW);
            case 3:
                try {
                    return W5.c.e(parcel.readInt());
                } catch (W5.b e4) {
                    throw new RuntimeException(e4);
                }
            case 4:
                int iM2 = p206t6.b.m0(parcel);
                String strW2 = null;
                int iT = 0;
                String strW3 = null;
                while (parcel.dataPosition() < iM2) {
                    int i12 = parcel.readInt();
                    char c3 = (char) i12;
                    if (c3 == 2) {
                        iT = p206t6.b.T(i12, parcel);
                    } else if (c3 == 3) {
                        strW2 = p206t6.b.w(i12, parcel);
                    } else if (c3 != 4) {
                        p206t6.b.e0(i12, parcel);
                    } else {
                        strW3 = p206t6.b.w(i12, parcel);
                    }
                }
                p206t6.b.B(iM2, parcel);
                return new W5.c(iT, strW2, strW3);
            case 5:
                int iM3 = p206t6.b.m0(parcel);
                byte[] bArrT = null;
                ArrayList arrayListZ = null;
                int iT2 = 0;
                String strW4 = null;
                while (parcel.dataPosition() < iM3) {
                    int i13 = parcel.readInt();
                    char c9 = (char) i13;
                    if (c9 == 1) {
                        iT2 = p206t6.b.T(i13, parcel);
                    } else if (c9 == 2) {
                        bArrT = p206t6.b.t(i13, parcel);
                    } else if (c9 == 3) {
                        strW4 = p206t6.b.w(i13, parcel);
                    } else if (c9 != 4) {
                        p206t6.b.e0(i13, parcel);
                    } else {
                        arrayListZ = p206t6.b.z(parcel, i13, Transport.CREATOR);
                    }
                }
                p206t6.b.B(iM3, parcel);
                return new W5.d(iT2, strW4, arrayListZ, bArrT);
            case 6:
                try {
                    return W5.f.a(parcel.readString());
                } catch (W5.e e7) {
                    throw new RuntimeException(e7);
                }
            case 7:
                int iM4 = p206t6.b.m0(parcel);
                String strW5 = null;
                String strW6 = null;
                int iT3 = 0;
                byte[] bArrT2 = null;
                while (parcel.dataPosition() < iM4) {
                    int i14 = parcel.readInt();
                    char c10 = (char) i14;
                    if (c10 == 1) {
                        iT3 = p206t6.b.T(i14, parcel);
                    } else if (c10 == 2) {
                        strW5 = p206t6.b.w(i14, parcel);
                    } else if (c10 == 3) {
                        bArrT2 = p206t6.b.t(i14, parcel);
                    } else if (c10 != 4) {
                        p206t6.b.e0(i14, parcel);
                    } else {
                        strW6 = p206t6.b.w(i14, parcel);
                    }
                }
                p206t6.b.B(iM4, parcel);
                return new W5.g(iT3, strW5, strW6, bArrT2);
            case 8:
                int iM5 = p206t6.b.m0(parcel);
                Integer numU = null;
                Double dQ = null;
                Uri uri = null;
                ArrayList arrayListZ2 = null;
                ArrayList arrayListZ3 = null;
                W5.c cVar = null;
                String strW7 = null;
                while (parcel.dataPosition() < iM5) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 2:
                            numU = p206t6.b.U(i15, parcel);
                            break;
                        case 3:
                            dQ = p206t6.b.Q(i15, parcel);
                            break;
                        case 4:
                            uri = (Uri) p206t6.b.v(parcel, i15, Uri.CREATOR);
                            break;
                        case 5:
                            arrayListZ2 = p206t6.b.z(parcel, i15, W5.g.CREATOR);
                            break;
                        case 6:
                            arrayListZ3 = p206t6.b.z(parcel, i15, W5.h.CREATOR);
                            break;
                        case 7:
                            cVar = (W5.c) p206t6.b.v(parcel, i15, W5.c.CREATOR);
                            break;
                        case '\b':
                            strW7 = p206t6.b.w(i15, parcel);
                            break;
                        default:
                            p206t6.b.e0(i15, parcel);
                            break;
                    }
                }
                p206t6.b.B(iM5, parcel);
                return new RegisterRequestParams(numU, dQ, uri, arrayListZ2, arrayListZ3, cVar, strW7);
            case 9:
                int iM6 = p206t6.b.m0(parcel);
                W5.d dVar = null;
                String strW8 = null;
                String strW9 = null;
                while (parcel.dataPosition() < iM6) {
                    int i16 = parcel.readInt();
                    char c11 = (char) i16;
                    if (c11 == 2) {
                        dVar = (W5.d) p206t6.b.v(parcel, i16, W5.d.CREATOR);
                    } else if (c11 == 3) {
                        strW8 = p206t6.b.w(i16, parcel);
                    } else if (c11 != 4) {
                        p206t6.b.e0(i16, parcel);
                    } else {
                        strW9 = p206t6.b.w(i16, parcel);
                    }
                }
                p206t6.b.B(iM6, parcel);
                return new W5.h(dVar, strW8, strW9);
            case 10:
                int iM7 = p206t6.b.m0(parcel);
                Integer numU2 = null;
                Double dQ2 = null;
                Uri uri2 = null;
                byte[] bArrT3 = null;
                ArrayList arrayListZ4 = null;
                W5.c cVar2 = null;
                String strW10 = null;
                while (parcel.dataPosition() < iM7) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case 2:
                            numU2 = p206t6.b.U(i17, parcel);
                            break;
                        case 3:
                            dQ2 = p206t6.b.Q(i17, parcel);
                            break;
                        case 4:
                            uri2 = (Uri) p206t6.b.v(parcel, i17, Uri.CREATOR);
                            break;
                        case 5:
                            bArrT3 = p206t6.b.t(i17, parcel);
                            break;
                        case 6:
                            arrayListZ4 = p206t6.b.z(parcel, i17, W5.h.CREATOR);
                            break;
                        case 7:
                            cVar2 = (W5.c) p206t6.b.v(parcel, i17, W5.c.CREATOR);
                            break;
                        case '\b':
                            strW10 = p206t6.b.w(i17, parcel);
                            break;
                        default:
                            p206t6.b.e0(i17, parcel);
                            break;
                    }
                }
                p206t6.b.B(iM7, parcel);
                return new SignRequestParams(numU2, dQ2, uri2, bArrT3, arrayListZ4, cVar2, strW10);
            case 11:
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
                return new X5.a(zP);
            case 12:
                int iM9 = p206t6.b.m0(parcel);
                while (parcel.dataPosition() < iM9) {
                    p206t6.b.e0(parcel.readInt(), parcel);
                }
                p206t6.b.B(iM9, parcel);
                return new X5.b();
            case 13:
                int iM10 = p206t6.b.m0(parcel);
                while (parcel.dataPosition() < iM10) {
                    p206t6.b.e0(parcel.readInt(), parcel);
                }
                p206t6.b.B(iM10, parcel);
                return new X5.c();
            case 14:
                int iM11 = p206t6.b.m0(parcel);
                boolean zP2 = false;
                while (parcel.dataPosition() < iM11) {
                    int i19 = parcel.readInt();
                    if (((char) i19) != 1) {
                        p206t6.b.e0(i19, parcel);
                    } else {
                        zP2 = p206t6.b.P(i19, parcel);
                    }
                }
                p206t6.b.B(iM11, parcel);
                return new X5.d(zP2);
            case 15:
                int iM12 = p206t6.b.m0(parcel);
                boolean zP3 = false;
                while (parcel.dataPosition() < iM12) {
                    int i20 = parcel.readInt();
                    if (((char) i20) != 1) {
                        p206t6.b.e0(i20, parcel);
                    } else {
                        zP3 = p206t6.b.P(i20, parcel);
                    }
                }
                p206t6.b.B(iM12, parcel);
                return new X5.e(zP3);
            case 16:
                int iM13 = p206t6.b.m0(parcel);
                PendingIntent pendingIntent = null;
                X5.g gVar = null;
                while (parcel.dataPosition() < iM13) {
                    int i21 = parcel.readInt();
                    char c12 = (char) i21;
                    if (c12 == 1) {
                        pendingIntent = (PendingIntent) p206t6.b.v(parcel, i21, PendingIntent.CREATOR);
                    } else if (c12 != 2) {
                        p206t6.b.e0(i21, parcel);
                    } else {
                        gVar = (X5.g) p206t6.b.v(parcel, i21, X5.g.CREATOR);
                    }
                }
                p206t6.b.B(iM13, parcel);
                return new X5.f(pendingIntent, gVar);
            case 17:
                int iM14 = p206t6.b.m0(parcel);
                String strW11 = null;
                Bundle bundleS = null;
                while (parcel.dataPosition() < iM14) {
                    int i22 = parcel.readInt();
                    char c13 = (char) i22;
                    if (c13 == 1) {
                        strW11 = p206t6.b.w(i22, parcel);
                    } else if (c13 != 2) {
                        p206t6.b.e0(i22, parcel);
                    } else {
                        bundleS = p206t6.b.s(i22, parcel);
                    }
                }
                p206t6.b.B(iM14, parcel);
                return new X5.g(bundleS, strW11);
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                int iM15 = p206t6.b.m0(parcel);
                String strW12 = "";
                String strW13 = strW12;
                String strW14 = strW13;
                Bundle bundleS2 = null;
                Bundle bundleS3 = null;
                String strW15 = null;
                while (parcel.dataPosition() < iM15) {
                    int i23 = parcel.readInt();
                    switch ((char) i23) {
                        case 1:
                            strW12 = p206t6.b.w(i23, parcel);
                            break;
                        case 2:
                            bundleS2 = p206t6.b.s(i23, parcel);
                            break;
                        case 3:
                            bundleS3 = p206t6.b.s(i23, parcel);
                            break;
                        case 4:
                            strW15 = p206t6.b.w(i23, parcel);
                            break;
                        case 5:
                            strW13 = p206t6.b.w(i23, parcel);
                            break;
                        case 6:
                            strW14 = p206t6.b.w(i23, parcel);
                            break;
                        default:
                            p206t6.b.e0(i23, parcel);
                            break;
                    }
                }
                p206t6.b.B(iM15, parcel);
                return new X5.h(strW12, bundleS2, bundleS3, strW15, strW13, strW14);
            case 19:
                int iM16 = p206t6.b.m0(parcel);
                Bundle bundleS4 = null;
                while (parcel.dataPosition() < iM16) {
                    int i24 = parcel.readInt();
                    if (((char) i24) != 1) {
                        p206t6.b.e0(i24, parcel);
                    } else {
                        bundleS4 = p206t6.b.s(i24, parcel);
                    }
                }
                p206t6.b.B(iM16, parcel);
                return new X5.i(bundleS4);
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                int iM17 = p206t6.b.m0(parcel);
                Bundle bundleS5 = null;
                while (parcel.dataPosition() < iM17) {
                    int i25 = parcel.readInt();
                    if (((char) i25) != 1) {
                        p206t6.b.e0(i25, parcel);
                    } else {
                        bundleS5 = p206t6.b.s(i25, parcel);
                    }
                }
                p206t6.b.B(iM17, parcel);
                return new X5.j(bundleS5);
            case 21:
                int iM18 = p206t6.b.m0(parcel);
                ArrayList arrayListZ5 = null;
                Bundle bundleS6 = null;
                String strW16 = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < iM18) {
                    int i26 = parcel.readInt();
                    char c14 = (char) i26;
                    if (c14 == 1) {
                        arrayListZ5 = p206t6.b.z(parcel, i26, X5.h.CREATOR);
                    } else if (c14 == 2) {
                        bundleS6 = p206t6.b.s(i26, parcel);
                    } else if (c14 == 3) {
                        strW16 = p206t6.b.w(i26, parcel);
                    } else if (c14 != 4) {
                        p206t6.b.e0(i26, parcel);
                    } else {
                        resultReceiver = (ResultReceiver) p206t6.b.v(parcel, i26, ResultReceiver.CREATOR);
                    }
                }
                p206t6.b.B(iM18, parcel);
                return new GetCredentialRequest(arrayListZ5, bundleS6, strW16, resultReceiver);
            case 22:
                int iM19 = p206t6.b.m0(parcel);
                Bundle bundleS7 = null;
                while (parcel.dataPosition() < iM19) {
                    int i27 = parcel.readInt();
                    if (((char) i27) != 1) {
                        p206t6.b.e0(i27, parcel);
                    } else {
                        bundleS7 = p206t6.b.s(i27, parcel);
                    }
                }
                p206t6.b.B(iM19, parcel);
                return new X5.k(bundleS7);
            case 23:
                int iM20 = p206t6.b.m0(parcel);
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < iM20) {
                    int i28 = parcel.readInt();
                    if (((char) i28) != 1) {
                        p206t6.b.e0(i28, parcel);
                    } else {
                        pendingIntent2 = (PendingIntent) p206t6.b.v(parcel, i28, PendingIntent.CREATOR);
                    }
                }
                p206t6.b.B(iM20, parcel);
                return new X5.l(pendingIntent2);
            case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                int iM21 = p206t6.b.m0(parcel);
                PendingIntent pendingIntent3 = null;
                while (parcel.dataPosition() < iM21) {
                    int i29 = parcel.readInt();
                    if (((char) i29) != 1) {
                        p206t6.b.e0(i29, parcel);
                    } else {
                        pendingIntent3 = (PendingIntent) p206t6.b.v(parcel, i29, PendingIntent.CREATOR);
                    }
                }
                p206t6.b.B(iM21, parcel);
                return new X5.m(pendingIntent3);
            case 25:
                int iM22 = p206t6.b.m0(parcel);
                while (parcel.dataPosition() < iM22) {
                    p206t6.b.e0(parcel.readInt(), parcel);
                }
                p206t6.b.B(iM22, parcel);
                return new X5.n();
            case 26:
                int iM23 = p206t6.b.m0(parcel);
                while (parcel.dataPosition() < iM23) {
                    p206t6.b.e0(parcel.readInt(), parcel);
                }
                p206t6.b.B(iM23, parcel);
                return new X5.o();
            case 27:
                int iM24 = p206t6.b.m0(parcel);
                while (parcel.dataPosition() < iM24) {
                    p206t6.b.e0(parcel.readInt(), parcel);
                }
                p206t6.b.B(iM24, parcel);
                return new X5.p();
            case 28:
                int iM25 = p206t6.b.m0(parcel);
                while (parcel.dataPosition() < iM25) {
                    p206t6.b.e0(parcel.readInt(), parcel);
                }
                p206t6.b.B(iM25, parcel);
                return new X5.q();
            default:
                return new Y4.a(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f12644a) {
            case 0:
                return new d0[i10];
            case 1:
                return new EnumC0954u[i10];
            case 2:
                return new C0955v[i10];
            case 3:
                return new W5.a[i10];
            case 4:
                return new W5.c[i10];
            case 5:
                return new W5.d[i10];
            case 6:
                return new W5.f[i10];
            case 7:
                return new W5.g[i10];
            case 8:
                return new RegisterRequestParams[i10];
            case 9:
                return new W5.h[i10];
            case 10:
                return new SignRequestParams[i10];
            case 11:
                return new X5.a[i10];
            case 12:
                return new X5.b[i10];
            case 13:
                return new X5.c[i10];
            case 14:
                return new X5.d[i10];
            case 15:
                return new X5.e[i10];
            case 16:
                return new X5.f[i10];
            case 17:
                return new X5.g[i10];
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return new X5.h[i10];
            case 19:
                return new X5.i[i10];
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                return new X5.j[i10];
            case 21:
                return new GetCredentialRequest[i10];
            case 22:
                return new X5.k[i10];
            case 23:
                return new X5.l[i10];
            case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                return new X5.m[i10];
            case 25:
                return new X5.n[i10];
            case 26:
                return new X5.o[i10];
            case 27:
                return new X5.p[i10];
            case 28:
                return new X5.q[i10];
            default:
                return new Y4.a[0];
        }
    }
}
