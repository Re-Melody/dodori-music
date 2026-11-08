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
public final class ThemeVideoUrls {
    public static final Companion Companion = new Companion(null);
    private final VideoUrls dark;
    private final VideoUrls light;

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final a serializer() {
            return ThemeVideoUrls$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @InterfaceC0641c
    public /* synthetic */ ThemeVideoUrls(int i10, VideoUrls videoUrls, VideoUrls videoUrls2, Y y6) {
        if (3 != (i10 & 3)) {
            O.g(i10, 3, ThemeVideoUrls$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.light = videoUrls;
        this.dark = videoUrls2;
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(ThemeVideoUrls themeVideoUrls, b bVar, g gVar) {
        VideoUrls$$serializer videoUrls$$serializer = VideoUrls$$serializer.INSTANCE;
        bVar.m(gVar, 0, videoUrls$$serializer, themeVideoUrls.light);
        bVar.t(gVar, 1, videoUrls$$serializer, themeVideoUrls.dark);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThemeVideoUrls)) {
            return false;
        }
        ThemeVideoUrls themeVideoUrls = (ThemeVideoUrls) obj;
        return m.b(this.light, themeVideoUrls.light) && m.b(this.dark, themeVideoUrls.dark);
    }

    public final /* synthetic */ VideoUrls getDark() {
        return this.dark;
    }

    public final /* synthetic */ VideoUrls getLight() {
        return this.light;
    }

    public int hashCode() {
        int iHashCode = this.light.hashCode() * 31;
        VideoUrls videoUrls = this.dark;
        return iHashCode + (videoUrls == null ? 0 : videoUrls.hashCode());
    }

    public String toString() {
        return "ThemeVideoUrls(light=" + this.light + ", dark=" + this.dark + ')';
    }

    public ThemeVideoUrls(VideoUrls light, VideoUrls videoUrls) {
        m.f(light, "light");
        this.light = light;
        this.dark = videoUrls;
    }
}
