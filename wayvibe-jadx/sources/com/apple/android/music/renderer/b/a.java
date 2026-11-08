package com.apple.android.music.renderer.b;

import com.apple.android.music.playback.e.a.c;
import com.apple.android.music.playback.e.a.e;
import com.apple.android.music.renderer.javanative.SVFuseEqualizerJNI;
import com.apple.android.music.renderer.javanative.SVOpenSLESEngine;
import com.apple.android.music.renderer.javanative.SVOpenSLESOutputMix;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f17657a = "a";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SVFuseEqualizerJNI.SVFuseEqualizerPtr f17658b;

    /* JADX INFO: renamed from: com.apple.android.music.renderer.b.a$a, reason: collision with other inner class name */
    public static class C0017a extends Exception {
        public C0017a(String str) {
            super(str);
        }
    }

    public a(SVOpenSLESEngine.SVOpenSLESEnginePtr sVOpenSLESEnginePtr) {
        SVOpenSLESOutputMix.SVOpenSLESOutputMixPtr sVOpenSLESOutputMixPtrOutputMix;
        if (sVOpenSLESEnginePtr == null || sVOpenSLESEnginePtr.get() == null || (sVOpenSLESOutputMixPtrOutputMix = sVOpenSLESEnginePtr.get().outputMix()) == null || sVOpenSLESOutputMixPtrOutputMix.get() == null) {
            return;
        }
        this.f17658b = sVOpenSLESOutputMixPtrOutputMix.get().equalizer();
    }

    @Override // com.apple.android.music.playback.e.a.e
    public boolean a() {
        SVFuseEqualizerJNI.SVFuseEqualizerPtr sVFuseEqualizerPtr = this.f17658b;
        if (sVFuseEqualizerPtr != null) {
            return sVFuseEqualizerPtr.get().isEqualizerSupported();
        }
        return false;
    }

    @Override // com.apple.android.music.playback.e.a.e
    public boolean b() {
        SVFuseEqualizerJNI.SVFuseEqualizerPtr sVFuseEqualizerPtr = this.f17658b;
        if (sVFuseEqualizerPtr != null) {
            return sVFuseEqualizerPtr.get().isBassBoostSupported();
        }
        return false;
    }

    @Override // com.apple.android.music.playback.e.a.e
    public void a(boolean z10) {
        SVFuseEqualizerJNI.SVFuseEqualizerPtr sVFuseEqualizerPtr = this.f17658b;
        if (sVFuseEqualizerPtr != null) {
            sVFuseEqualizerPtr.get().enableAudioEffects(z10);
        }
    }

    @Override // com.apple.android.music.playback.e.a.e
    public void b(int i10) {
        SVFuseEqualizerJNI.SVFuseEqualizerPtr sVFuseEqualizerPtr = this.f17658b;
        if (sVFuseEqualizerPtr != null) {
            sVFuseEqualizerPtr.get().setBassBoostStrength(i10);
        }
    }

    public void a(int i10, int i11) {
        SVFuseEqualizerJNI.SVFuseEqualizerPtr sVFuseEqualizerPtr = this.f17658b;
        if (sVFuseEqualizerPtr != null) {
            sVFuseEqualizerPtr.get().setFrequencyBandLevel(i10, i11);
        }
    }

    @Override // com.apple.android.music.playback.e.a.e
    public void a(int i10) {
        SVFuseEqualizerJNI.SVFuseEqualizerPtr sVFuseEqualizerPtr = this.f17658b;
        if (sVFuseEqualizerPtr != null) {
            try {
                sVFuseEqualizerPtr.get().setEqualizerPreset(i10);
            } catch (Exception e2) {
                new C0017a("setEqualizerPreset() ERROR invalid equalizer reporting error " + e2.getMessage());
            }
        }
    }

    @Override // com.apple.android.music.playback.e.a.e
    public void a(List<c> list) {
        if (list != null) {
            for (c cVar : list) {
                a(cVar.a(), cVar.b());
            }
        }
    }
}
