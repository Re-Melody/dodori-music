package p185r4;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.m;
import p092i4.f;
import p134m1.b;
import p167p4.a;

/* JADX INFO: loaded from: classes.dex */
public final class o extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f25962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f25963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f25964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f25965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f25966e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f25967f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f25968g;

    public o(Drawable drawable, i iVar, f fVar, a aVar, String str, boolean z10, boolean z11) {
        this.f25962a = drawable;
        this.f25963b = iVar;
        this.f25964c = fVar;
        this.f25965d = aVar;
        this.f25966e = str;
        this.f25967f = z10;
        this.f25968g = z11;
    }

    @Override // p185r4.j
    public final Drawable a() {
        return this.f25962a;
    }

    @Override // p185r4.j
    public final i b() {
        return this.f25963b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (m.b(this.f25962a, oVar.f25962a)) {
            return m.b(this.f25963b, oVar.f25963b) && this.f25964c == oVar.f25964c && m.b(this.f25965d, oVar.f25965d) && m.b(this.f25966e, oVar.f25966e) && this.f25967f == oVar.f25967f && this.f25968g == oVar.f25968g;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f25964c.hashCode() + ((this.f25963b.hashCode() + (this.f25962a.hashCode() * 31)) * 31)) * 31;
        a aVar = this.f25965d;
        int iHashCode2 = (iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str = this.f25966e;
        return Boolean.hashCode(this.f25968g) + b.f((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f25967f);
    }

    public /* synthetic */ o(Drawable drawable, i iVar, f fVar) {
        this(drawable, iVar, fVar, null, null, false, false);
    }
}
