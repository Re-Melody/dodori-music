package M;

import A9.C0102b;
import G0.InterfaceC0486l1;
import K.C0559d0;
import O.P;
import O0.K;
import V0.C0929a;
import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes.dex */
public final class A implements InputConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p268z7.c f7924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0559d0 f7926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final P f7927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC0486l1 f7928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7929f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public V0.y f7930g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7931h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f7932i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f7933j = new ArrayList();
    public boolean k = true;

    public A(V0.y yVar, p268z7.c cVar, boolean z10, C0559d0 c0559d0, P p10, InterfaceC0486l1 interfaceC0486l1) {
        this.f7924a = cVar;
        this.f7925b = z10;
        this.f7926c = c0559d0;
        this.f7927d = p10;
        this.f7928e = interfaceC0486l1;
        this.f7930g = yVar;
    }

    public final void a(V0.i iVar) {
        this.f7929f++;
        try {
            this.f7933j.add(iVar);
        } finally {
            b();
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [Z8.c, kotlin.jvm.internal.n] */
    public final boolean b() {
        int i10 = this.f7929f - 1;
        this.f7929f = i10;
        if (i10 == 0) {
            ArrayList arrayList = this.f7933j;
            if (!arrayList.isEmpty()) {
                ((y) this.f7924a.f29899b).f7999c.invoke(N8.n.Y0(arrayList));
                arrayList.clear();
            }
        }
        return this.f7929f > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z10 = this.k;
        if (!z10) {
            return z10;
        }
        this.f7929f++;
        return true;
    }

    public final void c(int i10) {
        sendKeyEvent(new KeyEvent(0, i10));
        sendKeyEvent(new KeyEvent(1, i10));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i10) {
        boolean z10 = this.k;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f7933j.clear();
        this.f7929f = 0;
        this.k = false;
        y yVar = (y) this.f7924a.f29899b;
        int size = yVar.f8006j.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList = yVar.f8006j;
            if (kotlin.jvm.internal.m.b(((WeakReference) arrayList.get(i10)).get(), this)) {
                arrayList.remove(i10);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z10 = this.k;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        boolean z10 = this.k;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z10 = this.k;
        return z10 ? this.f7925b : z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i10) {
        boolean z10 = this.k;
        if (z10) {
            a(new C0929a(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i10, int i11) {
        boolean z10 = this.k;
        if (!z10) {
            return z10;
        }
        a(new V0.g(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        boolean z10 = this.k;
        if (!z10) {
            return z10;
        }
        a(new V0.h(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z10 = this.k;
        if (!z10) {
            return z10;
        }
        a(new V0.j());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i10) {
        V0.y yVar = this.f7930g;
        return TextUtils.getCapsMode(yVar.f12460a.f8920a, K.e(yVar.f12461b), i10);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        boolean z10 = (i10 & 1) != 0;
        this.f7932i = z10;
        if (z10) {
            this.f7931h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return p025b9.a.m(this.f7930g);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i10) {
        if (K.b(this.f7930g.f12461b)) {
            return null;
        }
        return S9.b.K(this.f7930g).f8920a;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i10, int i11) {
        return S9.b.N(this.f7930g, i10).f8920a;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i10, int i11) {
        return S9.b.O(this.f7930g, i10).f8920a;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i10) {
        boolean z10 = this.k;
        if (z10) {
            z10 = false;
            switch (i10) {
                case R.id.selectAll:
                    a(new V0.x(0, this.f7930g.f12460a.f8920a.length()));
                    break;
                case R.id.cut:
                    c(277);
                    return false;
                case R.id.copy:
                    c(278);
                    return false;
                case R.id.paste:
                    c(279);
                    return false;
                default:
                    return false;
            }
        }
        return z10;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [Z8.c, kotlin.jvm.internal.n] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i10) {
        int i11;
        boolean z10 = this.k;
        if (z10) {
            z10 = true;
            if (i10 != 0) {
                switch (i10) {
                    case 2:
                        i11 = 2;
                        break;
                    case 3:
                        i11 = 3;
                        break;
                    case 4:
                        i11 = 4;
                        break;
                    case 5:
                        i11 = 6;
                        break;
                    case 6:
                        i11 = 7;
                        break;
                    case 7:
                        i11 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i10);
                        i11 = 1;
                        break;
                }
            } else {
                i11 = 1;
            }
            ((y) this.f7924a.f29899b).f8000d.invoke(new V0.k(i11));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        if (Build.VERSION.SDK_INT >= 34) {
            g gVar = g.f7957a;
            C0102b c0102b = new C0102b(this, 21);
            gVar.a(this.f7926c, this.f7927d, handwritingGesture, this.f7928e, executor, intConsumer, c0102b);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z10 = this.k;
        if (z10) {
            return true;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (Build.VERSION.SDK_INT >= 34) {
            return g.f7957a.b(this.f7926c, this.f7927d, previewableHandwritingGesture, cancellationSignal);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z10) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13 = this.k;
        if (!z13) {
            return z13;
        }
        boolean z14 = false;
        boolean z15 = (i10 & 1) != 0;
        boolean z16 = (i10 & 2) != 0;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            z10 = (i10 & 16) != 0;
            z11 = (i10 & 8) != 0;
            boolean z17 = (i10 & 4) != 0;
            if (i11 >= 34 && (i10 & 32) != 0) {
                z14 = true;
            }
            if (z10 || z11 || z17 || z14) {
                z12 = z14;
                z14 = z17;
            } else if (i11 >= 34) {
                z12 = true;
                z14 = true;
                z10 = true;
                z11 = true;
            } else {
                z10 = true;
                z11 = true;
                z12 = z14;
                z14 = true;
            }
        } else {
            z10 = true;
            z11 = true;
            z12 = false;
        }
        v vVar = ((y) this.f7924a.f29899b).f8008m;
        synchronized (vVar.f7981c) {
            try {
                vVar.f7984f = z10;
                vVar.f7985g = z11;
                vVar.f7986h = z14;
                vVar.f7987i = z12;
                if (z15) {
                    vVar.f7983e = true;
                    if (vVar.f7988j != null) {
                        vVar.a();
                    }
                }
                vVar.f7982d = z16;
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [M8.h, java.lang.Object] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z10 = this.k;
        if (!z10) {
            return z10;
        }
        ((BaseInputConnection) ((y) this.f7924a.f29899b).k.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i10, int i11) {
        boolean z10 = this.k;
        if (z10) {
            a(new V0.v(i10, i11));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i10) {
        boolean z10 = this.k;
        if (z10) {
            a(new V0.w(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i10, int i11) {
        boolean z10 = this.k;
        if (!z10) {
            return z10;
        }
        a(new V0.x(i10, i11));
        return true;
    }
}
