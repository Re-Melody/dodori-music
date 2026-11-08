package com.apple.android.music.renderer.javanative;

import com.apple.android.music.playback.e.c;
import java.lang.ref.WeakReference;
import org.bytedeco.javacpp.FunctionPointer;
import org.bytedeco.javacpp.annotation.ByRef;
import org.bytedeco.javacpp.annotation.Const;
import org.bytedeco.javacpp.annotation.Platform;

/* JADX INFO: loaded from: classes.dex */
@Platform(include = {"SVMediaRendererObserver.h", "SVAudioRendererObserver.h"}, link = {"androidappmusic"})
public class SVErrorCallback extends FunctionPointer {
    private WeakReference<c> observerJNI = null;

    public SVErrorCallback() {
        allocate();
    }

    private native void allocate();

    public void call(@ByRef @Const SVError sVError) {
        c cVar;
        synchronized (this) {
            try {
                WeakReference<c> weakReference = this.observerJNI;
                if (weakReference != null && (cVar = weakReference.get()) != null) {
                    cVar.a(sVError.errorCode(), sVError.errorDescription(), sVError.componentErrorCode());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setObserverJNI(c cVar) {
        synchronized (this) {
            this.observerJNI = new WeakReference<>(cVar);
        }
    }
}
