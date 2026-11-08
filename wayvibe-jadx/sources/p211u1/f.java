package p211u1;

import D7.p1;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.c.a.a.c;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.ui.revenuecatui.composables.BackgroundUIConstants;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import com.revenuecat.purchases.utils.PurchaseParamsValidator;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import org.apache.tika.pipes.PipesConfigBase;
import org.apache.tika.utils.XMLReaderUtils;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f27160b = {0, 4, 8};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SparseIntArray f27161c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap f27162a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f27161c = sparseIntArray;
        sparseIntArray.append(55, 25);
        sparseIntArray.append(56, 26);
        sparseIntArray.append(58, 29);
        sparseIntArray.append(59, 30);
        sparseIntArray.append(64, 36);
        sparseIntArray.append(63, 35);
        sparseIntArray.append(37, 4);
        sparseIntArray.append(36, 3);
        sparseIntArray.append(34, 1);
        sparseIntArray.append(72, 6);
        sparseIntArray.append(73, 7);
        sparseIntArray.append(44, 17);
        sparseIntArray.append(45, 18);
        sparseIntArray.append(46, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(60, 32);
        sparseIntArray.append(61, 33);
        sparseIntArray.append(43, 10);
        sparseIntArray.append(42, 9);
        sparseIntArray.append(76, 13);
        sparseIntArray.append(79, 16);
        sparseIntArray.append(77, 14);
        sparseIntArray.append(74, 11);
        sparseIntArray.append(78, 15);
        sparseIntArray.append(75, 12);
        sparseIntArray.append(67, 40);
        sparseIntArray.append(53, 39);
        sparseIntArray.append(52, 41);
        sparseIntArray.append(66, 42);
        sparseIntArray.append(51, 20);
        sparseIntArray.append(65, 37);
        sparseIntArray.append(41, 5);
        sparseIntArray.append(54, 75);
        sparseIntArray.append(62, 75);
        sparseIntArray.append(57, 75);
        sparseIntArray.append(35, 75);
        sparseIntArray.append(33, 75);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(68, 54);
        sparseIntArray.append(47, 55);
        sparseIntArray.append(69, 56);
        sparseIntArray.append(48, 57);
        sparseIntArray.append(70, 58);
        sparseIntArray.append(49, 59);
        sparseIntArray.append(38, 61);
        sparseIntArray.append(40, 62);
        sparseIntArray.append(39, 63);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(71, 69);
        sparseIntArray.append(50, 70);
        sparseIntArray.append(29, 71);
        sparseIntArray.append(28, 72);
        sparseIntArray.append(30, 73);
        sparseIntArray.append(27, 74);
    }

    public static int[] a(a aVar, String str) {
        int iIntValue;
        String[] strArrSplit = str.split(com.amazon.a.a.o.b.f.f16451a);
        Context context = aVar.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i10 = 0;
        int i11 = 0;
        while (i10 < strArrSplit.length) {
            String strTrim = strArrSplit[i10].trim();
            Object obj = null;
            try {
                iIntValue = h.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, DiagnosticsEntry.ID_KEY, context.getPackageName());
            }
            if (iIntValue == 0 && aVar.isInEditMode() && (aVar.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) aVar.getParent();
                if (strTrim != null) {
                    HashMap map = constraintLayout.f14862m;
                    if (map != null && map.containsKey(strTrim)) {
                        obj = constraintLayout.f14862m.get(strTrim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i11] = iIntValue;
            i10++;
            i11++;
        }
        return i11 != strArrSplit.length ? Arrays.copyOf(iArr, i11) : iArr;
    }

    public static e b(Context context, AttributeSet attributeSet) {
        e eVar = new e();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f27164b);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            SparseIntArray sparseIntArray = f27161c;
            int i11 = sparseIntArray.get(index);
            switch (i11) {
                case 1:
                    eVar.f27147p = d(typedArrayObtainStyledAttributes, index, eVar.f27147p);
                    break;
                case 2:
                    eVar.f27098G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f27098G);
                    break;
                case 3:
                    eVar.f27145o = d(typedArrayObtainStyledAttributes, index, eVar.f27145o);
                    break;
                case 4:
                    eVar.f27143n = d(typedArrayObtainStyledAttributes, index, eVar.f27143n);
                    break;
                case 5:
                    eVar.f27156w = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 6:
                    eVar.f27092A = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, eVar.f27092A);
                    break;
                case 7:
                    eVar.f27093B = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, eVar.f27093B);
                    break;
                case 8:
                    eVar.f27099H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f27099H);
                    break;
                case 9:
                    eVar.f27153t = d(typedArrayObtainStyledAttributes, index, eVar.f27153t);
                    break;
                case 10:
                    eVar.f27152s = d(typedArrayObtainStyledAttributes, index, eVar.f27152s);
                    break;
                case 11:
                    eVar.f27105N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f27105N);
                    break;
                case 12:
                    eVar.f27106O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f27106O);
                    break;
                case 13:
                    eVar.f27102K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f27102K);
                    break;
                case 14:
                    eVar.f27104M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f27104M);
                    break;
                case 15:
                    eVar.f27107P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f27107P);
                    break;
                case 16:
                    eVar.f27103L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f27103L);
                    break;
                case 17:
                    eVar.f27126e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, eVar.f27126e);
                    break;
                case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    eVar.f27128f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, eVar.f27128f);
                    break;
                case 19:
                    eVar.f27130g = typedArrayObtainStyledAttributes.getFloat(index, eVar.f27130g);
                    break;
                case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                    eVar.f27154u = typedArrayObtainStyledAttributes.getFloat(index, eVar.f27154u);
                    break;
                case 21:
                    eVar.f27122c = typedArrayObtainStyledAttributes.getLayoutDimension(index, eVar.f27122c);
                    break;
                case 22:
                    int i12 = typedArrayObtainStyledAttributes.getInt(index, eVar.f27101J);
                    eVar.f27101J = i12;
                    eVar.f27101J = f27160b[i12];
                    break;
                case 23:
                    eVar.f27120b = typedArrayObtainStyledAttributes.getLayoutDimension(index, eVar.f27120b);
                    break;
                case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                    eVar.f27095D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f27095D);
                    break;
                case 25:
                    eVar.f27132h = d(typedArrayObtainStyledAttributes, index, eVar.f27132h);
                    break;
                case 26:
                    eVar.f27134i = d(typedArrayObtainStyledAttributes, index, eVar.f27134i);
                    break;
                case 27:
                    eVar.f27094C = typedArrayObtainStyledAttributes.getInt(index, eVar.f27094C);
                    break;
                case 28:
                    eVar.f27096E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f27096E);
                    break;
                case 29:
                    eVar.f27136j = d(typedArrayObtainStyledAttributes, index, eVar.f27136j);
                    break;
                case 30:
                    eVar.k = d(typedArrayObtainStyledAttributes, index, eVar.k);
                    break;
                case BackgroundUIConstants.minSDKVersionSupportingBlur /* 31 */:
                    eVar.f27100I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f27100I);
                    break;
                case c.f16581h /* 32 */:
                    eVar.f27149q = d(typedArrayObtainStyledAttributes, index, eVar.f27149q);
                    break;
                case 33:
                    eVar.r = d(typedArrayObtainStyledAttributes, index, eVar.r);
                    break;
                case 34:
                    eVar.f27097F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f27097F);
                    break;
                case 35:
                    eVar.f27141m = d(typedArrayObtainStyledAttributes, index, eVar.f27141m);
                    break;
                case 36:
                    eVar.f27139l = d(typedArrayObtainStyledAttributes, index, eVar.f27139l);
                    break;
                case 37:
                    eVar.f27155v = typedArrayObtainStyledAttributes.getFloat(index, eVar.f27155v);
                    break;
                case 38:
                    eVar.f27124d = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f27124d);
                    break;
                case 39:
                    eVar.f27109R = typedArrayObtainStyledAttributes.getFloat(index, eVar.f27109R);
                    break;
                case 40:
                    eVar.f27108Q = typedArrayObtainStyledAttributes.getFloat(index, eVar.f27108Q);
                    break;
                case 41:
                    eVar.f27110S = typedArrayObtainStyledAttributes.getInt(index, eVar.f27110S);
                    break;
                case 42:
                    eVar.f27111T = typedArrayObtainStyledAttributes.getInt(index, eVar.f27111T);
                    break;
                case 43:
                    eVar.f27112U = typedArrayObtainStyledAttributes.getFloat(index, eVar.f27112U);
                    break;
                case 44:
                    eVar.f27113V = true;
                    eVar.f27114W = typedArrayObtainStyledAttributes.getDimension(index, eVar.f27114W);
                    break;
                case 45:
                    eVar.f27116Y = typedArrayObtainStyledAttributes.getFloat(index, eVar.f27116Y);
                    break;
                case 46:
                    eVar.f27117Z = typedArrayObtainStyledAttributes.getFloat(index, eVar.f27117Z);
                    break;
                case 47:
                    eVar.f27119a0 = typedArrayObtainStyledAttributes.getFloat(index, eVar.f27119a0);
                    break;
                case 48:
                    eVar.f27121b0 = typedArrayObtainStyledAttributes.getFloat(index, eVar.f27121b0);
                    break;
                case PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS /* 49 */:
                    eVar.f27123c0 = typedArrayObtainStyledAttributes.getFloat(index, eVar.f27123c0);
                    break;
                case 50:
                    eVar.f27125d0 = typedArrayObtainStyledAttributes.getFloat(index, eVar.f27125d0);
                    break;
                case 51:
                    eVar.f27127e0 = typedArrayObtainStyledAttributes.getDimension(index, eVar.f27127e0);
                    break;
                case 52:
                    eVar.f27129f0 = typedArrayObtainStyledAttributes.getDimension(index, eVar.f27129f0);
                    break;
                case 53:
                    eVar.f27131g0 = typedArrayObtainStyledAttributes.getDimension(index, eVar.f27131g0);
                    break;
                default:
                    switch (i11) {
                        case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                            eVar.f27115X = typedArrayObtainStyledAttributes.getFloat(index, eVar.f27115X);
                            break;
                        case 61:
                            eVar.f27157x = d(typedArrayObtainStyledAttributes, index, eVar.f27157x);
                            break;
                        case 62:
                            eVar.f27158y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f27158y);
                            break;
                        case 63:
                            eVar.f27159z = typedArrayObtainStyledAttributes.getFloat(index, eVar.f27159z);
                            break;
                        default:
                            switch (i11) {
                                case 69:
                                    eVar.f27140l0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                    break;
                                case 70:
                                    eVar.f27142m0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                    break;
                                case 71:
                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                    break;
                                case 72:
                                    eVar.f27146o0 = typedArrayObtainStyledAttributes.getInt(index, eVar.f27146o0);
                                    break;
                                case 73:
                                    eVar.f27151r0 = typedArrayObtainStyledAttributes.getString(index);
                                    break;
                                case 74:
                                    eVar.f27144n0 = typedArrayObtainStyledAttributes.getBoolean(index, eVar.f27144n0);
                                    break;
                                case 75:
                                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                    break;
                                default:
                                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return eVar;
    }

    public static int d(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        return resourceId == -1 ? typedArray.getInt(i10, -1) : resourceId;
    }

    public final void c(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    e eVarB = b(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        eVarB.f27118a = true;
                    }
                    this.f27162a.put(Integer.valueOf(eVarB.f27124d), eVarB);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e4) {
            e4.printStackTrace();
        }
    }
}
