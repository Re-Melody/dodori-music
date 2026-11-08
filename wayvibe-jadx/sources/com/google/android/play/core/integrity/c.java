package com.google.android.play.core.integrity;

/* JADX INFO: loaded from: classes.dex */
final class c extends StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f18344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte f18345b;

    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder a(int i10) {
        this.f18345b = (byte) (this.f18345b | 2);
        return this;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest build() {
        if (this.f18345b == 3) {
            return new e(this.f18344a, 0, null);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f18345b & 1) == 0) {
            sb.append(" cloudProjectNumber");
        }
        if ((this.f18345b & 2) == 0) {
            sb.append(" webViewRequestMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder setCloudProjectNumber(long j10) {
        this.f18344a = j10;
        this.f18345b = (byte) (this.f18345b | 1);
        return this;
    }
}
