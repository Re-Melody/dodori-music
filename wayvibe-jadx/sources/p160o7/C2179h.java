package p160o7;

import java.util.HashMap;
import java.util.Map;
import p044d7.c;
import p170p7.g;
import p170p7.h;

/* JADX INFO: renamed from: o7.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2179h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f23756b;

    public C2179h(int i10, c cVar) {
        this.f23755a = i10;
        this.f23756b = cVar;
    }

    public static C2179h a(int i10, HashMap map) {
        c cVarJ = g.f25261a;
        for (Map.Entry entry : map.entrySet()) {
            cVarJ = cVarJ.j((h) entry.getKey(), ((z) entry.getValue()).f23813a);
        }
        return new C2179h(i10, cVarJ);
    }
}
