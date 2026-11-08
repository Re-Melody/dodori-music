package com.google.android.gms.auth.api.identity;

import D7.p1;
import V5.C0957x;
import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.A;
import com.google.android.gms.common.internal.B;
import com.google.android.gms.common.internal.C1165g;
import com.google.android.gms.common.internal.C1168j;
import com.google.android.gms.common.internal.C1169k;
import com.google.android.gms.common.internal.C1176s;
import com.google.android.gms.common.internal.C1178u;
import com.google.android.gms.common.internal.C1179v;
import com.google.android.gms.common.internal.M;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.util.ArrayList;
import org.apache.tika.utils.XMLReaderUtils;
import org.maplibre.android.camera.CameraPosition;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.geometry.LatLngBounds;
import org.maplibre.android.geometry.LatLngQuad;
import org.maplibre.android.geometry.ProjectedMeters;

/* JADX INFO: loaded from: classes.dex */
public final class v implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17785a;

    public /* synthetic */ v(int i10) {
        this.f17785a = i10;
    }

    public static void a(C1169k c1169k, Parcel parcel, int i10) {
        int iC0 = p242x0.c.c0(20293, parcel);
        p242x0.c.b0(parcel, 1, 4);
        parcel.writeInt(c1169k.f18052a);
        p242x0.c.b0(parcel, 2, 4);
        parcel.writeInt(c1169k.f18053b);
        p242x0.c.b0(parcel, 3, 4);
        parcel.writeInt(c1169k.f18054c);
        p242x0.c.W(parcel, 4, c1169k.f18055d, false);
        p242x0.c.R(parcel, 5, c1169k.f18056e);
        p242x0.c.Y(parcel, 6, c1169k.f18057f, i10);
        p242x0.c.O(parcel, 7, c1169k.f18058g, false);
        p242x0.c.V(parcel, 8, c1169k.f18059h, i10, false);
        p242x0.c.Y(parcel, 10, c1169k.f18060i, i10);
        p242x0.c.Y(parcel, 11, c1169k.f18061j, i10);
        p242x0.c.b0(parcel, 12, 4);
        parcel.writeInt(c1169k.k ? 1 : 0);
        p242x0.c.b0(parcel, 13, 4);
        parcel.writeInt(c1169k.f18062l);
        boolean z10 = c1169k.f18063m;
        p242x0.c.b0(parcel, 14, 4);
        parcel.writeInt(z10 ? 1 : 0);
        p242x0.c.W(parcel, 15, c1169k.f18064n, false);
        p242x0.c.d0(iC0, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        double[] dArr;
        switch (this.f17785a) {
            case 0:
                int iM0 = p206t6.b.m0(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < iM0) {
                    int i10 = parcel.readInt();
                    if (((char) i10) != 1) {
                        p206t6.b.e0(i10, parcel);
                    } else {
                        pendingIntent = (PendingIntent) p206t6.b.v(parcel, i10, PendingIntent.CREATOR);
                    }
                }
                p206t6.b.B(iM0, parcel);
                return new m(pendingIntent);
            case 1:
                int iM1 = p206t6.b.m0(parcel);
                int iT = 0;
                r rVar = null;
                String strW = null;
                while (parcel.dataPosition() < iM1) {
                    int i11 = parcel.readInt();
                    char c3 = (char) i11;
                    if (c3 == 1) {
                        rVar = (r) p206t6.b.v(parcel, i11, r.CREATOR);
                    } else if (c3 == 2) {
                        strW = p206t6.b.w(i11, parcel);
                    } else if (c3 != 3) {
                        p206t6.b.e0(i11, parcel);
                    } else {
                        iT = p206t6.b.T(i11, parcel);
                    }
                }
                p206t6.b.B(iM1, parcel);
                return new n(rVar, strW, iT);
            case 2:
                int iM2 = p206t6.b.m0(parcel);
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < iM2) {
                    int i12 = parcel.readInt();
                    if (((char) i12) != 1) {
                        p206t6.b.e0(i12, parcel);
                    } else {
                        pendingIntent2 = (PendingIntent) p206t6.b.v(parcel, i12, PendingIntent.CREATOR);
                    }
                }
                p206t6.b.B(iM2, parcel);
                return new o(pendingIntent2);
            case 3:
                int iM3 = p206t6.b.m0(parcel);
                String strW2 = null;
                String strW3 = null;
                String strW4 = null;
                String strW5 = null;
                Uri uri = null;
                String strW6 = null;
                String strW7 = null;
                String strW8 = null;
                C0957x c0957x = null;
                while (parcel.dataPosition() < iM3) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 1:
                            strW2 = p206t6.b.w(i13, parcel);
                            break;
                        case 2:
                            strW3 = p206t6.b.w(i13, parcel);
                            break;
                        case 3:
                            strW4 = p206t6.b.w(i13, parcel);
                            break;
                        case 4:
                            strW5 = p206t6.b.w(i13, parcel);
                            break;
                        case 5:
                            uri = (Uri) p206t6.b.v(parcel, i13, Uri.CREATOR);
                            break;
                        case 6:
                            strW6 = p206t6.b.w(i13, parcel);
                            break;
                        case 7:
                            strW7 = p206t6.b.w(i13, parcel);
                            break;
                        case '\b':
                            strW8 = p206t6.b.w(i13, parcel);
                            break;
                        case '\t':
                            c0957x = (C0957x) p206t6.b.v(parcel, i13, C0957x.CREATOR);
                            break;
                        default:
                            p206t6.b.e0(i13, parcel);
                            break;
                    }
                }
                p206t6.b.B(iM3, parcel);
                return new q(strW2, strW3, strW4, strW5, uri, strW6, strW7, strW8, c0957x);
            case 4:
                int iM4 = p206t6.b.m0(parcel);
                String strW9 = null;
                String strW10 = null;
                while (parcel.dataPosition() < iM4) {
                    int i14 = parcel.readInt();
                    char c9 = (char) i14;
                    if (c9 == 1) {
                        strW9 = p206t6.b.w(i14, parcel);
                    } else if (c9 != 2) {
                        p206t6.b.e0(i14, parcel);
                    } else {
                        strW10 = p206t6.b.w(i14, parcel);
                    }
                }
                p206t6.b.B(iM4, parcel);
                return new r(strW9, strW10);
            case 5:
                int iM5 = p206t6.b.m0(parcel);
                String strW11 = null;
                int iT2 = 0;
                while (parcel.dataPosition() < iM5) {
                    int i15 = parcel.readInt();
                    char c10 = (char) i15;
                    if (c10 == 1) {
                        iT2 = p206t6.b.T(i15, parcel);
                    } else if (c10 != 2) {
                        p206t6.b.e0(i15, parcel);
                    } else {
                        strW11 = p206t6.b.w(i15, parcel);
                    }
                }
                p206t6.b.B(iM5, parcel);
                return new C1165g(iT2, strW11);
            case 6:
                int iM6 = p206t6.b.m0(parcel);
                ArrayList arrayListZ = null;
                int iT3 = 0;
                while (parcel.dataPosition() < iM6) {
                    int i16 = parcel.readInt();
                    char c11 = (char) i16;
                    if (c11 == 1) {
                        iT3 = p206t6.b.T(i16, parcel);
                    } else if (c11 != 2) {
                        p206t6.b.e0(i16, parcel);
                    } else {
                        arrayListZ = p206t6.b.z(parcel, i16, C1176s.CREATOR);
                    }
                }
                p206t6.b.B(iM6, parcel);
                return new C1179v(iT3, arrayListZ);
            case 7:
                int iM7 = p206t6.b.m0(parcel);
                int iT4 = -1;
                int iT5 = 0;
                int iT6 = 0;
                int iT7 = 0;
                int iT8 = 0;
                String strW12 = null;
                String strW13 = null;
                long jV = 0;
                long jV2 = 0;
                while (parcel.dataPosition() < iM7) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case 1:
                            iT5 = p206t6.b.T(i17, parcel);
                            break;
                        case 2:
                            iT6 = p206t6.b.T(i17, parcel);
                            break;
                        case 3:
                            iT7 = p206t6.b.T(i17, parcel);
                            break;
                        case 4:
                            jV = p206t6.b.V(i17, parcel);
                            break;
                        case 5:
                            jV2 = p206t6.b.V(i17, parcel);
                            break;
                        case 6:
                            strW12 = p206t6.b.w(i17, parcel);
                            break;
                        case 7:
                            strW13 = p206t6.b.w(i17, parcel);
                            break;
                        case '\b':
                            iT8 = p206t6.b.T(i17, parcel);
                            break;
                        case '\t':
                            iT4 = p206t6.b.T(i17, parcel);
                            break;
                        default:
                            p206t6.b.e0(i17, parcel);
                            break;
                    }
                }
                p206t6.b.B(iM7, parcel);
                return new C1176s(iT5, iT6, iT7, jV, jV2, strW12, strW13, iT8, iT4);
            case 8:
                int iM8 = p206t6.b.m0(parcel);
                Account account = null;
                int iT9 = 0;
                int iT10 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < iM8) {
                    int i18 = parcel.readInt();
                    char c12 = (char) i18;
                    if (c12 == 1) {
                        iT9 = p206t6.b.T(i18, parcel);
                    } else if (c12 == 2) {
                        account = (Account) p206t6.b.v(parcel, i18, Account.CREATOR);
                    } else if (c12 == 3) {
                        iT10 = p206t6.b.T(i18, parcel);
                    } else if (c12 != 4) {
                        p206t6.b.e0(i18, parcel);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) p206t6.b.v(parcel, i18, GoogleSignInAccount.CREATOR);
                    }
                }
                p206t6.b.B(iM8, parcel);
                return new A(iT9, account, iT10, googleSignInAccount);
            case 9:
                int iM9 = p206t6.b.m0(parcel);
                int iT11 = 0;
                boolean zP = false;
                boolean zP2 = false;
                IBinder iBinderS = null;
                H5.b bVar = null;
                while (parcel.dataPosition() < iM9) {
                    int i19 = parcel.readInt();
                    char c13 = (char) i19;
                    if (c13 == 1) {
                        iT11 = p206t6.b.T(i19, parcel);
                    } else if (c13 == 2) {
                        iBinderS = p206t6.b.S(i19, parcel);
                    } else if (c13 == 3) {
                        bVar = (H5.b) p206t6.b.v(parcel, i19, H5.b.CREATOR);
                    } else if (c13 == 4) {
                        zP = p206t6.b.P(i19, parcel);
                    } else if (c13 != 5) {
                        p206t6.b.e0(i19, parcel);
                    } else {
                        zP2 = p206t6.b.P(i19, parcel);
                    }
                }
                p206t6.b.B(iM9, parcel);
                return new B(iT11, iBinderS, bVar, zP, zP2);
            case 10:
                int iM10 = p206t6.b.m0(parcel);
                boolean zP3 = false;
                int iT12 = 0;
                int iT13 = 0;
                boolean zP4 = false;
                int iT14 = 0;
                while (parcel.dataPosition() < iM10) {
                    int i20 = parcel.readInt();
                    char c14 = (char) i20;
                    if (c14 == 1) {
                        iT12 = p206t6.b.T(i20, parcel);
                    } else if (c14 == 2) {
                        zP3 = p206t6.b.P(i20, parcel);
                    } else if (c14 == 3) {
                        zP4 = p206t6.b.P(i20, parcel);
                    } else if (c14 == 4) {
                        iT13 = p206t6.b.T(i20, parcel);
                    } else if (c14 != 5) {
                        p206t6.b.e0(i20, parcel);
                    } else {
                        iT14 = p206t6.b.T(i20, parcel);
                    }
                }
                p206t6.b.B(iM10, parcel);
                return new C1178u(zP3, iT12, iT13, zP4, iT14);
            case 11:
                int iM11 = p206t6.b.m0(parcel);
                Bundle bundleS = null;
                C1168j c1168j = null;
                int iT15 = 0;
                H5.d[] dVarArr = null;
                while (parcel.dataPosition() < iM11) {
                    int i21 = parcel.readInt();
                    char c15 = (char) i21;
                    if (c15 == 1) {
                        bundleS = p206t6.b.s(i21, parcel);
                    } else if (c15 == 2) {
                        dVarArr = (H5.d[]) p206t6.b.y(parcel, i21, H5.d.CREATOR);
                    } else if (c15 == 3) {
                        iT15 = p206t6.b.T(i21, parcel);
                    } else if (c15 != 4) {
                        p206t6.b.e0(i21, parcel);
                    } else {
                        c1168j = (C1168j) p206t6.b.v(parcel, i21, C1168j.CREATOR);
                    }
                }
                p206t6.b.B(iM11, parcel);
                M m8 = new M();
                m8.f18007a = bundleS;
                m8.f18008b = dVarArr;
                m8.f18009c = iT15;
                m8.f18010d = c1168j;
                return m8;
            case 12:
                int iM12 = p206t6.b.m0(parcel);
                C1178u c1178u = null;
                int[] iArrU = null;
                int[] iArrU2 = null;
                boolean zP5 = false;
                boolean zP6 = false;
                int iT16 = 0;
                while (parcel.dataPosition() < iM12) {
                    int i22 = parcel.readInt();
                    switch ((char) i22) {
                        case 1:
                            c1178u = (C1178u) p206t6.b.v(parcel, i22, C1178u.CREATOR);
                            break;
                        case 2:
                            zP5 = p206t6.b.P(i22, parcel);
                            break;
                        case 3:
                            zP6 = p206t6.b.P(i22, parcel);
                            break;
                        case 4:
                            iArrU = p206t6.b.u(i22, parcel);
                            break;
                        case 5:
                            iT16 = p206t6.b.T(i22, parcel);
                            break;
                        case 6:
                            iArrU2 = p206t6.b.u(i22, parcel);
                            break;
                        default:
                            p206t6.b.e0(i22, parcel);
                            break;
                    }
                }
                p206t6.b.B(iM12, parcel);
                return new C1168j(c1178u, zP5, zP6, iArrU, iT16, iArrU2);
            case 13:
                int iM13 = p206t6.b.m0(parcel);
                Scope[] scopeArr = C1169k.f18050o;
                Bundle bundle = new Bundle();
                H5.d[] dVarArr2 = C1169k.f18051p;
                H5.d[] dVarArr3 = dVarArr2;
                String strW14 = null;
                IBinder iBinderS2 = null;
                Account account2 = null;
                String strW15 = null;
                int iT17 = 0;
                int iT18 = 0;
                int iT19 = 0;
                boolean zP7 = false;
                int iT20 = 0;
                boolean zP8 = false;
                while (parcel.dataPosition() < iM13) {
                    int i23 = parcel.readInt();
                    switch ((char) i23) {
                        case 1:
                            iT17 = p206t6.b.T(i23, parcel);
                            break;
                        case 2:
                            iT18 = p206t6.b.T(i23, parcel);
                            break;
                        case 3:
                            iT19 = p206t6.b.T(i23, parcel);
                            break;
                        case 4:
                            strW14 = p206t6.b.w(i23, parcel);
                            break;
                        case 5:
                            iBinderS2 = p206t6.b.S(i23, parcel);
                            break;
                        case 6:
                            scopeArr = (Scope[]) p206t6.b.y(parcel, i23, Scope.CREATOR);
                            break;
                        case 7:
                            bundle = p206t6.b.s(i23, parcel);
                            break;
                        case '\b':
                            account2 = (Account) p206t6.b.v(parcel, i23, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            p206t6.b.e0(i23, parcel);
                            break;
                        case '\n':
                            dVarArr2 = (H5.d[]) p206t6.b.y(parcel, i23, H5.d.CREATOR);
                            break;
                        case 11:
                            dVarArr3 = (H5.d[]) p206t6.b.y(parcel, i23, H5.d.CREATOR);
                            break;
                        case '\f':
                            zP7 = p206t6.b.P(i23, parcel);
                            break;
                        case '\r':
                            iT20 = p206t6.b.T(i23, parcel);
                            break;
                        case 14:
                            zP8 = p206t6.b.P(i23, parcel);
                            break;
                        case 15:
                            strW15 = p206t6.b.w(i23, parcel);
                            break;
                    }
                }
                p206t6.b.B(iM13, parcel);
                return new C1169k(iT17, iT18, iT19, strW14, iBinderS2, scopeArr, bundle, account2, dVarArr2, dVarArr3, zP7, iT20, zP8, strW15);
            case 14:
                kotlin.jvm.internal.m.f(parcel, "parcel");
                return new p066g.a(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
            case 15:
                kotlin.jvm.internal.m.f(parcel, "inParcel");
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                kotlin.jvm.internal.m.c(parcelable);
                return new p066g.l((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 16:
                kotlin.jvm.internal.m.f(parcel, "parcel");
                double d10 = parcel.readDouble();
                LatLng latLng = Build.VERSION.SDK_INT > 33 ? (LatLng) parcel.readParcelable(LatLng.class.getClassLoader(), LatLng.class) : (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
                double d11 = parcel.readDouble();
                double d12 = parcel.readDouble();
                int i24 = parcel.readInt();
                if (i24 > 0) {
                    dArr = new double[i24];
                    for (int i25 = 0; i25 < i24; i25++) {
                        dArr[i25] = parcel.readDouble();
                    }
                } else {
                    dArr = null;
                }
                return new CameraPosition(latLng, d12, d11, d10, dArr);
            case 17:
                String string = parcel.readString();
                string.getClass();
                return new p102j3.a(parcel.readInt(), string);
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                kotlin.jvm.internal.m.f(parcel, "parcel");
                return new LatLng(parcel);
            case 19:
                kotlin.jvm.internal.m.f(parcel, "parcel");
                LatLngBounds.Companion.getClass();
                return new LatLngBounds(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                kotlin.jvm.internal.m.f(parcel, "parcel");
                return new LatLngQuad(new LatLng(parcel), new LatLng(parcel), new LatLng(parcel), new LatLng(parcel));
            case 21:
                kotlin.jvm.internal.m.f(parcel, "parcel");
                p109ja.b bVar2 = new p109ja.b();
                bVar2.f21534a = parcel.readDouble();
                bVar2.f21535b = parcel.readDouble();
                return bVar2;
            case 22:
                kotlin.jvm.internal.m.f(parcel, "parcel");
                ProjectedMeters projectedMeters = new ProjectedMeters();
                projectedMeters.f24633a = parcel.readDouble();
                projectedMeters.f24634b = parcel.readDouble();
                return projectedMeters;
            case 23:
                kotlin.jvm.internal.m.f(parcel, "parcel");
                return new p109ja.d(parcel);
            case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                return new p113k3.a(parcel);
            case 25:
                return new p125l3.a(parcel);
            case 26:
                return new p125l3.b(parcel);
            case 27:
                return new p136m3.b(parcel);
            case 28:
                return new p136m3.c(parcel);
            default:
                return new p146n3.a(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f17785a) {
            case 0:
                return new m[i10];
            case 1:
                return new n[i10];
            case 2:
                return new o[i10];
            case 3:
                return new q[i10];
            case 4:
                return new r[i10];
            case 5:
                return new C1165g[i10];
            case 6:
                return new C1179v[i10];
            case 7:
                return new C1176s[i10];
            case 8:
                return new A[i10];
            case 9:
                return new B[i10];
            case 10:
                return new C1178u[i10];
            case 11:
                return new M[i10];
            case 12:
                return new C1168j[i10];
            case 13:
                return new C1169k[i10];
            case 14:
                return new p066g.a[i10];
            case 15:
                return new p066g.l[i10];
            case 16:
                return new CameraPosition[i10];
            case 17:
                return new p102j3.a[i10];
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return new LatLng[i10];
            case 19:
                return new LatLngBounds[i10];
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                return new LatLngQuad[i10];
            case 21:
                return new p109ja.b[i10];
            case 22:
                return new ProjectedMeters[i10];
            case 23:
                return new p109ja.d[i10];
            case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                return new p113k3.a[i10];
            case 25:
                return new p125l3.a[i10];
            case 26:
                return new p125l3.b[i10];
            case 27:
                return new p136m3.b[i10];
            case 28:
                return new p136m3.c[i10];
            default:
                return new p146n3.a[i10];
        }
    }
}
