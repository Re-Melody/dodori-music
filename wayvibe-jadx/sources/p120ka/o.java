package p120ka;

import B8.C0116c;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final GestureDetector f21847i;

    public o(Context context, C0116c c0116c) {
        super(context, c0116c);
        this.f21847i = new GestureDetector(context, new m(this));
    }

    @Override // p120ka.a
    public final boolean a(MotionEvent motionEvent) {
        return this.f21847i.onTouchEvent(motionEvent);
    }
}
