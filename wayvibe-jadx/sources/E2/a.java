package E2;

import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3017b;

    public static String d(int i10) {
        return "" + ((char) ((i10 >> 24) & ColorExtractionConstants.COLOR_COMPONENT_MASK)) + ((char) ((i10 >> 16) & ColorExtractionConstants.COLOR_COMPONENT_MASK)) + ((char) ((i10 >> 8) & ColorExtractionConstants.COLOR_COMPONENT_MASK)) + ((char) (i10 & ColorExtractionConstants.COLOR_COMPONENT_MASK));
    }

    public static int h(int i10) {
        return (i10 >> 24) & ColorExtractionConstants.COLOR_COMPONENT_MASK;
    }

    public void b(int i10) {
        this.f3017b = i10 | this.f3017b;
    }

    public boolean c(int i10) {
        return (this.f3017b & i10) == i10;
    }

    public boolean e(int i10) {
        return (this.f3017b & i10) == i10;
    }

    public String toString() {
        switch (this.f3016a) {
            case 1:
                return d(this.f3017b);
            default:
                return super.toString();
        }
    }

    public a(int i10) {
        this.f3016a = 1;
        this.f3017b = i10;
    }
}
