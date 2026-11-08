package p200t0;

import Z.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;
import p013a9.a;
import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class F extends H implements Iterable, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f26386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f26387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f26388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f26389e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f26390f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f26391g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f26392h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f26393i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f26394j;

    public F(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, ArrayList arrayList) {
        this.f26385a = str;
        this.f26386b = f10;
        this.f26387c = f11;
        this.f26388d = f12;
        this.f26389e = f13;
        this.f26390f = f14;
        this.f26391g = f15;
        this.f26392h = f16;
        this.f26393i = list;
        this.f26394j = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof F)) {
            return false;
        }
        F f10 = (F) obj;
        return m.b(this.f26385a, f10.f26385a) && this.f26386b == f10.f26386b && this.f26387c == f10.f26387c && this.f26388d == f10.f26388d && this.f26389e == f10.f26389e && this.f26390f == f10.f26390f && this.f26391g == f10.f26391g && this.f26392h == f10.f26392h && m.b(this.f26393i, f10.f26393i) && m.b(this.f26394j, f10.f26394j);
    }

    public final int hashCode() {
        return this.f26394j.hashCode() + b.d(b.b(this.f26392h, b.b(this.f26391g, b.b(this.f26390f, b.b(this.f26389e, b.b(this.f26388d, b.b(this.f26387c, b.b(this.f26386b, this.f26385a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31, this.f26393i);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new h(this);
    }
}
