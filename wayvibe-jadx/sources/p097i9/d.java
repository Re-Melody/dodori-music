package p097i9;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.m;
import p013a9.a;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements Iterator, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20578e;

    public d(String string) {
        m.f(string, "string");
        this.f20574a = string;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10;
        int i11;
        int i12 = this.f20575b;
        if (i12 != 0) {
            return i12 == 1;
        }
        if (this.f20578e < 0) {
            this.f20575b = 2;
            return false;
        }
        String str = this.f20574a;
        int length = str.length();
        int length2 = str.length();
        for (int i13 = this.f20576c; i13 < length2; i13++) {
            char cCharAt = str.charAt(i13);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i10 = (cCharAt == '\r' && (i11 = i13 + 1) < str.length() && str.charAt(i11) == '\n') ? 2 : 1;
                length = i13;
                this.f20575b = 1;
                this.f20578e = i10;
                this.f20577d = length;
                return true;
            }
        }
        i10 = -1;
        this.f20575b = 1;
        this.f20578e = i10;
        this.f20577d = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f20575b = 0;
        int i10 = this.f20577d;
        int i11 = this.f20576c;
        this.f20576c = this.f20578e + i10;
        return this.f20574a.subSequence(i11, i10).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
