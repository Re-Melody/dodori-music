package com.revenuecat.purchases.utils.serializers;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import p219u9.a;
import p219u9.e;
import p240w9.g;
import p251x9.c;
import p251x9.d;
import p270z9.i;
import p270z9.k;
import p270z9.y;

/* JADX INFO: loaded from: classes2.dex */
public abstract class EmptyObjectToNullSerializer<T> implements a {
    private final a delegate;
    private final g descriptor;
    private final boolean resilient;

    public EmptyObjectToNullSerializer(a delegate, boolean z10) {
        m.f(delegate, "delegate");
        this.delegate = delegate;
        this.resilient = z10;
        this.descriptor = delegate.getDescriptor();
    }

    @Override // p219u9.a
    public T deserialize(c decoder) {
        m.f(decoder, "decoder");
        i iVar = decoder instanceof i ? (i) decoder : null;
        if (iVar == null) {
            return (T) this.delegate.deserialize(decoder);
        }
        k kVarM = iVar.m();
        if ((kVarM instanceof y) && !((y) kVarM).f29953a.isEmpty()) {
            if (!this.resilient) {
                return (T) iVar.d().a(this.delegate, kVarM);
            }
            try {
                return (T) iVar.d().a(this.delegate, kVarM);
            } catch (e unused) {
            }
        }
        return null;
    }

    @Override // p219u9.a
    public g getDescriptor() {
        return this.descriptor;
    }

    @Override // p219u9.a
    public void serialize(d encoder, T t10) {
        m.f(encoder, "encoder");
        if (t10 != null) {
            this.delegate.serialize(encoder, t10);
        }
    }

    public /* synthetic */ EmptyObjectToNullSerializer(a aVar, boolean z10, int i10, f fVar) {
        this(aVar, (i10 & 2) != 0 ? true : z10);
    }
}
