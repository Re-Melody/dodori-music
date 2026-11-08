package p098j;

import K1.T;
import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Constructor;
import java.util.WeakHashMap;
import p087i.a;
import p132m.d;
import p152o.C;
import p152o.C2126c0;
import p152o.C2138i0;
import p152o.C2147n;
import p152o.C2151p;
import p152o.C2153q;
import p152o.C2162v;
import p152o.C2166x;
import p152o.C2168y;
import p152o.C2170z;
import p152o.D;
import p152o.Q;
import p152o.T0;
import p152o.r;
import p199t.G;

/* JADX INFO: loaded from: classes.dex */
public class F {
    private static final String LOG_TAG = "AppCompatViewInflater";
    private final Object[] mConstructorArgs = new Object[2];
    private static final Class<?>[] sConstructorSignature = {Context.class, AttributeSet.class};
    private static final int[] sOnClickAttrs = {R.attr.onClick};
    private static final int[] sAccessibilityHeading = {R.attr.accessibilityHeading};
    private static final int[] sAccessibilityPaneTitle = {R.attr.accessibilityPaneTitle};
    private static final int[] sScreenReaderFocusable = {R.attr.screenReaderFocusable};
    private static final String[] sClassPrefixList = {"android.widget.", "android.view.", "android.webkit."};
    private static final G sConstructorMap = new G(0);

    public final View a(Context context, String str, String str2) {
        String strConcat;
        G g3 = sConstructorMap;
        Constructor constructor = (Constructor) g3.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(sConstructorSignature);
            g3.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.mConstructorArgs);
    }

    public final void b(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    public C2147n createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new C2147n(context, attributeSet);
    }

    public C2151p createButton(Context context, AttributeSet attributeSet) {
        return new C2151p(context, attributeSet, app.nagakiba.wayvibe.R.attr.buttonStyle);
    }

    public C2153q createCheckBox(Context context, AttributeSet attributeSet) {
        return new C2153q(context, attributeSet);
    }

    public r createCheckedTextView(Context context, AttributeSet attributeSet) {
        return new r(context, attributeSet);
    }

    public C2162v createEditText(Context context, AttributeSet attributeSet) {
        return new C2162v(context, attributeSet);
    }

    public C2166x createImageButton(Context context, AttributeSet attributeSet) {
        return new C2166x(context, attributeSet, app.nagakiba.wayvibe.R.attr.imageButtonStyle);
    }

    public C2168y createImageView(Context context, AttributeSet attributeSet) {
        return new C2168y(context, attributeSet, 0);
    }

    public C2170z createMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new C2170z(context, attributeSet);
    }

    public C createRadioButton(Context context, AttributeSet attributeSet) {
        return new C(context, attributeSet);
    }

    public D createRatingBar(Context context, AttributeSet attributeSet) {
        return new D(context, attributeSet);
    }

    public p152o.F createSeekBar(Context context, AttributeSet attributeSet) {
        return new p152o.F(context, attributeSet);
    }

    public Q createSpinner(Context context, AttributeSet attributeSet) {
        return new Q(context, attributeSet);
    }

    public C2126c0 createTextView(Context context, AttributeSet attributeSet) {
        return new C2126c0(context, attributeSet);
    }

    public C2138i0 createToggleButton(Context context, AttributeSet attributeSet) {
        return new C2138i0(context, attributeSet);
    }

    public final View createView(View view, String str, Context context, AttributeSet attributeSet, boolean z10, boolean z11, boolean z12, boolean z13) {
        View viewCreateRatingBar;
        Context context2 = (!z10 || view == null) ? context : view.getContext();
        if (z11 || z12) {
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, a.f20389y, 0, 0);
            int resourceId = z11 ? typedArrayObtainStyledAttributes.getResourceId(0, 0) : 0;
            if (z12 && resourceId == 0 && (resourceId = typedArrayObtainStyledAttributes.getResourceId(4, 0)) != 0) {
                Log.i(LOG_TAG, "app:theme is now deprecated. Please move to using android:theme instead.");
            }
            typedArrayObtainStyledAttributes.recycle();
            if (resourceId != 0 && (!(context2 instanceof d) || ((d) context2).f22121a != resourceId)) {
                context2 = new d(context2, resourceId);
            }
        }
        if (z13) {
            T0.a(context2);
        }
        str.getClass();
        switch (str) {
            case "RatingBar":
                viewCreateRatingBar = createRatingBar(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            case "CheckedTextView":
                viewCreateRatingBar = createCheckedTextView(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            case "MultiAutoCompleteTextView":
                viewCreateRatingBar = createMultiAutoCompleteTextView(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            case "TextView":
                viewCreateRatingBar = createTextView(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            case "ImageButton":
                viewCreateRatingBar = createImageButton(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            case "SeekBar":
                viewCreateRatingBar = createSeekBar(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            case "Spinner":
                viewCreateRatingBar = createSpinner(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            case "RadioButton":
                viewCreateRatingBar = createRadioButton(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            case "ToggleButton":
                viewCreateRatingBar = createToggleButton(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            case "ImageView":
                viewCreateRatingBar = createImageView(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            case "AutoCompleteTextView":
                viewCreateRatingBar = createAutoCompleteTextView(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            case "CheckBox":
                viewCreateRatingBar = createCheckBox(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            case "EditText":
                viewCreateRatingBar = createEditText(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            case "Button":
                viewCreateRatingBar = createButton(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            default:
                viewCreateRatingBar = createView(context2, str, attributeSet);
                break;
        }
        if (viewCreateRatingBar == null && context != context2) {
            viewCreateRatingBar = null;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                Object[] objArr = this.mConstructorArgs;
                objArr[0] = context2;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i10 = 0;
                    while (true) {
                        String[] strArr = sClassPrefixList;
                        if (i10 < strArr.length) {
                            View viewA = a(context2, str, strArr[i10]);
                            if (viewA != null) {
                                Object[] objArr2 = this.mConstructorArgs;
                                objArr2[0] = null;
                                objArr2[1] = null;
                                viewCreateRatingBar = viewA;
                            } else {
                                i10++;
                            }
                        } else {
                            Object[] objArr3 = this.mConstructorArgs;
                            objArr3[0] = null;
                            objArr3[1] = null;
                        }
                    }
                } else {
                    View viewA2 = a(context2, str, null);
                    Object[] objArr4 = this.mConstructorArgs;
                    objArr4[0] = null;
                    objArr4[1] = null;
                    viewCreateRatingBar = viewA2;
                }
            } catch (Exception unused) {
                Object[] objArr5 = this.mConstructorArgs;
                objArr5[0] = viewCreateRatingBar;
                objArr5[1] = viewCreateRatingBar;
            } catch (Throwable th) {
                Object[] objArr6 = this.mConstructorArgs;
                objArr6[0] = viewCreateRatingBar;
                objArr6[1] = viewCreateRatingBar;
                throw th;
            }
        }
        if (viewCreateRatingBar != null) {
            Context context3 = viewCreateRatingBar.getContext();
            if ((context3 instanceof ContextWrapper) && viewCreateRatingBar.hasOnClickListeners()) {
                TypedArray typedArrayObtainStyledAttributes2 = context3.obtainStyledAttributes(attributeSet, sOnClickAttrs);
                String string = typedArrayObtainStyledAttributes2.getString(0);
                if (string != null) {
                    viewCreateRatingBar.setOnClickListener(new E(viewCreateRatingBar, string));
                }
                typedArrayObtainStyledAttributes2.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, sAccessibilityHeading);
                if (typedArrayObtainStyledAttributes3.hasValue(0)) {
                    boolean z14 = typedArrayObtainStyledAttributes3.getBoolean(0, false);
                    WeakHashMap weakHashMap = T.f7251a;
                    new K1.F(app.nagakiba.wayvibe.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3).g(viewCreateRatingBar, Boolean.valueOf(z14));
                }
                typedArrayObtainStyledAttributes3.recycle();
                TypedArray typedArrayObtainStyledAttributes4 = context2.obtainStyledAttributes(attributeSet, sAccessibilityPaneTitle);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    T.j(viewCreateRatingBar, typedArrayObtainStyledAttributes4.getString(0));
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = context2.obtainStyledAttributes(attributeSet, sScreenReaderFocusable);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    boolean z15 = typedArrayObtainStyledAttributes5.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = T.f7251a;
                    new K1.F(app.nagakiba.wayvibe.R.id.tag_screen_reader_focusable, Boolean.class, 0, 28, 0).g(viewCreateRatingBar, Boolean.valueOf(z15));
                }
                typedArrayObtainStyledAttributes5.recycle();
            }
        }
        return viewCreateRatingBar;
    }

    public View createView(Context context, String str, AttributeSet attributeSet) {
        return null;
    }
}
