package com.revenuecat.purchases.paywalls.components.common;

import kotlin.jvm.internal.m;
import p219u9.a;
import p240w9.g;
import p251x9.c;
import p251x9.d;
import p270z9.C;
import p270z9.i;
import p270z9.k;
import p270z9.y;

/* JADX INFO: loaded from: classes2.dex */
public final class StateUpdateSerializer implements a {
    private static final String KEY_SET = "set";
    private static final String KEY_TO = "to";
    public static final StateUpdateSerializer INSTANCE = new StateUpdateSerializer();
    private static final g descriptor = y.Companion.serializer().getDescriptor();

    private StateUpdateSerializer() {
    }

    @Override // p219u9.a
    public g getDescriptor() {
        return descriptor;
    }

    @Override // p219u9.a
    public StateUpdate deserialize(c decoder) {
        String strA;
        m.f(decoder, "decoder");
        i iVar = decoder instanceof i ? (i) decoder : null;
        if (iVar == null) {
            return StateUpdate.Unsupported.INSTANCE;
        }
        k kVarM = iVar.m();
        y yVar = kVarM instanceof y ? (y) kVarM : null;
        if (yVar == null) {
            return StateUpdate.Unsupported.INSTANCE;
        }
        Object obj = yVar.get(KEY_SET);
        C c3 = obj instanceof C ? (C) obj : null;
        if (c3 != null) {
            if (!c3.c()) {
                c3 = null;
            }
            if (c3 != null && (strA = c3.a()) != null) {
                Object obj2 = yVar.get(KEY_TO);
                C c9 = obj2 instanceof C ? (C) obj2 : null;
                if (c9 == null) {
                    return StateUpdate.Unsupported.INSTANCE;
                }
                return new StateUpdate.Set(strA, (c9.c() && m.b(c9.a(), "$value")) ? StateUpdateValue.PayloadReference.INSTANCE : new StateUpdateValue.Literal(c9));
            }
        }
        return StateUpdate.Unsupported.INSTANCE;
    }

    @Override // p219u9.a
    public void serialize(d encoder, StateUpdate value) {
        m.f(encoder, "encoder");
        m.f(value, "value");
        throw new M8.k("Serialization is not implemented because it is not needed.");
    }
}
