package com.apple.android.music.playback.c.d;

import H4.l;

/* JADX INFO: loaded from: classes.dex */
final class e implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f17217a;

    public e(l lVar) {
        this.f17217a = lVar;
    }

    @Override // com.apple.android.music.playback.c.d.b
    public String a() {
        return this.f17217a.f6018a;
    }

    @Override // com.apple.android.music.playback.c.d.b
    public String b() {
        return this.f17217a.f6023b;
    }

    @Override // com.apple.android.music.playback.c.d.b
    public byte[] c() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.f17217a.equals(((e) obj).f17217a);
        }
        return false;
    }

    public int hashCode() {
        return this.f17217a.hashCode();
    }

    public String toString() {
        l lVar = this.f17217a;
        return lVar.f6018a + ": {description = " + lVar.f6023b + ", url = " + lVar.f6024c + "}";
    }
}
