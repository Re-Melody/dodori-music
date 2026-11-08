package s7;

import com.google.protobuf.AbstractC1252l;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1252l f26238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f26239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p044d7.e f26240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p044d7.e f26241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p044d7.e f26242e;

    public u(AbstractC1252l abstractC1252l, boolean z10, p044d7.e eVar, p044d7.e eVar2, p044d7.e eVar3) {
        this.f26238a = abstractC1252l;
        this.f26239b = z10;
        this.f26240c = eVar;
        this.f26241d = eVar2;
        this.f26242e = eVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f26239b == uVar.f26239b && this.f26238a.equals(uVar.f26238a) && this.f26240c.equals(uVar.f26240c) && this.f26241d.equals(uVar.f26241d)) {
            return this.f26242e.equals(uVar.f26242e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f26242e.f19303a.hashCode() + ((this.f26241d.f19303a.hashCode() + ((this.f26240c.f19303a.hashCode() + (((this.f26238a.hashCode() * 31) + (this.f26239b ? 1 : 0)) * 31)) * 31)) * 31);
    }
}
