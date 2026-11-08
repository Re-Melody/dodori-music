package okhttp3;

import N8.n;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.m;
import okhttp3.internal.tls.CertificateChainCleaner;

/* JADX INFO: loaded from: classes2.dex */
public final class CertificatePinner {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Companion f23959c = new Companion(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final CertificatePinner f23960d = new CertificatePinner(n.b1(new Builder().f23963a), null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f23961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CertificateChainCleaner f23962b;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f23963a = new ArrayList();
    }

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Pin {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) obj;
            pin.getClass();
            pin.getClass();
            pin.getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    public CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner) {
        this.f23961a = set;
        this.f23962b = certificateChainCleaner;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CertificatePinner)) {
            return false;
        }
        CertificatePinner certificatePinner = (CertificatePinner) obj;
        return m.b(certificatePinner.f23961a, this.f23961a) && m.b(certificatePinner.f23962b, this.f23962b);
    }

    public final int hashCode() {
        int iHashCode = (this.f23961a.hashCode() + 1517) * 41;
        CertificateChainCleaner certificateChainCleaner = this.f23962b;
        return iHashCode + (certificateChainCleaner != null ? certificateChainCleaner.hashCode() : 0);
    }
}
