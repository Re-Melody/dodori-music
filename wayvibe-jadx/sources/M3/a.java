package M3;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.m;
import p098j.AbstractActivityC1998k;

/* JADX INFO: loaded from: classes.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8257a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8258b;

    public a(f registry) {
        m.f(registry, "registry");
        this.f8258b = new LinkedHashSet();
        registry.c("androidx.savedstate.Restarter", this);
    }

    @Override // M3.e
    public final Bundle a() {
        switch (this.f8257a) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f8258b));
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                ((AbstractActivityC1998k) this.f8258b).getDelegate().getClass();
                return bundle2;
        }
    }

    public a(AbstractActivityC1998k abstractActivityC1998k) {
        this.f8258b = abstractActivityC1998k;
    }
}
