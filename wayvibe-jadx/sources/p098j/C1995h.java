package p098j;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import app.nagakiba.wayvibe.R;
import java.lang.ref.WeakReference;
import p087i.a;

/* JADX INFO: renamed from: j.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1995h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f21329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DialogInterfaceC1996i f21330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Window f21331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f21332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AlertController$RecycleListView f21333e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Button f21334f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Button f21335g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Button f21336h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public NestedScrollView f21337i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Drawable f21338j;
    public ImageView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f21339l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f21340m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f21341n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ListAdapter f21342o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f21344q;
    public final int r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f21345s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f21346t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f21347u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final HandlerC1993f f21348v;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f21343p = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ViewOnClickListenerC1990c f21349w = new ViewOnClickListenerC1990c(this, 0);

    public C1995h(Context context, DialogInterfaceC1996i dialogInterfaceC1996i, Window window) {
        this.f21329a = context;
        this.f21330b = dialogInterfaceC1996i;
        this.f21331c = window;
        HandlerC1993f handlerC1993f = new HandlerC1993f(0);
        handlerC1993f.f21328b = new WeakReference(dialogInterfaceC1996i);
        this.f21348v = handlerC1993f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, a.f20371e, R.attr.alertDialogStyle, 0);
        this.f21344q = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.r = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f21345s = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.f21346t = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.f21347u = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        dialogInterfaceC1996i.c().h(1);
    }

    public static ViewGroup a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }
}
