package com.apple.android.music.playback.c.d;

import H4.j;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f17215a;

    public c(j jVar) {
        this.f17215a = jVar;
    }

    @Override // com.apple.android.music.playback.c.d.b
    public String a() {
        return this.f17215a.f6018a;
    }

    @Override // com.apple.android.music.playback.c.d.b
    public String b() {
        return this.f17215a.f6019b;
    }

    @Override // com.apple.android.music.playback.c.d.b
    public byte[] c() {
        return this.f17215a.f6020c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.f17215a.equals(((c) obj).f17215a);
        }
        return false;
    }

    public int hashCode() {
        return this.f17215a.hashCode();
    }

    public String toString() {
        j jVar = this.f17215a;
        return jVar.f6018a + ": {owner = " + jVar.f6019b + ", data = " + Arrays.toString(jVar.f6020c) + "}";
    }
}
