package com.apple.android.music.renderer.javanative;

import com.apple.android.music.playback.e.c;
import java.lang.ref.WeakReference;
import org.bytedeco.javacpp.FunctionPointer;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.javacpp.annotation.Platform;

/* JADX INFO: loaded from: classes.dex */
@Platform(include = {"SVAudioRenderer.h", "SVAudioRendererImpl.h", "SVMediaRendererObserver.h", "SVAudioRendererObserver.h", "SVBuffer.h", "SVAudioSample.h"}, link = {"androidappmusic"})
public class SVBufferToBeFilledCallback extends FunctionPointer {
    private WeakReference<c> observerJNI = null;

    public SVBufferToBeFilledCallback() {
        allocate();
    }

    private native void allocate();

    public void call(@Cast({"int8_t"}) int i10) {
        c cVar;
        synchronized (this) {
            try {
                WeakReference<c> weakReference = this.observerJNI;
                if (weakReference != null && (cVar = weakReference.get()) != null) {
                    cVar.a(i10);
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
