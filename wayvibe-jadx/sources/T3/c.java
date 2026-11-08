package T3;

import android.os.Build;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashSet f11596c = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11598b;

    public c(String str, String str2) {
        this.f11597a = str;
        this.f11598b = str2;
        f11596c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = a.f11594a;
        String str = this.f11598b;
        if (hashSet.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        if (!"eng".equals(str2) && !"userdebug".equals(str2)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":dev");
        return hashSet.contains(sb.toString());
    }
}
