package com.google.android.material.snackbar;

import K1.T;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import app.nagakiba.wayvibe.R;
import java.util.WeakHashMap;
import p051e6.a;

/* JADX INFO: loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f18222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Button f18223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18225d;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f19624i);
        this.f18224c = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f18225d = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final boolean a(int i10, int i11, int i12) {
        boolean z10;
        if (i10 != getOrientation()) {
            setOrientation(i10);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f18222a.getPaddingTop() == i11 && this.f18222a.getPaddingBottom() == i12) {
            return z10;
        }
        TextView textView = this.f18222a;
        WeakHashMap weakHashMap = T.f7251a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i11, textView.getPaddingEnd(), i12);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i11, textView.getPaddingRight(), i12);
        return true;
    }

    public Button getActionView() {
        return this.f18223b;
    }

    public TextView getMessageView() {
        return this.f18222a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f18222a = (TextView) findViewById(R.id.snackbar_text);
        this.f18223b = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        super.onMeasure(i10, i11);
        int i13 = this.f18224c;
        if (i13 > 0 && getMeasuredWidth() > i13) {
            i10 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
            super.onMeasure(i10, i11);
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        boolean z10 = this.f18222a.getLayout().getLineCount() > 1;
        if (!z10 || (i12 = this.f18225d) <= 0 || this.f18223b.getMeasuredWidth() <= i12) {
            if (!z10) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i10, i11);
    }
}
