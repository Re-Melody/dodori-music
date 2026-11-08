package A6;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class Q implements p267z6.o, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f322a;

    public Q() {
        AbstractC0093s.c(2, "expectedValuesPerKey");
        this.f322a = 2;
    }

    @Override // p267z6.o
    public final Object get() {
        return new ArrayList(this.f322a);
    }
}
