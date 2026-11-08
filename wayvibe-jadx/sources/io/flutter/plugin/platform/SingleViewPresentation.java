package io.flutter.plugin.platform;

import android.app.Presentation;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
@Keep
class SingleViewPresentation extends Presentation {
    private static final String TAG = "PlatformViewsController";
    private final C1950a accessibilityEventsDelegate;
    private FrameLayout container;
    private final View.OnFocusChangeListener focusChangeListener;
    private final Context outerContext;
    private s rootView;
    private boolean startFocused;
    private final v state;
    private int viewId;

    public SingleViewPresentation(Context context, Display display, f fVar, C1950a c1950a, int i10, View.OnFocusChangeListener onFocusChangeListener) {
        super(new t(context, null), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = c1950a;
        this.viewId = i10;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        v vVar = new v();
        this.state = vVar;
        vVar.f20785a = fVar;
        getWindow().setFlags(8, 8);
        getWindow().setType(2030);
    }

    public v detachState() {
        FrameLayout frameLayout = this.container;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        s sVar = this.rootView;
        if (sVar != null) {
            sVar.removeAllViews();
        }
        return this.state;
    }

    public f getView() {
        return this.state.f20785a;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        v vVar = this.state;
        if (vVar.f20787c == null) {
            vVar.f20787c = new r(getContext());
        }
        if (this.state.f20786b == null) {
            WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
            v vVar2 = this.state;
            vVar2.f20786b = new C(windowManager, vVar2.f20787c);
        }
        this.container = new FrameLayout(getContext());
        u uVar = new u(getContext(), this.state.f20786b, this.outerContext);
        View view = this.state.f20785a.getView();
        if (view.getContext() instanceof MutableContextWrapper) {
            ((MutableContextWrapper) view.getContext()).setBaseContext(uVar);
        } else {
            Log.w(TAG, "Unexpected platform view context for view ID " + this.viewId + "; some functionality may not work correctly. When constructing a platform view in the factory, ensure that the view returned from PlatformViewFactory#create returns the provided context from getContext(). If you are unable to associate the view with that context, consider using Hybrid Composition instead.");
        }
        this.container.addView(view);
        s sVar = new s(getContext(), this.accessibilityEventsDelegate, view);
        this.rootView = sVar;
        sVar.addView(this.container);
        this.rootView.addView(this.state.f20787c);
        view.setOnFocusChangeListener(this.focusChangeListener);
        this.rootView.setFocusableInTouchMode(true);
        if (this.startFocused) {
            view.requestFocus();
        } else {
            this.rootView.requestFocus();
        }
        setContentView(this.rootView);
    }

    public SingleViewPresentation(Context context, Display display, C1950a c1950a, v vVar, View.OnFocusChangeListener onFocusChangeListener, boolean z10) {
        super(new t(context, null), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = c1950a;
        this.state = vVar;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        getWindow().setFlags(8, 8);
        this.startFocused = z10;
    }
}
