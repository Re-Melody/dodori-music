package com.revenuecat.purchases.ui.revenuecatui.components.countdown;

import V0.p;
import kotlin.jvm.internal.f;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
public final class CountdownTime {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final CountdownTime ZERO = new CountdownTime(0, 0, 0, 0);
    private final int days;
    private final int hours;
    private final int minutes;
    private final int seconds;

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final CountdownTime fromInterval(long j10) {
            long jMax = Math.max(0L, j10 / ((long) PipesIterator.DEFAULT_QUEUE_SIZE));
            long j11 = 86400;
            long j12 = 3600;
            long j13 = 60;
            return new CountdownTime((int) (jMax / j11), (int) ((jMax % j11) / j12), (int) ((jMax % j12) / j13), (int) (jMax % j13));
        }

        public final CountdownTime getZERO() {
            return CountdownTime.ZERO;
        }

        private Companion() {
        }
    }

    public CountdownTime(int i10, int i11, int i12, int i13) {
        this.days = i10;
        this.hours = i11;
        this.minutes = i12;
        this.seconds = i13;
    }

    public static /* synthetic */ CountdownTime copy$default(CountdownTime countdownTime, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = countdownTime.days;
        }
        if ((i14 & 2) != 0) {
            i11 = countdownTime.hours;
        }
        if ((i14 & 4) != 0) {
            i12 = countdownTime.minutes;
        }
        if ((i14 & 8) != 0) {
            i13 = countdownTime.seconds;
        }
        return countdownTime.copy(i10, i11, i12, i13);
    }

    public static /* synthetic */ void getTotalHours$annotations() {
    }

    public static /* synthetic */ void getTotalMinutes$annotations() {
    }

    public final int component1() {
        return this.days;
    }

    public final int component2() {
        return this.hours;
    }

    public final int component3() {
        return this.minutes;
    }

    public final int component4() {
        return this.seconds;
    }

    public final CountdownTime copy(int i10, int i11, int i12, int i13) {
        return new CountdownTime(i10, i11, i12, i13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CountdownTime)) {
            return false;
        }
        CountdownTime countdownTime = (CountdownTime) obj;
        return this.days == countdownTime.days && this.hours == countdownTime.hours && this.minutes == countdownTime.minutes && this.seconds == countdownTime.seconds;
    }

    public final int getDays() {
        return this.days;
    }

    public final int getHours() {
        return this.hours;
    }

    public final int getMinutes() {
        return this.minutes;
    }

    public final int getSeconds() {
        return this.seconds;
    }

    public final int getTotalHours() {
        return (this.days * 24) + this.hours;
    }

    public final int getTotalMinutes() {
        return (this.hours * 60) + (this.days * 1440) + this.minutes;
    }

    public int hashCode() {
        return Integer.hashCode(this.seconds) + b.c(this.minutes, b.c(this.hours, Integer.hashCode(this.days) * 31, 31), 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CountdownTime(days=");
        sb.append(this.days);
        sb.append(", hours=");
        sb.append(this.hours);
        sb.append(", minutes=");
        sb.append(this.minutes);
        sb.append(", seconds=");
        return p.q(sb, this.seconds, ')');
    }
}
