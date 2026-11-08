package F3;

import B2.AbstractC0111a;
import Z2.F;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f4352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4357f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f4358g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f4359h;

    public k(F f10) {
        this.f4352a = f10;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        if (this.f4354c) {
            int i12 = this.f4357f;
            int i13 = (i10 + 1) - i12;
            if (i13 >= i11) {
                this.f4357f = (i11 - i10) + i12;
            } else {
                this.f4355d = ((bArr[i13] & 192) >> 6) == 0;
                this.f4354c = false;
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void b(int i10, long j10, boolean z10) {
        AbstractC0111a.h(this.f4359h != -9223372036854775807L);
        if (this.f4356e == 182 && z10 && this.f4353b) {
            this.f4352a.a(this.f4359h, this.f4355d ? 1 : 0, (int) (j10 - this.f4358g), i10, null);
        }
        if (this.f4356e != 179) {
            this.f4358g = j10;
        }
    }
}
