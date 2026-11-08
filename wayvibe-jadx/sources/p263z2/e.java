package p263z2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public abstract class e implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f29810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f29811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f29812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f29813e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ByteBuffer f29814f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f29815g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f29816h;

    public e() {
        ByteBuffer byteBuffer = d.f29809a;
        this.f29814f = byteBuffer;
        this.f29815g = byteBuffer;
        b bVar = b.f29804e;
        this.f29812d = bVar;
        this.f29813e = bVar;
        this.f29810b = bVar;
        this.f29811c = bVar;
    }

    @Override // p263z2.d
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f29815g;
        this.f29815g = d.f29809a;
        return byteBuffer;
    }

    @Override // p263z2.d
    public final b c(b bVar) {
        this.f29812d = bVar;
        this.f29813e = f(bVar);
        return isActive() ? this.f29813e : b.f29804e;
    }

    @Override // p263z2.d
    public final void d() {
        this.f29816h = true;
        h();
    }

    @Override // p263z2.d
    public boolean e() {
        return this.f29816h && this.f29815g == d.f29809a;
    }

    public abstract b f(b bVar);

    @Override // p263z2.d
    public final void flush() {
        this.f29815g = d.f29809a;
        this.f29816h = false;
        this.f29810b = this.f29812d;
        this.f29811c = this.f29813e;
        g();
    }

    @Override // p263z2.d
    public boolean isActive() {
        return this.f29813e != b.f29804e;
    }

    public final ByteBuffer j(int i10) {
        if (this.f29814f.capacity() < i10) {
            this.f29814f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f29814f.clear();
        }
        ByteBuffer byteBuffer = this.f29814f;
        this.f29815g = byteBuffer;
        return byteBuffer;
    }

    @Override // p263z2.d
    public final void k() {
        flush();
        this.f29814f = d.f29809a;
        b bVar = b.f29804e;
        this.f29812d = bVar;
        this.f29813e = bVar;
        this.f29810b = bVar;
        this.f29811c = bVar;
        i();
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }
}
