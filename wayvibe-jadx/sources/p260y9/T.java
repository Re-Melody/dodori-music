package p260y9;

import kotlin.jvm.internal.m;
import p240w9.g;

/* JADX INFO: loaded from: classes2.dex */
public final class T extends H {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f29258b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(g primitive) {
        super(primitive);
        m.f(primitive, "primitive");
        this.f29258b = primitive.a() + "Array";
    }

    @Override // p240w9.g
    public final String a() {
        return this.f29258b;
    }
}
