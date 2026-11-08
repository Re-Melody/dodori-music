package A6;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class A extends AbstractC0090o implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f292b;

    public A(Object obj, List list) {
        this.f291a = obj;
        this.f292b = list;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f291a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f292b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
