package T3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes.dex */
public final class s implements S3.h, BiConsumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f11624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f11625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f11626c;

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            if (obj2 != null) {
                this.f11624a = (Long) obj2;
                return;
            }
            return;
        }
        if (iIntValue == 1) {
            if (obj2 != null) {
                return;
            }
            return;
        }
        if (iIntValue == 2) {
            this.f11625b.add(new e());
            return;
        }
        if (iIntValue != 3) {
            if (num.intValue() >= 0) {
                return;
            }
            throw new UnsupportedOperationException("The current AndroidX version doesn't support this callback value: " + num);
        }
        boolean z10 = obj2 instanceof List;
        ArrayList arrayList = this.f11626c;
        if (!z10) {
            arrayList.add(new e());
            return;
        }
        List list = (List) obj2;
        if (list.isEmpty()) {
            return;
        }
        arrayList.add(new e());
    }

    @Override // S3.h
    public final Long getTotalTimeInUiThreadMillis() {
        return this.f11624a;
    }
}
