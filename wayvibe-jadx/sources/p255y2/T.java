package p255y2;

import A6.C;
import A6.E;
import A6.W;
import U2.j;
import com.google.android.gms.common.api.f;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28814a = f.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28815b = f.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28816c = f.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f28817d = f.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f28818e = f.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f28819f = f.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f28820g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public W f28821h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public W f28822i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f28823j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public W f28824l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public S f28825m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public W f28826n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f28827o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public HashMap f28828p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public HashSet f28829q;

    public T() {
        C c3 = E.f299b;
        W w10 = W.f329e;
        this.f28821h = w10;
        this.f28822i = w10;
        this.f28823j = f.API_PRIORITY_OTHER;
        this.k = f.API_PRIORITY_OTHER;
        this.f28824l = w10;
        this.f28825m = S.f28810d;
        this.f28826n = w10;
        this.f28827o = 0;
        this.f28828p = new HashMap();
        this.f28829q = new HashSet();
    }

    public final void a(j jVar) {
        this.f28814a = jVar.f28830a;
        this.f28815b = jVar.f28831b;
        this.f28816c = jVar.f28832c;
        this.f28817d = jVar.f28833d;
        this.f28818e = jVar.f28834e;
        this.f28819f = jVar.f28835f;
        this.f28820g = jVar.f28836g;
        this.f28821h = jVar.f28837h;
        this.f28822i = jVar.f28838i;
        this.f28823j = jVar.f28839j;
        this.k = jVar.k;
        this.f28824l = jVar.f28840l;
        this.f28825m = jVar.f28841m;
        this.f28826n = jVar.f28842n;
        this.f28827o = jVar.f28843o;
        this.f28829q = new HashSet(jVar.f28845q);
        this.f28828p = new HashMap(jVar.f28844p);
    }

    public T b(int i10, int i11) {
        this.f28818e = i10;
        this.f28819f = i11;
        this.f28820g = true;
        return this;
    }
}
