package p097i9;

import N8.e;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f20581a;

    public g(h hVar) {
        this.f20581a = hVar;
    }

    @Override // N8.AbstractC0644a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof String) {
            return super.contains((String) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        String strGroup = this.f20581a.f20582a.group(i10);
        return strGroup == null ? "" : strGroup;
    }

    @Override // N8.e, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof String) {
            return super.indexOf((String) obj);
        }
        return -1;
    }

    @Override // N8.AbstractC0644a
    public final int k() {
        return this.f20581a.f20582a.groupCount() + 1;
    }

    @Override // N8.e, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof String) {
            return super.lastIndexOf((String) obj);
        }
        return -1;
    }
}
