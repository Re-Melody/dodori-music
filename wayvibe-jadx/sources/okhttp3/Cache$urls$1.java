package okhttp3;

import java.util.Iterator;
import p013a9.a;

/* JADX INFO: loaded from: classes2.dex */
public final class Cache$urls$1 implements Iterator<String>, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f23939a;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        this.f23939a = false;
        throw null;
    }

    @Override // java.util.Iterator
    public final String next() {
        this.f23939a = false;
        throw null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f23939a) {
            throw new IllegalStateException("remove() before next()");
        }
        throw null;
    }
}
