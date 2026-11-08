package io.flutter.plugins.firebase.auth;

import Z6.AbstractC1009n;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Base64;
import com.google.firebase.auth.FirebaseAuth;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import p011a7.C1018f;
import p140m7.C2061m;

/* JADX INFO: renamed from: io.flutter.plugins.firebase.auth.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1966n implements p161o8.q, p142n.w, p198s9.a, p225v5.a {
    public static void e(p161o8.f fVar, final C1966n c1966n) {
        Object obj = null;
        C2061m c2061m = new C2061m(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpSecretHostApi.generateQrCodeUrl", new p161o8.w(), obj);
        if (c1966n != null) {
            final int i10 = 0;
            c2061m.J(new p161o8.b(c1966n) { // from class: io.flutter.plugins.firebase.auth.A

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C1966n f20798b;

                {
                    this.f20798b = c1966n;
                }

                @Override // p161o8.b
                public final void g(Object obj2, W4.m mVar) {
                    switch (i10) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = (ArrayList) obj2;
                            String str = (String) arrayList2.get(0);
                            String str2 = (String) arrayList2.get(1);
                            String str3 = (String) arrayList2.get(2);
                            this.f20798b.getClass();
                            p011a7.B b10 = (p011a7.B) C1965m.f20929a.get(str);
                            if (str2 == null || str3 == null) {
                                FirebaseAuth firebaseAuth = b10.f14183g;
                                AbstractC1009n abstractC1009n = firebaseAuth.f18496f;
                                com.google.android.gms.common.internal.E.i(abstractC1009n, "Current user cannot be null, since user is required to be logged in to enroll for TOTP MFA.");
                                String str4 = ((C1018f) abstractC1009n).f14231b.f14222f;
                                com.google.android.gms.common.internal.E.f(str4, "Email cannot be empty, since verified email is required to use MFA.");
                                W6.h hVar = firebaseAuth.f18491a;
                                hVar.a();
                                arrayList.add(0, b10.a(str4, hVar.f12865b));
                                mVar.d(arrayList);
                            } else {
                                arrayList.add(0, b10.a(str2, str3));
                                mVar.d(arrayList);
                            }
                            break;
                        default:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str5 = (String) arrayList4.get(0);
                            String str6 = (String) arrayList4.get(1);
                            this.f20798b.getClass();
                            p011a7.B b11 = (p011a7.B) C1965m.f20929a.get(str5);
                            b11.getClass();
                            com.google.android.gms.common.internal.E.f(str6, "qrCodeUrl cannot be empty.");
                            try {
                                W6.h hVar2 = b11.f14183g.f18491a;
                                hVar2.a();
                                hVar2.f12864a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str6)).addFlags(268435456));
                            } catch (ActivityNotFoundException unused) {
                                W6.h hVar3 = b11.f14183g.f18491a;
                                hVar3.a();
                                hVar3.f12864a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/search?q=otpauth&c=apps")).addFlags(268435456));
                            }
                            arrayList3.add(0, null);
                            mVar.d(arrayList3);
                            break;
                    }
                }
            });
        } else {
            c2061m.J(null);
        }
        C2061m c2061m2 = new C2061m(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpSecretHostApi.openInOtpApp", new p161o8.w(), obj);
        if (c1966n == null) {
            c2061m2.J(null);
        } else {
            final int i11 = 1;
            c2061m2.J(new p161o8.b(c1966n) { // from class: io.flutter.plugins.firebase.auth.A

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C1966n f20798b;

                {
                    this.f20798b = c1966n;
                }

                @Override // p161o8.b
                public final void g(Object obj2, W4.m mVar) {
                    switch (i11) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = (ArrayList) obj2;
                            String str = (String) arrayList2.get(0);
                            String str2 = (String) arrayList2.get(1);
                            String str3 = (String) arrayList2.get(2);
                            this.f20798b.getClass();
                            p011a7.B b10 = (p011a7.B) C1965m.f20929a.get(str);
                            if (str2 == null || str3 == null) {
                                FirebaseAuth firebaseAuth = b10.f14183g;
                                AbstractC1009n abstractC1009n = firebaseAuth.f18496f;
                                com.google.android.gms.common.internal.E.i(abstractC1009n, "Current user cannot be null, since user is required to be logged in to enroll for TOTP MFA.");
                                String str4 = ((C1018f) abstractC1009n).f14231b.f14222f;
                                com.google.android.gms.common.internal.E.f(str4, "Email cannot be empty, since verified email is required to use MFA.");
                                W6.h hVar = firebaseAuth.f18491a;
                                hVar.a();
                                arrayList.add(0, b10.a(str4, hVar.f12865b));
                                mVar.d(arrayList);
                            } else {
                                arrayList.add(0, b10.a(str2, str3));
                                mVar.d(arrayList);
                            }
                            break;
                        default:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str5 = (String) arrayList4.get(0);
                            String str6 = (String) arrayList4.get(1);
                            this.f20798b.getClass();
                            p011a7.B b11 = (p011a7.B) C1965m.f20929a.get(str5);
                            b11.getClass();
                            com.google.android.gms.common.internal.E.f(str6, "qrCodeUrl cannot be empty.");
                            try {
                                W6.h hVar2 = b11.f14183g.f18491a;
                                hVar2.a();
                                hVar2.f12864a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str6)).addFlags(268435456));
                            } catch (ActivityNotFoundException unused) {
                                W6.h hVar3 = b11.f14183g.f18491a;
                                hVar3.a();
                                hVar3.f12864a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/search?q=otpauth&c=apps")).addFlags(268435456));
                            }
                            arrayList3.add(0, null);
                            mVar.d(arrayList3);
                            break;
                    }
                }
            });
        }
    }

    @Override // p142n.w
    public boolean b(p142n.l lVar) {
        return false;
    }

    @Override // p225v5.a
    public long c() {
        return SystemClock.elapsedRealtime();
    }

    public String d(List list) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(list);
            objectOutputStream.flush();
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // p161o8.q
    public void onMethodCall(p161o8.o oVar, p161o8.r rVar) {
        ((p150n8.o) rVar).b(null);
    }

    @Override // p142n.w
    public void a(p142n.l lVar, boolean z10) {
    }
}
