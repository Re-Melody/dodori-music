package p083h7;

import java.util.Map;
import p062f7.b;
import p062f7.d;
import p062f7.e;
import p095i7.f;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20320a;

    @Override // p062f7.a
    public final void a(Object obj, Object obj2) {
        switch (this.f20320a) {
            case 0:
                throw new b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                e eVar = (e) obj2;
                eVar.b(f.f20536g, entry.getKey());
                eVar.b(f.f20537h, entry.getValue());
                return;
            default:
                throw new b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
