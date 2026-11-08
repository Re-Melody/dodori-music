package p185r4;

import android.graphics.Bitmap;
import p119k9.AbstractC2040y;
import p119k9.O;
import p134m1.b;
import p195s4.d;
import p224v4.g;
import p9.m;
import r9.e;
import r9.f;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC2040y f25885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC2040y f25886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC2040y f25887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC2040y f25888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p214u4.c f25889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f25890f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bitmap.Config f25891g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f25892h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f25893i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f25894j;
    public final b k;

    public c() {
        f fVar = O.f21697a;
        p131l9.d dVar = m.f25335a.f22114f;
        e eVar = e.f26007c;
        p214u4.c cVar = p214u4.e.f27223a;
        d dVar2 = d.AUTOMATIC;
        Bitmap.Config config = g.f27511b;
        b bVar = b.ENABLED;
        this.f25885a = dVar;
        this.f25886b = eVar;
        this.f25887c = eVar;
        this.f25888d = eVar;
        this.f25889e = cVar;
        this.f25890f = dVar2;
        this.f25891g = config;
        this.f25892h = true;
        this.f25893i = bVar;
        this.f25894j = bVar;
        this.k = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.m.b(this.f25885a, cVar.f25885a) && kotlin.jvm.internal.m.b(this.f25886b, cVar.f25886b) && kotlin.jvm.internal.m.b(this.f25887c, cVar.f25887c) && kotlin.jvm.internal.m.b(this.f25888d, cVar.f25888d) && kotlin.jvm.internal.m.b(this.f25889e, cVar.f25889e) && this.f25890f == cVar.f25890f && this.f25891g == cVar.f25891g && this.f25892h == cVar.f25892h && this.f25893i == cVar.f25893i && this.f25894j == cVar.f25894j && this.k == cVar.k;
    }

    public final int hashCode() {
        int iHashCode = (this.f25888d.hashCode() + ((this.f25887c.hashCode() + ((this.f25886b.hashCode() + (this.f25885a.hashCode() * 31)) * 31)) * 31)) * 31;
        this.f25889e.getClass();
        return this.k.hashCode() + ((this.f25894j.hashCode() + ((this.f25893i.hashCode() + b.f(b.f((this.f25891g.hashCode() + ((this.f25890f.hashCode() + ((p214u4.c.class.hashCode() + iHashCode) * 31)) * 31)) * 31, 31, this.f25892h), 923521, false)) * 31)) * 31);
    }
}
