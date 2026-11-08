package com.revenuecat.purchases.ui.revenuecatui.utils;

import N8.n;
import android.net.Uri;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.m;
import p097i9.k;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class URIExtensionsKt {
    public static final URI upsertQueryParameters(URI uri, Map parameters) {
        m.f(uri, "<this>");
        m.f(parameters, "parameters");
        if (parameters.isEmpty()) {
            return uri;
        }
        Set<Map.Entry> setEntrySet = parameters.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : setEntrySet) {
            String str = (String) entry.getKey();
            linkedHashMap.put(str, Uri.encode(str) + '=' + Uri.encode((String) entry.getValue()));
        }
        String string = uri.toString();
        m.e(string, "toString()");
        String strO0 = k.O0(string, '#');
        String strE0 = k.E0(string, strO0);
        List listI0 = k.I0(k.L0('?', strO0, ""), new char[]{'&'}, 6);
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : listI0) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : arrayList) {
            String strDecode = Uri.decode(k.O0(str2, '='));
            if (parameters.containsKey(strDecode)) {
                str2 = (String) linkedHashMap.remove(strDecode);
            }
            if (str2 != null) {
                arrayList2.add(str2);
            }
        }
        Collection collectionValues = linkedHashMap.values();
        m.e(collectionValues, "pending.values");
        return new URI(k.O0(strO0, '?') + '?' + n.H0(n.M0(arrayList2, collectionValues), "&", null, null, null, 62) + strE0);
    }
}
