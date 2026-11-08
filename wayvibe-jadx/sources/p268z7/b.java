package p268z7;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f29896b;

    public b(Set set, c cVar) {
        this.f29895a = b(set);
        this.f29896b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb.append(aVar.f29893a);
            sb.append('/');
            sb.append(aVar.f29894b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String a() {
        Set setUnmodifiableSet;
        Set setUnmodifiableSet2;
        c cVar = this.f29896b;
        synchronized (((HashSet) cVar.f29899b)) {
            setUnmodifiableSet = Collections.unmodifiableSet((HashSet) cVar.f29899b);
        }
        boolean zIsEmpty = setUnmodifiableSet.isEmpty();
        String str = this.f29895a;
        if (zIsEmpty) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        synchronized (((HashSet) cVar.f29899b)) {
            setUnmodifiableSet2 = Collections.unmodifiableSet((HashSet) cVar.f29899b);
        }
        sb.append(b(setUnmodifiableSet2));
        return sb.toString();
    }
}
