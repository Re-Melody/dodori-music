package H1;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f5744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5746e;

    public /* synthetic */ d(String str, Context context, Object obj, int i10, int i11) {
        this.f5742a = i11;
        this.f5743b = str;
        this.f5744c = context;
        this.f5746e = obj;
        this.f5745d = i10;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f5742a) {
            case 0:
                Object[] objArr = {(c) this.f5746e};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                return g.b(this.f5743b, this.f5744c, Collections.unmodifiableList(arrayList), this.f5745d);
            default:
                try {
                    return g.b(this.f5743b, this.f5744c, (List) this.f5746e, this.f5745d);
                } catch (Throwable unused) {
                    return new f(-3);
                }
        }
    }
}
