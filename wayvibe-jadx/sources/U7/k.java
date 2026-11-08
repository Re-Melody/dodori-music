package U7;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p161o8.r;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p223v2.o f12303b;

    public /* synthetic */ k(p223v2.o oVar, int i10) {
        this.f12302a = i10;
        this.f12303b = oVar;
    }

    @Override // p161o8.r
    public final void b(Object obj) {
        switch (this.f12302a) {
            case 0:
                List list = (List) ((Map) obj).get("children");
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(n.c((Map) it.next()));
                }
                this.f12303b.e(arrayList);
                break;
            case 1:
                Map map = (Map) ((Map) obj).get("mediaItem");
                p223v2.o oVar = this.f12303b;
                if (map == null) {
                    oVar.e(null);
                } else {
                    oVar.e(n.c(map));
                }
                break;
            default:
                List list2 = (List) ((Map) obj).get("mediaItems");
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(n.c((Map) it2.next()));
                }
                ((p223v2.h) this.f12303b).e(arrayList2);
                break;
        }
    }

    @Override // p161o8.r
    public final void c() {
        switch (this.f12302a) {
            case 0:
                this.f12303b.d(new Bundle());
                throw null;
            case 1:
                this.f12303b.d(new Bundle());
                throw null;
            default:
                ((p223v2.h) this.f12303b).d(new Bundle());
                throw null;
        }
    }

    @Override // p161o8.r
    public final void d(Object obj, String str, String str2) {
        switch (this.f12302a) {
            case 0:
                this.f12303b.d(new Bundle());
                throw null;
            case 1:
                this.f12303b.d(new Bundle());
                throw null;
            default:
                ((p223v2.h) this.f12303b).d(new Bundle());
                throw null;
        }
    }
}
