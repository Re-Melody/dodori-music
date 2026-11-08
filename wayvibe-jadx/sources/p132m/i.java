package p132m;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import p087i.a;
import p142n.l;
import p142n.o;
import p152o.AbstractC2150o0;

/* JADX INFO: loaded from: classes.dex */
public final class i extends MenuInflater {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Class[] f22166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Class[] f22167f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f22168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f22169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f22170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f22171d;

    static {
        Class[] clsArr = {Context.class};
        f22166e = clsArr;
        f22167f = clsArr;
    }

    public i(Context context) {
        super(context);
        this.f22170c = context;
        Object[] objArr = {context};
        this.f22168a = objArr;
        this.f22169b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [m.i] */
    /* JADX WARN: Type inference failed for: r3v15, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        ?? r10;
        int i10;
        ?? r11;
        ColorStateList colorStateList;
        int resourceId;
        h hVar = new h(this, menu);
        int eventType = xmlResourceParser.getEventType();
        do {
            r10 = 1;
            i10 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
                break;
            }
            eventType = xmlResourceParser.next();
        } while (eventType != 1);
        boolean z10 = false;
        boolean z11 = false;
        String str = null;
        while (!z10) {
            if (eventType == r10) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType == i10) {
                if (!z11) {
                    String name2 = xmlResourceParser.getName();
                    boolean zEquals = name2.equals("group");
                    i iVar = hVar.f22141E;
                    if (zEquals) {
                        ?? ObtainStyledAttributes = iVar.f22170c.obtainStyledAttributes(attributeSet, a.f20381p);
                        hVar.f22143b = ObtainStyledAttributes.getResourceId(r10, 0);
                        hVar.f22144c = ObtainStyledAttributes.getInt(3, 0);
                        hVar.f22145d = ObtainStyledAttributes.getInt(4, 0);
                        hVar.f22146e = ObtainStyledAttributes.getInt(5, 0);
                        hVar.f22147f = ObtainStyledAttributes.getBoolean(2, r10);
                        hVar.f22148g = ObtainStyledAttributes.getBoolean(0, r10);
                        ObtainStyledAttributes.recycle();
                    } else if (name2.equals("item")) {
                        Context context = iVar.f22170c;
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f20382q);
                        hVar.f22150i = typedArrayObtainStyledAttributes.getResourceId(2, 0);
                        hVar.f22151j = (typedArrayObtainStyledAttributes.getInt(5, hVar.f22144c) & (-65536)) | (typedArrayObtainStyledAttributes.getInt(6, hVar.f22145d) & 65535);
                        hVar.k = typedArrayObtainStyledAttributes.getText(7);
                        hVar.f22152l = typedArrayObtainStyledAttributes.getText(8);
                        hVar.f22153m = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                        String string = typedArrayObtainStyledAttributes.getString(9);
                        hVar.f22154n = string == null ? (char) 0 : string.charAt(0);
                        hVar.f22155o = typedArrayObtainStyledAttributes.getInt(16, 4096);
                        String string2 = typedArrayObtainStyledAttributes.getString(10);
                        hVar.f22156p = string2 == null ? (char) 0 : string2.charAt(0);
                        hVar.f22157q = typedArrayObtainStyledAttributes.getInt(20, 4096);
                        if (typedArrayObtainStyledAttributes.hasValue(11)) {
                            hVar.r = typedArrayObtainStyledAttributes.getBoolean(11, false) ? 1 : 0;
                        } else {
                            hVar.r = hVar.f22146e;
                        }
                        hVar.f22158s = typedArrayObtainStyledAttributes.getBoolean(3, false);
                        hVar.f22159t = typedArrayObtainStyledAttributes.getBoolean(4, hVar.f22147f);
                        hVar.f22160u = typedArrayObtainStyledAttributes.getBoolean(1, hVar.f22148g);
                        hVar.f22161v = typedArrayObtainStyledAttributes.getInt(21, -1);
                        hVar.f22164y = typedArrayObtainStyledAttributes.getString(12);
                        hVar.f22162w = typedArrayObtainStyledAttributes.getResourceId(13, 0);
                        hVar.f22163x = typedArrayObtainStyledAttributes.getString(15);
                        String string3 = typedArrayObtainStyledAttributes.getString(14);
                        boolean z12 = string3 != null;
                        if (z12 && hVar.f22162w == 0 && hVar.f22163x == null) {
                            hVar.f22165z = (o) hVar.a(string3, f22167f, iVar.f22169b);
                        } else {
                            if (z12) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            hVar.f22165z = null;
                        }
                        hVar.f22137A = typedArrayObtainStyledAttributes.getText(17);
                        hVar.f22138B = typedArrayObtainStyledAttributes.getText(22);
                        if (typedArrayObtainStyledAttributes.hasValue(19)) {
                            hVar.f22140D = AbstractC2150o0.c(typedArrayObtainStyledAttributes.getInt(19, -1), hVar.f22140D);
                        } else {
                            hVar.f22140D = null;
                        }
                        if (typedArrayObtainStyledAttributes.hasValue(18)) {
                            if (!typedArrayObtainStyledAttributes.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(18, 0)) == 0 || (colorStateList = p254y1.a.getColorStateList(context, resourceId)) == null) {
                                colorStateList = typedArrayObtainStyledAttributes.getColorStateList(18);
                            }
                            hVar.f22139C = colorStateList;
                        } else {
                            hVar.f22139C = null;
                        }
                        typedArrayObtainStyledAttributes.recycle();
                        hVar.f22149h = false;
                        xmlResourceParser = xmlResourceParser;
                        r11 = 1;
                    } else if (name2.equals("menu")) {
                        r11 = 1;
                        hVar.f22149h = true;
                        SubMenu subMenuAddSubMenu = hVar.f22142a.addSubMenu(hVar.f22143b, hVar.f22150i, hVar.f22151j, hVar.k);
                        hVar.b(subMenuAddSubMenu.getItem());
                        xmlResourceParser = xmlResourceParser;
                        b(xmlResourceParser, attributeSet, subMenuAddSubMenu);
                    } else {
                        xmlResourceParser = xmlResourceParser;
                        r11 = 1;
                        str = name2;
                        z11 = true;
                    }
                }
                r11 = r10;
                z10 = z10;
            } else if (eventType != 3) {
                r11 = r10;
                z10 = z10;
            } else {
                String name3 = xmlResourceParser.getName();
                if (z11 && name3.equals(str)) {
                    xmlResourceParser = xmlResourceParser;
                    r11 = r10;
                    z11 = false;
                    str = null;
                } else {
                    if (name3.equals("group")) {
                        hVar.f22143b = 0;
                        hVar.f22144c = 0;
                        hVar.f22145d = 0;
                        hVar.f22146e = 0;
                        hVar.f22147f = r10;
                        hVar.f22148g = r10;
                    } else if (name3.equals("item")) {
                        if (!hVar.f22149h) {
                            o oVar = hVar.f22165z;
                            if (oVar == null || !oVar.f22683b.hasSubMenu()) {
                                hVar.f22149h = r10;
                                hVar.b(hVar.f22142a.add(hVar.f22143b, hVar.f22150i, hVar.f22151j, hVar.k));
                            } else {
                                hVar.f22149h = r10;
                                hVar.b(hVar.f22142a.addSubMenu(hVar.f22143b, hVar.f22150i, hVar.f22151j, hVar.k).getItem());
                            }
                        }
                    } else if (name3.equals("menu")) {
                        ?? r12 = r10;
                        z10 = r12 == true ? 1 : 0;
                        r11 = r12;
                    }
                    r11 = r10;
                    z10 = z10;
                }
            }
            eventType = xmlResourceParser.next();
            r10 = r11;
            i10 = 2;
            z10 = z10;
            z11 = z11;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i10, Menu menu) {
        if (!(menu instanceof l)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z10 = false;
        try {
            try {
                layout = this.f22170c.getResources().getLayout(i10);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof l) {
                    l lVar = (l) menu;
                    if (!lVar.f22644p) {
                        lVar.w();
                        z10 = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z10) {
                    ((l) menu).v();
                }
                layout.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e4) {
                throw new InflateException("Error inflating menu XML", e4);
            }
        } catch (Throwable th) {
            if (z10) {
                ((l) menu).v();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
