package p152o;

import Y5.h;
import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import p046da.b;
import p087i.a;

/* JADX INFO: renamed from: o.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2164w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f23459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f23460b;

    public C2164w(TextView textView) {
        this.f23459a = textView;
        this.f23460b = new h(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((b) this.f23460b.f13385b).C(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f23459a.getContext().obtainStyledAttributes(attributeSet, a.f20375i, i10, 0);
        try {
            boolean z10 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            d(z10);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void c(boolean z10) {
        ((b) this.f23460b.f13385b).W(z10);
    }

    public final void d(boolean z10) {
        ((b) this.f23460b.f13385b).X(z10);
    }
}
