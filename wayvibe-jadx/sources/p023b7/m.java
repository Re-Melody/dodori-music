package p023b7;

import p227v7.b;

/* JADX INFO: loaded from: classes.dex */
public final class m implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f15799c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f15800a = f15799c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile b f15801b;

    public m(b bVar) {
        this.f15801b = bVar;
    }

    @Override // p227v7.b
    public final Object get() {
        Object obj;
        Object obj2 = this.f15800a;
        Object obj3 = f15799c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f15800a;
                if (obj == obj3) {
                    obj = this.f15801b.get();
                    this.f15800a = obj;
                    this.f15801b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
