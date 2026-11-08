package com.revenuecat.purchases.common.checkpoints;

import B2.AbstractC0112b;
import M8.InterfaceC0641c;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import p219u9.a;
import p240w9.g;
import p251x9.b;
import p260y9.O;
import p260y9.Y;
import p260y9.c0;

/* JADX INFO: loaded from: classes2.dex */
public final class CheckpointRule {
    public static final Companion Companion = new Companion(null);
    private final String audienceId;
    private final String id;
    private final String workflowId;

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final a serializer() {
            return CheckpointRule$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @InterfaceC0641c
    public /* synthetic */ CheckpointRule(int i10, String str, String str2, String str3, Y y6) {
        if (6 != (i10 & 6)) {
            O.g(i10, 6, CheckpointRule$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i10 & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        this.audienceId = str2;
        this.workflowId = str3;
    }

    public static /* synthetic */ CheckpointRule copy$default(CheckpointRule checkpointRule, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = checkpointRule.id;
        }
        if ((i10 & 2) != 0) {
            str2 = checkpointRule.audienceId;
        }
        if ((i10 & 4) != 0) {
            str3 = checkpointRule.workflowId;
        }
        return checkpointRule.copy(str, str2, str3);
    }

    public static /* synthetic */ void getAudienceId$annotations() {
    }

    public static /* synthetic */ void getWorkflowId$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(CheckpointRule checkpointRule, b bVar, g gVar) {
        if (bVar.l(gVar) || checkpointRule.id != null) {
            bVar.t(gVar, 0, c0.f29272a, checkpointRule.id);
        }
        bVar.u(gVar, 1, checkpointRule.audienceId);
        bVar.u(gVar, 2, checkpointRule.workflowId);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.audienceId;
    }

    public final String component3() {
        return this.workflowId;
    }

    public final CheckpointRule copy(String str, String audienceId, String workflowId) {
        m.f(audienceId, "audienceId");
        m.f(workflowId, "workflowId");
        return new CheckpointRule(str, audienceId, workflowId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckpointRule)) {
            return false;
        }
        CheckpointRule checkpointRule = (CheckpointRule) obj;
        return m.b(this.id, checkpointRule.id) && m.b(this.audienceId, checkpointRule.audienceId) && m.b(this.workflowId, checkpointRule.workflowId);
    }

    public final String getAudienceId() {
        return this.audienceId;
    }

    public final String getId() {
        return this.id;
    }

    public final String getWorkflowId() {
        return this.workflowId;
    }

    public int hashCode() {
        String str = this.id;
        return this.workflowId.hashCode() + AbstractC0112b.a((str == null ? 0 : str.hashCode()) * 31, 31, this.audienceId);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CheckpointRule(id=");
        sb.append(this.id);
        sb.append(", audienceId=");
        sb.append(this.audienceId);
        sb.append(", workflowId=");
        return AbstractC0112b.j(sb, this.workflowId, ')');
    }

    public CheckpointRule(String str, String audienceId, String workflowId) {
        m.f(audienceId, "audienceId");
        m.f(workflowId, "workflowId");
        this.id = str;
        this.audienceId = audienceId;
        this.workflowId = workflowId;
    }

    public /* synthetic */ CheckpointRule(String str, String str2, String str3, int i10, f fVar) {
        this((i10 & 1) != 0 ? null : str, str2, str3);
    }
}
