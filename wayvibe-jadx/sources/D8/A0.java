package D8;

import B8.C0135w;
import java.net.SocketAddress;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class A0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f2187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2189c;

    public SocketAddress a() {
        if (c()) {
            return (SocketAddress) ((C0135w) this.f2187a.get(this.f2188b)).f890a.get(this.f2189c);
        }
        throw new IllegalStateException("Index is past the end of the address group list");
    }

    public boolean b() {
        if (c()) {
            C0135w c0135w = (C0135w) this.f2187a.get(this.f2188b);
            int i10 = this.f2189c + 1;
            this.f2189c = i10;
            if (i10 >= c0135w.f890a.size()) {
                int i11 = this.f2188b + 1;
                this.f2188b = i11;
                this.f2189c = 0;
                if (i11 < this.f2187a.size()) {
                }
            }
            return true;
        }
        return false;
    }

    public boolean c() {
        return this.f2188b < this.f2187a.size();
    }

    public void d() {
        this.f2188b = 0;
        this.f2189c = 0;
    }

    public boolean e(SocketAddress socketAddress) {
        for (int i10 = 0; i10 < this.f2187a.size(); i10++) {
            int iIndexOf = ((C0135w) this.f2187a.get(i10)).f890a.indexOf(socketAddress);
            if (iIndexOf != -1) {
                this.f2188b = i10;
                this.f2189c = iIndexOf;
                return true;
            }
        }
        return false;
    }
}
