package com.revenuecat.purchases.paywalls.events;

import M8.InterfaceC0641c;
import com.revenuecat.purchases.common.events.BackendEvent;
import com.revenuecat.purchases.utils.Event;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import p219u9.a;
import p240w9.g;
import p251x9.b;
import p260y9.O;
import p260y9.Y;
import p270z9.AbstractC2449b;
import p270z9.C2448a;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallStoredEvent implements Event {
    public static final Companion Companion = new Companion(null);
    private static final C2448a json = AbstractC2449b.f29915d;
    private final PaywallEvent event;
    private final String userID;

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final PaywallStoredEvent fromString(String string) {
            m.f(string, "string");
            C2448a json = getJson();
            json.getClass();
            return (PaywallStoredEvent) json.b(string, PaywallStoredEvent.Companion.serializer());
        }

        public final C2448a getJson() {
            return PaywallStoredEvent.json;
        }

        public final a serializer() {
            return PaywallStoredEvent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @InterfaceC0641c
    public /* synthetic */ PaywallStoredEvent(int i10, PaywallEvent paywallEvent, String str, Y y6) {
        if (3 != (i10 & 3)) {
            O.g(i10, 3, PaywallStoredEvent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.event = paywallEvent;
        this.userID = str;
    }

    public static /* synthetic */ PaywallStoredEvent copy$default(PaywallStoredEvent paywallStoredEvent, PaywallEvent paywallEvent, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            paywallEvent = paywallStoredEvent.event;
        }
        if ((i10 & 2) != 0) {
            str = paywallStoredEvent.userID;
        }
        return paywallStoredEvent.copy(paywallEvent, str);
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(PaywallStoredEvent paywallStoredEvent, b bVar, g gVar) {
        bVar.m(gVar, 0, PaywallEvent$$serializer.INSTANCE, paywallStoredEvent.event);
        bVar.u(gVar, 1, paywallStoredEvent.userID);
    }

    public final PaywallEvent component1() {
        return this.event;
    }

    public final String component2() {
        return this.userID;
    }

    public final PaywallStoredEvent copy(PaywallEvent event, String userID) {
        m.f(event, "event");
        m.f(userID, "userID");
        return new PaywallStoredEvent(event, userID);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallStoredEvent)) {
            return false;
        }
        PaywallStoredEvent paywallStoredEvent = (PaywallStoredEvent) obj;
        return m.b(this.event, paywallStoredEvent.event) && m.b(this.userID, paywallStoredEvent.userID);
    }

    public final PaywallEvent getEvent() {
        return this.event;
    }

    public final String getUserID() {
        return this.userID;
    }

    public int hashCode() {
        return this.userID.hashCode() + (this.event.hashCode() * 31);
    }

    public final BackendEvent.Paywalls toBackendEvent() {
        BackendPaywallComponentFields backendComponentFields = PaywallEventKt.toBackendComponentFields(this.event.getComponentInteraction());
        String string = this.event.getCreationData().getId().toString();
        m.e(string, "event.creationData.id.toString()");
        String value = this.event.getType().getValue();
        String str = this.userID;
        String string2 = this.event.getData().getSessionIdentifier().toString();
        m.e(string2, "event.data.sessionIdentifier.toString()");
        String offeringIdentifier = this.event.getData().getPresentedOfferingContext().getOfferingIdentifier();
        String paywallIdentifier = this.event.getData().getPaywallIdentifier();
        int paywallRevision = this.event.getData().getPaywallRevision();
        long time = this.event.getCreationData().getDate().getTime();
        String displayMode = this.event.getData().getDisplayMode();
        boolean darkMode = this.event.getData().getDarkMode();
        String localeIdentifier = this.event.getData().getLocaleIdentifier();
        String workflowId = this.event.getData().getWorkflowId();
        BackendEvent.PresentedOfferingContextData presentedOfferingContextDataFromContext = BackendEvent.PresentedOfferingContextData.Companion.fromContext(this.event.getData().getPresentedOfferingContext(), this.event.getData().getPaywallIdentifier(), this.event.getData().getWorkflowId(), this.event.getData().getTraceId());
        ExitOfferType exitOfferType = this.event.getData().getExitOfferType();
        return new BackendEvent.Paywalls(string, 1, value, str, string2, offeringIdentifier, paywallIdentifier, paywallRevision, time, displayMode, darkMode, localeIdentifier, workflowId, presentedOfferingContextDataFromContext, exitOfferType != null ? exitOfferType.getValue() : null, this.event.getData().getExitOfferingIdentifier(), this.event.getData().getPackageIdentifier(), this.event.getData().getProductIdentifier(), this.event.getData().getErrorCode(), this.event.getData().getErrorMessage(), backendComponentFields.getComponentType(), backendComponentFields.getComponentName(), backendComponentFields.getComponentValue(), backendComponentFields.getComponentUrl(), backendComponentFields.getOriginIndex(), backendComponentFields.getDestinationIndex(), backendComponentFields.getOriginContextName(), backendComponentFields.getDestinationContextName(), backendComponentFields.getDefaultIndex(), backendComponentFields.getOriginPackageIdentifier(), backendComponentFields.getDestinationPackageIdentifier(), backendComponentFields.getDefaultPackageIdentifier(), backendComponentFields.getOriginProductIdentifier(), backendComponentFields.getDestinationProductIdentifier(), backendComponentFields.getDefaultProductIdentifier(), backendComponentFields.getCurrentPackageIdentifier(), backendComponentFields.getResultingPackageIdentifier(), backendComponentFields.getCurrentProductIdentifier(), backendComponentFields.getResultingProductIdentifier());
    }

    @Override // com.revenuecat.purchases.utils.Event
    public String toString() {
        C2448a c2448a = json;
        c2448a.getClass();
        return c2448a.d(Companion.serializer(), this);
    }

    public PaywallStoredEvent(PaywallEvent event, String userID) {
        m.f(event, "event");
        m.f(userID, "userID");
        this.event = event;
        this.userID = userID;
    }
}
