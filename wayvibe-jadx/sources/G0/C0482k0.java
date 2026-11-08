package G0;

import B2.AbstractC0112b;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: renamed from: G0.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0482k0 implements InterfaceC0474h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5243a;

    public C0482k0(Context context) {
        this.f5243a = context;
    }

    @Override // G0.InterfaceC0474h1
    public final void openUri(String str) {
        try {
            this.f5243a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException e2) {
            throw new IllegalArgumentException(AbstractC0112b.c(com.amazon.a.a.o.c.a.b.f16463a, "Can't open ", str), e2);
        }
    }
}
