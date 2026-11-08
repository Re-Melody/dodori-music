package com.revenuecat.purchases.utils.serializers;

import M8.k;
import N8.y;
import Z8.c;
import java.lang.Enum;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import p219u9.a;
import p240w9.e;
import p240w9.g;
import p240w9.i;
import p251x9.d;

/* JADX INFO: loaded from: classes2.dex */
public abstract class EnumDeserializerWithDefault<T extends Enum<T>> implements a {
    private final T defaultValue;
    private final g descriptor;
    private final String enumName;
    private final Map<String, T> valuesByType;

    /* JADX INFO: renamed from: com.revenuecat.purchases.utils.serializers.EnumDeserializerWithDefault$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements c {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // Z8.c
        public final String invoke(T value) {
            m.f(value, "value");
            String lowerCase = value.name().toLowerCase(Locale.ROOT);
            m.e(lowerCase, "toLowerCase(...)");
            return lowerCase;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EnumDeserializerWithDefault(Map<String, ? extends T> valuesByType, T defaultValue) {
        m.f(valuesByType, "valuesByType");
        m.f(defaultValue, "defaultValue");
        this.valuesByType = valuesByType;
        this.defaultValue = defaultValue;
        String simpleName = defaultValue.getClass().getSimpleName();
        this.enumName = simpleName;
        this.descriptor = i.a(simpleName, e.f28069j);
    }

    @Override // p219u9.a
    public g getDescriptor() {
        return this.descriptor;
    }

    @Override // p219u9.a
    public T deserialize(p251x9.c decoder) {
        m.f(decoder, "decoder");
        T t10 = this.valuesByType.get(decoder.p());
        return t10 == null ? this.defaultValue : t10;
    }

    @Override // p219u9.a
    public void serialize(d encoder, T value) {
        m.f(encoder, "encoder");
        m.f(value, "value");
        throw new k("Serialization is not implemented because it is not needed.");
    }

    public /* synthetic */ EnumDeserializerWithDefault(Enum r10, c cVar, int i10, f fVar) {
        this(r10, (i10 & 2) != 0 ? AnonymousClass1.INSTANCE : cVar);
    }

    public EnumDeserializerWithDefault(T defaultValue, c typeForValue) {
        m.f(defaultValue, "defaultValue");
        m.f(typeForValue, "typeForValue");
        Object[] enumConstants = defaultValue.getClass().getEnumConstants();
        m.e(enumConstants, "defaultValue::class.java.enumConstants");
        int iE0 = y.e0(enumConstants.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iE0 < 16 ? 16 : iE0);
        for (Object obj : enumConstants) {
            linkedHashMap.put(typeForValue.invoke(obj), obj);
        }
        this(linkedHashMap, defaultValue);
    }
}
