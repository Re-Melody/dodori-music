package s7;

import com.google.firebase.firestore.J;
import java.util.Arrays;
import java.util.HashSet;
import org.maplibre.android.location.C2198e;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashSet f26188d = new HashSet(Arrays.asList("date", "x-google-backends", "x-google-netmon-label", "x-google-service", "x-google-gfe-request-trace"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2198e f26189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p207t7.g f26190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f26191c;

    public h(p207t7.g gVar, C2198e c2198e, n nVar) {
        this.f26190b = gVar;
        this.f26189a = c2198e;
        this.f26191c = nVar;
    }

    public static boolean a(J j10) {
        switch (g.f26187a[j10.ordinal()]) {
            case 1:
                throw new IllegalArgumentException("Treated status OK as error");
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return false;
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                return true;
            default:
                throw new IllegalArgumentException("Unknown gRPC status code: " + j10);
        }
    }
}
