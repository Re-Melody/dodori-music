package com.revenuecat.purchases.rules;

import B2.AbstractC0112b;
import B8.V;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import p097i9.k;
import p097i9.q;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Value {

    public static final class ArrayValue extends Value {
        private final List<Value> items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ArrayValue(List<? extends Value> items) {
            super(null);
            m.f(items, "items");
            this.items = items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ArrayValue copy$default(ArrayValue arrayValue, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = arrayValue.items;
            }
            return arrayValue.copy(list);
        }

        public final List<Value> component1() {
            return this.items;
        }

        public final ArrayValue copy(List<? extends Value> items) {
            m.f(items, "items");
            return new ArrayValue(items);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ArrayValue) && m.b(this.items, ((ArrayValue) obj).items);
        }

        public final List<Value> getItems() {
            return this.items;
        }

        public int hashCode() {
            return this.items.hashCode();
        }

        public String toString() {
            return AbstractC0112b.m(new StringBuilder("ArrayValue(items="), this.items, ')');
        }
    }

    public static final class BoolValue extends Value {
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

    public static final class FloatValue extends Value {
        private final double value;

        public FloatValue(double d10) {
            super(null);
            this.value = d10;
        }

        public static /* synthetic */ FloatValue copy$default(FloatValue floatValue, double d10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                d10 = floatValue.value;
            }
            return floatValue.copy(d10);
        }

        public final double component1() {
            return this.value;
        }

        public final FloatValue copy(double d10) {
            return new FloatValue(d10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FloatValue) && Double.compare(this.value, ((FloatValue) obj).value) == 0;
        }

        public final double getValue() {
            return this.value;
        }

        public int hashCode() {
            return Double.hashCode(this.value);
        }

        public String toString() {
            return "FloatValue(value=" + this.value + ')';
        }
    }

    public static final class IntValue extends Value {
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

    public static final class Null extends Value {
        public static final Null INSTANCE = new Null();

        private Null() {
            super(null);
        }
    }

    public static final class ObjectValue extends Value {
        private final Map<String, Value> entries;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ObjectValue(Map<String, ? extends Value> entries) {
            super(null);
            m.f(entries, "entries");
            this.entries = entries;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ObjectValue copy$default(ObjectValue objectValue, Map map, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                map = objectValue.entries;
            }
            return objectValue.copy(map);
        }

        public final Map<String, Value> component1() {
            return this.entries;
        }

        public final ObjectValue copy(Map<String, ? extends Value> entries) {
            m.f(entries, "entries");
            return new ObjectValue(entries);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ObjectValue) && m.b(this.entries, ((ObjectValue) obj).entries);
        }

        public final Map<String, Value> getEntries() {
            return this.entries;
        }

        public int hashCode() {
            return this.entries.hashCode();
        }

        public String toString() {
            return b.n(new StringBuilder("ObjectValue(entries="), this.entries, ')');
        }
    }

    public static final class StringValue extends Value {
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

    public static final class Undefined extends Value {
        public static final Undefined INSTANCE = new Undefined();

        private Undefined() {
            super(null);
        }
    }

    public /* synthetic */ Value(f fVar) {
        this();
    }

    public final boolean isTruthy$purchases_defaultsRelease() {
        if (equals(Null.INSTANCE) ? true : equals(Undefined.INSTANCE)) {
            return false;
        }
        if (this instanceof BoolValue) {
            return ((BoolValue) this).getValue();
        }
        if (this instanceof IntValue) {
            return ((IntValue) this).getValue() != 0;
        }
        if (this instanceof FloatValue) {
            FloatValue floatValue = (FloatValue) this;
            return (((floatValue.getValue() > 0.0d ? 1 : (floatValue.getValue() == 0.0d ? 0 : -1)) == 0) || Double.isNaN(floatValue.getValue())) ? false : true;
        }
        if (this instanceof StringValue) {
            return ((StringValue) this).getValue().length() > 0;
        }
        if (this instanceof ArrayValue) {
            return !((ArrayValue) this).getItems().isEmpty();
        }
        if (this instanceof ObjectValue) {
            return true;
        }
        throw new V();
    }

    public final Double toNumberOrNull$purchases_defaultsRelease() {
        if (equals(Null.INSTANCE)) {
            return Double.valueOf(0.0d);
        }
        if (equals(Undefined.INSTANCE)) {
            return null;
        }
        if (this instanceof BoolValue) {
            return Double.valueOf(((BoolValue) this).getValue() ? 1.0d : 0.0d);
        }
        if (this instanceof IntValue) {
            return Double.valueOf(((IntValue) this).getValue());
        }
        if (this instanceof FloatValue) {
            return Double.valueOf(((FloatValue) this).getValue());
        }
        if (this instanceof StringValue) {
            String string = k.S0(((StringValue) this).getValue()).toString();
            return string.length() == 0 ? Double.valueOf(0.0d) : q.Z(string);
        }
        if (!(this instanceof ArrayValue ? true : this instanceof ObjectValue)) {
            throw new V();
        }
        String string2 = k.S0(ValueKt.jsString(this)).toString();
        return string2.length() == 0 ? Double.valueOf(0.0d) : q.Z(string2);
    }

    private Value() {
    }
}
