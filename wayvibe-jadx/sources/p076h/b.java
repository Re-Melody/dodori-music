package p076h;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public abstract Intent createIntent(Context context, Object obj);

    public a getSynchronousResult(Context context, Object obj) {
        m.f(context, "context");
        return null;
    }

    public abstract Object parseResult(int i10, Intent intent);
}
