package com.revenuecat.purchases.ui.revenuecatui.composables;

import B8.V;
import M8.D;
import Z8.c;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import p080h4.f;

/* JADX INFO: loaded from: classes2.dex */
public final class RemoteImageKt$AsyncImage$1$1 extends n implements c {
    final /* synthetic */ c $onError;
    final /* synthetic */ ImageSource $source;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteImageKt$AsyncImage$1$1(ImageSource imageSource, c cVar) {
        super(1);
        this.$source = imageSource;
        this.$onError = cVar;
    }

    @Override // Z8.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((f) obj);
        return D.f8402a;
    }

    public final void invoke(f it) {
        String str;
        m.f(it, "it");
        ImageSource imageSource = this.$source;
        if (imageSource instanceof ImageSource.Local) {
            str = "Error loading local image: '" + ((ImageSource.Local) this.$source).getResource() + '\'';
        } else {
            if (!(imageSource instanceof ImageSource.Remote)) {
                throw new V();
            }
            str = "Error loading image from '" + ((ImageSource.Remote) this.$source).getUrlString() + '\'';
        }
        Logger.INSTANCE.e(str, it.f20268b.f25903c);
        c cVar = this.$onError;
        if (cVar != null) {
            cVar.invoke(it);
        }
    }
}
