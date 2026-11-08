package com.google.android.gms.internal.p000authapi;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zbbi extends zbbj {
    final transient int zba;
    final transient int zbb;
    final /* synthetic */ zbbj zbc;

    public zbbi(zbbj zbbjVar, int i10, int i11) {
        Objects.requireNonNull(zbbjVar);
        this.zbc = zbbjVar;
        this.zba = i10;
        this.zbb = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zbbd.zba(i10, this.zbb, "index");
        return this.zbc.get(i10 + this.zba);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zbb;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbbg
    public final Object[] zbb() {
        return this.zbc.zbb();
    }

    @Override // com.google.android.gms.internal.p000authapi.zbbg
    public final int zbc() {
        return this.zbc.zbc() + this.zba;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbbg
    public final int zbd() {
        return this.zbc.zbc() + this.zba + this.zbb;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbbg
    public final boolean zbf() {
        return true;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbbj, java.util.List
    /* JADX INFO: renamed from: zbh, reason: merged with bridge method [inline-methods] */
    public final zbbj subList(int i10, int i11) {
        zbbd.zbc(i10, i11, this.zbb);
        int i12 = this.zba;
        return this.zbc.subList(i10 + i12, i11 + i12);
    }
}
