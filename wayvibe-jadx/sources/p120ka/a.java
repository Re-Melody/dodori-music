package p120ka;

import B8.C0116c;
import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f21795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WindowManager f21796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0116c f21797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MotionEvent f21798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MotionEvent f21799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f21800f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f21801g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f21802h;

    public a(Context context, C0116c c0116c) {
        this.f21795a = context;
        if (context instanceof Activity) {
            this.f21796b = (WindowManager) context.getSystemService("window");
        } else {
            this.f21796b = null;
        }
        this.f21797c = c0116c;
    }

    public abstract boolean a(MotionEvent motionEvent);

    public boolean b(int i10) {
        if (this.f21802h == null || !this.f21801g) {
            return false;
        }
        C0116c c0116c = this.f21797c;
        for (Set<Integer> set : (ArrayList) c0116c.f775b) {
            if (set.contains(Integer.valueOf(i10))) {
                for (Integer num : set) {
                    num.getClass();
                    for (a aVar : (ArrayList) c0116c.f776c) {
                        if (aVar instanceof i) {
                            i iVar = (i) aVar;
                            if (iVar.f21829p.contains(num) && iVar.f21830q) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
