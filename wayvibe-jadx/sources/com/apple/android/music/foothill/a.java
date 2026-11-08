package com.apple.android.music.foothill;

import com.apple.android.music.foothill.javanative.SVData;
import com.apple.android.music.foothill.javanative.SVFootHillSessionCtrlJNI;
import com.apple.android.music.playback.c.d;
import com.apple.android.music.playback.g.e;

/* JADX INFO: loaded from: classes.dex */
public class a implements com.apple.android.music.playback.a.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static com.apple.android.music.playback.a.a f17014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SVFootHillSessionCtrlJNI.SVFootHillSessionCtrlPtr f17015b;

    private a() {
        SVFootHillSessionCtrlJNI.SVFootHillSessionCtrlPtr sVFootHillSessionCtrlPtrInstance = SVFootHillSessionCtrlJNI.SVFootHillSessionCtrlPtr.instance();
        this.f17015b = sVFootHillSessionCtrlPtrInstance;
        sVFootHillSessionCtrlPtrInstance.deallocate(false);
    }

    public static com.apple.android.music.playback.a.a a() {
        synchronized (com.apple.android.music.playback.a.a.class) {
            try {
                if (f17014a == null) {
                    f17014a = new a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f17014a;
    }

    @Override // com.apple.android.music.playback.a.a
    public String a(d dVar, String str, String str2, String str3, String str4, String str5, String str6, boolean z10) throws Throwable {
        if (this.f17015b == null) {
            return null;
        }
        byte[] bArrA = a(dVar, str6);
        if (bArrA != null && bArrA.length != 0) {
            SVData.SVDataPtr sVDataPtrGenerateSessionExchange = this.f17015b.generateSessionExchange(str, SVData.SVDataPtr.create(bArrA, bArrA.length, true), str2, str4);
            if (sVDataPtrGenerateSessionExchange != null && sVDataPtrGenerateSessionExchange.get() != null) {
                String strA = a(dVar, str, str2, sVDataPtrGenerateSessionExchange.get().toBytes(), str5, z10);
                if (strA != null && !strA.isEmpty()) {
                    if (this.f17015b.generateSessionContext(str, strA) != 0) {
                        return strA;
                    }
                    return null;
                }
            }
        }
        return "";
    }

    private byte[] a(d dVar, String str) throws Throwable {
        com.apple.android.music.playback.g.a aVar = new com.apple.android.music.playback.g.a(dVar, str);
        aVar.a();
        return aVar.b();
    }

    private String a(d dVar, String str, String str2, byte[] bArr, String str3, boolean z10) {
        com.apple.android.music.playback.g.d dVar2 = new com.apple.android.music.playback.g.d(dVar, str, str2, bArr, str3, z10);
        dVar2.a();
        e eVarB = dVar2.b();
        if (eVarB != null) {
            return eVarB.a();
        }
        return null;
    }
}
