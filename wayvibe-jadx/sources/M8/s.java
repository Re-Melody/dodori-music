package M8;

import org.apache.tika.fork.ForkServer;

/* JADX INFO: loaded from: classes2.dex */
public final class s implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f8426a;

    public /* synthetic */ s(byte b10) {
        this.f8426a = b10;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return kotlin.jvm.internal.m.g(this.f8426a & ForkServer.ERROR, ((s) obj).f8426a & ForkServer.ERROR);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return this.f8426a == ((s) obj).f8426a;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f8426a);
    }

    public final String toString() {
        return String.valueOf(this.f8426a & ForkServer.ERROR);
    }
}
