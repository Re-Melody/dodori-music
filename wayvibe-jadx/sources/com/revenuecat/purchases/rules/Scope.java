package com.revenuecat.purchases.rules;

import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class Scope {
    private final Value current;
    private final Value root;

    private Scope(Value value, Value value2) {
        this.current = value;
        this.root = value2;
    }

    public final Value getCurrent() {
        return this.current;
    }

    public final Value getRoot() {
        return this.root;
    }

    public final Scope scoped(Value current) {
        m.f(current, "current");
        return new Scope(current, this.root);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Scope(Value root) {
        this(root, root);
        m.f(root, "root");
    }
}
