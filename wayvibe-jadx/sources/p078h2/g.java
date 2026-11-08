package p078h2;

import Ca.C0168a;
import D8.RunnableC0269e;
import J1.e;
import U.W0;
import W9.j;
import Z4.C0968a;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p050e5.f;
import p090i2.b;
import p199t.C2231f;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f20180j = new Object();
    public static volatile g k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f20181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2231f f20182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f20183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f20184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0968a f20185e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f20186f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f20187g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f20188h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c f20189i;

    public g(n nVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f20181a = reentrantReadWriteLock;
        this.f20183c = 3;
        f fVar = nVar.f20205a;
        this.f20186f = fVar;
        int i10 = nVar.f20206b;
        this.f20188h = i10;
        this.f20189i = nVar.f20207c;
        this.f20184d = new Handler(Looper.getMainLooper());
        this.f20182b = new C2231f(0);
        this.f20187g = new f(28);
        C0968a c0968a = new C0968a(this);
        this.f20185e = c0968a;
        reentrantReadWriteLock.writeLock().lock();
        if (i10 == 0) {
            try {
                this.f20183c = 0;
            } catch (Throwable th) {
                this.f20181a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                fVar.a(new d(c0968a));
            } catch (Throwable th2) {
                e(th2);
            }
        }
    }

    public static g a() {
        g gVar;
        synchronized (f20180j) {
            try {
                gVar = k;
                if (!(gVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    public static boolean c() {
        return k != null;
    }

    public final int b() {
        this.f20181a.readLock().lock();
        try {
            return this.f20183c;
        } finally {
            this.f20181a.readLock().unlock();
        }
    }

    public final void d() {
        if (!(this.f20188h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.f20181a.writeLock().lock();
        try {
            if (this.f20183c == 0) {
                this.f20181a.writeLock().unlock();
                return;
            }
            this.f20183c = 0;
            this.f20181a.writeLock().unlock();
            C0968a c0968a = this.f20185e;
            g gVar = (g) c0968a.f13721a;
            try {
                gVar.f20186f.a(new d(c0968a));
            } catch (Throwable th) {
                gVar.e(th);
            }
        } catch (Throwable th2) {
            this.f20181a.writeLock().unlock();
            throw th2;
        }
    }

    public final void e(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f20181a.writeLock().lock();
        try {
            this.f20183c = 2;
            arrayList.addAll(this.f20182b);
            this.f20182b.clear();
            this.f20181a.writeLock().unlock();
            this.f20184d.post(new RunnableC0269e(arrayList, this.f20183c, th));
        } catch (Throwable th2) {
            this.f20181a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x009f A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:38:0x005a, B:41:0x005f, B:43:0x0063, B:45:0x0070, B:52:0x008f, B:54:0x0099, B:56:0x009c, B:58:0x009f, B:60:0x00af, B:61:0x00b2), top: B:101:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00af A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:38:0x005a, B:41:0x005f, B:43:0x0063, B:45:0x0070, B:52:0x008f, B:54:0x0099, B:56:0x009c, B:58:0x009f, B:60:0x00af, B:61:0x00b2), top: B:101:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ff  */
    public final CharSequence f(int i10, int i11, int i12, CharSequence charSequence) throws Throwable {
        Throwable th;
        CharSequence charSequence2;
        int i13;
        int i14;
        s[] sVarArr;
        int spanStart;
        if (!(b() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        if (!(i10 <= i11)) {
            throw new IllegalArgumentException("start should be <= than end");
        }
        u uVar = null;
        if (charSequence == null) {
            return null;
        }
        if (!(i10 <= charSequence.length())) {
            throw new IllegalArgumentException("start should be < than charSequence length");
        }
        if (!(i11 <= charSequence.length())) {
            throw new IllegalArgumentException("end should be < than charSequence length");
        }
        if (charSequence.length() == 0 || i10 == i11) {
            return charSequence;
        }
        boolean z10 = i12 == 1;
        W0 w10 = (W0) this.f20185e.f13722b;
        w10.getClass();
        boolean z11 = charSequence instanceof q;
        if (z11) {
            ((q) charSequence).a();
        }
        if (z11) {
            uVar = new u((Spannable) charSequence);
            if (uVar != null) {
                for (s sVar : sVarArr) {
                    spanStart = uVar.f20224b.getSpanStart(sVar);
                    int spanEnd = uVar.f20224b.getSpanEnd(sVar);
                    if (spanStart != i11) {
                        uVar.removeSpan(sVar);
                    }
                    i10 = Math.min(spanStart, i10);
                    i11 = Math.max(spanEnd, i11);
                }
            }
            i13 = i10;
            i14 = i11;
            if (i13 != i14) {
                charSequence2 = charSequence;
                if (!z11) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                if (!z11) {
                    return charSequence2;
                }
            }
            ((q) charSequence2).b();
            return charSequence2;
        }
        try {
            if (charSequence instanceof Spannable) {
                try {
                    uVar = new u((Spannable) charSequence);
                } catch (Throwable th2) {
                    th = th2;
                    charSequence2 = charSequence;
                    th = th;
                    if (!z11) {
                        throw th;
                    }
                    ((q) charSequence2).b();
                    throw th;
                }
            } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i10 - 1, i11 + 1, s.class) <= i11) {
                uVar = new u();
                uVar.f20223a = false;
                uVar.f20224b = new SpannableString(charSequence);
            }
            if (uVar != null && (sVarArr = (s[]) uVar.f20224b.getSpans(i10, i11, s.class)) != null && sVarArr.length > 0) {
                while (i < r3) {
                    spanStart = uVar.f20224b.getSpanStart(sVar);
                    int spanEnd2 = uVar.f20224b.getSpanEnd(sVar);
                    if (spanStart != i11) {
                        uVar.removeSpan(sVar);
                    }
                    i10 = Math.min(spanStart, i10);
                    i11 = Math.max(spanEnd2, i11);
                }
            }
            i13 = i10;
            i14 = i11;
            if (i13 != i14 || i13 >= charSequence.length()) {
                charSequence2 = charSequence;
                if (!z11) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                try {
                    u uVar2 = (u) w10.w(charSequence2, i13, i14, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, z10, new j(12, uVar, (f) w10.f11833c));
                    if (uVar2 != null) {
                        Spannable spannable = uVar2.f20224b;
                        if (z11) {
                            ((q) charSequence2).b();
                        }
                        return spannable;
                    }
                    if (!z11) {
                        return charSequence2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    if (!z11) {
                        throw th;
                    }
                    ((q) charSequence2).b();
                    throw th;
                }
            }
            ((q) charSequence2).b();
            return charSequence2;
        } catch (Throwable th4) {
            th = th4;
            charSequence2 = charSequence;
        }
        if (!z11) {
            throw th;
        }
        ((q) charSequence2).b();
        throw th;
    }

    public final void g(e eVar) {
        e.b(eVar, "initCallback cannot be null");
        this.f20181a.writeLock().lock();
        try {
            if (this.f20183c == 1 || this.f20183c == 2) {
                this.f20184d.post(new RunnableC0269e(Arrays.asList(eVar), this.f20183c, (Throwable) null));
            } else {
                this.f20182b.add(eVar);
            }
        } finally {
            this.f20181a.writeLock().unlock();
        }
    }

    public final void h(EditorInfo editorInfo) {
        if (b() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        C0968a c0968a = this.f20185e;
        c0968a.getClass();
        Bundle bundle = editorInfo.extras;
        b bVar = (b) ((C0168a) c0968a.f13723c).f1501b;
        int iA = bVar.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? ((ByteBuffer) bVar.f7243d).getInt(iA + bVar.f7240a) : 0);
        Bundle bundle2 = editorInfo.extras;
        ((g) c0968a.f13721a).getClass();
        bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
