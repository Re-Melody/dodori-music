package p259y8;

import D7.W;
import M8.q;
import java.util.List;
import kotlin.jvm.internal.m;
import p009a5.e;
import p134m1.b;
import p140m7.C2061m;
import p161o8.f;
import p161o8.n;
import p241x.AbstractC2319w;

/* JADX INFO: renamed from: y8.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2354e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ C2354e f29146a = new C2354e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f29147b = W.S(new e(2));

    public static n a() {
        return (n) f29147b.getValue();
    }

    public static void b(f binaryMessenger, final InterfaceC2355f interfaceC2355f, String str) {
        m.f(binaryMessenger, "binaryMessenger");
        String strConcat = str.length() > 0 ? ".".concat(str) : "";
        p050e5.f fVarB = binaryMessenger.b();
        C2061m c2061m = new C2061m(binaryMessenger, b.k("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setBool", strConcat), a(), fVarB);
        if (interfaceC2355f != null) {
            final int i10 = 6;
            c2061m.J(new p161o8.b() { // from class: y8.d
                @Override // p161o8.b
                public final void g(Object obj, W4.m mVar) {
                    List listH;
                    List listH2;
                    List listH3;
                    List listH4;
                    List listH5;
                    List listH6;
                    List listH7;
                    List listH8;
                    List listH9;
                    List listH10;
                    List listH11;
                    List listH12;
                    List listH13;
                    List listH14;
                    List listH15;
                    switch (i10) {
                        case 0:
                            InterfaceC2355f interfaceC2355f2 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            m.d(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            m.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            m.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f2.h(str2, str3, (C2356g) obj4);
                                listH = W.T(null);
                            } catch (Throwable th) {
                                listH = AbstractC2319w.H(th);
                            }
                            mVar.d(listH);
                            break;
                        case 1:
                            InterfaceC2355f interfaceC2355f3 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            m.d(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            m.d(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            m.d(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f3.o(str4, list3, (C2356g) obj7);
                                listH2 = W.T(null);
                            } catch (Throwable th2) {
                                listH2 = AbstractC2319w.H(th2);
                            }
                            mVar.d(listH2);
                            break;
                        case 2:
                            InterfaceC2355f interfaceC2355f4 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            m.d(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            m.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH3 = W.T(interfaceC2355f4.c(str5, (C2356g) obj9));
                            } catch (Throwable th3) {
                                listH3 = AbstractC2319w.H(th3);
                            }
                            mVar.d(listH3);
                            break;
                        case 3:
                            InterfaceC2355f interfaceC2355f5 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            m.d(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            m.d(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH4 = W.T(interfaceC2355f5.d(str6, (C2356g) obj11));
                            } catch (Throwable th4) {
                                listH4 = AbstractC2319w.H(th4);
                            }
                            mVar.d(listH4);
                            break;
                        case 4:
                            InterfaceC2355f interfaceC2355f6 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            m.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            m.d(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH5 = W.T(interfaceC2355f6.i(str7, (C2356g) obj13));
                            } catch (Throwable th5) {
                                listH5 = AbstractC2319w.H(th5);
                            }
                            mVar.d(listH5);
                            break;
                        case 5:
                            InterfaceC2355f interfaceC2355f7 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            m.d(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            m.d(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH6 = W.T(interfaceC2355f7.H(str8, (C2356g) obj15));
                            } catch (Throwable th6) {
                                listH6 = AbstractC2319w.H(th6);
                            }
                            mVar.d(listH6);
                            break;
                        case 6:
                            InterfaceC2355f interfaceC2355f8 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            m.d(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            m.d(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            m.d(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f8.l(str9, zBooleanValue, (C2356g) obj18);
                                listH7 = W.T(null);
                            } catch (Throwable th7) {
                                listH7 = AbstractC2319w.H(th7);
                            }
                            mVar.d(listH7);
                            break;
                        case 7:
                            InterfaceC2355f interfaceC2355f9 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            m.d(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            m.d(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH8 = W.T(interfaceC2355f9.p(str10, (C2356g) obj20));
                            } catch (Throwable th8) {
                                listH8 = AbstractC2319w.H(th8);
                            }
                            mVar.d(listH8);
                            break;
                        case 8:
                            InterfaceC2355f interfaceC2355f10 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            m.d(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            m.d(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH9 = W.T(interfaceC2355f10.u(str11, (C2356g) obj22));
                            } catch (Throwable th9) {
                                listH9 = AbstractC2319w.H(th9);
                            }
                            mVar.d(listH9);
                            break;
                        case 9:
                            InterfaceC2355f interfaceC2355f11 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            m.d(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f11.B(list12, (C2356g) obj23);
                                listH10 = W.T(null);
                            } catch (Throwable th10) {
                                listH10 = AbstractC2319w.H(th10);
                            }
                            mVar.d(listH10);
                            break;
                        case 10:
                            InterfaceC2355f interfaceC2355f12 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            m.d(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH11 = W.T(interfaceC2355f12.n(list14, (C2356g) obj24));
                            } catch (Throwable th11) {
                                listH11 = AbstractC2319w.H(th11);
                            }
                            mVar.d(listH11);
                            break;
                        case 11:
                            InterfaceC2355f interfaceC2355f13 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            m.d(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH12 = W.T(interfaceC2355f13.k(list16, (C2356g) obj25));
                            } catch (Throwable th12) {
                                listH12 = AbstractC2319w.H(th12);
                            }
                            mVar.d(listH12);
                            break;
                        case 12:
                            InterfaceC2355f interfaceC2355f14 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            m.d(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            m.d(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            m.d(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f14.G(str12, str13, (C2356g) obj28);
                                listH13 = W.T(null);
                            } catch (Throwable th13) {
                                listH13 = AbstractC2319w.H(th13);
                            }
                            mVar.d(listH13);
                            break;
                        case 13:
                            InterfaceC2355f interfaceC2355f15 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            m.d(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            m.d(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            m.d(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f15.y(str14, jLongValue, (C2356g) obj31);
                                listH14 = W.T(null);
                            } catch (Throwable th14) {
                                listH14 = AbstractC2319w.H(th14);
                            }
                            mVar.d(listH14);
                            break;
                        default:
                            InterfaceC2355f interfaceC2355f16 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            m.d(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            m.d(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            m.d(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f16.g(str15, dDoubleValue, (C2356g) obj34);
                                listH15 = W.T(null);
                            } catch (Throwable th15) {
                                listH15 = AbstractC2319w.H(th15);
                            }
                            mVar.d(listH15);
                            break;
                    }
                }
            });
        } else {
            c2061m.J(null);
        }
        C2061m c2061m2 = new C2061m(binaryMessenger, b.k("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setString", strConcat), a(), fVarB);
        if (interfaceC2355f != null) {
            final int i11 = 12;
            c2061m2.J(new p161o8.b() { // from class: y8.d
                @Override // p161o8.b
                public final void g(Object obj, W4.m mVar) {
                    List listH;
                    List listH2;
                    List listH3;
                    List listH4;
                    List listH5;
                    List listH6;
                    List listH7;
                    List listH8;
                    List listH9;
                    List listH10;
                    List listH11;
                    List listH12;
                    List listH13;
                    List listH14;
                    List listH15;
                    switch (i11) {
                        case 0:
                            InterfaceC2355f interfaceC2355f2 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            m.d(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            m.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            m.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f2.h(str2, str3, (C2356g) obj4);
                                listH = W.T(null);
                            } catch (Throwable th) {
                                listH = AbstractC2319w.H(th);
                            }
                            mVar.d(listH);
                            break;
                        case 1:
                            InterfaceC2355f interfaceC2355f3 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            m.d(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            m.d(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            m.d(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f3.o(str4, list3, (C2356g) obj7);
                                listH2 = W.T(null);
                            } catch (Throwable th2) {
                                listH2 = AbstractC2319w.H(th2);
                            }
                            mVar.d(listH2);
                            break;
                        case 2:
                            InterfaceC2355f interfaceC2355f4 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            m.d(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            m.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH3 = W.T(interfaceC2355f4.c(str5, (C2356g) obj9));
                            } catch (Throwable th3) {
                                listH3 = AbstractC2319w.H(th3);
                            }
                            mVar.d(listH3);
                            break;
                        case 3:
                            InterfaceC2355f interfaceC2355f5 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            m.d(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            m.d(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH4 = W.T(interfaceC2355f5.d(str6, (C2356g) obj11));
                            } catch (Throwable th4) {
                                listH4 = AbstractC2319w.H(th4);
                            }
                            mVar.d(listH4);
                            break;
                        case 4:
                            InterfaceC2355f interfaceC2355f6 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            m.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            m.d(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH5 = W.T(interfaceC2355f6.i(str7, (C2356g) obj13));
                            } catch (Throwable th5) {
                                listH5 = AbstractC2319w.H(th5);
                            }
                            mVar.d(listH5);
                            break;
                        case 5:
                            InterfaceC2355f interfaceC2355f7 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            m.d(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            m.d(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH6 = W.T(interfaceC2355f7.H(str8, (C2356g) obj15));
                            } catch (Throwable th6) {
                                listH6 = AbstractC2319w.H(th6);
                            }
                            mVar.d(listH6);
                            break;
                        case 6:
                            InterfaceC2355f interfaceC2355f8 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            m.d(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            m.d(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            m.d(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f8.l(str9, zBooleanValue, (C2356g) obj18);
                                listH7 = W.T(null);
                            } catch (Throwable th7) {
                                listH7 = AbstractC2319w.H(th7);
                            }
                            mVar.d(listH7);
                            break;
                        case 7:
                            InterfaceC2355f interfaceC2355f9 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            m.d(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            m.d(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH8 = W.T(interfaceC2355f9.p(str10, (C2356g) obj20));
                            } catch (Throwable th8) {
                                listH8 = AbstractC2319w.H(th8);
                            }
                            mVar.d(listH8);
                            break;
                        case 8:
                            InterfaceC2355f interfaceC2355f10 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            m.d(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            m.d(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH9 = W.T(interfaceC2355f10.u(str11, (C2356g) obj22));
                            } catch (Throwable th9) {
                                listH9 = AbstractC2319w.H(th9);
                            }
                            mVar.d(listH9);
                            break;
                        case 9:
                            InterfaceC2355f interfaceC2355f11 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            m.d(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f11.B(list12, (C2356g) obj23);
                                listH10 = W.T(null);
                            } catch (Throwable th10) {
                                listH10 = AbstractC2319w.H(th10);
                            }
                            mVar.d(listH10);
                            break;
                        case 10:
                            InterfaceC2355f interfaceC2355f12 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            m.d(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH11 = W.T(interfaceC2355f12.n(list14, (C2356g) obj24));
                            } catch (Throwable th11) {
                                listH11 = AbstractC2319w.H(th11);
                            }
                            mVar.d(listH11);
                            break;
                        case 11:
                            InterfaceC2355f interfaceC2355f13 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            m.d(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH12 = W.T(interfaceC2355f13.k(list16, (C2356g) obj25));
                            } catch (Throwable th12) {
                                listH12 = AbstractC2319w.H(th12);
                            }
                            mVar.d(listH12);
                            break;
                        case 12:
                            InterfaceC2355f interfaceC2355f14 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            m.d(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            m.d(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            m.d(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f14.G(str12, str13, (C2356g) obj28);
                                listH13 = W.T(null);
                            } catch (Throwable th13) {
                                listH13 = AbstractC2319w.H(th13);
                            }
                            mVar.d(listH13);
                            break;
                        case 13:
                            InterfaceC2355f interfaceC2355f15 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            m.d(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            m.d(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            m.d(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f15.y(str14, jLongValue, (C2356g) obj31);
                                listH14 = W.T(null);
                            } catch (Throwable th14) {
                                listH14 = AbstractC2319w.H(th14);
                            }
                            mVar.d(listH14);
                            break;
                        default:
                            InterfaceC2355f interfaceC2355f16 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            m.d(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            m.d(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            m.d(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f16.g(str15, dDoubleValue, (C2356g) obj34);
                                listH15 = W.T(null);
                            } catch (Throwable th15) {
                                listH15 = AbstractC2319w.H(th15);
                            }
                            mVar.d(listH15);
                            break;
                    }
                }
            });
        } else {
            c2061m2.J(null);
        }
        C2061m c2061m3 = new C2061m(binaryMessenger, b.k("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setInt", strConcat), a(), fVarB);
        if (interfaceC2355f != null) {
            final int i12 = 13;
            c2061m3.J(new p161o8.b() { // from class: y8.d
                @Override // p161o8.b
                public final void g(Object obj, W4.m mVar) {
                    List listH;
                    List listH2;
                    List listH3;
                    List listH4;
                    List listH5;
                    List listH6;
                    List listH7;
                    List listH8;
                    List listH9;
                    List listH10;
                    List listH11;
                    List listH12;
                    List listH13;
                    List listH14;
                    List listH15;
                    switch (i12) {
                        case 0:
                            InterfaceC2355f interfaceC2355f2 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            m.d(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            m.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            m.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f2.h(str2, str3, (C2356g) obj4);
                                listH = W.T(null);
                            } catch (Throwable th) {
                                listH = AbstractC2319w.H(th);
                            }
                            mVar.d(listH);
                            break;
                        case 1:
                            InterfaceC2355f interfaceC2355f3 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            m.d(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            m.d(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            m.d(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f3.o(str4, list3, (C2356g) obj7);
                                listH2 = W.T(null);
                            } catch (Throwable th2) {
                                listH2 = AbstractC2319w.H(th2);
                            }
                            mVar.d(listH2);
                            break;
                        case 2:
                            InterfaceC2355f interfaceC2355f4 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            m.d(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            m.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH3 = W.T(interfaceC2355f4.c(str5, (C2356g) obj9));
                            } catch (Throwable th3) {
                                listH3 = AbstractC2319w.H(th3);
                            }
                            mVar.d(listH3);
                            break;
                        case 3:
                            InterfaceC2355f interfaceC2355f5 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            m.d(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            m.d(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH4 = W.T(interfaceC2355f5.d(str6, (C2356g) obj11));
                            } catch (Throwable th4) {
                                listH4 = AbstractC2319w.H(th4);
                            }
                            mVar.d(listH4);
                            break;
                        case 4:
                            InterfaceC2355f interfaceC2355f6 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            m.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            m.d(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH5 = W.T(interfaceC2355f6.i(str7, (C2356g) obj13));
                            } catch (Throwable th5) {
                                listH5 = AbstractC2319w.H(th5);
                            }
                            mVar.d(listH5);
                            break;
                        case 5:
                            InterfaceC2355f interfaceC2355f7 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            m.d(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            m.d(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH6 = W.T(interfaceC2355f7.H(str8, (C2356g) obj15));
                            } catch (Throwable th6) {
                                listH6 = AbstractC2319w.H(th6);
                            }
                            mVar.d(listH6);
                            break;
                        case 6:
                            InterfaceC2355f interfaceC2355f8 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            m.d(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            m.d(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            m.d(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f8.l(str9, zBooleanValue, (C2356g) obj18);
                                listH7 = W.T(null);
                            } catch (Throwable th7) {
                                listH7 = AbstractC2319w.H(th7);
                            }
                            mVar.d(listH7);
                            break;
                        case 7:
                            InterfaceC2355f interfaceC2355f9 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            m.d(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            m.d(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH8 = W.T(interfaceC2355f9.p(str10, (C2356g) obj20));
                            } catch (Throwable th8) {
                                listH8 = AbstractC2319w.H(th8);
                            }
                            mVar.d(listH8);
                            break;
                        case 8:
                            InterfaceC2355f interfaceC2355f10 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            m.d(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            m.d(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH9 = W.T(interfaceC2355f10.u(str11, (C2356g) obj22));
                            } catch (Throwable th9) {
                                listH9 = AbstractC2319w.H(th9);
                            }
                            mVar.d(listH9);
                            break;
                        case 9:
                            InterfaceC2355f interfaceC2355f11 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            m.d(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f11.B(list12, (C2356g) obj23);
                                listH10 = W.T(null);
                            } catch (Throwable th10) {
                                listH10 = AbstractC2319w.H(th10);
                            }
                            mVar.d(listH10);
                            break;
                        case 10:
                            InterfaceC2355f interfaceC2355f12 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            m.d(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH11 = W.T(interfaceC2355f12.n(list14, (C2356g) obj24));
                            } catch (Throwable th11) {
                                listH11 = AbstractC2319w.H(th11);
                            }
                            mVar.d(listH11);
                            break;
                        case 11:
                            InterfaceC2355f interfaceC2355f13 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            m.d(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH12 = W.T(interfaceC2355f13.k(list16, (C2356g) obj25));
                            } catch (Throwable th12) {
                                listH12 = AbstractC2319w.H(th12);
                            }
                            mVar.d(listH12);
                            break;
                        case 12:
                            InterfaceC2355f interfaceC2355f14 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            m.d(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            m.d(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            m.d(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f14.G(str12, str13, (C2356g) obj28);
                                listH13 = W.T(null);
                            } catch (Throwable th13) {
                                listH13 = AbstractC2319w.H(th13);
                            }
                            mVar.d(listH13);
                            break;
                        case 13:
                            InterfaceC2355f interfaceC2355f15 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            m.d(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            m.d(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            m.d(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f15.y(str14, jLongValue, (C2356g) obj31);
                                listH14 = W.T(null);
                            } catch (Throwable th14) {
                                listH14 = AbstractC2319w.H(th14);
                            }
                            mVar.d(listH14);
                            break;
                        default:
                            InterfaceC2355f interfaceC2355f16 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            m.d(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            m.d(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            m.d(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f16.g(str15, dDoubleValue, (C2356g) obj34);
                                listH15 = W.T(null);
                            } catch (Throwable th15) {
                                listH15 = AbstractC2319w.H(th15);
                            }
                            mVar.d(listH15);
                            break;
                    }
                }
            });
        } else {
            c2061m3.J(null);
        }
        C2061m c2061m4 = new C2061m(binaryMessenger, b.k("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDouble", strConcat), a(), fVarB);
        if (interfaceC2355f != null) {
            final int i13 = 14;
            c2061m4.J(new p161o8.b() { // from class: y8.d
                @Override // p161o8.b
                public final void g(Object obj, W4.m mVar) {
                    List listH;
                    List listH2;
                    List listH3;
                    List listH4;
                    List listH5;
                    List listH6;
                    List listH7;
                    List listH8;
                    List listH9;
                    List listH10;
                    List listH11;
                    List listH12;
                    List listH13;
                    List listH14;
                    List listH15;
                    switch (i13) {
                        case 0:
                            InterfaceC2355f interfaceC2355f2 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            m.d(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            m.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            m.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f2.h(str2, str3, (C2356g) obj4);
                                listH = W.T(null);
                            } catch (Throwable th) {
                                listH = AbstractC2319w.H(th);
                            }
                            mVar.d(listH);
                            break;
                        case 1:
                            InterfaceC2355f interfaceC2355f3 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            m.d(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            m.d(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            m.d(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f3.o(str4, list3, (C2356g) obj7);
                                listH2 = W.T(null);
                            } catch (Throwable th2) {
                                listH2 = AbstractC2319w.H(th2);
                            }
                            mVar.d(listH2);
                            break;
                        case 2:
                            InterfaceC2355f interfaceC2355f4 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            m.d(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            m.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH3 = W.T(interfaceC2355f4.c(str5, (C2356g) obj9));
                            } catch (Throwable th3) {
                                listH3 = AbstractC2319w.H(th3);
                            }
                            mVar.d(listH3);
                            break;
                        case 3:
                            InterfaceC2355f interfaceC2355f5 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            m.d(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            m.d(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH4 = W.T(interfaceC2355f5.d(str6, (C2356g) obj11));
                            } catch (Throwable th4) {
                                listH4 = AbstractC2319w.H(th4);
                            }
                            mVar.d(listH4);
                            break;
                        case 4:
                            InterfaceC2355f interfaceC2355f6 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            m.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            m.d(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH5 = W.T(interfaceC2355f6.i(str7, (C2356g) obj13));
                            } catch (Throwable th5) {
                                listH5 = AbstractC2319w.H(th5);
                            }
                            mVar.d(listH5);
                            break;
                        case 5:
                            InterfaceC2355f interfaceC2355f7 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            m.d(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            m.d(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH6 = W.T(interfaceC2355f7.H(str8, (C2356g) obj15));
                            } catch (Throwable th6) {
                                listH6 = AbstractC2319w.H(th6);
                            }
                            mVar.d(listH6);
                            break;
                        case 6:
                            InterfaceC2355f interfaceC2355f8 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            m.d(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            m.d(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            m.d(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f8.l(str9, zBooleanValue, (C2356g) obj18);
                                listH7 = W.T(null);
                            } catch (Throwable th7) {
                                listH7 = AbstractC2319w.H(th7);
                            }
                            mVar.d(listH7);
                            break;
                        case 7:
                            InterfaceC2355f interfaceC2355f9 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            m.d(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            m.d(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH8 = W.T(interfaceC2355f9.p(str10, (C2356g) obj20));
                            } catch (Throwable th8) {
                                listH8 = AbstractC2319w.H(th8);
                            }
                            mVar.d(listH8);
                            break;
                        case 8:
                            InterfaceC2355f interfaceC2355f10 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            m.d(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            m.d(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH9 = W.T(interfaceC2355f10.u(str11, (C2356g) obj22));
                            } catch (Throwable th9) {
                                listH9 = AbstractC2319w.H(th9);
                            }
                            mVar.d(listH9);
                            break;
                        case 9:
                            InterfaceC2355f interfaceC2355f11 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            m.d(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f11.B(list12, (C2356g) obj23);
                                listH10 = W.T(null);
                            } catch (Throwable th10) {
                                listH10 = AbstractC2319w.H(th10);
                            }
                            mVar.d(listH10);
                            break;
                        case 10:
                            InterfaceC2355f interfaceC2355f12 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            m.d(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH11 = W.T(interfaceC2355f12.n(list14, (C2356g) obj24));
                            } catch (Throwable th11) {
                                listH11 = AbstractC2319w.H(th11);
                            }
                            mVar.d(listH11);
                            break;
                        case 11:
                            InterfaceC2355f interfaceC2355f13 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            m.d(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH12 = W.T(interfaceC2355f13.k(list16, (C2356g) obj25));
                            } catch (Throwable th12) {
                                listH12 = AbstractC2319w.H(th12);
                            }
                            mVar.d(listH12);
                            break;
                        case 12:
                            InterfaceC2355f interfaceC2355f14 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            m.d(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            m.d(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            m.d(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f14.G(str12, str13, (C2356g) obj28);
                                listH13 = W.T(null);
                            } catch (Throwable th13) {
                                listH13 = AbstractC2319w.H(th13);
                            }
                            mVar.d(listH13);
                            break;
                        case 13:
                            InterfaceC2355f interfaceC2355f15 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            m.d(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            m.d(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            m.d(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f15.y(str14, jLongValue, (C2356g) obj31);
                                listH14 = W.T(null);
                            } catch (Throwable th14) {
                                listH14 = AbstractC2319w.H(th14);
                            }
                            mVar.d(listH14);
                            break;
                        default:
                            InterfaceC2355f interfaceC2355f16 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            m.d(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            m.d(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            m.d(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f16.g(str15, dDoubleValue, (C2356g) obj34);
                                listH15 = W.T(null);
                            } catch (Throwable th15) {
                                listH15 = AbstractC2319w.H(th15);
                            }
                            mVar.d(listH15);
                            break;
                    }
                }
            });
        } else {
            c2061m4.J(null);
        }
        C2061m c2061m5 = new C2061m(binaryMessenger, b.k("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setEncodedStringList", strConcat), a(), fVarB);
        if (interfaceC2355f != null) {
            final int i14 = 0;
            c2061m5.J(new p161o8.b() { // from class: y8.d
                @Override // p161o8.b
                public final void g(Object obj, W4.m mVar) {
                    List listH;
                    List listH2;
                    List listH3;
                    List listH4;
                    List listH5;
                    List listH6;
                    List listH7;
                    List listH8;
                    List listH9;
                    List listH10;
                    List listH11;
                    List listH12;
                    List listH13;
                    List listH14;
                    List listH15;
                    switch (i14) {
                        case 0:
                            InterfaceC2355f interfaceC2355f2 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            m.d(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            m.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            m.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f2.h(str2, str3, (C2356g) obj4);
                                listH = W.T(null);
                            } catch (Throwable th) {
                                listH = AbstractC2319w.H(th);
                            }
                            mVar.d(listH);
                            break;
                        case 1:
                            InterfaceC2355f interfaceC2355f3 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            m.d(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            m.d(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            m.d(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f3.o(str4, list3, (C2356g) obj7);
                                listH2 = W.T(null);
                            } catch (Throwable th2) {
                                listH2 = AbstractC2319w.H(th2);
                            }
                            mVar.d(listH2);
                            break;
                        case 2:
                            InterfaceC2355f interfaceC2355f4 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            m.d(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            m.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH3 = W.T(interfaceC2355f4.c(str5, (C2356g) obj9));
                            } catch (Throwable th3) {
                                listH3 = AbstractC2319w.H(th3);
                            }
                            mVar.d(listH3);
                            break;
                        case 3:
                            InterfaceC2355f interfaceC2355f5 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            m.d(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            m.d(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH4 = W.T(interfaceC2355f5.d(str6, (C2356g) obj11));
                            } catch (Throwable th4) {
                                listH4 = AbstractC2319w.H(th4);
                            }
                            mVar.d(listH4);
                            break;
                        case 4:
                            InterfaceC2355f interfaceC2355f6 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            m.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            m.d(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH5 = W.T(interfaceC2355f6.i(str7, (C2356g) obj13));
                            } catch (Throwable th5) {
                                listH5 = AbstractC2319w.H(th5);
                            }
                            mVar.d(listH5);
                            break;
                        case 5:
                            InterfaceC2355f interfaceC2355f7 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            m.d(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            m.d(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH6 = W.T(interfaceC2355f7.H(str8, (C2356g) obj15));
                            } catch (Throwable th6) {
                                listH6 = AbstractC2319w.H(th6);
                            }
                            mVar.d(listH6);
                            break;
                        case 6:
                            InterfaceC2355f interfaceC2355f8 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            m.d(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            m.d(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            m.d(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f8.l(str9, zBooleanValue, (C2356g) obj18);
                                listH7 = W.T(null);
                            } catch (Throwable th7) {
                                listH7 = AbstractC2319w.H(th7);
                            }
                            mVar.d(listH7);
                            break;
                        case 7:
                            InterfaceC2355f interfaceC2355f9 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            m.d(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            m.d(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH8 = W.T(interfaceC2355f9.p(str10, (C2356g) obj20));
                            } catch (Throwable th8) {
                                listH8 = AbstractC2319w.H(th8);
                            }
                            mVar.d(listH8);
                            break;
                        case 8:
                            InterfaceC2355f interfaceC2355f10 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            m.d(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            m.d(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH9 = W.T(interfaceC2355f10.u(str11, (C2356g) obj22));
                            } catch (Throwable th9) {
                                listH9 = AbstractC2319w.H(th9);
                            }
                            mVar.d(listH9);
                            break;
                        case 9:
                            InterfaceC2355f interfaceC2355f11 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            m.d(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f11.B(list12, (C2356g) obj23);
                                listH10 = W.T(null);
                            } catch (Throwable th10) {
                                listH10 = AbstractC2319w.H(th10);
                            }
                            mVar.d(listH10);
                            break;
                        case 10:
                            InterfaceC2355f interfaceC2355f12 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            m.d(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH11 = W.T(interfaceC2355f12.n(list14, (C2356g) obj24));
                            } catch (Throwable th11) {
                                listH11 = AbstractC2319w.H(th11);
                            }
                            mVar.d(listH11);
                            break;
                        case 11:
                            InterfaceC2355f interfaceC2355f13 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            m.d(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH12 = W.T(interfaceC2355f13.k(list16, (C2356g) obj25));
                            } catch (Throwable th12) {
                                listH12 = AbstractC2319w.H(th12);
                            }
                            mVar.d(listH12);
                            break;
                        case 12:
                            InterfaceC2355f interfaceC2355f14 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            m.d(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            m.d(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            m.d(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f14.G(str12, str13, (C2356g) obj28);
                                listH13 = W.T(null);
                            } catch (Throwable th13) {
                                listH13 = AbstractC2319w.H(th13);
                            }
                            mVar.d(listH13);
                            break;
                        case 13:
                            InterfaceC2355f interfaceC2355f15 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            m.d(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            m.d(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            m.d(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f15.y(str14, jLongValue, (C2356g) obj31);
                                listH14 = W.T(null);
                            } catch (Throwable th14) {
                                listH14 = AbstractC2319w.H(th14);
                            }
                            mVar.d(listH14);
                            break;
                        default:
                            InterfaceC2355f interfaceC2355f16 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            m.d(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            m.d(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            m.d(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f16.g(str15, dDoubleValue, (C2356g) obj34);
                                listH15 = W.T(null);
                            } catch (Throwable th15) {
                                listH15 = AbstractC2319w.H(th15);
                            }
                            mVar.d(listH15);
                            break;
                    }
                }
            });
        } else {
            c2061m5.J(null);
        }
        C2061m c2061m6 = new C2061m(binaryMessenger, b.k("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDeprecatedStringList", strConcat), a(), fVarB);
        if (interfaceC2355f != null) {
            final int i15 = 1;
            c2061m6.J(new p161o8.b() { // from class: y8.d
                @Override // p161o8.b
                public final void g(Object obj, W4.m mVar) {
                    List listH;
                    List listH2;
                    List listH3;
                    List listH4;
                    List listH5;
                    List listH6;
                    List listH7;
                    List listH8;
                    List listH9;
                    List listH10;
                    List listH11;
                    List listH12;
                    List listH13;
                    List listH14;
                    List listH15;
                    switch (i15) {
                        case 0:
                            InterfaceC2355f interfaceC2355f2 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            m.d(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            m.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            m.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f2.h(str2, str3, (C2356g) obj4);
                                listH = W.T(null);
                            } catch (Throwable th) {
                                listH = AbstractC2319w.H(th);
                            }
                            mVar.d(listH);
                            break;
                        case 1:
                            InterfaceC2355f interfaceC2355f3 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            m.d(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            m.d(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            m.d(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f3.o(str4, list3, (C2356g) obj7);
                                listH2 = W.T(null);
                            } catch (Throwable th2) {
                                listH2 = AbstractC2319w.H(th2);
                            }
                            mVar.d(listH2);
                            break;
                        case 2:
                            InterfaceC2355f interfaceC2355f4 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            m.d(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            m.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH3 = W.T(interfaceC2355f4.c(str5, (C2356g) obj9));
                            } catch (Throwable th3) {
                                listH3 = AbstractC2319w.H(th3);
                            }
                            mVar.d(listH3);
                            break;
                        case 3:
                            InterfaceC2355f interfaceC2355f5 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            m.d(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            m.d(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH4 = W.T(interfaceC2355f5.d(str6, (C2356g) obj11));
                            } catch (Throwable th4) {
                                listH4 = AbstractC2319w.H(th4);
                            }
                            mVar.d(listH4);
                            break;
                        case 4:
                            InterfaceC2355f interfaceC2355f6 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            m.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            m.d(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH5 = W.T(interfaceC2355f6.i(str7, (C2356g) obj13));
                            } catch (Throwable th5) {
                                listH5 = AbstractC2319w.H(th5);
                            }
                            mVar.d(listH5);
                            break;
                        case 5:
                            InterfaceC2355f interfaceC2355f7 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            m.d(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            m.d(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH6 = W.T(interfaceC2355f7.H(str8, (C2356g) obj15));
                            } catch (Throwable th6) {
                                listH6 = AbstractC2319w.H(th6);
                            }
                            mVar.d(listH6);
                            break;
                        case 6:
                            InterfaceC2355f interfaceC2355f8 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            m.d(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            m.d(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            m.d(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f8.l(str9, zBooleanValue, (C2356g) obj18);
                                listH7 = W.T(null);
                            } catch (Throwable th7) {
                                listH7 = AbstractC2319w.H(th7);
                            }
                            mVar.d(listH7);
                            break;
                        case 7:
                            InterfaceC2355f interfaceC2355f9 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            m.d(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            m.d(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH8 = W.T(interfaceC2355f9.p(str10, (C2356g) obj20));
                            } catch (Throwable th8) {
                                listH8 = AbstractC2319w.H(th8);
                            }
                            mVar.d(listH8);
                            break;
                        case 8:
                            InterfaceC2355f interfaceC2355f10 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            m.d(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            m.d(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH9 = W.T(interfaceC2355f10.u(str11, (C2356g) obj22));
                            } catch (Throwable th9) {
                                listH9 = AbstractC2319w.H(th9);
                            }
                            mVar.d(listH9);
                            break;
                        case 9:
                            InterfaceC2355f interfaceC2355f11 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            m.d(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f11.B(list12, (C2356g) obj23);
                                listH10 = W.T(null);
                            } catch (Throwable th10) {
                                listH10 = AbstractC2319w.H(th10);
                            }
                            mVar.d(listH10);
                            break;
                        case 10:
                            InterfaceC2355f interfaceC2355f12 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            m.d(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH11 = W.T(interfaceC2355f12.n(list14, (C2356g) obj24));
                            } catch (Throwable th11) {
                                listH11 = AbstractC2319w.H(th11);
                            }
                            mVar.d(listH11);
                            break;
                        case 11:
                            InterfaceC2355f interfaceC2355f13 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            m.d(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH12 = W.T(interfaceC2355f13.k(list16, (C2356g) obj25));
                            } catch (Throwable th12) {
                                listH12 = AbstractC2319w.H(th12);
                            }
                            mVar.d(listH12);
                            break;
                        case 12:
                            InterfaceC2355f interfaceC2355f14 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            m.d(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            m.d(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            m.d(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f14.G(str12, str13, (C2356g) obj28);
                                listH13 = W.T(null);
                            } catch (Throwable th13) {
                                listH13 = AbstractC2319w.H(th13);
                            }
                            mVar.d(listH13);
                            break;
                        case 13:
                            InterfaceC2355f interfaceC2355f15 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            m.d(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            m.d(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            m.d(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f15.y(str14, jLongValue, (C2356g) obj31);
                                listH14 = W.T(null);
                            } catch (Throwable th14) {
                                listH14 = AbstractC2319w.H(th14);
                            }
                            mVar.d(listH14);
                            break;
                        default:
                            InterfaceC2355f interfaceC2355f16 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            m.d(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            m.d(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            m.d(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f16.g(str15, dDoubleValue, (C2356g) obj34);
                                listH15 = W.T(null);
                            } catch (Throwable th15) {
                                listH15 = AbstractC2319w.H(th15);
                            }
                            mVar.d(listH15);
                            break;
                    }
                }
            });
        } else {
            c2061m6.J(null);
        }
        C2061m c2061m7 = new C2061m(binaryMessenger, b.k("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getString", strConcat), a(), fVarB);
        if (interfaceC2355f != null) {
            final int i16 = 2;
            c2061m7.J(new p161o8.b() { // from class: y8.d
                @Override // p161o8.b
                public final void g(Object obj, W4.m mVar) {
                    List listH;
                    List listH2;
                    List listH3;
                    List listH4;
                    List listH5;
                    List listH6;
                    List listH7;
                    List listH8;
                    List listH9;
                    List listH10;
                    List listH11;
                    List listH12;
                    List listH13;
                    List listH14;
                    List listH15;
                    switch (i16) {
                        case 0:
                            InterfaceC2355f interfaceC2355f2 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            m.d(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            m.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            m.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f2.h(str2, str3, (C2356g) obj4);
                                listH = W.T(null);
                            } catch (Throwable th) {
                                listH = AbstractC2319w.H(th);
                            }
                            mVar.d(listH);
                            break;
                        case 1:
                            InterfaceC2355f interfaceC2355f3 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            m.d(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            m.d(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            m.d(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f3.o(str4, list3, (C2356g) obj7);
                                listH2 = W.T(null);
                            } catch (Throwable th2) {
                                listH2 = AbstractC2319w.H(th2);
                            }
                            mVar.d(listH2);
                            break;
                        case 2:
                            InterfaceC2355f interfaceC2355f4 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            m.d(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            m.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH3 = W.T(interfaceC2355f4.c(str5, (C2356g) obj9));
                            } catch (Throwable th3) {
                                listH3 = AbstractC2319w.H(th3);
                            }
                            mVar.d(listH3);
                            break;
                        case 3:
                            InterfaceC2355f interfaceC2355f5 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            m.d(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            m.d(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH4 = W.T(interfaceC2355f5.d(str6, (C2356g) obj11));
                            } catch (Throwable th4) {
                                listH4 = AbstractC2319w.H(th4);
                            }
                            mVar.d(listH4);
                            break;
                        case 4:
                            InterfaceC2355f interfaceC2355f6 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            m.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            m.d(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH5 = W.T(interfaceC2355f6.i(str7, (C2356g) obj13));
                            } catch (Throwable th5) {
                                listH5 = AbstractC2319w.H(th5);
                            }
                            mVar.d(listH5);
                            break;
                        case 5:
                            InterfaceC2355f interfaceC2355f7 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            m.d(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            m.d(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH6 = W.T(interfaceC2355f7.H(str8, (C2356g) obj15));
                            } catch (Throwable th6) {
                                listH6 = AbstractC2319w.H(th6);
                            }
                            mVar.d(listH6);
                            break;
                        case 6:
                            InterfaceC2355f interfaceC2355f8 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            m.d(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            m.d(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            m.d(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f8.l(str9, zBooleanValue, (C2356g) obj18);
                                listH7 = W.T(null);
                            } catch (Throwable th7) {
                                listH7 = AbstractC2319w.H(th7);
                            }
                            mVar.d(listH7);
                            break;
                        case 7:
                            InterfaceC2355f interfaceC2355f9 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            m.d(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            m.d(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH8 = W.T(interfaceC2355f9.p(str10, (C2356g) obj20));
                            } catch (Throwable th8) {
                                listH8 = AbstractC2319w.H(th8);
                            }
                            mVar.d(listH8);
                            break;
                        case 8:
                            InterfaceC2355f interfaceC2355f10 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            m.d(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            m.d(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH9 = W.T(interfaceC2355f10.u(str11, (C2356g) obj22));
                            } catch (Throwable th9) {
                                listH9 = AbstractC2319w.H(th9);
                            }
                            mVar.d(listH9);
                            break;
                        case 9:
                            InterfaceC2355f interfaceC2355f11 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            m.d(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f11.B(list12, (C2356g) obj23);
                                listH10 = W.T(null);
                            } catch (Throwable th10) {
                                listH10 = AbstractC2319w.H(th10);
                            }
                            mVar.d(listH10);
                            break;
                        case 10:
                            InterfaceC2355f interfaceC2355f12 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            m.d(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH11 = W.T(interfaceC2355f12.n(list14, (C2356g) obj24));
                            } catch (Throwable th11) {
                                listH11 = AbstractC2319w.H(th11);
                            }
                            mVar.d(listH11);
                            break;
                        case 11:
                            InterfaceC2355f interfaceC2355f13 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            m.d(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH12 = W.T(interfaceC2355f13.k(list16, (C2356g) obj25));
                            } catch (Throwable th12) {
                                listH12 = AbstractC2319w.H(th12);
                            }
                            mVar.d(listH12);
                            break;
                        case 12:
                            InterfaceC2355f interfaceC2355f14 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            m.d(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            m.d(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            m.d(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f14.G(str12, str13, (C2356g) obj28);
                                listH13 = W.T(null);
                            } catch (Throwable th13) {
                                listH13 = AbstractC2319w.H(th13);
                            }
                            mVar.d(listH13);
                            break;
                        case 13:
                            InterfaceC2355f interfaceC2355f15 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            m.d(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            m.d(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            m.d(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f15.y(str14, jLongValue, (C2356g) obj31);
                                listH14 = W.T(null);
                            } catch (Throwable th14) {
                                listH14 = AbstractC2319w.H(th14);
                            }
                            mVar.d(listH14);
                            break;
                        default:
                            InterfaceC2355f interfaceC2355f16 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            m.d(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            m.d(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            m.d(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f16.g(str15, dDoubleValue, (C2356g) obj34);
                                listH15 = W.T(null);
                            } catch (Throwable th15) {
                                listH15 = AbstractC2319w.H(th15);
                            }
                            mVar.d(listH15);
                            break;
                    }
                }
            });
        } else {
            c2061m7.J(null);
        }
        C2061m c2061m8 = new C2061m(binaryMessenger, b.k("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getBool", strConcat), a(), fVarB);
        if (interfaceC2355f != null) {
            final int i17 = 3;
            c2061m8.J(new p161o8.b() { // from class: y8.d
                @Override // p161o8.b
                public final void g(Object obj, W4.m mVar) {
                    List listH;
                    List listH2;
                    List listH3;
                    List listH4;
                    List listH5;
                    List listH6;
                    List listH7;
                    List listH8;
                    List listH9;
                    List listH10;
                    List listH11;
                    List listH12;
                    List listH13;
                    List listH14;
                    List listH15;
                    switch (i17) {
                        case 0:
                            InterfaceC2355f interfaceC2355f2 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            m.d(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            m.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            m.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f2.h(str2, str3, (C2356g) obj4);
                                listH = W.T(null);
                            } catch (Throwable th) {
                                listH = AbstractC2319w.H(th);
                            }
                            mVar.d(listH);
                            break;
                        case 1:
                            InterfaceC2355f interfaceC2355f3 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            m.d(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            m.d(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            m.d(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f3.o(str4, list3, (C2356g) obj7);
                                listH2 = W.T(null);
                            } catch (Throwable th2) {
                                listH2 = AbstractC2319w.H(th2);
                            }
                            mVar.d(listH2);
                            break;
                        case 2:
                            InterfaceC2355f interfaceC2355f4 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            m.d(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            m.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH3 = W.T(interfaceC2355f4.c(str5, (C2356g) obj9));
                            } catch (Throwable th3) {
                                listH3 = AbstractC2319w.H(th3);
                            }
                            mVar.d(listH3);
                            break;
                        case 3:
                            InterfaceC2355f interfaceC2355f5 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            m.d(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            m.d(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH4 = W.T(interfaceC2355f5.d(str6, (C2356g) obj11));
                            } catch (Throwable th4) {
                                listH4 = AbstractC2319w.H(th4);
                            }
                            mVar.d(listH4);
                            break;
                        case 4:
                            InterfaceC2355f interfaceC2355f6 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            m.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            m.d(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH5 = W.T(interfaceC2355f6.i(str7, (C2356g) obj13));
                            } catch (Throwable th5) {
                                listH5 = AbstractC2319w.H(th5);
                            }
                            mVar.d(listH5);
                            break;
                        case 5:
                            InterfaceC2355f interfaceC2355f7 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            m.d(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            m.d(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH6 = W.T(interfaceC2355f7.H(str8, (C2356g) obj15));
                            } catch (Throwable th6) {
                                listH6 = AbstractC2319w.H(th6);
                            }
                            mVar.d(listH6);
                            break;
                        case 6:
                            InterfaceC2355f interfaceC2355f8 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            m.d(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            m.d(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            m.d(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f8.l(str9, zBooleanValue, (C2356g) obj18);
                                listH7 = W.T(null);
                            } catch (Throwable th7) {
                                listH7 = AbstractC2319w.H(th7);
                            }
                            mVar.d(listH7);
                            break;
                        case 7:
                            InterfaceC2355f interfaceC2355f9 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            m.d(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            m.d(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH8 = W.T(interfaceC2355f9.p(str10, (C2356g) obj20));
                            } catch (Throwable th8) {
                                listH8 = AbstractC2319w.H(th8);
                            }
                            mVar.d(listH8);
                            break;
                        case 8:
                            InterfaceC2355f interfaceC2355f10 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            m.d(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            m.d(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH9 = W.T(interfaceC2355f10.u(str11, (C2356g) obj22));
                            } catch (Throwable th9) {
                                listH9 = AbstractC2319w.H(th9);
                            }
                            mVar.d(listH9);
                            break;
                        case 9:
                            InterfaceC2355f interfaceC2355f11 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            m.d(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f11.B(list12, (C2356g) obj23);
                                listH10 = W.T(null);
                            } catch (Throwable th10) {
                                listH10 = AbstractC2319w.H(th10);
                            }
                            mVar.d(listH10);
                            break;
                        case 10:
                            InterfaceC2355f interfaceC2355f12 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            m.d(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH11 = W.T(interfaceC2355f12.n(list14, (C2356g) obj24));
                            } catch (Throwable th11) {
                                listH11 = AbstractC2319w.H(th11);
                            }
                            mVar.d(listH11);
                            break;
                        case 11:
                            InterfaceC2355f interfaceC2355f13 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            m.d(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH12 = W.T(interfaceC2355f13.k(list16, (C2356g) obj25));
                            } catch (Throwable th12) {
                                listH12 = AbstractC2319w.H(th12);
                            }
                            mVar.d(listH12);
                            break;
                        case 12:
                            InterfaceC2355f interfaceC2355f14 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            m.d(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            m.d(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            m.d(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f14.G(str12, str13, (C2356g) obj28);
                                listH13 = W.T(null);
                            } catch (Throwable th13) {
                                listH13 = AbstractC2319w.H(th13);
                            }
                            mVar.d(listH13);
                            break;
                        case 13:
                            InterfaceC2355f interfaceC2355f15 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            m.d(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            m.d(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            m.d(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f15.y(str14, jLongValue, (C2356g) obj31);
                                listH14 = W.T(null);
                            } catch (Throwable th14) {
                                listH14 = AbstractC2319w.H(th14);
                            }
                            mVar.d(listH14);
                            break;
                        default:
                            InterfaceC2355f interfaceC2355f16 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            m.d(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            m.d(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            m.d(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f16.g(str15, dDoubleValue, (C2356g) obj34);
                                listH15 = W.T(null);
                            } catch (Throwable th15) {
                                listH15 = AbstractC2319w.H(th15);
                            }
                            mVar.d(listH15);
                            break;
                    }
                }
            });
        } else {
            c2061m8.J(null);
        }
        C2061m c2061m9 = new C2061m(binaryMessenger, b.k("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getDouble", strConcat), a(), fVarB);
        if (interfaceC2355f != null) {
            final int i18 = 4;
            c2061m9.J(new p161o8.b() { // from class: y8.d
                @Override // p161o8.b
                public final void g(Object obj, W4.m mVar) {
                    List listH;
                    List listH2;
                    List listH3;
                    List listH4;
                    List listH5;
                    List listH6;
                    List listH7;
                    List listH8;
                    List listH9;
                    List listH10;
                    List listH11;
                    List listH12;
                    List listH13;
                    List listH14;
                    List listH15;
                    switch (i18) {
                        case 0:
                            InterfaceC2355f interfaceC2355f2 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            m.d(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            m.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            m.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f2.h(str2, str3, (C2356g) obj4);
                                listH = W.T(null);
                            } catch (Throwable th) {
                                listH = AbstractC2319w.H(th);
                            }
                            mVar.d(listH);
                            break;
                        case 1:
                            InterfaceC2355f interfaceC2355f3 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            m.d(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            m.d(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            m.d(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f3.o(str4, list3, (C2356g) obj7);
                                listH2 = W.T(null);
                            } catch (Throwable th2) {
                                listH2 = AbstractC2319w.H(th2);
                            }
                            mVar.d(listH2);
                            break;
                        case 2:
                            InterfaceC2355f interfaceC2355f4 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            m.d(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            m.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH3 = W.T(interfaceC2355f4.c(str5, (C2356g) obj9));
                            } catch (Throwable th3) {
                                listH3 = AbstractC2319w.H(th3);
                            }
                            mVar.d(listH3);
                            break;
                        case 3:
                            InterfaceC2355f interfaceC2355f5 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            m.d(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            m.d(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH4 = W.T(interfaceC2355f5.d(str6, (C2356g) obj11));
                            } catch (Throwable th4) {
                                listH4 = AbstractC2319w.H(th4);
                            }
                            mVar.d(listH4);
                            break;
                        case 4:
                            InterfaceC2355f interfaceC2355f6 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            m.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            m.d(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH5 = W.T(interfaceC2355f6.i(str7, (C2356g) obj13));
                            } catch (Throwable th5) {
                                listH5 = AbstractC2319w.H(th5);
                            }
                            mVar.d(listH5);
                            break;
                        case 5:
                            InterfaceC2355f interfaceC2355f7 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            m.d(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            m.d(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH6 = W.T(interfaceC2355f7.H(str8, (C2356g) obj15));
                            } catch (Throwable th6) {
                                listH6 = AbstractC2319w.H(th6);
                            }
                            mVar.d(listH6);
                            break;
                        case 6:
                            InterfaceC2355f interfaceC2355f8 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            m.d(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            m.d(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            m.d(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f8.l(str9, zBooleanValue, (C2356g) obj18);
                                listH7 = W.T(null);
                            } catch (Throwable th7) {
                                listH7 = AbstractC2319w.H(th7);
                            }
                            mVar.d(listH7);
                            break;
                        case 7:
                            InterfaceC2355f interfaceC2355f9 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            m.d(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            m.d(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH8 = W.T(interfaceC2355f9.p(str10, (C2356g) obj20));
                            } catch (Throwable th8) {
                                listH8 = AbstractC2319w.H(th8);
                            }
                            mVar.d(listH8);
                            break;
                        case 8:
                            InterfaceC2355f interfaceC2355f10 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            m.d(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            m.d(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH9 = W.T(interfaceC2355f10.u(str11, (C2356g) obj22));
                            } catch (Throwable th9) {
                                listH9 = AbstractC2319w.H(th9);
                            }
                            mVar.d(listH9);
                            break;
                        case 9:
                            InterfaceC2355f interfaceC2355f11 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            m.d(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f11.B(list12, (C2356g) obj23);
                                listH10 = W.T(null);
                            } catch (Throwable th10) {
                                listH10 = AbstractC2319w.H(th10);
                            }
                            mVar.d(listH10);
                            break;
                        case 10:
                            InterfaceC2355f interfaceC2355f12 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            m.d(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH11 = W.T(interfaceC2355f12.n(list14, (C2356g) obj24));
                            } catch (Throwable th11) {
                                listH11 = AbstractC2319w.H(th11);
                            }
                            mVar.d(listH11);
                            break;
                        case 11:
                            InterfaceC2355f interfaceC2355f13 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            m.d(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH12 = W.T(interfaceC2355f13.k(list16, (C2356g) obj25));
                            } catch (Throwable th12) {
                                listH12 = AbstractC2319w.H(th12);
                            }
                            mVar.d(listH12);
                            break;
                        case 12:
                            InterfaceC2355f interfaceC2355f14 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            m.d(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            m.d(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            m.d(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f14.G(str12, str13, (C2356g) obj28);
                                listH13 = W.T(null);
                            } catch (Throwable th13) {
                                listH13 = AbstractC2319w.H(th13);
                            }
                            mVar.d(listH13);
                            break;
                        case 13:
                            InterfaceC2355f interfaceC2355f15 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            m.d(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            m.d(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            m.d(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f15.y(str14, jLongValue, (C2356g) obj31);
                                listH14 = W.T(null);
                            } catch (Throwable th14) {
                                listH14 = AbstractC2319w.H(th14);
                            }
                            mVar.d(listH14);
                            break;
                        default:
                            InterfaceC2355f interfaceC2355f16 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            m.d(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            m.d(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            m.d(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f16.g(str15, dDoubleValue, (C2356g) obj34);
                                listH15 = W.T(null);
                            } catch (Throwable th15) {
                                listH15 = AbstractC2319w.H(th15);
                            }
                            mVar.d(listH15);
                            break;
                    }
                }
            });
        } else {
            c2061m9.J(null);
        }
        C2061m c2061m10 = new C2061m(binaryMessenger, b.k("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getInt", strConcat), a(), fVarB);
        if (interfaceC2355f != null) {
            final int i19 = 5;
            c2061m10.J(new p161o8.b() { // from class: y8.d
                @Override // p161o8.b
                public final void g(Object obj, W4.m mVar) {
                    List listH;
                    List listH2;
                    List listH3;
                    List listH4;
                    List listH5;
                    List listH6;
                    List listH7;
                    List listH8;
                    List listH9;
                    List listH10;
                    List listH11;
                    List listH12;
                    List listH13;
                    List listH14;
                    List listH15;
                    switch (i19) {
                        case 0:
                            InterfaceC2355f interfaceC2355f2 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            m.d(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            m.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            m.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f2.h(str2, str3, (C2356g) obj4);
                                listH = W.T(null);
                            } catch (Throwable th) {
                                listH = AbstractC2319w.H(th);
                            }
                            mVar.d(listH);
                            break;
                        case 1:
                            InterfaceC2355f interfaceC2355f3 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            m.d(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            m.d(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            m.d(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f3.o(str4, list3, (C2356g) obj7);
                                listH2 = W.T(null);
                            } catch (Throwable th2) {
                                listH2 = AbstractC2319w.H(th2);
                            }
                            mVar.d(listH2);
                            break;
                        case 2:
                            InterfaceC2355f interfaceC2355f4 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            m.d(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            m.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH3 = W.T(interfaceC2355f4.c(str5, (C2356g) obj9));
                            } catch (Throwable th3) {
                                listH3 = AbstractC2319w.H(th3);
                            }
                            mVar.d(listH3);
                            break;
                        case 3:
                            InterfaceC2355f interfaceC2355f5 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            m.d(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            m.d(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH4 = W.T(interfaceC2355f5.d(str6, (C2356g) obj11));
                            } catch (Throwable th4) {
                                listH4 = AbstractC2319w.H(th4);
                            }
                            mVar.d(listH4);
                            break;
                        case 4:
                            InterfaceC2355f interfaceC2355f6 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            m.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            m.d(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH5 = W.T(interfaceC2355f6.i(str7, (C2356g) obj13));
                            } catch (Throwable th5) {
                                listH5 = AbstractC2319w.H(th5);
                            }
                            mVar.d(listH5);
                            break;
                        case 5:
                            InterfaceC2355f interfaceC2355f7 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            m.d(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            m.d(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH6 = W.T(interfaceC2355f7.H(str8, (C2356g) obj15));
                            } catch (Throwable th6) {
                                listH6 = AbstractC2319w.H(th6);
                            }
                            mVar.d(listH6);
                            break;
                        case 6:
                            InterfaceC2355f interfaceC2355f8 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            m.d(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            m.d(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            m.d(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f8.l(str9, zBooleanValue, (C2356g) obj18);
                                listH7 = W.T(null);
                            } catch (Throwable th7) {
                                listH7 = AbstractC2319w.H(th7);
                            }
                            mVar.d(listH7);
                            break;
                        case 7:
                            InterfaceC2355f interfaceC2355f9 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            m.d(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            m.d(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH8 = W.T(interfaceC2355f9.p(str10, (C2356g) obj20));
                            } catch (Throwable th8) {
                                listH8 = AbstractC2319w.H(th8);
                            }
                            mVar.d(listH8);
                            break;
                        case 8:
                            InterfaceC2355f interfaceC2355f10 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            m.d(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            m.d(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH9 = W.T(interfaceC2355f10.u(str11, (C2356g) obj22));
                            } catch (Throwable th9) {
                                listH9 = AbstractC2319w.H(th9);
                            }
                            mVar.d(listH9);
                            break;
                        case 9:
                            InterfaceC2355f interfaceC2355f11 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            m.d(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f11.B(list12, (C2356g) obj23);
                                listH10 = W.T(null);
                            } catch (Throwable th10) {
                                listH10 = AbstractC2319w.H(th10);
                            }
                            mVar.d(listH10);
                            break;
                        case 10:
                            InterfaceC2355f interfaceC2355f12 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            m.d(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH11 = W.T(interfaceC2355f12.n(list14, (C2356g) obj24));
                            } catch (Throwable th11) {
                                listH11 = AbstractC2319w.H(th11);
                            }
                            mVar.d(listH11);
                            break;
                        case 11:
                            InterfaceC2355f interfaceC2355f13 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            m.d(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH12 = W.T(interfaceC2355f13.k(list16, (C2356g) obj25));
                            } catch (Throwable th12) {
                                listH12 = AbstractC2319w.H(th12);
                            }
                            mVar.d(listH12);
                            break;
                        case 12:
                            InterfaceC2355f interfaceC2355f14 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            m.d(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            m.d(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            m.d(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f14.G(str12, str13, (C2356g) obj28);
                                listH13 = W.T(null);
                            } catch (Throwable th13) {
                                listH13 = AbstractC2319w.H(th13);
                            }
                            mVar.d(listH13);
                            break;
                        case 13:
                            InterfaceC2355f interfaceC2355f15 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            m.d(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            m.d(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            m.d(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f15.y(str14, jLongValue, (C2356g) obj31);
                                listH14 = W.T(null);
                            } catch (Throwable th14) {
                                listH14 = AbstractC2319w.H(th14);
                            }
                            mVar.d(listH14);
                            break;
                        default:
                            InterfaceC2355f interfaceC2355f16 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            m.d(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            m.d(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            m.d(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f16.g(str15, dDoubleValue, (C2356g) obj34);
                                listH15 = W.T(null);
                            } catch (Throwable th15) {
                                listH15 = AbstractC2319w.H(th15);
                            }
                            mVar.d(listH15);
                            break;
                    }
                }
            });
        } else {
            c2061m10.J(null);
        }
        C2061m c2061m11 = new C2061m(binaryMessenger, b.k("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getPlatformEncodedStringList", strConcat), a(), fVarB);
        if (interfaceC2355f != null) {
            final int i20 = 7;
            c2061m11.J(new p161o8.b() { // from class: y8.d
                @Override // p161o8.b
                public final void g(Object obj, W4.m mVar) {
                    List listH;
                    List listH2;
                    List listH3;
                    List listH4;
                    List listH5;
                    List listH6;
                    List listH7;
                    List listH8;
                    List listH9;
                    List listH10;
                    List listH11;
                    List listH12;
                    List listH13;
                    List listH14;
                    List listH15;
                    switch (i20) {
                        case 0:
                            InterfaceC2355f interfaceC2355f2 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            m.d(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            m.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            m.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f2.h(str2, str3, (C2356g) obj4);
                                listH = W.T(null);
                            } catch (Throwable th) {
                                listH = AbstractC2319w.H(th);
                            }
                            mVar.d(listH);
                            break;
                        case 1:
                            InterfaceC2355f interfaceC2355f3 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            m.d(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            m.d(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            m.d(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f3.o(str4, list3, (C2356g) obj7);
                                listH2 = W.T(null);
                            } catch (Throwable th2) {
                                listH2 = AbstractC2319w.H(th2);
                            }
                            mVar.d(listH2);
                            break;
                        case 2:
                            InterfaceC2355f interfaceC2355f4 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            m.d(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            m.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH3 = W.T(interfaceC2355f4.c(str5, (C2356g) obj9));
                            } catch (Throwable th3) {
                                listH3 = AbstractC2319w.H(th3);
                            }
                            mVar.d(listH3);
                            break;
                        case 3:
                            InterfaceC2355f interfaceC2355f5 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            m.d(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            m.d(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH4 = W.T(interfaceC2355f5.d(str6, (C2356g) obj11));
                            } catch (Throwable th4) {
                                listH4 = AbstractC2319w.H(th4);
                            }
                            mVar.d(listH4);
                            break;
                        case 4:
                            InterfaceC2355f interfaceC2355f6 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            m.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            m.d(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH5 = W.T(interfaceC2355f6.i(str7, (C2356g) obj13));
                            } catch (Throwable th5) {
                                listH5 = AbstractC2319w.H(th5);
                            }
                            mVar.d(listH5);
                            break;
                        case 5:
                            InterfaceC2355f interfaceC2355f7 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            m.d(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            m.d(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH6 = W.T(interfaceC2355f7.H(str8, (C2356g) obj15));
                            } catch (Throwable th6) {
                                listH6 = AbstractC2319w.H(th6);
                            }
                            mVar.d(listH6);
                            break;
                        case 6:
                            InterfaceC2355f interfaceC2355f8 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            m.d(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            m.d(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            m.d(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f8.l(str9, zBooleanValue, (C2356g) obj18);
                                listH7 = W.T(null);
                            } catch (Throwable th7) {
                                listH7 = AbstractC2319w.H(th7);
                            }
                            mVar.d(listH7);
                            break;
                        case 7:
                            InterfaceC2355f interfaceC2355f9 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            m.d(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            m.d(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH8 = W.T(interfaceC2355f9.p(str10, (C2356g) obj20));
                            } catch (Throwable th8) {
                                listH8 = AbstractC2319w.H(th8);
                            }
                            mVar.d(listH8);
                            break;
                        case 8:
                            InterfaceC2355f interfaceC2355f10 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            m.d(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            m.d(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH9 = W.T(interfaceC2355f10.u(str11, (C2356g) obj22));
                            } catch (Throwable th9) {
                                listH9 = AbstractC2319w.H(th9);
                            }
                            mVar.d(listH9);
                            break;
                        case 9:
                            InterfaceC2355f interfaceC2355f11 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            m.d(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f11.B(list12, (C2356g) obj23);
                                listH10 = W.T(null);
                            } catch (Throwable th10) {
                                listH10 = AbstractC2319w.H(th10);
                            }
                            mVar.d(listH10);
                            break;
                        case 10:
                            InterfaceC2355f interfaceC2355f12 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            m.d(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH11 = W.T(interfaceC2355f12.n(list14, (C2356g) obj24));
                            } catch (Throwable th11) {
                                listH11 = AbstractC2319w.H(th11);
                            }
                            mVar.d(listH11);
                            break;
                        case 11:
                            InterfaceC2355f interfaceC2355f13 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            m.d(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH12 = W.T(interfaceC2355f13.k(list16, (C2356g) obj25));
                            } catch (Throwable th12) {
                                listH12 = AbstractC2319w.H(th12);
                            }
                            mVar.d(listH12);
                            break;
                        case 12:
                            InterfaceC2355f interfaceC2355f14 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            m.d(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            m.d(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            m.d(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f14.G(str12, str13, (C2356g) obj28);
                                listH13 = W.T(null);
                            } catch (Throwable th13) {
                                listH13 = AbstractC2319w.H(th13);
                            }
                            mVar.d(listH13);
                            break;
                        case 13:
                            InterfaceC2355f interfaceC2355f15 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            m.d(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            m.d(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            m.d(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f15.y(str14, jLongValue, (C2356g) obj31);
                                listH14 = W.T(null);
                            } catch (Throwable th14) {
                                listH14 = AbstractC2319w.H(th14);
                            }
                            mVar.d(listH14);
                            break;
                        default:
                            InterfaceC2355f interfaceC2355f16 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            m.d(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            m.d(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            m.d(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f16.g(str15, dDoubleValue, (C2356g) obj34);
                                listH15 = W.T(null);
                            } catch (Throwable th15) {
                                listH15 = AbstractC2319w.H(th15);
                            }
                            mVar.d(listH15);
                            break;
                    }
                }
            });
        } else {
            c2061m11.J(null);
        }
        C2061m c2061m12 = new C2061m(binaryMessenger, b.k("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getStringList", strConcat), a(), fVarB);
        if (interfaceC2355f != null) {
            final int i21 = 8;
            c2061m12.J(new p161o8.b() { // from class: y8.d
                @Override // p161o8.b
                public final void g(Object obj, W4.m mVar) {
                    List listH;
                    List listH2;
                    List listH3;
                    List listH4;
                    List listH5;
                    List listH6;
                    List listH7;
                    List listH8;
                    List listH9;
                    List listH10;
                    List listH11;
                    List listH12;
                    List listH13;
                    List listH14;
                    List listH15;
                    switch (i21) {
                        case 0:
                            InterfaceC2355f interfaceC2355f2 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            m.d(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            m.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            m.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f2.h(str2, str3, (C2356g) obj4);
                                listH = W.T(null);
                            } catch (Throwable th) {
                                listH = AbstractC2319w.H(th);
                            }
                            mVar.d(listH);
                            break;
                        case 1:
                            InterfaceC2355f interfaceC2355f3 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            m.d(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            m.d(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            m.d(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f3.o(str4, list3, (C2356g) obj7);
                                listH2 = W.T(null);
                            } catch (Throwable th2) {
                                listH2 = AbstractC2319w.H(th2);
                            }
                            mVar.d(listH2);
                            break;
                        case 2:
                            InterfaceC2355f interfaceC2355f4 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            m.d(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            m.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH3 = W.T(interfaceC2355f4.c(str5, (C2356g) obj9));
                            } catch (Throwable th3) {
                                listH3 = AbstractC2319w.H(th3);
                            }
                            mVar.d(listH3);
                            break;
                        case 3:
                            InterfaceC2355f interfaceC2355f5 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            m.d(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            m.d(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH4 = W.T(interfaceC2355f5.d(str6, (C2356g) obj11));
                            } catch (Throwable th4) {
                                listH4 = AbstractC2319w.H(th4);
                            }
                            mVar.d(listH4);
                            break;
                        case 4:
                            InterfaceC2355f interfaceC2355f6 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            m.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            m.d(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH5 = W.T(interfaceC2355f6.i(str7, (C2356g) obj13));
                            } catch (Throwable th5) {
                                listH5 = AbstractC2319w.H(th5);
                            }
                            mVar.d(listH5);
                            break;
                        case 5:
                            InterfaceC2355f interfaceC2355f7 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            m.d(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            m.d(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH6 = W.T(interfaceC2355f7.H(str8, (C2356g) obj15));
                            } catch (Throwable th6) {
                                listH6 = AbstractC2319w.H(th6);
                            }
                            mVar.d(listH6);
                            break;
                        case 6:
                            InterfaceC2355f interfaceC2355f8 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            m.d(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            m.d(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            m.d(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f8.l(str9, zBooleanValue, (C2356g) obj18);
                                listH7 = W.T(null);
                            } catch (Throwable th7) {
                                listH7 = AbstractC2319w.H(th7);
                            }
                            mVar.d(listH7);
                            break;
                        case 7:
                            InterfaceC2355f interfaceC2355f9 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            m.d(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            m.d(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH8 = W.T(interfaceC2355f9.p(str10, (C2356g) obj20));
                            } catch (Throwable th8) {
                                listH8 = AbstractC2319w.H(th8);
                            }
                            mVar.d(listH8);
                            break;
                        case 8:
                            InterfaceC2355f interfaceC2355f10 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            m.d(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            m.d(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH9 = W.T(interfaceC2355f10.u(str11, (C2356g) obj22));
                            } catch (Throwable th9) {
                                listH9 = AbstractC2319w.H(th9);
                            }
                            mVar.d(listH9);
                            break;
                        case 9:
                            InterfaceC2355f interfaceC2355f11 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            m.d(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f11.B(list12, (C2356g) obj23);
                                listH10 = W.T(null);
                            } catch (Throwable th10) {
                                listH10 = AbstractC2319w.H(th10);
                            }
                            mVar.d(listH10);
                            break;
                        case 10:
                            InterfaceC2355f interfaceC2355f12 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            m.d(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH11 = W.T(interfaceC2355f12.n(list14, (C2356g) obj24));
                            } catch (Throwable th11) {
                                listH11 = AbstractC2319w.H(th11);
                            }
                            mVar.d(listH11);
                            break;
                        case 11:
                            InterfaceC2355f interfaceC2355f13 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            m.d(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH12 = W.T(interfaceC2355f13.k(list16, (C2356g) obj25));
                            } catch (Throwable th12) {
                                listH12 = AbstractC2319w.H(th12);
                            }
                            mVar.d(listH12);
                            break;
                        case 12:
                            InterfaceC2355f interfaceC2355f14 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            m.d(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            m.d(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            m.d(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f14.G(str12, str13, (C2356g) obj28);
                                listH13 = W.T(null);
                            } catch (Throwable th13) {
                                listH13 = AbstractC2319w.H(th13);
                            }
                            mVar.d(listH13);
                            break;
                        case 13:
                            InterfaceC2355f interfaceC2355f15 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            m.d(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            m.d(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            m.d(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f15.y(str14, jLongValue, (C2356g) obj31);
                                listH14 = W.T(null);
                            } catch (Throwable th14) {
                                listH14 = AbstractC2319w.H(th14);
                            }
                            mVar.d(listH14);
                            break;
                        default:
                            InterfaceC2355f interfaceC2355f16 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            m.d(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            m.d(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            m.d(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f16.g(str15, dDoubleValue, (C2356g) obj34);
                                listH15 = W.T(null);
                            } catch (Throwable th15) {
                                listH15 = AbstractC2319w.H(th15);
                            }
                            mVar.d(listH15);
                            break;
                    }
                }
            });
        } else {
            c2061m12.J(null);
        }
        C2061m c2061m13 = new C2061m(binaryMessenger, b.k("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.clear", strConcat), a(), fVarB);
        if (interfaceC2355f != null) {
            final int i22 = 9;
            c2061m13.J(new p161o8.b() { // from class: y8.d
                @Override // p161o8.b
                public final void g(Object obj, W4.m mVar) {
                    List listH;
                    List listH2;
                    List listH3;
                    List listH4;
                    List listH5;
                    List listH6;
                    List listH7;
                    List listH8;
                    List listH9;
                    List listH10;
                    List listH11;
                    List listH12;
                    List listH13;
                    List listH14;
                    List listH15;
                    switch (i22) {
                        case 0:
                            InterfaceC2355f interfaceC2355f2 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            m.d(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            m.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            m.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f2.h(str2, str3, (C2356g) obj4);
                                listH = W.T(null);
                            } catch (Throwable th) {
                                listH = AbstractC2319w.H(th);
                            }
                            mVar.d(listH);
                            break;
                        case 1:
                            InterfaceC2355f interfaceC2355f3 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            m.d(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            m.d(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            m.d(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f3.o(str4, list3, (C2356g) obj7);
                                listH2 = W.T(null);
                            } catch (Throwable th2) {
                                listH2 = AbstractC2319w.H(th2);
                            }
                            mVar.d(listH2);
                            break;
                        case 2:
                            InterfaceC2355f interfaceC2355f4 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            m.d(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            m.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH3 = W.T(interfaceC2355f4.c(str5, (C2356g) obj9));
                            } catch (Throwable th3) {
                                listH3 = AbstractC2319w.H(th3);
                            }
                            mVar.d(listH3);
                            break;
                        case 3:
                            InterfaceC2355f interfaceC2355f5 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            m.d(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            m.d(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH4 = W.T(interfaceC2355f5.d(str6, (C2356g) obj11));
                            } catch (Throwable th4) {
                                listH4 = AbstractC2319w.H(th4);
                            }
                            mVar.d(listH4);
                            break;
                        case 4:
                            InterfaceC2355f interfaceC2355f6 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            m.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            m.d(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH5 = W.T(interfaceC2355f6.i(str7, (C2356g) obj13));
                            } catch (Throwable th5) {
                                listH5 = AbstractC2319w.H(th5);
                            }
                            mVar.d(listH5);
                            break;
                        case 5:
                            InterfaceC2355f interfaceC2355f7 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            m.d(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            m.d(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH6 = W.T(interfaceC2355f7.H(str8, (C2356g) obj15));
                            } catch (Throwable th6) {
                                listH6 = AbstractC2319w.H(th6);
                            }
                            mVar.d(listH6);
                            break;
                        case 6:
                            InterfaceC2355f interfaceC2355f8 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            m.d(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            m.d(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            m.d(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f8.l(str9, zBooleanValue, (C2356g) obj18);
                                listH7 = W.T(null);
                            } catch (Throwable th7) {
                                listH7 = AbstractC2319w.H(th7);
                            }
                            mVar.d(listH7);
                            break;
                        case 7:
                            InterfaceC2355f interfaceC2355f9 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            m.d(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            m.d(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH8 = W.T(interfaceC2355f9.p(str10, (C2356g) obj20));
                            } catch (Throwable th8) {
                                listH8 = AbstractC2319w.H(th8);
                            }
                            mVar.d(listH8);
                            break;
                        case 8:
                            InterfaceC2355f interfaceC2355f10 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            m.d(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            m.d(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH9 = W.T(interfaceC2355f10.u(str11, (C2356g) obj22));
                            } catch (Throwable th9) {
                                listH9 = AbstractC2319w.H(th9);
                            }
                            mVar.d(listH9);
                            break;
                        case 9:
                            InterfaceC2355f interfaceC2355f11 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            m.d(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f11.B(list12, (C2356g) obj23);
                                listH10 = W.T(null);
                            } catch (Throwable th10) {
                                listH10 = AbstractC2319w.H(th10);
                            }
                            mVar.d(listH10);
                            break;
                        case 10:
                            InterfaceC2355f interfaceC2355f12 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            m.d(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH11 = W.T(interfaceC2355f12.n(list14, (C2356g) obj24));
                            } catch (Throwable th11) {
                                listH11 = AbstractC2319w.H(th11);
                            }
                            mVar.d(listH11);
                            break;
                        case 11:
                            InterfaceC2355f interfaceC2355f13 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            m.d(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH12 = W.T(interfaceC2355f13.k(list16, (C2356g) obj25));
                            } catch (Throwable th12) {
                                listH12 = AbstractC2319w.H(th12);
                            }
                            mVar.d(listH12);
                            break;
                        case 12:
                            InterfaceC2355f interfaceC2355f14 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            m.d(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            m.d(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            m.d(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f14.G(str12, str13, (C2356g) obj28);
                                listH13 = W.T(null);
                            } catch (Throwable th13) {
                                listH13 = AbstractC2319w.H(th13);
                            }
                            mVar.d(listH13);
                            break;
                        case 13:
                            InterfaceC2355f interfaceC2355f15 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            m.d(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            m.d(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            m.d(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f15.y(str14, jLongValue, (C2356g) obj31);
                                listH14 = W.T(null);
                            } catch (Throwable th14) {
                                listH14 = AbstractC2319w.H(th14);
                            }
                            mVar.d(listH14);
                            break;
                        default:
                            InterfaceC2355f interfaceC2355f16 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            m.d(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            m.d(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            m.d(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f16.g(str15, dDoubleValue, (C2356g) obj34);
                                listH15 = W.T(null);
                            } catch (Throwable th15) {
                                listH15 = AbstractC2319w.H(th15);
                            }
                            mVar.d(listH15);
                            break;
                    }
                }
            });
        } else {
            c2061m13.J(null);
        }
        C2061m c2061m14 = new C2061m(binaryMessenger, b.k("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getAll", strConcat), a(), fVarB);
        if (interfaceC2355f != null) {
            final int i23 = 10;
            c2061m14.J(new p161o8.b() { // from class: y8.d
                @Override // p161o8.b
                public final void g(Object obj, W4.m mVar) {
                    List listH;
                    List listH2;
                    List listH3;
                    List listH4;
                    List listH5;
                    List listH6;
                    List listH7;
                    List listH8;
                    List listH9;
                    List listH10;
                    List listH11;
                    List listH12;
                    List listH13;
                    List listH14;
                    List listH15;
                    switch (i23) {
                        case 0:
                            InterfaceC2355f interfaceC2355f2 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            m.d(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            m.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            m.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f2.h(str2, str3, (C2356g) obj4);
                                listH = W.T(null);
                            } catch (Throwable th) {
                                listH = AbstractC2319w.H(th);
                            }
                            mVar.d(listH);
                            break;
                        case 1:
                            InterfaceC2355f interfaceC2355f3 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            m.d(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            m.d(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            m.d(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f3.o(str4, list3, (C2356g) obj7);
                                listH2 = W.T(null);
                            } catch (Throwable th2) {
                                listH2 = AbstractC2319w.H(th2);
                            }
                            mVar.d(listH2);
                            break;
                        case 2:
                            InterfaceC2355f interfaceC2355f4 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            m.d(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            m.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH3 = W.T(interfaceC2355f4.c(str5, (C2356g) obj9));
                            } catch (Throwable th3) {
                                listH3 = AbstractC2319w.H(th3);
                            }
                            mVar.d(listH3);
                            break;
                        case 3:
                            InterfaceC2355f interfaceC2355f5 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            m.d(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            m.d(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH4 = W.T(interfaceC2355f5.d(str6, (C2356g) obj11));
                            } catch (Throwable th4) {
                                listH4 = AbstractC2319w.H(th4);
                            }
                            mVar.d(listH4);
                            break;
                        case 4:
                            InterfaceC2355f interfaceC2355f6 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            m.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            m.d(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH5 = W.T(interfaceC2355f6.i(str7, (C2356g) obj13));
                            } catch (Throwable th5) {
                                listH5 = AbstractC2319w.H(th5);
                            }
                            mVar.d(listH5);
                            break;
                        case 5:
                            InterfaceC2355f interfaceC2355f7 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            m.d(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            m.d(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH6 = W.T(interfaceC2355f7.H(str8, (C2356g) obj15));
                            } catch (Throwable th6) {
                                listH6 = AbstractC2319w.H(th6);
                            }
                            mVar.d(listH6);
                            break;
                        case 6:
                            InterfaceC2355f interfaceC2355f8 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            m.d(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            m.d(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            m.d(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f8.l(str9, zBooleanValue, (C2356g) obj18);
                                listH7 = W.T(null);
                            } catch (Throwable th7) {
                                listH7 = AbstractC2319w.H(th7);
                            }
                            mVar.d(listH7);
                            break;
                        case 7:
                            InterfaceC2355f interfaceC2355f9 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            m.d(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            m.d(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH8 = W.T(interfaceC2355f9.p(str10, (C2356g) obj20));
                            } catch (Throwable th8) {
                                listH8 = AbstractC2319w.H(th8);
                            }
                            mVar.d(listH8);
                            break;
                        case 8:
                            InterfaceC2355f interfaceC2355f10 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            m.d(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            m.d(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH9 = W.T(interfaceC2355f10.u(str11, (C2356g) obj22));
                            } catch (Throwable th9) {
                                listH9 = AbstractC2319w.H(th9);
                            }
                            mVar.d(listH9);
                            break;
                        case 9:
                            InterfaceC2355f interfaceC2355f11 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            m.d(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f11.B(list12, (C2356g) obj23);
                                listH10 = W.T(null);
                            } catch (Throwable th10) {
                                listH10 = AbstractC2319w.H(th10);
                            }
                            mVar.d(listH10);
                            break;
                        case 10:
                            InterfaceC2355f interfaceC2355f12 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            m.d(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH11 = W.T(interfaceC2355f12.n(list14, (C2356g) obj24));
                            } catch (Throwable th11) {
                                listH11 = AbstractC2319w.H(th11);
                            }
                            mVar.d(listH11);
                            break;
                        case 11:
                            InterfaceC2355f interfaceC2355f13 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            m.d(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH12 = W.T(interfaceC2355f13.k(list16, (C2356g) obj25));
                            } catch (Throwable th12) {
                                listH12 = AbstractC2319w.H(th12);
                            }
                            mVar.d(listH12);
                            break;
                        case 12:
                            InterfaceC2355f interfaceC2355f14 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            m.d(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            m.d(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            m.d(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f14.G(str12, str13, (C2356g) obj28);
                                listH13 = W.T(null);
                            } catch (Throwable th13) {
                                listH13 = AbstractC2319w.H(th13);
                            }
                            mVar.d(listH13);
                            break;
                        case 13:
                            InterfaceC2355f interfaceC2355f15 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            m.d(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            m.d(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            m.d(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f15.y(str14, jLongValue, (C2356g) obj31);
                                listH14 = W.T(null);
                            } catch (Throwable th14) {
                                listH14 = AbstractC2319w.H(th14);
                            }
                            mVar.d(listH14);
                            break;
                        default:
                            InterfaceC2355f interfaceC2355f16 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            m.d(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            m.d(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            m.d(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f16.g(str15, dDoubleValue, (C2356g) obj34);
                                listH15 = W.T(null);
                            } catch (Throwable th15) {
                                listH15 = AbstractC2319w.H(th15);
                            }
                            mVar.d(listH15);
                            break;
                    }
                }
            });
        } else {
            c2061m14.J(null);
        }
        C2061m c2061m15 = new C2061m(binaryMessenger, b.k("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getKeys", strConcat), a(), fVarB);
        if (interfaceC2355f == null) {
            c2061m15.J(null);
        } else {
            final int i24 = 11;
            c2061m15.J(new p161o8.b() { // from class: y8.d
                @Override // p161o8.b
                public final void g(Object obj, W4.m mVar) {
                    List listH;
                    List listH2;
                    List listH3;
                    List listH4;
                    List listH5;
                    List listH6;
                    List listH7;
                    List listH8;
                    List listH9;
                    List listH10;
                    List listH11;
                    List listH12;
                    List listH13;
                    List listH14;
                    List listH15;
                    switch (i24) {
                        case 0:
                            InterfaceC2355f interfaceC2355f2 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            m.d(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            m.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            m.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f2.h(str2, str3, (C2356g) obj4);
                                listH = W.T(null);
                            } catch (Throwable th) {
                                listH = AbstractC2319w.H(th);
                            }
                            mVar.d(listH);
                            break;
                        case 1:
                            InterfaceC2355f interfaceC2355f3 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            m.d(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            m.d(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            m.d(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f3.o(str4, list3, (C2356g) obj7);
                                listH2 = W.T(null);
                            } catch (Throwable th2) {
                                listH2 = AbstractC2319w.H(th2);
                            }
                            mVar.d(listH2);
                            break;
                        case 2:
                            InterfaceC2355f interfaceC2355f4 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            m.d(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            m.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH3 = W.T(interfaceC2355f4.c(str5, (C2356g) obj9));
                            } catch (Throwable th3) {
                                listH3 = AbstractC2319w.H(th3);
                            }
                            mVar.d(listH3);
                            break;
                        case 3:
                            InterfaceC2355f interfaceC2355f5 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            m.d(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            m.d(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH4 = W.T(interfaceC2355f5.d(str6, (C2356g) obj11));
                            } catch (Throwable th4) {
                                listH4 = AbstractC2319w.H(th4);
                            }
                            mVar.d(listH4);
                            break;
                        case 4:
                            InterfaceC2355f interfaceC2355f6 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            m.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            m.d(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH5 = W.T(interfaceC2355f6.i(str7, (C2356g) obj13));
                            } catch (Throwable th5) {
                                listH5 = AbstractC2319w.H(th5);
                            }
                            mVar.d(listH5);
                            break;
                        case 5:
                            InterfaceC2355f interfaceC2355f7 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            m.d(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            m.d(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH6 = W.T(interfaceC2355f7.H(str8, (C2356g) obj15));
                            } catch (Throwable th6) {
                                listH6 = AbstractC2319w.H(th6);
                            }
                            mVar.d(listH6);
                            break;
                        case 6:
                            InterfaceC2355f interfaceC2355f8 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            m.d(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            m.d(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            m.d(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f8.l(str9, zBooleanValue, (C2356g) obj18);
                                listH7 = W.T(null);
                            } catch (Throwable th7) {
                                listH7 = AbstractC2319w.H(th7);
                            }
                            mVar.d(listH7);
                            break;
                        case 7:
                            InterfaceC2355f interfaceC2355f9 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            m.d(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            m.d(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH8 = W.T(interfaceC2355f9.p(str10, (C2356g) obj20));
                            } catch (Throwable th8) {
                                listH8 = AbstractC2319w.H(th8);
                            }
                            mVar.d(listH8);
                            break;
                        case 8:
                            InterfaceC2355f interfaceC2355f10 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            m.d(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            m.d(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH9 = W.T(interfaceC2355f10.u(str11, (C2356g) obj22));
                            } catch (Throwable th9) {
                                listH9 = AbstractC2319w.H(th9);
                            }
                            mVar.d(listH9);
                            break;
                        case 9:
                            InterfaceC2355f interfaceC2355f11 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            m.d(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f11.B(list12, (C2356g) obj23);
                                listH10 = W.T(null);
                            } catch (Throwable th10) {
                                listH10 = AbstractC2319w.H(th10);
                            }
                            mVar.d(listH10);
                            break;
                        case 10:
                            InterfaceC2355f interfaceC2355f12 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            m.d(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH11 = W.T(interfaceC2355f12.n(list14, (C2356g) obj24));
                            } catch (Throwable th11) {
                                listH11 = AbstractC2319w.H(th11);
                            }
                            mVar.d(listH11);
                            break;
                        case 11:
                            InterfaceC2355f interfaceC2355f13 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            m.d(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listH12 = W.T(interfaceC2355f13.k(list16, (C2356g) obj25));
                            } catch (Throwable th12) {
                                listH12 = AbstractC2319w.H(th12);
                            }
                            mVar.d(listH12);
                            break;
                        case 12:
                            InterfaceC2355f interfaceC2355f14 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            m.d(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            m.d(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            m.d(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f14.G(str12, str13, (C2356g) obj28);
                                listH13 = W.T(null);
                            } catch (Throwable th13) {
                                listH13 = AbstractC2319w.H(th13);
                            }
                            mVar.d(listH13);
                            break;
                        case 13:
                            InterfaceC2355f interfaceC2355f15 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            m.d(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            m.d(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            m.d(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f15.y(str14, jLongValue, (C2356g) obj31);
                                listH14 = W.T(null);
                            } catch (Throwable th14) {
                                listH14 = AbstractC2319w.H(th14);
                            }
                            mVar.d(listH14);
                            break;
                        default:
                            InterfaceC2355f interfaceC2355f16 = interfaceC2355f;
                            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            m.d(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            m.d(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            m.d(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC2355f16.g(str15, dDoubleValue, (C2356g) obj34);
                                listH15 = W.T(null);
                            } catch (Throwable th15) {
                                listH15 = AbstractC2319w.H(th15);
                            }
                            mVar.d(listH15);
                            break;
                    }
                }
            });
        }
    }
}
