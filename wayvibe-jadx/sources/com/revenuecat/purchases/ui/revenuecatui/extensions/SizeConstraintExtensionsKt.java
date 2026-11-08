package com.revenuecat.purchases.ui.revenuecatui.extensions;

import B8.V;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import kotlin.jvm.internal.m;
import p028c1.e;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class SizeConstraintExtensionsKt {
    public static final e dpOrNull(SizeConstraint sizeConstraint) {
        m.f(sizeConstraint, "<this>");
        if (sizeConstraint instanceof SizeConstraint.Fixed) {
            return new e(((SizeConstraint.Fixed) sizeConstraint).m302getValuepVg5ArA());
        }
        if ((sizeConstraint instanceof SizeConstraint.Fill) || (sizeConstraint instanceof SizeConstraint.Fit)) {
            return null;
        }
        throw new V();
    }
}
