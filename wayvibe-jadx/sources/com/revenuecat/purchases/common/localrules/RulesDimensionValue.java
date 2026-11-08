package com.revenuecat.purchases.common.localrules;

import B2.AbstractC0112b;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public abstract class RulesDimensionValue {

    public static final class BoolValue extends RulesDimensionValue {
        private final boolean value;

        public BoolValue(boolean z10) {
            super(null);
            this.value = z10;
        }

        public static /* synthetic */ BoolValue copy$default(BoolValue boolValue, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = boolValue.value;
            }
            return boolValue.copy(z10);
        }

        public final boolean component1() {
            return this.value;
        }

        public final BoolValue copy(boolean z10) {
            return new BoolValue(z10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BoolValue) && this.value == ((BoolValue) obj).value;
        }

        public final boolean getValue() {
            return this.value;
        }

        public int hashCode() {
            return Boolean.hashCode(this.value);
        }

        public String toString() {
            return b.o(new StringBuilder("BoolValue(value="), this.value, ')');
        }
    }

    public static final class DateValue extends RulesDimensionValue {
        private final Date value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DateValue(Date value) {
            super(null);
            m.f(value, "value");
            this.value = value;
        }

        public static /* synthetic */ DateValue copy$default(DateValue dateValue, Date date, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                date = dateValue.value;
            }
            return dateValue.copy(date);
        }

        public final Date component1() {
            return this.value;
        }

        public final DateValue copy(Date value) {
            m.f(value, "value");
            return new DateValue(value);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DateValue) && m.b(this.value, ((DateValue) obj).value);
        }

        public final Date getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "DateValue(value=" + this.value + ')';
        }
    }

    public static final class DoubleValue extends RulesDimensionValue {
        private final double value;

        public DoubleValue(double d10) {
            super(null);
            this.value = d10;
        }

        public static /* synthetic */ DoubleValue copy$default(DoubleValue doubleValue, double d10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                d10 = doubleValue.value;
            }
            return doubleValue.copy(d10);
        }

        public final double component1() {
            return this.value;
        }

        public final DoubleValue copy(double d10) {
            return new DoubleValue(d10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DoubleValue) && Double.compare(this.value, ((DoubleValue) obj).value) == 0;
        }

        public final double getValue() {
            return this.value;
        }

        public int hashCode() {
            return Double.hashCode(this.value);
        }

        public String toString() {
            return "DoubleValue(value=" + this.value + ')';
        }
    }

    public static final class IntValue extends RulesDimensionValue {
        private final long value;

        public IntValue(long j10) {
            super(null);
            this.value = j10;
        }

        public static /* synthetic */ IntValue copy$default(IntValue intValue, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = intValue.value;
            }
            return intValue.copy(j10);
        }

        public final long component1() {
            return this.value;
        }

        public final IntValue copy(long j10) {
            return new IntValue(j10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IntValue) && this.value == ((IntValue) obj).value;
        }

        public final long getValue() {
            return this.value;
        }

        public int hashCode() {
            return Long.hashCode(this.value);
        }

        public String toString() {
            return "IntValue(value=" + this.value + ')';
        }
    }

    public static final class ObjectListValue extends RulesDimensionValue {
        private final List<Map<String, RulesDimensionValue>> value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ObjectListValue(List<? extends Map<String, ? extends RulesDimensionValue>> value) {
            super(null);
            m.f(value, "value");
            this.value = value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ObjectListValue copy$default(ObjectListValue objectListValue, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = objectListValue.value;
            }
            return objectListValue.copy(list);
        }

        public final List<Map<String, RulesDimensionValue>> component1() {
            return this.value;
        }

        public final ObjectListValue copy(List<? extends Map<String, ? extends RulesDimensionValue>> value) {
            m.f(value, "value");
            return new ObjectListValue(value);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ObjectListValue) && m.b(this.value, ((ObjectListValue) obj).value);
        }

        public final List<Map<String, RulesDimensionValue>> getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return AbstractC0112b.m(new StringBuilder("ObjectListValue(value="), this.value, ')');
        }
    }

    public static final class ObjectValue extends RulesDimensionValue {
        private final Map<String, RulesDimensionValue> value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ObjectValue(Map<String, ? extends RulesDimensionValue> value) {
            super(null);
            m.f(value, "value");
            this.value = value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ObjectValue copy$default(ObjectValue objectValue, Map map, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                map = objectValue.value;
            }
            return objectValue.copy(map);
        }

        public final Map<String, RulesDimensionValue> component1() {
            return this.value;
        }

        public final ObjectValue copy(Map<String, ? extends RulesDimensionValue> value) {
            m.f(value, "value");
            return new ObjectValue(value);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ObjectValue) && m.b(this.value, ((ObjectValue) obj).value);
        }

        public final Map<String, RulesDimensionValue> getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return b.n(new StringBuilder("ObjectValue(value="), this.value, ')');
        }
    }

    public static final class StringValue extends RulesDimensionValue {
        private final String value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StringValue(String value) {
            super(null);
            m.f(value, "value");
            this.value = value;
        }

        public static /* synthetic */ StringValue copy$default(StringValue stringValue, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = stringValue.value;
            }
            return stringValue.copy(str);
        }

        public final String component1() {
            return this.value;
        }

        public final StringValue copy(String value) {
            m.f(value, "value");
            return new StringValue(value);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StringValue) && m.b(this.value, ((StringValue) obj).value);
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return AbstractC0112b.j(new StringBuilder("StringValue(value="), this.value, ')');
        }
    }

    public /* synthetic */ RulesDimensionValue(f fVar) {
        this();
    }

    private RulesDimensionValue() {
    }
}
