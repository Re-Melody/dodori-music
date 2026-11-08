package M2;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class m implements Q2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f8200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8201c;

    public m(String str, List list, boolean z10) {
        this.f8199a = str;
        this.f8200b = Collections.unmodifiableList(list);
        this.f8201c = z10;
    }
}
