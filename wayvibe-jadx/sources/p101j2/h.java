package p101j2;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import p078h2.g;

/* JADX INFO: loaded from: classes.dex */
public final class h implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditText f21448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f21449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f21450c = true;

    public h(EditText editText) {
        this.f21448a = editText;
    }

    public static void a(EditText editText, int i10) {
        int length;
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            g gVarA = g.a();
            if (editableText == null) {
                length = 0;
            } else {
                gVarA.getClass();
                length = editableText.length();
            }
            gVarA.f(0, length, 0, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) throws Throwable {
        EditText editText = this.f21448a;
        if (!editText.isInEditMode() && this.f21450c && g.c() && i11 <= i12 && (charSequence instanceof Spannable)) {
            int iB = g.a().b();
            if (iB != 0) {
                if (iB == 1) {
                    g.a().f(i10, i12 + i10, 0, (Spannable) charSequence);
                    return;
                } else if (iB != 3) {
                    return;
                }
            }
            g gVarA = g.a();
            if (this.f21449b == null) {
                this.f21449b = new g(editText);
            }
            gVarA.g(this.f21449b);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
