package V0;

import A9.C0102b;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public class n implements InputConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0102b f12443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public M.A f12444b;

    public n(M.A a10, C0102b c0102b) {
        this.f12443a = c0102b;
        this.f12444b = a10;
    }

    public final void a(M.A a10) {
        a10.closeConnection();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        M.A a10 = this.f12444b;
        if (a10 != null) {
            return a10.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i10) {
        M.A a10 = this.f12444b;
        if (a10 != null) {
            return a10.clearMetaKeyStates(i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        M.A a10 = this.f12444b;
        if (a10 != null) {
            if (a10 != null) {
                a(a10);
                this.f12444b = null;
            }
            this.f12443a.invoke(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        M.A a10 = this.f12444b;
        if (a10 != null) {
            return a10.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        M.A a10 = this.f12444b;
        if (a10 != null) {
            return a10.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i10) {
        M.A a10 = this.f12444b;
        if (a10 != null) {
            return a10.commitText(charSequence, i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i10, int i11) {
        M.A a10 = this.f12444b;
        if (a10 != null) {
            return a10.deleteSurroundingText(i10, i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        M.A a10 = this.f12444b;
        if (a10 != null) {
            return a10.deleteSurroundingTextInCodePoints(i10, i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        M.A a10 = this.f12444b;
        if (a10 != null) {
            return a10.b();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        M.A a10 = this.f12444b;
        if (a10 != null) {
            return a10.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i10) {
        M.A a10 = this.f12444b;
        if (a10 != null) {
            return a10.getCursorCapsMode(i10);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        M.A a10 = this.f12444b;
        return a10 != null ? a10.getExtractedText(extractedTextRequest, i10) : new ExtractedText();
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i10) {
        CharSequence selectedText;
        M.A a10 = this.f12444b;
        return (a10 == null || (selectedText = a10.getSelectedText(i10)) == null) ? "" : selectedText;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i10, int i11) {
        M.A a10 = this.f12444b;
        if (a10 != null) {
            return a10.getTextAfterCursor(i10, i11);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i10, int i11) {
        M.A a10 = this.f12444b;
        if (a10 != null) {
            return a10.getTextBeforeCursor(i10, i11);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i10) {
        M.A a10 = this.f12444b;
        if (a10 != null) {
            return a10.performContextMenuAction(i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i10) {
        M.A a10 = this.f12444b;
        if (a10 != null) {
            return a10.performEditorAction(i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        M.A a10 = this.f12444b;
        if (a10 != null) {
            return a10.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z10) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i10) {
        M.A a10 = this.f12444b;
        if (a10 != null) {
            return a10.requestCursorUpdates(i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        M.A a10 = this.f12444b;
        if (a10 != null) {
            return a10.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i10, int i11) {
        M.A a10 = this.f12444b;
        if (a10 != null) {
            return a10.setComposingRegion(i10, i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i10) {
        M.A a10 = this.f12444b;
        if (a10 != null) {
            return a10.setComposingText(charSequence, i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i10, int i11) {
        M.A a10 = this.f12444b;
        if (a10 != null) {
            return a10.setSelection(i10, i11);
        }
        return false;
    }
}
