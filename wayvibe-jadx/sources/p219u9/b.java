package p219u9;

import B2.AbstractC0112b;
import java.util.ArrayList;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f27283a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ArrayList missingFields, String str, b bVar) {
        super(str, bVar);
        m.f(missingFields, "missingFields");
        this.f27283a = missingFields;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(String serialName, ArrayList arrayList) {
        String strL;
        m.f(serialName, "serialName");
        if (arrayList.size() == 1) {
            strL = AbstractC0112b.l(new StringBuilder("Field '"), (String) arrayList.get(0), "' is required for type with serial name '", serialName, "', but it was missing");
        } else {
            strL = "Fields " + arrayList + " are required for type with serial name '" + serialName + "', but they were missing";
        }
        this(arrayList, strL, null);
    }
}
