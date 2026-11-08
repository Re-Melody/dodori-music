package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.C1129y;
import androidx.lifecycle.C1130z;

/* JADX INFO: renamed from: androidx.fragment.app.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC1099t extends F implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DialogInterfaceOnCancelListenerC1097q f15427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f15428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15431e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15432f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15433g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f15434h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final A f15435i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Dialog f15436j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f15437l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f15438m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f15439n;

    public DialogInterfaceOnCancelListenerC1099t() {
        new RunnableC1096p(this, 0);
        this.f15427a = new DialogInterfaceOnCancelListenerC1097q(this);
        this.f15428b = new r(this);
        this.f15429c = 0;
        this.f15430d = 0;
        this.f15431e = true;
        this.f15432f = true;
        this.f15433g = -1;
        this.f15435i = new A(this, 1);
        this.f15439n = false;
    }

    @Override // androidx.fragment.app.F
    public final N createFragmentContainer() {
        return new C1098s(this, super.createFragmentContainer());
    }

    public Dialog i() {
        if (AbstractC1083h0.J(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new p036d.p(requireContext(), this.f15430d);
    }

    @Override // androidx.fragment.app.F
    public final void onAttach(Context context) {
        Object obj;
        super.onAttach(context);
        androidx.lifecycle.B viewLifecycleOwnerLiveData = getViewLifecycleOwnerLiveData();
        A a10 = this.f15435i;
        viewLifecycleOwnerLiveData.getClass();
        androidx.lifecycle.B.a("observeForever");
        C1129y c1129y = new C1129y(viewLifecycleOwnerLiveData, a10);
        p172q.f fVar = viewLifecycleOwnerLiveData.f15470b;
        p172q.c cVarA = fVar.a(a10);
        if (cVarA != null) {
            obj = cVarA.f25368b;
        } else {
            p172q.c cVar = new p172q.c(a10, c1129y);
            fVar.f25377d++;
            p172q.c cVar2 = fVar.f25375b;
            if (cVar2 == null) {
                fVar.f25374a = cVar;
                fVar.f25375b = cVar;
            } else {
                cVar2.f25369c = cVar;
                cVar.f25370d = cVar2;
                fVar.f25375b = cVar;
            }
            obj = null;
        }
        androidx.lifecycle.A a11 = (androidx.lifecycle.A) obj;
        if (a11 instanceof C1130z) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (a11 == null) {
            c1129y.a(true);
        }
        if (this.f15438m) {
            return;
        }
        this.f15437l = false;
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.F
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        new Handler();
        this.f15432f = this.mContainerId == 0;
        if (bundle != null) {
            this.f15429c = bundle.getInt("android:style", 0);
            this.f15430d = bundle.getInt("android:theme", 0);
            this.f15431e = bundle.getBoolean("android:cancelable", true);
            this.f15432f = bundle.getBoolean("android:showsDialog", this.f15432f);
            this.f15433g = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.F
    public final void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.f15436j;
        if (dialog != null) {
            this.k = true;
            dialog.setOnDismissListener(null);
            this.f15436j.dismiss();
            if (!this.f15437l) {
                onDismiss(this.f15436j);
            }
            this.f15436j = null;
            this.f15439n = false;
        }
    }

    @Override // androidx.fragment.app.F
    public final void onDetach() {
        super.onDetach();
        if (!this.f15438m && !this.f15437l) {
            this.f15437l = true;
        }
        getViewLifecycleOwnerLiveData().g(this.f15435i);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.k) {
            return;
        }
        if (AbstractC1083h0.J(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f15437l) {
            return;
        }
        this.f15437l = true;
        this.f15438m = false;
        Dialog dialog = this.f15436j;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f15436j.dismiss();
        }
        this.k = true;
        if (this.f15433g < 0) {
            AbstractC1083h0 parentFragmentManager = getParentFragmentManager();
            parentFragmentManager.getClass();
            C1068a c1068a = new C1068a(parentFragmentManager);
            c1068a.f15260o = true;
            c1068a.g(this);
            c1068a.d(true);
            return;
        }
        AbstractC1083h0 parentFragmentManager2 = getParentFragmentManager();
        int i10 = this.f15433g;
        parentFragmentManager2.getClass();
        if (i10 < 0) {
            throw new IllegalArgumentException(p134m1.b.j(i10, "Bad id: "));
        }
        parentFragmentManager2.x(new C1079f0(parentFragmentManager2, i10), true);
        this.f15433g = -1;
    }

    @Override // androidx.fragment.app.F
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        boolean z10 = this.f15432f;
        if (z10 && !this.f15434h) {
            if (z10 && !this.f15439n) {
                try {
                    this.f15434h = true;
                    Dialog dialogI = i();
                    this.f15436j = dialogI;
                    if (this.f15432f) {
                        int i10 = this.f15429c;
                        if (i10 == 1 || i10 == 2) {
                            dialogI.requestWindowFeature(1);
                        } else if (i10 == 3) {
                            Window window = dialogI.getWindow();
                            if (window != null) {
                                window.addFlags(24);
                            }
                            dialogI.requestWindowFeature(1);
                        }
                        Context context = getContext();
                        if (context instanceof Activity) {
                            this.f15436j.setOwnerActivity((Activity) context);
                        }
                        this.f15436j.setCancelable(this.f15431e);
                        this.f15436j.setOnCancelListener(this.f15427a);
                        this.f15436j.setOnDismissListener(this.f15428b);
                        this.f15439n = true;
                    } else {
                        this.f15436j = null;
                    }
                    this.f15434h = false;
                } catch (Throwable th) {
                    this.f15434h = false;
                    throw th;
                }
            }
            if (AbstractC1083h0.J(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f15436j;
            if (dialog != null) {
                return layoutInflaterOnGetLayoutInflater.cloneInContext(dialog.getContext());
            }
        } else if (AbstractC1083h0.J(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.f15432f) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
                return layoutInflaterOnGetLayoutInflater;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + str);
        }
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // androidx.fragment.app.F
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.f15436j;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i10 = this.f15429c;
        if (i10 != 0) {
            bundle.putInt("android:style", i10);
        }
        int i11 = this.f15430d;
        if (i11 != 0) {
            bundle.putInt("android:theme", i11);
        }
        boolean z10 = this.f15431e;
        if (!z10) {
            bundle.putBoolean("android:cancelable", z10);
        }
        boolean z11 = this.f15432f;
        if (!z11) {
            bundle.putBoolean("android:showsDialog", z11);
        }
        int i12 = this.f15433g;
        if (i12 != -1) {
            bundle.putInt("android:backStackId", i12);
        }
    }

    @Override // androidx.fragment.app.F
    public final void onStart() {
        super.onStart();
        Dialog dialog = this.f15436j;
        if (dialog != null) {
            this.k = false;
            dialog.show();
            View decorView = this.f15436j.getWindow().getDecorView();
            androidx.lifecycle.U.i(decorView, this);
            androidx.lifecycle.U.j(decorView, this);
            p206t6.b.Z(decorView, this);
        }
    }

    @Override // androidx.fragment.app.F
    public final void onStop() {
        super.onStop();
        Dialog dialog = this.f15436j;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.F
    public final void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.f15436j == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f15436j.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.F
    public final void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.f15436j == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f15436j.onRestoreInstanceState(bundle2);
    }
}
