package M0;

import M8.D;
import M8.InterfaceC0643e;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.n implements Z8.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f8063b = new q(2, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f8064c = new q(2, 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q f8065d = new q(2, 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final q f8066e = new q(2, 3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q f8067f = new q(2, 4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final q f8068g = new q(2, 5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final q f8069h = new q(2, 6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final q f8070i = new q(2, 7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final q f8071j = new q(2, 8);
    public static final q k = new q(2, 9);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final q f8072l = new q(2, 10);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final q f8073m = new q(2, 11);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8074a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i10, int i11) {
        super(i10);
        this.f8074a = i11;
    }

    @Override // Z8.e
    public final Object invoke(Object obj, Object obj2) {
        String str;
        InterfaceC0643e interfaceC0643e;
        switch (this.f8074a) {
            case 0:
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list == null) {
                    return list2;
                }
                ArrayList arrayListY0 = N8.n.Y0(list);
                arrayListY0.addAll(list2);
                return arrayListY0;
            case 1:
                return (D) obj;
            case 2:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 3:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case 4:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 5:
                g gVar = (g) obj;
                int i10 = ((g) obj2).f8019a;
                return gVar;
            case 6:
                return (String) obj;
            case 7:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                if (list3 == null) {
                    return list4;
                }
                ArrayList arrayListY1 = N8.n.Y0(list3);
                arrayListY1.addAll(list4);
                return arrayListY1;
            case 8:
                Float f10 = (Float) obj;
                ((Number) obj2).floatValue();
                return f10;
            case 9:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case 10:
                a aVar = (a) obj;
                a aVar2 = (a) obj2;
                if (aVar == null || (str = aVar.f8010a) == null) {
                    str = aVar2.f8010a;
                }
                if (aVar == null || (interfaceC0643e = aVar.f8011b) == null) {
                    interfaceC0643e = aVar2.f8011b;
                }
                return new a(str, interfaceC0643e);
            default:
                return obj == null ? obj2 : obj;
        }
    }
}
