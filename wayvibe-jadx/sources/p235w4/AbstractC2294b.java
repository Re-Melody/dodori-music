package p235w4;

import X4.j;
import java.util.UUID;

/* JADX INFO: renamed from: w4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2294b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f27903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final UUID f27904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final UUID f27905c;

    static {
        f27903a = j.f13232a < 23 ? 1020 : 6396;
        f27904b = new UUID(0L, 0L);
        new UUID(1186680826959645954L, -5988876978535335093L);
        new UUID(-2129748144642739255L, 8654423357094679310L);
        f27905c = new UUID(-1301668207276963122L, -6645017420763422227L);
        new UUID(-7348484286925749626L, -6083546864340672619L);
    }

    public static long a(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 / 1000;
    }

    public static long b(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 * 1000;
    }
}
