package com.revenuecat.purchases.ui.revenuecatui.helpers;

import java.util.Iterator;
import p013a9.a;

/* JADX INFO: loaded from: classes2.dex */
public final class NonEmptySetKt$toNonEmptySetOrNull$$inlined$Iterable$1 implements Iterable, a {
    final /* synthetic */ Iterator $iterator$inlined;

    public NonEmptySetKt$toNonEmptySetOrNull$$inlined$Iterable$1(Iterator it) {
        this.$iterator$inlined = it;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.$iterator$inlined;
    }
}
