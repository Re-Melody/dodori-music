package D8;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class Z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f2438c;

    public long a() {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        return timeUnit.convert(this.f2437b ? System.nanoTime() - this.f2438c : 0L, timeUnit);
    }

    public void b() {
        p229v9.a.o("This stopwatch is already running.", !this.f2437b);
        this.f2437b = true;
        this.f2438c = System.nanoTime();
    }

    public String toString() {
        String str;
        switch (this.f2436a) {
            case 2:
                long jNanoTime = this.f2437b ? System.nanoTime() - this.f2438c : 0L;
                TimeUnit timeUnit = TimeUnit.DAYS;
                TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                if (timeUnit.convert(jNanoTime, timeUnit2) <= 0) {
                    timeUnit = TimeUnit.HOURS;
                    if (timeUnit.convert(jNanoTime, timeUnit2) <= 0) {
                        timeUnit = TimeUnit.MINUTES;
                        if (timeUnit.convert(jNanoTime, timeUnit2) <= 0) {
                            timeUnit = TimeUnit.SECONDS;
                            if (timeUnit.convert(jNanoTime, timeUnit2) <= 0) {
                                timeUnit = TimeUnit.MILLISECONDS;
                                if (timeUnit.convert(jNanoTime, timeUnit2) <= 0) {
                                    timeUnit = TimeUnit.MICROSECONDS;
                                    if (timeUnit.convert(jNanoTime, timeUnit2) <= 0) {
                                        timeUnit = timeUnit2;
                                    }
                                }
                            }
                        }
                    }
                }
                double dConvert = jNanoTime / timeUnit2.convert(1L, timeUnit);
                StringBuilder sb = new StringBuilder();
                sb.append(String.format(Locale.ROOT, "%.4g", Double.valueOf(dConvert)));
                sb.append(StringUtils.SPACE);
                switch (p267z6.n.f29891a[timeUnit.ordinal()]) {
                    case 1:
                        str = "ns";
                        break;
                    case 2:
                        str = "μs";
                        break;
                    case 3:
                        str = "ms";
                        break;
                    case 4:
                        str = "s";
                        break;
                    case 5:
                        str = "min";
                        break;
                    case 6:
                        str = "h";
                        break;
                    case 7:
                        str = com.apple.android.music.playback.reporting.d.f17633a;
                        break;
                    default:
                        throw new AssertionError();
                }
                sb.append(str);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public Z1(boolean z10, long j10) {
        this.f2436a = 0;
        this.f2437b = z10;
        this.f2438c = j10;
    }
}
