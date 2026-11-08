package com.revenuecat.purchases.common.networking;

import kotlin.jvm.internal.n;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class HTTPResult$body$2 extends n implements Z8.a {
    final /* synthetic */ HTTPResult this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HTTPResult$body$2(HTTPResult hTTPResult) {
        super(0);
        this.this$0 = hTTPResult;
    }

    @Override // Z8.a
    public final JSONObject invoke() {
        return this.this$0.parseBody();
    }
}
