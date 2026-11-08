package com.revenuecat.purchases.common.caching;

import M8.InterfaceC0641c;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import p219u9.a;
import p240w9.g;
import p251x9.b;
import p260y9.C2370f;
import p260y9.Y;

/* JADX INFO: loaded from: classes2.dex */
public final class TokenCacheEntry {
    public static final Companion Companion = new Companion(null);
    private final Boolean isAutoRenewing;

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final a serializer() {
            return TokenCacheEntry$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public TokenCacheEntry() {
        this((Boolean) null, 1, (f) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ TokenCacheEntry copy$default(TokenCacheEntry tokenCacheEntry, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = tokenCacheEntry.isAutoRenewing;
        }
        return tokenCacheEntry.copy(bool);
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(TokenCacheEntry tokenCacheEntry, b bVar, g gVar) {
        if (!bVar.l(gVar) && tokenCacheEntry.isAutoRenewing == null) {
            return;
        }
        bVar.t(gVar, 0, C2370f.f29283a, tokenCacheEntry.isAutoRenewing);
    }

    public final Boolean component1() {
        return this.isAutoRenewing;
    }

    public final TokenCacheEntry copy(Boolean bool) {
        return new TokenCacheEntry(bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TokenCacheEntry) && m.b(this.isAutoRenewing, ((TokenCacheEntry) obj).isAutoRenewing);
    }

    public int hashCode() {
        Boolean bool = this.isAutoRenewing;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final Boolean isAutoRenewing() {
        return this.isAutoRenewing;
    }

    public String toString() {
        return "TokenCacheEntry(isAutoRenewing=" + this.isAutoRenewing + ')';
    }

    @InterfaceC0641c
    public /* synthetic */ TokenCacheEntry(int i10, Boolean bool, Y y6) {
        if ((i10 & 1) == 0) {
            this.isAutoRenewing = null;
        } else {
            this.isAutoRenewing = bool;
        }
    }

    public TokenCacheEntry(Boolean bool) {
        this.isAutoRenewing = bool;
    }

    public /* synthetic */ TokenCacheEntry(Boolean bool, int i10, f fVar) {
        this((i10 & 1) != 0 ? null : bool);
    }
}
