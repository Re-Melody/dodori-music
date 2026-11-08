package B5;

import B8.V;
import D7.p1;
import H4.j;
import H4.k;
import H4.l;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.util.ArrayList;
import java.util.HashSet;
import org.apache.tika.utils.XMLReaderUtils;
import org.maplibre.android.util.DefaultStyle;
import org.maplibre.android.util.TileServerOptions;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f681a;

    public /* synthetic */ c(int i10) {
        this.f681a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f681a) {
            case 0:
                int iM0 = p206t6.b.m0(parcel);
                HashSet hashSet = new HashSet();
                int iT = 0;
                ArrayList arrayListZ = null;
                e eVar = null;
                int iT2 = 0;
                while (parcel.dataPosition() < iM0) {
                    int i10 = parcel.readInt();
                    char c3 = (char) i10;
                    if (c3 == 1) {
                        iT = p206t6.b.T(i10, parcel);
                        hashSet.add(1);
                    } else if (c3 == 2) {
                        arrayListZ = p206t6.b.z(parcel, i10, f.CREATOR);
                        hashSet.add(2);
                    } else if (c3 == 3) {
                        iT2 = p206t6.b.T(i10, parcel);
                        hashSet.add(3);
                    } else if (c3 != 4) {
                        p206t6.b.e0(i10, parcel);
                    } else {
                        eVar = (e) p206t6.b.v(parcel, i10, e.CREATOR);
                        hashSet.add(4);
                    }
                }
                if (parcel.dataPosition() == iM0) {
                    return new b(hashSet, iT, arrayListZ, iT2, eVar);
                }
                throw new V(p134m1.b.j(iM0, "Overread allowed size end="), parcel);
            case 1:
                int iM1 = p206t6.b.m0(parcel);
                ArrayList arrayListX = null;
                ArrayList arrayListX2 = null;
                ArrayList arrayListX3 = null;
                ArrayList arrayListX4 = null;
                ArrayList arrayListX5 = null;
                int iT3 = 0;
                while (parcel.dataPosition() < iM1) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 1:
                            iT3 = p206t6.b.T(i11, parcel);
                            break;
                        case 2:
                            arrayListX = p206t6.b.x(i11, parcel);
                            break;
                        case 3:
                            arrayListX2 = p206t6.b.x(i11, parcel);
                            break;
                        case 4:
                            arrayListX3 = p206t6.b.x(i11, parcel);
                            break;
                        case 5:
                            arrayListX4 = p206t6.b.x(i11, parcel);
                            break;
                        case 6:
                            arrayListX5 = p206t6.b.x(i11, parcel);
                            break;
                        default:
                            p206t6.b.e0(i11, parcel);
                            break;
                    }
                }
                p206t6.b.B(iM1, parcel);
                return new e(iT3, arrayListX, arrayListX2, arrayListX3, arrayListX4, arrayListX5);
            case 2:
                int iM2 = p206t6.b.m0(parcel);
                HashSet hashSet2 = new HashSet();
                int iT4 = 0;
                g gVar = null;
                String strW = null;
                String strW2 = null;
                String strW3 = null;
                while (parcel.dataPosition() < iM2) {
                    int i12 = parcel.readInt();
                    char c9 = (char) i12;
                    if (c9 == 1) {
                        iT4 = p206t6.b.T(i12, parcel);
                        hashSet2.add(1);
                    } else if (c9 == 2) {
                        gVar = (g) p206t6.b.v(parcel, i12, g.CREATOR);
                        hashSet2.add(2);
                    } else if (c9 == 3) {
                        strW = p206t6.b.w(i12, parcel);
                        hashSet2.add(3);
                    } else if (c9 == 4) {
                        strW2 = p206t6.b.w(i12, parcel);
                        hashSet2.add(4);
                    } else if (c9 != 5) {
                        p206t6.b.e0(i12, parcel);
                    } else {
                        strW3 = p206t6.b.w(i12, parcel);
                        hashSet2.add(5);
                    }
                }
                if (parcel.dataPosition() == iM2) {
                    return new f(hashSet2, iT4, gVar, strW, strW2, strW3);
                }
                throw new V(p134m1.b.j(iM2, "Overread allowed size end="), parcel);
            case 3:
                int iM3 = p206t6.b.m0(parcel);
                HashSet hashSet3 = new HashSet();
                int iT5 = 0;
                String strW4 = null;
                byte[] bArrT = null;
                PendingIntent pendingIntent = null;
                a aVar = null;
                int iT6 = 0;
                while (parcel.dataPosition() < iM3) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 1:
                            iT5 = p206t6.b.T(i13, parcel);
                            hashSet3.add(1);
                            break;
                        case 2:
                            strW4 = p206t6.b.w(i13, parcel);
                            hashSet3.add(2);
                            break;
                        case 3:
                            iT6 = p206t6.b.T(i13, parcel);
                            hashSet3.add(3);
                            break;
                        case 4:
                            bArrT = p206t6.b.t(i13, parcel);
                            hashSet3.add(4);
                            break;
                        case 5:
                            pendingIntent = (PendingIntent) p206t6.b.v(parcel, i13, PendingIntent.CREATOR);
                            hashSet3.add(5);
                            break;
                        case 6:
                            aVar = (a) p206t6.b.v(parcel, i13, a.CREATOR);
                            hashSet3.add(6);
                            break;
                        default:
                            p206t6.b.e0(i13, parcel);
                            break;
                    }
                }
                if (parcel.dataPosition() == iM3) {
                    return new g(hashSet3, iT5, strW4, iT6, bArrT, pendingIntent, aVar);
                }
                throw new V(p134m1.b.j(iM3, "Overread allowed size end="), parcel);
            case 4:
                int iM4 = p206t6.b.m0(parcel);
                int iT7 = 0;
                boolean zP = false;
                boolean zP2 = false;
                long jV = 0;
                while (parcel.dataPosition() < iM4) {
                    int i14 = parcel.readInt();
                    char c10 = (char) i14;
                    if (c10 == 1) {
                        iT7 = p206t6.b.T(i14, parcel);
                    } else if (c10 == 2) {
                        zP = p206t6.b.P(i14, parcel);
                    } else if (c10 == 3) {
                        jV = p206t6.b.V(i14, parcel);
                    } else if (c10 != 4) {
                        p206t6.b.e0(i14, parcel);
                    } else {
                        zP2 = p206t6.b.P(i14, parcel);
                    }
                }
                p206t6.b.B(iM4, parcel);
                return new a(iT7, zP, jV, zP2);
            case 5:
                return new DefaultStyle(parcel);
            case 6:
                return new TileServerOptions(parcel);
            case 7:
                return new C2.a(parcel);
            case 8:
                return new C2.b(parcel);
            case 9:
                return new C2.c(parcel);
            case 10:
                int iM5 = p206t6.b.m0(parcel);
                String strW5 = null;
                byte[] bArrT2 = null;
                Bundle bundleS = null;
                long jV2 = 0;
                int iT8 = 0;
                int iT9 = 0;
                while (parcel.dataPosition() < iM5) {
                    int i15 = parcel.readInt();
                    char c11 = (char) i15;
                    if (c11 == 1) {
                        strW5 = p206t6.b.w(i15, parcel);
                    } else if (c11 == 2) {
                        iT9 = p206t6.b.T(i15, parcel);
                    } else if (c11 == 3) {
                        jV2 = p206t6.b.V(i15, parcel);
                    } else if (c11 == 4) {
                        bArrT2 = p206t6.b.t(i15, parcel);
                    } else if (c11 == 5) {
                        bundleS = p206t6.b.s(i15, parcel);
                    } else if (c11 != 1000) {
                        p206t6.b.e0(i15, parcel);
                    } else {
                        iT8 = p206t6.b.T(i15, parcel);
                    }
                }
                p206t6.b.B(iM5, parcel);
                return new D5.a(iT8, strW5, iT9, jV2, bArrT2, bundleS);
            case 11:
                int iM6 = p206t6.b.m0(parcel);
                PendingIntent pendingIntent2 = null;
                Bundle bundleS2 = null;
                byte[] bArrT3 = null;
                int iT10 = 0;
                int iT11 = 0;
                int iT12 = 0;
                while (parcel.dataPosition() < iM6) {
                    int i16 = parcel.readInt();
                    char c12 = (char) i16;
                    if (c12 == 1) {
                        iT11 = p206t6.b.T(i16, parcel);
                    } else if (c12 == 2) {
                        pendingIntent2 = (PendingIntent) p206t6.b.v(parcel, i16, PendingIntent.CREATOR);
                    } else if (c12 == 3) {
                        iT12 = p206t6.b.T(i16, parcel);
                    } else if (c12 == 4) {
                        bundleS2 = p206t6.b.s(i16, parcel);
                    } else if (c12 == 5) {
                        bArrT3 = p206t6.b.t(i16, parcel);
                    } else if (c12 != 1000) {
                        p206t6.b.e0(i16, parcel);
                    } else {
                        iT10 = p206t6.b.T(i16, parcel);
                    }
                }
                p206t6.b.B(iM6, parcel);
                return new D5.b(iT10, iT11, pendingIntent2, iT12, bundleS2, bArrT3);
            case 12:
                int iM7 = p206t6.b.m0(parcel);
                Bundle bundleS3 = null;
                int iT13 = 0;
                int iT14 = 0;
                while (parcel.dataPosition() < iM7) {
                    int i17 = parcel.readInt();
                    char c13 = (char) i17;
                    if (c13 == 1) {
                        iT13 = p206t6.b.T(i17, parcel);
                    } else if (c13 == 2) {
                        iT14 = p206t6.b.T(i17, parcel);
                    } else if (c13 != 3) {
                        p206t6.b.e0(i17, parcel);
                    } else {
                        bundleS3 = p206t6.b.s(i17, parcel);
                    }
                }
                p206t6.b.B(iM7, parcel);
                return new F5.a(iT13, iT14, bundleS3);
            case 13:
                int iM8 = p206t6.b.m0(parcel);
                String strW6 = null;
                GoogleSignInOptions googleSignInOptions = null;
                while (parcel.dataPosition() < iM8) {
                    int i18 = parcel.readInt();
                    char c14 = (char) i18;
                    if (c14 == 2) {
                        strW6 = p206t6.b.w(i18, parcel);
                    } else if (c14 != 5) {
                        p206t6.b.e0(i18, parcel);
                    } else {
                        googleSignInOptions = (GoogleSignInOptions) p206t6.b.v(parcel, i18, GoogleSignInOptions.CREATOR);
                    }
                }
                p206t6.b.B(iM8, parcel);
                return new SignInConfiguration(strW6, googleSignInOptions);
            case 14:
                return new G4.a(parcel);
            case 15:
                int iM9 = p206t6.b.m0(parcel);
                byte[] bArrT4 = null;
                String strW7 = null;
                while (parcel.dataPosition() < iM9) {
                    int i19 = parcel.readInt();
                    char c15 = (char) i19;
                    if (c15 == 1) {
                        bArrT4 = p206t6.b.t(i19, parcel);
                    } else if (c15 != 2) {
                        p206t6.b.e0(i19, parcel);
                    } else {
                        strW7 = p206t6.b.w(i19, parcel);
                    }
                }
                p206t6.b.B(iM9, parcel);
                return new G5.d(strW7, bArrT4);
            case 16:
                int iM10 = p206t6.b.m0(parcel);
                boolean zP3 = false;
                ArrayList arrayListX6 = null;
                while (parcel.dataPosition() < iM10) {
                    int i20 = parcel.readInt();
                    char c16 = (char) i20;
                    if (c16 == 1) {
                        arrayListX6 = p206t6.b.x(i20, parcel);
                    } else if (c16 != 2) {
                        p206t6.b.e0(i20, parcel);
                    } else {
                        zP3 = p206t6.b.P(i20, parcel);
                    }
                }
                p206t6.b.B(iM10, parcel);
                return new G5.b(arrayListX6, zP3);
            case 17:
                int iM11 = p206t6.b.m0(parcel);
                boolean zP4 = false;
                ArrayList arrayListX7 = null;
                while (parcel.dataPosition() < iM11) {
                    int i21 = parcel.readInt();
                    char c17 = (char) i21;
                    if (c17 == 1) {
                        arrayListX7 = p206t6.b.x(i21, parcel);
                    } else if (c17 != 2) {
                        p206t6.b.e0(i21, parcel);
                    } else {
                        zP4 = p206t6.b.P(i21, parcel);
                    }
                }
                p206t6.b.B(iM11, parcel);
                return new G5.c(arrayListX7, zP4);
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                int iM12 = p206t6.b.m0(parcel);
                Bundle bundleS4 = null;
                ArrayList arrayListZ2 = null;
                while (parcel.dataPosition() < iM12) {
                    int i22 = parcel.readInt();
                    char c18 = (char) i22;
                    if (c18 == 1) {
                        bundleS4 = p206t6.b.s(i22, parcel);
                    } else if (c18 != 2) {
                        p206t6.b.e0(i22, parcel);
                    } else {
                        arrayListZ2 = p206t6.b.z(parcel, i22, G5.d.CREATOR);
                    }
                }
                p206t6.b.B(iM12, parcel);
                return new G5.e(bundleS4, arrayListZ2);
            case 19:
                int iM13 = p206t6.b.m0(parcel);
                String strW8 = "com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY";
                boolean zP5 = false;
                byte[] bArrT5 = null;
                while (parcel.dataPosition() < iM13) {
                    int i23 = parcel.readInt();
                    char c19 = (char) i23;
                    if (c19 == 1) {
                        bArrT5 = p206t6.b.t(i23, parcel);
                    } else if (c19 == 2) {
                        zP5 = p206t6.b.P(i23, parcel);
                    } else if (c19 != 3) {
                        p206t6.b.e0(i23, parcel);
                    } else {
                        strW8 = p206t6.b.w(i23, parcel);
                    }
                }
                p206t6.b.B(iM13, parcel);
                return new G5.f(strW8, zP5, bArrT5);
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                return new H4.a(parcel);
            case 21:
                return new H4.b(parcel);
            case 22:
                return new H4.c(parcel);
            case 23:
                return new H4.d(parcel);
            case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                return new H4.e(parcel);
            case 25:
                return new H4.f(parcel);
            case 26:
                return new j(parcel);
            case 27:
                return new k(parcel);
            case 28:
                return new l(parcel);
            default:
                int iM14 = p206t6.b.m0(parcel);
                PendingIntent pendingIntent3 = null;
                String strW9 = null;
                Integer numU = null;
                int iT15 = 0;
                int iT16 = 0;
                while (parcel.dataPosition() < iM14) {
                    int i24 = parcel.readInt();
                    char c20 = (char) i24;
                    if (c20 == 1) {
                        iT15 = p206t6.b.T(i24, parcel);
                    } else if (c20 == 2) {
                        iT16 = p206t6.b.T(i24, parcel);
                    } else if (c20 == 3) {
                        pendingIntent3 = (PendingIntent) p206t6.b.v(parcel, i24, PendingIntent.CREATOR);
                    } else if (c20 == 4) {
                        strW9 = p206t6.b.w(i24, parcel);
                    } else if (c20 != 5) {
                        p206t6.b.e0(i24, parcel);
                    } else {
                        numU = p206t6.b.U(i24, parcel);
                    }
                }
                p206t6.b.B(iM14, parcel);
                return new H5.b(iT15, iT16, pendingIntent3, strW9, numU);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f681a) {
            case 0:
                return new b[i10];
            case 1:
                return new e[i10];
            case 2:
                return new f[i10];
            case 3:
                return new g[i10];
            case 4:
                return new a[i10];
            case 5:
                return new DefaultStyle[i10];
            case 6:
                return new TileServerOptions[i10];
            case 7:
                return new C2.a[i10];
            case 8:
                return new C2.b[i10];
            case 9:
                return new C2.c[i10];
            case 10:
                return new D5.a[i10];
            case 11:
                return new D5.b[i10];
            case 12:
                return new F5.a[i10];
            case 13:
                return new SignInConfiguration[i10];
            case 14:
                return new G4.a[i10];
            case 15:
                return new G5.d[i10];
            case 16:
                return new G5.b[i10];
            case 17:
                return new G5.c[i10];
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return new G5.e[i10];
            case 19:
                return new G5.f[i10];
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                return new H4.a[i10];
            case 21:
                return new H4.b[i10];
            case 22:
                return new H4.c[i10];
            case 23:
                return new H4.d[i10];
            case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                return new H4.e[i10];
            case 25:
                return new H4.f[i10];
            case 26:
                return new j[i10];
            case 27:
                return new k[i10];
            case 28:
                return new l[i10];
            default:
                return new H5.b[i10];
        }
    }
}
