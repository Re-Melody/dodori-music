package K1;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: renamed from: K1.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0620w implements InterfaceC0621x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScrollFeedbackProvider f7350a;

    public C0620w(NestedScrollView nestedScrollView) {
        this.f7350a = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // K1.InterfaceC0621x
    public final void a(int i10, int i11, int i12, boolean z10) {
        this.f7350a.onScrollLimit(i10, i11, i12, z10);
    }

    @Override // K1.InterfaceC0621x
    public final void l(int i10, int i11, int i12, int i13) {
        this.f7350a.onScrollProgress(i10, i11, i12, i13);
    }
}
