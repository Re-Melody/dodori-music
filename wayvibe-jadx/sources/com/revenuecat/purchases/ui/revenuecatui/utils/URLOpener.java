package com.revenuecat.purchases.ui.revenuecatui.utils;

import U.P;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import com.revenuecat.purchases.ui.revenuecatui.R;
import com.revenuecat.purchases.ui.revenuecatui.extensions.UrisKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import org.maplibre.android.location.C2198e;
import p254y1.a;

/* JADX INFO: loaded from: classes2.dex */
public final class URLOpener {
    public static final int $stable = 0;
    public static final URLOpener INSTANCE = new URLOpener();

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[URLOpeningMethod.values().length];
            try {
                iArr[URLOpeningMethod.IN_APP_BROWSER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[URLOpeningMethod.EXTERNAL_BROWSER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[URLOpeningMethod.DEEP_LINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private URLOpener() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void openURL$handleException(u uVar, Context context, Exception exc) {
        uVar.f21869a = false;
        String string = exc instanceof ActivityNotFoundException ? context.getString(R.string.no_browser_cannot_open_link) : context.getString(R.string.cannot_open_link);
        m.e(string, "if (exception is Activit…_open_link)\n            }");
        Toast.makeText(context, string, 0).show();
        Logger.INSTANCE.e(string, exc);
    }

    public final boolean openURL$revenuecatui_defaultsRelease(Context context, String url, URLOpeningMethod method) {
        m.f(context, "context");
        m.f(url, "url");
        m.f(method, "method");
        u uVar = new u();
        uVar.f21869a = true;
        int i10 = WhenMappings.$EnumSwitchMapping$0[method.ordinal()];
        if (i10 == 1) {
            C2198e c2198eF = new P(8).f();
            try {
                Uri uri = Uri.parse(url);
                Intent intent = (Intent) c2198eF.f24679a;
                intent.setData(uri);
                a.startActivity(context, intent, (Bundle) c2198eF.f24680b);
            } catch (ActivityNotFoundException e2) {
                openURL$handleException(uVar, context, e2);
            } catch (IllegalArgumentException e4) {
                openURL$handleException(uVar, context, e4);
            }
        } else if (i10 == 2 || i10 == 3) {
            UrisKt.openUriOrElse(context, url, new URLOpener$openURL$1(uVar, context));
        }
        return uVar.f21869a;
    }
}
