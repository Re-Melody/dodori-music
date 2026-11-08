package Z6;

import D7.p1;
import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.media.MediaDescription;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import androidx.fragment.app.C1070b;
import androidx.fragment.app.C1072c;
import androidx.fragment.app.C1073c0;
import androidx.fragment.app.C1087j0;
import androidx.fragment.app.n0;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.auth.api.identity.ClearTokenRequest;
import com.google.android.gms.auth.api.identity.RevokeAccessRequest;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.util.ArrayList;
import org.apache.tika.utils.XMLReaderUtils;

/* JADX INFO: loaded from: classes.dex */
public final class J implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13939a;

    public /* synthetic */ J(int i10) {
        this.f13939a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iT = 0;
        boolean zP = false;
        boolean zP2 = false;
        boolean zP3 = false;
        int iT2 = 0;
        boolean zP4 = false;
        int iT3 = 0;
        int iT4 = 0;
        String strW = null;
        ArrayList arrayListZ = null;
        byte[] bArrT = null;
        String strW2 = null;
        String strW3 = null;
        String strW4 = null;
        PendingIntent pendingIntent = null;
        H5.b bVar = null;
        com.google.android.gms.common.internal.A a10 = null;
        ArrayList arrayListX = null;
        p027c.b bVar2 = null;
        switch (this.f13939a) {
            case 0:
                int iM0 = p206t6.b.m0(parcel);
                boolean zP5 = false;
                String strW5 = null;
                String strW6 = null;
                String strW7 = null;
                String strW8 = null;
                while (parcel.dataPosition() < iM0) {
                    int i10 = parcel.readInt();
                    char c3 = (char) i10;
                    if (c3 == 1) {
                        strW5 = p206t6.b.w(i10, parcel);
                    } else if (c3 == 2) {
                        strW6 = p206t6.b.w(i10, parcel);
                    } else if (c3 == 3) {
                        strW7 = p206t6.b.w(i10, parcel);
                    } else if (c3 == 4) {
                        strW8 = p206t6.b.w(i10, parcel);
                    } else if (c3 != 5) {
                        p206t6.b.e0(i10, parcel);
                    } else {
                        zP5 = p206t6.b.P(i10, parcel);
                    }
                }
                p206t6.b.B(iM0, parcel);
                return new C0999d(strW5, strW6, strW7, strW8, zP5);
            case 1:
                int iM1 = p206t6.b.m0(parcel);
                while (parcel.dataPosition() < iM1) {
                    int i11 = parcel.readInt();
                    if (((char) i11) != 1) {
                        p206t6.b.e0(i11, parcel);
                    } else {
                        strW = p206t6.b.w(i11, parcel);
                    }
                }
                p206t6.b.B(iM1, parcel);
                return new C1000e(strW);
            case 2:
                return new MediaBrowserCompat$MediaItem(parcel);
            case 3:
                return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
            case 4:
                return new MediaMetadataCompat(parcel);
            case 5:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 6:
                return new C1070b(parcel);
            case 7:
                return new C1072c(parcel);
            case 8:
                C1073c0 c1073c0 = new C1073c0();
                c1073c0.f15281a = parcel.readString();
                c1073c0.f15282b = parcel.readInt();
                return c1073c0;
            case 9:
                C1087j0 c1087j0 = new C1087j0();
                c1087j0.f15350e = null;
                c1087j0.f15351f = new ArrayList();
                c1087j0.f15352g = new ArrayList();
                c1087j0.f15346a = parcel.createStringArrayList();
                c1087j0.f15347b = parcel.createStringArrayList();
                c1087j0.f15348c = (C1070b[]) parcel.createTypedArray(C1070b.CREATOR);
                c1087j0.f15349d = parcel.readInt();
                c1087j0.f15350e = parcel.readString();
                c1087j0.f15351f = parcel.createStringArrayList();
                c1087j0.f15352g = parcel.createTypedArrayList(C1072c.CREATOR);
                c1087j0.f15353h = parcel.createTypedArrayList(C1073c0.CREATOR);
                return c1087j0;
            case 10:
                return new n0(parcel);
            case 11:
                p027c.d dVar = new p027c.d();
                IBinder strongBinder = parcel.readStrongBinder();
                int i12 = p027c.c.f15821b;
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(p027c.b.f15820l);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof p027c.b)) {
                        p027c.a aVar = new p027c.a();
                        aVar.f15819a = strongBinder;
                        bVar2 = aVar;
                    } else {
                        bVar2 = (p027c.b) iInterfaceQueryLocalInterface;
                    }
                }
                dVar.f15823a = bVar2;
                return dVar;
            case 12:
                int iM2 = p206t6.b.m0(parcel);
                Intent intent = null;
                int iT5 = 0;
                while (parcel.dataPosition() < iM2) {
                    int i13 = parcel.readInt();
                    char c9 = (char) i13;
                    if (c9 == 1) {
                        iT = p206t6.b.T(i13, parcel);
                    } else if (c9 == 2) {
                        iT5 = p206t6.b.T(i13, parcel);
                    } else if (c9 != 3) {
                        p206t6.b.e0(i13, parcel);
                    } else {
                        intent = (Intent) p206t6.b.v(parcel, i13, Intent.CREATOR);
                    }
                }
                p206t6.b.B(iM2, parcel);
                return new p032c6.b(iT, iT5, intent);
            case 13:
                int iM3 = p206t6.b.m0(parcel);
                String strW9 = null;
                while (parcel.dataPosition() < iM3) {
                    int i14 = parcel.readInt();
                    char c10 = (char) i14;
                    if (c10 == 1) {
                        arrayListX = p206t6.b.x(i14, parcel);
                    } else if (c10 != 2) {
                        p206t6.b.e0(i14, parcel);
                    } else {
                        strW9 = p206t6.b.w(i14, parcel);
                    }
                }
                p206t6.b.B(iM3, parcel);
                return new p032c6.e(strW9, arrayListX);
            case 14:
                int iM4 = p206t6.b.m0(parcel);
                while (parcel.dataPosition() < iM4) {
                    int i15 = parcel.readInt();
                    char c11 = (char) i15;
                    if (c11 == 1) {
                        iT4 = p206t6.b.T(i15, parcel);
                    } else if (c11 != 2) {
                        p206t6.b.e0(i15, parcel);
                    } else {
                        a10 = (com.google.android.gms.common.internal.A) p206t6.b.v(parcel, i15, com.google.android.gms.common.internal.A.CREATOR);
                    }
                }
                p206t6.b.B(iM4, parcel);
                return new p032c6.f(iT4, a10);
            case 15:
                int iM5 = p206t6.b.m0(parcel);
                com.google.android.gms.common.internal.B b10 = null;
                while (parcel.dataPosition() < iM5) {
                    int i16 = parcel.readInt();
                    char c12 = (char) i16;
                    if (c12 == 1) {
                        iT3 = p206t6.b.T(i16, parcel);
                    } else if (c12 == 2) {
                        bVar = (H5.b) p206t6.b.v(parcel, i16, H5.b.CREATOR);
                    } else if (c12 != 3) {
                        p206t6.b.e0(i16, parcel);
                    } else {
                        b10 = (com.google.android.gms.common.internal.B) p206t6.b.v(parcel, i16, com.google.android.gms.common.internal.B.CREATOR);
                    }
                }
                p206t6.b.B(iM5, parcel);
                return new p032c6.g(iT3, bVar, b10);
            case 16:
                int iM6 = p206t6.b.m0(parcel);
                boolean zP6 = false;
                boolean zP7 = false;
                boolean zP8 = false;
                boolean zP9 = false;
                int iT6 = 0;
                ArrayList arrayListZ2 = null;
                String strW10 = null;
                Account account = null;
                String strW11 = null;
                String strW12 = null;
                Bundle bundleS = null;
                while (parcel.dataPosition() < iM6) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case 1:
                            arrayListZ2 = p206t6.b.z(parcel, i17, Scope.CREATOR);
                            break;
                        case 2:
                            strW10 = p206t6.b.w(i17, parcel);
                            break;
                        case 3:
                            zP6 = p206t6.b.P(i17, parcel);
                            break;
                        case 4:
                            zP7 = p206t6.b.P(i17, parcel);
                            break;
                        case 5:
                            account = (Account) p206t6.b.v(parcel, i17, Account.CREATOR);
                            break;
                        case 6:
                            strW11 = p206t6.b.w(i17, parcel);
                            break;
                        case 7:
                            strW12 = p206t6.b.w(i17, parcel);
                            break;
                        case '\b':
                            zP8 = p206t6.b.P(i17, parcel);
                            break;
                        case '\t':
                            bundleS = p206t6.b.s(i17, parcel);
                            break;
                        case '\n':
                            zP9 = p206t6.b.P(i17, parcel);
                            break;
                        case 11:
                            iT6 = p206t6.b.T(i17, parcel);
                            break;
                        default:
                            p206t6.b.e0(i17, parcel);
                            break;
                    }
                }
                p206t6.b.B(iM6, parcel);
                return new AuthorizationRequest(arrayListZ2, strW10, zP6, zP7, account, strW11, strW12, zP8, bundleS, zP9, iT6);
            case 17:
                int iM7 = p206t6.b.m0(parcel);
                String strW13 = null;
                String strW14 = null;
                String strW15 = null;
                ArrayList arrayListX2 = null;
                GoogleSignInAccount googleSignInAccount = null;
                PendingIntent pendingIntent2 = null;
                Bundle bundleS2 = null;
                while (parcel.dataPosition() < iM7) {
                    int i18 = parcel.readInt();
                    switch ((char) i18) {
                        case 1:
                            strW13 = p206t6.b.w(i18, parcel);
                            break;
                        case 2:
                            strW14 = p206t6.b.w(i18, parcel);
                            break;
                        case 3:
                            strW15 = p206t6.b.w(i18, parcel);
                            break;
                        case 4:
                            arrayListX2 = p206t6.b.x(i18, parcel);
                            break;
                        case 5:
                            googleSignInAccount = (GoogleSignInAccount) p206t6.b.v(parcel, i18, GoogleSignInAccount.CREATOR);
                            break;
                        case 6:
                            pendingIntent2 = (PendingIntent) p206t6.b.v(parcel, i18, PendingIntent.CREATOR);
                            break;
                        case 7:
                            bundleS2 = p206t6.b.s(i18, parcel);
                            break;
                        default:
                            p206t6.b.e0(i18, parcel);
                            break;
                    }
                }
                p206t6.b.B(iM7, parcel);
                return new com.google.android.gms.auth.api.identity.d(strW13, strW14, strW15, arrayListX2, googleSignInAccount, pendingIntent2, bundleS2);
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                int iM8 = p206t6.b.m0(parcel);
                boolean zP10 = false;
                int iT7 = 0;
                boolean zP11 = false;
                com.google.android.gms.auth.api.identity.h hVar = null;
                com.google.android.gms.auth.api.identity.e eVar = null;
                String strW16 = null;
                com.google.android.gms.auth.api.identity.g gVar = null;
                com.google.android.gms.auth.api.identity.f fVar = null;
                while (parcel.dataPosition() < iM8) {
                    int i19 = parcel.readInt();
                    switch ((char) i19) {
                        case 1:
                            hVar = (com.google.android.gms.auth.api.identity.h) p206t6.b.v(parcel, i19, com.google.android.gms.auth.api.identity.h.CREATOR);
                            break;
                        case 2:
                            eVar = (com.google.android.gms.auth.api.identity.e) p206t6.b.v(parcel, i19, com.google.android.gms.auth.api.identity.e.CREATOR);
                            break;
                        case 3:
                            strW16 = p206t6.b.w(i19, parcel);
                            break;
                        case 4:
                            zP10 = p206t6.b.P(i19, parcel);
                            break;
                        case 5:
                            iT7 = p206t6.b.T(i19, parcel);
                            break;
                        case 6:
                            gVar = (com.google.android.gms.auth.api.identity.g) p206t6.b.v(parcel, i19, com.google.android.gms.auth.api.identity.g.CREATOR);
                            break;
                        case 7:
                            fVar = (com.google.android.gms.auth.api.identity.f) p206t6.b.v(parcel, i19, com.google.android.gms.auth.api.identity.f.CREATOR);
                            break;
                        case '\b':
                            zP11 = p206t6.b.P(i19, parcel);
                            break;
                        default:
                            p206t6.b.e0(i19, parcel);
                            break;
                    }
                }
                p206t6.b.B(iM8, parcel);
                return new com.google.android.gms.auth.api.identity.i(hVar, eVar, strW16, zP10, iT7, gVar, fVar, zP11);
            case 19:
                int iM9 = p206t6.b.m0(parcel);
                while (parcel.dataPosition() < iM9) {
                    int i20 = parcel.readInt();
                    if (((char) i20) != 1) {
                        p206t6.b.e0(i20, parcel);
                    } else {
                        pendingIntent = (PendingIntent) p206t6.b.v(parcel, i20, PendingIntent.CREATOR);
                    }
                }
                p206t6.b.B(iM9, parcel);
                return new com.google.android.gms.auth.api.identity.j(pendingIntent);
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                int iM10 = p206t6.b.m0(parcel);
                while (parcel.dataPosition() < iM10) {
                    int i21 = parcel.readInt();
                    char c13 = (char) i21;
                    if (c13 == 1) {
                        strW4 = p206t6.b.w(i21, parcel);
                    } else if (c13 != 2) {
                        p206t6.b.e0(i21, parcel);
                    } else {
                        zP4 = p206t6.b.P(i21, parcel);
                    }
                }
                p206t6.b.B(iM10, parcel);
                return new com.google.android.gms.auth.api.identity.t(strW4, zP4);
            case 21:
                int iM11 = p206t6.b.m0(parcel);
                String strW17 = null;
                while (parcel.dataPosition() < iM11) {
                    int i22 = parcel.readInt();
                    char c14 = (char) i22;
                    if (c14 == 1) {
                        strW3 = p206t6.b.w(i22, parcel);
                    } else if (c14 != 2) {
                        p206t6.b.e0(i22, parcel);
                    } else {
                        strW17 = p206t6.b.w(i22, parcel);
                    }
                }
                p206t6.b.B(iM11, parcel);
                return new ClearTokenRequest(strW3, strW17);
            case 22:
                int iM12 = p206t6.b.m0(parcel);
                while (parcel.dataPosition() < iM12) {
                    int i23 = parcel.readInt();
                    if (((char) i23) != 1) {
                        p206t6.b.e0(i23, parcel);
                    } else {
                        iT2 = p206t6.b.T(i23, parcel);
                    }
                }
                p206t6.b.B(iM12, parcel);
                return new com.google.android.gms.auth.api.identity.k(iT2);
            case 23:
                int iM13 = p206t6.b.m0(parcel);
                boolean zP12 = false;
                int iT8 = 0;
                String strW18 = null;
                String strW19 = null;
                String strW20 = null;
                String strW21 = null;
                ArrayList arrayListZ3 = null;
                while (parcel.dataPosition() < iM13) {
                    int i24 = parcel.readInt();
                    switch ((char) i24) {
                        case 1:
                            strW18 = p206t6.b.w(i24, parcel);
                            break;
                        case 2:
                            strW19 = p206t6.b.w(i24, parcel);
                            break;
                        case 3:
                            strW20 = p206t6.b.w(i24, parcel);
                            break;
                        case 4:
                            strW21 = p206t6.b.w(i24, parcel);
                            break;
                        case 5:
                            zP12 = p206t6.b.P(i24, parcel);
                            break;
                        case 6:
                            iT8 = p206t6.b.T(i24, parcel);
                            break;
                        case 7:
                            arrayListZ3 = p206t6.b.z(parcel, i24, com.google.android.gms.auth.api.identity.t.CREATOR);
                            break;
                        default:
                            p206t6.b.e0(i24, parcel);
                            break;
                    }
                }
                p206t6.b.B(iM13, parcel);
                return new com.google.android.gms.auth.api.identity.l(strW18, strW19, strW20, strW21, zP12, iT8, arrayListZ3);
            case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                int iM14 = p206t6.b.m0(parcel);
                boolean zP13 = false;
                boolean zP14 = false;
                boolean zP15 = false;
                String strW22 = null;
                String strW23 = null;
                String strW24 = null;
                ArrayList arrayListX3 = null;
                ArrayList arrayListZ4 = null;
                String strW25 = null;
                while (parcel.dataPosition() < iM14) {
                    int i25 = parcel.readInt();
                    switch ((char) i25) {
                        case 1:
                            zP13 = p206t6.b.P(i25, parcel);
                            break;
                        case 2:
                            strW22 = p206t6.b.w(i25, parcel);
                            break;
                        case 3:
                            strW23 = p206t6.b.w(i25, parcel);
                            break;
                        case 4:
                            zP14 = p206t6.b.P(i25, parcel);
                            break;
                        case 5:
                            strW24 = p206t6.b.w(i25, parcel);
                            break;
                        case 6:
                            arrayListX3 = p206t6.b.x(i25, parcel);
                            break;
                        case 7:
                            zP15 = p206t6.b.P(i25, parcel);
                            break;
                        case '\b':
                            arrayListZ4 = p206t6.b.z(parcel, i25, com.google.android.gms.auth.api.identity.t.CREATOR);
                            break;
                        case '\t':
                            strW25 = p206t6.b.w(i25, parcel);
                            break;
                        default:
                            p206t6.b.e0(i25, parcel);
                            break;
                    }
                }
                p206t6.b.B(iM14, parcel);
                return new com.google.android.gms.auth.api.identity.e(zP13, strW22, strW23, zP14, strW24, arrayListX3, zP15, arrayListZ4, strW25);
            case 25:
                int iM15 = p206t6.b.m0(parcel);
                while (parcel.dataPosition() < iM15) {
                    int i26 = parcel.readInt();
                    char c15 = (char) i26;
                    if (c15 == 1) {
                        zP3 = p206t6.b.P(i26, parcel);
                    } else if (c15 != 2) {
                        p206t6.b.e0(i26, parcel);
                    } else {
                        strW2 = p206t6.b.w(i26, parcel);
                    }
                }
                p206t6.b.B(iM15, parcel);
                return new com.google.android.gms.auth.api.identity.f(zP3, strW2);
            case 26:
                int iM16 = p206t6.b.m0(parcel);
                String strW26 = null;
                while (parcel.dataPosition() < iM16) {
                    int i27 = parcel.readInt();
                    char c16 = (char) i27;
                    if (c16 == 1) {
                        zP2 = p206t6.b.P(i27, parcel);
                    } else if (c16 == 2) {
                        bArrT = p206t6.b.t(i27, parcel);
                    } else if (c16 != 3) {
                        p206t6.b.e0(i27, parcel);
                    } else {
                        strW26 = p206t6.b.w(i27, parcel);
                    }
                }
                p206t6.b.B(iM16, parcel);
                return new com.google.android.gms.auth.api.identity.g(strW26, zP2, bArrT);
            case 27:
                int iM17 = p206t6.b.m0(parcel);
                while (parcel.dataPosition() < iM17) {
                    int i28 = parcel.readInt();
                    if (((char) i28) != 1) {
                        p206t6.b.e0(i28, parcel);
                    } else {
                        zP = p206t6.b.P(i28, parcel);
                    }
                }
                p206t6.b.B(iM17, parcel);
                return new com.google.android.gms.auth.api.identity.h(zP);
            case 28:
                int iM18 = p206t6.b.m0(parcel);
                Account account2 = null;
                String strW27 = null;
                while (parcel.dataPosition() < iM18) {
                    int i29 = parcel.readInt();
                    char c17 = (char) i29;
                    if (c17 == 1) {
                        arrayListZ = p206t6.b.z(parcel, i29, Scope.CREATOR);
                    } else if (c17 == 2) {
                        account2 = (Account) p206t6.b.v(parcel, i29, Account.CREATOR);
                    } else if (c17 != 3) {
                        p206t6.b.e0(i29, parcel);
                    } else {
                        strW27 = p206t6.b.w(i29, parcel);
                    }
                }
                p206t6.b.B(iM18, parcel);
                return new RevokeAccessRequest(arrayListZ, account2, strW27);
            default:
                int iM19 = p206t6.b.m0(parcel);
                int iT9 = 0;
                PendingIntent pendingIntent3 = null;
                String strW28 = null;
                String strW29 = null;
                ArrayList arrayListX4 = null;
                String strW30 = null;
                while (parcel.dataPosition() < iM19) {
                    int i30 = parcel.readInt();
                    switch ((char) i30) {
                        case 1:
                            pendingIntent3 = (PendingIntent) p206t6.b.v(parcel, i30, PendingIntent.CREATOR);
                            break;
                        case 2:
                            strW28 = p206t6.b.w(i30, parcel);
                            break;
                        case 3:
                            strW29 = p206t6.b.w(i30, parcel);
                            break;
                        case 4:
                            arrayListX4 = p206t6.b.x(i30, parcel);
                            break;
                        case 5:
                            strW30 = p206t6.b.w(i30, parcel);
                            break;
                        case 6:
                            iT9 = p206t6.b.T(i30, parcel);
                            break;
                        default:
                            p206t6.b.e0(i30, parcel);
                            break;
                    }
                }
                p206t6.b.B(iM19, parcel);
                return new SaveAccountLinkingTokenRequest(pendingIntent3, strW28, strW29, arrayListX4, strW30, iT9);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f13939a) {
            case 0:
                return new C0999d[i10];
            case 1:
                return new C1000e[i10];
            case 2:
                return new MediaBrowserCompat$MediaItem[i10];
            case 3:
                return new MediaDescriptionCompat[i10];
            case 4:
                return new MediaMetadataCompat[i10];
            case 5:
                return new RatingCompat[i10];
            case 6:
                return new C1070b[i10];
            case 7:
                return new C1072c[i10];
            case 8:
                return new C1073c0[i10];
            case 9:
                return new C1087j0[i10];
            case 10:
                return new n0[i10];
            case 11:
                return new p027c.d[i10];
            case 12:
                return new p032c6.b[i10];
            case 13:
                return new p032c6.e[i10];
            case 14:
                return new p032c6.f[i10];
            case 15:
                return new p032c6.g[i10];
            case 16:
                return new AuthorizationRequest[i10];
            case 17:
                return new com.google.android.gms.auth.api.identity.d[i10];
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return new com.google.android.gms.auth.api.identity.i[i10];
            case 19:
                return new com.google.android.gms.auth.api.identity.j[i10];
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                return new com.google.android.gms.auth.api.identity.t[i10];
            case 21:
                return new ClearTokenRequest[i10];
            case 22:
                return new com.google.android.gms.auth.api.identity.k[i10];
            case 23:
                return new com.google.android.gms.auth.api.identity.l[i10];
            case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                return new com.google.android.gms.auth.api.identity.e[i10];
            case 25:
                return new com.google.android.gms.auth.api.identity.f[i10];
            case 26:
                return new com.google.android.gms.auth.api.identity.g[i10];
            case 27:
                return new com.google.android.gms.auth.api.identity.h[i10];
            case 28:
                return new RevokeAccessRequest[i10];
            default:
                return new SaveAccountLinkingTokenRequest[i10];
        }
    }
}
