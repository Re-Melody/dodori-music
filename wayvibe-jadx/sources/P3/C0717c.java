package P3;

import K1.T;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: P3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0717c extends Property {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9555a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0717c(Class cls, String str, int i10) {
        super(cls, str);
        this.f9555a = i10;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f9555a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(A.f9530a.w((View) obj));
            case 6:
                WeakHashMap weakHashMap = T.f7251a;
                return ((View) obj).getClipBounds();
            default:
                return Float.valueOf(((SwitchCompat) obj).f14568z);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f9555a) {
            case 0:
                C0720f c0720f = (C0720f) obj;
                PointF pointF = (PointF) obj2;
                c0720f.getClass();
                c0720f.f9558a = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                c0720f.f9559b = iRound;
                int i10 = c0720f.f9563f + 1;
                c0720f.f9563f = i10;
                if (i10 == c0720f.f9564g) {
                    A.a(c0720f.f9562e, c0720f.f9558a, iRound, c0720f.f9560c, c0720f.f9561d);
                    c0720f.f9563f = 0;
                    c0720f.f9564g = 0;
                }
                break;
            case 1:
                C0720f c0720f2 = (C0720f) obj;
                PointF pointF2 = (PointF) obj2;
                c0720f2.getClass();
                c0720f2.f9560c = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                c0720f2.f9561d = iRound2;
                int i11 = c0720f2.f9564g + 1;
                c0720f2.f9564g = i11;
                if (c0720f2.f9563f == i11) {
                    A.a(c0720f2.f9562e, c0720f2.f9558a, c0720f2.f9559b, c0720f2.f9560c, iRound2);
                    c0720f2.f9563f = 0;
                    c0720f2.f9564g = 0;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                A.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                A.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound3 = Math.round(pointF5.x);
                int iRound4 = Math.round(pointF5.y);
                A.a(view3, iRound3, iRound4, view3.getWidth() + iRound3, view3.getHeight() + iRound4);
                break;
            case 5:
                float fFloatValue = ((Float) obj2).floatValue();
                A.f9530a.Q((View) obj, fFloatValue);
                break;
            case 6:
                WeakHashMap weakHashMap = T.f7251a;
                ((View) obj).setClipBounds((Rect) obj2);
                break;
            default:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                break;
        }
    }
}
