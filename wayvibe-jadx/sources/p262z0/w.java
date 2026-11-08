package p262z0;

import M8.D;
import Z8.c;
import android.view.MotionEvent;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class w extends n implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f29793b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(x xVar, int i10) {
        super(1);
        this.f29792a = i10;
        this.f29793b = xVar;
    }

    @Override // Z8.c
    public final Object invoke(Object obj) {
        switch (this.f29792a) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) obj;
                f1.c cVar = this.f29793b.f29794a;
                if (cVar != null) {
                    cVar.invoke(motionEvent);
                    return D.f8402a;
                }
                m.l("onTouchEvent");
                throw null;
            default:
                MotionEvent motionEvent2 = (MotionEvent) obj;
                f1.c cVar2 = this.f29793b.f29794a;
                if (cVar2 != null) {
                    cVar2.invoke(motionEvent2);
                    return D.f8402a;
                }
                m.l("onTouchEvent");
                throw null;
        }
    }
}
