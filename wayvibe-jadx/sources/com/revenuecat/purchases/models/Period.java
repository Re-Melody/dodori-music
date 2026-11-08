package com.revenuecat.purchases.models;

import B2.AbstractC0112b;
import B8.V;
import M8.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.common.LogWrapperKt;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class Period implements Parcelable {
    private final String iso8601;
    private final Unit unit;
    private final int value;
    public static final Factory Factory = new Factory(null);
    public static final Parcelable.Creator<Period> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<Period> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Period createFromParcel(Parcel parcel) {
            m.f(parcel, "parcel");
            return new Period(parcel.readInt(), Unit.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Period[] newArray(int i10) {
            return new Period[i10];
        }
    }

    public static final class Factory {
        public /* synthetic */ Factory(f fVar) {
            this();
        }

        public final Period create(String iso8601) {
            m.f(iso8601, "iso8601");
            l period = PeriodKt.toPeriod(iso8601);
            return new Period(((Number) period.f8413a).intValue(), (Unit) period.f8414b, iso8601);
        }

        private Factory() {
        }
    }

    public enum Unit {
        DAY,
        WEEK,
        MONTH,
        YEAR,
        UNKNOWN
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Unit.values().length];
            try {
                iArr[Unit.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Unit.WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Unit.MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Unit.YEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Unit.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Period(int i10, Unit unit, String iso8601) {
        m.f(unit, "unit");
        m.f(iso8601, "iso8601");
        this.value = i10;
        this.unit = unit;
        this.iso8601 = iso8601;
    }

    @InternalRevenueCatAPI
    public static /* synthetic */ void getValueInDays$annotations() {
    }

    @InternalRevenueCatAPI
    public static /* synthetic */ void getValueInWeeks$annotations() {
    }

    @InternalRevenueCatAPI
    public static /* synthetic */ void getValueInYears$annotations() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Period)) {
            return false;
        }
        Period period = (Period) obj;
        return this.value == period.value && this.unit == period.unit && m.b(this.iso8601, period.iso8601);
    }

    public final String getIso8601() {
        return this.iso8601;
    }

    public final Unit getUnit() {
        return this.unit;
    }

    public final int getValue() {
        return this.value;
    }

    public final double getValueInDays() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.unit.ordinal()];
        if (i10 == 1) {
            return this.value;
        }
        if (i10 == 2) {
            return ((double) this.value) * 7.0d;
        }
        if (i10 == 3) {
            return ((double) this.value) * 30.0d;
        }
        if (i10 == 4) {
            return ((double) this.value) * 365.0d;
        }
        if (i10 != 5) {
            throw new V();
        }
        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Unknown period unit trying to get value in days: " + this.unit, null);
        return 0.0d;
    }

    public final double getValueInMonths() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.unit.ordinal()];
        if (i10 == 1) {
            return ((double) this.value) / 30.0d;
        }
        if (i10 == 2) {
            return ((double) this.value) / 4.345238095238096d;
        }
        if (i10 == 3) {
            return this.value;
        }
        if (i10 == 4) {
            return ((double) this.value) * 12.0d;
        }
        if (i10 != 5) {
            throw new V();
        }
        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Unknown period unit trying to get value in months: " + this.unit, null);
        return 0.0d;
    }

    public final double getValueInWeeks() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.unit.ordinal()];
        if (i10 == 1) {
            return ((double) this.value) / 7.0d;
        }
        if (i10 == 2) {
            return this.value;
        }
        if (i10 == 3) {
            return ((double) this.value) * 4.345238095238096d;
        }
        if (i10 == 4) {
            return ((double) this.value) * 52.142857142857146d;
        }
        if (i10 != 5) {
            throw new V();
        }
        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Unknown period unit trying to get value in weeks: " + this.unit, null);
        return 0.0d;
    }

    public final double getValueInYears() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.unit.ordinal()];
        if (i10 == 1) {
            return ((double) this.value) / 365.0d;
        }
        if (i10 == 2) {
            return ((double) this.value) / 52.142857142857146d;
        }
        if (i10 == 3) {
            return ((double) this.value) / 12.0d;
        }
        if (i10 == 4) {
            return this.value;
        }
        if (i10 != 5) {
            throw new V();
        }
        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Unknown period unit trying to get value in years: " + this.unit, null);
        return 0.0d;
    }

    public int hashCode() {
        return this.iso8601.hashCode() + ((this.unit.hashCode() + (this.value * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Period(value=");
        sb.append(this.value);
        sb.append(", unit=");
        sb.append(this.unit);
        sb.append(", iso8601=");
        return AbstractC0112b.j(sb, this.iso8601, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i10) {
        m.f(out, "out");
        out.writeInt(this.value);
        out.writeString(this.unit.name());
        out.writeString(this.iso8601);
    }
}
