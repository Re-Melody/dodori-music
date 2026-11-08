package p132m;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import app.nagakiba.wayvibe.R;

/* JADX INFO: loaded from: classes.dex */
public final class d extends ContextWrapper {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Configuration f22120f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Resources.Theme f22122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LayoutInflater f22123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Configuration f22124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Resources f22125e;

    public d(Context context, int i10) {
        super(context);
        this.f22121a = i10;
    }

    public final void a(Configuration configuration) {
        if (this.f22125e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f22124d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f22124d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f22122b == null) {
            this.f22122b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f22122b.setTo(theme);
            }
        }
        this.f22122b.applyStyle(this.f22121a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f22125e == null) {
            Configuration configuration = this.f22124d;
            if (configuration == null) {
                this.f22125e = super.getResources();
            } else {
                if (Build.VERSION.SDK_INT >= 26) {
                    if (f22120f == null) {
                        Configuration configuration2 = new Configuration();
                        configuration2.fontScale = 0.0f;
                        f22120f = configuration2;
                    }
                    if (configuration.equals(f22120f)) {
                        this.f22125e = super.getResources();
                    }
                }
                this.f22125e = createConfigurationContext(this.f22124d).getResources();
            }
        }
        return this.f22125e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f22123c == null) {
            this.f22123c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f22123c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f22122b;
        if (theme != null) {
            return theme;
        }
        if (this.f22121a == 0) {
            this.f22121a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f22122b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i10) {
        if (this.f22121a != i10) {
            this.f22121a = i10;
            b();
        }
    }
}
