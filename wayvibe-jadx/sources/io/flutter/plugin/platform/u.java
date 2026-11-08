package io.flutter.plugin.platform;

import android.app.AlertDialog;
import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class u extends ContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C f20782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C f20783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f20784c;

    public u(Context context, C c3, Context context2) {
        super(context);
        this.f20782a = c3;
        this.f20784c = context2;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"window".equals(str)) {
            return super.getSystemService(str);
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (int i10 = 0; i10 < stackTrace.length && i10 < 11; i10++) {
            if (stackTrace[i10].getClassName().equals(AlertDialog.class.getCanonicalName()) && stackTrace[i10].getMethodName().equals("<init>")) {
                return this.f20784c.getSystemService(str);
            }
        }
        if (this.f20783b == null) {
            this.f20783b = this.f20782a;
        }
        return this.f20783b;
    }
}
