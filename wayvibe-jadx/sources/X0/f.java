package X0;

import U.C0891i0;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class f extends p078h2.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13042a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f13044c;

    public f(C0891i0 c0891i0, p268z7.c cVar) {
        this.f13043b = c0891i0;
        this.f13044c = cVar;
    }

    @Override // p078h2.e
    public void a() {
        switch (this.f13042a) {
            case 0:
                ((p268z7.c) this.f13044c).f29899b = i.f13047a;
                break;
        }
    }

    @Override // p078h2.e
    public final void b() throws Throwable {
        InputFilter[] filters;
        int length;
        switch (this.f13042a) {
            case 0:
                ((C0891i0) this.f13043b).setValue(Boolean.TRUE);
                ((p268z7.c) this.f13044c).f29899b = new j(true);
                break;
            default:
                TextView textView = (TextView) ((WeakReference) this.f13043b).get();
                InputFilter inputFilter = (InputFilter) ((WeakReference) this.f13044c).get();
                if (inputFilter != null && textView != null && (filters = textView.getFilters()) != null) {
                    for (InputFilter inputFilter2 : filters) {
                        if (inputFilter2 == inputFilter) {
                            if (textView.isAttachedToWindow()) {
                                CharSequence text = textView.getText();
                                p078h2.g gVarA = p078h2.g.a();
                                if (text == null) {
                                    length = 0;
                                } else {
                                    gVarA.getClass();
                                    length = text.length();
                                }
                                CharSequence charSequenceF = gVarA.f(0, length, 0, text);
                                if (text != charSequenceF) {
                                    int selectionStart = Selection.getSelectionStart(charSequenceF);
                                    int selectionEnd = Selection.getSelectionEnd(charSequenceF);
                                    textView.setText(charSequenceF);
                                    if (charSequenceF instanceof Spannable) {
                                        Spannable spannable = (Spannable) charSequenceF;
                                        if (selectionStart >= 0 && selectionEnd >= 0) {
                                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                                        } else if (selectionStart >= 0) {
                                            Selection.setSelection(spannable, selectionStart);
                                        } else if (selectionEnd >= 0) {
                                            Selection.setSelection(spannable, selectionEnd);
                                        }
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    break;
                }
                break;
        }
    }

    public f(TextView textView, p101j2.c cVar) {
        this.f13043b = new WeakReference(textView);
        this.f13044c = new WeakReference(cVar);
    }
}
