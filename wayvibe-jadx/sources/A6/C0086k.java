package A6;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: A6.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0086k extends C0081f implements SortedMap {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SortedSet f381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ S f382f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0086k(S s8, SortedMap sortedMap) {
        super(s8, sortedMap);
        this.f382f = s8;
    }

    public SortedSet b() {
        return new C0087l(this.f382f, d());
    }

    @Override // A6.C0081f, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f381e;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetB = b();
        this.f381e = sortedSetB;
        return sortedSetB;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.f371c;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new C0086k(this.f382f, d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new C0086k(this.f382f, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new C0086k(this.f382f, d().tailMap(obj));
    }
}
