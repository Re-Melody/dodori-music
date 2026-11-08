package W6;

import android.content.Context;
import p023b7.r;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements p227v7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12858c;

    public /* synthetic */ d(int i10, Object obj, Object obj2) {
        this.f12856a = i10;
        this.f12857b = obj;
        this.f12858c = obj2;
    }

    @Override // p227v7.b
    public final Object get() {
        switch (this.f12856a) {
            case 0:
                h hVar = (h) this.f12857b;
                return new p238w7.a((Context) this.f12858c, hVar.f(), (p106j7.b) hVar.f12867d.a(p106j7.b.class));
            case 1:
                p023b7.f fVar = (p023b7.f) this.f12857b;
                fVar.getClass();
                p023b7.a aVar = (p023b7.a) this.f12858c;
                return aVar.f15775e.b(new r(aVar, fVar));
            default:
                return new p217u7.h((Context) this.f12858c, (String) this.f12857b);
        }
    }

    public /* synthetic */ d(Context context, String str) {
        this.f12856a = 2;
        this.f12858c = context;
        this.f12857b = str;
    }
}
