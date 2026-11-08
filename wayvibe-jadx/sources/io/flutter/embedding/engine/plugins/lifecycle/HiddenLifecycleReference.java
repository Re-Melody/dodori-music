package io.flutter.embedding.engine.plugins.lifecycle;

import androidx.annotation.Keep;
import androidx.lifecycle.AbstractC1121p;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class HiddenLifecycleReference {
    private final AbstractC1121p lifecycle;

    public HiddenLifecycleReference(AbstractC1121p abstractC1121p) {
        this.lifecycle = abstractC1121p;
    }

    public AbstractC1121p getLifecycle() {
        return this.lifecycle;
    }
}
