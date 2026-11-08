package com.apple.android.sdk.authentication.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.apple.android.sdk.authentication.R;
import p152o.C2126c0;

/* JADX INFO: loaded from: classes.dex */
public class CustomTextView extends C2126c0 {
    public CustomTextView(Context context) {
        this(context, null, 0);
    }

    public CustomTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CustomTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CustomTextView);
            String string = typedArrayObtainStyledAttributes.getString(R.styleable.CustomTextView_customFont);
            typedArrayObtainStyledAttributes.recycle();
            setTypeface(a.a(context, string == null ? "fonts/Roboto-Regular.ttf" : string));
        }
    }
}
