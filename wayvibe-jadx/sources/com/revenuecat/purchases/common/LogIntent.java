package com.revenuecat.purchases.common;

import D7.W;
import com.revenuecat.purchases.strings.Emojis;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public enum LogIntent {
    DEBUG(W.T(Emojis.INFO)),
    GOOGLE_ERROR(W.U(Emojis.ROBOT, Emojis.DOUBLE_EXCLAMATION)),
    GOOGLE_WARNING(W.U(Emojis.ROBOT, Emojis.DOUBLE_EXCLAMATION)),
    INFO(W.T(Emojis.INFO)),
    PURCHASE(W.T(Emojis.MONEY_BAG)),
    RC_ERROR(W.U(Emojis.SAD_CAT_EYES, Emojis.DOUBLE_EXCLAMATION)),
    RC_PURCHASE_SUCCESS(W.U(Emojis.HEART_CAT_EYES, Emojis.MONEY_BAG)),
    RC_SUCCESS(W.T(Emojis.HEART_CAT_EYES)),
    USER(W.T(Emojis.PERSON)),
    WARNING(W.T(Emojis.WARNING)),
    AMAZON_WARNING(W.U(Emojis.BOX, Emojis.DOUBLE_EXCLAMATION)),
    AMAZON_ERROR(W.U(Emojis.BOX, Emojis.DOUBLE_EXCLAMATION)),
    GALAXY_WARNING(W.U(Emojis.STARS, Emojis.DOUBLE_EXCLAMATION)),
    GALAXY_ERROR(W.U(Emojis.STARS, Emojis.DOUBLE_EXCLAMATION));

    private final List<String> emojiList;

    LogIntent(List list) {
        this.emojiList = list;
    }

    public final List<String> getEmojiList() {
        return this.emojiList;
    }
}
