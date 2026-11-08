package androidx.core.app;

import D8.AbstractC0311s0;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import app.nagakiba.wayvibe.R;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.util.ArrayList;
import java.util.Iterator;
import p199t.C2231f;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14958a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f14962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f14963f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PendingIntent f14964g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public IconCompat f14965h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f14966i;
    public AbstractC0311s0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f14968l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f14970n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Bundle f14971o;
    public String r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f14975t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Notification f14976u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f14977v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f14978w;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f14959b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f14960c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f14961d = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f14967j = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f14969m = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f14972p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f14973q = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f14974s = 0;

    public w(Context context, String str) {
        Notification notification = new Notification();
        this.f14976u = notification;
        this.f14958a = context;
        this.r = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f14966i = 0;
        this.f14978w = new ArrayList();
        this.f14975t = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Notification a() {
        Notification notificationBuild;
        Bundle bundle;
        String strC;
        int i10;
        int i11;
        ArrayList arrayList;
        int i12;
        B2.s sVar = new B2.s();
        new ArrayList();
        sVar.f621d = new Bundle();
        sVar.f620c = this;
        Context context = this.f14958a;
        if (Build.VERSION.SDK_INT >= 26) {
            sVar.f619b = x.a(context, this.r);
        } else {
            sVar.f619b = new Notification.Builder(this.f14958a);
        }
        Notification notification = this.f14976u;
        ((Notification.Builder) sVar.f619b).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(this.f14962e).setContentText(this.f14963f).setContentInfo(null).setContentIntent(this.f14964g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD) != 0).setNumber(0).setProgress(0, 0, false);
        Notification.Builder builder = (Notification.Builder) sVar.f619b;
        IconCompat iconCompat = this.f14965h;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.g(context));
        ((Notification.Builder) sVar.f619b).setSubText(this.f14968l).setUsesChronometer(false).setPriority(this.f14966i);
        for (u uVar : this.f14959b) {
            int i13 = Build.VERSION.SDK_INT;
            if (uVar.f14951b == null && (i12 = uVar.f14954e) != 0) {
                uVar.f14951b = IconCompat.d(null, "", i12);
            }
            IconCompat iconCompat2 = uVar.f14951b;
            Notification.Action.Builder builder2 = new Notification.Action.Builder(iconCompat2 != null ? iconCompat2.g(null) : null, uVar.f14955f, uVar.f14956g);
            Bundle bundle2 = uVar.f14950a;
            Bundle bundle3 = bundle2 != null ? new Bundle(bundle2) : new Bundle();
            boolean z10 = uVar.f14952c;
            bundle3.putBoolean("android.support.allowGeneratedReplies", z10);
            builder2.setAllowGeneratedReplies(z10);
            bundle3.putInt("android.support.action.semanticAction", 0);
            if (i13 >= 28) {
                y.a(builder2);
            }
            if (i13 >= 29) {
                AbstractC1036f.d(builder2);
            }
            if (i13 >= 31) {
                z.a(builder2);
            }
            bundle3.putBoolean("android.support.action.showsUserInterface", uVar.f14953d);
            builder2.addExtras(bundle3);
            ((Notification.Builder) sVar.f619b).addAction(builder2.build());
        }
        Bundle bundle4 = this.f14971o;
        if (bundle4 != null) {
            ((Bundle) sVar.f621d).putAll(bundle4);
        }
        int i14 = Build.VERSION.SDK_INT;
        ((Notification.Builder) sVar.f619b).setShowWhen(this.f14967j);
        ((Notification.Builder) sVar.f619b).setLocalOnly(this.f14969m);
        ((Notification.Builder) sVar.f619b).setGroup(null);
        ((Notification.Builder) sVar.f619b).setSortKey(null);
        ((Notification.Builder) sVar.f619b).setGroupSummary(false);
        sVar.f618a = 0;
        ((Notification.Builder) sVar.f619b).setCategory(this.f14970n);
        ((Notification.Builder) sVar.f619b).setColor(this.f14972p);
        ((Notification.Builder) sVar.f619b).setVisibility(this.f14973q);
        ((Notification.Builder) sVar.f619b).setPublicVersion(null);
        ((Notification.Builder) sVar.f619b).setSound(notification.sound, notification.audioAttributes);
        ArrayList arrayList2 = this.f14978w;
        ArrayList arrayList3 = this.f14960c;
        if (i14 < 28) {
            if (arrayList3 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList3.size());
                Iterator it = arrayList3.iterator();
                if (it.hasNext()) {
                    throw V0.p.g(it);
                }
            }
            if (arrayList != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList;
                } else {
                    C2231f c2231f = new C2231f(arrayList2.size() + arrayList.size());
                    c2231f.addAll(arrayList);
                    c2231f.addAll(arrayList2);
                    arrayList2 = new ArrayList(c2231f);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((Notification.Builder) sVar.f619b).addPerson((String) it2.next());
            }
        }
        ArrayList arrayList4 = this.f14961d;
        if (arrayList4.size() > 0) {
            if (this.f14971o == null) {
                this.f14971o = new Bundle();
            }
            Bundle bundle5 = this.f14971o.getBundle("android.car.EXTENSIONS");
            if (bundle5 == null) {
                bundle5 = new Bundle();
            }
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            int i15 = 0;
            while (i15 < arrayList4.size()) {
                String string = Integer.toString(i15);
                u uVar2 = (u) arrayList4.get(i15);
                Bundle bundle8 = new Bundle();
                if (uVar2.f14951b == null && (i11 = uVar2.f14954e) != 0) {
                    uVar2.f14951b = IconCompat.d(null, "", i11);
                }
                IconCompat iconCompat3 = uVar2.f14951b;
                bundle8.putInt("icon", iconCompat3 != null ? iconCompat3.e() : 0);
                bundle8.putCharSequence(com.amazon.a.a.o.b.f16393S, uVar2.f14955f);
                bundle8.putParcelable("actionIntent", uVar2.f14956g);
                Bundle bundle9 = uVar2.f14950a;
                Bundle bundle10 = bundle9 != null ? new Bundle(bundle9) : new Bundle();
                bundle10.putBoolean("android.support.allowGeneratedReplies", uVar2.f14952c);
                bundle8.putBundle("extras", bundle10);
                bundle8.putParcelableArray("remoteInputs", null);
                bundle8.putBoolean("showsUserInterface", uVar2.f14953d);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(string, bundle8);
                i15++;
                arrayList4 = arrayList4;
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (this.f14971o == null) {
                this.f14971o = new Bundle();
            }
            this.f14971o.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) sVar.f621d).putBundle("android.car.EXTENSIONS", bundle6);
        }
        int i16 = Build.VERSION.SDK_INT;
        ((Notification.Builder) sVar.f619b).setExtras(this.f14971o);
        ((Notification.Builder) sVar.f619b).setRemoteInputHistory(null);
        if (i16 >= 26) {
            x.c((Notification.Builder) sVar.f619b);
            x.e((Notification.Builder) sVar.f619b);
            x.f((Notification.Builder) sVar.f619b);
            x.g((Notification.Builder) sVar.f619b);
            x.d((Notification.Builder) sVar.f619b, 0);
            if (!TextUtils.isEmpty(this.r)) {
                ((Notification.Builder) sVar.f619b).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i16 >= 28) {
            Iterator it3 = arrayList3.iterator();
            if (it3.hasNext()) {
                throw V0.p.g(it3);
            }
        }
        if (i16 >= 29) {
            AbstractC1036f.b((Notification.Builder) sVar.f619b, this.f14975t);
            AbstractC1036f.c((Notification.Builder) sVar.f619b);
        }
        if (i16 >= 31 && (i10 = this.f14974s) != 0) {
            z.b((Notification.Builder) sVar.f619b, i10);
        }
        if (i16 >= 36) {
            A.a((Notification.Builder) sVar.f619b);
        }
        if (this.f14977v) {
            ((w) sVar.f620c).getClass();
            sVar.f618a = 1;
            ((Notification.Builder) sVar.f619b).setVibrate(null);
            ((Notification.Builder) sVar.f619b).setSound(null);
            int i17 = notification.defaults & (-4);
            notification.defaults = i17;
            ((Notification.Builder) sVar.f619b).setDefaults(i17);
            if (i16 >= 26) {
                ((w) sVar.f620c).getClass();
                if (TextUtils.isEmpty(null)) {
                    ((Notification.Builder) sVar.f619b).setGroup("silent");
                }
                x.d((Notification.Builder) sVar.f619b, 1);
            }
        }
        w wVar = (w) sVar.f620c;
        AbstractC0311s0 abstractC0311s0 = wVar.k;
        if (abstractC0311s0 != null) {
            abstractC0311s0.a(sVar);
        }
        int i18 = Build.VERSION.SDK_INT;
        Notification.Builder builder3 = (Notification.Builder) sVar.f619b;
        if (i18 >= 26) {
            notificationBuild = builder3.build();
        } else {
            Notification notificationBuild2 = builder3.build();
            int i19 = sVar.f618a;
            if (i19 != 0) {
                if (notificationBuild2.getGroup() != null && (notificationBuild2.flags & 512) != 0 && i19 == 2) {
                    notificationBuild2.sound = null;
                    notificationBuild2.vibrate = null;
                    notificationBuild2.defaults &= -4;
                }
                if (notificationBuild2.getGroup() != null && (notificationBuild2.flags & 512) == 0 && i19 == 1) {
                    notificationBuild2.sound = null;
                    notificationBuild2.vibrate = null;
                    notificationBuild2.defaults &= -4;
                }
            }
            notificationBuild = notificationBuild2;
        }
        if (abstractC0311s0 != null) {
            wVar.k.getClass();
        }
        if (abstractC0311s0 != null && (bundle = notificationBuild.extras) != null && (strC = abstractC0311s0.c()) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strC);
        }
        return notificationBuild;
    }

    public final void c(int i10, boolean z10) {
        Notification notification = this.f14976u;
        if (z10) {
            notification.flags = i10 | notification.flags;
        } else {
            notification.flags = (~i10) & notification.flags;
        }
    }

    public final void d(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f14958a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.f14980b = bitmap;
            iconCompat = iconCompat2;
        }
        this.f14965h = iconCompat;
    }

    public final void e(AbstractC0311s0 abstractC0311s0) {
        if (this.k != abstractC0311s0) {
            this.k = abstractC0311s0;
            if (((w) abstractC0311s0.f2777a) != this) {
                abstractC0311s0.f2777a = this;
                e(abstractC0311s0);
            }
        }
    }
}
