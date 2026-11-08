package M0;

import M8.D;

/* JADX INFO: loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.n implements Z8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f8052b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(String str, int i10) {
        super(1);
        this.f8051a = i10;
        this.f8052b = str;
    }

    @Override // Z8.c
    public final Object invoke(Object obj) {
        D d10 = D.f8402a;
        String str = this.f8052b;
        switch (this.f8051a) {
            case 0:
                t.d((v) obj, str);
                break;
            case 1:
                p075g9.j[] jVarArr = t.f8107a;
                u uVar = r.f8085d;
                p075g9.j jVar = t.f8107a[2];
                uVar.a((v) obj, str);
                break;
            case 2:
                v vVar = (v) obj;
                t.d(vVar, str);
                t.e(vVar, 5);
                break;
            case 3:
                p075g9.j[] jVarArr2 = t.f8107a;
                ((j) ((v) obj)).c(r.f8078D, str);
                break;
            case 4:
                v vVar2 = (v) obj;
                t.d(vVar2, str);
                t.e(vVar2, 5);
                break;
            default:
                v vVar3 = (v) obj;
                t.d(vVar3, str);
                t.e(vVar3, 5);
                break;
        }
        return d10;
    }
}
