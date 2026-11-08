package L3;

import K1.C0597b;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;

/* JADX INFO: loaded from: classes.dex */
public final class E extends C0597b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f7680e;

    public /* synthetic */ E(View view, int i10) {
        this.f7679d = i10;
        this.f7680e = view;
    }

    @Override // K1.C0597b
    public void b(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f7679d) {
            case 1:
                super.b(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f7680e).f18209d);
                break;
            default:
                super.b(view, accessibilityEvent);
                break;
        }
    }

    @Override // K1.C0597b
    public final void c(View view, L1.f fVar) {
        switch (this.f7679d) {
            case 0:
                this.f7267a.onInitializeAccessibilityNodeInfo(view, fVar.f7483a);
                F f10 = (F) this.f7680e;
                if (!f10.f7681d.n()) {
                    RecyclerView recyclerView = f10.f7681d;
                    if (recyclerView.getLayoutManager() != null) {
                        recyclerView.getLayoutManager().getClass();
                        RecyclerView.l(view);
                    }
                }
                break;
            case 1:
                View.AccessibilityDelegate accessibilityDelegate = this.f7267a;
                AccessibilityNodeInfo accessibilityNodeInfo = fVar.f7483a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setChecked(((CheckableImageButton) this.f7680e).f18209d);
                break;
            default:
                View.AccessibilityDelegate accessibilityDelegate2 = this.f7267a;
                AccessibilityNodeInfo accessibilityNodeInfo2 = fVar.f7483a;
                accessibilityDelegate2.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCheckable(((NavigationMenuItemView) this.f7680e).f18218x);
                break;
        }
    }

    @Override // K1.C0597b
    public boolean d(View view, int i10, Bundle bundle) {
        switch (this.f7679d) {
            case 0:
                if (super.d(view, i10, bundle)) {
                    return true;
                }
                F f10 = (F) this.f7680e;
                if (!f10.f7681d.n()) {
                    RecyclerView recyclerView = f10.f7681d;
                    if (recyclerView.getLayoutManager() != null) {
                        A0.e eVar = recyclerView.getLayoutManager().f7764b.f15649a;
                    }
                }
                return false;
            default:
                return super.d(view, i10, bundle);
        }
    }

    public E(F f10) {
        this.f7679d = 0;
        this.f7680e = f10;
    }
}
