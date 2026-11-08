package p140m7;

import java.util.ArrayList;
import p044d7.e;
import p170p7.i;

/* JADX INFO: loaded from: classes.dex */
public final class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f22436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f22437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f22438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f22439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f22440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f22441f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f22442g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f22443h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f22444i;

    public V(F f10, i iVar, i iVar2, ArrayList arrayList, boolean z10, e eVar, boolean z11, boolean z12, boolean z13) {
        this.f22436a = f10;
        this.f22437b = iVar;
        this.f22438c = iVar2;
        this.f22439d = arrayList;
        this.f22440e = z10;
        this.f22441f = eVar;
        this.f22442g = z11;
        this.f22443h = z12;
        this.f22444i = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V)) {
            return false;
        }
        V v3 = (V) obj;
        if (this.f22440e == v3.f22440e && this.f22442g == v3.f22442g && this.f22443h == v3.f22443h && this.f22436a.equals(v3.f22436a) && this.f22441f.equals(v3.f22441f) && this.f22437b.equals(v3.f22437b) && this.f22438c.equals(v3.f22438c) && this.f22444i == v3.f22444i) {
            return this.f22439d.equals(v3.f22439d);
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f22441f.f19303a.hashCode() + ((this.f22439d.hashCode() + ((this.f22438c.hashCode() + ((this.f22437b.hashCode() + (this.f22436a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + (this.f22440e ? 1 : 0)) * 31) + (this.f22442g ? 1 : 0)) * 31) + (this.f22443h ? 1 : 0)) * 31) + (this.f22444i ? 1 : 0);
    }

    public final String toString() {
        return "ViewSnapshot(" + this.f22436a + ", " + this.f22437b + ", " + this.f22438c + ", " + this.f22439d + ", isFromCache=" + this.f22440e + ", mutatedKeys=" + this.f22441f.f19303a.size() + ", didSyncStateChange=" + this.f22442g + ", excludesMetadataChanges=" + this.f22443h + ", hasCachedResults=" + this.f22444i + ")";
    }
}
