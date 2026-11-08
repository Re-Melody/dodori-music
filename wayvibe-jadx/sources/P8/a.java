package P8;

import java.util.Comparator;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f9769b = new a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f9770c = new a(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9771a;

    public /* synthetic */ a(int i10) {
        this.f9771a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f9771a) {
            case 0:
                Comparable a10 = (Comparable) obj;
                Comparable b10 = (Comparable) obj2;
                m.f(a10, "a");
                m.f(b10, "b");
                return a10.compareTo(b10);
            default:
                Comparable a11 = (Comparable) obj;
                Comparable b11 = (Comparable) obj2;
                m.f(a11, "a");
                m.f(b11, "b");
                return b11.compareTo(a11);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.f9771a) {
            case 0:
                return f9770c;
            default:
                return f9769b;
        }
    }
}
