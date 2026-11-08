package p255y2;

import android.media.AudioAttributes;

/* JADX INFO: renamed from: y2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2327c {
    public static void a(AudioAttributes.Builder builder, int i10) {
        builder.setAllowedCapturePolicy(i10);
    }
}
