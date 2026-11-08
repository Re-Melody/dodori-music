package F3;

import B2.AbstractC0111a;
import B2.AbstractC0112b;

/* JADX INFO: loaded from: classes.dex */
public final class s implements C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f4456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B2.t f4457b = new B2.t(new byte[10], 10, 0, (byte) 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4458c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public B2.A f4460e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4461f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4462g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f4463h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4464i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4465j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f4466l;

    public s(g gVar) {
        this.f4456a = gVar;
    }

    @Override // F3.C
    public final void a(B2.A a10, Z2.q qVar, D4.x xVar) {
        this.f4460e = a10;
        this.f4456a.e(qVar, xVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [B2.t] */
    /* JADX WARN: Type inference failed for: r11v3, types: [int] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r3v0, types: [F3.g] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // F3.C
    public final void b(int i10, B2.u uVar) {
        int i11;
        ?? r10;
        int i12;
        int i13;
        ?? r11;
        AbstractC0111a.i(this.f4460e);
        int i14 = i10 & 1;
        ?? r12 = this.f4456a;
        int i15 = 2;
        ?? r13 = 0;
        if (i14 != 0) {
            int i16 = this.f4458c;
            if (i16 != 0 && i16 != 1) {
                if (i16 == 2) {
                    AbstractC0111a.x("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i16 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f4465j != -1) {
                        AbstractC0111a.x("PesReader", "Unexpected start indicator: expected " + this.f4465j + " more bytes");
                    }
                    r12.f(uVar.f632c == 0);
                }
            }
            this.f4458c = 1;
            this.f4459d = 0;
        }
        int i17 = i10;
        while (uVar.a() > 0) {
            int i18 = this.f4458c;
            if (i18 != 0) {
                ?? r14 = this.f4457b;
                if (i18 != 1) {
                    if (i18 == i15) {
                        if (c(uVar, r14.f623b, Math.min(10, this.f4464i)) && c(uVar, null, this.f4464i)) {
                            r14.E(r13);
                            this.f4466l = -9223372036854775807L;
                            if (this.f4461f) {
                                r14.H(4);
                                long jW = ((long) r14.w(3)) << 30;
                                r14.H(1);
                                long jW2 = ((long) (r14.w(15) << 15)) | jW;
                                r14.H(1);
                                long jW3 = jW2 | ((long) r14.w(15));
                                r14.H(1);
                                if (!this.f4463h && this.f4462g) {
                                    r14.H(4);
                                    long jW4 = ((long) r14.w(3)) << 30;
                                    r14.H(1);
                                    long jW5 = jW4 | ((long) (r14.w(15) << 15));
                                    r14.H(1);
                                    long jW6 = jW5 | ((long) r14.w(15));
                                    r14.H(1);
                                    this.f4460e.b(jW6);
                                    this.f4463h = true;
                                }
                                this.f4466l = this.f4460e.b(jW3);
                            }
                            i17 |= this.k ? 4 : 0;
                            r12.g(i17, this.f4466l);
                            this.f4458c = 3;
                            this.f4459d = 0;
                            r13 = 0;
                            i15 = 2;
                        }
                    } else {
                        if (i18 != 3) {
                            throw new IllegalStateException();
                        }
                        int iA = uVar.a();
                        int i19 = this.f4465j;
                        if (i19 == -1) {
                            r11 = r13;
                        } else {
                            i13 = iA - i19;
                        }
                        if (r11 > 0) {
                            r11 = i13;
                            iA -= r11;
                            uVar.E(uVar.f631b + iA);
                        }
                        r11 = i13;
                        r12.c(uVar);
                        int i20 = this.f4465j;
                        if (i20 != -1) {
                            int i21 = i20 - iA;
                            this.f4465j = i21;
                            if (i21 == 0) {
                                r12.f(r13);
                                this.f4458c = 1;
                                this.f4459d = r13;
                            }
                        }
                    }
                    i11 = i15;
                    r10 = r13;
                } else {
                    ?? r15 = r13;
                    if (c(uVar, r14.f623b, 9)) {
                        r14.E(r15 == true ? 1 : 0);
                        int iW = r14.w(24);
                        if (iW != 1) {
                            AbstractC0112b.r(iW, "Unexpected start code prefix: ", "PesReader");
                            this.f4465j = -1;
                            i12 = 0;
                            i11 = 2;
                        } else {
                            r14.H(8);
                            int iW2 = r14.w(16);
                            r14.H(5);
                            this.k = r14.v();
                            i11 = 2;
                            r14.H(2);
                            this.f4461f = r14.v();
                            this.f4462g = r14.v();
                            r14.H(6);
                            int iW3 = r14.w(8);
                            this.f4464i = iW3;
                            if (iW2 == 0) {
                                this.f4465j = -1;
                            } else {
                                int i22 = (iW2 - 3) - iW3;
                                this.f4465j = i22;
                                if (i22 < 0) {
                                    AbstractC0111a.x("PesReader", "Found negative packet payload size: " + this.f4465j);
                                    this.f4465j = -1;
                                }
                            }
                            i12 = 2;
                        }
                        this.f4458c = i12;
                        r10 = 0;
                        this.f4459d = 0;
                    } else {
                        i11 = 2;
                        r10 = r15;
                    }
                }
            } else {
                i11 = i15;
                r10 = r13;
                uVar.G(uVar.a());
            }
            r13 = r10;
            i15 = i11;
        }
    }

    public final boolean c(B2.u uVar, byte[] bArr, int i10) {
        int iMin = Math.min(uVar.a(), i10 - this.f4459d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            uVar.G(iMin);
        } else {
            uVar.e(bArr, this.f4459d, iMin);
        }
        int i11 = this.f4459d + iMin;
        this.f4459d = i11;
        return i11 == i10;
    }

    @Override // F3.C
    public final void d() {
        this.f4458c = 0;
        this.f4459d = 0;
        this.f4463h = false;
        this.f4456a.d();
    }
}
