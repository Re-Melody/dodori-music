package p095i7;

import p062f7.b;
import p062f7.c;
import p062f7.g;

/* JADX INFO: loaded from: classes.dex */
public final class h implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f20545a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f20546b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f20547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f20548d;

    public h(f fVar) {
        this.f20548d = fVar;
    }

    @Override // p062f7.g
    public final g c(String str) {
        if (this.f20545a) {
            throw new b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f20545a = true;
        this.f20548d.e(this.f20547c, str, this.f20546b);
        return this;
    }

    @Override // p062f7.g
    public final g d(boolean z10) {
        if (this.f20545a) {
            throw new b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f20545a = true;
        this.f20548d.c(this.f20547c, z10 ? 1 : 0, this.f20546b);
        return this;
    }
}
