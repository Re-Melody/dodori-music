package p185r4;

import kotlin.jvm.internal.m;
import p195s4.f;
import p195s4.h;
import p214u4.e;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f25895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f25896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f25897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p195s4.d f25898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f25899e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f25900f;

    public d(h hVar, f fVar, e eVar, p195s4.d dVar, b bVar, b bVar2) {
        this.f25895a = hVar;
        this.f25896b = fVar;
        this.f25897c = eVar;
        this.f25898d = dVar;
        this.f25899e = bVar;
        this.f25900f = bVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        dVar.getClass();
        return m.b(this.f25895a, dVar.f25895a) && this.f25896b == dVar.f25896b && m.b(this.f25897c, dVar.f25897c) && this.f25898d == dVar.f25898d && this.f25899e == dVar.f25899e && this.f25900f == dVar.f25900f;
    }

    public final int hashCode() {
        h hVar = this.f25895a;
        int iHashCode = (hVar != null ? hVar.hashCode() : 0) * 31;
        f fVar = this.f25896b;
        int iHashCode2 = (iHashCode + (fVar != null ? fVar.hashCode() : 0)) * 28629151;
        e eVar = this.f25897c;
        int iHashCode3 = (iHashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        p195s4.d dVar = this.f25898d;
        int iHashCode4 = (iHashCode3 + (dVar != null ? dVar.hashCode() : 0)) * 923521;
        b bVar = this.f25899e;
        int iHashCode5 = (iHashCode4 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        b bVar2 = this.f25900f;
        return (iHashCode5 + (bVar2 != null ? bVar2.hashCode() : 0)) * 31;
    }
}
