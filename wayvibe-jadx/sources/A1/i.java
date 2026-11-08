package A1;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Configuration f130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f131c;

    public i(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f129a = colorStateList;
        this.f130b = configuration;
        this.f131c = theme == null ? 0 : theme.hashCode();
    }
}
