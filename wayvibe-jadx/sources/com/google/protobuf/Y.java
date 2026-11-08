package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator f18709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer f18710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f18714f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f18715g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18716h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f18717i;

    public final boolean b() {
        this.f18712d++;
        Iterator it = this.f18709a;
        if (!it.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) it.next();
        this.f18710b = byteBuffer;
        this.f18713e = byteBuffer.position();
        if (this.f18710b.hasArray()) {
            this.f18714f = true;
            this.f18715g = this.f18710b.array();
            this.f18716h = this.f18710b.arrayOffset();
            return true;
        }
        this.f18714f = false;
        this.f18717i = Y0.f18720c.j(Y0.f18724g, this.f18710b);
        this.f18715g = null;
        return true;
    }

    public final void c(int i10) {
        int i11 = this.f18713e + i10;
        this.f18713e = i11;
        if (i11 == this.f18710b.limit()) {
            b();
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f18712d == this.f18711c) {
            return -1;
        }
        if (this.f18714f) {
            int i10 = this.f18715g[this.f18713e + this.f18716h] & ForkServer.ERROR;
            c(1);
            return i10;
        }
        int iE = Y0.f18720c.e(((long) this.f18713e) + this.f18717i) & ForkServer.ERROR;
        c(1);
        return iE;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        if (this.f18712d == this.f18711c) {
            return -1;
        }
        int iLimit = this.f18710b.limit();
        int i12 = this.f18713e;
        int i13 = iLimit - i12;
        if (i11 > i13) {
            i11 = i13;
        }
        if (this.f18714f) {
            System.arraycopy(this.f18715g, i12 + this.f18716h, bArr, i10, i11);
            c(i11);
            return i11;
        }
        int iPosition = this.f18710b.position();
        this.f18710b.position(this.f18713e);
        this.f18710b.get(bArr, i10, i11);
        this.f18710b.position(iPosition);
        c(i11);
        return i11;
    }
}
