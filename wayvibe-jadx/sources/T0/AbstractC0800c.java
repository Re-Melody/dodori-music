package T0;

/* JADX INFO: renamed from: T0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0800c implements InterfaceC0816t {
    public static final int $stable = 0;
    private final int loadingStrategy;
    private final InterfaceC0799b typefaceLoader;
    private final H variationSettings;

    public AbstractC0800c(int i10, InterfaceC0799b interfaceC0799b, H h10) {
        this.loadingStrategy = i10;
        this.typefaceLoader = interfaceC0799b;
        this.variationSettings = h10;
    }

    @Override // T0.InterfaceC0816t
    /* JADX INFO: renamed from: getLoadingStrategy-PKNRLFQ */
    public final int mo8getLoadingStrategyPKNRLFQ() {
        return this.loadingStrategy;
    }

    public final InterfaceC0799b getTypefaceLoader() {
        return this.typefaceLoader;
    }

    public final H getVariationSettings() {
        return this.variationSettings;
    }
}
