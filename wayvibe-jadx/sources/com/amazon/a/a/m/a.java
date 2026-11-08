package com.amazon.a.a.m;

import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends com.amazon.a.a.e.a<a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f16226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Date f16227c;

    public a(Object obj, Date date) {
        this.f16226b = obj;
        this.f16227c = date;
    }

    @Override // com.amazon.a.a.e.a
    public final Date a() {
        return this.f16227c;
    }

    public final Object h() {
        return this.f16226b;
    }
}
