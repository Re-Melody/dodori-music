package U2;

import A6.E;
import B2.AbstractC0111a;
import B2.C;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p255y2.T;

/* JADX INFO: loaded from: classes.dex */
public final class i extends T {
    public boolean r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f12110s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f12111t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f12112u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f12113v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f12114w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f12115x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final SparseArray f12116y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final SparseBooleanArray f12117z;

    /* JADX WARN: Code duplicated, block: B:51:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ff  */
    public i(Context context) {
        CaptioningManager captioningManager;
        Point point;
        Point point2;
        int i10 = C.f560a;
        if ((i10 >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.f28827o = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.f28826n = E.x(i10 >= 21 ? locale.toLanguageTag() : locale.toString());
            }
        }
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && C.H(context)) {
            String strB = i10 < 28 ? C.B("sys.display-size") : C.B("vendor.display-size");
            if (!TextUtils.isEmpty(strB)) {
                try {
                    String[] strArrSplit = strB.trim().split("x", -1);
                    if (strArrSplit.length == 2) {
                        int i11 = Integer.parseInt(strArrSplit[0]);
                        int i12 = Integer.parseInt(strArrSplit[1]);
                        if (i11 > 0 && i12 > 0) {
                            point2 = new Point(i11, i12);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                AbstractC0111a.l("Util", "Invalid display size: " + strB);
            }
            if ("Sony".equals(C.f562c) && C.f563d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                point = new Point(3840, 2160);
            } else {
                point = new Point();
                if (i10 >= 23) {
                    Display.Mode mode = display.getMode();
                    point.x = mode.getPhysicalWidth();
                    point.y = mode.getPhysicalHeight();
                } else {
                    display.getRealSize(point);
                }
            }
            point2 = point;
        } else {
            point = new Point();
            if (i10 >= 23) {
                Display.Mode mode2 = display.getMode();
                point.x = mode2.getPhysicalWidth();
                point.y = mode2.getPhysicalHeight();
            } else {
                display.getRealSize(point);
            }
            point2 = point;
        }
        b(point2.x, point2.y);
        this.f12116y = new SparseArray();
        this.f12117z = new SparseBooleanArray();
        c();
    }

    @Override // p255y2.T
    public final T b(int i10, int i11) {
        super.b(i10, i11);
        return this;
    }

    public final void c() {
        this.r = true;
        this.f12110s = true;
        this.f12111t = true;
        this.f12112u = true;
        this.f12113v = true;
        this.f12114w = true;
        this.f12115x = true;
    }

    public i(j jVar) {
        a(jVar);
        this.r = jVar.r;
        this.f12110s = jVar.f12119s;
        this.f12111t = jVar.f12120t;
        this.f12112u = jVar.f12121u;
        this.f12113v = jVar.f12122v;
        this.f12114w = jVar.f12123w;
        this.f12115x = jVar.f12124x;
        SparseArray sparseArray = new SparseArray();
        int i10 = 0;
        while (true) {
            SparseArray sparseArray2 = jVar.f12125y;
            if (i10 < sparseArray2.size()) {
                sparseArray.put(sparseArray2.keyAt(i10), new HashMap((Map) sparseArray2.valueAt(i10)));
                i10++;
            } else {
                this.f12116y = sparseArray;
                this.f12117z = jVar.f12126z.clone();
                return;
            }
        }
    }

    public i() {
        this.f12116y = new SparseArray();
        this.f12117z = new SparseBooleanArray();
        c();
    }
}
