package com.amazon.device.iap.internal.b;

import B2.AbstractC0112b;
import V0.p;
import android.content.Context;
import android.content.SharedPreferences;
import com.amazon.a.a.o.f;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static a f16796a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f16797b = "a";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f16798c = a.class.getName().concat("_PREFS_");

    public static a a() {
        return f16796a;
    }

    public void a(String str, String str2, String str3) {
        String str4 = f16797b;
        StringBuilder sbQ = p134m1.b.q("enter saveEntitlementRecord for v1 Entitlement [", str2, "/", str3, "], user [");
        sbQ.append(str);
        sbQ.append("]");
        com.amazon.device.iap.internal.util.b.a(str4, sbQ.toString());
        try {
            f.a(str, "userId");
            f.a(str2, com.amazon.a.a.o.b.f16379E);
            f.a(str3, "sku");
            Context contextB = com.amazon.device.iap.internal.d.f().b();
            f.a(contextB, "context");
            SharedPreferences.Editor editorEdit = contextB.getSharedPreferences(f16798c + str, 0).edit();
            editorEdit.putString(str3, str2);
            editorEdit.commit();
        } catch (Throwable th) {
            String str5 = f16797b;
            StringBuilder sbQ2 = p134m1.b.q("error in saving v1 Entitlement:", str2, "/", str3, ":");
            sbQ2.append(th.getMessage());
            com.amazon.device.iap.internal.util.b.a(str5, sbQ2.toString());
        }
        String str6 = f16797b;
        StringBuilder sbQ3 = p134m1.b.q("leaving saveEntitlementRecord for v1 Entitlement [", str2, "/", str3, "], user [");
        sbQ3.append(str);
        sbQ3.append("]");
        com.amazon.device.iap.internal.util.b.a(str6, sbQ3.toString());
    }

    public String a(String str, String str2) {
        com.amazon.device.iap.internal.util.b.a(f16797b, AbstractC0112b.h("enter getReceiptIdFromSku for sku [", str2, "], user [", str, "]"));
        String string = null;
        try {
            f.a(str, "userId");
            f.a(str2, "sku");
            Context contextB = com.amazon.device.iap.internal.d.f().b();
            f.a(contextB, "context");
            string = contextB.getSharedPreferences(f16798c + str, 0).getString(str2, null);
        } catch (Throwable th) {
            String str3 = f16797b;
            StringBuilder sbU = p.u("error in saving v1 Entitlement:", str2, ":");
            sbU.append(th.getMessage());
            com.amazon.device.iap.internal.util.b.a(str3, sbU.toString());
        }
        com.amazon.device.iap.internal.util.b.a(f16797b, AbstractC0112b.h("leaving saveEntitlementRecord for sku [", str2, "], user [", str, "]"));
        return string;
    }
}
