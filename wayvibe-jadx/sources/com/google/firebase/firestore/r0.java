package com.google.firebase.firestore;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double[] f18635a;

    public r0(double[] dArr) {
        this.f18635a = (double[]) dArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r0.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f18635a, ((r0) obj).f18635a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f18635a);
    }
}
