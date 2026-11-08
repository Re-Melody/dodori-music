package p211u1;

import android.content.Context;
import android.graphics.Canvas;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Arrays;
import java.util.HashMap;
import p201t1.a;
import p201t1.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f27027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f27029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f27030d;

    private void setIds(String str) {
        if (str == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i10);
            if (iIndexOf == -1) {
                a(str.substring(i10));
                return;
            } else {
                a(str.substring(i10, iIndexOf));
                i10 = iIndexOf + 1;
            }
        }
    }

    public final void a(String str) {
        Context context;
        int iIntValue;
        Object obj;
        if (str == null || (context = this.f27029c) == null) {
            return;
        }
        String strTrim = str.trim();
        try {
            iIntValue = h.class.getField(strTrim).getInt(null);
        } catch (Exception unused) {
            iIntValue = 0;
        }
        if (iIntValue == 0) {
            iIntValue = context.getResources().getIdentifier(strTrim, DiagnosticsEntry.ID_KEY, context.getPackageName());
        }
        if (iIntValue == 0 && isInEditMode() && (getParent() instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            if (strTrim != null) {
                HashMap map = constraintLayout.f14862m;
                if (map != null && map.containsKey(strTrim)) {
                    obj = constraintLayout.f14862m.get(strTrim);
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            } else {
                constraintLayout.getClass();
            }
            obj = null;
            if (obj != null) {
                iIntValue = ((Integer) obj).intValue();
            }
        }
        if (iIntValue != 0) {
            setTag(iIntValue, null);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
    }

    public final void b(ConstraintLayout constraintLayout) {
        if (isInEditMode()) {
            setIds(null);
        }
        a aVar = this.f27030d;
        if (aVar == null) {
            return;
        }
        aVar.f26548j0 = 0;
        for (int i10 = 0; i10 < this.f27028b; i10++) {
            View view = (View) constraintLayout.f14851a.get(this.f27027a[i10]);
            if (view != null) {
                a aVar2 = this.f27030d;
                i iVarC = constraintLayout.c(view);
                int i11 = aVar2.f26548j0 + 1;
                i[] iVarArr = aVar2.f26547i0;
                if (i11 > iVarArr.length) {
                    aVar2.f26547i0 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
                }
                i[] iVarArr2 = aVar2.f26547i0;
                int i12 = aVar2.f26548j0;
                iVarArr2[i12] = iVarC;
                aVar2.f26548j0 = i12 + 1;
            }
        }
    }

    public final void c() {
        if (this.f27030d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof d) {
            ((d) layoutParams).f27077j0 = this.f27030d;
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f27027a, this.f27028b);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setReferencedIds(int[] iArr) {
        this.f27028b = 0;
        for (int i10 : iArr) {
            setTag(i10, null);
        }
    }

    @Override // android.view.View
    public final void setTag(int i10, Object obj) {
        int i11 = this.f27028b + 1;
        int[] iArr = this.f27027a;
        if (i11 > iArr.length) {
            this.f27027a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f27027a;
        int i12 = this.f27028b;
        iArr2[i12] = i10;
        this.f27028b = i12 + 1;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }
}
