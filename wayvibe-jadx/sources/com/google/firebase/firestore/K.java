package com.google.firebase.firestore;

/* JADX INFO: loaded from: classes.dex */
public final class K extends W6.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J f18552a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(String str, J j10, Exception exc) {
        super(str, exc);
        com.google.android.gms.common.internal.E.f(str, "Detail message must not be empty");
        R3.a.g(str, "Provided message must not be null.");
        p242x0.c.z("A FirebaseFirestoreException should never be thrown for OK", j10 != J.OK, new Object[0]);
        R3.a.g(j10, "Provided code must not be null.");
        this.f18552a = j10;
    }

    public K(String str, J j10) {
        super(str);
        R3.a.g(str, "Provided message must not be null.");
        p242x0.c.z("A FirebaseFirestoreException should never be thrown for OK", j10 != J.OK, new Object[0]);
        R3.a.g(j10, "Provided code must not be null.");
        this.f18552a = j10;
    }
}
