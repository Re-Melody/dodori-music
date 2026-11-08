package com.google.android.material.internal;

import K1.T;
import L3.E;
import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import p152o.C2166x;

/* JADX INFO: loaded from: classes.dex */
public class CheckableImageButton extends C2166x implements Checkable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f18208e = {R.attr.state_checked};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f18209d;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, app.nagakiba.wayvibe.R.attr.imageButtonStyle);
        T.i(this, new E(this, 1));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f18209d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        return this.f18209d ? View.mergeDrawableStates(super.onCreateDrawableState(i10 + 1), f18208e) : super.onCreateDrawableState(i10);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (this.f18209d != z10) {
            this.f18209d = z10;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f18209d);
    }
}
