package p064f9;

import java.util.Iterator;
import p046da.b;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements Iterable, p013a9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f19885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f19886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19887c = 1;

    public a(char c3, char c9) {
        this.f19885a = c3;
        this.f19886b = (char) b.E(c3, c9, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f19885a, this.f19886b, this.f19887c);
    }
}
