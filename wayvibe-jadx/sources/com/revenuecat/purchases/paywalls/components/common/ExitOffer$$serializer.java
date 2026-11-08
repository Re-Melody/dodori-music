package com.revenuecat.purchases.paywalls.components.common;

import A9.o;
import M8.InterfaceC0641c;
import kotlin.jvm.internal.m;
import p219u9.a;
import p240w9.g;
import p251x9.b;
import p251x9.c;
import p251x9.d;
import p260y9.InterfaceC2389z;
import p260y9.O;
import p260y9.Q;
import p260y9.c0;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC0641c
public final class ExitOffer$$serializer implements InterfaceC2389z {
    public static final ExitOffer$$serializer INSTANCE;
    private static final /* synthetic */ Q descriptor;

    static {
        ExitOffer$$serializer exitOffer$$serializer = new ExitOffer$$serializer();
        INSTANCE = exitOffer$$serializer;
        Q q5 = new Q("com.revenuecat.purchases.paywalls.components.common.ExitOffer", exitOffer$$serializer, 1);
        q5.k("offering_id", false);
        descriptor = q5;
    }

    private ExitOffer$$serializer() {
    }

    @Override // p260y9.InterfaceC2389z
    public a[] childSerializers() {
        return new a[]{c0.f29272a};
    }

    @Override // p219u9.a
    public ExitOffer deserialize(c decoder) {
        m.f(decoder, "decoder");
        g descriptor2 = getDescriptor();
        p251x9.a aVarA = decoder.a(descriptor2);
        boolean z10 = true;
        int i10 = 0;
        String strW = null;
        while (z10) {
            int iQ = aVarA.q(descriptor2);
            if (iQ == -1) {
                z10 = false;
            } else {
                if (iQ != 0) {
                    throw new o(iQ);
                }
                strW = aVarA.w(descriptor2, 0);
                i10 = 1;
            }
        }
        aVarA.c(descriptor2);
        return new ExitOffer(i10, strW, null);
    }

    @Override // p219u9.a
    public g getDescriptor() {
        return descriptor;
    }

    @Override // p219u9.a
    public void serialize(d encoder, ExitOffer value) {
        m.f(encoder, "encoder");
        m.f(value, "value");
        g descriptor2 = getDescriptor();
        b bVarA = encoder.a(descriptor2);
        bVarA.u(descriptor2, 0, value.offeringId);
        bVarA.c(descriptor2);
    }

    @Override // p260y9.InterfaceC2389z
    public a[] typeParametersSerializers() {
        return O.f29245b;
    }
}
