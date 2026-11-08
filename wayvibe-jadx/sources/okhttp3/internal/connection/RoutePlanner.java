package okhttp3.internal.connection;

import kotlin.jvm.internal.m;
import okhttp3.Address;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes2.dex */
public interface RoutePlanner {

    public static final class ConnectResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Plan f24318a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Plan f24319b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Throwable f24320c;

        public /* synthetic */ ConnectResult(Plan plan, ConnectPlan connectPlan, Throwable th, int i10) {
            this(plan, (i10 & 2) != 0 ? null : connectPlan, (i10 & 4) != 0 ? null : th);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConnectResult)) {
                return false;
            }
            ConnectResult connectResult = (ConnectResult) obj;
            return m.b(this.f24318a, connectResult.f24318a) && m.b(this.f24319b, connectResult.f24319b) && m.b(this.f24320c, connectResult.f24320c);
        }

        public final int hashCode() {
            int iHashCode = this.f24318a.hashCode() * 31;
            Plan plan = this.f24319b;
            int iHashCode2 = (iHashCode + (plan == null ? 0 : plan.hashCode())) * 31;
            Throwable th = this.f24320c;
            return iHashCode2 + (th != null ? th.hashCode() : 0);
        }

        public final String toString() {
            return "ConnectResult(plan=" + this.f24318a + ", nextPlan=" + this.f24319b + ", throwable=" + this.f24320c + ')';
        }

        public ConnectResult(Plan plan, Plan plan2, Throwable th) {
            this.f24318a = plan;
            this.f24319b = plan2;
            this.f24320c = th;
        }
    }

    public static final class DefaultImpls {
    }

    public interface Plan {
        boolean a();

        Plan b();

        void cancel();

        RealConnection d();

        ConnectResult e();

        ConnectResult g();
    }

    boolean a(RealConnection realConnection);

    Address b();

    boolean c(HttpUrl httpUrl);
}
