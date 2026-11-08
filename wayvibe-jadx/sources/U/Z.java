package U;

/* JADX INFO: loaded from: classes.dex */
public interface Z extends InterfaceC0877b0, Y0 {
    @Override // U.Y0
    default Object getValue() {
        return Integer.valueOf(((C0885f0) this).m());
    }

    @Override // U.InterfaceC0877b0
    default void setValue(Object obj) {
        ((C0885f0) this).r(((Number) obj).intValue());
    }
}
