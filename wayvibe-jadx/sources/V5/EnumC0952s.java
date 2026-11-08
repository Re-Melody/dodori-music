package V5;

/* JADX INFO: renamed from: V5.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0952s implements InterfaceC0935a {
    ED256(-260),
    ED512(-261),
    ED25519(-8),
    ES256(-7),
    ECDH_HKDF_256(-25),
    ES384(-35),
    ES512(-36);

    private final int zzb;

    EnumC0952s(int i10) {
        this.zzb = i10;
    }

    @Override // V5.InterfaceC0935a
    public final int f() {
        return this.zzb;
    }
}
