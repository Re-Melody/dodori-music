package p108j9;

import R3.a;
import kotlin.jvm.internal.m;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import org.slf4j.helpers.i;
import p097i9.k;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f21529b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f21530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f21531d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21532a;

    static {
        int i10 = c.f21533a;
        f21530c = i.t(4611686018427387903L);
        f21531d = i.t(-4611686018427387903L);
    }

    public static final long a(long j10, long j11) {
        long j12 = 1000000;
        long j13 = j11 / j12;
        long j14 = j10 + j13;
        if (-4611686018426L > j14 || j14 >= 4611686018427L) {
            return i.t(a.p(j14, -4611686018427387903L, 4611686018427387903L));
        }
        return i.v((j14 * j12) + (j11 - (j13 * j12)));
    }

    public static final void b(StringBuilder sb, int i10, int i11, int i12, String str, boolean z10) {
        sb.append(i10);
        if (i11 != 0) {
            sb.append(com.amazon.a.a.o.c.a.b.f16463a);
            String strC0 = k.C0(i12, String.valueOf(i11));
            int i13 = -1;
            int length = strC0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i14 = length - 1;
                    if (strC0.charAt(length) != '0') {
                        i13 = length;
                        break;
                    } else if (i14 < 0) {
                        break;
                    } else {
                        length = i14;
                    }
                }
            }
            int i15 = i13 + 1;
            if (z10 || i15 >= 3) {
                sb.append((CharSequence) strC0, 0, ((i13 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) strC0, 0, i15);
            }
        }
        sb.append(str);
    }

    public static int c(long j10, long j11) {
        long j12 = j10 ^ j11;
        if (j12 < 0 || (((int) j12) & 1) == 0) {
            return m.h(j10, j11);
        }
        int i10 = (((int) j10) & 1) - (((int) j11) & 1);
        return j10 < 0 ? -i10 : i10;
    }

    public static final long d(long j10) {
        return ((((int) j10) & 1) != 1 || f(j10)) ? h(j10, d.MILLISECONDS) : j10 >> 1;
    }

    public static final int e(long j10) {
        if (f(j10)) {
            return 0;
        }
        return (((int) j10) & 1) == 1 ? (int) (((j10 >> 1) % ((long) PipesIterator.DEFAULT_QUEUE_SIZE)) * ((long) 1000000)) : (int) ((j10 >> 1) % ((long) 1000000000));
    }

    public static final boolean f(long j10) {
        return j10 == f21530c || j10 == f21531d;
    }

    public static final long g(long j10, long j11) {
        if (f(j10)) {
            if (!f(j11) || (j11 ^ j10) >= 0) {
                return j10;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (f(j11)) {
            return j11;
        }
        int i10 = ((int) j10) & 1;
        if (i10 != (((int) j11) & 1)) {
            return i10 == 1 ? a(j10 >> 1, j11 >> 1) : a(j11 >> 1, j10 >> 1);
        }
        long j12 = (j10 >> 1) + (j11 >> 1);
        if (i10 == 0) {
            return (-4611686018426999999L > j12 || j12 >= 4611686018427000000L) ? i.t(j12 / ((long) 1000000)) : i.v(j12);
        }
        return i.u(j12);
    }

    public static final long h(long j10, d unit) {
        m.f(unit, "unit");
        if (j10 == f21530c) {
            return Long.MAX_VALUE;
        }
        if (j10 == f21531d) {
            return Long.MIN_VALUE;
        }
        long j11 = j10 >> 1;
        d sourceUnit = (((int) j10) & 1) == 0 ? d.NANOSECONDS : d.MILLISECONDS;
        m.f(sourceUnit, "sourceUnit");
        return unit.f().convert(j11, sourceUnit.f());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return c(this.f21532a, ((b) obj).f21532a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f21532a == ((b) obj).f21532a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f21532a);
    }

    public final String toString() {
        int i10;
        long j10 = this.f21532a;
        if (j10 == 0) {
            return "0s";
        }
        if (j10 == f21530c) {
            return "Infinity";
        }
        if (j10 == f21531d) {
            return "-Infinity";
        }
        boolean z10 = j10 < 0;
        StringBuilder sb = new StringBuilder();
        if (z10) {
            sb.append('-');
        }
        if (j10 < 0) {
            j10 = ((long) (((int) j10) & 1)) + ((-(j10 >> 1)) << 1);
            int i11 = c.f21533a;
        }
        long jH = h(j10, d.DAYS);
        int iH = f(j10) ? 0 : (int) (h(j10, d.HOURS) % ((long) 24));
        int iH2 = f(j10) ? 0 : (int) (h(j10, d.MINUTES) % ((long) 60));
        int iH3 = f(j10) ? 0 : (int) (h(j10, d.SECONDS) % ((long) 60));
        int iE = e(j10);
        boolean z11 = jH != 0;
        boolean z12 = iH != 0;
        boolean z13 = iH2 != 0;
        boolean z14 = (iH3 == 0 && iE == 0) ? false : true;
        if (z11) {
            sb.append(jH);
            sb.append('d');
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (z12 || (z11 && (z13 || z14))) {
            int i12 = i10 + 1;
            if (i10 > 0) {
                sb.append(' ');
            }
            sb.append(iH);
            sb.append('h');
            i10 = i12;
        }
        if (z13 || (z14 && (z12 || z11))) {
            int i13 = i10 + 1;
            if (i10 > 0) {
                sb.append(' ');
            }
            sb.append(iH2);
            sb.append('m');
            i10 = i13;
        }
        if (z14) {
            int i14 = i10 + 1;
            if (i10 > 0) {
                sb.append(' ');
            }
            if (iH3 != 0 || z11 || z12 || z13) {
                b(sb, iH3, iE, 9, "s", false);
            } else if (iE >= 1000000) {
                b(sb, iE / 1000000, iE % 1000000, 6, "ms", false);
            } else if (iE >= 1000) {
                b(sb, iE / PipesIterator.DEFAULT_QUEUE_SIZE, iE % PipesIterator.DEFAULT_QUEUE_SIZE, 3, "us", false);
            } else {
                sb.append(iE);
                sb.append("ns");
            }
            i10 = i14;
        }
        if (z10 && i10 > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }
}
