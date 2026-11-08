package com.revenuecat.purchases.common.caching;

import B2.AbstractC0112b;
import M8.InterfaceC0641c;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import p219u9.a;
import p240w9.g;
import p251x9.b;
import p260y9.O;
import p260y9.Y;

/* JADX INFO: loaded from: classes2.dex */
public final class WorkflowMetadata {
    public static final Companion Companion = new Companion(null);
    private final String stepId;
    private final String workflowId;

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final WorkflowMetadata from(String str, String str2) {
            if (str == null || str2 == null) {
                return null;
            }
            return new WorkflowMetadata(str, str2);
        }

        public final a serializer() {
            return WorkflowMetadata$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @InterfaceC0641c
    public /* synthetic */ WorkflowMetadata(int i10, String str, String str2, Y y6) {
        if (3 != (i10 & 3)) {
            O.g(i10, 3, WorkflowMetadata$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.workflowId = str;
        this.stepId = str2;
    }

    public static /* synthetic */ WorkflowMetadata copy$default(WorkflowMetadata workflowMetadata, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = workflowMetadata.workflowId;
        }
        if ((i10 & 2) != 0) {
            str2 = workflowMetadata.stepId;
        }
        return workflowMetadata.copy(str, str2);
    }

    public static /* synthetic */ void getStepId$annotations() {
    }

    public static /* synthetic */ void getWorkflowId$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(WorkflowMetadata workflowMetadata, b bVar, g gVar) {
        bVar.u(gVar, 0, workflowMetadata.workflowId);
        bVar.u(gVar, 1, workflowMetadata.stepId);
    }

    public final String component1() {
        return this.workflowId;
    }

    public final String component2() {
        return this.stepId;
    }

    public final WorkflowMetadata copy(String workflowId, String stepId) {
        m.f(workflowId, "workflowId");
        m.f(stepId, "stepId");
        return new WorkflowMetadata(workflowId, stepId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorkflowMetadata)) {
            return false;
        }
        WorkflowMetadata workflowMetadata = (WorkflowMetadata) obj;
        return m.b(this.workflowId, workflowMetadata.workflowId) && m.b(this.stepId, workflowMetadata.stepId);
    }

    public final String getStepId() {
        return this.stepId;
    }

    public final String getWorkflowId() {
        return this.workflowId;
    }

    public int hashCode() {
        return this.stepId.hashCode() + (this.workflowId.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WorkflowMetadata(workflowId=");
        sb.append(this.workflowId);
        sb.append(", stepId=");
        return AbstractC0112b.j(sb, this.stepId, ')');
    }

    public WorkflowMetadata(String workflowId, String stepId) {
        m.f(workflowId, "workflowId");
        m.f(stepId, "stepId");
        this.workflowId = workflowId;
        this.stepId = stepId;
    }
}
