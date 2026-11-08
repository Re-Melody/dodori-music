package M0;

import M8.InterfaceC0643e;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0643e f8011b;

    public a(String str, InterfaceC0643e interfaceC0643e) {
        this.f8010a = str;
        this.f8011b = interfaceC0643e;
    }

    public final String a() {
        return this.f8010a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.m.b(this.f8010a, aVar.f8010a) && kotlin.jvm.internal.m.b(this.f8011b, aVar.f8011b);
    }

    public final int hashCode() {
        String str = this.f8010a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        InterfaceC0643e interfaceC0643e = this.f8011b;
        return iHashCode + (interfaceC0643e != null ? interfaceC0643e.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f8010a + ", action=" + this.f8011b + ')';
    }
}
