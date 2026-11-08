package p152o;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: o.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2154q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Method f23421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f23422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Method f23423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f23424d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
            f23421a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f23422b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f23423c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f23424d = true;
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
        }
    }
}
