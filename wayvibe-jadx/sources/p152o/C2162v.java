package p152o;

import D7.W;
import K1.C0601d;
import K1.C0604f;
import K1.InterfaceC0599c;
import K1.InterfaceC0618u;
import K1.T;
import M1.d;
import M1.e;
import M1.f;
import N1.j;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import app.nagakiba.wayvibe.R;
import p046da.b;
import p268z7.c;

/* JADX INFO: renamed from: o.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2162v extends EditText implements InterfaceC0618u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2149o f23453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Y f23454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T f23455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f23456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final B f23457e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C2160u f23458f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2162v(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        T0.a(context);
        S0.a(this, getContext());
        C2149o c2149o = new C2149o(this);
        this.f23453a = c2149o;
        c2149o.d(attributeSet, R.attr.editTextStyle);
        Y y6 = new Y(this);
        this.f23454b = y6;
        y6.f(attributeSet, R.attr.editTextStyle);
        y6.b();
        T t10 = new T();
        t10.f23274a = this;
        this.f23455c = t10;
        this.f23456d = new j();
        B b10 = new B(this);
        this.f23457e = b10;
        b10.b(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = isFocusable();
        boolean zIsClickable = isClickable();
        boolean zIsLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener keyListenerA = b10.a(keyListener);
        if (keyListenerA == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerA);
        setRawInputType(inputType);
        setFocusable(zIsFocusable);
        setClickable(zIsClickable);
        setLongClickable(zIsLongClickable);
    }

    private C2160u getSuperCaller() {
        if (this.f23458f == null) {
            this.f23458f = new C2160u(this);
        }
        return this.f23458f;
    }

    @Override // K1.InterfaceC0618u
    public final C0604f a(C0604f c0604f) {
        this.f23456d.getClass();
        return j.a(this, c0604f);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2149o c2149o = this.f23453a;
        if (c2149o != null) {
            c2149o.a();
        }
        Y y6 = this.f23454b;
        if (y6 != null) {
            y6.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return b.h0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2149o c2149o = this.f23453a;
        if (c2149o != null) {
            return c2149o.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2149o c2149o = this.f23453a;
        if (c2149o != null) {
            return c2149o.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f23454b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f23454b.e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        T t10;
        if (Build.VERSION.SDK_INT >= 28 || (t10 = this.f23455c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = t10.f23275b;
        return textClassifier == null ? S.a(t10.f23274a) : textClassifier;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0044 A[PHI: r1
  0x0044: PHI (r1v10 java.lang.String[]) = (r1v5 java.lang.String[]), (r1v11 java.lang.String[]) binds: [B:26:0x005b, B:18:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrE;
        String[] stringArray;
        InputConnection fVar;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f23454b.getClass();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 && inputConnectionOnCreateInputConnection != null) {
            d.b(editorInfo, getText());
        }
        W.a0(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionOnCreateInputConnection != null && i10 <= 30 && (strArrE = T.e(this)) != null) {
            d.a(editorInfo, strArrE);
            A8.b bVar = new A8.b(this, 12);
            if (i10 >= 25) {
                fVar = new e(inputConnectionOnCreateInputConnection, bVar);
            } else {
                String[] strArr = d.f8111a;
                if (i10 >= 25) {
                    stringArray = editorInfo.contentMimeTypes;
                    if (stringArray != null) {
                        strArr = stringArray;
                    }
                } else {
                    Bundle bundle = editorInfo.extras;
                    if (bundle != null) {
                        stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        if (stringArray == null) {
                            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        }
                        if (stringArray != null) {
                            strArr = stringArray;
                        }
                    }
                }
                if (strArr.length != 0) {
                    fVar = new f(inputConnectionOnCreateInputConnection, bVar);
                }
            }
            inputConnectionOnCreateInputConnection = fVar;
        }
        return this.f23457e.c(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 || i10 >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean zA = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && T.e(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zA = E.a(dragEvent, this, activity);
            }
        }
        if (zA) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i10) {
        C0601d c0601d;
        InterfaceC0599c interfaceC0599c;
        int i11;
        c cVar;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31 || T.e(this) == null || !(i10 == 16908322 || i10 == 16908337)) {
            return super.onTextContextMenuItem(i10);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i12 >= 31) {
                cVar = new c(primaryClip, 1);
            } else {
                c0601d = new C0601d();
                c0601d.f7277b = primaryClip;
                c0601d.f7278c = 1;
            }
            if (i10 == 16908322) {
                interfaceC0599c = c0601d;
                interfaceC0599c = cVar;
                i11 = 0;
            } else {
                interfaceC0599c = c0601d;
                interfaceC0599c = cVar;
                i11 = 1;
            }
            interfaceC0599c.l(i11);
            T.g(this, interfaceC0599c.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2149o c2149o = this.f23453a;
        if (c2149o != null) {
            c2149o.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C2149o c2149o = this.f23453a;
        if (c2149o != null) {
            c2149o.f(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        Y y6 = this.f23454b;
        if (y6 != null) {
            y6.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        Y y6 = this.f23454b;
        if (y6 != null) {
            y6.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(b.i0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f23457e.d(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f23457e.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2149o c2149o = this.f23453a;
        if (c2149o != null) {
            c2149o.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2149o c2149o = this.f23453a;
        if (c2149o != null) {
            c2149o.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Y y6 = this.f23454b;
        y6.k(colorStateList);
        y6.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Y y6 = this.f23454b;
        y6.l(mode);
        y6.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        Y y6 = this.f23454b;
        if (y6 != null) {
            y6.g(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        T t10;
        if (Build.VERSION.SDK_INT >= 28 || (t10 = this.f23455c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            t10.f23275b = textClassifier;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : getEditableText();
    }
}
