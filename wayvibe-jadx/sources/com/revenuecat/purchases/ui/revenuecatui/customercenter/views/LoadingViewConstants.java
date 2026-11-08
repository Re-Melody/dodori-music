package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import J.f;
import J.g;
import com.revenuecat.purchases.ui.revenuecatui.components.SensibleDefaults;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterConstants;

/* JADX INFO: loaded from: classes2.dex */
final class LoadingViewConstants {
    public static final float PLACEHOLDER_ALPHA = 0.15f;
    public static final LoadingViewConstants INSTANCE = new LoadingViewConstants();
    private static final f PLACEHOLDER_SHAPE = g.b(4);
    private static final float TITLE_WIDTH = SensibleDefaults.X_OFFSET;
    private static final float TITLE_HEIGHT = 20;
    private static final float SUBTITLE_WIDTH = 220;
    private static final float BODY_HEIGHT = 16;
    private static final float STORE_WIDTH = 100;
    private static final float BUTTON_HEIGHT = 48;
    private static final f BUTTON_SHAPE = g.b(24);
    private static final float BADGE_WIDTH = 60;
    private static final float BADGE_HEIGHT = 22;
    private static final f BADGE_SHAPE = g.b(CustomerCenterConstants.Card.INSTANCE.m615getBADGE_CORNER_SIZED9Ej5fM());

    private LoadingViewConstants() {
    }

    /* JADX INFO: renamed from: getBADGE_HEIGHT-D9Ej5fM, reason: not valid java name */
    public final float m703getBADGE_HEIGHTD9Ej5fM() {
        return BADGE_HEIGHT;
    }

    public final f getBADGE_SHAPE() {
        return BADGE_SHAPE;
    }

    /* JADX INFO: renamed from: getBADGE_WIDTH-D9Ej5fM, reason: not valid java name */
    public final float m704getBADGE_WIDTHD9Ej5fM() {
        return BADGE_WIDTH;
    }

    /* JADX INFO: renamed from: getBODY_HEIGHT-D9Ej5fM, reason: not valid java name */
    public final float m705getBODY_HEIGHTD9Ej5fM() {
        return BODY_HEIGHT;
    }

    /* JADX INFO: renamed from: getBUTTON_HEIGHT-D9Ej5fM, reason: not valid java name */
    public final float m706getBUTTON_HEIGHTD9Ej5fM() {
        return BUTTON_HEIGHT;
    }

    public final f getBUTTON_SHAPE() {
        return BUTTON_SHAPE;
    }

    public final f getPLACEHOLDER_SHAPE() {
        return PLACEHOLDER_SHAPE;
    }

    /* JADX INFO: renamed from: getSTORE_WIDTH-D9Ej5fM, reason: not valid java name */
    public final float m707getSTORE_WIDTHD9Ej5fM() {
        return STORE_WIDTH;
    }

    /* JADX INFO: renamed from: getSUBTITLE_WIDTH-D9Ej5fM, reason: not valid java name */
    public final float m708getSUBTITLE_WIDTHD9Ej5fM() {
        return SUBTITLE_WIDTH;
    }

    /* JADX INFO: renamed from: getTITLE_HEIGHT-D9Ej5fM, reason: not valid java name */
    public final float m709getTITLE_HEIGHTD9Ej5fM() {
        return TITLE_HEIGHT;
    }

    /* JADX INFO: renamed from: getTITLE_WIDTH-D9Ej5fM, reason: not valid java name */
    public final float m710getTITLE_WIDTHD9Ej5fM() {
        return TITLE_WIDTH;
    }
}
