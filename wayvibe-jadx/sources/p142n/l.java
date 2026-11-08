package p142n;

import C1.b;
import K1.U;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import com.revenuecat.purchases.common.events.BackendEvent;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p254y1.a;

/* JADX INFO: loaded from: classes.dex */
public class l implements Menu {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f22629y = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f22631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f22632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f22633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f22634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f22635f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f22636g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f22637h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f22638i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f22639j;
    public boolean k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CharSequence f22641m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Drawable f22642n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f22643o;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public n f22649v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f22651x;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f22640l = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f22644p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f22645q = false;
    public boolean r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f22646s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f22647t = new ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList f22648u = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f22650w = false;

    public l(Context context) {
        boolean zQ;
        boolean z10 = false;
        this.f22630a = context;
        Resources resources = context.getResources();
        this.f22631b = resources;
        this.f22635f = new ArrayList();
        this.f22636g = new ArrayList();
        this.f22637h = true;
        this.f22638i = new ArrayList();
        this.f22639j = new ArrayList();
        this.k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = U.f7256a;
            if (Build.VERSION.SDK_INT >= 28) {
                zQ = b.q(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", BackendEvent.Workflows.Context.WORKFLOW_CONTEXT_PLATFORM);
                zQ = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zQ) {
                z10 = true;
            }
        }
        this.f22633d = z10;
    }

    public final n a(int i10, int i11, int i12, CharSequence charSequence) {
        int i13;
        int i14 = ((-65536) & i12) >> 16;
        if (i14 < 0 || i14 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i15 = (f22629y[i14] << 16) | (65535 & i12);
        n nVar = new n(this, i10, i11, i12, i15, charSequence, this.f22640l);
        ArrayList arrayList = this.f22635f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((n) arrayList.get(size)).f22661d <= i15) {
                i13 = size + 1;
                arrayList.add(i13, nVar);
                p(true);
                return nVar;
            }
        }
        i13 = 0;
        arrayList.add(i13, nVar);
        p(true);
        return nVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f22630a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            n nVarA = a(i10, i11, i12, resolveInfo.loadLabel(packageManager));
            nVarA.setIcon(resolveInfo.loadIcon(packageManager));
            nVarA.f22664g = intent2;
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = nVarA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(x xVar, Context context) {
        this.f22648u.add(new WeakReference(xVar));
        xVar.c(context, this);
        this.k = true;
    }

    public final void c(boolean z10) {
        if (this.f22646s) {
            return;
        }
        this.f22646s = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f22648u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                xVar.a(this, z10);
            }
        }
        this.f22646s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        n nVar = this.f22649v;
        if (nVar != null) {
            d(nVar);
        }
        this.f22635f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f22642n = null;
        this.f22641m = null;
        this.f22643o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(n nVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f22648u;
        boolean zK = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f22649v == nVar) {
            w();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                x xVar = (x) weakReference.get();
                if (xVar != null) {
                    zK = xVar.k(nVar);
                    if (zK) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            v();
            if (zK) {
                this.f22649v = null;
            }
        }
        return zK;
    }

    public boolean e(l lVar, MenuItem menuItem) {
        j jVar = this.f22634e;
        return jVar != null && jVar.e(lVar, menuItem);
    }

    public boolean f(n nVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f22648u;
        boolean zI = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            x xVar = (x) weakReference.get();
            if (xVar != null) {
                zI = xVar.i(nVar);
                if (zI) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        v();
        if (zI) {
            this.f22649v = nVar;
        }
        return zI;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i10) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f22635f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            n nVar = (n) arrayList.get(i11);
            if (nVar.f22658a == i10) {
                return nVar;
            }
            if (nVar.hasSubMenu() && (menuItemFindItem = nVar.f22671o.findItem(i10)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final n g(int i10, KeyEvent keyEvent) {
        ArrayList arrayList = this.f22647t;
        arrayList.clear();
        h(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (n) arrayList.get(0);
        }
        boolean zN = n();
        for (int i11 = 0; i11 < size; i11++) {
            n nVar = (n) arrayList.get(i11);
            char c3 = zN ? nVar.f22667j : nVar.f22665h;
            char[] cArr = keyData.meta;
            if ((c3 == cArr[0] && (metaState & 2) == 0) || ((c3 == cArr[2] && (metaState & 2) != 0) || (zN && c3 == '\b' && i10 == 67))) {
                return nVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i10) {
        return (MenuItem) this.f22635f.get(i10);
    }

    public final void h(ArrayList arrayList, int i10, KeyEvent keyEvent) {
        boolean zN = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            ArrayList arrayList2 = this.f22635f;
            int size = arrayList2.size();
            for (int i11 = 0; i11 < size; i11++) {
                n nVar = (n) arrayList2.get(i11);
                if (nVar.hasSubMenu()) {
                    nVar.f22671o.h(arrayList, i10, keyEvent);
                }
                char c3 = zN ? nVar.f22667j : nVar.f22665h;
                if ((modifiers & 69647) == ((zN ? nVar.k : nVar.f22666i) & 69647) && c3 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c3 == cArr[0] || c3 == cArr[2] || (zN && c3 == '\b' && i10 == 67)) && nVar.isEnabled()) {
                        arrayList.add(nVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f22651x) {
            return true;
        }
        ArrayList arrayList = this.f22635f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((n) arrayList.get(i10)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList arrayListL = l();
        if (this.k) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f22648u;
            boolean zE = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                x xVar = (x) weakReference.get();
                if (xVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zE |= xVar.e();
                }
            }
            ArrayList arrayList = this.f22638i;
            ArrayList arrayList2 = this.f22639j;
            if (zE) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListL.size();
                for (int i10 = 0; i10 < size; i10++) {
                    n nVar = (n) arrayListL.get(i10);
                    if ((nVar.f22679x & 32) == 32) {
                        arrayList.add(nVar);
                    } else {
                        arrayList2.add(nVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return g(i10, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList l() {
        boolean z10 = this.f22637h;
        ArrayList arrayList = this.f22636g;
        if (!z10) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f22635f;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = (n) arrayList2.get(i10);
            if (nVar.isVisible()) {
                arrayList.add(nVar);
            }
        }
        this.f22637h = false;
        this.k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f22650w;
    }

    public boolean n() {
        return this.f22632c;
    }

    public boolean o() {
        return this.f22633d;
    }

    public final void p(boolean z10) {
        if (this.f22644p) {
            this.f22645q = true;
            if (z10) {
                this.r = true;
                return;
            }
            return;
        }
        if (z10) {
            this.f22637h = true;
            this.k = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f22648u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                xVar.g();
            }
        }
        v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i10, int i11) {
        return q(findItem(i10), null, i11);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        n nVarG = g(i10, keyEvent);
        boolean zQ = nVarG != null ? q(nVarG, null, i11) : false;
        if ((i11 & 2) != 0) {
            c(true);
        }
        return zQ;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0018  */
    /* JADX WARN: Code duplicated, block: B:32:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00ae A[SYNTHETIC] */
    public final boolean q(MenuItem menuItem, x xVar, int i10) {
        o oVar;
        boolean zExpandActionView;
        o oVar2;
        boolean z10;
        D d10;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList;
        x xVar2;
        n nVar = (n) menuItem;
        boolean zD = false;
        if (nVar == null || !nVar.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = nVar.f22672p;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(nVar)) {
            l lVar = nVar.f22670n;
            if (lVar.e(lVar, nVar)) {
                zExpandActionView = true;
            } else {
                Intent intent = nVar.f22664g;
                if (intent != null) {
                    try {
                        lVar.f22630a.startActivity(intent);
                    } catch (ActivityNotFoundException e2) {
                        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e2);
                        oVar = nVar.f22655A;
                        if (oVar == null) {
                        }
                        zExpandActionView = false;
                        oVar2 = nVar.f22655A;
                        if (oVar2 == null) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        if (nVar.e()) {
                            zExpandActionView |= nVar.expandActionView();
                            if (zExpandActionView) {
                                c(true);
                            }
                        } else if (nVar.hasSubMenu()) {
                            if ((i10 & 4) == 0) {
                                c(false);
                            }
                            if (!nVar.hasSubMenu()) {
                                D d11 = new D(this.f22630a, this, nVar);
                                nVar.f22671o = d11;
                                d11.setHeaderTitle(nVar.f22662e);
                            }
                            d10 = nVar.f22671o;
                            if (z10) {
                                s sVar = oVar2.f22684c;
                                oVar2.f22683b.onPrepareSubMenu(d10);
                            }
                            copyOnWriteArrayList = this.f22648u;
                            if (!copyOnWriteArrayList.isEmpty()) {
                                if (xVar != null) {
                                }
                                for (WeakReference weakReference : copyOnWriteArrayList) {
                                    xVar2 = (x) weakReference.get();
                                    if (xVar2 == null) {
                                        copyOnWriteArrayList.remove(weakReference);
                                    } else if (!zD) {
                                        zD = xVar2.d(d10);
                                    }
                                }
                            }
                            zExpandActionView |= zD;
                            if (!zExpandActionView) {
                                c(true);
                            }
                        } else {
                            if ((i10 & 4) == 0) {
                                c(false);
                            }
                            if (!nVar.hasSubMenu()) {
                                D d12 = new D(this.f22630a, this, nVar);
                                nVar.f22671o = d12;
                                d12.setHeaderTitle(nVar.f22662e);
                            }
                            d10 = nVar.f22671o;
                            if (z10) {
                                s sVar2 = oVar2.f22684c;
                                oVar2.f22683b.onPrepareSubMenu(d10);
                            }
                            copyOnWriteArrayList = this.f22648u;
                            if (!copyOnWriteArrayList.isEmpty()) {
                                zD = xVar != null ? xVar.d(d10) : false;
                                while (r8.hasNext()) {
                                    xVar2 = (x) weakReference.get();
                                    if (xVar2 == null) {
                                        copyOnWriteArrayList.remove(weakReference);
                                    } else if (!zD) {
                                        zD = xVar2.d(d10);
                                    }
                                }
                            }
                            zExpandActionView |= zD;
                            if (!zExpandActionView) {
                                c(true);
                            }
                        }
                        return zExpandActionView;
                    }
                    zExpandActionView = true;
                } else {
                    oVar = nVar.f22655A;
                    if (oVar == null && oVar.f22683b.onPerformDefaultAction()) {
                        zExpandActionView = true;
                    } else {
                        zExpandActionView = false;
                    }
                }
            }
        } else {
            zExpandActionView = true;
        }
        oVar2 = nVar.f22655A;
        if (oVar2 == null && oVar2.f22683b.hasSubMenu()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (nVar.e()) {
            zExpandActionView |= nVar.expandActionView();
            if (zExpandActionView) {
                c(true);
            }
        } else if (nVar.hasSubMenu() || z10) {
            if ((i10 & 4) == 0) {
                c(false);
            }
            if (!nVar.hasSubMenu()) {
                D d13 = new D(this.f22630a, this, nVar);
                nVar.f22671o = d13;
                d13.setHeaderTitle(nVar.f22662e);
            }
            d10 = nVar.f22671o;
            if (z10) {
                s sVar3 = oVar2.f22684c;
                oVar2.f22683b.onPrepareSubMenu(d10);
            }
            copyOnWriteArrayList = this.f22648u;
            if (!copyOnWriteArrayList.isEmpty()) {
                if (xVar != null) {
                }
                while (r8.hasNext()) {
                    xVar2 = (x) weakReference.get();
                    if (xVar2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zD) {
                        zD = xVar2.d(d10);
                    }
                }
            }
            zExpandActionView |= zD;
            if (!zExpandActionView) {
                c(true);
            }
        } else if ((i10 & 1) == 0) {
            c(true);
        }
        return zExpandActionView;
    }

    public final void r(x xVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f22648u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            x xVar2 = (x) weakReference.get();
            if (xVar2 == null || xVar2 == xVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i10) {
        ArrayList arrayList = this.f22635f;
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                i12 = -1;
                break;
            } else if (((n) arrayList.get(i12)).f22659b == i10) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 >= 0) {
            int size2 = arrayList.size() - i12;
            while (true) {
                int i13 = i11 + 1;
                if (i11 >= size2 || ((n) arrayList.get(i12)).f22659b != i10) {
                    break;
                }
                if (i12 >= 0) {
                    ArrayList arrayList2 = this.f22635f;
                    if (i12 < arrayList2.size()) {
                        arrayList2.remove(i12);
                    }
                }
                i11 = i13;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i10) {
        ArrayList arrayList = this.f22635f;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (((n) arrayList.get(i11)).f22658a == i10) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 >= 0) {
            ArrayList arrayList2 = this.f22635f;
            if (i11 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i11);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f22635f.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((D) item.getSubMenu()).s(bundle);
            }
        }
        int i11 = bundle.getInt("android:menu:expandedactionview");
        if (i11 <= 0 || (menuItemFindItem = findItem(i11)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i10, boolean z10, boolean z11) {
        ArrayList arrayList = this.f22635f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            n nVar = (n) arrayList.get(i11);
            if (nVar.f22659b == i10) {
                nVar.f22679x = (nVar.f22679x & (-5)) | (z11 ? 4 : 0);
                nVar.setCheckable(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f22650w = z10;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i10, boolean z10) {
        ArrayList arrayList = this.f22635f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            n nVar = (n) arrayList.get(i11);
            if (nVar.f22659b == i10) {
                nVar.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i10, boolean z10) {
        ArrayList arrayList = this.f22635f;
        int size = arrayList.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            n nVar = (n) arrayList.get(i11);
            if (nVar.f22659b == i10) {
                int i12 = nVar.f22679x;
                int i13 = (i12 & (-9)) | (z10 ? 0 : 8);
                nVar.f22679x = i13;
                if (i12 != i13) {
                    z11 = true;
                }
            }
        }
        if (z11) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f22632c = z10;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f22635f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f22635f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((D) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        if (view != null) {
            this.f22643o = view;
            this.f22641m = null;
            this.f22642n = null;
        } else {
            if (i10 > 0) {
                this.f22641m = this.f22631b.getText(i10);
            } else if (charSequence != null) {
                this.f22641m = charSequence;
            }
            if (i11 > 0) {
                this.f22642n = a.getDrawable(this.f22630a, i11);
            } else if (drawable != null) {
                this.f22642n = drawable;
            }
            this.f22643o = null;
        }
        p(false);
    }

    public final void v() {
        this.f22644p = false;
        if (this.f22645q) {
            this.f22645q = false;
            p(this.r);
        }
    }

    public final void w() {
        if (this.f22644p) {
            return;
        }
        this.f22644p = true;
        this.f22645q = false;
        this.r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10) {
        return a(0, 0, 0, this.f22631b.getString(i10));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f22631b.getString(i10));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        n nVarA = a(i10, i11, i12, charSequence);
        D d10 = new D(this.f22630a, this, nVarA);
        nVarA.f22671o = d10;
        d10.setHeaderTitle(nVarA.f22662e);
        return d10;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f22631b.getString(i13));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f22631b.getString(i13));
    }

    public l k() {
        return this;
    }
}
