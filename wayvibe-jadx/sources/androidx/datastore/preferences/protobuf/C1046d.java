package androidx.datastore.preferences.protobuf;

import com.google.crypto.tink.shaded.protobuf.C1187h;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1046d implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15073a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15074b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15076d;

    public C1046d(C1049g c1049g) {
        this.f15076d = c1049g;
        this.f15075c = c1049g.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f15073a) {
            case 0:
                return this.f15074b < this.f15075c;
            default:
                return this.f15074b < this.f15075c;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f15073a) {
            case 0:
                int i10 = this.f15074b;
                if (i10 >= this.f15075c) {
                    throw new NoSuchElementException();
                }
                this.f15074b = i10 + 1;
                return Byte.valueOf(((C1049g) this.f15076d).m(i10));
            default:
                int i11 = this.f15074b;
                if (i11 >= this.f15075c) {
                    throw new NoSuchElementException();
                }
                this.f15074b = i11 + 1;
                return Byte.valueOf(((C1187h) this.f15076d).n(i11));
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f15073a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public C1046d(C1187h c1187h) {
        this.f15076d = c1187h;
        this.f15075c = c1187h.size();
    }
}
