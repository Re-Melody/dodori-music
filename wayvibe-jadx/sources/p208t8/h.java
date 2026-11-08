package p208t8;

import p140m7.C2061m;
import p161o8.f;

/* JADX INFO: loaded from: classes2.dex */
public interface h {
    static void b(f fVar, d dVar) {
        j jVar = j.f26981d;
        Object obj = null;
        C2061m c2061m = new C2061m(fVar, "dev.flutter.pigeon.firebase_core_platform_interface.FirebaseAppHostApi.setAutomaticDataCollectionEnabled", jVar, obj);
        if (dVar != null) {
            c2061m.J(new g(dVar, 0));
        } else {
            c2061m.J(null);
        }
        C2061m c2061m2 = new C2061m(fVar, "dev.flutter.pigeon.firebase_core_platform_interface.FirebaseAppHostApi.setAutomaticResourceManagementEnabled", jVar, obj);
        if (dVar != null) {
            c2061m2.J(new g(dVar, 1));
        } else {
            c2061m2.J(null);
        }
        C2061m c2061m3 = new C2061m(fVar, "dev.flutter.pigeon.firebase_core_platform_interface.FirebaseAppHostApi.delete", jVar, obj);
        if (dVar != null) {
            c2061m3.J(new g(dVar, 2));
        } else {
            c2061m3.J(null);
        }
    }
}
