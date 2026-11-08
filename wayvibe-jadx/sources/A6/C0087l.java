package A6;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: A6.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0087l extends C0082g implements SortedSet {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ S f383c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0087l(S s8, SortedMap sortedMap) {
        super(s8, sortedMap);
        this.f383c = s8;
    }

    public SortedMap a() {
        return (SortedMap) this.f375a;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return a().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return a().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new C0087l(this.f383c, a().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return a().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new C0087l(this.f383c, a().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new C0087l(this.f383c, a().tailMap(obj));
    }
}
