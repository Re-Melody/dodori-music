package p148n5;

import android.content.Context;
import p225v5.a;

/* JADX INFO: loaded from: classes.dex */
public final class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f22956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f22957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f22958d;

    public b(Context context, a aVar, a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f22955a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f22956b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f22957c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f22958d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f22955a.equals(((b) dVar).f22955a)) {
                b bVar = (b) dVar;
                if (this.f22956b.equals(bVar.f22956b) && this.f22957c.equals(bVar.f22957c) && this.f22958d.equals(bVar.f22958d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f22955a.hashCode() ^ 1000003) * 1000003) ^ this.f22956b.hashCode()) * 1000003) ^ this.f22957c.hashCode()) * 1000003) ^ this.f22958d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f22955a);
        sb.append(", wallClock=");
        sb.append(this.f22956b);
        sb.append(", monotonicClock=");
        sb.append(this.f22957c);
        sb.append(", backendName=");
        return p134m1.b.m(sb, this.f22958d, "}");
    }
}
