package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.ui.revenuecatui.helpers.PaywallLegacyComponentInteraction;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import p134m1.b;
import p219u9.a;
import p219u9.e;
import p240w9.g;
import p240w9.i;
import p251x9.c;
import p251x9.d;
import p270z9.AbstractC2449b;
import p270z9.C;
import p270z9.k;
import p270z9.l;
import p270z9.y;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public final class PaywallComponentSerializer implements a {
    private final g descriptor = i.c("PaywallComponent", new g[0], PaywallComponentSerializer$descriptor$1.INSTANCE);

    private final PaywallComponent decodeFallback(p270z9.i iVar, y yVar, String str) {
        k kVar = (k) yVar.get("fallback");
        if (kVar != null) {
            y yVar2 = kVar instanceof y ? (y) kVar : null;
            if (yVar2 != null) {
                AbstractC2449b abstractC2449bD = iVar.d();
                abstractC2449bD.getClass();
                PaywallComponent paywallComponent = (PaywallComponent) abstractC2449bD.a(PaywallComponent.Companion.serializer(), yVar2);
                if (paywallComponent != null) {
                    return paywallComponent;
                }
            }
        }
        throw new e(str);
    }

    private final PaywallComponent decodeWebViewOrFallback(p270z9.i iVar, y yVar) {
        Integer numG;
        k kVar = (k) yVar.get("protocol_version");
        C c3 = kVar instanceof C ? (C) kVar : null;
        if (c3 != null) {
            C c9 = c3.c() ? null : c3;
            if (c9 != null && (numG = l.g(c9)) != null) {
                int iIntValue = numG.intValue();
                if (iIntValue != 1) {
                    return decodeFallback(iVar, yVar, b.j(iIntValue, "No fallback provided for web_view with unsupported protocol_version: "));
                }
                AbstractC2449b abstractC2449bD = iVar.d();
                abstractC2449bD.getClass();
                return (PaywallComponent) abstractC2449bD.a(WebViewComponent.Companion.serializer(), yVar);
            }
        }
        throw new e("web_view protocol_version is missing or malformed: " + kVar);
    }

    @Override // p219u9.a
    public g getDescriptor() {
        return this.descriptor;
    }

    @Override // p219u9.a
    public void serialize(d encoder, PaywallComponent value) {
        m.f(encoder, "encoder");
        m.f(value, "value");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p219u9.a
    public PaywallComponent deserialize(c decoder) {
        m.f(decoder, "decoder");
        p270z9.i iVar = decoder instanceof p270z9.i ? (p270z9.i) decoder : null;
        if (iVar == null) {
            throw new e("Can only deserialize PaywallComponent from JSON, got: " + z.a(decoder.getClass()));
        }
        y yVarI = l.i(iVar.m());
        k kVar = (k) yVarI.get("type");
        String strA = kVar != null ? l.j(kVar).a() : null;
        if (strA != null) {
            switch (strA.hashCode()) {
                case -2076650431:
                    if (strA.equals("timeline")) {
                        AbstractC2449b abstractC2449bD = iVar.d();
                        abstractC2449bD.getClass();
                        return (PaywallComponent) abstractC2449bD.a(TimelineComponent.Companion.serializer(), yVarI);
                    }
                    break;
                case -1896978765:
                    if (strA.equals("tab_control")) {
                        AbstractC2449b abstractC2449bD2 = iVar.d();
                        abstractC2449bD2.getClass();
                        return (PaywallComponent) abstractC2449bD2.a(TabControlComponent.INSTANCE.serializer(), yVarI);
                    }
                    break;
                case -1822017359:
                    if (strA.equals("sticky_footer")) {
                        AbstractC2449b abstractC2449bD3 = iVar.d();
                        abstractC2449bD3.getClass();
                        return (PaywallComponent) abstractC2449bD3.a(StickyFooterComponent.Companion.serializer(), yVarI);
                    }
                    break;
                case -1391809488:
                    if (strA.equals(PaywallLegacyComponentInteraction.PURCHASE_BUTTON_NAME)) {
                        AbstractC2449b abstractC2449bD4 = iVar.d();
                        abstractC2449bD4.getClass();
                        return (PaywallComponent) abstractC2449bD4.a(PurchaseButtonComponent.Companion.serializer(), yVarI);
                    }
                    break;
                case -1377687758:
                    if (strA.equals("button")) {
                        AbstractC2449b abstractC2449bD5 = iVar.d();
                        abstractC2449bD5.getClass();
                        return (PaywallComponent) abstractC2449bD5.a(ButtonComponent.Companion.serializer(), yVarI);
                    }
                    break;
                case -1221270899:
                    if (strA.equals("header")) {
                        AbstractC2449b abstractC2449bD6 = iVar.d();
                        abstractC2449bD6.getClass();
                        return (PaywallComponent) abstractC2449bD6.a(HeaderComponent.Companion.serializer(), yVarI);
                    }
                    break;
                case -807062458:
                    if (strA.equals("package")) {
                        AbstractC2449b abstractC2449bD7 = iVar.d();
                        abstractC2449bD7.getClass();
                        return (PaywallComponent) abstractC2449bD7.a(PackageComponent.Companion.serializer(), yVarI);
                    }
                    break;
                case -718398288:
                    if (strA.equals("web_view")) {
                        return decodeWebViewOrFallback(iVar, yVarI);
                    }
                    break;
                case -364374390:
                    if (strA.equals("fallback_header")) {
                        return FallbackHeaderComponent.INSTANCE;
                    }
                    break;
                case 2908512:
                    if (strA.equals("carousel")) {
                        AbstractC2449b abstractC2449bD8 = iVar.d();
                        abstractC2449bD8.getClass();
                        return (PaywallComponent) abstractC2449bD8.a(CarouselComponent.Companion.serializer(), yVarI);
                    }
                    break;
                case 3226745:
                    if (strA.equals("icon")) {
                        AbstractC2449b abstractC2449bD9 = iVar.d();
                        abstractC2449bD9.getClass();
                        return (PaywallComponent) abstractC2449bD9.a(IconComponent.Companion.serializer(), yVarI);
                    }
                    break;
                case 3552126:
                    if (strA.equals("tabs")) {
                        AbstractC2449b abstractC2449bD10 = iVar.d();
                        abstractC2449bD10.getClass();
                        return (PaywallComponent) abstractC2449bD10.a(TabsComponent.Companion.serializer(), yVarI);
                    }
                    break;
                case 3556653:
                    if (strA.equals("text")) {
                        AbstractC2449b abstractC2449bD11 = iVar.d();
                        abstractC2449bD11.getClass();
                        return (PaywallComponent) abstractC2449bD11.a(TextComponent.Companion.serializer(), yVarI);
                    }
                    break;
                case 100313435:
                    if (strA.equals("image")) {
                        AbstractC2449b abstractC2449bD12 = iVar.d();
                        abstractC2449bD12.getClass();
                        return (PaywallComponent) abstractC2449bD12.a(ImageComponent.Companion.serializer(), yVarI);
                    }
                    break;
                case 109757064:
                    if (strA.equals("stack")) {
                        AbstractC2449b abstractC2449bD13 = iVar.d();
                        abstractC2449bD13.getClass();
                        return (PaywallComponent) abstractC2449bD13.a(StackComponent.Companion.serializer(), yVarI);
                    }
                    break;
                case 112202875:
                    if (strA.equals("video")) {
                        AbstractC2449b abstractC2449bD14 = iVar.d();
                        abstractC2449bD14.getClass();
                        return (PaywallComponent) abstractC2449bD14.a(VideoComponent.Companion.serializer(), yVarI);
                    }
                    break;
                case 318201406:
                    if (strA.equals("tab_control_button")) {
                        AbstractC2449b abstractC2449bD15 = iVar.d();
                        abstractC2449bD15.getClass();
                        return (PaywallComponent) abstractC2449bD15.a(TabControlButtonComponent.Companion.serializer(), yVarI);
                    }
                    break;
                case 827585120:
                    if (strA.equals("tab_control_toggle")) {
                        AbstractC2449b abstractC2449bD16 = iVar.d();
                        abstractC2449bD16.getClass();
                        return (PaywallComponent) abstractC2449bD16.a(TabControlToggleComponent.Companion.serializer(), yVarI);
                    }
                    break;
                case 1352226353:
                    if (strA.equals("countdown")) {
                        AbstractC2449b abstractC2449bD17 = iVar.d();
                        abstractC2449bD17.getClass();
                        return (PaywallComponent) abstractC2449bD17.a(CountdownComponent.Companion.serializer(), yVarI);
                    }
                    break;
            }
        }
        return decodeFallback(iVar, yVarI, b.k("No fallback provided for unknown type: ", strA));
    }
}
