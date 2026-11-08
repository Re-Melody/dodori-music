package com.revenuecat.purchases.paywalls.components.common;

import M8.InterfaceC0641c;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import p219u9.a;
import p240w9.g;
import p251x9.b;
import p260y9.O;
import p260y9.Y;
import p270z9.C;
import p270z9.D;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public final class StateDeclaration {
    public static final Companion Companion = new Companion(null);
    private final C defaultValue;
    private final ValueType type;

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final a serializer() {
            return StateDeclaration$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public enum ValueType {
        BOOLEAN,
        INTEGER,
        DOUBLE,
        STRING,
        UNKNOWN;

        public static final Companion Companion = new Companion(null);

        public static final class Companion {
            public /* synthetic */ Companion(f fVar) {
                this();
            }

            public final a serializer() {
                return ValueTypeSerializer.INSTANCE;
            }

            private Companion() {
            }
        }
    }

    @InterfaceC0641c
    public /* synthetic */ StateDeclaration(int i10, ValueType valueType, C c3, Y y6) {
        if (3 != (i10 & 3)) {
            O.g(i10, 3, StateDeclaration$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.type = valueType;
        this.defaultValue = c3;
    }

    public static /* synthetic */ void getDefaultValue$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(StateDeclaration stateDeclaration, b bVar, g gVar) {
        bVar.m(gVar, 0, ValueTypeSerializer.INSTANCE, stateDeclaration.type);
        bVar.m(gVar, 1, D.f29913a, stateDeclaration.defaultValue);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StateDeclaration)) {
            return false;
        }
        StateDeclaration stateDeclaration = (StateDeclaration) obj;
        return this.type == stateDeclaration.type && m.b(this.defaultValue, stateDeclaration.defaultValue);
    }

    public final /* synthetic */ C getDefaultValue() {
        return this.defaultValue;
    }

    public final /* synthetic */ ValueType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.defaultValue.hashCode() + (this.type.hashCode() * 31);
    }

    public String toString() {
        return "StateDeclaration(type=" + this.type + ", defaultValue=" + this.defaultValue + ')';
    }

    public StateDeclaration(ValueType type, C defaultValue) {
        m.f(type, "type");
        m.f(defaultValue, "defaultValue");
        this.type = type;
        this.defaultValue = defaultValue;
    }
}
