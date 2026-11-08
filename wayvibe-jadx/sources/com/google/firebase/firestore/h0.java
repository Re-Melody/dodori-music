package com.google.firebase.firestore;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends C1222s {
    @Override // com.google.firebase.firestore.C1222s
    public final HashMap a(r rVar) {
        R3.a.g(rVar, "Provided serverTimestampBehavior value must not be null.");
        HashMap mapA = super.a(rVar);
        p242x0.c.z("Data in a QueryDocumentSnapshot should be non-null", mapA != null, new Object[0]);
        return mapA;
    }

    @Override // com.google.firebase.firestore.C1222s
    public final Map b() {
        HashMap mapA = a(r.DEFAULT);
        p242x0.c.z("Data in a QueryDocumentSnapshot should be non-null", mapA != null, new Object[0]);
        return mapA;
    }
}
