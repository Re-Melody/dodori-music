package p085h9;

import Z8.c;
import java.util.Iterator;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f20354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f20355c;

    public g(h hVar, c transformer, int i10) {
        this.f20353a = i10;
        switch (i10) {
            case 1:
                m.f(transformer, "transformer");
                this.f20354b = hVar;
                this.f20355c = transformer;
                break;
            default:
                k kVar = k.f20359a;
                m.f(transformer, "transformer");
                this.f20354b = hVar;
                this.f20355c = transformer;
                break;
        }
    }

    @Override // p085h9.h
    public final Iterator iterator() {
        switch (this.f20353a) {
            case 0:
                return new e(this);
            default:
                return new m(this);
        }
    }
}
