package p094i6;

import K1.T;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.WeakHashMap;
import p029c2.a;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20527a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f20529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f20530d;

    public c(TextView textView, Typeface typeface, int i10) {
        this.f20529c = textView;
        this.f20530d = typeface;
        this.f20528b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.f20529c;
        int i10 = this.f20528b;
        Object obj = this.f20530d;
        switch (this.f20527a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj;
                a aVar = bottomSheetBehavior.f18179m;
                if (aVar != null && aVar.f()) {
                    WeakHashMap weakHashMap = T.f7251a;
                    view.postOnAnimation(this);
                } else {
                    bottomSheetBehavior.v(i10);
                }
                break;
            default:
                ((TextView) view).setTypeface((Typeface) obj, i10);
                break;
        }
    }

    public c(BottomSheetBehavior bottomSheetBehavior, View view, int i10) {
        this.f20530d = bottomSheetBehavior;
        this.f20529c = view;
        this.f20528b = i10;
    }
}
