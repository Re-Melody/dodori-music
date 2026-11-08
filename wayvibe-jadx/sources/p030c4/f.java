package p030c4;

import N8.s;
import V3.a;
import V3.i;
import V3.j;
import Z3.b;
import Z3.c;
import Z3.l;
import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f15889b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f15890a;

    public f() {
        j verificationMode = j.QUIET;
        m.f(verificationMode, "verificationMode");
        this.f15890a = verificationMode;
    }

    public static boolean a(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (m.b(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return m.b(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public static boolean b(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list.size() == list2.size()) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (a((SidecarDisplayFeature) list.get(i10), (SidecarDisplayFeature) list2.get(i10))) {
                }
            }
            return true;
        }
        return false;
    }

    public final l c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        if (sidecarWindowLayoutInfo == null) {
            return new l(s.f8650a);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        a.d(sidecarDeviceState2, a.b(sidecarDeviceState));
        return new l(d(a.c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    public final ArrayList d(List list, SidecarDeviceState sidecarDeviceState) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c cVarE = e((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (cVarE != null) {
                arrayList.add(cVarE);
            }
        }
        return arrayList;
    }

    public final c e(SidecarDisplayFeature feature, SidecarDeviceState sidecarDeviceState) {
        b bVar;
        b bVar2;
        m.f(feature, "feature");
        SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) new i(feature, this.f15890a, a.f12547a).M("Type must be either TYPE_FOLD or TYPE_HINGE", b.f15885a).M("Feature bounds must not be 0", c.f15886a).M("TYPE_FOLD must have 0 area", d.f15887a).M("Feature be pinned to either left or top", e.f15888a).i();
        if (sidecarDisplayFeature == null) {
            return null;
        }
        int type = sidecarDisplayFeature.getType();
        if (type == 1) {
            bVar = b.f13613i;
        } else {
            if (type != 2) {
                return null;
            }
            bVar = b.f13614j;
        }
        int iB = a.b(sidecarDeviceState);
        if (iB == 0 || iB == 1) {
            return null;
        }
        if (iB != 2) {
            bVar2 = b.f13611g;
            if (iB != 3 && iB == 4) {
                return null;
            }
        } else {
            bVar2 = b.f13612h;
        }
        Rect rect = feature.getRect();
        m.e(rect, "feature.rect");
        return new c(new V3.b(rect), bVar, bVar2);
    }
}
