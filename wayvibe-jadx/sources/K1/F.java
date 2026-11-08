package K1;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class F extends H {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7238e;

    public F(int i10, Class cls, int i11, int i12, int i13) {
        this.f7238e = i13;
        this.f7240a = i10;
        this.f7243d = cls;
        this.f7242c = i11;
        this.f7241b = i12;
    }

    @Override // K1.H
    public final Object c(View view) {
        switch (this.f7238e) {
            case 0:
                return Boolean.valueOf(N.c(view));
            case 1:
                return N.a(view);
            case 2:
                return P.b(view);
            default:
                return Boolean.valueOf(N.b(view));
        }
    }

    @Override // K1.H
    public final void d(View view, Object obj) {
        switch (this.f7238e) {
            case 0:
                N.f(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                N.e(view, (CharSequence) obj);
                break;
            case 2:
                P.c(view, (CharSequence) obj);
                break;
            default:
                N.d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // K1.H
    public final boolean h(Object obj, Object obj2) {
        switch (this.f7238e) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            case 2:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
    }
}
