package T3;

import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes.dex */
public final class r implements BiConsumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f11622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11623b;

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            this.f11622a = (Integer) obj2;
            return;
        }
        if (iIntValue == 1) {
            this.f11623b = (String) obj2;
        } else {
            if (num.intValue() >= 0) {
                return;
            }
            throw new UnsupportedOperationException("The current AndroidX version doesn't support this callback value: " + num);
        }
    }
}
