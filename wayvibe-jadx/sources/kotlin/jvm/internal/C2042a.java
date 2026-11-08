package kotlin.jvm.internal;

import B2.AbstractC0112b;
import java.io.Serializable;

/* JADX INFO: renamed from: kotlin.jvm.internal.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2042a implements h, Serializable {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private final String signature;

    public C2042a(int i10, int i11, Class cls, Object obj, String str, String str2) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = (i11 & 1) == 1;
        this.arity = i10;
        this.flags = i11 >> 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2042a)) {
            return false;
        }
        C2042a c2042a = (C2042a) obj;
        return this.isTopLevel == c2042a.isTopLevel && this.arity == c2042a.arity && this.flags == c2042a.flags && m.b(this.receiver, c2042a.receiver) && m.b(this.owner, c2042a.owner) && this.name.equals(c2042a.name) && this.signature.equals(c2042a.signature);
    }

    @Override // kotlin.jvm.internal.h
    public int getArity() {
        return this.arity;
    }

    public p075g9.d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return z.a(cls);
        }
        z.f21874a.getClass();
        return new r(cls);
    }

    public int hashCode() {
        Object obj = this.receiver;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.owner;
        return ((((AbstractC0112b.a(AbstractC0112b.a((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31, 31, this.name), 31, this.signature) + (this.isTopLevel ? 1231 : 1237)) * 31) + this.arity) * 31) + this.flags;
    }

    public String toString() {
        z.f21874a.getClass();
        return A.a(this);
    }
}
