package T7;

import android.app.ActivityManager;
import android.media.MicrophoneInfo;
import android.text.PrecomputedText;
import android.view.DisplayCutout;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ ActivityManager.TaskDescription d(int i10, String str) {
        return new ActivityManager.TaskDescription(str, 0, i10);
    }

    public static /* bridge */ /* synthetic */ MicrophoneInfo i(Object obj) {
        return (MicrophoneInfo) obj;
    }

    public static /* bridge */ /* synthetic */ DisplayCutout n(Object obj) {
        return (DisplayCutout) obj;
    }

    public static /* bridge */ /* synthetic */ boolean w(CharSequence charSequence) {
        return charSequence instanceof PrecomputedText;
    }

    public static /* bridge */ /* synthetic */ boolean x(Object obj) {
        return obj instanceof DisplayCutout;
    }
}
