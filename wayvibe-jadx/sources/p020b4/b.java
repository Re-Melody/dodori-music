package p020b4;

import M8.D;
import Z8.c;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.extensions.MulticastConsumer;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b extends j implements c {
    @Override // Z8.c
    public final Object invoke(Object obj) {
        WindowLayoutInfo p10 = (WindowLayoutInfo) obj;
        m.f(p10, "p0");
        ((MulticastConsumer) this.receiver).accept(p10);
        return D.f8402a;
    }
}
