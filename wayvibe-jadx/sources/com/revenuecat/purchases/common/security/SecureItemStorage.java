package com.revenuecat.purchases.common.security;

import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public interface SecureItemStorage {

    public static final class DefaultImpls {
        @Deprecated
        public static boolean containsItem(SecureItemStorage secureItemStorage, String identifier) {
            m.f(identifier, "identifier");
            return SecureItemStorage.super.containsItem(identifier);
        }

        @Deprecated
        public static void modifyItem(SecureItemStorage secureItemStorage, String identifier, byte[] bArr, SecureItemAttributes attributes) {
            m.f(identifier, "identifier");
            m.f(attributes, "attributes");
            SecureItemStorage.super.modifyItem(identifier, bArr, attributes);
        }
    }

    static /* synthetic */ void modifyItem$default(SecureItemStorage secureItemStorage, String str, byte[] bArr, SecureItemAttributes secureItemAttributes, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: modifyItem");
        }
        if ((i10 & 4) != 0) {
            secureItemAttributes = new SecureItemAttributes(false, 1, null);
        }
        secureItemStorage.modifyItem(str, bArr, secureItemAttributes);
    }

    static /* synthetic */ void saveItem$default(SecureItemStorage secureItemStorage, String str, byte[] bArr, SecureItemAttributes secureItemAttributes, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: saveItem");
        }
        if ((i10 & 4) != 0) {
            secureItemAttributes = new SecureItemAttributes(false, 1, null);
        }
        secureItemStorage.saveItem(str, bArr, secureItemAttributes);
    }

    List<String> allItemIdentifiers();

    default boolean containsItem(String identifier) {
        m.f(identifier, "identifier");
        return allItemIdentifiers().contains(identifier);
    }

    void deleteItem(String str);

    default void modifyItem(String identifier, byte[] bArr, SecureItemAttributes attributes) {
        m.f(identifier, "identifier");
        m.f(attributes, "attributes");
        if (bArr != null) {
            saveItem(identifier, bArr, attributes);
        } else {
            deleteItem(identifier);
        }
    }

    byte[] readItem(String str);

    void saveItem(String str, byte[] bArr, SecureItemAttributes secureItemAttributes);
}
