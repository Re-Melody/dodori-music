package com.revenuecat.purchases_ui_flutter.views;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import io.flutter.plugin.platform.f;
import kotlin.jvm.internal.m;
import p045d8.AbstractActivityC1938j;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BasePaywallView implements f {
    public BasePaywallView(Context context) {
        m.f(context, "context");
        checkActivityType(context);
    }

    private final Activity activity(Context context) {
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
            m.e(context, "getBaseContext(...)");
        }
        return (Activity) context;
    }

    private final void checkActivityType(Context context) {
        Activity activity = activity(context);
        if (activity != null && !AbstractActivityC1938j.class.isAssignableFrom(activity.getClass())) {
            throw new RuntimeException("Implementation Error: PaywallView requires the MainActivity to extend FlutterFragmentActivity in order for the paywall to be displayed correctly.\nPlease change your MainActivity to extend FlutterFragmentActivity instead. See https://rev.cat/flutter-paywall-installation for more information.");
        }
    }

    @Override // io.flutter.plugin.platform.f
    public abstract /* synthetic */ void dispose();

    @Override // io.flutter.plugin.platform.f
    public abstract /* synthetic */ View getView();

    @Override // io.flutter.plugin.platform.f
    public /* bridge */ /* synthetic */ void onFlutterViewAttached(View view) {
    }

    @Override // io.flutter.plugin.platform.f
    public /* bridge */ /* synthetic */ void onFlutterViewDetached() {
    }

    @Override // io.flutter.plugin.platform.f
    public /* bridge */ /* synthetic */ void onInputConnectionLocked() {
    }

    @Override // io.flutter.plugin.platform.f
    public /* bridge */ /* synthetic */ void onInputConnectionUnlocked() {
    }
}
