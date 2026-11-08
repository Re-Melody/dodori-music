package com.revenuecat.purchases.ui.revenuecatui.customercenter.data;

import Z8.a;
import Z8.g;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class CreateSupportTicketData {
    public static final int $stable = 0;
    private final a onCancel;
    private final a onClose;
    private final g onSubmit;

    public CreateSupportTicketData(g onSubmit, a onCancel, a onClose) {
        m.f(onSubmit, "onSubmit");
        m.f(onCancel, "onCancel");
        m.f(onClose, "onClose");
        this.onSubmit = onSubmit;
        this.onCancel = onCancel;
        this.onClose = onClose;
    }

    public static /* synthetic */ CreateSupportTicketData copy$default(CreateSupportTicketData createSupportTicketData, g gVar, a aVar, a aVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = createSupportTicketData.onSubmit;
        }
        if ((i10 & 2) != 0) {
            aVar = createSupportTicketData.onCancel;
        }
        if ((i10 & 4) != 0) {
            aVar2 = createSupportTicketData.onClose;
        }
        return createSupportTicketData.copy(gVar, aVar, aVar2);
    }

    public final g component1() {
        return this.onSubmit;
    }

    public final a component2() {
        return this.onCancel;
    }

    public final a component3() {
        return this.onClose;
    }

    public final CreateSupportTicketData copy(g onSubmit, a onCancel, a onClose) {
        m.f(onSubmit, "onSubmit");
        m.f(onCancel, "onCancel");
        m.f(onClose, "onClose");
        return new CreateSupportTicketData(onSubmit, onCancel, onClose);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateSupportTicketData)) {
            return false;
        }
        CreateSupportTicketData createSupportTicketData = (CreateSupportTicketData) obj;
        return m.b(this.onSubmit, createSupportTicketData.onSubmit) && m.b(this.onCancel, createSupportTicketData.onCancel) && m.b(this.onClose, createSupportTicketData.onClose);
    }

    public final /* synthetic */ a getOnCancel() {
        return this.onCancel;
    }

    public final /* synthetic */ a getOnClose() {
        return this.onClose;
    }

    public final /* synthetic */ g getOnSubmit() {
        return this.onSubmit;
    }

    public int hashCode() {
        return this.onClose.hashCode() + ((this.onCancel.hashCode() + (this.onSubmit.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "CreateSupportTicketData(onSubmit=" + this.onSubmit + ", onCancel=" + this.onCancel + ", onClose=" + this.onClose + ')';
    }
}
