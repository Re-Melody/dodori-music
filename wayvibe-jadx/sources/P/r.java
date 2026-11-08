package P;

import D7.W;
import android.content.Context;
import android.view.ViewGroup;
import app.nagakiba.wayvibe.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class r extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f9434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f9435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ua.c f9436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9437e;

    public r(Context context) {
        super(context);
        this.f9433a = 5;
        ArrayList arrayList = new ArrayList();
        this.f9434b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f9435c = arrayList2;
        this.f9436d = new ua.c(24, (byte) 0);
        setClipChildren(false);
        t tVar = new t(context);
        addView(tVar);
        arrayList.add(tVar);
        arrayList2.add(tVar);
        this.f9437e = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final t a(s sVar) {
        ua.c cVar = this.f9436d;
        t tVar = (t) ((LinkedHashMap) cVar.f27294b).get(sVar);
        if (tVar != null) {
            return tVar;
        }
        ArrayList arrayList = this.f9435c;
        kotlin.jvm.internal.m.f(arrayList, "<this>");
        t tVar2 = (t) (arrayList.isEmpty() ? null : arrayList.remove(0));
        LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.f27294b;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) cVar.f27295c;
        if (tVar2 == null) {
            int i10 = this.f9437e;
            ArrayList arrayList2 = this.f9434b;
            if (i10 > W.G(arrayList2)) {
                tVar2 = new t(getContext());
                addView(tVar2);
                arrayList2.add(tVar2);
            } else {
                tVar2 = (t) arrayList2.get(this.f9437e);
                s sVar2 = (s) linkedHashMap2.get(tVar2);
                if (sVar2 != null) {
                    sVar2.v();
                    t tVar3 = (t) linkedHashMap.get(sVar2);
                    if (tVar3 != null) {
                    }
                    linkedHashMap.remove(sVar2);
                    tVar2.c();
                }
            }
            int i11 = this.f9437e;
            if (i11 < this.f9433a - 1) {
                this.f9437e = i11 + 1;
            } else {
                this.f9437e = 0;
            }
        }
        linkedHashMap.put(sVar, tVar2);
        linkedHashMap2.put(tVar2, sVar);
        return tVar2;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
