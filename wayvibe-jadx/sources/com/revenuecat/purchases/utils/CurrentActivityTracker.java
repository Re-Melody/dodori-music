package com.revenuecat.purchases.utils;

import N8.A;
import N8.z;
import Z8.c;
import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class CurrentActivityTracker {
    private final List<WeakReference<Activity>> startedActivities = new ArrayList();

    /* JADX INFO: renamed from: com.revenuecat.purchases.utils.CurrentActivityTracker$onActivityStarted$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements c {
        final /* synthetic */ Activity $activity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Activity activity) {
            super(1);
            this.$activity = activity;
        }

        @Override // Z8.c
        public final Boolean invoke(WeakReference<Activity> it) {
            m.f(it, "it");
            return Boolean.valueOf(it.get() == null || m.b(it.get(), this.$activity));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.utils.CurrentActivityTracker$onActivityStopped$1, reason: invalid class name and case insensitive filesystem */
    public static final class C18881 extends n implements c {
        final /* synthetic */ Activity $activity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18881(Activity activity) {
            super(1);
            this.$activity = activity;
        }

        @Override // Z8.c
        public final Boolean invoke(WeakReference<Activity> it) {
            m.f(it, "it");
            return Boolean.valueOf(it.get() == null || m.b(it.get(), this.$activity));
        }
    }

    public final synchronized Activity getCurrentActivity() {
        Activity activity;
        List<WeakReference<Activity>> list = this.startedActivities;
        m.f(list, "<this>");
        Iterator it = new A(list).iterator();
        do {
            activity = null;
            if (!((ListIterator) ((z) it).f8659b).hasPrevious()) {
                break;
            }
            Activity activity2 = (Activity) ((WeakReference) ((ListIterator) ((z) it).f8659b).previous()).get();
            if (activity2 != null && !activity2.isFinishing() && !activity2.isDestroyed()) {
                activity = activity2;
            }
        } while (activity == null);
        return activity;
    }

    public final synchronized void onActivityStarted(Activity activity) {
        m.f(activity, "activity");
        N8.n.N0(this.startedActivities, new AnonymousClass1(activity));
        this.startedActivities.add(new WeakReference<>(activity));
    }

    public final synchronized void onActivityStopped(Activity activity) {
        m.f(activity, "activity");
        N8.n.N0(this.startedActivities, new C18881(activity));
    }
}
