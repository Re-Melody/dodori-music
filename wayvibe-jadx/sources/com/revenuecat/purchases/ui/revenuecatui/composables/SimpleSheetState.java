package com.revenuecat.purchases.ui.revenuecatui.composables;

import U.C0880d;
import U.InterfaceC0877b0;
import U.U;
import Z8.a;
import Z8.e;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class SimpleSheetState {
    public static final int $stable = 0;
    private final InterfaceC0877b0 backgroundBlur$delegate;
    private final InterfaceC0877b0 content$delegate;
    private final InterfaceC0877b0 contentKey$delegate;
    private a onDismiss;
    private final InterfaceC0877b0 visible$delegate;

    public SimpleSheetState() {
        Boolean bool = Boolean.FALSE;
        U u10 = U.f11815f;
        this.backgroundBlur$delegate = C0880d.K(bool, u10);
        this.content$delegate = C0880d.K(ComposableSingletons$SimpleBottomSheetScaffoldKt.INSTANCE.m538getLambda1$revenuecatui_defaultsRelease(), u10);
        this.contentKey$delegate = C0880d.K(null, u10);
        this.visible$delegate = C0880d.K(bool, u10);
    }

    private final void setBackgroundBlur(boolean z10) {
        this.backgroundBlur$delegate.setValue(Boolean.valueOf(z10));
    }

    private final void setContent(e eVar) {
        this.content$delegate.setValue(eVar);
    }

    private final void setContentKey(Object obj) {
        this.contentKey$delegate.setValue(obj);
    }

    private final void setVisible(boolean z10) {
        this.visible$delegate.setValue(Boolean.valueOf(z10));
    }

    public static /* synthetic */ void show$default(SimpleSheetState simpleSheetState, boolean z10, e eVar, Object obj, a aVar, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            obj = null;
        }
        if ((i10 & 8) != 0) {
            aVar = null;
        }
        simpleSheetState.show(z10, eVar, obj, aVar);
    }

    public final /* synthetic */ boolean getBackgroundBlur() {
        return ((Boolean) this.backgroundBlur$delegate.getValue()).booleanValue();
    }

    public final /* synthetic */ e getContent() {
        return (e) this.content$delegate.getValue();
    }

    public final /* synthetic */ Object getContentKey() {
        return this.contentKey$delegate.getValue();
    }

    public final /* synthetic */ boolean getVisible() {
        return ((Boolean) this.visible$delegate.getValue()).booleanValue();
    }

    public final void hide() {
        setBackgroundBlur(false);
        setVisible(false);
        a aVar = this.onDismiss;
        if (aVar != null) {
            aVar.invoke();
        }
        this.onDismiss = null;
    }

    public final void show(boolean z10, e content, Object obj, a aVar) {
        m.f(content, "content");
        setBackgroundBlur(z10);
        setContent(content);
        setContentKey(obj);
        this.onDismiss = aVar;
        setVisible(true);
    }
}
