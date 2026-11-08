package com.google.firebase.firestore;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Executor f18572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p031c5.a f18573b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || T.class != obj.getClass()) {
            return false;
        }
        return this.f18573b.equals(((T) obj).f18573b);
    }

    public final int hashCode() {
        return this.f18573b.hashCode();
    }
}
