package io.flutter.plugins.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import java.util.ArrayList;
import java.util.UUID;
import p011a7.C1022j;
import p140m7.C2061m;

/* JADX INFO: loaded from: classes2.dex */
public interface z {
    static void a(p161o8.f fVar, final z zVar) {
        C1972u c1972u = C1972u.f20944h;
        Object obj = null;
        C2061m c2061m = new C2061m(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpHostApi.generateSecret", c1972u, obj);
        if (zVar != null) {
            final int i10 = 0;
            c2061m.J(new p161o8.b(zVar) { // from class: io.flutter.plugins.firebase.auth.y

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ z f20952b;

                {
                    this.f20952b = zVar;
                }

                @Override // p161o8.b
                public final void g(Object obj2, W4.m mVar) {
                    switch (i10) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            String str = (String) ((ArrayList) obj2).get(0);
                            r rVar = new r(arrayList, mVar, 15);
                            ((C1965m) this.f20952b).getClass();
                            C1022j c1022j = (C1022j) C1964l.f20926b.get(str);
                            com.google.android.gms.common.internal.E.h(c1022j);
                            FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(W6.h.e(c1022j.f14255e.f14232c));
                            firebaseAuth.getClass();
                            firebaseAuth.f18495e.zza(c1022j, firebaseAuth.k).continueWithTask(new Y5.h(firebaseAuth, 4)).addOnCompleteListener(new C1956d(rVar, 13));
                            break;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj2;
                            String str2 = (String) arrayList3.get(0);
                            String str3 = (String) arrayList3.get(1);
                            ((C1965m) this.f20952b).getClass();
                            p011a7.B b10 = (p011a7.B) C1965m.f20929a.get(str2);
                            com.google.android.gms.common.internal.E.h(str3);
                            com.google.android.gms.common.internal.E.h(b10);
                            Z6.A a10 = new Z6.A(str3, b10, null);
                            String string = UUID.randomUUID().toString();
                            C1964l.f20928d.put(string, a10);
                            arrayList2.add(0, string);
                            mVar.d(arrayList2);
                            break;
                        default:
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj2;
                            String str4 = (String) arrayList5.get(0);
                            String str5 = (String) arrayList5.get(1);
                            ((C1965m) this.f20952b).getClass();
                            com.google.android.gms.common.internal.E.h(str5);
                            com.google.android.gms.common.internal.E.h(str4);
                            Z6.A a11 = new Z6.A(str5, null, str4);
                            String string2 = UUID.randomUUID().toString();
                            C1964l.f20928d.put(string2, a11);
                            arrayList4.add(0, string2);
                            mVar.d(arrayList4);
                            break;
                    }
                }
            });
        } else {
            c2061m.J(null);
        }
        C2061m c2061m2 = new C2061m(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpHostApi.getAssertionForEnrollment", c1972u, obj);
        if (zVar != null) {
            final int i11 = 1;
            c2061m2.J(new p161o8.b(zVar) { // from class: io.flutter.plugins.firebase.auth.y

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ z f20952b;

                {
                    this.f20952b = zVar;
                }

                @Override // p161o8.b
                public final void g(Object obj2, W4.m mVar) {
                    switch (i11) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            String str = (String) ((ArrayList) obj2).get(0);
                            r rVar = new r(arrayList, mVar, 15);
                            ((C1965m) this.f20952b).getClass();
                            C1022j c1022j = (C1022j) C1964l.f20926b.get(str);
                            com.google.android.gms.common.internal.E.h(c1022j);
                            FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(W6.h.e(c1022j.f14255e.f14232c));
                            firebaseAuth.getClass();
                            firebaseAuth.f18495e.zza(c1022j, firebaseAuth.k).continueWithTask(new Y5.h(firebaseAuth, 4)).addOnCompleteListener(new C1956d(rVar, 13));
                            break;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj2;
                            String str2 = (String) arrayList3.get(0);
                            String str3 = (String) arrayList3.get(1);
                            ((C1965m) this.f20952b).getClass();
                            p011a7.B b10 = (p011a7.B) C1965m.f20929a.get(str2);
                            com.google.android.gms.common.internal.E.h(str3);
                            com.google.android.gms.common.internal.E.h(b10);
                            Z6.A a10 = new Z6.A(str3, b10, null);
                            String string = UUID.randomUUID().toString();
                            C1964l.f20928d.put(string, a10);
                            arrayList2.add(0, string);
                            mVar.d(arrayList2);
                            break;
                        default:
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj2;
                            String str4 = (String) arrayList5.get(0);
                            String str5 = (String) arrayList5.get(1);
                            ((C1965m) this.f20952b).getClass();
                            com.google.android.gms.common.internal.E.h(str5);
                            com.google.android.gms.common.internal.E.h(str4);
                            Z6.A a11 = new Z6.A(str5, null, str4);
                            String string2 = UUID.randomUUID().toString();
                            C1964l.f20928d.put(string2, a11);
                            arrayList4.add(0, string2);
                            mVar.d(arrayList4);
                            break;
                    }
                }
            });
        } else {
            c2061m2.J(null);
        }
        C2061m c2061m3 = new C2061m(fVar, "dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpHostApi.getAssertionForSignIn", c1972u, obj);
        if (zVar == null) {
            c2061m3.J(null);
        } else {
            final int i12 = 2;
            c2061m3.J(new p161o8.b(zVar) { // from class: io.flutter.plugins.firebase.auth.y

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ z f20952b;

                {
                    this.f20952b = zVar;
                }

                @Override // p161o8.b
                public final void g(Object obj2, W4.m mVar) {
                    switch (i12) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            String str = (String) ((ArrayList) obj2).get(0);
                            r rVar = new r(arrayList, mVar, 15);
                            ((C1965m) this.f20952b).getClass();
                            C1022j c1022j = (C1022j) C1964l.f20926b.get(str);
                            com.google.android.gms.common.internal.E.h(c1022j);
                            FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(W6.h.e(c1022j.f14255e.f14232c));
                            firebaseAuth.getClass();
                            firebaseAuth.f18495e.zza(c1022j, firebaseAuth.k).continueWithTask(new Y5.h(firebaseAuth, 4)).addOnCompleteListener(new C1956d(rVar, 13));
                            break;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj2;
                            String str2 = (String) arrayList3.get(0);
                            String str3 = (String) arrayList3.get(1);
                            ((C1965m) this.f20952b).getClass();
                            p011a7.B b10 = (p011a7.B) C1965m.f20929a.get(str2);
                            com.google.android.gms.common.internal.E.h(str3);
                            com.google.android.gms.common.internal.E.h(b10);
                            Z6.A a10 = new Z6.A(str3, b10, null);
                            String string = UUID.randomUUID().toString();
                            C1964l.f20928d.put(string, a10);
                            arrayList2.add(0, string);
                            mVar.d(arrayList2);
                            break;
                        default:
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj2;
                            String str4 = (String) arrayList5.get(0);
                            String str5 = (String) arrayList5.get(1);
                            ((C1965m) this.f20952b).getClass();
                            com.google.android.gms.common.internal.E.h(str5);
                            com.google.android.gms.common.internal.E.h(str4);
                            Z6.A a11 = new Z6.A(str5, null, str4);
                            String string2 = UUID.randomUUID().toString();
                            C1964l.f20928d.put(string2, a11);
                            arrayList4.add(0, string2);
                            mVar.d(arrayList4);
                            break;
                    }
                }
            });
        }
    }
}
