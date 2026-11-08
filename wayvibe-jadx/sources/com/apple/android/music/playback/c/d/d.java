package com.apple.android.music.playback.c.d;

import H4.k;

/* JADX INFO: loaded from: classes.dex */
final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f17216a;

    public d(k kVar) {
        this.f17216a = kVar;
    }

    @Override // com.apple.android.music.playback.c.d.b
    public String a() {
        return this.f17216a.f6018a;
    }

    @Override // com.apple.android.music.playback.c.d.b
    public String b() {
        return this.f17216a.f6021b;
    }

    @Override // com.apple.android.music.playback.c.d.b
    public byte[] c() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            return this.f17216a.equals(((d) obj).f17216a);
        }
        return false;
    }

    public int hashCode() {
        return this.f17216a.hashCode();
    }

    public String toString() {
        k kVar = this.f17216a;
        return kVar.f6018a + ": {description = " + kVar.f6021b + ", value = " + kVar.f6022c + "}";
    }
}
