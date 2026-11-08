package p152o;

import N1.d;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import app.nagakiba.wayvibe.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import p098j.I;

/* JADX INFO: renamed from: o.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2161u0 extends ListView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f23442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23447f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C2157s0 f23448g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f23449h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f23450i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f23451j;
    public d k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public I f23452l;

    public C2161u0(Context context, boolean z10) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f23442a = new Rect();
        this.f23443b = 0;
        this.f23444c = 0;
        this.f23445d = 0;
        this.f23446e = 0;
        this.f23450i = z10;
        setCacheColorHint(0);
    }

    public final int a(int i10, int i11) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i12 = 0;
        View view = null;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = adapter.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            view = adapter.getView(i13, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i14 = layoutParams.height;
            view.measure(i10, i14 > 0 ? View.MeasureSpec.makeMeasureSpec(i14, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i13 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i11) {
                return i11;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Code duplicated, block: B:82:0x014c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0162  */
    /* JADX WARN: Code duplicated, block: B:86:0x0167  */
    /* JADX WARN: Code duplicated, block: B:88:0x016b  */
    /* JADX WARN: Code duplicated, block: B:90:0x017d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0181  */
    /* JADX WARN: Code duplicated, block: B:94:0x0185  */
    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    public final boolean b(MotionEvent motionEvent, int i10) {
        boolean z10;
        boolean zA;
        View childAt;
        View childAt2;
        d dVar;
        int actionMasked = motionEvent.getActionMasked();
        boolean z11 = false;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                z10 = true;
            } else if (actionMasked != 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 || z11) {
                this.f23451j = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f23447f - getFirstVisiblePosition());
                if (childAt2 != null) {
                    childAt2.setPressed(false);
                }
            }
            if (z10) {
                if (this.k == null) {
                    this.k = new d(this);
                }
                d dVar2 = this.k;
                boolean z12 = dVar2.f8538p;
                dVar2.f8538p = true;
                dVar2.onTouch(this, motionEvent);
            } else {
                dVar = this.k;
                if (dVar != null) {
                    if (dVar.f8538p) {
                        dVar.d();
                    }
                    dVar.f8538p = false;
                }
            }
            return z10;
        }
        z10 = false;
        int iFindPointerIndex = motionEvent.findPointerIndex(i10);
        if (iFindPointerIndex < 0) {
            z10 = false;
        } else {
            int x10 = (int) motionEvent.getX(iFindPointerIndex);
            int y6 = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x10, y6);
            if (iPointToPosition == -1) {
                z11 = true;
            } else {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f10 = x10;
                float f11 = y6;
                this.f23451j = true;
                int i11 = Build.VERSION.SDK_INT;
                AbstractC2152p0.a(this, f10, f11);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i12 = this.f23447f;
                if (i12 != -1 && (childAt = getChildAt(i12 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f23447f = iPointToPosition;
                AbstractC2152p0.a(childAt3, f10 - childAt3.getLeft(), f11 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z13 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z13) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f23442a;
                rect.set(left, top, right, bottom);
                rect.left -= this.f23443b;
                rect.top -= this.f23444c;
                rect.right += this.f23445d;
                rect.bottom += this.f23446e;
                if (i11 >= 33) {
                    zA = AbstractC2155r0.a(this);
                } else {
                    Field field = AbstractC2159t0.f23440a;
                    if (field != null) {
                        try {
                            zA = field.getBoolean(this);
                        } catch (IllegalAccessException e2) {
                            e2.printStackTrace();
                            zA = false;
                        }
                    } else {
                        zA = false;
                    }
                }
                if (childAt3.isEnabled() != zA) {
                    boolean z14 = !zA;
                    if (Build.VERSION.SDK_INT >= 33) {
                        AbstractC2155r0.b(this, z14);
                    } else {
                        Field field2 = AbstractC2159t0.f23440a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z14));
                            } catch (IllegalAccessException e4) {
                                e4.printStackTrace();
                            }
                        }
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z13) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    selector2.setHotspot(f10, f11);
                }
                C2157s0 c2157s0 = this.f23448g;
                if (c2157s0 != null) {
                    c2157s0.f23436b = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z10 = true;
                z11 = false;
            }
        }
        if (z10) {
            this.f23451j = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f23447f - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        } else {
            this.f23451j = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f23447f - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        }
        if (z10) {
            if (this.k == null) {
                this.k = new d(this);
            }
            d dVar3 = this.k;
            boolean z15 = dVar3.f8538p;
            dVar3.f8538p = true;
            dVar3.onTouch(this, motionEvent);
        } else {
            dVar = this.k;
            if (dVar != null) {
                if (dVar.f8538p) {
                    dVar.d();
                }
                dVar.f8538p = false;
            }
        }
        return z10;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f23442a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f23452l != null) {
            return;
        }
        super.drawableStateChanged();
        C2157s0 c2157s0 = this.f23448g;
        if (c2157s0 != null) {
            c2157s0.f23436b = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f23451j && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f23450i || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f23450i || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f23450i || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f23450i && this.f23449h) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f23452l = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f23452l == null) {
            I i11 = new I(this, 2);
            this.f23452l = i11;
            post(i11);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i10 < 30 || !AbstractC2154q0.f23424d) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        AbstractC2154q0.f23421a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        AbstractC2154q0.f23422b.invoke(this, Integer.valueOf(iPointToPosition));
                        AbstractC2154q0.f23423c.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e2) {
                        e2.printStackTrace();
                    } catch (InvocationTargetException e4) {
                        e4.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f23451j && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f23447f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        I i10 = this.f23452l;
        if (i10 != null) {
            C2161u0 c2161u0 = (C2161u0) i10.f21268b;
            c2161u0.f23452l = null;
            c2161u0.removeCallbacks(i10);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z10) {
        this.f23449h = z10;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C2157s0 c2157s0 = null;
        if (drawable != null) {
            C2157s0 c2157s1 = new C2157s0();
            Drawable drawable2 = c2157s1.f23435a;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            c2157s1.f23435a = drawable;
            drawable.setCallback(c2157s1);
            c2157s1.f23436b = true;
            c2157s0 = c2157s1;
        }
        this.f23448g = c2157s0;
        super.setSelector(c2157s0);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f23443b = rect.left;
        this.f23444c = rect.top;
        this.f23445d = rect.right;
        this.f23446e = rect.bottom;
    }
}
