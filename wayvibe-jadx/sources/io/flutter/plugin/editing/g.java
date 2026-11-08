package io.flutter.plugin.editing;

import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import java.util.ArrayList;
import p150n8.u;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends SpannableStringBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f20659a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20660b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f20661c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f20662d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f20663e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f20664f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f20665g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f20666h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f20667i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f20668j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f20669l;

    public g(u uVar, View view) {
        this.f20669l = new e(view, this);
        if (uVar != null) {
            f(uVar);
        }
    }

    public final void a(f fVar) {
        if (this.f20660b > 0) {
            Log.e("ListenableEditingState", "adding a listener " + fVar.toString() + " in a listener callback");
        }
        if (this.f20659a <= 0) {
            this.f20661c.add(fVar);
        } else {
            Log.w("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            this.f20662d.add(fVar);
        }
    }

    public final void b() {
        this.f20659a++;
        if (this.f20660b > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f20659a != 1 || this.f20661c.isEmpty()) {
            return;
        }
        this.f20665g = toString();
        this.f20666h = Selection.getSelectionStart(this);
        this.f20667i = Selection.getSelectionEnd(this);
        this.f20668j = BaseInputConnection.getComposingSpanStart(this);
        this.k = BaseInputConnection.getComposingSpanEnd(this);
    }

    public final void c() {
        int i10 = this.f20659a;
        if (i10 == 0) {
            Log.e("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        ArrayList arrayList = this.f20661c;
        ArrayList<f> arrayList2 = this.f20662d;
        if (i10 == 1) {
            for (f fVar : arrayList2) {
                this.f20660b++;
                fVar.a(true);
                this.f20660b--;
            }
            if (!arrayList.isEmpty()) {
                arrayList.size();
                d(!toString().equals(this.f20665g), (this.f20666h == Selection.getSelectionStart(this) && this.f20667i == Selection.getSelectionEnd(this)) ? false : true, (this.f20668j == BaseInputConnection.getComposingSpanStart(this) && this.k == BaseInputConnection.getComposingSpanEnd(this)) ? false : true);
            }
        }
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.f20659a--;
    }

    public final void d(boolean z10, boolean z11, boolean z12) {
        if (z10 || z11 || z12) {
            for (f fVar : this.f20661c) {
                this.f20660b++;
                fVar.a(z10);
                this.f20660b--;
            }
        }
    }

    public final void e(f fVar) {
        if (this.f20660b > 0) {
            Log.e("ListenableEditingState", "removing a listener " + fVar.toString() + " in a listener callback");
        }
        this.f20661c.remove(fVar);
        if (this.f20659a > 0) {
            this.f20662d.remove(fVar);
        }
    }

    public final void f(u uVar) {
        int i10;
        b();
        replace(0, length(), (CharSequence) uVar.f23029a);
        int i11 = uVar.f23030b;
        if (i11 >= 0) {
            Selection.setSelection(this, i11, uVar.f23031c);
        } else {
            Selection.removeSelection(this);
        }
        int i12 = uVar.f23032d;
        if (i12 < 0 || i12 >= (i10 = uVar.f23033e)) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.f20669l.setComposingRegion(i12, i10);
        }
        this.f20663e.clear();
        c();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i10, int i11, int i12) {
        super.setSpan(obj, i10, i11, i12);
        ArrayList arrayList = this.f20663e;
        String string = toString();
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        i iVar = new i();
        iVar.f20678e = selectionStart;
        iVar.f20679f = selectionEnd;
        iVar.f20680g = composingSpanStart;
        iVar.f20681h = composingSpanEnd;
        iVar.f20674a = string;
        iVar.f20675b = "";
        iVar.f20676c = -1;
        iVar.f20677d = -1;
        arrayList.add(iVar);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final String toString() {
        String str = this.f20664f;
        if (str != null) {
            return str;
        }
        String string = super.toString();
        this.f20664f = string;
        return string;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        if (this.f20660b > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        String string = toString();
        int i14 = i11 - i10;
        boolean z10 = i14 != i13 - i12;
        for (int i15 = 0; i15 < i14 && !z10; i15++) {
            z10 |= charAt(i10 + i15) != charSequence.charAt(i12 + i15);
        }
        if (z10) {
            this.f20664f = null;
        }
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        SpannableStringBuilder spannableStringBuilderReplace = super.replace(i10, i11, charSequence, i12, i13);
        ArrayList arrayList = this.f20663e;
        int selectionStart2 = Selection.getSelectionStart(this);
        int selectionEnd2 = Selection.getSelectionEnd(this);
        int composingSpanStart2 = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd2 = BaseInputConnection.getComposingSpanEnd(this);
        i iVar = new i();
        iVar.f20678e = selectionStart2;
        iVar.f20679f = selectionEnd2;
        iVar.f20680g = composingSpanStart2;
        iVar.f20681h = composingSpanEnd2;
        String string2 = charSequence.toString();
        iVar.f20674a = string;
        iVar.f20675b = string2;
        iVar.f20676c = i10;
        iVar.f20677d = i11;
        arrayList.add(iVar);
        if (this.f20659a > 0) {
            return spannableStringBuilderReplace;
        }
        d(z10, (Selection.getSelectionStart(this) == selectionStart && Selection.getSelectionEnd(this) == selectionEnd) ? false : true, (BaseInputConnection.getComposingSpanStart(this) == composingSpanStart && BaseInputConnection.getComposingSpanEnd(this) == composingSpanEnd) ? false : true);
        return spannableStringBuilderReplace;
    }
}
