package io.flutter.view;

import Ca.C0168a;
import android.R;
import android.content.ContentResolver;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.revenuecat.purchases.common.networking.ETagPayloadStore;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p140m7.C2061m;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends AccessibilityNodeProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f21116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p150n8.a f21117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccessibilityManager f21118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AccessibilityViewEmbedder f21119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final io.flutter.plugin.platform.k f21120e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ContentResolver f21121f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f21122g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f21123h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public l f21124i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Integer f21125j;
    public Integer k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f21126l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f21127m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public l f21128n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public l f21129o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public l f21130p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f21131q;
    public int r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Y7.e f21132s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f21133t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f21134u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final d f21135v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final f f21136w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e f21137x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f21114y = ((i.SCROLL_RIGHT.value | i.SCROLL_LEFT.value) | i.SCROLL_UP.value) | i.SCROLL_DOWN.value;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f21115z = ((((((((((k.HAS_CHECKED_STATE.value | k.IS_CHECKED.value) | k.IS_SELECTED.value) | k.IS_TEXT_FIELD.value) | k.IS_FOCUSED.value) | k.HAS_ENABLED_STATE.value) | k.IS_ENABLED.value) | k.IS_IN_MUTUALLY_EXCLUSIVE_GROUP.value) | k.HAS_TOGGLED_STATE.value) | k.IS_TOGGLED.value) | k.IS_FOCUSABLE.value) | k.IS_SLIDER.value;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int f21113A = (i.DID_GAIN_ACCESSIBILITY_FOCUS.value & i.DID_LOSE_ACCESSIBILITY_FOCUS.value) & i.SHOW_ON_SCREEN.value;

    public m(View view, p150n8.a aVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, io.flutter.plugin.platform.k kVar) {
        AccessibilityViewEmbedder accessibilityViewEmbedder = new AccessibilityViewEmbedder(view, ETagPayloadStore.CHUNK_CHARS);
        this.f21122g = new HashMap();
        this.f21123h = new HashMap();
        this.f21126l = 0;
        this.f21131q = new ArrayList();
        this.r = 0;
        this.f21133t = false;
        this.f21134u = false;
        c cVar = new c(this);
        d dVar = new d(this);
        this.f21135v = dVar;
        e eVar = new e(this, new Handler());
        this.f21137x = eVar;
        this.f21116a = view;
        this.f21117b = aVar;
        this.f21118c = accessibilityManager;
        this.f21121f = contentResolver;
        this.f21119d = accessibilityViewEmbedder;
        this.f21120e = kVar;
        aVar.f22981c = cVar;
        ((FlutterJNI) aVar.f22980b).setAccessibilityDelegate(cVar);
        dVar.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(dVar);
        f fVar = new f(this, accessibilityManager);
        this.f21136w = fVar;
        fVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(fVar);
        this.f21126l |= h.NO_ANNOUNCE.value;
        eVar.onChange(false, null);
        contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, eVar);
        if (Build.VERSION.SDK_INT >= 31 && view != null && view.getResources() != null) {
            int i10 = view.getResources().getConfiguration().fontWeightAdjustment;
            if (i10 == Integer.MAX_VALUE || i10 < 300) {
                this.f21126l &= ~h.BOLD_TEXT.value;
            } else {
                this.f21126l |= h.BOLD_TEXT.value;
            }
            ((FlutterJNI) aVar.f22980b).setAccessibilityFeatures(this.f21126l);
        }
        kVar.b(this);
    }

    public static String d(ByteBuffer byteBuffer, String[] strArr) {
        int i10 = byteBuffer.getInt();
        if (i10 == -1) {
            return null;
        }
        return strArr[i10];
    }

    public final boolean a(View view, View view2, AccessibilityEvent accessibilityEvent) {
        Integer recordFlutterId;
        AccessibilityViewEmbedder accessibilityViewEmbedder = this.f21119d;
        if (!accessibilityViewEmbedder.requestSendAccessibilityEvent(view, view2, accessibilityEvent) || (recordFlutterId = accessibilityViewEmbedder.getRecordFlutterId(view, accessibilityEvent)) == null) {
            return false;
        }
        int eventType = accessibilityEvent.getEventType();
        if (eventType == 8) {
            this.k = recordFlutterId;
            this.f21128n = null;
            return true;
        }
        if (eventType == 128) {
            this.f21130p = null;
            return true;
        }
        if (eventType == 32768) {
            this.f21125j = recordFlutterId;
            this.f21124i = null;
            return true;
        }
        if (eventType != 65536) {
            return true;
        }
        this.k = null;
        this.f21125j = null;
        return true;
    }

    public final j b(int i10) {
        HashMap map = this.f21123h;
        j jVar = (j) map.get(Integer.valueOf(i10));
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j();
        jVar2.f21057c = -1;
        jVar2.f21056b = i10;
        jVar2.f21055a = 267386881 + i10;
        map.put(Integer.valueOf(i10), jVar2);
        return jVar2;
    }

    public final l c(int i10) {
        HashMap map = this.f21122g;
        l lVar = (l) map.get(Integer.valueOf(i10));
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this);
        lVar2.f21088b = i10;
        map.put(Integer.valueOf(i10), lVar2);
        return lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v122 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v83 */
    /* JADX WARN: Type inference failed for: r2v88 */
    /* JADX WARN: Type inference failed for: r5v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.view.accessibility.AccessibilityNodeInfo] */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
        int i11;
        int i12;
        ?? G10;
        int i13;
        String str;
        int i14;
        int i15;
        int i16;
        j(true);
        AccessibilityViewEmbedder accessibilityViewEmbedder = this.f21119d;
        if (i10 >= 65536) {
            return accessibilityViewEmbedder.createAccessibilityNodeInfo(i10);
        }
        HashMap map = this.f21122g;
        View view = this.f21116a;
        if (i10 == -1) {
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(view);
            view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
            if (map.containsKey(0)) {
                accessibilityNodeInfoObtain.addChild(view, 0);
            }
            accessibilityNodeInfoObtain.setImportantForAccessibility(false);
            return accessibilityNodeInfoObtain;
        }
        l lVar = (l) map.get(Integer.valueOf(i10));
        if (lVar != null) {
            int i17 = lVar.f21097i;
            io.flutter.plugin.platform.k kVar = this.f21120e;
            if (i17 == -1 || !kVar.o(i17)) {
                ?? Obtain = AccessibilityNodeInfo.obtain(view, i10);
                k kVar2 = k.SCOPES_ROUTE;
                Obtain.setImportantForAccessibility((lVar.g(kVar2) || (l.b(lVar) == null && ((~f21113A) & lVar.f21092d) == 0)) ? false : true);
                Obtain.setViewIdResourceName("");
                String str2 = lVar.f21102o;
                if (str2 != null) {
                    Obtain.setViewIdResourceName(str2);
                }
                Obtain.setPackageName(view.getContext().getPackageName());
                Obtain.setClassName("android.view.View");
                Obtain.setSource(view, i10);
                Obtain.setFocusable(lVar.i());
                l lVar2 = this.f21128n;
                if (lVar2 != null) {
                    Obtain.setFocused(lVar2.f21088b == i10);
                }
                l lVar3 = this.f21124i;
                if (lVar3 != null) {
                    Obtain.setAccessibilityFocused(lVar3.f21088b == i10);
                }
                k kVar3 = k.IS_TEXT_FIELD;
                if (lVar.g(kVar3)) {
                    Obtain.setPassword(lVar.g(k.IS_OBSCURED));
                    k kVar4 = k.IS_READ_ONLY;
                    if (!lVar.g(kVar4)) {
                        Obtain.setClassName("android.widget.EditText");
                    }
                    Obtain.setEditable(!lVar.g(kVar4));
                    int i18 = lVar.f21095g;
                    if (i18 != -1 && (i16 = lVar.f21096h) != -1) {
                        Obtain.setTextSelection(i18, i16);
                    }
                    l lVar4 = this.f21124i;
                    if (lVar4 != null && lVar4.f21088b == i10) {
                        Obtain.setLiveRegion(1);
                    }
                    if (l.a(lVar, i.MOVE_CURSOR_FORWARD_BY_CHARACTER)) {
                        Obtain.addAction(256);
                        i11 = 0;
                        i15 = 1;
                    } else {
                        i15 = 0;
                        i11 = 0;
                    }
                    i12 = 2;
                    if (l.a(lVar, i.MOVE_CURSOR_BACKWARD_BY_CHARACTER)) {
                        Obtain.addAction(512);
                        i15 = 1;
                    }
                    if (l.a(lVar, i.MOVE_CURSOR_FORWARD_BY_WORD)) {
                        Obtain.addAction(256);
                        i15 |= 2;
                    }
                    if (l.a(lVar, i.MOVE_CURSOR_BACKWARD_BY_WORD)) {
                        Obtain.addAction(512);
                        i15 |= 2;
                    }
                    Obtain.setMovementGranularities(i15);
                    if (lVar.f21093e >= 0) {
                        String str3 = lVar.r;
                        Obtain.setMaxTextLength(((str3 == null ? i11 : str3.length()) - lVar.f21094f) + lVar.f21093e);
                    }
                } else {
                    i11 = 0;
                    i12 = 2;
                }
                if (l.a(lVar, i.SET_SELECTION)) {
                    Obtain.addAction(131072);
                }
                if (l.a(lVar, i.COPY)) {
                    Obtain.addAction(16384);
                }
                if (l.a(lVar, i.CUT)) {
                    Obtain.addAction(ETagPayloadStore.CHUNK_CHARS);
                }
                if (l.a(lVar, i.PASTE)) {
                    Obtain.addAction(32768);
                }
                if (l.a(lVar, i.SET_TEXT)) {
                    Obtain.addAction(2097152);
                }
                if (lVar.g(k.IS_BUTTON)) {
                    G10 = 1;
                } else {
                    String str4 = lVar.f21060A;
                    G10 = (str4 == null || str4.isEmpty()) ? lVar.g(k.IS_LINK) : i11;
                }
                if (G10 != 0) {
                    Obtain.setClassName("android.widget.Button");
                }
                if (lVar.g(k.IS_IMAGE)) {
                    Obtain.setClassName("android.widget.ImageView");
                }
                if (l.a(lVar, i.DISMISS)) {
                    Obtain.setDismissable(true);
                    Obtain.addAction(1048576);
                }
                l lVar5 = lVar.f21078S;
                if (lVar5 != null) {
                    Obtain.setParent(view, lVar5.f21088b);
                } else {
                    Obtain.setParent(view);
                }
                int i19 = lVar.f21063D;
                if (i19 != -1) {
                    Obtain.setTraversalAfter(view, i19);
                }
                Rect rect = lVar.f21091c0;
                l lVar6 = lVar.f21078S;
                if (lVar6 != null) {
                    Rect rect2 = lVar6.f21091c0;
                    Rect rect3 = new Rect(rect);
                    rect3.offset(-rect2.left, -rect2.top);
                    Obtain.setBoundsInParent(rect3);
                } else {
                    Obtain.setBoundsInParent(rect);
                }
                Rect rect4 = new Rect(rect);
                int[] iArr = new int[i12];
                view.getLocationOnScreen(iArr);
                rect4.offset(iArr[i11], iArr[1]);
                Obtain.setBoundsInScreen(rect4);
                Obtain.setVisibleToUser(true);
                Obtain.setEnabled((!lVar.g(k.HAS_ENABLED_STATE) || lVar.g(k.IS_ENABLED)) ? 1 : i11);
                if (l.a(lVar, i.TAP)) {
                    if (lVar.f21082W != null) {
                        Obtain.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, lVar.f21082W.f21059e));
                        Obtain.setClickable(true);
                    } else {
                        Obtain.addAction(16);
                        Obtain.setClickable(true);
                    }
                } else if (lVar.g(k.IS_SLIDER)) {
                    Obtain.addAction(16);
                    Obtain.setClickable(true);
                }
                if (l.a(lVar, i.LONG_PRESS)) {
                    if (lVar.f21083X != null) {
                        Obtain.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, lVar.f21083X.f21059e));
                        Obtain.setLongClickable(true);
                    } else {
                        Obtain.addAction(32);
                        Obtain.setLongClickable(true);
                    }
                }
                i iVar = i.SCROLL_LEFT;
                if (l.a(lVar, iVar) || l.a(lVar, i.SCROLL_UP) || l.a(lVar, i.SCROLL_RIGHT) || l.a(lVar, i.SCROLL_DOWN)) {
                    Obtain.setScrollable(true);
                    if (lVar.g(k.HAS_IMPLICIT_SCROLLING)) {
                        if (l.a(lVar, iVar) || l.a(lVar, i.SCROLL_RIGHT)) {
                            Obtain.setClassName("android.widget.HorizontalScrollView");
                        } else {
                            Obtain.setClassName("android.widget.ScrollView");
                        }
                    }
                }
                if (k(lVar)) {
                    if (l.a(lVar, iVar) || l.a(lVar, i.SCROLL_RIGHT)) {
                        if (Build.VERSION.SDK_INT < 33) {
                            Obtain.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, lVar.f21098j, false));
                        } else {
                            Obtain.setCollectionInfo(io.flutter.plugin.editing.a.g(lVar.f21098j));
                        }
                    } else if (Build.VERSION.SDK_INT < 33) {
                        Obtain.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(lVar.f21098j, 1, i11));
                    } else {
                        Obtain.setCollectionInfo(io.flutter.plugin.editing.a.b(lVar.f21098j));
                    }
                }
                l lVar7 = lVar.f21078S;
                if (lVar7 != null && k(lVar7) && lVar.f21078S.g(k.HAS_IMPLICIT_SCROLLING)) {
                    l lVar8 = lVar.f21078S;
                    ArrayList arrayList = lVar8.f21079T;
                    boolean z10 = (l.a(lVar8, iVar) || l.a(lVar8, i.SCROLL_RIGHT)) ? false : true;
                    int iIndexOf = arrayList.indexOf(lVar);
                    if (z10) {
                        if (Build.VERSION.SDK_INT < 33) {
                            Obtain.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(iIndexOf, 1, 0, 1, lVar.g(k.IS_HEADER)));
                        } else {
                            Obtain.setCollectionItemInfo(io.flutter.plugin.editing.a.c(iIndexOf, lVar.g(k.IS_HEADER)));
                        }
                    } else if (Build.VERSION.SDK_INT < 33) {
                        Obtain.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, iIndexOf, 1, lVar.g(k.IS_HEADER)));
                    } else {
                        Obtain.setCollectionItemInfo(io.flutter.plugin.editing.a.h(iIndexOf, lVar.g(k.IS_HEADER)));
                    }
                }
                if (l.a(lVar, iVar) || l.a(lVar, i.SCROLL_UP)) {
                    Obtain.addAction(4096);
                }
                if (l.a(lVar, i.SCROLL_RIGHT) || l.a(lVar, i.SCROLL_DOWN)) {
                    Obtain.addAction(8192);
                }
                i iVar2 = i.INCREASE;
                if (l.a(lVar, iVar2) || l.a(lVar, i.DECREASE)) {
                    Obtain.setClassName("android.widget.SeekBar");
                    if (l.a(lVar, iVar2)) {
                        Obtain.addAction(4096);
                    }
                    if (l.a(lVar, i.DECREASE)) {
                        Obtain.addAction(8192);
                    }
                }
                if (lVar.g(k.IS_LIVE_REGION)) {
                    Obtain.setLiveRegion(1);
                }
                if (lVar.g(kVar3)) {
                    C0168a c0168a = new C0168a(28, false);
                    c0168a.f1501b = lVar.r;
                    c0168a.f1502c = lVar.f21105s;
                    c0168a.f1503d = lVar.d();
                    Obtain.setText(c0168a.s());
                    int i20 = 28;
                    if (Build.VERSION.SDK_INT >= 28) {
                        C0168a c0168a2 = new C0168a(i20, false);
                        c0168a2.f1501b = lVar.f21103p;
                        c0168a2.f1502c = lVar.f21104q;
                        c0168a2.f1504e = lVar.f21060A;
                        c0168a2.f1503d = lVar.d();
                        SpannableString spannableStringS = c0168a2.s();
                        C0168a c0168a3 = new C0168a(28, false);
                        c0168a3.f1501b = lVar.f21110x;
                        c0168a3.f1502c = lVar.f21111y;
                        c0168a3.f1503d = lVar.d();
                        int i21 = 2;
                        CharSequence[] charSequenceArr = {spannableStringS, c0168a3.s()};
                        int i22 = 0;
                        CharSequence charSequence = null;
                        while (i22 < i21) {
                            CharSequence charSequenceConcat = charSequenceArr[i22];
                            if (charSequenceConcat == null || charSequenceConcat.length() <= 0) {
                                i14 = 2;
                            } else {
                                if (charSequence == null || charSequence.length() == 0) {
                                    i14 = 2;
                                } else {
                                    i14 = 2;
                                    charSequenceConcat = TextUtils.concat(charSequence, ", ", charSequenceConcat);
                                }
                                charSequence = charSequenceConcat;
                            }
                            i22++;
                            i21 = i14;
                        }
                        i13 = 3;
                        Obtain.setHintText(charSequence);
                    } else {
                        i13 = 3;
                    }
                } else {
                    i13 = 3;
                    if (!lVar.g(kVar2)) {
                        CharSequence charSequenceB = l.b(lVar);
                        if (Build.VERSION.SDK_INT < 28 && lVar.f21112z != null) {
                            charSequenceB = ((Object) (charSequenceB != null ? charSequenceB : "")) + "\n" + lVar.f21112z;
                        }
                        if (charSequenceB != null) {
                            Obtain.setContentDescription(charSequenceB);
                        }
                    }
                }
                int i23 = Build.VERSION.SDK_INT;
                if (i23 >= 28 && (str = lVar.f21112z) != null) {
                    Obtain.setTooltipText(str);
                    if (l.b(lVar) == null) {
                        Obtain.setContentDescription(lVar.f21112z);
                    }
                }
                boolean zG = lVar.g(k.HAS_CHECKED_STATE);
                boolean zG2 = lVar.g(k.HAS_TOGGLED_STATE);
                Obtain.setCheckable(zG || zG2);
                if (zG) {
                    Obtain.setChecked(lVar.g(k.IS_CHECKED));
                    if (lVar.g(k.IS_IN_MUTUALLY_EXCLUSIVE_GROUP)) {
                        Obtain.setClassName("android.widget.RadioButton");
                    } else {
                        Obtain.setClassName("android.widget.CheckBox");
                    }
                } else if (zG2) {
                    Obtain.setChecked(lVar.g(k.IS_TOGGLED));
                    Obtain.setClassName("android.widget.Switch");
                }
                Obtain.setSelected(lVar.g(k.IS_SELECTED));
                if (i23 >= 36 && lVar.g(k.HAS_EXPANDED_STATE)) {
                    if (!lVar.g(k.IS_EXPANDED)) {
                        i13 = 1;
                    }
                    Obtain.setExpandedState(i13);
                    if (l.a(lVar, i.EXPAND)) {
                        Obtain.addAction(ETagPayloadStore.WRITE_BUFFER_BYTES);
                    }
                    if (l.a(lVar, i.COLLAPSE)) {
                        Obtain.addAction(524288);
                    }
                }
                if (i23 >= 28) {
                    Obtain.setHeading(lVar.f21062C > 0);
                }
                l lVar9 = this.f21124i;
                if (lVar9 == null || lVar9.f21088b != i10) {
                    Obtain.addAction(64);
                } else {
                    Obtain.addAction(ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD);
                }
                ArrayList<j> arrayList2 = lVar.f21081V;
                if (arrayList2 != null) {
                    for (j jVar : arrayList2) {
                        Obtain.addAction(new AccessibilityNodeInfo.AccessibilityAction(jVar.f21055a, jVar.f21058d));
                    }
                }
                for (l lVar10 : lVar.f21079T) {
                    if (!lVar10.g(k.IS_HIDDEN)) {
                        int i24 = lVar10.f21097i;
                        if (i24 != -1) {
                            View viewD = kVar.d(i24);
                            if (!kVar.o(lVar10.f21097i) && viewD != null) {
                                viewD.setImportantForAccessibility(0);
                                Obtain.addChild(viewD);
                            }
                        }
                        Obtain.addChild(view, lVar10.f21088b);
                    }
                }
                return Obtain;
            }
            View viewD2 = kVar.d(lVar.f21097i);
            if (viewD2 != null) {
                return accessibilityViewEmbedder.getRootNode(viewD2, lVar.f21088b, lVar.f21091c0);
            }
        }
        return null;
    }

    public final AccessibilityEvent e(int i10, int i11) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i11);
        View view = this.f21116a;
        accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
        accessibilityEventObtain.setSource(view, i10);
        return accessibilityEventObtain;
    }

    public final boolean f(MotionEvent motionEvent, boolean z10) {
        l lVarH;
        if (this.f21118c.isTouchExplorationEnabled()) {
            HashMap map = this.f21122g;
            if (!map.isEmpty()) {
                l lVarH2 = ((l) map.get(0)).h(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z10);
                if (lVarH2 == null || lVarH2.f21097i == -1) {
                    if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
                        float x10 = motionEvent.getX();
                        float y6 = motionEvent.getY();
                        if (!map.isEmpty() && (lVarH = ((l) map.get(0)).h(new float[]{x10, y6, 0.0f, 1.0f}, z10)) != this.f21130p) {
                            if (lVarH != null) {
                                h(lVarH.f21088b, ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD);
                            }
                            l lVar = this.f21130p;
                            if (lVar != null) {
                                h(lVar.f21088b, 256);
                            }
                            this.f21130p = lVarH;
                        }
                    } else {
                        if (motionEvent.getAction() != 10) {
                            motionEvent.toString();
                            return false;
                        }
                        l lVar2 = this.f21130p;
                        if (lVar2 != null) {
                            h(lVar2.f21088b, 256);
                            this.f21130p = null;
                        }
                    }
                    return true;
                }
                if (!z10) {
                    return this.f21119d.onAccessibilityHoverEvent(lVarH2.f21088b, motionEvent);
                }
            }
        }
        return false;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i10) {
        if (i10 == 1) {
            l lVar = this.f21128n;
            if (lVar != null) {
                return createAccessibilityNodeInfo(lVar.f21088b);
            }
            Integer num = this.k;
            if (num != null) {
                return createAccessibilityNodeInfo(num.intValue());
            }
        } else if (i10 != 2) {
            return null;
        }
        l lVar2 = this.f21124i;
        if (lVar2 != null) {
            return createAccessibilityNodeInfo(lVar2.f21088b);
        }
        Integer num2 = this.f21125j;
        if (num2 != null) {
            return createAccessibilityNodeInfo(num2.intValue());
        }
        return null;
    }

    public final boolean g(l lVar, int i10, Bundle bundle, boolean z10) {
        int i11;
        int i12 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z11 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i13 = lVar.f21095g;
        int i14 = lVar.f21096h;
        if (i14 >= 0 && i13 >= 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 4) {
                        if (i12 == 8 || i12 == 16) {
                            if (z10) {
                                lVar.f21096h = lVar.r.length();
                            } else {
                                lVar.f21096h = 0;
                            }
                        }
                    } else if (z10 && i14 < lVar.r.length()) {
                        Matcher matcher = Pattern.compile("(?!^)(\\n)").matcher(lVar.r.substring(lVar.f21096h));
                        if (matcher.find()) {
                            lVar.f21096h += matcher.start(1);
                        } else {
                            lVar.f21096h = lVar.r.length();
                        }
                    } else if (!z10 && lVar.f21096h > 0) {
                        Matcher matcher2 = Pattern.compile("(?s:.*)(\\n)").matcher(lVar.r.substring(0, lVar.f21096h));
                        if (matcher2.find()) {
                            lVar.f21096h = matcher2.start(1);
                        } else {
                            lVar.f21096h = 0;
                        }
                    }
                } else if (z10 && i14 < lVar.r.length()) {
                    Matcher matcher3 = Pattern.compile("\\p{L}(\\b)").matcher(lVar.r.substring(lVar.f21096h));
                    matcher3.find();
                    if (matcher3.find()) {
                        lVar.f21096h += matcher3.start(1);
                    } else {
                        lVar.f21096h = lVar.r.length();
                    }
                } else if (!z10 && lVar.f21096h > 0) {
                    Matcher matcher4 = Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(lVar.r.substring(0, lVar.f21096h));
                    if (matcher4.find()) {
                        lVar.f21096h = matcher4.start(1);
                    }
                }
            } else if (z10 && i14 < lVar.r.length()) {
                lVar.f21096h++;
            } else if (!z10 && (i11 = lVar.f21096h) > 0) {
                lVar.f21096h = i11 - 1;
            }
            if (!z11) {
                lVar.f21095g = lVar.f21096h;
            }
        }
        if (i13 != lVar.f21095g || i14 != lVar.f21096h) {
            String str = lVar.r;
            if (str == null) {
                str = "";
            }
            AccessibilityEvent accessibilityEventE = e(lVar.f21088b, 8192);
            accessibilityEventE.getText().add(str);
            accessibilityEventE.setFromIndex(lVar.f21095g);
            accessibilityEventE.setToIndex(lVar.f21096h);
            accessibilityEventE.setItemCount(str.length());
            i(accessibilityEventE);
        }
        p150n8.a aVar = this.f21117b;
        if (i12 == 1) {
            if (z10) {
                i iVar = i.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (l.a(lVar, iVar)) {
                    aVar.Z(i10, iVar, Boolean.valueOf(z11));
                    return true;
                }
            }
            if (!z10) {
                i iVar2 = i.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
                if (l.a(lVar, iVar2)) {
                    aVar.Z(i10, iVar2, Boolean.valueOf(z11));
                    return true;
                }
            }
        } else if (i12 == 2) {
            if (z10) {
                i iVar3 = i.MOVE_CURSOR_FORWARD_BY_WORD;
                if (l.a(lVar, iVar3)) {
                    aVar.Z(i10, iVar3, Boolean.valueOf(z11));
                    return true;
                }
            }
            if (!z10) {
                i iVar4 = i.MOVE_CURSOR_BACKWARD_BY_WORD;
                if (l.a(lVar, iVar4)) {
                    aVar.Z(i10, iVar4, Boolean.valueOf(z11));
                    return true;
                }
            }
        } else if (i12 == 4 || i12 == 8 || i12 == 16) {
            return true;
        }
        return false;
    }

    public final void h(int i10, int i11) {
        if (this.f21118c.isEnabled()) {
            i(e(i10, i11));
        }
    }

    public final void i(AccessibilityEvent accessibilityEvent) {
        if (this.f21118c.isEnabled()) {
            View view = this.f21116a;
            view.getParent().requestSendAccessibilityEvent(view, accessibilityEvent);
        }
    }

    public final void j(boolean z10) {
        if (this.f21133t == z10) {
            return;
        }
        this.f21133t = z10;
        if (z10) {
            this.f21126l |= h.ACCESSIBLE_NAVIGATION.value;
        } else {
            this.f21126l &= ~h.ACCESSIBLE_NAVIGATION.value;
        }
        ((FlutterJNI) this.f21117b.f22980b).setAccessibilityFeatures(this.f21126l);
    }

    public final boolean k(l lVar) {
        if (lVar.f21098j > 1) {
            l lVar2 = this.f21124i;
            l lVar3 = null;
            if (lVar2 != null) {
                l lVar4 = lVar2.f21078S;
                while (true) {
                    if (lVar4 == null) {
                        lVar4 = null;
                        break;
                    }
                    if (lVar4 == lVar) {
                        break;
                    }
                    lVar4 = lVar4.f21078S;
                }
                if (lVar4 != null) {
                    return true;
                }
            }
            l lVar5 = this.f21124i;
            if (lVar5 != null) {
                for (l lVar6 = lVar5.f21078S; lVar6 != null; lVar6 = lVar6.f21078S) {
                    if (lVar6.g(k.HAS_IMPLICIT_SCROLLING)) {
                        lVar3 = lVar6;
                        break;
                    }
                }
                if (lVar3 != null) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i10, int i11, Bundle bundle) {
        if (i10 >= 65536) {
            boolean zPerformAction = this.f21119d.performAction(i10, i11, bundle);
            if (zPerformAction && i11 == 128) {
                this.f21125j = null;
            }
            return zPerformAction;
        }
        HashMap map = this.f21122g;
        l lVar = (l) map.get(Integer.valueOf(i10));
        if (lVar != null) {
            p150n8.a aVar = this.f21117b;
            switch (i11) {
                case 16:
                    aVar.Y(i10, i.TAP);
                    return true;
                case com.amazon.c.a.a.c.f16581h /* 32 */:
                    aVar.Y(i10, i.LONG_PRESS);
                    return true;
                case 64:
                    if (this.f21124i == null) {
                        this.f21116a.invalidate();
                    }
                    this.f21124i = lVar;
                    aVar.Y(i10, i.DID_GAIN_ACCESSIBILITY_FOCUS);
                    HashMap map2 = new HashMap();
                    map2.put("type", "didGainFocus");
                    map2.put("nodeId", Integer.valueOf(lVar.f21088b));
                    ((C2061m) aVar.f22979a).G(map2, null);
                    h(i10, 32768);
                    if (!l.a(lVar, i.INCREASE) && !l.a(lVar, i.DECREASE)) {
                        return true;
                    }
                    h(i10, 4);
                    return true;
                case ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD /* 128 */:
                    l lVar2 = this.f21124i;
                    if (lVar2 != null && lVar2.f21088b == i10) {
                        this.f21124i = null;
                    }
                    Integer num = this.f21125j;
                    if (num != null && num.intValue() == i10) {
                        this.f21125j = null;
                    }
                    aVar.Y(i10, i.DID_LOSE_ACCESSIBILITY_FOCUS);
                    h(i10, ETagPayloadStore.CHUNK_CHARS);
                    return true;
                case 256:
                    return g(lVar, i10, bundle, true);
                case 512:
                    return g(lVar, i10, bundle, false);
                case 4096:
                    i iVar = i.SCROLL_UP;
                    if (l.a(lVar, iVar)) {
                        aVar.Y(i10, iVar);
                        return true;
                    }
                    i iVar2 = i.SCROLL_LEFT;
                    if (l.a(lVar, iVar2)) {
                        aVar.Y(i10, iVar2);
                        return true;
                    }
                    i iVar3 = i.INCREASE;
                    if (l.a(lVar, iVar3)) {
                        lVar.r = lVar.f21106t;
                        lVar.f21105s = lVar.f21107u;
                        h(i10, 4);
                        aVar.Y(i10, iVar3);
                        return true;
                    }
                    break;
                case 8192:
                    i iVar4 = i.SCROLL_DOWN;
                    if (l.a(lVar, iVar4)) {
                        aVar.Y(i10, iVar4);
                        return true;
                    }
                    i iVar5 = i.SCROLL_RIGHT;
                    if (l.a(lVar, iVar5)) {
                        aVar.Y(i10, iVar5);
                        return true;
                    }
                    i iVar6 = i.DECREASE;
                    if (l.a(lVar, iVar6)) {
                        lVar.r = lVar.f21108v;
                        lVar.f21105s = lVar.f21109w;
                        h(i10, 4);
                        aVar.Y(i10, iVar6);
                        return true;
                    }
                    break;
                case 16384:
                    aVar.Y(i10, i.COPY);
                    return true;
                case 32768:
                    aVar.Y(i10, i.PASTE);
                    return true;
                case ETagPayloadStore.CHUNK_CHARS /* 65536 */:
                    aVar.Y(i10, i.CUT);
                    return true;
                case 131072:
                    HashMap map3 = new HashMap();
                    if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                        map3.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                        map3.put("extent", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT")));
                    } else {
                        map3.put("base", Integer.valueOf(lVar.f21096h));
                        map3.put("extent", Integer.valueOf(lVar.f21096h));
                    }
                    aVar.Z(i10, i.SET_SELECTION, map3);
                    l lVar3 = (l) map.get(Integer.valueOf(i10));
                    lVar3.f21095g = ((Integer) map3.get("base")).intValue();
                    lVar3.f21096h = ((Integer) map3.get("extent")).intValue();
                    return true;
                case ETagPayloadStore.WRITE_BUFFER_BYTES /* 262144 */:
                    aVar.Y(i10, i.EXPAND);
                    return true;
                case 524288:
                    aVar.Y(i10, i.COLLAPSE);
                    return true;
                case 1048576:
                    aVar.Y(i10, i.DISMISS);
                    return true;
                case 2097152:
                    String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? "" : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
                    aVar.Z(i10, i.SET_TEXT, string);
                    lVar.r = string;
                    lVar.f21105s = null;
                    return true;
                case R.id.accessibilityActionShowOnScreen:
                    aVar.Y(i10, i.SHOW_ON_SCREEN);
                    return true;
                default:
                    j jVar = (j) this.f21123h.get(Integer.valueOf(i11 - 267386881));
                    if (jVar != null) {
                        aVar.Z(i10, i.CUSTOM_ACTION, Integer.valueOf(jVar.f21056b));
                        return true;
                    }
                    break;
            }
        }
        return false;
    }
}
