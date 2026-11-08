package p098j;

import A1.b;
import A1.m;
import G1.e;
import J3.g;
import M3.a;
import android.R;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.AbstractC1035e;
import androidx.core.app.L;
import androidx.fragment.app.K;
import androidx.lifecycle.U;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import org.slf4j.helpers.i;
import p132m.d;
import p152o.C2158t;
import p152o.N0;
import p152o.i1;
import p199t.l;

/* JADX INFO: renamed from: j.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC1998k extends K implements InterfaceC1999l, androidx.core.app.K {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private q mDelegate;
    private Resources mResources;

    public AbstractActivityC1998k() {
        getSavedStateRegistry().c(DELEGATE_TAG, new a(this));
        addOnContextAvailableListener(new C1997j(this));
    }

    @Override // p036d.n, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e();
        C c3 = (C) getDelegate();
        c3.x();
        ((ViewGroup) c3.f21213A.findViewById(R.id.content)).addView(view, layoutParams);
        c3.f21236m.a(c3.f21234l.getCallback());
    }

    /* JADX WARN: Code duplicated, block: B:101:0x019c  */
    /* JADX WARN: Code duplicated, block: B:104:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:107:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:110:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:113:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:116:0x01de  */
    /* JADX WARN: Code duplicated, block: B:119:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:120:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:124:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:126:0x0209  */
    /* JADX WARN: Code duplicated, block: B:127:0x020d  */
    /* JADX WARN: Code duplicated, block: B:138:0x0230 A[Catch: all -> 0x0224, TRY_LEAVE, TryCatch #0 {, blocks: (B:129:0x0210, B:131:0x0214, B:137:0x022e, B:138:0x0230, B:140:0x0234, B:146:0x0246, B:145:0x023d, B:136:0x0227), top: B:156:0x0210, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:156:0x0210 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x0214 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x0234 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0099  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:66:0x0108  */
    /* JADX WARN: Code duplicated, block: B:69:0x0110  */
    /* JADX WARN: Code duplicated, block: B:72:0x0118  */
    /* JADX WARN: Code duplicated, block: B:75:0x0120  */
    /* JADX WARN: Code duplicated, block: B:78:0x0128  */
    /* JADX WARN: Code duplicated, block: B:81:0x0130  */
    /* JADX WARN: Code duplicated, block: B:84:0x013c  */
    /* JADX WARN: Code duplicated, block: B:87:0x014b  */
    /* JADX WARN: Code duplicated, block: B:90:0x015a  */
    /* JADX WARN: Code duplicated, block: B:93:0x0169  */
    /* JADX WARN: Code duplicated, block: B:96:0x0172  */
    /* JADX WARN: Code duplicated, block: B:98:0x0180  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        Configuration configuration;
        Configuration configuration2;
        Configuration configuration3;
        d dVar;
        Resources.Theme theme;
        Method method;
        float f10;
        float f11;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        C c3 = (C) getDelegate();
        c3.f21227O = true;
        int i47 = c3.f21231Y;
        if (i47 == -100) {
            i47 = q.f21359b;
        }
        int iD = c3.D(context, i47);
        if (q.c(context) && q.c(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (q.f21366i) {
                    try {
                        e eVar = q.f21360c;
                        if (eVar == null) {
                            if (q.f21361d == null) {
                                q.f21361d = e.a(AbstractC1035e.e(context));
                            }
                            if (!q.f21361d.f5348a.f5349a.isEmpty()) {
                                q.f21360c = q.f21361d;
                            }
                        } else if (!eVar.equals(q.f21361d)) {
                            e eVar2 = q.f21360c;
                            q.f21361d = eVar2;
                            AbstractC1035e.d(context, eVar2.f5348a.f5349a.toLanguageTags());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (!q.f21363f) {
                q.f21358a.execute(new g(context, 2));
            }
        }
        e eVarP = C.p(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(C.u(context, iD, eVarP, null, false));
            } catch (IllegalStateException unused) {
                if (context instanceof d) {
                    try {
                        ((d) context).a(C.u(context, iD, eVarP, null, false));
                    } catch (IllegalStateException unused2) {
                        if (C.f21210A0) {
                            Configuration configuration4 = new Configuration();
                            configuration4.uiMode = -1;
                            configuration4.fontScale = 0.0f;
                            configuration = context.createConfigurationContext(configuration4).getResources().getConfiguration();
                            configuration2 = context.getResources().getConfiguration();
                            configuration.uiMode = configuration2.uiMode;
                            if (configuration.equals(configuration2)) {
                                configuration3 = null;
                            } else {
                                configuration3 = new Configuration();
                                configuration3.fontScale = 0.0f;
                                if (configuration.diff(configuration2) != 0) {
                                    f10 = configuration.fontScale;
                                    f11 = configuration2.fontScale;
                                    if (f10 != f11) {
                                        configuration3.fontScale = f11;
                                    }
                                    i10 = configuration.mcc;
                                    i11 = configuration2.mcc;
                                    if (i10 != i11) {
                                        configuration3.mcc = i11;
                                    }
                                    i12 = configuration.mnc;
                                    i13 = configuration2.mnc;
                                    if (i12 != i13) {
                                        configuration3.mnc = i13;
                                    }
                                    i14 = Build.VERSION.SDK_INT;
                                    w.a(configuration, configuration2, configuration3);
                                    i15 = configuration.touchscreen;
                                    i16 = configuration2.touchscreen;
                                    if (i15 != i16) {
                                        configuration3.touchscreen = i16;
                                    }
                                    i17 = configuration.keyboard;
                                    i18 = configuration2.keyboard;
                                    if (i17 != i18) {
                                        configuration3.keyboard = i18;
                                    }
                                    i19 = configuration.keyboardHidden;
                                    i20 = configuration2.keyboardHidden;
                                    if (i19 != i20) {
                                        configuration3.keyboardHidden = i20;
                                    }
                                    i21 = configuration.navigation;
                                    i22 = configuration2.navigation;
                                    if (i21 != i22) {
                                        configuration3.navigation = i22;
                                    }
                                    i23 = configuration.navigationHidden;
                                    i24 = configuration2.navigationHidden;
                                    if (i23 != i24) {
                                        configuration3.navigationHidden = i24;
                                    }
                                    i25 = configuration.orientation;
                                    i26 = configuration2.orientation;
                                    if (i25 != i26) {
                                        configuration3.orientation = i26;
                                    }
                                    i27 = configuration.screenLayout & 15;
                                    i28 = configuration2.screenLayout & 15;
                                    if (i27 != i28) {
                                        configuration3.screenLayout |= i28;
                                    }
                                    i29 = configuration.screenLayout & 192;
                                    i30 = configuration2.screenLayout & 192;
                                    if (i29 != i30) {
                                        configuration3.screenLayout |= i30;
                                    }
                                    i31 = configuration.screenLayout & 48;
                                    i32 = configuration2.screenLayout & 48;
                                    if (i31 != i32) {
                                        configuration3.screenLayout |= i32;
                                    }
                                    i33 = configuration.screenLayout & 768;
                                    i34 = configuration2.screenLayout & 768;
                                    if (i33 != i34) {
                                        configuration3.screenLayout |= i34;
                                    }
                                    if (i14 >= 26) {
                                        if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                                            configuration3.colorMode |= configuration2.colorMode & 3;
                                        }
                                        if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                                            configuration3.colorMode |= configuration2.colorMode & 12;
                                        }
                                    }
                                    i35 = configuration.uiMode & 15;
                                    i36 = configuration2.uiMode & 15;
                                    if (i35 != i36) {
                                        configuration3.uiMode |= i36;
                                    }
                                    i37 = configuration.uiMode & 48;
                                    i38 = configuration2.uiMode & 48;
                                    if (i37 != i38) {
                                        configuration3.uiMode |= i38;
                                    }
                                    i39 = configuration.screenWidthDp;
                                    i40 = configuration2.screenWidthDp;
                                    if (i39 != i40) {
                                        configuration3.screenWidthDp = i40;
                                    }
                                    i41 = configuration.screenHeightDp;
                                    i42 = configuration2.screenHeightDp;
                                    if (i41 != i42) {
                                        configuration3.screenHeightDp = i42;
                                    }
                                    i43 = configuration.smallestScreenWidthDp;
                                    i44 = configuration2.smallestScreenWidthDp;
                                    if (i43 != i44) {
                                        configuration3.smallestScreenWidthDp = i44;
                                    }
                                    i45 = configuration.densityDpi;
                                    i46 = configuration2.densityDpi;
                                    if (i45 != i46) {
                                        configuration3.densityDpi = i46;
                                    }
                                }
                            }
                            Configuration configurationU = C.u(context, iD, eVarP, configuration3, true);
                            dVar = new d(context, app.nagakiba.wayvibe.R.style.Theme_AppCompat_Empty);
                            dVar.a(configurationU);
                            try {
                                if (context.getTheme() != null) {
                                    theme = dVar.getTheme();
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        m.a(theme);
                                    } else {
                                        synchronized (b.f111e) {
                                            if (b.f113g) {
                                                method = b.f112f;
                                                if (method != null) {
                                                    method.invoke(theme, new Object[0]);
                                                }
                                            } else {
                                                try {
                                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                                                    b.f112f = declaredMethod;
                                                    declaredMethod.setAccessible(true);
                                                } catch (NoSuchMethodException e2) {
                                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e2);
                                                }
                                                b.f113g = true;
                                                method = b.f112f;
                                                if (method != null) {
                                                    try {
                                                        method.invoke(theme, new Object[0]);
                                                    } catch (IllegalAccessException | InvocationTargetException e4) {
                                                        Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e4);
                                                        b.f112f = null;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (NullPointerException unused3) {
                            }
                            context = dVar;
                        }
                    }
                } else if (C.f21210A0) {
                    Configuration configuration5 = new Configuration();
                    configuration5.uiMode = -1;
                    configuration5.fontScale = 0.0f;
                    configuration = context.createConfigurationContext(configuration5).getResources().getConfiguration();
                    configuration2 = context.getResources().getConfiguration();
                    configuration.uiMode = configuration2.uiMode;
                    if (configuration.equals(configuration2)) {
                        configuration3 = new Configuration();
                        configuration3.fontScale = 0.0f;
                        if (configuration.diff(configuration2) != 0) {
                            f10 = configuration.fontScale;
                            f11 = configuration2.fontScale;
                            if (f10 != f11) {
                                configuration3.fontScale = f11;
                            }
                            i10 = configuration.mcc;
                            i11 = configuration2.mcc;
                            if (i10 != i11) {
                                configuration3.mcc = i11;
                            }
                            i12 = configuration.mnc;
                            i13 = configuration2.mnc;
                            if (i12 != i13) {
                                configuration3.mnc = i13;
                            }
                            i14 = Build.VERSION.SDK_INT;
                            w.a(configuration, configuration2, configuration3);
                            i15 = configuration.touchscreen;
                            i16 = configuration2.touchscreen;
                            if (i15 != i16) {
                                configuration3.touchscreen = i16;
                            }
                            i17 = configuration.keyboard;
                            i18 = configuration2.keyboard;
                            if (i17 != i18) {
                                configuration3.keyboard = i18;
                            }
                            i19 = configuration.keyboardHidden;
                            i20 = configuration2.keyboardHidden;
                            if (i19 != i20) {
                                configuration3.keyboardHidden = i20;
                            }
                            i21 = configuration.navigation;
                            i22 = configuration2.navigation;
                            if (i21 != i22) {
                                configuration3.navigation = i22;
                            }
                            i23 = configuration.navigationHidden;
                            i24 = configuration2.navigationHidden;
                            if (i23 != i24) {
                                configuration3.navigationHidden = i24;
                            }
                            i25 = configuration.orientation;
                            i26 = configuration2.orientation;
                            if (i25 != i26) {
                                configuration3.orientation = i26;
                            }
                            i27 = configuration.screenLayout & 15;
                            i28 = configuration2.screenLayout & 15;
                            if (i27 != i28) {
                                configuration3.screenLayout |= i28;
                            }
                            i29 = configuration.screenLayout & 192;
                            i30 = configuration2.screenLayout & 192;
                            if (i29 != i30) {
                                configuration3.screenLayout |= i30;
                            }
                            i31 = configuration.screenLayout & 48;
                            i32 = configuration2.screenLayout & 48;
                            if (i31 != i32) {
                                configuration3.screenLayout |= i32;
                            }
                            i33 = configuration.screenLayout & 768;
                            i34 = configuration2.screenLayout & 768;
                            if (i33 != i34) {
                                configuration3.screenLayout |= i34;
                            }
                            if (i14 >= 26) {
                                if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                                    configuration3.colorMode |= configuration2.colorMode & 3;
                                }
                                if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                                    configuration3.colorMode |= configuration2.colorMode & 12;
                                }
                            }
                            i35 = configuration.uiMode & 15;
                            i36 = configuration2.uiMode & 15;
                            if (i35 != i36) {
                                configuration3.uiMode |= i36;
                            }
                            i37 = configuration.uiMode & 48;
                            i38 = configuration2.uiMode & 48;
                            if (i37 != i38) {
                                configuration3.uiMode |= i38;
                            }
                            i39 = configuration.screenWidthDp;
                            i40 = configuration2.screenWidthDp;
                            if (i39 != i40) {
                                configuration3.screenWidthDp = i40;
                            }
                            i41 = configuration.screenHeightDp;
                            i42 = configuration2.screenHeightDp;
                            if (i41 != i42) {
                                configuration3.screenHeightDp = i42;
                            }
                            i43 = configuration.smallestScreenWidthDp;
                            i44 = configuration2.smallestScreenWidthDp;
                            if (i43 != i44) {
                                configuration3.smallestScreenWidthDp = i44;
                            }
                            i45 = configuration.densityDpi;
                            i46 = configuration2.densityDpi;
                            if (i45 != i46) {
                                configuration3.densityDpi = i46;
                            }
                        }
                    } else {
                        configuration3 = null;
                    }
                    Configuration configurationU2 = C.u(context, iD, eVarP, configuration3, true);
                    dVar = new d(context, app.nagakiba.wayvibe.R.style.Theme_AppCompat_Empty);
                    dVar.a(configurationU2);
                    if (context.getTheme() != null) {
                        theme = dVar.getTheme();
                        if (Build.VERSION.SDK_INT >= 29) {
                            m.a(theme);
                        } else {
                            synchronized (b.f111e) {
                                if (b.f113g) {
                                    Method declaredMethod2 = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                                    b.f112f = declaredMethod2;
                                    declaredMethod2.setAccessible(true);
                                    b.f113g = true;
                                    method = b.f112f;
                                    if (method != null) {
                                        method.invoke(theme, new Object[0]);
                                    }
                                } else {
                                    method = b.f112f;
                                    if (method != null) {
                                        method.invoke(theme, new Object[0]);
                                    }
                                }
                            }
                        }
                    }
                    context = dVar;
                }
            }
        } else if (context instanceof d) {
            ((d) context).a(C.u(context, iD, eVarP, null, false));
        } else if (C.f21210A0) {
            Configuration configuration6 = new Configuration();
            configuration6.uiMode = -1;
            configuration6.fontScale = 0.0f;
            configuration = context.createConfigurationContext(configuration6).getResources().getConfiguration();
            configuration2 = context.getResources().getConfiguration();
            configuration.uiMode = configuration2.uiMode;
            if (configuration.equals(configuration2)) {
                configuration3 = new Configuration();
                configuration3.fontScale = 0.0f;
                if (configuration.diff(configuration2) != 0) {
                    f10 = configuration.fontScale;
                    f11 = configuration2.fontScale;
                    if (f10 != f11) {
                        configuration3.fontScale = f11;
                    }
                    i10 = configuration.mcc;
                    i11 = configuration2.mcc;
                    if (i10 != i11) {
                        configuration3.mcc = i11;
                    }
                    i12 = configuration.mnc;
                    i13 = configuration2.mnc;
                    if (i12 != i13) {
                        configuration3.mnc = i13;
                    }
                    i14 = Build.VERSION.SDK_INT;
                    w.a(configuration, configuration2, configuration3);
                    i15 = configuration.touchscreen;
                    i16 = configuration2.touchscreen;
                    if (i15 != i16) {
                        configuration3.touchscreen = i16;
                    }
                    i17 = configuration.keyboard;
                    i18 = configuration2.keyboard;
                    if (i17 != i18) {
                        configuration3.keyboard = i18;
                    }
                    i19 = configuration.keyboardHidden;
                    i20 = configuration2.keyboardHidden;
                    if (i19 != i20) {
                        configuration3.keyboardHidden = i20;
                    }
                    i21 = configuration.navigation;
                    i22 = configuration2.navigation;
                    if (i21 != i22) {
                        configuration3.navigation = i22;
                    }
                    i23 = configuration.navigationHidden;
                    i24 = configuration2.navigationHidden;
                    if (i23 != i24) {
                        configuration3.navigationHidden = i24;
                    }
                    i25 = configuration.orientation;
                    i26 = configuration2.orientation;
                    if (i25 != i26) {
                        configuration3.orientation = i26;
                    }
                    i27 = configuration.screenLayout & 15;
                    i28 = configuration2.screenLayout & 15;
                    if (i27 != i28) {
                        configuration3.screenLayout |= i28;
                    }
                    i29 = configuration.screenLayout & 192;
                    i30 = configuration2.screenLayout & 192;
                    if (i29 != i30) {
                        configuration3.screenLayout |= i30;
                    }
                    i31 = configuration.screenLayout & 48;
                    i32 = configuration2.screenLayout & 48;
                    if (i31 != i32) {
                        configuration3.screenLayout |= i32;
                    }
                    i33 = configuration.screenLayout & 768;
                    i34 = configuration2.screenLayout & 768;
                    if (i33 != i34) {
                        configuration3.screenLayout |= i34;
                    }
                    if (i14 >= 26) {
                        if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                            configuration3.colorMode |= configuration2.colorMode & 3;
                        }
                        if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                            configuration3.colorMode |= configuration2.colorMode & 12;
                        }
                    }
                    i35 = configuration.uiMode & 15;
                    i36 = configuration2.uiMode & 15;
                    if (i35 != i36) {
                        configuration3.uiMode |= i36;
                    }
                    i37 = configuration.uiMode & 48;
                    i38 = configuration2.uiMode & 48;
                    if (i37 != i38) {
                        configuration3.uiMode |= i38;
                    }
                    i39 = configuration.screenWidthDp;
                    i40 = configuration2.screenWidthDp;
                    if (i39 != i40) {
                        configuration3.screenWidthDp = i40;
                    }
                    i41 = configuration.screenHeightDp;
                    i42 = configuration2.screenHeightDp;
                    if (i41 != i42) {
                        configuration3.screenHeightDp = i42;
                    }
                    i43 = configuration.smallestScreenWidthDp;
                    i44 = configuration2.smallestScreenWidthDp;
                    if (i43 != i44) {
                        configuration3.smallestScreenWidthDp = i44;
                    }
                    i45 = configuration.densityDpi;
                    i46 = configuration2.densityDpi;
                    if (i45 != i46) {
                        configuration3.densityDpi = i46;
                    }
                }
            } else {
                configuration3 = null;
            }
            Configuration configurationU3 = C.u(context, iD, eVarP, configuration3, true);
            dVar = new d(context, app.nagakiba.wayvibe.R.style.Theme_AppCompat_Empty);
            dVar.a(configurationU3);
            if (context.getTheme() != null) {
                theme = dVar.getTheme();
                if (Build.VERSION.SDK_INT >= 29) {
                    m.a(theme);
                } else {
                    synchronized (b.f111e) {
                        if (b.f113g) {
                            Method declaredMethod3 = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            b.f112f = declaredMethod3;
                            declaredMethod3.setAccessible(true);
                            b.f113g = true;
                            method = b.f112f;
                            if (method != null) {
                                method.invoke(theme, new Object[0]);
                            }
                        } else {
                            method = b.f112f;
                            if (method != null) {
                                method.invoke(theme, new Object[0]);
                            }
                        }
                    }
                }
            }
            context = dVar;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractC1988a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.a()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.AbstractActivityC1038h, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC1988a supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.k(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e() {
        U.i(getWindow().getDecorView(), this);
        U.j(getWindow().getDecorView(), this);
        p206t6.b.Z(getWindow().getDecorView(), this);
        i.I(getWindow().getDecorView(), this);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i10) {
        C c3 = (C) getDelegate();
        c3.x();
        return (T) c3.f21234l.findViewById(i10);
    }

    public q getDelegate() {
        if (this.mDelegate == null) {
            o oVar = q.f21358a;
            this.mDelegate = new C(this, null, this, this);
        }
        return this.mDelegate;
    }

    public InterfaceC1989b getDrawerToggleDelegate() {
        ((C) getDelegate()).getClass();
        return new u();
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        C c3 = (C) getDelegate();
        if (c3.f21242p == null) {
            c3.B();
            AbstractC1988a abstractC1988a = c3.f21240o;
            c3.f21242p = new p132m.i(abstractC1988a != null ? abstractC1988a.e() : c3.k);
        }
        return c3.f21242p;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = this.mResources;
        if (resources == null) {
            int i10 = i1.f23367a;
        }
        return resources == null ? super.getResources() : resources;
    }

    public AbstractC1988a getSupportActionBar() {
        C c3 = (C) getDelegate();
        c3.B();
        return c3.f21240o;
    }

    @Override // androidx.core.app.K
    public Intent getSupportParentActivityIntent() {
        return AbstractC1035e.a(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().b();
    }

    @Override // p036d.n, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) throws IllegalAccessException {
        super.onConfigurationChanged(configuration);
        C c3 = (C) getDelegate();
        if (c3.f21218F && c3.f21260z) {
            c3.B();
            AbstractC1988a abstractC1988a = c3.f21240o;
            if (abstractC1988a != null) {
                abstractC1988a.h();
            }
        }
        C2158t c2158tA = C2158t.a();
        Context context = c3.k;
        synchronized (c2158tA) {
            N0 n6 = c2158tA.f23439a;
            synchronized (n6) {
                l lVar = (l) n6.f23245b.get(context);
                if (lVar != null) {
                    lVar.a();
                }
            }
        }
        c3.f21230X = new Configuration(c3.k.getResources().getConfiguration());
        c3.n(false, false);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(L l10) {
        l10.getClass();
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = AbstractC1035e.a(this);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            AbstractActivityC1998k abstractActivityC1998k = l10.f14909b;
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(abstractActivityC1998k.getPackageManager());
            }
            ArrayList arrayList = l10.f14908a;
            int size = arrayList.size();
            try {
                for (Intent intentB = AbstractC1035e.b(abstractActivityC1998k, component); intentB != null; intentB = AbstractC1035e.b(abstractActivityC1998k, intentB.getComponent())) {
                    arrayList.add(size, intentB);
                }
                arrayList.add(supportParentActivityIntent);
            } catch (PackageManager.NameNotFoundException e2) {
                Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                throw new IllegalArgumentException(e2);
            }
        }
    }

    @Override // androidx.fragment.app.K, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().f();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i10, keyEvent);
        }
        return true;
    }

    @Override // androidx.fragment.app.K, p036d.n, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        AbstractC1988a supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.d() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    @Override // p036d.n, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((C) getDelegate()).x();
    }

    @Override // androidx.fragment.app.K, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        C c3 = (C) getDelegate();
        c3.B();
        AbstractC1988a abstractC1988a = c3.f21240o;
        if (abstractC1988a != null) {
            abstractC1988a.n(true);
        }
    }

    @Override // androidx.fragment.app.K, android.app.Activity
    public void onStart() {
        super.onStart();
        ((C) getDelegate()).n(true, false);
    }

    @Override // androidx.fragment.app.K, android.app.Activity
    public void onStop() {
        super.onStop();
        C c3 = (C) getDelegate();
        c3.B();
        AbstractC1988a abstractC1988a = c3.f21240o;
        if (abstractC1988a != null) {
            abstractC1988a.n(false);
        }
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (!supportShouldUpRecreateTask(supportParentActivityIntent)) {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        L l10 = new L(this);
        onCreateSupportNavigateUpTaskStack(l10);
        onPrepareSupportNavigateUpTaskStack(l10);
        ArrayList arrayList = l10.f14908a;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        AbstractActivityC1998k abstractActivityC1998k = l10.f14909b;
        if (!p254y1.a.startActivities(abstractActivityC1998k, intentArr, null)) {
            Intent intent = new Intent(intentArr[intentArr.length - 1]);
            intent.addFlags(268435456);
            abstractActivityC1998k.startActivity(intent);
        }
        try {
            finishAffinity();
        } catch (IllegalStateException unused) {
            finish();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        getDelegate().l(charSequence);
    }

    @Override // p098j.InterfaceC1999l
    public p132m.b onWindowStartingSupportActionMode(p132m.a aVar) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractC1988a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.l()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // p036d.n, android.app.Activity
    public void setContentView(int i10) {
        e();
        getDelegate().i(i10);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        C c3 = (C) getDelegate();
        if (c3.f21233j instanceof Activity) {
            c3.B();
            AbstractC1988a abstractC1988a = c3.f21240o;
            if (abstractC1988a instanceof N) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            c3.f21242p = null;
            if (abstractC1988a != null) {
                abstractC1988a.i();
            }
            c3.f21240o = null;
            if (toolbar != null) {
                Object obj = c3.f21233j;
                J j10 = new J(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : c3.f21244q, c3.f21236m);
                c3.f21240o = j10;
                c3.f21236m.f21373b = j10.f21271c;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                c3.f21236m.f21373b = null;
            }
            c3.b();
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        super.setTheme(i10);
        ((C) getDelegate()).f21232Z = i10;
    }

    public p132m.b startSupportActionMode(p132m.a aVar) {
        return getDelegate().m(aVar);
    }

    public void supportInvalidateOptionsMenu() {
        getDelegate().b();
    }

    public void supportNavigateUpTo(Intent intent) {
        navigateUpTo(intent);
    }

    public boolean supportRequestWindowFeature(int i10) {
        return getDelegate().h(i10);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return shouldUpRecreateTask(intent);
    }

    @Override // p036d.n, android.app.Activity
    public void setContentView(View view) {
        e();
        getDelegate().j(view);
    }

    @Override // p036d.n, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e();
        getDelegate().k(view, layoutParams);
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public void onLocalesChanged(e eVar) {
    }

    public void onNightModeChanged(int i10) {
    }

    public void onPrepareSupportNavigateUpTaskStack(L l10) {
    }

    @Override // p098j.InterfaceC1999l
    public void onSupportActionModeFinished(p132m.b bVar) {
    }

    @Override // p098j.InterfaceC1999l
    public void onSupportActionModeStarted(p132m.b bVar) {
    }

    @Deprecated
    public void setSupportProgress(int i10) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z10) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z10) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z10) {
    }
}
