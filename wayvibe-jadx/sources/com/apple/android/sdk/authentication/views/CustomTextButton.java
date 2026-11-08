package com.apple.android.sdk.authentication.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.apple.android.sdk.authentication.R;
import p152o.C2151p;

/* JADX INFO: loaded from: classes.dex */
public class CustomTextButton extends C2151p {
    public CustomTextButton(Context context) {
        this(context, null, 0);
    }

    public CustomTextButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CustomTextButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CustomTextView);
            String string = typedArrayObtainStyledAttributes.getString(R.styleable.CustomTextView_customFont);
            typedArrayObtainStyledAttributes.recycle();
            if (isInEditMode() || string == null) {
                return;
            }
            setTypeface(a.a(context, string));
        }
    }
}
