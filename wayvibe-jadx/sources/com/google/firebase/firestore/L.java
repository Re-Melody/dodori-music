package com.google.firebase.firestore;

/* JADX INFO: loaded from: classes.dex */
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f18554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f18556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f18557e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f18558f;

    public L(boolean z10, boolean z11, String prettyPrintIndent, String classDiscriminator, boolean z12) {
        this.f18553a = 1;
        kotlin.jvm.internal.m.f(prettyPrintIndent, "prettyPrintIndent");
        kotlin.jvm.internal.m.f(classDiscriminator, "classDiscriminator");
        this.f18554b = z10;
        this.f18555c = z11;
        this.f18556d = prettyPrintIndent;
        this.f18558f = classDiscriminator;
        this.f18557e = z12;
    }

    public M a() {
        if (this.f18554b || !this.f18556d.equals("firestore.googleapis.com")) {
            return new M(this);
        }
        throw new IllegalStateException("You can't set the 'sslEnabled' setting unless you also set a non-default 'host'.");
    }

    public void b(X x10) {
        if (this.f18557e) {
            throw new IllegalStateException("Deprecated setPersistenceEnabled() or setCacheSizeBytes() is already used, remove those first.");
        }
        if (!(x10 instanceof Y) && !(x10 instanceof b0)) {
            throw new IllegalArgumentException("Only MemoryCacheSettings and PersistentCacheSettings are accepted");
        }
        this.f18558f = x10;
    }

    public String toString() {
        switch (this.f18553a) {
            case 1:
                return "JsonConfiguration(encodeDefaults=false, ignoreUnknownKeys=" + this.f18554b + ", isLenient=false, allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=" + this.f18555c + ", prettyPrintIndent='" + this.f18556d + "', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='" + ((String) this.f18558f) + "', allowSpecialFloatingPointValues=false, useAlternativeNames=" + this.f18557e + ", namingStrategy=null)";
            default:
                return super.toString();
        }
    }

    public L() {
        this.f18553a = 0;
        this.f18557e = false;
        this.f18556d = "firestore.googleapis.com";
        this.f18554b = true;
        this.f18555c = true;
    }
}
