package p098j;

import V0.p;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class E implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f21262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Method f21264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f21265d;

    public E(View view, String str) {
        this.f21262a = view;
        this.f21263b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f21264c != null) {
            break;
        }
        View view2 = this.f21262a;
        Context context = view2.getContext();
        while (true) {
            String str2 = this.f21263b;
            if (context == null) {
                int id = view2.getId();
                if (id == -1) {
                    str = "";
                } else {
                    str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                }
                StringBuilder sbU = p.u("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                sbU.append(view2.getClass());
                sbU.append(str);
                throw new IllegalStateException(sbU.toString());
            }
            try {
                if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                    this.f21264c = method;
                    this.f21265d = context;
                    break;
                }
            } catch (NoSuchMethodException unused) {
            }
            context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
        }
        try {
            this.f21264c.invoke(this.f21265d, view);
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
        } catch (InvocationTargetException e4) {
            throw new IllegalStateException("Could not execute method for android:onClick", e4);
        }
    }
}
