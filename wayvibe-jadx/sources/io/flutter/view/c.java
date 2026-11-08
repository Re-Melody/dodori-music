package io.flutter.view;

import android.opengl.Matrix;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.revenuecat.purchases.common.networking.ETagPayloadStore;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements p052e8.d, p052e8.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f21049a;

    public /* synthetic */ c(Object obj) {
        this.f21049a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:207:0x048b  */
    public void a(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        io.flutter.plugin.platform.k kVar;
        ArrayList arrayList;
        Iterator it;
        l lVar;
        int i10;
        int i11;
        l lVar2;
        String str;
        float f10;
        float f11;
        View viewD;
        Integer num;
        m mVar;
        View viewD2;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        int i12 = 0;
        for (ByteBuffer byteBuffer2 : byteBufferArr) {
            byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
        }
        m mVar2 = (m) this.f21049a;
        mVar2.getClass();
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            boolean zHasRemaining = byteBuffer.hasRemaining();
            kVar = mVar2.f21120e;
            if (!zHasRemaining) {
                break;
            }
            l lVarC = mVar2.c(byteBuffer.getInt());
            lVarC.f21064E = true;
            lVarC.f21070K = lVarC.r;
            lVarC.f21071L = lVarC.f21103p;
            lVarC.f21065F = lVarC.f21090c;
            lVarC.f21066G = lVarC.f21092d;
            lVarC.f21067H = lVarC.f21095g;
            lVarC.f21068I = lVarC.f21096h;
            lVarC.f21069J = lVarC.f21099l;
            lVarC.f21090c = byteBuffer.getLong();
            lVarC.f21092d = byteBuffer.getInt();
            lVarC.f21093e = byteBuffer.getInt();
            lVarC.f21094f = byteBuffer.getInt();
            lVarC.f21095g = byteBuffer.getInt();
            lVarC.f21096h = byteBuffer.getInt();
            lVarC.f21097i = byteBuffer.getInt();
            lVarC.f21098j = byteBuffer.getInt();
            lVarC.k = byteBuffer.getInt();
            byteBuffer.getInt();
            lVarC.f21099l = byteBuffer.getFloat();
            lVarC.f21100m = byteBuffer.getFloat();
            lVarC.f21101n = byteBuffer.getFloat();
            lVarC.f21102o = m.d(byteBuffer, strArr);
            lVarC.f21103p = m.d(byteBuffer, strArr);
            lVarC.f21104q = l.f(byteBuffer, byteBufferArr);
            lVarC.r = m.d(byteBuffer, strArr);
            lVarC.f21105s = l.f(byteBuffer, byteBufferArr);
            lVarC.f21106t = m.d(byteBuffer, strArr);
            lVarC.f21107u = l.f(byteBuffer, byteBufferArr);
            lVarC.f21108v = m.d(byteBuffer, strArr);
            lVarC.f21109w = l.f(byteBuffer, byteBufferArr);
            lVarC.f21110x = m.d(byteBuffer, strArr);
            lVarC.f21111y = l.f(byteBuffer, byteBufferArr);
            lVarC.f21112z = m.d(byteBuffer, strArr);
            lVarC.f21060A = m.d(byteBuffer, strArr);
            lVarC.f21061B = m.d(byteBuffer, strArr);
            lVarC.f21062C = byteBuffer.getInt();
            byteBuffer.getInt();
            lVarC.f21072M = byteBuffer.getFloat();
            lVarC.f21073N = byteBuffer.getFloat();
            lVarC.f21074O = byteBuffer.getFloat();
            lVarC.f21075P = byteBuffer.getFloat();
            float[] fArr = lVarC.f21076Q;
            if (fArr == null) {
                fArr = new float[16];
            }
            for (int i13 = 0; i13 < 16; i13++) {
                fArr[i13] = byteBuffer.getFloat();
            }
            lVarC.f21076Q = fArr;
            float[] fArr2 = lVarC.f21077R;
            if (fArr2 == null) {
                fArr2 = new float[16];
            }
            for (int i14 = 0; i14 < 16; i14++) {
                fArr2[i14] = byteBuffer.getFloat();
            }
            lVarC.f21077R = fArr2;
            lVarC.f21084Y = true;
            lVarC.f21087a0 = true;
            int i15 = byteBuffer.getInt();
            ArrayList arrayList3 = lVarC.f21079T;
            arrayList3.clear();
            int i16 = 0;
            while (true) {
                mVar = lVarC.f21086a;
                if (i16 >= i15) {
                    break;
                }
                l lVarC2 = mVar.c(byteBuffer.getInt());
                lVarC2.f21078S = lVarC;
                arrayList3.add(lVarC2);
                i16++;
            }
            int i17 = byteBuffer.getInt();
            ArrayList arrayList4 = lVarC.f21080U;
            arrayList4.clear();
            for (int i18 = 0; i18 < i17; i18++) {
                l lVarC3 = mVar.c(byteBuffer.getInt());
                lVarC3.f21078S = lVarC;
                arrayList4.add(lVarC3);
            }
            int i19 = byteBuffer.getInt();
            if (i19 == 0) {
                lVarC.f21081V = null;
            } else {
                ArrayList arrayList5 = lVarC.f21081V;
                if (arrayList5 == null) {
                    lVarC.f21081V = new ArrayList(i19);
                } else {
                    arrayList5.clear();
                }
                for (int i20 = 0; i20 < i19; i20++) {
                    j jVarB = mVar.b(byteBuffer.getInt());
                    int i21 = jVarB.f21057c;
                    if (i21 == i.TAP.value) {
                        lVarC.f21082W = jVarB;
                    } else if (i21 == i.LONG_PRESS.value) {
                        lVarC.f21083X = jVarB;
                    } else {
                        lVarC.f21081V.add(jVarB);
                    }
                    lVarC.f21081V.add(jVarB);
                }
            }
            if (!lVarC.g(k.IS_HIDDEN)) {
                if (lVarC.g(k.IS_FOCUSED)) {
                    mVar2.f21128n = lVarC;
                }
                if (lVarC.f21064E) {
                    arrayList2.add(lVarC);
                }
                int i22 = lVarC.f21097i;
                if (i22 != -1 && !kVar.o(i22) && (viewD2 = kVar.d(lVarC.f21097i)) != null) {
                    viewD2.setImportantForAccessibility(0);
                }
            }
        }
        HashSet hashSet = new HashSet();
        HashMap map = mVar2.f21122g;
        l lVar3 = (l) map.get(0);
        ArrayList arrayList6 = new ArrayList();
        if (lVar3 != null) {
            float[] fArr3 = new float[16];
            Matrix.setIdentityM(fArr3, 0);
            lVar3.k(fArr3, hashSet, false);
            lVar3.c(arrayList6);
        }
        Iterator it2 = arrayList6.iterator();
        l lVar4 = null;
        while (true) {
            boolean zHasNext = it2.hasNext();
            arrayList = mVar2.f21131q;
            if (!zHasNext) {
                break;
            }
            l lVar5 = (l) it2.next();
            if (!arrayList.contains(Integer.valueOf(lVar5.f21088b))) {
                lVar4 = lVar5;
            }
        }
        if (lVar4 == null && !arrayList6.isEmpty()) {
            lVar4 = (l) p134m1.b.i(1, arrayList6);
        }
        if (lVar4 != null && (lVar4.f21088b != mVar2.r || arrayList6.size() != arrayList.size())) {
            mVar2.r = lVar4.f21088b;
            String strE = lVar4.e();
            if (strE == null) {
                strE = StringUtils.SPACE;
            }
            if (Build.VERSION.SDK_INT >= 28) {
                mVar2.f21116a.setAccessibilityPaneTitle(strE);
            } else {
                AccessibilityEvent accessibilityEventE = mVar2.e(lVar4.f21088b, 32);
                accessibilityEventE.getText().add(strE);
                mVar2.i(accessibilityEventE);
            }
        }
        arrayList.clear();
        Iterator it3 = arrayList6.iterator();
        while (it3.hasNext()) {
            arrayList.add(Integer.valueOf(((l) it3.next()).f21088b));
        }
        Iterator it4 = map.entrySet().iterator();
        while (it4.hasNext()) {
            l lVar6 = (l) ((Map.Entry) it4.next()).getValue();
            if (!hashSet.contains(lVar6)) {
                lVar6.f21078S = null;
                if (lVar6.f21097i != -1 && (num = mVar2.f21125j) != null && mVar2.f21119d.platformViewOfNode(num.intValue()) == kVar.d(lVar6.f21097i)) {
                    mVar2.h(mVar2.f21125j.intValue(), ETagPayloadStore.CHUNK_CHARS);
                    mVar2.f21125j = null;
                }
                int i23 = lVar6.f21097i;
                if (i23 != -1 && (viewD = kVar.d(i23)) != null) {
                    viewD.setImportantForAccessibility(4);
                }
                l lVar7 = mVar2.f21124i;
                if (lVar7 == lVar6) {
                    mVar2.h(lVar7.f21088b, ETagPayloadStore.CHUNK_CHARS);
                    mVar2.f21124i = null;
                }
                if (mVar2.f21128n == lVar6) {
                    mVar2.f21128n = null;
                }
                if (mVar2.f21130p == lVar6) {
                    mVar2.f21130p = null;
                }
                it4.remove();
            }
        }
        int i24 = 2048;
        AccessibilityEvent accessibilityEventE2 = mVar2.e(0, 2048);
        accessibilityEventE2.setContentChangeTypes(1);
        mVar2.i(accessibilityEventE2);
        Iterator it5 = arrayList2.iterator();
        while (it5.hasNext()) {
            l lVar8 = (l) it5.next();
            if (!Float.isNaN(lVar8.f21099l) && !Float.isNaN(lVar8.f21069J) && lVar8.f21069J != lVar8.f21099l) {
                AccessibilityEvent accessibilityEventE3 = mVar2.e(lVar8.f21088b, 4096);
                float f12 = lVar8.f21099l;
                float f13 = lVar8.f21100m;
                if (Float.isInfinite(f13)) {
                    if (f12 > 70000.0f) {
                        f12 = 70000.0f;
                    }
                    f13 = 100000.0f;
                }
                if (Float.isInfinite(lVar8.f21101n)) {
                    f10 = f13 + 100000.0f;
                    if (f12 < -70000.0f) {
                        f12 = -70000.0f;
                    }
                    f11 = f12 + 100000.0f;
                } else {
                    float f14 = lVar8.f21101n;
                    f10 = f13 - f14;
                    f11 = f12 - f14;
                }
                i iVar = i.SCROLL_UP;
                int i25 = lVar8.f21066G;
                if ((iVar.value & i25) != 0 || (i.SCROLL_DOWN.value & i25) != 0) {
                    accessibilityEventE3.setScrollY((int) f11);
                    accessibilityEventE3.setMaxScrollY((int) f10);
                } else if ((i.SCROLL_LEFT.value & i25) != 0 || (i.SCROLL_RIGHT.value & i25) != 0) {
                    accessibilityEventE3.setScrollX((int) f11);
                    accessibilityEventE3.setMaxScrollX((int) f10);
                }
                int i26 = lVar8.f21098j;
                if (i26 > 0) {
                    accessibilityEventE3.setItemCount(i26);
                    accessibilityEventE3.setFromIndex(lVar8.k);
                    Iterator it6 = lVar8.f21080U.iterator();
                    int i27 = i12;
                    while (it6.hasNext()) {
                        if (!((l) it6.next()).g(k.IS_HIDDEN)) {
                            i27++;
                        }
                    }
                    accessibilityEventE3.setToIndex((lVar8.k + i27) - 1);
                }
                mVar2.i(accessibilityEventE3);
            }
            if (lVar8.g(k.IS_LIVE_REGION) && (((str = lVar8.f21103p) != null || lVar8.f21071L != null) && (str == null || !str.equals(lVar8.f21071L)))) {
                AccessibilityEvent accessibilityEventE4 = mVar2.e(lVar8.f21088b, i24);
                accessibilityEventE4.setContentChangeTypes(1);
                mVar2.i(accessibilityEventE4);
            }
            l lVar9 = mVar2.f21124i;
            if (lVar9 == null || lVar9.f21088b != lVar8.f21088b) {
                it = it5;
            } else {
                k kVar2 = k.IS_SELECTED;
                it = it5;
                if ((((long) kVar2.value) & lVar8.f21065F) == 0 && lVar8.g(kVar2)) {
                    AccessibilityEvent accessibilityEventE5 = mVar2.e(lVar8.f21088b, 4);
                    accessibilityEventE5.getText().add(lVar8.f21103p);
                    mVar2.i(accessibilityEventE5);
                }
            }
            l lVar10 = mVar2.f21128n;
            if (lVar10 != null && (i10 = lVar10.f21088b) == (i11 = lVar8.f21088b) && ((lVar2 = mVar2.f21129o) == null || lVar2.f21088b != i10)) {
                mVar2.f21129o = lVar10;
                mVar2.i(mVar2.e(i11, 8));
            } else if (lVar10 == null) {
                mVar2.f21129o = null;
            }
            l lVar11 = mVar2.f21128n;
            if (lVar11 != null && lVar11.f21088b == lVar8.f21088b) {
                k kVar3 = k.IS_TEXT_FIELD;
                if ((((long) kVar3.value) & lVar8.f21065F) != 0 && lVar8.g(kVar3) && ((lVar = mVar2.f21124i) == null || lVar.f21088b == mVar2.f21128n.f21088b)) {
                    String str2 = lVar8.f21070K;
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str3 = lVar8.r;
                    String str4 = str3 != null ? str3 : "";
                    AccessibilityEvent accessibilityEventE6 = mVar2.e(lVar8.f21088b, 16);
                    accessibilityEventE6.setBeforeText(str2);
                    accessibilityEventE6.getText().add(str4);
                    int i28 = 0;
                    while (i28 < str2.length() && i28 < str4.length() && str2.charAt(i28) == str4.charAt(i28)) {
                        i28++;
                    }
                    if (i28 < str2.length() || i28 < str4.length()) {
                        accessibilityEventE6.setFromIndex(i28);
                        int length = str2.length() - 1;
                        int length2 = str4.length() - 1;
                        while (length >= i28 && length2 >= i28 && str2.charAt(length) == str4.charAt(length2)) {
                            length--;
                            length2--;
                        }
                        accessibilityEventE6.setRemovedCount((length - i28) + 1);
                        accessibilityEventE6.setAddedCount((length2 - i28) + 1);
                    } else {
                        accessibilityEventE6 = null;
                    }
                    if (accessibilityEventE6 != null) {
                        mVar2.i(accessibilityEventE6);
                    }
                    if (lVar8.f21067H != lVar8.f21095g || lVar8.f21068I != lVar8.f21096h) {
                        AccessibilityEvent accessibilityEventE7 = mVar2.e(lVar8.f21088b, 8192);
                        accessibilityEventE7.getText().add(str4);
                        accessibilityEventE7.setFromIndex(lVar8.f21095g);
                        accessibilityEventE7.setToIndex(lVar8.f21096h);
                        accessibilityEventE7.setItemCount(str4.length());
                        mVar2.i(accessibilityEventE7);
                    }
                }
            }
            it5 = it;
            i24 = 2048;
            i12 = 0;
        }
    }
}
