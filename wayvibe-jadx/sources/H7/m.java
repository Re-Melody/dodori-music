package H7;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes.dex */
public final class m implements E7.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6192b;

    public /* synthetic */ m(Object obj, int i10) {
        this.f6191a = i10;
        this.f6192b = obj;
    }

    @Override // E7.z
    public final E7.y create(E7.l lVar, L7.a aVar) {
        switch (this.f6191a) {
            case 0:
                if (aVar.f7909a == Number.class) {
                    return (o) this.f6192b;
                }
                return null;
            case 1:
                if (aVar.f7909a == Object.class) {
                    return new q(lVar, (E7.x) this.f6192b);
                }
                return null;
            default:
                Class cls = aVar.f7909a;
                if (cls == Calendar.class || cls == GregorianCalendar.class) {
                    return (E7.i) this.f6192b;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f6191a) {
            case 2:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((E7.i) this.f6192b) + "]";
            default:
                return super.toString();
        }
    }
}
