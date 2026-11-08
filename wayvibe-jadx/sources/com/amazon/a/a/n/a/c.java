package com.amazon.a.a.n.a;

import android.os.Binder;
import android.os.RemoteException;
import com.amazon.d.a.j;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f16266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RemoteException f16267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private j f16268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.amazon.d.a.h f16269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.amazon.d.a.f f16270e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.amazon.d.a.g f16271f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f16272g = Binder.getCallingUid();

    public c(j jVar) {
        this.f16268c = jVar;
        try {
            this.f16266a = jVar.a();
        } catch (RemoteException e2) {
            this.f16267b = e2;
        }
    }

    public String a() throws RemoteException {
        RemoteException remoteException = this.f16267b;
        if (remoteException == null) {
            return this.f16266a;
        }
        throw remoteException;
    }

    public j b() {
        return this.f16268c;
    }

    public com.amazon.d.a.h c() {
        return this.f16269d;
    }

    public com.amazon.d.a.f d() {
        return this.f16270e;
    }

    public com.amazon.d.a.g e() {
        return this.f16271f;
    }

    public int f() {
        return this.f16272g;
    }

    public String toString() {
        return "CommandResult: [CallingUid: " + this.f16272g + ", SuccessResult: " + this.f16268c + ", FailureResult: " + this.f16269d + ", DecisionResult: " + this.f16270e + ", ExceptionResult: " + this.f16271f + "]";
    }

    public c(com.amazon.d.a.h hVar) {
        this.f16269d = hVar;
        try {
            this.f16266a = hVar.a();
        } catch (RemoteException e2) {
            this.f16267b = e2;
        }
    }

    public c(com.amazon.d.a.f fVar) {
        this.f16270e = fVar;
        try {
            this.f16266a = fVar.a();
        } catch (RemoteException e2) {
            this.f16267b = e2;
        }
    }

    public c(com.amazon.d.a.g gVar) {
        this.f16271f = gVar;
    }
}
