package com.google.android.gms.common.api;

/* JADX INFO: loaded from: classes.dex */
public class j extends Exception {

    @Deprecated
    protected final Status mStatus;

    public j(Status status) {
        int i10 = status.f17834a;
        String str = status.f17835b;
        str = str == null ? "" : str;
        StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 2 + String.valueOf(str).length());
        sb.append(i10);
        sb.append(": ");
        sb.append(str);
        super(sb.toString());
        this.mStatus = status;
    }

    public Status getStatus() {
        return this.mStatus;
    }

    public int getStatusCode() {
        return this.mStatus.f17834a;
    }

    @Deprecated
    public String getStatusMessage() {
        return this.mStatus.f17835b;
    }
}
