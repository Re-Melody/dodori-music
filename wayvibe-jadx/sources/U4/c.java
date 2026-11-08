package U4;

import android.location.Location;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c implements N4.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f12186a;

    public c(int i10, ArrayList arrayList) {
        switch (i10) {
            case 1:
                this.f12186a = Collections.unmodifiableList(arrayList);
                break;
            default:
                this.f12186a = Collections.unmodifiableList(arrayList);
                break;
        }
    }

    public static c c(Location location) {
        ArrayList arrayList = new ArrayList();
        if (location != null) {
            arrayList.add(location);
        }
        return new c(1, arrayList);
    }

    @Override // N4.d
    public int a(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // N4.d
    public int b() {
        return 1;
    }

    public Location d() {
        List list = this.f12186a;
        if (list.isEmpty()) {
            return null;
        }
        return (Location) list.get(0);
    }

    @Override // N4.d
    public long a(int i10) {
        X4.a.k(i10 == 0);
        return 0L;
    }

    @Override // N4.d
    public List b(long j10) {
        return j10 >= 0 ? this.f12186a : Collections.EMPTY_LIST;
    }
}
