package androidx.constraintlayout.widget;

import D7.p1;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.revenuecat.purchases.ui.revenuecatui.composables.BackgroundUIConstants;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import com.revenuecat.purchases.utils.PurchaseParamsValidator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.apache.tika.utils.XMLReaderUtils;
import p192s1.c;
import p201t1.b;
import p201t1.e;
import p201t1.h;
import p201t1.j;
import p201t1.k;
import p201t1.m;
import p201t1.n;
import p201t1.o;
import p201t1.p;
import p211u1.a;
import p211u1.d;
import p211u1.f;
import p211u1.g;
import p211u1.i;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f14851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f14852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f14853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f14854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14856f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14857g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f14858h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f14859i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f14860j;
    public f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f14861l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public HashMap f14862m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f14863n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f14864o;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        SparseArray sparseArray = new SparseArray();
        this.f14851a = sparseArray;
        this.f14852b = new ArrayList(4);
        this.f14853c = new ArrayList(100);
        j jVar = new j();
        jVar.f26638i0 = new ArrayList();
        jVar.f26639j0 = false;
        jVar.f26640k0 = new c();
        jVar.f26642m0 = 0;
        jVar.f26643n0 = 0;
        jVar.f26644o0 = new b[4];
        jVar.f26645p0 = new b[4];
        jVar.f26646q0 = new ArrayList();
        jVar.f26647r0 = false;
        jVar.f26648s0 = false;
        jVar.f26649t0 = false;
        jVar.f26650u0 = 0;
        jVar.f26651v0 = 0;
        jVar.f26652w0 = 7;
        jVar.f26653x0 = false;
        jVar.f26654y0 = false;
        jVar.f26655z0 = false;
        this.f14854d = jVar;
        this.f14855e = 0;
        this.f14856f = 0;
        this.f14857g = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.f14858h = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.f14859i = true;
        this.f14860j = 7;
        this.k = null;
        this.f14861l = -1;
        this.f14862m = new HashMap();
        this.f14863n = -1;
        this.f14864o = -1;
        jVar.f26603X = this;
        sparseArray.put(getId(), this);
        this.k = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f27163a);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 3) {
                    this.f14855e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f14855e);
                } else if (index == 4) {
                    this.f14856f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f14856f);
                } else if (index == 1) {
                    this.f14857g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f14857g);
                } else if (index == 2) {
                    this.f14858h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f14858h);
                } else if (index == 59) {
                    this.f14860j = typedArrayObtainStyledAttributes.getInt(index, this.f14860j);
                } else if (index == 8) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        f fVar = new f();
                        fVar.f27162a = new HashMap();
                        this.k = fVar;
                        fVar.c(getContext(), resourceId);
                    } catch (Resources.NotFoundException unused) {
                        this.k = null;
                    }
                    this.f14861l = resourceId;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        jVar.f26652w0 = this.f14860j;
    }

    public static d a() {
        d dVar = new d(-2, -2);
        dVar.f27058a = -1;
        dVar.f27060b = -1;
        dVar.f27062c = -1.0f;
        dVar.f27064d = -1;
        dVar.f27066e = -1;
        dVar.f27068f = -1;
        dVar.f27070g = -1;
        dVar.f27072h = -1;
        dVar.f27074i = -1;
        dVar.f27076j = -1;
        dVar.k = -1;
        dVar.f27078l = -1;
        dVar.f27079m = -1;
        dVar.f27080n = 0;
        dVar.f27081o = 0.0f;
        dVar.f27082p = -1;
        dVar.f27083q = -1;
        dVar.r = -1;
        dVar.f27084s = -1;
        dVar.f27085t = -1;
        dVar.f27086u = -1;
        dVar.f27087v = -1;
        dVar.f27088w = -1;
        dVar.f27089x = -1;
        dVar.f27090y = -1;
        dVar.f27091z = 0.5f;
        dVar.f27032A = 0.5f;
        dVar.f27033B = null;
        dVar.f27034C = 1;
        dVar.f27035D = -1.0f;
        dVar.f27036E = -1.0f;
        dVar.f27037F = 0;
        dVar.f27038G = 0;
        dVar.f27039H = 0;
        dVar.f27040I = 0;
        dVar.f27041J = 0;
        dVar.f27042K = 0;
        dVar.f27043L = 0;
        dVar.f27044M = 0;
        dVar.f27045N = 1.0f;
        dVar.f27046O = 1.0f;
        dVar.f27047P = -1;
        dVar.f27048Q = -1;
        dVar.f27049R = -1;
        dVar.f27050S = false;
        dVar.f27051T = false;
        dVar.f27052U = true;
        dVar.f27053V = true;
        dVar.f27054W = false;
        dVar.f27055X = false;
        dVar.f27056Y = false;
        dVar.f27057Z = -1;
        dVar.f27059a0 = -1;
        dVar.f27061b0 = -1;
        dVar.f27063c0 = -1;
        dVar.f27065d0 = -1;
        dVar.f27067e0 = -1;
        dVar.f27069f0 = 0.5f;
        dVar.f27077j0 = new p201t1.i();
        return dVar;
    }

    public final p201t1.i b(int i10) {
        j jVar = this.f14854d;
        if (i10 == 0) {
            return jVar;
        }
        View viewFindViewById = (View) this.f14851a.get(i10);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i10)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return jVar;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((d) viewFindViewById.getLayoutParams()).f27077j0;
    }

    public final p201t1.i c(View view) {
        if (view == this) {
            return this.f14854d;
        }
        if (view == null) {
            return null;
        }
        return ((d) view.getLayoutParams()).f27077j0;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:117:0x0201  */
    /* JADX WARN: Code duplicated, block: B:133:0x023d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0247  */
    /* JADX WARN: Code duplicated, block: B:136:0x024b  */
    /* JADX WARN: Code duplicated, block: B:137:0x0252 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x0254  */
    /* JADX WARN: Code duplicated, block: B:139:0x0257  */
    /* JADX WARN: Code duplicated, block: B:143:0x0270  */
    /* JADX WARN: Code duplicated, block: B:145:0x0274  */
    /* JADX WARN: Code duplicated, block: B:148:0x0279  */
    /* JADX WARN: Code duplicated, block: B:149:0x0281  */
    /* JADX WARN: Code duplicated, block: B:151:0x0289  */
    /* JADX WARN: Code duplicated, block: B:152:0x0291  */
    /* JADX WARN: Code duplicated, block: B:155:0x029b  */
    /* JADX WARN: Code duplicated, block: B:157:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:173:0x02a4 A[SYNTHETIC] */
    public final void d(int i10, int i11) {
        int i12;
        byte b10;
        byte b11;
        boolean z10;
        boolean z11;
        int childMeasureSpec;
        boolean z12;
        boolean z13;
        int childMeasureSpec2;
        int measuredWidth;
        int measuredHeight;
        int baseline;
        int baseline2;
        ConstraintLayout constraintLayout = this;
        int paddingBottom = constraintLayout.getPaddingBottom() + constraintLayout.getPaddingTop();
        int paddingRight = constraintLayout.getPaddingRight() + constraintLayout.getPaddingLeft();
        int childCount = constraintLayout.getChildCount();
        int i13 = 0;
        while (true) {
            i12 = 8;
            b10 = -1;
            b11 = -2;
            if (i13 >= childCount) {
                break;
            }
            View childAt = constraintLayout.getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                p201t1.i iVar = dVar.f27077j0;
                if (!dVar.f27055X && !dVar.f27056Y) {
                    iVar.f26604Y = childAt.getVisibility();
                    int i14 = ((ViewGroup.MarginLayoutParams) dVar).width;
                    int i15 = ((ViewGroup.MarginLayoutParams) dVar).height;
                    if (i14 == 0 || i15 == 0) {
                        iVar.j().c();
                        iVar.i().c();
                    } else {
                        boolean z14 = i14 == -2;
                        int childMeasureSpec3 = ViewGroup.getChildMeasureSpec(i10, paddingRight, i14);
                        boolean z15 = i15 == -2;
                        childAt.measure(childMeasureSpec3, ViewGroup.getChildMeasureSpec(i11, paddingBottom, i15));
                        int measuredWidth2 = childAt.getMeasuredWidth();
                        int measuredHeight2 = childAt.getMeasuredHeight();
                        iVar.x(measuredWidth2);
                        iVar.s(measuredHeight2);
                        if (z14) {
                            iVar.f26599T = measuredWidth2;
                        }
                        if (z15) {
                            iVar.f26600U = measuredHeight2;
                        }
                        if (dVar.f27054W && (baseline2 = childAt.getBaseline()) != -1) {
                            iVar.f26596Q = baseline2;
                        }
                        if (dVar.f27052U && dVar.f27053V) {
                            iVar.j().g(measuredWidth2);
                            iVar.i().g(measuredHeight2);
                        }
                    }
                }
            }
            i13++;
        }
        j jVar = constraintLayout.f14854d;
        jVar.E();
        int i16 = 0;
        while (i16 < childCount) {
            View childAt2 = constraintLayout.getChildAt(i16);
            if (childAt2.getVisibility() != i12) {
                d dVar2 = (d) childAt2.getLayoutParams();
                p201t1.i iVar2 = dVar2.f27077j0;
                if (!dVar2.f27055X && !dVar2.f27056Y) {
                    iVar2.f26604Y = childAt2.getVisibility();
                    int i17 = ((ViewGroup.MarginLayoutParams) dVar2).width;
                    int i18 = ((ViewGroup.MarginLayoutParams) dVar2).height;
                    if (i17 == 0 || i18 == 0) {
                        e eVar = e.LEFT;
                        o oVar = iVar2.f(eVar).f26569a;
                        e eVar2 = e.RIGHT;
                        o oVar2 = iVar2.f(eVar2).f26569a;
                        boolean z16 = (iVar2.f(eVar).f26572d == null || iVar2.f(eVar2).f26572d == null) ? false : true;
                        e eVar3 = e.TOP;
                        childCount = childCount;
                        o oVar3 = iVar2.f(eVar3).f26569a;
                        boolean z17 = z16;
                        e eVar4 = e.BOTTOM;
                        i16 = i16;
                        o oVar4 = iVar2.f(eVar4).f26569a;
                        boolean z18 = (iVar2.f(eVar3).f26572d == null || iVar2.f(eVar4).f26572d == null) ? false : true;
                        if (i17 == 0 && i18 == 0 && z17 && z18) {
                            jVar = jVar;
                            b11 = -2;
                        } else {
                            h[] hVarArr = jVar.f26582C;
                            jVar = jVar;
                            h hVar = hVarArr[0];
                            boolean z19 = z18;
                            h hVar2 = h.WRAP_CONTENT;
                            boolean z20 = hVar != hVar2;
                            boolean z21 = hVarArr[1] != hVar2;
                            if (!z20) {
                                iVar2.j().c();
                            }
                            if (!z21) {
                                iVar2.i().c();
                            }
                            h[] hVarArr2 = iVar2.f26582C;
                            if (i17 == 0) {
                                if (z20 && iVar2.f26614e == 0 && iVar2.f26586G == 0.0f && iVar2.f26620h == 0 && iVar2.f26622i == 0) {
                                    z10 = z20;
                                    if (hVarArr2[0] == h.MATCH_CONSTRAINT && z17 && oVar.d() && oVar2.d()) {
                                        int i19 = (int) (oVar2.f26676g - oVar.f26676g);
                                        iVar2.j().g(i19);
                                        childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, paddingRight, i19);
                                    }
                                    if (i18 == 0) {
                                        b11 = -2;
                                        if (i18 == -1) {
                                            childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, paddingBottom, -1);
                                            z13 = false;
                                        } else {
                                            if (i18 == -2) {
                                                z13 = true;
                                            } else {
                                                z13 = false;
                                            }
                                            childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, paddingBottom, i18);
                                        }
                                    } else if (!z21 && iVar2.f26616f == 0 && iVar2.f26586G == 0.0f && iVar2.k == 0 && iVar2.f26624l == 0 && hVarArr2[1] == h.MATCH_CONSTRAINT && z19 && oVar3.d() && oVar4.d()) {
                                        int i20 = (int) (oVar4.f26676g - oVar3.f26676g);
                                        iVar2.i().g(i20);
                                        childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, paddingBottom, i20);
                                        z13 = false;
                                        b11 = -2;
                                    } else {
                                        b11 = -2;
                                        childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, paddingBottom, -2);
                                        z21 = false;
                                        z13 = true;
                                    }
                                    childAt2.measure(childMeasureSpec, childMeasureSpec2);
                                    measuredWidth = childAt2.getMeasuredWidth();
                                    measuredHeight = childAt2.getMeasuredHeight();
                                    iVar2.x(measuredWidth);
                                    iVar2.s(measuredHeight);
                                    if (z11) {
                                        iVar2.f26599T = measuredWidth;
                                    }
                                    if (z13) {
                                        iVar2.f26600U = measuredHeight;
                                    }
                                    if (z12) {
                                        iVar2.j().g(measuredWidth);
                                    } else {
                                        iVar2.j().f26683b = 2;
                                    }
                                    if (z21) {
                                        iVar2.i().g(measuredHeight);
                                    } else {
                                        iVar2.i().f26683b = 2;
                                    }
                                    if (dVar2.f27054W) {
                                        baseline = childAt2.getBaseline();
                                        b10 = -1;
                                        if (baseline != -1) {
                                            iVar2.f26596Q = baseline;
                                        }
                                    }
                                }
                                childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, paddingRight, -2);
                                z12 = false;
                                z11 = true;
                                if (i18 == 0) {
                                    b11 = -2;
                                    if (i18 == -1) {
                                        childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, paddingBottom, -1);
                                        z13 = false;
                                    } else {
                                        if (i18 == -2) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, paddingBottom, i18);
                                    }
                                } else if (!z21) {
                                    b11 = -2;
                                    childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, paddingBottom, -2);
                                    z21 = false;
                                    z13 = true;
                                } else {
                                    b11 = -2;
                                    childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, paddingBottom, -2);
                                    z21 = false;
                                    z13 = true;
                                }
                                childAt2.measure(childMeasureSpec, childMeasureSpec2);
                                measuredWidth = childAt2.getMeasuredWidth();
                                measuredHeight = childAt2.getMeasuredHeight();
                                iVar2.x(measuredWidth);
                                iVar2.s(measuredHeight);
                                if (z11) {
                                    iVar2.f26599T = measuredWidth;
                                }
                                if (z13) {
                                    iVar2.f26600U = measuredHeight;
                                }
                                if (z12) {
                                    iVar2.j().g(measuredWidth);
                                } else {
                                    iVar2.j().f26683b = 2;
                                }
                                if (z21) {
                                    iVar2.i().g(measuredHeight);
                                } else {
                                    iVar2.i().f26683b = 2;
                                }
                                if (dVar2.f27054W) {
                                    baseline = childAt2.getBaseline();
                                    b10 = -1;
                                    if (baseline != -1) {
                                        iVar2.f26596Q = baseline;
                                    }
                                }
                            } else {
                                z10 = z20;
                                if (i17 == -1) {
                                    childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, paddingRight, -1);
                                } else {
                                    boolean z22 = i17 == -2;
                                    int childMeasureSpec4 = ViewGroup.getChildMeasureSpec(i10, paddingRight, i17);
                                    z11 = z22;
                                    childMeasureSpec = childMeasureSpec4;
                                }
                                z12 = z10;
                                if (i18 == 0) {
                                    b11 = -2;
                                    if (i18 == -1) {
                                        childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, paddingBottom, -1);
                                        z13 = false;
                                    } else {
                                        if (i18 == -2) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, paddingBottom, i18);
                                    }
                                } else if (!z21) {
                                    b11 = -2;
                                    childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, paddingBottom, -2);
                                    z21 = false;
                                    z13 = true;
                                } else {
                                    b11 = -2;
                                    childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, paddingBottom, -2);
                                    z21 = false;
                                    z13 = true;
                                }
                                childAt2.measure(childMeasureSpec, childMeasureSpec2);
                                measuredWidth = childAt2.getMeasuredWidth();
                                measuredHeight = childAt2.getMeasuredHeight();
                                iVar2.x(measuredWidth);
                                iVar2.s(measuredHeight);
                                if (z11) {
                                    iVar2.f26599T = measuredWidth;
                                }
                                if (z13) {
                                    iVar2.f26600U = measuredHeight;
                                }
                                if (z12) {
                                    iVar2.j().g(measuredWidth);
                                } else {
                                    iVar2.j().f26683b = 2;
                                }
                                if (z21) {
                                    iVar2.i().g(measuredHeight);
                                } else {
                                    iVar2.i().f26683b = 2;
                                }
                                if (dVar2.f27054W) {
                                    baseline = childAt2.getBaseline();
                                    b10 = -1;
                                    if (baseline != -1) {
                                        iVar2.f26596Q = baseline;
                                    }
                                }
                            }
                            z11 = false;
                            z12 = z10;
                            if (i18 == 0) {
                                b11 = -2;
                                if (i18 == -1) {
                                    childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, paddingBottom, -1);
                                    z13 = false;
                                } else {
                                    if (i18 == -2) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, paddingBottom, i18);
                                }
                            } else if (!z21) {
                                b11 = -2;
                                childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, paddingBottom, -2);
                                z21 = false;
                                z13 = true;
                            } else {
                                b11 = -2;
                                childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, paddingBottom, -2);
                                z21 = false;
                                z13 = true;
                            }
                            childAt2.measure(childMeasureSpec, childMeasureSpec2);
                            measuredWidth = childAt2.getMeasuredWidth();
                            measuredHeight = childAt2.getMeasuredHeight();
                            iVar2.x(measuredWidth);
                            iVar2.s(measuredHeight);
                            if (z11) {
                                iVar2.f26599T = measuredWidth;
                            }
                            if (z13) {
                                iVar2.f26600U = measuredHeight;
                            }
                            if (z12) {
                                iVar2.j().g(measuredWidth);
                            } else {
                                iVar2.j().f26683b = 2;
                            }
                            if (z21) {
                                iVar2.i().g(measuredHeight);
                            } else {
                                iVar2.i().f26683b = 2;
                            }
                            if (dVar2.f27054W) {
                                baseline = childAt2.getBaseline();
                                b10 = -1;
                                if (baseline != -1) {
                                    iVar2.f26596Q = baseline;
                                }
                            }
                        }
                        b10 = -1;
                    } else {
                        childCount = childCount;
                        jVar = jVar;
                        b10 = b10;
                        b11 = b11;
                        i16 = i16;
                    }
                }
                i16++;
                constraintLayout = this;
                b11 = b11;
                b10 = b10;
                childCount = childCount;
                jVar = jVar;
                i12 = 8;
            }
            i16++;
            constraintLayout = this;
            b11 = b11;
            b10 = b10;
            childCount = childCount;
            jVar = jVar;
            i12 = 8;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(com.amazon.a.a.o.b.f.f16451a);
                    if (strArrSplit.length == 4) {
                        int i11 = Integer.parseInt(strArrSplit[0]);
                        int i12 = Integer.parseInt(strArrSplit[1]);
                        int i13 = Integer.parseInt(strArrSplit[2]);
                        int i14 = (int) ((i11 / 1080.0f) * width);
                        int i15 = (int) ((i12 / 1920.0f) * height);
                        int i16 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = i14;
                        float f11 = i15;
                        float f12 = i14 + ((int) ((i13 / 1080.0f) * width));
                        canvas.drawLine(f10, f11, f12, f11, paint);
                        float f13 = i15 + i16;
                        canvas.drawLine(f12, f11, f12, f13, paint);
                        canvas.drawLine(f12, f13, f10, f13, paint);
                        canvas.drawLine(f10, f13, f10, f11, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f10, f11, f12, f13, paint);
                        canvas.drawLine(f10, f13, f12, f11, paint);
                    }
                }
            }
        }
    }

    public final void e(Integer num, String str) {
        if (str != null) {
            if (this.f14862m == null) {
                this.f14862m = new HashMap();
            }
            int iIndexOf = str.indexOf("/");
            if (iIndexOf != -1) {
                str = str.substring(iIndexOf + 1);
            }
            this.f14862m.put(str, num);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return a();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        int i10;
        Context context = getContext();
        d dVar = new d(context, attributeSet);
        dVar.f27058a = -1;
        dVar.f27060b = -1;
        dVar.f27062c = -1.0f;
        dVar.f27064d = -1;
        dVar.f27066e = -1;
        dVar.f27068f = -1;
        dVar.f27070g = -1;
        dVar.f27072h = -1;
        dVar.f27074i = -1;
        dVar.f27076j = -1;
        dVar.k = -1;
        dVar.f27078l = -1;
        dVar.f27079m = -1;
        dVar.f27080n = 0;
        dVar.f27081o = 0.0f;
        dVar.f27082p = -1;
        dVar.f27083q = -1;
        dVar.r = -1;
        dVar.f27084s = -1;
        dVar.f27085t = -1;
        dVar.f27086u = -1;
        dVar.f27087v = -1;
        dVar.f27088w = -1;
        dVar.f27089x = -1;
        dVar.f27090y = -1;
        dVar.f27091z = 0.5f;
        dVar.f27032A = 0.5f;
        dVar.f27033B = null;
        dVar.f27034C = 1;
        dVar.f27035D = -1.0f;
        dVar.f27036E = -1.0f;
        dVar.f27037F = 0;
        dVar.f27038G = 0;
        dVar.f27039H = 0;
        dVar.f27040I = 0;
        dVar.f27041J = 0;
        dVar.f27042K = 0;
        dVar.f27043L = 0;
        dVar.f27044M = 0;
        dVar.f27045N = 1.0f;
        dVar.f27046O = 1.0f;
        dVar.f27047P = -1;
        dVar.f27048Q = -1;
        dVar.f27049R = -1;
        dVar.f27050S = false;
        dVar.f27051T = false;
        dVar.f27052U = true;
        dVar.f27053V = true;
        dVar.f27054W = false;
        dVar.f27055X = false;
        dVar.f27056Y = false;
        dVar.f27057Z = -1;
        dVar.f27059a0 = -1;
        dVar.f27061b0 = -1;
        dVar.f27063c0 = -1;
        dVar.f27065d0 = -1;
        dVar.f27067e0 = -1;
        dVar.f27069f0 = 0.5f;
        dVar.f27077j0 = new p201t1.i();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f27163a);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            int i12 = p211u1.c.f27031a.get(index);
            switch (i12) {
                case 1:
                    dVar.f27049R = typedArrayObtainStyledAttributes.getInt(index, dVar.f27049R);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f27079m);
                    dVar.f27079m = resourceId;
                    if (resourceId == -1) {
                        dVar.f27079m = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 3:
                    dVar.f27080n = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.f27080n);
                    break;
                case 4:
                    float f10 = typedArrayObtainStyledAttributes.getFloat(index, dVar.f27081o) % 360.0f;
                    dVar.f27081o = f10;
                    if (f10 < 0.0f) {
                        dVar.f27081o = (360.0f - f10) % 360.0f;
                    }
                    break;
                case 5:
                    dVar.f27058a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, dVar.f27058a);
                    break;
                case 6:
                    dVar.f27060b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, dVar.f27060b);
                    break;
                case 7:
                    dVar.f27062c = typedArrayObtainStyledAttributes.getFloat(index, dVar.f27062c);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f27064d);
                    dVar.f27064d = resourceId2;
                    if (resourceId2 == -1) {
                        dVar.f27064d = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f27066e);
                    dVar.f27066e = resourceId3;
                    if (resourceId3 == -1) {
                        dVar.f27066e = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f27068f);
                    dVar.f27068f = resourceId4;
                    if (resourceId4 == -1) {
                        dVar.f27068f = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f27070g);
                    dVar.f27070g = resourceId5;
                    if (resourceId5 == -1) {
                        dVar.f27070g = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f27072h);
                    dVar.f27072h = resourceId6;
                    if (resourceId6 == -1) {
                        dVar.f27072h = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f27074i);
                    dVar.f27074i = resourceId7;
                    if (resourceId7 == -1) {
                        dVar.f27074i = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f27076j);
                    dVar.f27076j = resourceId8;
                    if (resourceId8 == -1) {
                        dVar.f27076j = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.k);
                    dVar.k = resourceId9;
                    if (resourceId9 == -1) {
                        dVar.k = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f27078l);
                    dVar.f27078l = resourceId10;
                    if (resourceId10 == -1) {
                        dVar.f27078l = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f27082p);
                    dVar.f27082p = resourceId11;
                    if (resourceId11 == -1) {
                        dVar.f27082p = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f27083q);
                    dVar.f27083q = resourceId12;
                    if (resourceId12 == -1) {
                        dVar.f27083q = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.r);
                    dVar.r = resourceId13;
                    if (resourceId13 == -1) {
                        dVar.r = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f27084s);
                    dVar.f27084s = resourceId14;
                    if (resourceId14 == -1) {
                        dVar.f27084s = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 21:
                    dVar.f27085t = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.f27085t);
                    break;
                case 22:
                    dVar.f27086u = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.f27086u);
                    break;
                case 23:
                    dVar.f27087v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.f27087v);
                    break;
                case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                    dVar.f27088w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.f27088w);
                    break;
                case 25:
                    dVar.f27089x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.f27089x);
                    break;
                case 26:
                    dVar.f27090y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.f27090y);
                    break;
                case 27:
                    dVar.f27050S = typedArrayObtainStyledAttributes.getBoolean(index, dVar.f27050S);
                    break;
                case 28:
                    dVar.f27051T = typedArrayObtainStyledAttributes.getBoolean(index, dVar.f27051T);
                    break;
                case 29:
                    dVar.f27091z = typedArrayObtainStyledAttributes.getFloat(index, dVar.f27091z);
                    break;
                case 30:
                    dVar.f27032A = typedArrayObtainStyledAttributes.getFloat(index, dVar.f27032A);
                    break;
                case BackgroundUIConstants.minSDKVersionSupportingBlur /* 31 */:
                    int i13 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    dVar.f27039H = i13;
                    if (i13 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                    }
                    break;
                case com.amazon.c.a.a.c.f16581h /* 32 */:
                    int i14 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    dVar.f27040I = i14;
                    if (i14 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                    }
                    break;
                case 33:
                    try {
                        dVar.f27041J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.f27041J);
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, dVar.f27041J) == -2) {
                            dVar.f27041J = -2;
                        }
                    }
                    break;
                case 34:
                    try {
                        dVar.f27043L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.f27043L);
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, dVar.f27043L) == -2) {
                            dVar.f27043L = -2;
                        }
                    }
                    break;
                case 35:
                    dVar.f27045N = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, dVar.f27045N));
                    break;
                case 36:
                    try {
                        dVar.f27042K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.f27042K);
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, dVar.f27042K) == -2) {
                            dVar.f27042K = -2;
                        }
                    }
                    break;
                case 37:
                    try {
                        dVar.f27044M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.f27044M);
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, dVar.f27044M) == -2) {
                            dVar.f27044M = -2;
                        }
                    }
                    break;
                case 38:
                    dVar.f27046O = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, dVar.f27046O));
                    break;
                default:
                    switch (i12) {
                        case 44:
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            dVar.f27033B = string;
                            dVar.f27034C = -1;
                            if (string != null) {
                                int length = string.length();
                                int iIndexOf = dVar.f27033B.indexOf(44);
                                if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                                    i10 = 0;
                                } else {
                                    String strSubstring = dVar.f27033B.substring(0, iIndexOf);
                                    if (strSubstring.equalsIgnoreCase("W")) {
                                        dVar.f27034C = 0;
                                    } else if (strSubstring.equalsIgnoreCase("H")) {
                                        dVar.f27034C = 1;
                                    }
                                    i10 = iIndexOf + 1;
                                }
                                int iIndexOf2 = dVar.f27033B.indexOf(58);
                                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                                    String strSubstring2 = dVar.f27033B.substring(i10);
                                    if (strSubstring2.length() > 0) {
                                        Float.parseFloat(strSubstring2);
                                    }
                                } else {
                                    String strSubstring3 = dVar.f27033B.substring(i10, iIndexOf2);
                                    String strSubstring4 = dVar.f27033B.substring(iIndexOf2 + 1);
                                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                                        try {
                                            float f11 = Float.parseFloat(strSubstring3);
                                            float f12 = Float.parseFloat(strSubstring4);
                                            if (f11 > 0.0f && f12 > 0.0f) {
                                                if (dVar.f27034C == 1) {
                                                    Math.abs(f12 / f11);
                                                } else {
                                                    Math.abs(f11 / f12);
                                                }
                                            }
                                        } catch (NumberFormatException unused5) {
                                        }
                                    }
                                }
                            }
                            break;
                        case 45:
                            dVar.f27035D = typedArrayObtainStyledAttributes.getFloat(index, dVar.f27035D);
                            break;
                        case 46:
                            dVar.f27036E = typedArrayObtainStyledAttributes.getFloat(index, dVar.f27036E);
                            break;
                        case 47:
                            dVar.f27037F = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            dVar.f27038G = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS /* 49 */:
                            dVar.f27047P = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, dVar.f27047P);
                            break;
                        case 50:
                            dVar.f27048Q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, dVar.f27048Q);
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        dVar.a();
        return dVar;
    }

    public int getMaxHeight() {
        return this.f14858h;
    }

    public int getMaxWidth() {
        return this.f14857g;
    }

    public int getMinHeight() {
        return this.f14856f;
    }

    public int getMinWidth() {
        return this.f14855e;
    }

    public int getOptimizationLevel() {
        return this.f14854d.f26652w0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            d dVar = (d) childAt.getLayoutParams();
            p201t1.i iVar = dVar.f27077j0;
            if (childAt.getVisibility() != 8 || dVar.f27055X || dVar.f27056Y || zIsInEditMode) {
                int i15 = iVar.f26592M + iVar.f26594O;
                int i16 = iVar.f26593N + iVar.f26595P;
                childAt.layout(i15, i16, iVar.k() + i15, iVar.g() + i16);
            }
        }
        ArrayList arrayList = this.f14852b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i17 = 0; i17 < size; i17++) {
                ((p211u1.b) arrayList.get(i17)).getClass();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0293  */
    /* JADX WARN: Code duplicated, block: B:107:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:109:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:119:0x0314  */
    /* JADX WARN: Code duplicated, block: B:121:0x0332  */
    /* JADX WARN: Code duplicated, block: B:124:0x0345  */
    /* JADX WARN: Code duplicated, block: B:126:0x0348 A[LOOP:6: B:125:0x0346->B:126:0x0348, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:129:0x0357 A[LOOP:7: B:128:0x0355->B:129:0x0357, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:132:0x0360  */
    /* JADX WARN: Code duplicated, block: B:134:0x036a  */
    /* JADX WARN: Code duplicated, block: B:135:0x0370  */
    /* JADX WARN: Code duplicated, block: B:140:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:143:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:145:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:148:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:150:0x03e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:151:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:152:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:153:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:155:0x03f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:156:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:157:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:158:0x03ff A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:160:0x0409  */
    /* JADX WARN: Code duplicated, block: B:162:0x040e  */
    /* JADX WARN: Code duplicated, block: B:198:0x0471  */
    /* JADX WARN: Code duplicated, block: B:200:0x0477  */
    /* JADX WARN: Code duplicated, block: B:201:0x048c  */
    /* JADX WARN: Code duplicated, block: B:202:0x0490  */
    /* JADX WARN: Code duplicated, block: B:204:0x0494  */
    /* JADX WARN: Code duplicated, block: B:206:0x049a  */
    /* JADX WARN: Code duplicated, block: B:207:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:208:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:210:0x04af  */
    /* JADX WARN: Code duplicated, block: B:214:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:216:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:217:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:219:0x04da  */
    /* JADX WARN: Code duplicated, block: B:224:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:226:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:227:0x0505  */
    /* JADX WARN: Code duplicated, block: B:229:0x050a  */
    /* JADX WARN: Code duplicated, block: B:234:0x0524  */
    /* JADX WARN: Code duplicated, block: B:236:0x052a  */
    /* JADX WARN: Code duplicated, block: B:238:0x053c  */
    /* JADX WARN: Code duplicated, block: B:240:0x0541  */
    /* JADX WARN: Code duplicated, block: B:245:0x055c  */
    /* JADX WARN: Code duplicated, block: B:247:0x056c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:253:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:258:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:25:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:262:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:264:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:266:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:269:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:26:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:271:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:272:0x05f6  */
    /* JADX WARN: Code duplicated, block: B:273:0x0600  */
    /* JADX WARN: Code duplicated, block: B:276:0x060e  */
    /* JADX WARN: Code duplicated, block: B:278:0x0613  */
    /* JADX WARN: Code duplicated, block: B:279:0x062d  */
    /* JADX WARN: Code duplicated, block: B:280:0x0637  */
    /* JADX WARN: Code duplicated, block: B:283:0x0645  */
    /* JADX WARN: Code duplicated, block: B:285:0x064b  */
    /* JADX WARN: Code duplicated, block: B:286:0x0651  */
    /* JADX WARN: Code duplicated, block: B:288:0x065d  */
    /* JADX WARN: Code duplicated, block: B:298:0x067e  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:301:0x0688  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:316:0x06c5  */
    /* JADX WARN: Code duplicated, block: B:318:0x06cf A[Catch: NumberFormatException -> 0x06d4, TRY_ENTER, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x06d4, blocks: (B:307:0x06a2, B:313:0x06b7, B:314:0x06bd, B:318:0x06cf), top: B:634:0x06a2 }] */
    /* JADX WARN: Code duplicated, block: B:320:0x06d4  */
    /* JADX WARN: Code duplicated, block: B:323:0x06da  */
    /* JADX WARN: Code duplicated, block: B:326:0x070b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:330:0x0723 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:333:0x072d A[LOOP:0: B:34:0x00f2->B:333:0x072d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:336:0x074b  */
    /* JADX WARN: Code duplicated, block: B:339:0x075f  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:340:0x0761  */
    /* JADX WARN: Code duplicated, block: B:342:0x0764  */
    /* JADX WARN: Code duplicated, block: B:344:0x0770 A[LOOP:9: B:343:0x076e->B:344:0x0770, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:347:0x078d  */
    /* JADX WARN: Code duplicated, block: B:352:0x079a  */
    /* JADX WARN: Code duplicated, block: B:357:0x07ae  */
    /* JADX WARN: Code duplicated, block: B:359:0x07c7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:361:0x07d5  */
    /* JADX WARN: Code duplicated, block: B:363:0x07e1  */
    /* JADX WARN: Code duplicated, block: B:365:0x07ef  */
    /* JADX WARN: Code duplicated, block: B:376:0x0819 A[PHI: r33
  0x0819: PHI (r33v4 int) = (r33v5 int), (r33v6 int) binds: [B:378:0x0822, B:374:0x0815] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x010d  */
    /* JADX WARN: Code duplicated, block: B:407:0x0881  */
    /* JADX WARN: Code duplicated, block: B:409:0x0885  */
    /* JADX WARN: Code duplicated, block: B:412:0x088b  */
    /* JADX WARN: Code duplicated, block: B:418:0x08a9 A[LOOP:10: B:417:0x08a7->B:418:0x08a9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x0110  */
    /* JADX WARN: Code duplicated, block: B:421:0x08b5  */
    /* JADX WARN: Code duplicated, block: B:423:0x08b8 A[LOOP:11: B:422:0x08b6->B:423:0x08b8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:426:0x08ca A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:429:0x08d4  */
    /* JADX WARN: Code duplicated, block: B:430:0x08e7  */
    /* JADX WARN: Code duplicated, block: B:432:0x08fc  */
    /* JADX WARN: Code duplicated, block: B:433:0x08fe  */
    /* JADX WARN: Code duplicated, block: B:436:0x0903  */
    /* JADX WARN: Code duplicated, block: B:437:0x0905  */
    /* JADX WARN: Code duplicated, block: B:439:0x0908 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:442:0x090d  */
    /* JADX WARN: Code duplicated, block: B:446:0x091b A[LOOP:12: B:444:0x0915->B:446:0x091b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:450:0x0934  */
    /* JADX WARN: Code duplicated, block: B:458:0x0971 A[LOOP:14: B:456:0x096b->B:458:0x0971, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:460:0x098a  */
    /* JADX WARN: Code duplicated, block: B:462:0x099a  */
    /* JADX WARN: Code duplicated, block: B:466:0x09ba  */
    /* JADX WARN: Code duplicated, block: B:468:0x09be  */
    /* JADX WARN: Code duplicated, block: B:470:0x09c4  */
    /* JADX WARN: Code duplicated, block: B:472:0x09ca  */
    /* JADX WARN: Code duplicated, block: B:474:0x09d3  */
    /* JADX WARN: Code duplicated, block: B:475:0x09d6  */
    /* JADX WARN: Code duplicated, block: B:478:0x09de  */
    /* JADX WARN: Code duplicated, block: B:47:0x013a  */
    /* JADX WARN: Code duplicated, block: B:480:0x09e4  */
    /* JADX WARN: Code duplicated, block: B:482:0x09ea  */
    /* JADX WARN: Code duplicated, block: B:484:0x09f3  */
    /* JADX WARN: Code duplicated, block: B:485:0x09f6  */
    /* JADX WARN: Code duplicated, block: B:486:0x09fb  */
    /* JADX WARN: Code duplicated, block: B:489:0x0a0a  */
    /* JADX WARN: Code duplicated, block: B:491:0x0a16  */
    /* JADX WARN: Code duplicated, block: B:493:0x0a1a  */
    /* JADX WARN: Code duplicated, block: B:494:0x0a21  */
    /* JADX WARN: Code duplicated, block: B:497:0x0a27 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:49:0x0140 A[Catch: NotFoundException -> 0x0151, PHI: r7
  0x0140: PHI (r7v65 java.lang.String) = (r7v64 java.lang.String), (r7v66 java.lang.String) binds: [B:46:0x0138, B:48:0x013c] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #4 {NotFoundException -> 0x0151, blocks: (B:48:0x013c, B:49:0x0140), top: B:640:0x013c }] */
    /* JADX WARN: Code duplicated, block: B:501:0x0a33  */
    /* JADX WARN: Code duplicated, block: B:506:0x0a41  */
    /* JADX WARN: Code duplicated, block: B:511:0x0a51  */
    /* JADX WARN: Code duplicated, block: B:514:0x0a68  */
    /* JADX WARN: Code duplicated, block: B:516:0x0a72  */
    /* JADX WARN: Code duplicated, block: B:518:0x0a76  */
    /* JADX WARN: Code duplicated, block: B:521:0x0a7d  */
    /* JADX WARN: Code duplicated, block: B:522:0x0a80  */
    /* JADX WARN: Code duplicated, block: B:525:0x0a9c  */
    /* JADX WARN: Code duplicated, block: B:527:0x0aa8  */
    /* JADX WARN: Code duplicated, block: B:530:0x0ab5  */
    /* JADX WARN: Code duplicated, block: B:532:0x0ac5  */
    /* JADX WARN: Code duplicated, block: B:56:0x015f  */
    /* JADX WARN: Code duplicated, block: B:591:0x0bcd  */
    /* JADX WARN: Code duplicated, block: B:593:0x0bd9  */
    /* JADX WARN: Code duplicated, block: B:596:0x0be7  */
    /* JADX WARN: Code duplicated, block: B:597:0x0bed  */
    /* JADX WARN: Code duplicated, block: B:59:0x016a  */
    /* JADX WARN: Code duplicated, block: B:600:0x0bf5  */
    /* JADX WARN: Code duplicated, block: B:601:0x0bf9  */
    /* JADX WARN: Code duplicated, block: B:603:0x0bfd  */
    /* JADX WARN: Code duplicated, block: B:606:0x0c06  */
    /* JADX WARN: Code duplicated, block: B:608:0x0c10  */
    /* JADX WARN: Code duplicated, block: B:609:0x0c12  */
    /* JADX WARN: Code duplicated, block: B:610:0x0c15  */
    /* JADX WARN: Code duplicated, block: B:616:0x0c2f  */
    /* JADX WARN: Code duplicated, block: B:619:0x0c49  */
    /* JADX WARN: Code duplicated, block: B:622:0x0c7e  */
    /* JADX WARN: Code duplicated, block: B:625:0x0c83  */
    /* JADX WARN: Code duplicated, block: B:632:0x037b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0175  */
    /* JADX WARN: Code duplicated, block: B:642:0x073d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:643:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:649:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:652:0x0279 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:654:0x026b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:658:0x032e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0178 A[LOOP:3: B:64:0x0176->B:65:0x0178, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:664:0x0727 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:670:0x0965 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:671:0x093e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:672:0x0951 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:674:0x092e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:675:0x092e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:686:0x0894 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0186  */
    /* JADX WARN: Code duplicated, block: B:70:0x019a  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:76:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:81:0x01db A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:88:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:91:0x023a  */
    /* JADX WARN: Code duplicated, block: B:94:0x0247  */
    /* JADX WARN: Code duplicated, block: B:97:0x025f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0265  */
    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        h hVar;
        h hVar2;
        int i12;
        int paddingLeft;
        int i13;
        int paddingTop;
        int iK;
        int iG;
        boolean z10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z11;
        boolean z12;
        int childCount;
        int i18;
        View childAt;
        d dVar;
        int i19;
        int i20;
        boolean z13;
        int i21;
        int i22;
        int i23;
        int i24;
        boolean z14;
        int childMeasureSpec;
        boolean z15;
        int childMeasureSpec2;
        int baseline;
        boolean z16;
        int i25;
        int i26;
        int i27;
        boolean z17;
        int childCount2;
        int i28;
        int size;
        int i29;
        int i30;
        int i31;
        int i32;
        int size2;
        int paddingBottom;
        int paddingRight;
        int i33;
        int i34;
        int i35;
        int iMin;
        int iMin2;
        h[] hVarArr;
        h hVar3;
        h hVar4;
        boolean z18;
        boolean z19;
        boolean z20;
        int iMax;
        int iMax2;
        int i36;
        boolean z21;
        int i37;
        p201t1.i iVar;
        View view;
        boolean z22;
        View view2;
        int i38;
        d dVar2;
        boolean z23;
        boolean z24;
        boolean z25;
        int baseline2;
        int iK2;
        int iG2;
        int i39;
        int i40;
        int i41;
        ArrayList<k> arrayList3;
        h[] hVarArr2;
        h hVar5;
        h hVar6;
        boolean z26;
        boolean z27;
        boolean z28;
        Iterator it;
        int iMax3;
        int iMax4;
        p201t1.i iVar2;
        k kVar;
        int i42;
        int size3;
        int i43;
        h[] hVarArr3;
        h hVar7;
        h hVar8;
        p pVar;
        p pVar2;
        int childCount3;
        int i44;
        boolean zIsInEditMode;
        int childCount4;
        boolean z29;
        int i45;
        f fVar;
        int size4;
        int i46;
        int i47;
        View childAt2;
        p201t1.i iVarC;
        d dVar3;
        p201t1.i iVar3;
        int i48;
        int i49;
        int i50;
        int i51;
        int i52;
        int i53;
        int i54;
        float f10;
        int i55;
        int i56;
        p201t1.i iVar4;
        p201t1.i iVarB;
        p201t1.i iVarB2;
        int i57;
        int i58;
        p201t1.i iVarB3;
        int i59;
        int i60;
        p201t1.i iVarB4;
        p201t1.i iVar5;
        int i61;
        float f11;
        View view3;
        p201t1.i iVarB5;
        p201t1.i iVarB6;
        p201t1.i iVarB7;
        p201t1.i iVarB8;
        p201t1.i iVarB9;
        String str;
        float f12;
        float f13;
        int iIndexOf;
        int i62;
        int i63;
        int iIndexOf2;
        String strSubstring;
        float fAbs;
        int i64;
        p201t1.i iVarB10;
        m mVar;
        int i65;
        int i66;
        float f14;
        int i67;
        int childCount5;
        HashSet hashSet;
        HashMap map;
        int i68;
        Iterator it2;
        Integer num;
        p211u1.e eVar;
        int i69;
        int i70;
        View childAt3;
        int i71;
        int id;
        int i72;
        int i73;
        int i74;
        HashSet hashSet2;
        p211u1.e eVar2;
        int i75;
        int i76;
        a aVar;
        int[] iArr;
        String str2;
        int i77;
        p201t1.i iVarC2;
        int i78;
        View childAt4;
        int i79;
        boolean z30;
        String resourceName;
        int iIndexOf3;
        System.currentTimeMillis();
        int mode = View.MeasureSpec.getMode(i10);
        int size5 = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size6 = View.MeasureSpec.getSize(i11);
        int paddingLeft2 = getPaddingLeft();
        int paddingTop2 = getPaddingTop();
        j jVar = this.f14854d;
        jVar.f26588I = paddingLeft2;
        jVar.f26589J = paddingTop2;
        int i80 = this.f14857g;
        int[] iArr2 = jVar.f26629q;
        iArr2[0] = i80;
        iArr2[1] = this.f14858h;
        jVar.f26639j0 = getLayoutDirection() == 1;
        int mode3 = View.MeasureSpec.getMode(i10);
        int size7 = View.MeasureSpec.getSize(i10);
        int mode4 = View.MeasureSpec.getMode(i11);
        int size8 = View.MeasureSpec.getSize(i11);
        int paddingBottom2 = getPaddingBottom() + getPaddingTop();
        int paddingRight2 = getPaddingRight() + getPaddingLeft();
        h hVar9 = h.FIXED;
        getLayoutParams();
        if (mode3 != Integer.MIN_VALUE) {
            if (mode3 == 0) {
                hVar = h.WRAP_CONTENT;
            } else if (mode3 != 1073741824) {
                hVar = hVar9;
            } else {
                size7 = Math.min(this.f14857g, size7) - paddingRight2;
                hVar = hVar9;
            }
            size7 = 0;
        } else {
            hVar = h.WRAP_CONTENT;
        }
        if (mode4 != Integer.MIN_VALUE) {
            if (mode4 != 0) {
                if (mode4 == 1073741824) {
                    size8 = Math.min(this.f14858h, size8) - paddingBottom2;
                }
                jVar.f26597R = i12;
                jVar.f26598S = i12;
                jVar.t(hVar);
                jVar.x(size7);
                jVar.w(hVar2);
                jVar.s(size8);
                paddingLeft = (this.f14855e - getPaddingLeft()) - getPaddingRight();
                if (paddingLeft < 0) {
                    i13 = 0;
                    jVar.f26597R = 0;
                } else {
                    i13 = 0;
                    jVar.f26597R = paddingLeft;
                }
                paddingTop = (this.f14856f - getPaddingTop()) - getPaddingBottom();
                if (paddingTop < 0) {
                    jVar.f26598S = i13;
                } else {
                    jVar.f26598S = paddingTop;
                }
                iK = jVar.k();
                iG = jVar.g();
                z10 = this.f14859i;
                arrayList = this.f14852b;
                arrayList2 = this.f14853c;
                if (z10) {
                    this.f14859i = false;
                    childCount3 = getChildCount();
                    i44 = 0;
                    while (true) {
                        if (i44 >= childCount3) {
                            i14 = mode;
                            i15 = size5;
                            i16 = mode2;
                            size6 = size6;
                            i17 = paddingTop2;
                            break;
                        }
                        if (getChildAt(i44).isLayoutRequested()) {
                            arrayList2.clear();
                            zIsInEditMode = isInEditMode();
                            childCount4 = getChildCount();
                            if (zIsInEditMode) {
                                i78 = 0;
                                while (i78 < childCount4) {
                                    childAt4 = getChildAt(i78);
                                    int i81 = i78;
                                    try {
                                        i79 = paddingTop2;
                                        try {
                                            resourceName = getResources().getResourceName(childAt4.getId());
                                            e(Integer.valueOf(childAt4.getId()), resourceName);
                                            iIndexOf3 = resourceName.indexOf(47);
                                            z30 = zIsInEditMode;
                                            if (iIndexOf3 != -1) {
                                                try {
                                                    resourceName = resourceName.substring(iIndexOf3 + 1);
                                                    b(childAt4.getId()).f26605Z = resourceName;
                                                } catch (Resources.NotFoundException unused) {
                                                }
                                            } else {
                                                b(childAt4.getId()).f26605Z = resourceName;
                                            }
                                        } catch (Resources.NotFoundException unused2) {
                                            z30 = zIsInEditMode;
                                        }
                                    } catch (Resources.NotFoundException unused3) {
                                        i79 = paddingTop2;
                                    }
                                    i78 = i81 + 1;
                                    paddingTop2 = i79;
                                    zIsInEditMode = z30;
                                }
                            }
                            i17 = paddingTop2;
                            z29 = zIsInEditMode;
                            for (i45 = 0; i45 < childCount4; i45++) {
                                iVarC2 = c(getChildAt(i45));
                                if (iVarC2 != null) {
                                    iVarC2.o();
                                }
                            }
                            if (this.f14861l != -1) {
                                for (i77 = 0; i77 < childCount4; i77++) {
                                    getChildAt(i77).getId();
                                }
                            }
                            fVar = this.k;
                            if (fVar != null) {
                                childCount5 = getChildCount();
                                map = fVar.f27162a;
                                hashSet = new HashSet(map.keySet());
                                i68 = 0;
                                while (i68 < childCount5) {
                                    i70 = childCount5;
                                    childAt3 = getChildAt(i68);
                                    i71 = i68;
                                    id = childAt3.getId();
                                    i72 = mode2;
                                    if (id == -1) {
                                        throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                                    }
                                    if (map.containsKey(Integer.valueOf(id))) {
                                        hashSet.remove(Integer.valueOf(id));
                                        eVar2 = (p211u1.e) map.get(Integer.valueOf(id));
                                        hashSet2 = hashSet;
                                        if (childAt3 instanceof a) {
                                            i75 = 1;
                                            eVar2.f27148p0 = 1;
                                        } else {
                                            i75 = 1;
                                        }
                                        i74 = size5;
                                        i76 = eVar2.f27148p0;
                                        i73 = mode;
                                        if (i76 != -1 && i76 == i75) {
                                            aVar = (a) childAt3;
                                            aVar.setId(id);
                                            aVar.setType(eVar2.f27146o0);
                                            aVar.setAllowsGoneWidget(eVar2.f27144n0);
                                            iArr = eVar2.f27150q0;
                                            if (iArr != null) {
                                                aVar.setReferencedIds(iArr);
                                            } else {
                                                str2 = eVar2.f27151r0;
                                                if (str2 != null) {
                                                    int[] iArrA = f.a(aVar, str2);
                                                    eVar2.f27150q0 = iArrA;
                                                    aVar.setReferencedIds(iArrA);
                                                }
                                            }
                                        }
                                        d dVar4 = (d) childAt3.getLayoutParams();
                                        eVar2.a(dVar4);
                                        childAt3.setLayoutParams(dVar4);
                                        childAt3.setVisibility(eVar2.f27101J);
                                        childAt3.setAlpha(eVar2.f27112U);
                                        childAt3.setRotation(eVar2.f27115X);
                                        childAt3.setRotationX(eVar2.f27116Y);
                                        childAt3.setRotationY(eVar2.f27117Z);
                                        childAt3.setScaleX(eVar2.f27119a0);
                                        childAt3.setScaleY(eVar2.f27121b0);
                                        if (!Float.isNaN(eVar2.f27123c0)) {
                                            childAt3.setPivotX(eVar2.f27123c0);
                                        }
                                        if (!Float.isNaN(eVar2.f27125d0)) {
                                            childAt3.setPivotY(eVar2.f27125d0);
                                        }
                                        childAt3.setTranslationX(eVar2.f27127e0);
                                        childAt3.setTranslationY(eVar2.f27129f0);
                                        childAt3.setTranslationZ(eVar2.f27131g0);
                                        if (eVar2.f27113V) {
                                            childAt3.setElevation(eVar2.f27114W);
                                        }
                                    } else {
                                        i73 = mode;
                                        i74 = size5;
                                        hashSet2 = hashSet;
                                    }
                                    i68 = i71 + 1;
                                    childCount5 = i70;
                                    mode2 = i72;
                                    hashSet = hashSet2;
                                    size5 = i74;
                                    mode = i73;
                                }
                                i14 = mode;
                                i15 = size5;
                                i16 = mode2;
                                for (it2 = hashSet.iterator(); it2.hasNext(); it2 = it2) {
                                    num = (Integer) it2.next();
                                    eVar = (p211u1.e) map.get(num);
                                    i69 = eVar.f27148p0;
                                    if (i69 == -1 && i69 == 1) {
                                        Context context = getContext();
                                        a aVar2 = new a(context);
                                        aVar2.f27027a = new int[32];
                                        aVar2.f27029c = context;
                                        p201t1.a aVar3 = new p201t1.a();
                                        aVar3.f26547i0 = new p201t1.i[4];
                                        aVar3.f26548j0 = 0;
                                        aVar3.f26549k0 = 0;
                                        aVar3.f26550l0 = new ArrayList(4);
                                        aVar3.f26551m0 = true;
                                        aVar2.f27026g = aVar3;
                                        aVar2.f27030d = aVar3;
                                        aVar2.c();
                                        aVar2.setVisibility(8);
                                        aVar2.setId(num.intValue());
                                        int[] iArr3 = eVar.f27150q0;
                                        if (iArr3 != null) {
                                            aVar2.setReferencedIds(iArr3);
                                        } else {
                                            String str3 = eVar.f27151r0;
                                            if (str3 != null) {
                                                int[] iArrA2 = f.a(aVar2, str3);
                                                eVar.f27150q0 = iArrA2;
                                                aVar2.setReferencedIds(iArrA2);
                                            }
                                        }
                                        aVar2.setType(eVar.f27146o0);
                                        d dVarA = a();
                                        aVar2.c();
                                        eVar.a(dVarA);
                                        addView(aVar2, dVarA);
                                    }
                                    if (eVar.f27118a) {
                                        View gVar = new g(getContext());
                                        gVar.setId(num.intValue());
                                        d dVarA2 = a();
                                        eVar.a(dVarA2);
                                        addView(gVar, dVarA2);
                                    }
                                }
                            } else {
                                i14 = mode;
                                i15 = size5;
                                i16 = mode2;
                            }
                            jVar.f26638i0.clear();
                            size4 = arrayList.size();
                            if (size4 > 0) {
                                for (i67 = 0; i67 < size4; i67++) {
                                    ((p211u1.b) arrayList.get(i67)).b(this);
                                }
                            }
                            for (i46 = 0; i46 < childCount4; i46++) {
                                getChildAt(i46);
                            }
                            i47 = 0;
                            while (i47 < childCount4) {
                                childAt2 = getChildAt(i47);
                                iVarC = c(childAt2);
                                if (iVarC == null) {
                                    i52 = i47;
                                    i56 = childCount4;
                                } else {
                                    dVar3 = (d) childAt2.getLayoutParams();
                                    dVar3.a();
                                    if (z29) {
                                        try {
                                            String resourceName2 = getResources().getResourceName(childAt2.getId());
                                            e(Integer.valueOf(childAt2.getId()), resourceName2);
                                            b(childAt2.getId()).f26605Z = resourceName2.substring(resourceName2.indexOf("id/") + 3);
                                        } catch (Resources.NotFoundException unused4) {
                                        }
                                    }
                                    iVarC.f26604Y = childAt2.getVisibility();
                                    iVarC.f26603X = childAt2;
                                    jVar.f26638i0.add(iVarC);
                                    iVar3 = iVarC.f26583D;
                                    if (iVar3 != null) {
                                        ((j) iVar3).f26638i0.remove(iVarC);
                                        iVarC.f26583D = null;
                                    }
                                    iVarC.f26583D = jVar;
                                    if (dVar3.f27053V || !dVar3.f27052U) {
                                        arrayList2.add(iVarC);
                                    }
                                    if (dVar3.f27055X) {
                                        mVar = (m) iVarC;
                                        i65 = dVar3.f27071g0;
                                        i66 = dVar3.f27073h0;
                                        f14 = dVar3.f27075i0;
                                        if (f14 != -1.0f) {
                                            if (f14 > -1.0f) {
                                                mVar.f26666i0 = f14;
                                                mVar.f26667j0 = -1;
                                                mVar.f26668k0 = -1;
                                            }
                                        } else if (i65 != -1) {
                                            if (i65 > -1) {
                                                mVar.f26666i0 = -1.0f;
                                                mVar.f26667j0 = i65;
                                                mVar.f26668k0 = -1;
                                            }
                                        } else if (i66 != -1 && i66 > -1) {
                                            mVar.f26666i0 = -1.0f;
                                            mVar.f26667j0 = -1;
                                            mVar.f26668k0 = i66;
                                        }
                                    } else if (dVar3.f27064d == -1 || dVar3.f27066e != -1 || dVar3.f27068f != -1 || dVar3.f27070g != -1 || dVar3.f27083q != -1 || dVar3.f27082p != -1 || dVar3.r != -1 || dVar3.f27084s != -1 || dVar3.f27072h != -1 || dVar3.f27074i != -1 || dVar3.f27076j != -1 || dVar3.k != -1 || dVar3.f27078l != -1 || dVar3.f27047P != -1 || dVar3.f27048Q != -1 || dVar3.f27079m != -1 || ((ViewGroup.MarginLayoutParams) dVar3).width == -1 || ((ViewGroup.MarginLayoutParams) dVar3).height == -1) {
                                        i48 = dVar3.f27057Z;
                                        i49 = dVar3.f27059a0;
                                        i50 = dVar3.f27061b0;
                                        i51 = dVar3.f27063c0;
                                        i52 = i47;
                                        i53 = dVar3.f27065d0;
                                        i54 = dVar3.f27067e0;
                                        f10 = dVar3.f27069f0;
                                        i55 = dVar3.f27079m;
                                        i56 = childCount4;
                                        if (i55 != -1) {
                                            iVarB10 = b(i55);
                                            if (iVarB10 != null) {
                                                float f15 = dVar3.f27081o;
                                                int i82 = dVar3.f27080n;
                                                e eVar3 = e.CENTER;
                                                iVarC.l(eVar3, iVarB10, eVar3, i82, 0);
                                                iVar5.r = f15;
                                            }
                                        } else {
                                            if (i48 != -1) {
                                                iVarB9 = b(i48);
                                                if (iVarB9 != null) {
                                                    e eVar4 = e.LEFT;
                                                    iVar4 = iVarC;
                                                    iVar4.l(eVar4, iVarB9, eVar4, ((ViewGroup.MarginLayoutParams) dVar3).leftMargin, i53);
                                                } else {
                                                    iVar4 = iVarC;
                                                }
                                            } else {
                                                iVar4 = iVarC;
                                                if (i49 != -1 && (iVarB = b(i49)) != null) {
                                                    iVar4.l(e.LEFT, iVarB, e.RIGHT, ((ViewGroup.MarginLayoutParams) dVar3).leftMargin, i53);
                                                }
                                            }
                                            if (i50 != -1) {
                                                iVarB8 = b(i50);
                                                if (iVarB8 != null) {
                                                    iVar4.l(e.RIGHT, iVarB8, e.LEFT, ((ViewGroup.MarginLayoutParams) dVar3).rightMargin, i54);
                                                }
                                            } else if (i51 != -1 && (iVarB2 = b(i51)) != null) {
                                                e eVar5 = e.RIGHT;
                                                iVar4.l(eVar5, iVarB2, eVar5, ((ViewGroup.MarginLayoutParams) dVar3).rightMargin, i54);
                                            }
                                            i57 = dVar3.f27072h;
                                            if (i57 != -1) {
                                                iVarB7 = b(i57);
                                                if (iVarB7 != null) {
                                                    e eVar6 = e.TOP;
                                                    iVar4.l(eVar6, iVarB7, eVar6, ((ViewGroup.MarginLayoutParams) dVar3).topMargin, dVar3.f27086u);
                                                }
                                            } else {
                                                i58 = dVar3.f27074i;
                                                if (i58 != -1 && (iVarB3 = b(i58)) != null) {
                                                    iVar4.l(e.TOP, iVarB3, e.BOTTOM, ((ViewGroup.MarginLayoutParams) dVar3).topMargin, dVar3.f27086u);
                                                }
                                            }
                                            i59 = dVar3.f27076j;
                                            if (i59 != -1) {
                                                iVarB6 = b(i59);
                                                if (iVarB6 != null) {
                                                    iVar4.l(e.BOTTOM, iVarB6, e.TOP, ((ViewGroup.MarginLayoutParams) dVar3).bottomMargin, dVar3.f27088w);
                                                }
                                            } else {
                                                i60 = dVar3.k;
                                                if (i60 != -1 && (iVarB4 = b(i60)) != null) {
                                                    e eVar7 = e.BOTTOM;
                                                    iVar4.l(eVar7, iVarB4, eVar7, ((ViewGroup.MarginLayoutParams) dVar3).bottomMargin, dVar3.f27088w);
                                                }
                                            }
                                            iVar5 = iVar4;
                                            i61 = dVar3.f27078l;
                                            if (i61 != -1) {
                                                view3 = (View) this.f14851a.get(i61);
                                                iVarB5 = b(dVar3.f27078l);
                                                if (iVarB5 != null && view3 != null && (view3.getLayoutParams() instanceof d)) {
                                                    d dVar5 = (d) view3.getLayoutParams();
                                                    dVar3.f27054W = true;
                                                    dVar5.f27054W = true;
                                                    e eVar8 = e.BASELINE;
                                                    iVar5.f(eVar8).a(iVarB5.f(eVar8), 0, -1, p201t1.d.STRONG, 0, true);
                                                    iVar5.f(e.TOP).d();
                                                    iVar5.f(e.BOTTOM).d();
                                                }
                                            }
                                            if (f10 >= 0.0f && f10 != 0.5f) {
                                                iVar5.f26601V = f10;
                                            }
                                            f11 = dVar3.f27032A;
                                            if (f11 >= 0.0f && f11 != 0.5f) {
                                                iVar5.f26602W = f11;
                                            }
                                        }
                                        if (z29) {
                                            iVar5 = iVarC;
                                            i64 = dVar3.f27047P;
                                            if (i64 == -1 || dVar3.f27048Q != -1) {
                                                iVar5 = iVarC;
                                                iVar5 = iVarC;
                                                int i83 = dVar3.f27048Q;
                                                iVar5.f26588I = i64;
                                                iVar5.f26589J = i83;
                                            }
                                        }
                                        iVar5 = iVarC;
                                        iVar5 = iVarC;
                                        iVar5 = iVarC;
                                        if (dVar3.f27052U) {
                                            iVar5.t(h.FIXED);
                                            iVar5.x(((ViewGroup.MarginLayoutParams) dVar3).width);
                                        } else if (((ViewGroup.MarginLayoutParams) dVar3).width == -1) {
                                            iVar5.t(h.MATCH_PARENT);
                                            iVar5.f(e.LEFT).f26573e = ((ViewGroup.MarginLayoutParams) dVar3).leftMargin;
                                            iVar5.f(e.RIGHT).f26573e = ((ViewGroup.MarginLayoutParams) dVar3).rightMargin;
                                        } else {
                                            iVar5.t(h.MATCH_CONSTRAINT);
                                            iVar5.x(0);
                                        }
                                        if (dVar3.f27053V) {
                                            iVar5.w(h.FIXED);
                                            iVar5.s(((ViewGroup.MarginLayoutParams) dVar3).height);
                                        } else if (((ViewGroup.MarginLayoutParams) dVar3).height == -1) {
                                            iVar5.w(h.MATCH_PARENT);
                                            iVar5.f(e.TOP).f26573e = ((ViewGroup.MarginLayoutParams) dVar3).topMargin;
                                            iVar5.f(e.BOTTOM).f26573e = ((ViewGroup.MarginLayoutParams) dVar3).bottomMargin;
                                        } else {
                                            iVar5.w(h.MATCH_CONSTRAINT);
                                            iVar5.s(0);
                                        }
                                        str = dVar3.f27033B;
                                        if (str != null) {
                                            if (str.length() == 0) {
                                                iVar5.f26586G = 0.0f;
                                            } else {
                                                int length = str.length();
                                                iIndexOf = str.indexOf(44);
                                                if (iIndexOf > 0 || iIndexOf >= length - 1) {
                                                    i62 = 0;
                                                    i63 = -1;
                                                } else {
                                                    String strSubstring2 = str.substring(0, iIndexOf);
                                                    i63 = strSubstring2.equalsIgnoreCase("W") ? 0 : strSubstring2.equalsIgnoreCase("H") ? 1 : -1;
                                                    i62 = iIndexOf + 1;
                                                }
                                                iIndexOf2 = str.indexOf(58);
                                                if (iIndexOf2 >= 0 || iIndexOf2 >= length - 1) {
                                                    strSubstring = str.substring(i62);
                                                    if (strSubstring.length() > 0) {
                                                        fAbs = Float.parseFloat(strSubstring);
                                                    } else {
                                                        fAbs = 0.0f;
                                                    }
                                                } else {
                                                    String strSubstring3 = str.substring(i62, iIndexOf2);
                                                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                                                    if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                                                        fAbs = 0.0f;
                                                    } else {
                                                        try {
                                                            float f16 = Float.parseFloat(strSubstring3);
                                                            float f17 = Float.parseFloat(strSubstring4);
                                                            if (f16 <= 0.0f || f17 <= 0.0f) {
                                                                fAbs = 0.0f;
                                                            } else {
                                                                fAbs = i63 == 1 ? Math.abs(f17 / f16) : Math.abs(f16 / f17);
                                                            }
                                                        } catch (NumberFormatException unused5) {
                                                        }
                                                    }
                                                }
                                                if (fAbs > 0.0f) {
                                                    iVar5.f26586G = fAbs;
                                                    iVar5.f26587H = i63;
                                                }
                                            }
                                        }
                                        float f18 = dVar3.f27035D;
                                        float[] fArr = iVar5.f26617f0;
                                        fArr[0] = f18;
                                        fArr[1] = dVar3.f27036E;
                                        iVar5.f26613d0 = dVar3.f27037F;
                                        iVar5.f26615e0 = dVar3.f27038G;
                                        int i84 = dVar3.f27039H;
                                        int i85 = dVar3.f27041J;
                                        int i86 = dVar3.f27043L;
                                        f12 = dVar3.f27045N;
                                        iVar5.f26614e = i84;
                                        iVar5.f26620h = i85;
                                        iVar5.f26622i = i86;
                                        iVar5.f26623j = f12;
                                        if (f12 < 1.0f && i84 == 0) {
                                            iVar5.f26614e = 2;
                                        }
                                        int i87 = dVar3.f27040I;
                                        int i88 = dVar3.f27042K;
                                        int i89 = dVar3.f27044M;
                                        f13 = dVar3.f27046O;
                                        iVar5.f26616f = i87;
                                        iVar5.k = i88;
                                        iVar5.f26624l = i89;
                                        iVar5.f26625m = f13;
                                        if (f13 >= 1.0f && i87 == 0) {
                                            iVar5.f26616f = 2;
                                        }
                                    }
                                    i52 = i47;
                                    i56 = childCount4;
                                }
                                i47 = i52 + 1;
                                childCount4 = i56;
                            }
                            break;
                        }
                        i44++;
                    }
                    z11 = true;
                } else {
                    i14 = mode;
                    i15 = size5;
                    i16 = mode2;
                    size6 = size6;
                    paddingLeft2 = paddingLeft2;
                    i17 = paddingTop2;
                    z11 = false;
                }
                if ((this.f14860j & 8) == 8) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    size3 = jVar.f26638i0.size();
                    jVar.p();
                    for (i43 = 0; i43 < size3; i43++) {
                        ((p201t1.i) jVar.f26638i0.get(i43)).p();
                    }
                    jVar.c(jVar.f26652w0);
                    hVarArr3 = jVar.f26582C;
                    hVar7 = hVarArr3[0];
                    hVar8 = h.WRAP_CONTENT;
                    if (hVar7 != hVar8 && (pVar2 = jVar.f26610c) != null) {
                        pVar2.g(iK);
                    }
                    if (hVarArr3[1] != hVar8 && (pVar = jVar.f26612d) != null) {
                        pVar.g(iG);
                    }
                    d(i10, i11);
                } else {
                    int paddingBottom3 = getPaddingBottom() + getPaddingTop();
                    int paddingRight3 = getPaddingRight() + getPaddingLeft();
                    childCount = getChildCount();
                    i18 = 0;
                    while (i18 < childCount) {
                        childAt = getChildAt(i18);
                        boolean z31 = z11;
                        if (childAt.getVisibility() == 8) {
                            i19 = childCount;
                        } else {
                            dVar = (d) childAt.getLayoutParams();
                            p201t1.i iVar6 = dVar.f27077j0;
                            i19 = childCount;
                            if (dVar.f27055X && !dVar.f27056Y) {
                                iVar6.f26604Y = childAt.getVisibility();
                                int measuredWidth = ((ViewGroup.MarginLayoutParams) dVar).width;
                                i20 = i18;
                                int measuredHeight = ((ViewGroup.MarginLayoutParams) dVar).height;
                                z13 = z12;
                                boolean z32 = dVar.f27052U;
                                if (z32 || (z16 = dVar.f27053V)) {
                                    i21 = iK;
                                    i22 = iG;
                                } else {
                                    if (z32) {
                                        i22 = iG;
                                        i25 = 1;
                                    } else {
                                        i22 = iG;
                                        i25 = 1;
                                        if (dVar.f27039H == 1) {
                                            i21 = iK;
                                        }
                                        iVar6.x(measuredWidth);
                                        iVar6.s(measuredHeight);
                                        if (z14) {
                                            iVar6.f26599T = measuredWidth;
                                        }
                                        if (z15) {
                                            iVar6.f26600U = measuredHeight;
                                        }
                                        if (!dVar.f27054W && (baseline = childAt.getBaseline()) != -1) {
                                            iVar6.f26596Q = baseline;
                                        }
                                    }
                                    if (measuredWidth != -1) {
                                        if (z16) {
                                            i21 = iK;
                                        } else {
                                            i21 = iK;
                                            if (dVar.f27040I == i25 || measuredHeight == -1) {
                                            }
                                            iVar6.x(measuredWidth);
                                            iVar6.s(measuredHeight);
                                            if (z14) {
                                                iVar6.f26599T = measuredWidth;
                                            }
                                            if (z15) {
                                                iVar6.f26600U = measuredHeight;
                                            }
                                            if (!dVar.f27054W) {
                                            }
                                        }
                                        z15 = false;
                                        z14 = false;
                                        iVar6.x(measuredWidth);
                                        iVar6.s(measuredHeight);
                                        if (z14) {
                                            iVar6.f26599T = measuredWidth;
                                        }
                                        if (z15) {
                                            iVar6.f26600U = measuredHeight;
                                        }
                                        if (!dVar.f27054W) {
                                        }
                                    } else {
                                        i21 = iK;
                                    }
                                }
                                if (measuredWidth == 0) {
                                    i23 = -2;
                                    childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, paddingRight3, -2);
                                    z14 = true;
                                    i24 = -1;
                                } else {
                                    i23 = -2;
                                    i24 = -1;
                                    if (measuredWidth == -1) {
                                        childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, paddingRight3, -1);
                                        z14 = false;
                                    } else {
                                        z14 = measuredWidth == -2;
                                        childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, paddingRight3, measuredWidth);
                                    }
                                }
                                if (measuredHeight == 0) {
                                    childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, paddingBottom3, i23);
                                    z15 = true;
                                } else if (measuredHeight == i24) {
                                    childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, paddingBottom3, i24);
                                    z15 = false;
                                } else {
                                    z15 = measuredHeight == i23;
                                    childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, paddingBottom3, measuredHeight);
                                }
                                childAt.measure(childMeasureSpec, childMeasureSpec2);
                                measuredWidth = childAt.getMeasuredWidth();
                                measuredHeight = childAt.getMeasuredHeight();
                                iVar6.x(measuredWidth);
                                iVar6.s(measuredHeight);
                                if (z14) {
                                    iVar6.f26599T = measuredWidth;
                                }
                                if (z15) {
                                    iVar6.f26600U = measuredHeight;
                                }
                                if (!dVar.f27054W) {
                                }
                            }
                            i18 = i20 + 1;
                            z11 = z31;
                            childCount = i19;
                            z12 = z13;
                            iK = i21;
                            iG = i22;
                        }
                        i20 = i18;
                        i21 = iK;
                        i22 = iG;
                        z13 = z12;
                        i18 = i20 + 1;
                        z11 = z31;
                        childCount = i19;
                        z12 = z13;
                        iK = i21;
                        iG = i22;
                    }
                }
                boolean z33 = z11;
                i26 = iK;
                i27 = iG;
                z17 = z12;
                childCount2 = getChildCount();
                for (i28 = 0; i28 < childCount2; i28++) {
                    getChildAt(i28);
                }
                size = arrayList.size();
                if (size > 0) {
                    for (i42 = 0; i42 < size; i42++) {
                        ((p211u1.b) arrayList.get(i42)).getClass();
                    }
                }
                if (getChildCount() > 0 && z33) {
                    if ((jVar.f26652w0 & 32) == 32) {
                        jVar.f26653x0 = true;
                        jVar.f26647r0 = false;
                        jVar.f26648s0 = false;
                        jVar.f26649t0 = false;
                        ArrayList<p201t1.i> arrayList4 = jVar.f26638i0;
                        arrayList3 = jVar.f26646q0;
                        hVarArr2 = jVar.f26582C;
                        hVar5 = hVarArr2[0];
                        hVar6 = h.WRAP_CONTENT;
                        if (hVar5 == hVar6) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        if (hVarArr2[1] == hVar6) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        if (!z26 || z27) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        arrayList3.clear();
                        for (p201t1.i iVar7 : arrayList4) {
                            iVar7.f26628p = null;
                            iVar7.f26611c0 = false;
                            iVar7.p();
                        }
                        it = arrayList4.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                iMax3 = 0;
                                iMax4 = 0;
                                for (k kVar2 : arrayList3) {
                                    iMax3 = Math.max(iMax3, n.c(kVar2, 0));
                                    iMax4 = Math.max(iMax4, n.c(kVar2, 1));
                                }
                                if (z26) {
                                    jVar.t(h.FIXED);
                                    jVar.x(iMax3);
                                    jVar.f26647r0 = true;
                                    jVar.f26648s0 = true;
                                    jVar.f26650u0 = iMax3;
                                }
                                if (z27) {
                                    jVar.w(h.FIXED);
                                    jVar.s(iMax4);
                                    jVar.f26647r0 = true;
                                    jVar.f26649t0 = true;
                                    jVar.f26651v0 = iMax4;
                                }
                                n.i(arrayList3, 0, jVar.k());
                                n.i(arrayList3, 1, jVar.g());
                                break;
                            }
                            iVar2 = (p201t1.i) it.next();
                            if (iVar2.f26628p == null) {
                                kVar = new k(new ArrayList());
                                arrayList3.add(kVar);
                                if (!n.j(iVar2, kVar, arrayList3, z28)) {
                                    jVar.f26646q0.clear();
                                    jVar.f26646q0.add(0, new k((List) jVar.f26638i0));
                                    jVar.f26653x0 = false;
                                    break;
                                }
                            }
                        }
                    } else {
                        jVar.f26646q0.clear();
                        jVar.f26646q0.add(0, new k((List) jVar.f26638i0));
                    }
                }
                if (jVar.f26647r0) {
                    if (jVar.f26648s0) {
                        i32 = i14;
                        if (i32 == Integer.MIN_VALUE) {
                            i41 = jVar.f26650u0;
                            i31 = i15;
                            if (i41 < i31) {
                                jVar.x(i41);
                            }
                            jVar.t(h.FIXED);
                        } else {
                            i31 = i15;
                        }
                    } else {
                        i31 = i15;
                        i32 = i14;
                    }
                    if (jVar.f26649t0) {
                        i30 = i16;
                        if (i30 == Integer.MIN_VALUE) {
                            i40 = jVar.f26651v0;
                            i29 = size6;
                            if (i40 < i29) {
                                jVar.s(i40);
                            }
                            jVar.w(h.FIXED);
                        } else {
                            i29 = size6;
                        }
                    } else {
                        i29 = size6;
                        i30 = i16;
                    }
                } else {
                    i29 = size6;
                    i30 = i16;
                    i31 = i15;
                    i32 = i14;
                }
                if ((this.f14860j & 32) == 32) {
                    iK2 = jVar.k();
                    iG2 = jVar.g();
                    if (this.f14863n != iK2) {
                        i39 = 1073741824;
                        if (i32 == 1073741824) {
                            n.i(jVar.f26646q0, 0, iK2);
                        }
                    } else {
                        i39 = 1073741824;
                    }
                    if (this.f14864o != iG2 && i30 == i39) {
                        n.i(jVar.f26646q0, 1, iG2);
                    }
                    if (jVar.f26648s0 && jVar.f26650u0 > i31) {
                        n.i(jVar.f26646q0, 0, i31);
                    }
                    if (jVar.f26649t0 && jVar.f26651v0 > i29) {
                        n.i(jVar.f26646q0, 1, i29);
                    }
                }
                if (getChildCount() > 0) {
                    this.f14854d.C();
                }
                size2 = arrayList2.size();
                paddingBottom = getPaddingBottom() + i17;
                paddingRight = getPaddingRight() + paddingLeft2;
                if (size2 > 0) {
                    hVarArr = jVar.f26582C;
                    hVar3 = hVarArr[0];
                    hVar4 = h.WRAP_CONTENT;
                    if (hVar3 == hVar4) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = true;
                    if (hVarArr[1] == hVar4) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    iMax = Math.max(jVar.k(), this.f14855e);
                    iMax2 = Math.max(jVar.g(), this.f14856f);
                    i36 = 0;
                    z21 = false;
                    int iCombineMeasuredStates = 0;
                    while (i36 < size2) {
                        p201t1.i iVar8 = (p201t1.i) arrayList2.get(i36);
                        boolean z34 = z20;
                        view2 = iVar8.f26603X;
                        if (view2 == null) {
                            i38 = i36;
                            z23 = z21;
                        } else {
                            i38 = i36;
                            dVar2 = (d) view2.getLayoutParams();
                            z23 = z21;
                            if (dVar2.f27056Y && !dVar2.f27055X) {
                                z24 = z18;
                                if (view2.getVisibility() == 8 || (z17 && iVar8.j().d() && iVar8.i().d())) {
                                    paddingBottom = paddingBottom;
                                    paddingRight = paddingRight;
                                    z21 = z23;
                                } else {
                                    int i90 = ((ViewGroup.MarginLayoutParams) dVar2).width;
                                    int childMeasureSpec3 = (i90 == -2 && dVar2.f27052U) ? ViewGroup.getChildMeasureSpec(i10, paddingRight, i90) : View.MeasureSpec.makeMeasureSpec(iVar8.k(), 1073741824);
                                    int i91 = ((ViewGroup.MarginLayoutParams) dVar2).height;
                                    paddingRight = paddingRight;
                                    view2.measure(childMeasureSpec3, (i91 == -2 && dVar2.f27053V) ? ViewGroup.getChildMeasureSpec(i11, paddingBottom, i91) : View.MeasureSpec.makeMeasureSpec(iVar8.g(), 1073741824));
                                    int measuredWidth2 = view2.getMeasuredWidth();
                                    int measuredHeight2 = view2.getMeasuredHeight();
                                    if (measuredWidth2 != iVar8.k()) {
                                        iVar8.x(measuredWidth2);
                                        if (z17) {
                                            iVar8.j().g(measuredWidth2);
                                        }
                                        if (z24) {
                                            int i92 = iVar8.f26588I;
                                            int i93 = iVar8.f26584E;
                                            paddingBottom = paddingBottom;
                                            if (i92 + i93 > iMax) {
                                                iMax = Math.max(iMax, iVar8.f(e.RIGHT).b() + i92 + i93);
                                            }
                                        } else {
                                            paddingBottom = paddingBottom;
                                        }
                                        z25 = true;
                                    } else {
                                        paddingBottom = paddingBottom;
                                        z25 = z23;
                                    }
                                    if (measuredHeight2 != iVar8.g()) {
                                        iVar8.s(measuredHeight2);
                                        if (z17) {
                                            iVar8.i().g(measuredHeight2);
                                        }
                                        if (z34) {
                                            int i94 = iVar8.f26589J;
                                            int i95 = iVar8.f26585F;
                                            if (i94 + i95 > iMax2) {
                                                iMax2 = Math.max(iMax2, iVar8.f(e.BOTTOM).b() + i94 + i95);
                                            }
                                        }
                                        z25 = true;
                                    }
                                    if (dVar2.f27054W && (baseline2 = view2.getBaseline()) != -1 && baseline2 != iVar8.f26596Q) {
                                        iVar8.f26596Q = baseline2;
                                        z25 = true;
                                    }
                                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
                                    z21 = z25;
                                }
                            }
                            i36 = i38 + 1;
                            z20 = z34;
                            z18 = z24;
                            paddingRight = paddingRight;
                            paddingBottom = paddingBottom;
                        }
                        z24 = z18;
                        z21 = z23;
                        i36 = i38 + 1;
                        z20 = z34;
                        z18 = z24;
                        paddingRight = paddingRight;
                        paddingBottom = paddingBottom;
                    }
                    i33 = paddingBottom;
                    i34 = paddingRight;
                    if (z21) {
                        jVar.x(i26);
                        jVar.s(i27);
                        if (z17) {
                            jVar.E();
                        }
                        this.f14854d.C();
                        if (jVar.k() < iMax) {
                            jVar.x(iMax);
                            z22 = true;
                        } else {
                            z22 = false;
                        }
                        if (jVar.g() < iMax2) {
                            jVar.s(iMax2);
                        } else {
                            z19 = z22;
                        }
                        if (z19) {
                            this.f14854d.C();
                        }
                    }
                    for (i37 = 0; i37 < size2; i37++) {
                        iVar = (p201t1.i) arrayList2.get(i37);
                        view = iVar.f26603X;
                        if (view == null && (view.getMeasuredWidth() != iVar.k() || view.getMeasuredHeight() != iVar.g())) {
                            if (iVar.f26604Y != 8) {
                                view.measure(View.MeasureSpec.makeMeasureSpec(iVar.k(), 1073741824), View.MeasureSpec.makeMeasureSpec(iVar.g(), 1073741824));
                            }
                        }
                    }
                    i35 = iCombineMeasuredStates;
                } else {
                    i33 = paddingBottom;
                    i34 = paddingRight;
                    i35 = 0;
                }
                int iK3 = jVar.k() + i34;
                int iG3 = jVar.g() + i33;
                int iResolveSizeAndState = View.resolveSizeAndState(iK3, i10, i35);
                int iResolveSizeAndState2 = View.resolveSizeAndState(iG3, i11, i35 << 16) & 16777215;
                iMin = Math.min(this.f14857g, iResolveSizeAndState & 16777215);
                iMin2 = Math.min(this.f14858h, iResolveSizeAndState2);
                if (jVar.f26654y0) {
                    iMin |= 16777216;
                }
                if (jVar.f26655z0) {
                    iMin2 |= 16777216;
                }
                setMeasuredDimension(iMin, iMin2);
                this.f14863n = iMin;
                this.f14864o = iMin2;
            }
            hVar9 = h.WRAP_CONTENT;
            hVar2 = hVar9;
            i12 = 0;
            size8 = 0;
            jVar.f26597R = i12;
            jVar.f26598S = i12;
            jVar.t(hVar);
            jVar.x(size7);
            jVar.w(hVar2);
            jVar.s(size8);
            paddingLeft = (this.f14855e - getPaddingLeft()) - getPaddingRight();
            if (paddingLeft < 0) {
                i13 = 0;
                jVar.f26597R = 0;
            } else {
                i13 = 0;
                jVar.f26597R = paddingLeft;
            }
            paddingTop = (this.f14856f - getPaddingTop()) - getPaddingBottom();
            if (paddingTop < 0) {
                jVar.f26598S = i13;
            } else {
                jVar.f26598S = paddingTop;
            }
            iK = jVar.k();
            iG = jVar.g();
            z10 = this.f14859i;
            arrayList = this.f14852b;
            arrayList2 = this.f14853c;
            if (z10) {
                this.f14859i = false;
                childCount3 = getChildCount();
                i44 = 0;
                while (true) {
                    if (i44 >= childCount3) {
                        i14 = mode;
                        i15 = size5;
                        i16 = mode2;
                        size6 = size6;
                        i17 = paddingTop2;
                        break;
                    }
                    if (getChildAt(i44).isLayoutRequested()) {
                        arrayList2.clear();
                        zIsInEditMode = isInEditMode();
                        childCount4 = getChildCount();
                        if (zIsInEditMode) {
                            i78 = 0;
                            while (i78 < childCount4) {
                                childAt4 = getChildAt(i78);
                                int i810 = i78;
                                i79 = paddingTop2;
                                resourceName = getResources().getResourceName(childAt4.getId());
                                e(Integer.valueOf(childAt4.getId()), resourceName);
                                iIndexOf3 = resourceName.indexOf(47);
                                z30 = zIsInEditMode;
                                if (iIndexOf3 != -1) {
                                    resourceName = resourceName.substring(iIndexOf3 + 1);
                                    b(childAt4.getId()).f26605Z = resourceName;
                                } else {
                                    b(childAt4.getId()).f26605Z = resourceName;
                                }
                                i78 = i810 + 1;
                                paddingTop2 = i79;
                                zIsInEditMode = z30;
                            }
                        }
                        i17 = paddingTop2;
                        z29 = zIsInEditMode;
                        while (i45 < childCount4) {
                            iVarC2 = c(getChildAt(i45));
                            if (iVarC2 != null) {
                                iVarC2.o();
                            }
                        }
                        if (this.f14861l != -1) {
                            while (i77 < childCount4) {
                                getChildAt(i77).getId();
                            }
                        }
                        fVar = this.k;
                        if (fVar != null) {
                            childCount5 = getChildCount();
                            map = fVar.f27162a;
                            hashSet = new HashSet(map.keySet());
                            i68 = 0;
                            while (i68 < childCount5) {
                                i70 = childCount5;
                                childAt3 = getChildAt(i68);
                                i71 = i68;
                                id = childAt3.getId();
                                i72 = mode2;
                                if (id == -1) {
                                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                                }
                                if (map.containsKey(Integer.valueOf(id))) {
                                    hashSet.remove(Integer.valueOf(id));
                                    eVar2 = (p211u1.e) map.get(Integer.valueOf(id));
                                    hashSet2 = hashSet;
                                    if (childAt3 instanceof a) {
                                        i75 = 1;
                                        eVar2.f27148p0 = 1;
                                    } else {
                                        i75 = 1;
                                    }
                                    i74 = size5;
                                    i76 = eVar2.f27148p0;
                                    i73 = mode;
                                    if (i76 != -1) {
                                        aVar = (a) childAt3;
                                        aVar.setId(id);
                                        aVar.setType(eVar2.f27146o0);
                                        aVar.setAllowsGoneWidget(eVar2.f27144n0);
                                        iArr = eVar2.f27150q0;
                                        if (iArr != null) {
                                            aVar.setReferencedIds(iArr);
                                        } else {
                                            str2 = eVar2.f27151r0;
                                            if (str2 != null) {
                                                int[] iArrA3 = f.a(aVar, str2);
                                                eVar2.f27150q0 = iArrA3;
                                                aVar.setReferencedIds(iArrA3);
                                            }
                                        }
                                    }
                                    d dVar6 = (d) childAt3.getLayoutParams();
                                    eVar2.a(dVar6);
                                    childAt3.setLayoutParams(dVar6);
                                    childAt3.setVisibility(eVar2.f27101J);
                                    childAt3.setAlpha(eVar2.f27112U);
                                    childAt3.setRotation(eVar2.f27115X);
                                    childAt3.setRotationX(eVar2.f27116Y);
                                    childAt3.setRotationY(eVar2.f27117Z);
                                    childAt3.setScaleX(eVar2.f27119a0);
                                    childAt3.setScaleY(eVar2.f27121b0);
                                    if (!Float.isNaN(eVar2.f27123c0)) {
                                        childAt3.setPivotX(eVar2.f27123c0);
                                    }
                                    if (!Float.isNaN(eVar2.f27125d0)) {
                                        childAt3.setPivotY(eVar2.f27125d0);
                                    }
                                    childAt3.setTranslationX(eVar2.f27127e0);
                                    childAt3.setTranslationY(eVar2.f27129f0);
                                    childAt3.setTranslationZ(eVar2.f27131g0);
                                    if (eVar2.f27113V) {
                                        childAt3.setElevation(eVar2.f27114W);
                                    }
                                } else {
                                    i73 = mode;
                                    i74 = size5;
                                    hashSet2 = hashSet;
                                }
                                i68 = i71 + 1;
                                childCount5 = i70;
                                mode2 = i72;
                                hashSet = hashSet2;
                                size5 = i74;
                                mode = i73;
                            }
                            i14 = mode;
                            i15 = size5;
                            i16 = mode2;
                            while (it2.hasNext()) {
                                num = (Integer) it2.next();
                                eVar = (p211u1.e) map.get(num);
                                i69 = eVar.f27148p0;
                                if (i69 == -1) {
                                }
                                if (eVar.f27118a) {
                                    View gVar2 = new g(getContext());
                                    gVar2.setId(num.intValue());
                                    d dVarA3 = a();
                                    eVar.a(dVarA3);
                                    addView(gVar2, dVarA3);
                                }
                            }
                        } else {
                            i14 = mode;
                            i15 = size5;
                            i16 = mode2;
                        }
                        jVar.f26638i0.clear();
                        size4 = arrayList.size();
                        if (size4 > 0) {
                            while (i67 < size4) {
                                ((p211u1.b) arrayList.get(i67)).b(this);
                            }
                        }
                        while (i46 < childCount4) {
                            getChildAt(i46);
                        }
                        i47 = 0;
                        while (i47 < childCount4) {
                            childAt2 = getChildAt(i47);
                            iVarC = c(childAt2);
                            if (iVarC == null) {
                                i52 = i47;
                                i56 = childCount4;
                            } else {
                                dVar3 = (d) childAt2.getLayoutParams();
                                dVar3.a();
                                if (z29) {
                                    String resourceName3 = getResources().getResourceName(childAt2.getId());
                                    e(Integer.valueOf(childAt2.getId()), resourceName3);
                                    b(childAt2.getId()).f26605Z = resourceName3.substring(resourceName3.indexOf("id/") + 3);
                                }
                                iVarC.f26604Y = childAt2.getVisibility();
                                iVarC.f26603X = childAt2;
                                jVar.f26638i0.add(iVarC);
                                iVar3 = iVarC.f26583D;
                                if (iVar3 != null) {
                                    ((j) iVar3).f26638i0.remove(iVarC);
                                    iVarC.f26583D = null;
                                }
                                iVarC.f26583D = jVar;
                                if (dVar3.f27053V) {
                                    arrayList2.add(iVarC);
                                } else {
                                    arrayList2.add(iVarC);
                                }
                                if (dVar3.f27055X) {
                                    mVar = (m) iVarC;
                                    i65 = dVar3.f27071g0;
                                    i66 = dVar3.f27073h0;
                                    f14 = dVar3.f27075i0;
                                    if (f14 != -1.0f) {
                                        if (f14 > -1.0f) {
                                            mVar.f26666i0 = f14;
                                            mVar.f26667j0 = -1;
                                            mVar.f26668k0 = -1;
                                        }
                                    } else if (i65 != -1) {
                                        if (i65 > -1) {
                                            mVar.f26666i0 = -1.0f;
                                            mVar.f26667j0 = i65;
                                            mVar.f26668k0 = -1;
                                        }
                                    } else if (i66 != -1) {
                                        mVar.f26666i0 = -1.0f;
                                        mVar.f26667j0 = -1;
                                        mVar.f26668k0 = i66;
                                    }
                                } else {
                                    if (dVar3.f27064d == -1) {
                                    }
                                    i48 = dVar3.f27057Z;
                                    i49 = dVar3.f27059a0;
                                    i50 = dVar3.f27061b0;
                                    i51 = dVar3.f27063c0;
                                    i52 = i47;
                                    i53 = dVar3.f27065d0;
                                    i54 = dVar3.f27067e0;
                                    f10 = dVar3.f27069f0;
                                    i55 = dVar3.f27079m;
                                    i56 = childCount4;
                                    if (i55 != -1) {
                                        iVarB10 = b(i55);
                                        if (iVarB10 != null) {
                                            float f19 = dVar3.f27081o;
                                            int i811 = dVar3.f27080n;
                                            e eVar9 = e.CENTER;
                                            iVarC.l(eVar9, iVarB10, eVar9, i811, 0);
                                            iVar5.r = f19;
                                        }
                                    } else {
                                        if (i48 != -1) {
                                            iVarB9 = b(i48);
                                            if (iVarB9 != null) {
                                                e eVar10 = e.LEFT;
                                                iVar4 = iVarC;
                                                iVar4.l(eVar10, iVarB9, eVar10, ((ViewGroup.MarginLayoutParams) dVar3).leftMargin, i53);
                                            } else {
                                                iVar4 = iVarC;
                                            }
                                        } else {
                                            iVar4 = iVarC;
                                            if (i49 != -1) {
                                                iVar4.l(e.LEFT, iVarB, e.RIGHT, ((ViewGroup.MarginLayoutParams) dVar3).leftMargin, i53);
                                            }
                                        }
                                        if (i50 != -1) {
                                            iVarB8 = b(i50);
                                            if (iVarB8 != null) {
                                                iVar4.l(e.RIGHT, iVarB8, e.LEFT, ((ViewGroup.MarginLayoutParams) dVar3).rightMargin, i54);
                                            }
                                        } else if (i51 != -1) {
                                            e eVar11 = e.RIGHT;
                                            iVar4.l(eVar11, iVarB2, eVar11, ((ViewGroup.MarginLayoutParams) dVar3).rightMargin, i54);
                                        }
                                        i57 = dVar3.f27072h;
                                        if (i57 != -1) {
                                            iVarB7 = b(i57);
                                            if (iVarB7 != null) {
                                                e eVar12 = e.TOP;
                                                iVar4.l(eVar12, iVarB7, eVar12, ((ViewGroup.MarginLayoutParams) dVar3).topMargin, dVar3.f27086u);
                                            }
                                        } else {
                                            i58 = dVar3.f27074i;
                                            if (i58 != -1) {
                                                iVar4.l(e.TOP, iVarB3, e.BOTTOM, ((ViewGroup.MarginLayoutParams) dVar3).topMargin, dVar3.f27086u);
                                            }
                                        }
                                        i59 = dVar3.f27076j;
                                        if (i59 != -1) {
                                            iVarB6 = b(i59);
                                            if (iVarB6 != null) {
                                                iVar4.l(e.BOTTOM, iVarB6, e.TOP, ((ViewGroup.MarginLayoutParams) dVar3).bottomMargin, dVar3.f27088w);
                                            }
                                        } else {
                                            i60 = dVar3.k;
                                            if (i60 != -1) {
                                                e eVar13 = e.BOTTOM;
                                                iVar4.l(eVar13, iVarB4, eVar13, ((ViewGroup.MarginLayoutParams) dVar3).bottomMargin, dVar3.f27088w);
                                            }
                                        }
                                        iVar5 = iVar4;
                                        i61 = dVar3.f27078l;
                                        if (i61 != -1) {
                                            view3 = (View) this.f14851a.get(i61);
                                            iVarB5 = b(dVar3.f27078l);
                                            if (iVarB5 != null) {
                                                d dVar7 = (d) view3.getLayoutParams();
                                                dVar3.f27054W = true;
                                                dVar7.f27054W = true;
                                                e eVar14 = e.BASELINE;
                                                iVar5.f(eVar14).a(iVarB5.f(eVar14), 0, -1, p201t1.d.STRONG, 0, true);
                                                iVar5.f(e.TOP).d();
                                                iVar5.f(e.BOTTOM).d();
                                            }
                                        }
                                        if (f10 >= 0.0f) {
                                            iVar5.f26601V = f10;
                                        }
                                        f11 = dVar3.f27032A;
                                        if (f11 >= 0.0f) {
                                            iVar5.f26602W = f11;
                                        }
                                    }
                                    if (z29) {
                                        iVar5 = iVarC;
                                        i64 = dVar3.f27047P;
                                        if (i64 == -1) {
                                            iVar5 = iVarC;
                                            iVar5 = iVarC;
                                            int i812 = dVar3.f27048Q;
                                            iVar5.f26588I = i64;
                                            iVar5.f26589J = i812;
                                        } else {
                                            iVar5 = iVarC;
                                            iVar5 = iVarC;
                                            int i813 = dVar3.f27048Q;
                                            iVar5.f26588I = i64;
                                            iVar5.f26589J = i813;
                                        }
                                    }
                                    iVar5 = iVarC;
                                    iVar5 = iVarC;
                                    iVar5 = iVarC;
                                    if (dVar3.f27052U) {
                                        iVar5.t(h.FIXED);
                                        iVar5.x(((ViewGroup.MarginLayoutParams) dVar3).width);
                                    } else if (((ViewGroup.MarginLayoutParams) dVar3).width == -1) {
                                        iVar5.t(h.MATCH_PARENT);
                                        iVar5.f(e.LEFT).f26573e = ((ViewGroup.MarginLayoutParams) dVar3).leftMargin;
                                        iVar5.f(e.RIGHT).f26573e = ((ViewGroup.MarginLayoutParams) dVar3).rightMargin;
                                    } else {
                                        iVar5.t(h.MATCH_CONSTRAINT);
                                        iVar5.x(0);
                                    }
                                    if (dVar3.f27053V) {
                                        iVar5.w(h.FIXED);
                                        iVar5.s(((ViewGroup.MarginLayoutParams) dVar3).height);
                                    } else if (((ViewGroup.MarginLayoutParams) dVar3).height == -1) {
                                        iVar5.w(h.MATCH_PARENT);
                                        iVar5.f(e.TOP).f26573e = ((ViewGroup.MarginLayoutParams) dVar3).topMargin;
                                        iVar5.f(e.BOTTOM).f26573e = ((ViewGroup.MarginLayoutParams) dVar3).bottomMargin;
                                    } else {
                                        iVar5.w(h.MATCH_CONSTRAINT);
                                        iVar5.s(0);
                                    }
                                    str = dVar3.f27033B;
                                    if (str != null) {
                                        if (str.length() == 0) {
                                            iVar5.f26586G = 0.0f;
                                        } else {
                                            int length2 = str.length();
                                            iIndexOf = str.indexOf(44);
                                            if (iIndexOf > 0) {
                                                i62 = 0;
                                                i63 = -1;
                                            } else {
                                                i62 = 0;
                                                i63 = -1;
                                            }
                                            iIndexOf2 = str.indexOf(58);
                                            if (iIndexOf2 >= 0) {
                                                strSubstring = str.substring(i62);
                                                if (strSubstring.length() > 0) {
                                                    fAbs = Float.parseFloat(strSubstring);
                                                } else {
                                                    fAbs = 0.0f;
                                                }
                                            } else {
                                                strSubstring = str.substring(i62);
                                                if (strSubstring.length() > 0) {
                                                    fAbs = Float.parseFloat(strSubstring);
                                                } else {
                                                    fAbs = 0.0f;
                                                }
                                            }
                                            if (fAbs > 0.0f) {
                                                iVar5.f26586G = fAbs;
                                                iVar5.f26587H = i63;
                                            }
                                        }
                                    }
                                    float f110 = dVar3.f27035D;
                                    float[] fArr2 = iVar5.f26617f0;
                                    fArr2[0] = f110;
                                    fArr2[1] = dVar3.f27036E;
                                    iVar5.f26613d0 = dVar3.f27037F;
                                    iVar5.f26615e0 = dVar3.f27038G;
                                    int i814 = dVar3.f27039H;
                                    int i815 = dVar3.f27041J;
                                    int i816 = dVar3.f27043L;
                                    f12 = dVar3.f27045N;
                                    iVar5.f26614e = i814;
                                    iVar5.f26620h = i815;
                                    iVar5.f26622i = i816;
                                    iVar5.f26623j = f12;
                                    if (f12 < 1.0f) {
                                        iVar5.f26614e = 2;
                                    }
                                    int i817 = dVar3.f27040I;
                                    int i818 = dVar3.f27042K;
                                    int i819 = dVar3.f27044M;
                                    f13 = dVar3.f27046O;
                                    iVar5.f26616f = i817;
                                    iVar5.k = i818;
                                    iVar5.f26624l = i819;
                                    iVar5.f26625m = f13;
                                    if (f13 >= 1.0f) {
                                    }
                                }
                                i52 = i47;
                                i56 = childCount4;
                            }
                            i47 = i52 + 1;
                            childCount4 = i56;
                        }
                        break;
                        break;
                    }
                    i44++;
                }
                z11 = true;
            } else {
                i14 = mode;
                i15 = size5;
                i16 = mode2;
                size6 = size6;
                paddingLeft2 = paddingLeft2;
                i17 = paddingTop2;
                z11 = false;
            }
            if ((this.f14860j & 8) == 8) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                size3 = jVar.f26638i0.size();
                jVar.p();
                while (i43 < size3) {
                    ((p201t1.i) jVar.f26638i0.get(i43)).p();
                }
                jVar.c(jVar.f26652w0);
                hVarArr3 = jVar.f26582C;
                hVar7 = hVarArr3[0];
                hVar8 = h.WRAP_CONTENT;
                if (hVar7 != hVar8) {
                    pVar2.g(iK);
                }
                if (hVarArr3[1] != hVar8) {
                    pVar.g(iG);
                }
                d(i10, i11);
            } else {
                int paddingBottom4 = getPaddingBottom() + getPaddingTop();
                int paddingRight4 = getPaddingRight() + getPaddingLeft();
                childCount = getChildCount();
                i18 = 0;
                while (i18 < childCount) {
                    childAt = getChildAt(i18);
                    boolean z35 = z11;
                    if (childAt.getVisibility() == 8) {
                        i19 = childCount;
                    } else {
                        dVar = (d) childAt.getLayoutParams();
                        p201t1.i iVar9 = dVar.f27077j0;
                        i19 = childCount;
                        if (dVar.f27055X) {
                        }
                        i18 = i20 + 1;
                        z11 = z35;
                        childCount = i19;
                        z12 = z13;
                        iK = i21;
                        iG = i22;
                    }
                    i20 = i18;
                    i21 = iK;
                    i22 = iG;
                    z13 = z12;
                    i18 = i20 + 1;
                    z11 = z35;
                    childCount = i19;
                    z12 = z13;
                    iK = i21;
                    iG = i22;
                }
            }
            boolean z36 = z11;
            i26 = iK;
            i27 = iG;
            z17 = z12;
            childCount2 = getChildCount();
            while (i28 < childCount2) {
                getChildAt(i28);
            }
            size = arrayList.size();
            if (size > 0) {
                while (i42 < size) {
                    ((p211u1.b) arrayList.get(i42)).getClass();
                }
            }
            if (getChildCount() > 0) {
                if ((jVar.f26652w0 & 32) == 32) {
                    jVar.f26653x0 = true;
                    jVar.f26647r0 = false;
                    jVar.f26648s0 = false;
                    jVar.f26649t0 = false;
                    ArrayList<p201t1.i> arrayList5 = jVar.f26638i0;
                    arrayList3 = jVar.f26646q0;
                    hVarArr2 = jVar.f26582C;
                    hVar5 = hVarArr2[0];
                    hVar6 = h.WRAP_CONTENT;
                    if (hVar5 == hVar6) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    if (hVarArr2[1] == hVar6) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    if (z26) {
                        z28 = true;
                    } else {
                        z28 = true;
                    }
                    arrayList3.clear();
                    while (r11.hasNext()) {
                        iVar7.f26628p = null;
                        iVar7.f26611c0 = false;
                        iVar7.p();
                    }
                    it = arrayList5.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            iMax3 = 0;
                            iMax4 = 0;
                            while (r4.hasNext()) {
                                iMax3 = Math.max(iMax3, n.c(kVar2, 0));
                                iMax4 = Math.max(iMax4, n.c(kVar2, 1));
                            }
                            if (z26) {
                                jVar.t(h.FIXED);
                                jVar.x(iMax3);
                                jVar.f26647r0 = true;
                                jVar.f26648s0 = true;
                                jVar.f26650u0 = iMax3;
                            }
                            if (z27) {
                                jVar.w(h.FIXED);
                                jVar.s(iMax4);
                                jVar.f26647r0 = true;
                                jVar.f26649t0 = true;
                                jVar.f26651v0 = iMax4;
                            }
                            n.i(arrayList3, 0, jVar.k());
                            n.i(arrayList3, 1, jVar.g());
                            break;
                        }
                        iVar2 = (p201t1.i) it.next();
                        if (iVar2.f26628p == null) {
                            kVar = new k(new ArrayList());
                            arrayList3.add(kVar);
                            if (!n.j(iVar2, kVar, arrayList3, z28)) {
                                jVar.f26646q0.clear();
                                jVar.f26646q0.add(0, new k((List) jVar.f26638i0));
                                jVar.f26653x0 = false;
                                break;
                            }
                        }
                    }
                } else {
                    jVar.f26646q0.clear();
                    jVar.f26646q0.add(0, new k((List) jVar.f26638i0));
                }
            }
            if (jVar.f26647r0) {
                if (jVar.f26648s0) {
                    i32 = i14;
                    if (i32 == Integer.MIN_VALUE) {
                        i41 = jVar.f26650u0;
                        i31 = i15;
                        if (i41 < i31) {
                            jVar.x(i41);
                        }
                        jVar.t(h.FIXED);
                    } else {
                        i31 = i15;
                    }
                } else {
                    i31 = i15;
                    i32 = i14;
                }
                if (jVar.f26649t0) {
                    i30 = i16;
                    if (i30 == Integer.MIN_VALUE) {
                        i40 = jVar.f26651v0;
                        i29 = size6;
                        if (i40 < i29) {
                            jVar.s(i40);
                        }
                        jVar.w(h.FIXED);
                    } else {
                        i29 = size6;
                    }
                } else {
                    i29 = size6;
                    i30 = i16;
                }
            } else {
                i29 = size6;
                i30 = i16;
                i31 = i15;
                i32 = i14;
            }
            if ((this.f14860j & 32) == 32) {
                iK2 = jVar.k();
                iG2 = jVar.g();
                if (this.f14863n != iK2) {
                    i39 = 1073741824;
                    if (i32 == 1073741824) {
                        n.i(jVar.f26646q0, 0, iK2);
                    }
                } else {
                    i39 = 1073741824;
                }
                if (this.f14864o != iG2) {
                    n.i(jVar.f26646q0, 1, iG2);
                }
                if (jVar.f26648s0) {
                    n.i(jVar.f26646q0, 0, i31);
                }
                if (jVar.f26649t0) {
                    n.i(jVar.f26646q0, 1, i29);
                }
            }
            if (getChildCount() > 0) {
                this.f14854d.C();
            }
            size2 = arrayList2.size();
            paddingBottom = getPaddingBottom() + i17;
            paddingRight = getPaddingRight() + paddingLeft2;
            if (size2 > 0) {
                hVarArr = jVar.f26582C;
                hVar3 = hVarArr[0];
                hVar4 = h.WRAP_CONTENT;
                if (hVar3 == hVar4) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = true;
                if (hVarArr[1] == hVar4) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                iMax = Math.max(jVar.k(), this.f14855e);
                iMax2 = Math.max(jVar.g(), this.f14856f);
                i36 = 0;
                z21 = false;
                int iCombineMeasuredStates2 = 0;
                while (i36 < size2) {
                    p201t1.i iVar10 = (p201t1.i) arrayList2.get(i36);
                    boolean z37 = z20;
                    view2 = iVar10.f26603X;
                    if (view2 == null) {
                        i38 = i36;
                        z23 = z21;
                    } else {
                        i38 = i36;
                        dVar2 = (d) view2.getLayoutParams();
                        z23 = z21;
                        if (dVar2.f27056Y) {
                        }
                    }
                    z24 = z18;
                    z21 = z23;
                    i36 = i38 + 1;
                    z20 = z37;
                    z18 = z24;
                    paddingRight = paddingRight;
                    paddingBottom = paddingBottom;
                }
                i33 = paddingBottom;
                i34 = paddingRight;
                if (z21) {
                    jVar.x(i26);
                    jVar.s(i27);
                    if (z17) {
                        jVar.E();
                    }
                    this.f14854d.C();
                    if (jVar.k() < iMax) {
                        jVar.x(iMax);
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    if (jVar.g() < iMax2) {
                        jVar.s(iMax2);
                    } else {
                        z19 = z22;
                    }
                    if (z19) {
                        this.f14854d.C();
                    }
                }
                while (i37 < size2) {
                    iVar = (p201t1.i) arrayList2.get(i37);
                    view = iVar.f26603X;
                    if (view == null) {
                        if (iVar.f26604Y != 8) {
                            view.measure(View.MeasureSpec.makeMeasureSpec(iVar.k(), 1073741824), View.MeasureSpec.makeMeasureSpec(iVar.g(), 1073741824));
                        }
                    }
                }
                i35 = iCombineMeasuredStates2;
            } else {
                i33 = paddingBottom;
                i34 = paddingRight;
                i35 = 0;
            }
            int iK4 = jVar.k() + i34;
            int iG4 = jVar.g() + i33;
            int iResolveSizeAndState3 = View.resolveSizeAndState(iK4, i10, i35);
            int iResolveSizeAndState4 = View.resolveSizeAndState(iG4, i11, i35 << 16) & 16777215;
            iMin = Math.min(this.f14857g, iResolveSizeAndState3 & 16777215);
            iMin2 = Math.min(this.f14858h, iResolveSizeAndState4);
            if (jVar.f26654y0) {
                iMin |= 16777216;
            }
            if (jVar.f26655z0) {
                iMin2 |= 16777216;
            }
            setMeasuredDimension(iMin, iMin2);
            this.f14863n = iMin;
            this.f14864o = iMin2;
        }
        hVar9 = h.WRAP_CONTENT;
        hVar2 = hVar9;
        i12 = 0;
        jVar.f26597R = i12;
        jVar.f26598S = i12;
        jVar.t(hVar);
        jVar.x(size7);
        jVar.w(hVar2);
        jVar.s(size8);
        paddingLeft = (this.f14855e - getPaddingLeft()) - getPaddingRight();
        if (paddingLeft < 0) {
            i13 = 0;
            jVar.f26597R = 0;
        } else {
            i13 = 0;
            jVar.f26597R = paddingLeft;
        }
        paddingTop = (this.f14856f - getPaddingTop()) - getPaddingBottom();
        if (paddingTop < 0) {
            jVar.f26598S = i13;
        } else {
            jVar.f26598S = paddingTop;
        }
        iK = jVar.k();
        iG = jVar.g();
        z10 = this.f14859i;
        arrayList = this.f14852b;
        arrayList2 = this.f14853c;
        if (z10) {
            this.f14859i = false;
            childCount3 = getChildCount();
            i44 = 0;
            while (true) {
                if (i44 >= childCount3) {
                    i14 = mode;
                    i15 = size5;
                    i16 = mode2;
                    size6 = size6;
                    i17 = paddingTop2;
                    break;
                }
                if (getChildAt(i44).isLayoutRequested()) {
                    arrayList2.clear();
                    zIsInEditMode = isInEditMode();
                    childCount4 = getChildCount();
                    if (zIsInEditMode) {
                        i78 = 0;
                        while (i78 < childCount4) {
                            childAt4 = getChildAt(i78);
                            int i8110 = i78;
                            i79 = paddingTop2;
                            resourceName = getResources().getResourceName(childAt4.getId());
                            e(Integer.valueOf(childAt4.getId()), resourceName);
                            iIndexOf3 = resourceName.indexOf(47);
                            z30 = zIsInEditMode;
                            if (iIndexOf3 != -1) {
                                resourceName = resourceName.substring(iIndexOf3 + 1);
                                b(childAt4.getId()).f26605Z = resourceName;
                            } else {
                                b(childAt4.getId()).f26605Z = resourceName;
                            }
                            i78 = i8110 + 1;
                            paddingTop2 = i79;
                            zIsInEditMode = z30;
                        }
                    }
                    i17 = paddingTop2;
                    z29 = zIsInEditMode;
                    while (i45 < childCount4) {
                        iVarC2 = c(getChildAt(i45));
                        if (iVarC2 != null) {
                            iVarC2.o();
                        }
                    }
                    if (this.f14861l != -1) {
                        while (i77 < childCount4) {
                            getChildAt(i77).getId();
                        }
                    }
                    fVar = this.k;
                    if (fVar != null) {
                        childCount5 = getChildCount();
                        map = fVar.f27162a;
                        hashSet = new HashSet(map.keySet());
                        i68 = 0;
                        while (i68 < childCount5) {
                            i70 = childCount5;
                            childAt3 = getChildAt(i68);
                            i71 = i68;
                            id = childAt3.getId();
                            i72 = mode2;
                            if (id == -1) {
                                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                            }
                            if (map.containsKey(Integer.valueOf(id))) {
                                hashSet.remove(Integer.valueOf(id));
                                eVar2 = (p211u1.e) map.get(Integer.valueOf(id));
                                hashSet2 = hashSet;
                                if (childAt3 instanceof a) {
                                    i75 = 1;
                                    eVar2.f27148p0 = 1;
                                } else {
                                    i75 = 1;
                                }
                                i74 = size5;
                                i76 = eVar2.f27148p0;
                                i73 = mode;
                                if (i76 != -1) {
                                    aVar = (a) childAt3;
                                    aVar.setId(id);
                                    aVar.setType(eVar2.f27146o0);
                                    aVar.setAllowsGoneWidget(eVar2.f27144n0);
                                    iArr = eVar2.f27150q0;
                                    if (iArr != null) {
                                        aVar.setReferencedIds(iArr);
                                    } else {
                                        str2 = eVar2.f27151r0;
                                        if (str2 != null) {
                                            int[] iArrA4 = f.a(aVar, str2);
                                            eVar2.f27150q0 = iArrA4;
                                            aVar.setReferencedIds(iArrA4);
                                        }
                                    }
                                }
                                d dVar8 = (d) childAt3.getLayoutParams();
                                eVar2.a(dVar8);
                                childAt3.setLayoutParams(dVar8);
                                childAt3.setVisibility(eVar2.f27101J);
                                childAt3.setAlpha(eVar2.f27112U);
                                childAt3.setRotation(eVar2.f27115X);
                                childAt3.setRotationX(eVar2.f27116Y);
                                childAt3.setRotationY(eVar2.f27117Z);
                                childAt3.setScaleX(eVar2.f27119a0);
                                childAt3.setScaleY(eVar2.f27121b0);
                                if (!Float.isNaN(eVar2.f27123c0)) {
                                    childAt3.setPivotX(eVar2.f27123c0);
                                }
                                if (!Float.isNaN(eVar2.f27125d0)) {
                                    childAt3.setPivotY(eVar2.f27125d0);
                                }
                                childAt3.setTranslationX(eVar2.f27127e0);
                                childAt3.setTranslationY(eVar2.f27129f0);
                                childAt3.setTranslationZ(eVar2.f27131g0);
                                if (eVar2.f27113V) {
                                    childAt3.setElevation(eVar2.f27114W);
                                }
                            } else {
                                i73 = mode;
                                i74 = size5;
                                hashSet2 = hashSet;
                            }
                            i68 = i71 + 1;
                            childCount5 = i70;
                            mode2 = i72;
                            hashSet = hashSet2;
                            size5 = i74;
                            mode = i73;
                        }
                        i14 = mode;
                        i15 = size5;
                        i16 = mode2;
                        while (it2.hasNext()) {
                            num = (Integer) it2.next();
                            eVar = (p211u1.e) map.get(num);
                            i69 = eVar.f27148p0;
                            if (i69 == -1) {
                            }
                            if (eVar.f27118a) {
                                View gVar3 = new g(getContext());
                                gVar3.setId(num.intValue());
                                d dVarA4 = a();
                                eVar.a(dVarA4);
                                addView(gVar3, dVarA4);
                            }
                        }
                    } else {
                        i14 = mode;
                        i15 = size5;
                        i16 = mode2;
                    }
                    jVar.f26638i0.clear();
                    size4 = arrayList.size();
                    if (size4 > 0) {
                        while (i67 < size4) {
                            ((p211u1.b) arrayList.get(i67)).b(this);
                        }
                    }
                    while (i46 < childCount4) {
                        getChildAt(i46);
                    }
                    i47 = 0;
                    while (i47 < childCount4) {
                        childAt2 = getChildAt(i47);
                        iVarC = c(childAt2);
                        if (iVarC == null) {
                            i52 = i47;
                            i56 = childCount4;
                        } else {
                            dVar3 = (d) childAt2.getLayoutParams();
                            dVar3.a();
                            if (z29) {
                                String resourceName4 = getResources().getResourceName(childAt2.getId());
                                e(Integer.valueOf(childAt2.getId()), resourceName4);
                                b(childAt2.getId()).f26605Z = resourceName4.substring(resourceName4.indexOf("id/") + 3);
                            }
                            iVarC.f26604Y = childAt2.getVisibility();
                            iVarC.f26603X = childAt2;
                            jVar.f26638i0.add(iVarC);
                            iVar3 = iVarC.f26583D;
                            if (iVar3 != null) {
                                ((j) iVar3).f26638i0.remove(iVarC);
                                iVarC.f26583D = null;
                            }
                            iVarC.f26583D = jVar;
                            if (dVar3.f27053V) {
                                arrayList2.add(iVarC);
                            } else {
                                arrayList2.add(iVarC);
                            }
                            if (dVar3.f27055X) {
                                mVar = (m) iVarC;
                                i65 = dVar3.f27071g0;
                                i66 = dVar3.f27073h0;
                                f14 = dVar3.f27075i0;
                                if (f14 != -1.0f) {
                                    if (f14 > -1.0f) {
                                        mVar.f26666i0 = f14;
                                        mVar.f26667j0 = -1;
                                        mVar.f26668k0 = -1;
                                    }
                                } else if (i65 != -1) {
                                    if (i65 > -1) {
                                        mVar.f26666i0 = -1.0f;
                                        mVar.f26667j0 = i65;
                                        mVar.f26668k0 = -1;
                                    }
                                } else if (i66 != -1) {
                                    mVar.f26666i0 = -1.0f;
                                    mVar.f26667j0 = -1;
                                    mVar.f26668k0 = i66;
                                }
                            } else {
                                if (dVar3.f27064d == -1) {
                                }
                                i48 = dVar3.f27057Z;
                                i49 = dVar3.f27059a0;
                                i50 = dVar3.f27061b0;
                                i51 = dVar3.f27063c0;
                                i52 = i47;
                                i53 = dVar3.f27065d0;
                                i54 = dVar3.f27067e0;
                                f10 = dVar3.f27069f0;
                                i55 = dVar3.f27079m;
                                i56 = childCount4;
                                if (i55 != -1) {
                                    iVarB10 = b(i55);
                                    if (iVarB10 != null) {
                                        float f111 = dVar3.f27081o;
                                        int i8111 = dVar3.f27080n;
                                        e eVar15 = e.CENTER;
                                        iVarC.l(eVar15, iVarB10, eVar15, i8111, 0);
                                        iVar5.r = f111;
                                    }
                                } else {
                                    if (i48 != -1) {
                                        iVarB9 = b(i48);
                                        if (iVarB9 != null) {
                                            e eVar16 = e.LEFT;
                                            iVar4 = iVarC;
                                            iVar4.l(eVar16, iVarB9, eVar16, ((ViewGroup.MarginLayoutParams) dVar3).leftMargin, i53);
                                        } else {
                                            iVar4 = iVarC;
                                        }
                                    } else {
                                        iVar4 = iVarC;
                                        if (i49 != -1) {
                                            iVar4.l(e.LEFT, iVarB, e.RIGHT, ((ViewGroup.MarginLayoutParams) dVar3).leftMargin, i53);
                                        }
                                    }
                                    if (i50 != -1) {
                                        iVarB8 = b(i50);
                                        if (iVarB8 != null) {
                                            iVar4.l(e.RIGHT, iVarB8, e.LEFT, ((ViewGroup.MarginLayoutParams) dVar3).rightMargin, i54);
                                        }
                                    } else if (i51 != -1) {
                                        e eVar17 = e.RIGHT;
                                        iVar4.l(eVar17, iVarB2, eVar17, ((ViewGroup.MarginLayoutParams) dVar3).rightMargin, i54);
                                    }
                                    i57 = dVar3.f27072h;
                                    if (i57 != -1) {
                                        iVarB7 = b(i57);
                                        if (iVarB7 != null) {
                                            e eVar18 = e.TOP;
                                            iVar4.l(eVar18, iVarB7, eVar18, ((ViewGroup.MarginLayoutParams) dVar3).topMargin, dVar3.f27086u);
                                        }
                                    } else {
                                        i58 = dVar3.f27074i;
                                        if (i58 != -1) {
                                            iVar4.l(e.TOP, iVarB3, e.BOTTOM, ((ViewGroup.MarginLayoutParams) dVar3).topMargin, dVar3.f27086u);
                                        }
                                    }
                                    i59 = dVar3.f27076j;
                                    if (i59 != -1) {
                                        iVarB6 = b(i59);
                                        if (iVarB6 != null) {
                                            iVar4.l(e.BOTTOM, iVarB6, e.TOP, ((ViewGroup.MarginLayoutParams) dVar3).bottomMargin, dVar3.f27088w);
                                        }
                                    } else {
                                        i60 = dVar3.k;
                                        if (i60 != -1) {
                                            e eVar19 = e.BOTTOM;
                                            iVar4.l(eVar19, iVarB4, eVar19, ((ViewGroup.MarginLayoutParams) dVar3).bottomMargin, dVar3.f27088w);
                                        }
                                    }
                                    iVar5 = iVar4;
                                    i61 = dVar3.f27078l;
                                    if (i61 != -1) {
                                        view3 = (View) this.f14851a.get(i61);
                                        iVarB5 = b(dVar3.f27078l);
                                        if (iVarB5 != null) {
                                            d dVar9 = (d) view3.getLayoutParams();
                                            dVar3.f27054W = true;
                                            dVar9.f27054W = true;
                                            e eVar110 = e.BASELINE;
                                            iVar5.f(eVar110).a(iVarB5.f(eVar110), 0, -1, p201t1.d.STRONG, 0, true);
                                            iVar5.f(e.TOP).d();
                                            iVar5.f(e.BOTTOM).d();
                                        }
                                    }
                                    if (f10 >= 0.0f) {
                                        iVar5.f26601V = f10;
                                    }
                                    f11 = dVar3.f27032A;
                                    if (f11 >= 0.0f) {
                                        iVar5.f26602W = f11;
                                    }
                                }
                                if (z29) {
                                    iVar5 = iVarC;
                                    i64 = dVar3.f27047P;
                                    if (i64 == -1) {
                                        iVar5 = iVarC;
                                        iVar5 = iVarC;
                                        int i8112 = dVar3.f27048Q;
                                        iVar5.f26588I = i64;
                                        iVar5.f26589J = i8112;
                                    } else {
                                        iVar5 = iVarC;
                                        iVar5 = iVarC;
                                        int i8113 = dVar3.f27048Q;
                                        iVar5.f26588I = i64;
                                        iVar5.f26589J = i8113;
                                    }
                                }
                                iVar5 = iVarC;
                                iVar5 = iVarC;
                                iVar5 = iVarC;
                                if (dVar3.f27052U) {
                                    iVar5.t(h.FIXED);
                                    iVar5.x(((ViewGroup.MarginLayoutParams) dVar3).width);
                                } else if (((ViewGroup.MarginLayoutParams) dVar3).width == -1) {
                                    iVar5.t(h.MATCH_PARENT);
                                    iVar5.f(e.LEFT).f26573e = ((ViewGroup.MarginLayoutParams) dVar3).leftMargin;
                                    iVar5.f(e.RIGHT).f26573e = ((ViewGroup.MarginLayoutParams) dVar3).rightMargin;
                                } else {
                                    iVar5.t(h.MATCH_CONSTRAINT);
                                    iVar5.x(0);
                                }
                                if (dVar3.f27053V) {
                                    iVar5.w(h.FIXED);
                                    iVar5.s(((ViewGroup.MarginLayoutParams) dVar3).height);
                                } else if (((ViewGroup.MarginLayoutParams) dVar3).height == -1) {
                                    iVar5.w(h.MATCH_PARENT);
                                    iVar5.f(e.TOP).f26573e = ((ViewGroup.MarginLayoutParams) dVar3).topMargin;
                                    iVar5.f(e.BOTTOM).f26573e = ((ViewGroup.MarginLayoutParams) dVar3).bottomMargin;
                                } else {
                                    iVar5.w(h.MATCH_CONSTRAINT);
                                    iVar5.s(0);
                                }
                                str = dVar3.f27033B;
                                if (str != null) {
                                    if (str.length() == 0) {
                                        iVar5.f26586G = 0.0f;
                                    } else {
                                        int length3 = str.length();
                                        iIndexOf = str.indexOf(44);
                                        if (iIndexOf > 0) {
                                            i62 = 0;
                                            i63 = -1;
                                        } else {
                                            i62 = 0;
                                            i63 = -1;
                                        }
                                        iIndexOf2 = str.indexOf(58);
                                        if (iIndexOf2 >= 0) {
                                            strSubstring = str.substring(i62);
                                            if (strSubstring.length() > 0) {
                                                fAbs = Float.parseFloat(strSubstring);
                                            } else {
                                                fAbs = 0.0f;
                                            }
                                        } else {
                                            strSubstring = str.substring(i62);
                                            if (strSubstring.length() > 0) {
                                                fAbs = Float.parseFloat(strSubstring);
                                            } else {
                                                fAbs = 0.0f;
                                            }
                                        }
                                        if (fAbs > 0.0f) {
                                            iVar5.f26586G = fAbs;
                                            iVar5.f26587H = i63;
                                        }
                                    }
                                }
                                float f112 = dVar3.f27035D;
                                float[] fArr3 = iVar5.f26617f0;
                                fArr3[0] = f112;
                                fArr3[1] = dVar3.f27036E;
                                iVar5.f26613d0 = dVar3.f27037F;
                                iVar5.f26615e0 = dVar3.f27038G;
                                int i8114 = dVar3.f27039H;
                                int i8115 = dVar3.f27041J;
                                int i8116 = dVar3.f27043L;
                                f12 = dVar3.f27045N;
                                iVar5.f26614e = i8114;
                                iVar5.f26620h = i8115;
                                iVar5.f26622i = i8116;
                                iVar5.f26623j = f12;
                                if (f12 < 1.0f) {
                                    iVar5.f26614e = 2;
                                }
                                int i8117 = dVar3.f27040I;
                                int i8118 = dVar3.f27042K;
                                int i8119 = dVar3.f27044M;
                                f13 = dVar3.f27046O;
                                iVar5.f26616f = i8117;
                                iVar5.k = i8118;
                                iVar5.f26624l = i8119;
                                iVar5.f26625m = f13;
                                if (f13 >= 1.0f) {
                                }
                            }
                            i52 = i47;
                            i56 = childCount4;
                        }
                        i47 = i52 + 1;
                        childCount4 = i56;
                    }
                    break;
                    break;
                }
                i44++;
            }
            z11 = true;
        } else {
            i14 = mode;
            i15 = size5;
            i16 = mode2;
            size6 = size6;
            paddingLeft2 = paddingLeft2;
            i17 = paddingTop2;
            z11 = false;
        }
        if ((this.f14860j & 8) == 8) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            size3 = jVar.f26638i0.size();
            jVar.p();
            while (i43 < size3) {
                ((p201t1.i) jVar.f26638i0.get(i43)).p();
            }
            jVar.c(jVar.f26652w0);
            hVarArr3 = jVar.f26582C;
            hVar7 = hVarArr3[0];
            hVar8 = h.WRAP_CONTENT;
            if (hVar7 != hVar8) {
                pVar2.g(iK);
            }
            if (hVarArr3[1] != hVar8) {
                pVar.g(iG);
            }
            d(i10, i11);
        } else {
            int paddingBottom5 = getPaddingBottom() + getPaddingTop();
            int paddingRight5 = getPaddingRight() + getPaddingLeft();
            childCount = getChildCount();
            i18 = 0;
            while (i18 < childCount) {
                childAt = getChildAt(i18);
                boolean z38 = z11;
                if (childAt.getVisibility() == 8) {
                    i19 = childCount;
                } else {
                    dVar = (d) childAt.getLayoutParams();
                    p201t1.i iVar11 = dVar.f27077j0;
                    i19 = childCount;
                    if (dVar.f27055X) {
                    }
                    i18 = i20 + 1;
                    z11 = z38;
                    childCount = i19;
                    z12 = z13;
                    iK = i21;
                    iG = i22;
                }
                i20 = i18;
                i21 = iK;
                i22 = iG;
                z13 = z12;
                i18 = i20 + 1;
                z11 = z38;
                childCount = i19;
                z12 = z13;
                iK = i21;
                iG = i22;
            }
        }
        boolean z39 = z11;
        i26 = iK;
        i27 = iG;
        z17 = z12;
        childCount2 = getChildCount();
        while (i28 < childCount2) {
            getChildAt(i28);
        }
        size = arrayList.size();
        if (size > 0) {
            while (i42 < size) {
                ((p211u1.b) arrayList.get(i42)).getClass();
            }
        }
        if (getChildCount() > 0) {
            if ((jVar.f26652w0 & 32) == 32) {
                jVar.f26653x0 = true;
                jVar.f26647r0 = false;
                jVar.f26648s0 = false;
                jVar.f26649t0 = false;
                ArrayList<p201t1.i> arrayList6 = jVar.f26638i0;
                arrayList3 = jVar.f26646q0;
                hVarArr2 = jVar.f26582C;
                hVar5 = hVarArr2[0];
                hVar6 = h.WRAP_CONTENT;
                if (hVar5 == hVar6) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                if (hVarArr2[1] == hVar6) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                if (z26) {
                    z28 = true;
                } else {
                    z28 = true;
                }
                arrayList3.clear();
                while (r11.hasNext()) {
                    iVar7.f26628p = null;
                    iVar7.f26611c0 = false;
                    iVar7.p();
                }
                it = arrayList6.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        iMax3 = 0;
                        iMax4 = 0;
                        while (r4.hasNext()) {
                            iMax3 = Math.max(iMax3, n.c(kVar2, 0));
                            iMax4 = Math.max(iMax4, n.c(kVar2, 1));
                        }
                        if (z26) {
                            jVar.t(h.FIXED);
                            jVar.x(iMax3);
                            jVar.f26647r0 = true;
                            jVar.f26648s0 = true;
                            jVar.f26650u0 = iMax3;
                        }
                        if (z27) {
                            jVar.w(h.FIXED);
                            jVar.s(iMax4);
                            jVar.f26647r0 = true;
                            jVar.f26649t0 = true;
                            jVar.f26651v0 = iMax4;
                        }
                        n.i(arrayList3, 0, jVar.k());
                        n.i(arrayList3, 1, jVar.g());
                        break;
                    }
                    iVar2 = (p201t1.i) it.next();
                    if (iVar2.f26628p == null) {
                        kVar = new k(new ArrayList());
                        arrayList3.add(kVar);
                        if (!n.j(iVar2, kVar, arrayList3, z28)) {
                            jVar.f26646q0.clear();
                            jVar.f26646q0.add(0, new k((List) jVar.f26638i0));
                            jVar.f26653x0 = false;
                            break;
                        }
                    }
                }
            } else {
                jVar.f26646q0.clear();
                jVar.f26646q0.add(0, new k((List) jVar.f26638i0));
            }
        }
        if (jVar.f26647r0) {
            if (jVar.f26648s0) {
                i32 = i14;
                if (i32 == Integer.MIN_VALUE) {
                    i41 = jVar.f26650u0;
                    i31 = i15;
                    if (i41 < i31) {
                        jVar.x(i41);
                    }
                    jVar.t(h.FIXED);
                } else {
                    i31 = i15;
                }
            } else {
                i31 = i15;
                i32 = i14;
            }
            if (jVar.f26649t0) {
                i30 = i16;
                if (i30 == Integer.MIN_VALUE) {
                    i40 = jVar.f26651v0;
                    i29 = size6;
                    if (i40 < i29) {
                        jVar.s(i40);
                    }
                    jVar.w(h.FIXED);
                } else {
                    i29 = size6;
                }
            } else {
                i29 = size6;
                i30 = i16;
            }
        } else {
            i29 = size6;
            i30 = i16;
            i31 = i15;
            i32 = i14;
        }
        if ((this.f14860j & 32) == 32) {
            iK2 = jVar.k();
            iG2 = jVar.g();
            if (this.f14863n != iK2) {
                i39 = 1073741824;
                if (i32 == 1073741824) {
                    n.i(jVar.f26646q0, 0, iK2);
                }
            } else {
                i39 = 1073741824;
            }
            if (this.f14864o != iG2) {
                n.i(jVar.f26646q0, 1, iG2);
            }
            if (jVar.f26648s0) {
                n.i(jVar.f26646q0, 0, i31);
            }
            if (jVar.f26649t0) {
                n.i(jVar.f26646q0, 1, i29);
            }
        }
        if (getChildCount() > 0) {
            this.f14854d.C();
        }
        size2 = arrayList2.size();
        paddingBottom = getPaddingBottom() + i17;
        paddingRight = getPaddingRight() + paddingLeft2;
        if (size2 > 0) {
            hVarArr = jVar.f26582C;
            hVar3 = hVarArr[0];
            hVar4 = h.WRAP_CONTENT;
            if (hVar3 == hVar4) {
                z18 = true;
            } else {
                z18 = false;
            }
            z19 = true;
            if (hVarArr[1] == hVar4) {
                z20 = true;
            } else {
                z20 = false;
            }
            iMax = Math.max(jVar.k(), this.f14855e);
            iMax2 = Math.max(jVar.g(), this.f14856f);
            i36 = 0;
            z21 = false;
            int iCombineMeasuredStates3 = 0;
            while (i36 < size2) {
                p201t1.i iVar12 = (p201t1.i) arrayList2.get(i36);
                boolean z310 = z20;
                view2 = iVar12.f26603X;
                if (view2 == null) {
                    i38 = i36;
                    z23 = z21;
                } else {
                    i38 = i36;
                    dVar2 = (d) view2.getLayoutParams();
                    z23 = z21;
                    if (dVar2.f27056Y) {
                    }
                }
                z24 = z18;
                z21 = z23;
                i36 = i38 + 1;
                z20 = z310;
                z18 = z24;
                paddingRight = paddingRight;
                paddingBottom = paddingBottom;
            }
            i33 = paddingBottom;
            i34 = paddingRight;
            if (z21) {
                jVar.x(i26);
                jVar.s(i27);
                if (z17) {
                    jVar.E();
                }
                this.f14854d.C();
                if (jVar.k() < iMax) {
                    jVar.x(iMax);
                    z22 = true;
                } else {
                    z22 = false;
                }
                if (jVar.g() < iMax2) {
                    jVar.s(iMax2);
                } else {
                    z19 = z22;
                }
                if (z19) {
                    this.f14854d.C();
                }
            }
            while (i37 < size2) {
                iVar = (p201t1.i) arrayList2.get(i37);
                view = iVar.f26603X;
                if (view == null) {
                    if (iVar.f26604Y != 8) {
                        view.measure(View.MeasureSpec.makeMeasureSpec(iVar.k(), 1073741824), View.MeasureSpec.makeMeasureSpec(iVar.g(), 1073741824));
                    }
                }
            }
            i35 = iCombineMeasuredStates3;
        } else {
            i33 = paddingBottom;
            i34 = paddingRight;
            i35 = 0;
        }
        int iK5 = jVar.k() + i34;
        int iG5 = jVar.g() + i33;
        int iResolveSizeAndState5 = View.resolveSizeAndState(iK5, i10, i35);
        int iResolveSizeAndState6 = View.resolveSizeAndState(iG5, i11, i35 << 16) & 16777215;
        iMin = Math.min(this.f14857g, iResolveSizeAndState5 & 16777215);
        iMin2 = Math.min(this.f14858h, iResolveSizeAndState6);
        if (jVar.f26654y0) {
            iMin |= 16777216;
        }
        if (jVar.f26655z0) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        this.f14863n = iMin;
        this.f14864o = iMin2;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        p201t1.i iVarC = c(view);
        if ((view instanceof g) && !(iVarC instanceof m)) {
            d dVar = (d) view.getLayoutParams();
            m mVar = new m();
            dVar.f27077j0 = mVar;
            dVar.f27055X = true;
            mVar.A(dVar.f27049R);
        }
        if (view instanceof p211u1.b) {
            p211u1.b bVar = (p211u1.b) view;
            bVar.c();
            ((d) view.getLayoutParams()).f27056Y = true;
            ArrayList arrayList = this.f14852b;
            if (!arrayList.contains(bVar)) {
                arrayList.add(bVar);
            }
        }
        this.f14851a.put(view.getId(), view);
        this.f14859i = true;
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f14851a.remove(view.getId());
        p201t1.i iVarC = c(view);
        this.f14854d.f26638i0.remove(iVarC);
        iVarC.f26583D = null;
        this.f14852b.remove(view);
        this.f14853c.remove(iVarC);
        this.f14859i = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        this.f14859i = true;
        this.f14863n = -1;
        this.f14864o = -1;
    }

    public void setConstraintSet(f fVar) {
        this.k = fVar;
    }

    @Override // android.view.View
    public void setId(int i10) {
        SparseArray sparseArray = this.f14851a;
        sparseArray.remove(getId());
        super.setId(i10);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 == this.f14858h) {
            return;
        }
        this.f14858h = i10;
        requestLayout();
    }

    public void setMaxWidth(int i10) {
        if (i10 == this.f14857g) {
            return;
        }
        this.f14857g = i10;
        requestLayout();
    }

    public void setMinHeight(int i10) {
        if (i10 == this.f14856f) {
            return;
        }
        this.f14856f = i10;
        requestLayout();
    }

    public void setMinWidth(int i10) {
        if (i10 == this.f14855e) {
            return;
        }
        this.f14855e = i10;
        requestLayout();
    }

    public void setOptimizationLevel(int i10) {
        this.f14854d.f26652w0 = i10;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        d dVar = new d(layoutParams);
        dVar.f27058a = -1;
        dVar.f27060b = -1;
        dVar.f27062c = -1.0f;
        dVar.f27064d = -1;
        dVar.f27066e = -1;
        dVar.f27068f = -1;
        dVar.f27070g = -1;
        dVar.f27072h = -1;
        dVar.f27074i = -1;
        dVar.f27076j = -1;
        dVar.k = -1;
        dVar.f27078l = -1;
        dVar.f27079m = -1;
        dVar.f27080n = 0;
        dVar.f27081o = 0.0f;
        dVar.f27082p = -1;
        dVar.f27083q = -1;
        dVar.r = -1;
        dVar.f27084s = -1;
        dVar.f27085t = -1;
        dVar.f27086u = -1;
        dVar.f27087v = -1;
        dVar.f27088w = -1;
        dVar.f27089x = -1;
        dVar.f27090y = -1;
        dVar.f27091z = 0.5f;
        dVar.f27032A = 0.5f;
        dVar.f27033B = null;
        dVar.f27034C = 1;
        dVar.f27035D = -1.0f;
        dVar.f27036E = -1.0f;
        dVar.f27037F = 0;
        dVar.f27038G = 0;
        dVar.f27039H = 0;
        dVar.f27040I = 0;
        dVar.f27041J = 0;
        dVar.f27042K = 0;
        dVar.f27043L = 0;
        dVar.f27044M = 0;
        dVar.f27045N = 1.0f;
        dVar.f27046O = 1.0f;
        dVar.f27047P = -1;
        dVar.f27048Q = -1;
        dVar.f27049R = -1;
        dVar.f27050S = false;
        dVar.f27051T = false;
        dVar.f27052U = true;
        dVar.f27053V = true;
        dVar.f27054W = false;
        dVar.f27055X = false;
        dVar.f27056Y = false;
        dVar.f27057Z = -1;
        dVar.f27059a0 = -1;
        dVar.f27061b0 = -1;
        dVar.f27063c0 = -1;
        dVar.f27065d0 = -1;
        dVar.f27067e0 = -1;
        dVar.f27069f0 = 0.5f;
        dVar.f27077j0 = new p201t1.i();
        return dVar;
    }
}
