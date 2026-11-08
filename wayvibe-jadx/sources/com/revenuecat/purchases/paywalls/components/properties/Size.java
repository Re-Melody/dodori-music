package com.revenuecat.purchases.paywalls.components.properties;

import M8.InterfaceC0641c;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import p219u9.a;
import p240w9.g;
import p251x9.b;
import p260y9.O;
import p260y9.Y;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public final class Size {
    public static final Companion Companion = new Companion(null);
    private final SizeConstraint height;
    private final SizeConstraint width;

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final a serializer() {
            return Size$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @InterfaceC0641c
    public /* synthetic */ Size(int i10, SizeConstraint sizeConstraint, SizeConstraint sizeConstraint2, Y y6) {
        if (3 != (i10 & 3)) {
            O.g(i10, 3, Size$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.width = sizeConstraint;
        this.height = sizeConstraint2;
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(Size size, b bVar, g gVar) {
        SizeConstraintDeserializer sizeConstraintDeserializer = SizeConstraintDeserializer.INSTANCE;
        bVar.m(gVar, 0, sizeConstraintDeserializer, size.width);
        bVar.m(gVar, 1, sizeConstraintDeserializer, size.height);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Size)) {
            return false;
        }
        Size size = (Size) obj;
        return m.b(this.width, size.width) && m.b(this.height, size.height);
    }

    public final /* synthetic */ SizeConstraint getHeight() {
        return this.height;
    }

    public final /* synthetic */ SizeConstraint getWidth() {
        return this.width;
    }

    public int hashCode() {
        return this.height.hashCode() + (this.width.hashCode() * 31);
    }

    public String toString() {
        return "Size(width=" + this.width + ", height=" + this.height + ')';
    }

    public Size(SizeConstraint width, SizeConstraint height) {
        m.f(width, "width");
        m.f(height, "height");
        this.width = width;
        this.height = height;
    }
}
