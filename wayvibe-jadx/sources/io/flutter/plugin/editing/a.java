package io.flutter.plugin.editing;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ AccessibilityNodeInfo.CollectionInfo b(int i10) {
        return new AccessibilityNodeInfo.CollectionInfo(i10, 1, false);
    }

    public static /* synthetic */ AccessibilityNodeInfo.CollectionItemInfo c(int i10, boolean z10) {
        return new AccessibilityNodeInfo.CollectionItemInfo(i10, 1, 0, 1, z10);
    }

    public static /* synthetic */ AccessibilityNodeInfo.CollectionInfo g(int i10) {
        return new AccessibilityNodeInfo.CollectionInfo(1, i10, false);
    }

    public static /* synthetic */ AccessibilityNodeInfo.CollectionItemInfo h(int i10, boolean z10) {
        return new AccessibilityNodeInfo.CollectionItemInfo(0, 1, i10, 1, z10);
    }
}
