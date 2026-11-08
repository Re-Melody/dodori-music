package X8;

import G0.C0480j1;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements Iterator, p013a9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f13279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0480j1 f13281c;

    public m(C0480j1 c0480j1) {
        this.f13281c = c0480j1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws IOException {
        if (this.f13279a == null && !this.f13280b) {
            String line = ((BufferedReader) this.f13281c.f5241b).readLine();
            this.f13279a = line;
            if (line == null) {
                this.f13280b = true;
            }
        }
        return this.f13279a != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String str = this.f13279a;
        this.f13279a = null;
        kotlin.jvm.internal.m.c(str);
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
