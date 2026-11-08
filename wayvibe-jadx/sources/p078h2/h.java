package p078h2;

import Y4.f;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.AbstractC1121p;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1125u;

/* JADX INFO: loaded from: classes.dex */
public final class h implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC1121p f20190a;

    public h(EmojiCompatInitializer emojiCompatInitializer, AbstractC1121p abstractC1121p) {
        this.f20190a = abstractC1121p;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(InterfaceC1125u interfaceC1125u) {
        (Build.VERSION.SDK_INT >= 28 ? a.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new f(4), 500L);
        this.f20190a.removeObserver(this);
    }
}
