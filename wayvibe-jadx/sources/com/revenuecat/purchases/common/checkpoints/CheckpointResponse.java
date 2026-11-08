package com.revenuecat.purchases.common.checkpoints;

import B2.AbstractC0112b;
import M8.InterfaceC0641c;
import N8.s;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import p219u9.a;
import p240w9.g;
import p251x9.b;
import p260y9.Y;

/* JADX INFO: loaded from: classes2.dex */
public final class CheckpointResponse {
    public static final Companion Companion = new Companion(null);
    private final List<CheckpointRule> rules;

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final a serializer() {
            return CheckpointResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public CheckpointResponse() {
        this((List) null, 1, (f) (0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CheckpointResponse copy$default(CheckpointResponse checkpointResponse, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = checkpointResponse.rules;
        }
        return checkpointResponse.copy(list);
    }

    public static /* synthetic */ void getRules$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(CheckpointResponse checkpointResponse, b bVar, g gVar) {
        if (!bVar.l(gVar) && m.b(checkpointResponse.rules, s.f8650a)) {
            return;
        }
        bVar.m(gVar, 0, CheckpointRulesSerializer.INSTANCE, checkpointResponse.rules);
    }

    public final List<CheckpointRule> component1() {
        return this.rules;
    }

    public final CheckpointResponse copy(List<CheckpointRule> rules) {
        m.f(rules, "rules");
        return new CheckpointResponse(rules);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CheckpointResponse) && m.b(this.rules, ((CheckpointResponse) obj).rules);
    }

    public final List<CheckpointRule> getRules() {
        return this.rules;
    }

    public int hashCode() {
        return this.rules.hashCode();
    }

    public String toString() {
        return AbstractC0112b.m(new StringBuilder("CheckpointResponse(rules="), this.rules, ')');
    }

    @InterfaceC0641c
    public /* synthetic */ CheckpointResponse(int i10, List list, Y y6) {
        if ((i10 & 1) == 0) {
            this.rules = s.f8650a;
        } else {
            this.rules = list;
        }
    }

    public CheckpointResponse(List<CheckpointRule> rules) {
        m.f(rules, "rules");
        this.rules = rules;
    }

    public /* synthetic */ CheckpointResponse(List list, int i10, f fVar) {
        this((i10 & 1) != 0 ? s.f8650a : list);
    }
}
