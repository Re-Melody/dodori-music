package H1;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f5729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f5730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f5731c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Objects.equals(this.f5729a, aVar.f5729a) && Objects.equals(this.f5730b, aVar.f5730b) && Objects.equals(this.f5731c, aVar.f5731c);
    }

    public final int hashCode() {
        return Objects.hash(this.f5729a, this.f5730b, this.f5731c);
    }
}
