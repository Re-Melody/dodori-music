package io.flutter.plugin.platform;

import android.view.Surface;

/* JADX INFO: loaded from: classes2.dex */
public interface h {
    void b(int i10, int i11);

    int getHeight();

    long getId();

    Surface getSurface();

    int getWidth();

    void release();

    default void scheduleFrame() {
    }
}
