package com.google.firebase.firestore;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.google.firebase.firestore.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1225v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f18640b = Pattern.compile("[~*/\\[\\]]");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1225v f18641c = new C1225v(p170p7.k.f25267b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p170p7.k f18642a;

    public C1225v(List list) {
        this.f18642a = list.isEmpty() ? p170p7.k.f25268c : new p170p7.k(list);
    }

    public static C1225v a(String str) {
        R3.a.g(str, "Provided field path must not be null.");
        R3.a.f("Use FieldPath.of() for field names containing '~*/[]'.", !f18640b.matcher(str).find(), new Object[0]);
        try {
            return b(str.split("\\.", -1));
        } catch (IllegalArgumentException unused) {
            throw new IllegalArgumentException(V0.p.o("Invalid field path (", str, "). Paths must not be empty, begin with '.', end with '.', or contain '..'"));
        }
    }

    public static C1225v b(String... strArr) {
        R3.a.f("Invalid field path. Provided path must not be empty.", strArr.length > 0, new Object[0]);
        int i10 = 0;
        while (i10 < strArr.length) {
            String str = strArr[i10];
            boolean z10 = (str == null || str.isEmpty()) ? false : true;
            StringBuilder sb = new StringBuilder("Invalid field name at argument ");
            i10++;
            sb.append(i10);
            sb.append(". Field names must not be null or empty.");
            R3.a.f(sb.toString(), z10, new Object[0]);
        }
        return new C1225v(Arrays.asList(strArr));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1225v.class != obj.getClass()) {
            return false;
        }
        return this.f18642a.equals(((C1225v) obj).f18642a);
    }

    public final int hashCode() {
        return this.f18642a.hashCode();
    }

    public final String toString() {
        return this.f18642a.c();
    }

    public C1225v(p170p7.k kVar) {
        this.f18642a = kVar;
    }
}
