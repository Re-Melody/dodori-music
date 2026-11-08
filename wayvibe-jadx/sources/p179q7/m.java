package p179q7;

import p170p7.n;
import p170p7.q;
import p242x0.c;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f25700c = new m(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f25701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f25702b;

    public m(q qVar, Boolean bool) {
        c.z("Precondition can specify \"exists\" or \"updateTime\" but not both", qVar == null || bool == null, new Object[0]);
        this.f25701a = qVar;
        this.f25702b = bool;
    }

    public static m a(boolean z10) {
        return new m(null, Boolean.valueOf(z10));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0023 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0024 A[RETURN] */
    public final boolean b(n nVar) {
        q qVar = this.f25701a;
        if (qVar != null) {
            if (nVar.d() && nVar.f25271c.equals(qVar)) {
                return true;
            }
            return false;
        }
        Boolean bool = this.f25702b;
        if (bool == null) {
            c.z("Precondition should be empty", qVar == null && bool == null, new Object[0]);
            return true;
        }
        if (bool.booleanValue() == nVar.d()) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            q qVar = mVar.f25701a;
            q qVar2 = this.f25701a;
            if (qVar2 == null ? qVar != null : !qVar2.equals(qVar)) {
                return false;
            }
            Boolean bool = mVar.f25702b;
            Boolean bool2 = this.f25702b;
            if (bool2 != null) {
                return bool2.equals(bool);
            }
            if (bool == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        q qVar = this.f25701a;
        int iHashCode = (qVar != null ? qVar.f25279a.hashCode() : 0) * 31;
        Boolean bool = this.f25702b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        Boolean bool = this.f25702b;
        q qVar = this.f25701a;
        if (qVar == null && bool == null) {
            return "Precondition{<none>}";
        }
        if (qVar != null) {
            return "Precondition{updateTime=" + qVar + "}";
        }
        if (bool == null) {
            c.l("Invalid Precondition", new Object[0]);
            throw null;
        }
        return "Precondition{exists=" + bool + "}";
    }
}
