package p101j2;

import X0.f;
import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import p078h2.g;

/* JADX INFO: loaded from: classes.dex */
public final class c implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f21439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f21440b;

    public c(TextView textView) {
        this.f21439a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        TextView textView = this.f21439a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iB = g.a().b();
        if (iB != 0) {
            if (iB == 1) {
                if ((i13 == 0 && i12 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i10 != 0 || i11 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i10, i11);
                }
                return g.a().f(0, charSequence.length(), 0, charSequence);
            }
            if (iB != 3) {
                return charSequence;
            }
        }
        g gVarA = g.a();
        if (this.f21440b == null) {
            this.f21440b = new f(textView, this);
        }
        gVarA.g(this.f21440b);
        return charSequence;
    }
}
