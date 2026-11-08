package V5;

/* JADX INFO: loaded from: classes.dex */
public enum G implements InterfaceC0935a {
    RS256(-257),
    RS384(-258),
    RS512(-259),
    LEGACY_RS1(-262),
    PS256(-37),
    PS384(-38),
    PS512(-39),
    RS1(-65535);

    private final int zzb;

    G(int i10) {
        this.zzb = i10;
    }

    @Override // V5.InterfaceC0935a
    public final int f() {
        return this.zzb;
    }
}
