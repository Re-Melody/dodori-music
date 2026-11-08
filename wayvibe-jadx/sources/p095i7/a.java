package p095i7;

/* JADX INFO: loaded from: classes.dex */
public final class a implements d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f20532d;

    public a(int i10, c cVar) {
        this.f20531c = i10;
        this.f20532d = cVar;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return d.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        a aVar = (a) ((d) obj);
        return this.f20531c == aVar.f20531c && this.f20532d.equals(aVar.f20532d);
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.f20531c) + (this.f20532d.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f20531c + "intEncoding=" + this.f20532d + ')';
    }
}
