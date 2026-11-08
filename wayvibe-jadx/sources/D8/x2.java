package D8;

import java.io.OutputStream;
import java.net.ProxySelector;
import java.nio.ByteBuffer;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class x2 implements E, t2, p267z6.o, B8.a0, B8.d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x2 f2840b = new x2(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2841a;

    public /* synthetic */ x2(int i10) {
        this.f2841a = i10;
    }

    public static C0267d0 f() {
        C0267d0 c0267d0 = new C0267d0();
        c0267d0.f2506a = new Random();
        long nanos = TimeUnit.SECONDS.toNanos(1L);
        c0267d0.f2507b = TimeUnit.MINUTES.toNanos(2L);
        c0267d0.f2508c = 1.6d;
        c0267d0.f2509d = 0.2d;
        c0267d0.f2510e = nanos;
        return c0267d0;
    }

    @Override // B8.d0
    /* JADX INFO: renamed from: a */
    public byte[] mo0a(Object obj) {
        switch (this.f2841a) {
            case 11:
                return (byte[]) obj;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // D8.E
    public int b(AbstractC0266d abstractC0266d, int i10, Object obj, int i11) {
        switch (this.f2841a) {
            case 2:
                return abstractC0266d.w();
            case 3:
                abstractC0266d.A(i10);
                return 0;
            case 4:
                abstractC0266d.v((byte[]) obj, i11, i10);
                return i11 + i10;
            case 5:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                int iLimit = byteBuffer.limit();
                byteBuffer.limit(byteBuffer.position() + i10);
                abstractC0266d.q(byteBuffer);
                byteBuffer.limit(iLimit);
                return 0;
            default:
                abstractC0266d.l((OutputStream) obj, i10);
                return 0;
        }
    }

    public long c() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    @Override // D8.t2
    public Object d() {
        switch (this.f2841a) {
            case 8:
                return Executors.newCachedThreadPool(AbstractC0291l0.e("grpc-default-executor-%d"));
            default:
                ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, AbstractC0291l0.e("grpc-timer-%d"));
                try {
                    scheduledExecutorServiceNewScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", Boolean.TYPE).invoke(scheduledExecutorServiceNewScheduledThreadPool, Boolean.TRUE);
                    break;
                } catch (NoSuchMethodException unused) {
                } catch (RuntimeException e2) {
                    throw e2;
                } catch (Exception e4) {
                    throw new RuntimeException(e4);
                }
                return Executors.unconfigurableScheduledExecutorService(scheduledExecutorServiceNewScheduledThreadPool);
        }
    }

    @Override // B8.a0
    public Object e(String str) {
        p229v9.a.g("empty timeout", str.length() > 0);
        p229v9.a.g("bad timeout format", str.length() <= 9);
        long j10 = Long.parseLong(str.substring(0, str.length() - 1));
        char cCharAt = str.charAt(str.length() - 1);
        if (cCharAt == 'H') {
            return Long.valueOf(TimeUnit.HOURS.toNanos(j10));
        }
        if (cCharAt == 'M') {
            return Long.valueOf(TimeUnit.MINUTES.toNanos(j10));
        }
        if (cCharAt == 'S') {
            return Long.valueOf(TimeUnit.SECONDS.toNanos(j10));
        }
        if (cCharAt == 'u') {
            return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(j10));
        }
        if (cCharAt == 'm') {
            return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(j10));
        }
        if (cCharAt == 'n') {
            return Long.valueOf(j10);
        }
        throw new IllegalArgumentException("Invalid timeout unit: " + cCharAt);
    }

    @Override // p267z6.o
    public Object get() {
        switch (this.f2841a) {
            case 10:
                return new Z1(2);
            default:
                return ProxySelector.getDefault();
        }
    }

    @Override // B8.d0
    public Object h(byte[] bArr) {
        switch (this.f2841a) {
            case 11:
                return bArr;
            default:
                if (bArr.length < 3) {
                    throw new NumberFormatException("Malformed status code ".concat(new String(bArr, B8.I.f736a)));
                }
                return Integer.valueOf((bArr[2] - 48) + ((bArr[1] - 48) * 10) + ((bArr[0] - 48) * 100));
        }
    }

    @Override // D8.t2
    public void n(Object obj) {
        switch (this.f2841a) {
            case 8:
                ((ExecutorService) ((Executor) obj)).shutdown();
                break;
            default:
                ((ScheduledExecutorService) obj).shutdown();
                break;
        }
    }

    public String toString() {
        switch (this.f2841a) {
            case 8:
                return "grpc-default-executor";
            default:
                return super.toString();
        }
    }

    @Override // B8.a0
    public String a(Object obj) {
        Long l10 = (Long) obj;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (l10.longValue() < 0) {
            throw new IllegalArgumentException("Timeout too small");
        }
        if (l10.longValue() < 100000000) {
            return l10 + "n";
        }
        if (l10.longValue() < 100000000000L) {
            return timeUnit.toMicros(l10.longValue()) + "u";
        }
        if (l10.longValue() < 100000000000000L) {
            return timeUnit.toMillis(l10.longValue()) + "m";
        }
        if (l10.longValue() < 100000000000000000L) {
            return timeUnit.toSeconds(l10.longValue()) + "S";
        }
        if (l10.longValue() < 6000000000000000000L) {
            return timeUnit.toMinutes(l10.longValue()) + "M";
        }
        return timeUnit.toHours(l10.longValue()) + "H";
    }
}
