package d9;

import G0.C0467f0;
import java.util.Random;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0467f0 f19428c = new C0467f0(10);

    @Override // d9.a
    public final Random m() {
        Object obj = this.f19428c.get();
        m.e(obj, "get(...)");
        return (Random) obj;
    }
}
