package com.revenuecat.purchases.ui.revenuecatui.checkpoints;

import kotlin.jvm.internal.m;
import p097i9.k;

/* JADX INFO: loaded from: classes2.dex */
public final class CheckpointIdentifierValidator {
    public static final int $stable = 0;
    public static final CheckpointIdentifierValidator INSTANCE = new CheckpointIdentifierValidator();
    private static final int MAX_IDENTIFIER_LENGTH = 255;

    private CheckpointIdentifierValidator() {
    }

    private final boolean isAllowedCharacter(char c3) {
        if (isAsciiLetter(c3)) {
            return true;
        }
        return ('0' <= c3 && c3 < ':') || c3 == '_' || c3 == '-';
    }

    private final boolean isAsciiLetter(char c3) {
        if ('a' > c3 || c3 >= '{') {
            return 'A' <= c3 && c3 < '[';
        }
        return true;
    }

    public final String invalidIdentifierLogMessage(String identifier) {
        m.f(identifier, "identifier");
        return "Dropping invalid checkpoint identifier '" + identifier + "'. Identifiers must start with a letter, contain only ASCII letters, numbers, underscores, and hyphens, and be no more than 255 characters.";
    }

    public final boolean isValid(String identifier) {
        m.f(identifier, "identifier");
        if (identifier.length() <= 255) {
            Character chValueOf = identifier.length() == 0 ? null : Character.valueOf(identifier.charAt(0));
            if (chValueOf != null && isAsciiLetter(chValueOf.charValue())) {
                String strO0 = k.o0(1, identifier);
                for (int i10 = 0; i10 < strO0.length(); i10++) {
                    if (!INSTANCE.isAllowedCharacter(strO0.charAt(i10))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
