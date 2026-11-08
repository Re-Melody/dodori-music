package T0;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Build;

/* JADX INFO: renamed from: T0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0798a extends AbstractC0800c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I f11485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Typeface f11488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AssetManager f11489e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f11490f;

    public C0798a(AssetManager assetManager, String str, I i10, int i11, H h10) {
        super(0, C0805h.f11500b, h10);
        this.f11485a = i10;
        this.f11486b = i11;
        this.f11489e = assetManager;
        this.f11490f = str;
        this.f11488d = Build.VERSION.SDK_INT >= 26 ? S.f11473a.a(assetManager, str, null, getVariationSettings()) : Typeface.createFromAsset(assetManager, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0798a)) {
            return false;
        }
        C0798a c0798a = (C0798a) obj;
        return kotlin.jvm.internal.m.b(this.f11490f, c0798a.f11490f) && kotlin.jvm.internal.m.b(getVariationSettings(), c0798a.getVariationSettings());
    }

    @Override // T0.InterfaceC0816t
    /* JADX INFO: renamed from: getStyle-_-LCdwA */
    public final int mo9getStyle_LCdwA() {
        return this.f11486b;
    }

    @Override // T0.InterfaceC0816t
    public final I getWeight() {
        return this.f11485a;
    }

    public final int hashCode() {
        return getVariationSettings().f11450a.hashCode() + (this.f11490f.hashCode() * 31);
    }

    public final String toString() {
        return "Font(assetManager, path=" + this.f11490f + ", weight=" + this.f11485a + ", style=" + ((Object) C.a(this.f11486b)) + ')';
    }
}
