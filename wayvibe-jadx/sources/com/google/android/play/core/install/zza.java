package com.google.android.play.core.install;

/* JADX INFO: loaded from: classes.dex */
public final class zza {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f18240e;

    public zza(int i10, long j10, long j11, int i11, String str) {
        this.f18236a = i10;
        this.f18237b = j10;
        this.f18238c = j11;
        this.f18239d = i11;
        if (str == null) {
            throw new NullPointerException("Null packageName");
        }
        this.f18240e = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zza) {
            zza zzaVar = (zza) obj;
            if (this.f18236a == zzaVar.f18236a && this.f18237b == zzaVar.f18237b && this.f18238c == zzaVar.f18238c && this.f18239d == zzaVar.f18239d && this.f18240e.equals(zzaVar.f18240e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f18236a ^ 1000003;
        long j10 = this.f18237b;
        long j11 = this.f18238c;
        return (((((((i10 * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f18239d) * 1000003) ^ this.f18240e.hashCode();
    }

    public final String toString() {
        return "InstallState{installStatus=" + this.f18236a + ", bytesDownloaded=" + this.f18237b + ", totalBytesToDownload=" + this.f18238c + ", installErrorCode=" + this.f18239d + ", packageName=" + this.f18240e + "}";
    }
}
