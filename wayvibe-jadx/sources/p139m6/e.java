package p139m6;

import V0.p;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import app.nagakiba.wayvibe.R;
import p051e6.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f22365a = {R.attr.colorPrimary};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f22366b = {R.attr.colorSecondary};

    public static void a(Context context, int[] iArr, String str) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(0);
        typedArrayObtainStyledAttributes.recycle();
        if (!zHasValue) {
            throw new IllegalArgumentException(p.o("The style on this component requires your app theme to be ", str, " (or a descendant)."));
        }
    }

    public static TypedArray b(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11, int... iArr2) {
        int[] iArr3 = a.f19625j;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr3, i10, i11);
        boolean z10 = true;
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z11) {
            a(context, f22366b, "Theme.MaterialComponents");
        }
        a(context, f22365a, "Theme.AppCompat");
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr3, i10, i11);
        if (typedArrayObtainStyledAttributes2.getBoolean(2, false)) {
            if (iArr2.length != 0) {
                TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, iArr, i10, i11);
                int length = iArr2.length;
                int i12 = 0;
                while (true) {
                    if (i12 >= length) {
                        typedArrayObtainStyledAttributes3.recycle();
                        break;
                    }
                    if (typedArrayObtainStyledAttributes3.getResourceId(iArr2[i12], -1) == -1) {
                        typedArrayObtainStyledAttributes3.recycle();
                        z10 = false;
                        break;
                    }
                    i12++;
                }
            } else if (typedArrayObtainStyledAttributes2.getResourceId(0, -1) == -1) {
                z10 = false;
                break;
            }
            typedArrayObtainStyledAttributes2.recycle();
            if (!z10) {
                throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
            }
        } else {
            typedArrayObtainStyledAttributes2.recycle();
        }
        return context.obtainStyledAttributes(attributeSet, iArr, i10, i11);
    }

    public static PorterDuff.Mode c(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
