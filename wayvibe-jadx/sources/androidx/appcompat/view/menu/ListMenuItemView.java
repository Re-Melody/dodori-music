package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import app.nagakiba.wayvibe.R;
import com.revenuecat.purchases.common.networking.ETagPayloadStore;
import p142n.l;
import p142n.n;
import p142n.y;
import p150n8.a;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements y, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n f14428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f14429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RadioButton f14430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f14431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CheckBox f14432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f14433f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageView f14434g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageView f14435h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f14436i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Drawable f14437j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f14438l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f14439m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Drawable f14440n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f14441o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LayoutInflater f14442p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f14443q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVarQ0 = a.q0(getContext(), attributeSet, p087i.a.r, R.attr.listMenuViewStyle);
        this.f14437j = aVarQ0.h0(5);
        TypedArray typedArray = (TypedArray) aVarQ0.f22980b;
        this.k = typedArray.getResourceId(1, -1);
        this.f14439m = typedArray.getBoolean(7, false);
        this.f14438l = context;
        this.f14440n = aVarQ0.h0(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f14441o = typedArrayObtainStyledAttributes.hasValue(0);
        aVarQ0.v0();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f14442p == null) {
            this.f14442p = LayoutInflater.from(getContext());
        }
        return this.f14442p;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.f14434g;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    /* JADX WARN: Code duplicated, block: B:28:0x005e  */
    @Override // p142n.y
    public final void a(n nVar) {
        boolean z10;
        int i10;
        String string;
        boolean z11;
        this.f14428a = nVar;
        setVisibility(nVar.isVisible() ? 0 : 8);
        setTitle(nVar.f22662e);
        setCheckable(nVar.isCheckable());
        if (nVar.f22670n.o()) {
            if ((nVar.f22670n.n() ? nVar.f22667j : nVar.f22665h) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        nVar.f22670n.n();
        if (z10) {
            n nVar2 = this.f14428a;
            if (nVar2.f22670n.o()) {
                if ((nVar2.f22670n.n() ? nVar2.f22667j : nVar2.f22665h) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
            i10 = z11 ? 0 : 8;
        }
        if (i10 == 0) {
            TextView textView = this.f14433f;
            n nVar3 = this.f14428a;
            char c3 = nVar3.f22670n.n() ? nVar3.f22667j : nVar3.f22665h;
            if (c3 == 0) {
                string = "";
            } else {
                l lVar = nVar3.f22670n;
                Resources resources = lVar.f22630a.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(lVar.f22630a).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i11 = lVar.n() ? nVar3.k : nVar3.f22666i;
                n.c(sb, i11, ETagPayloadStore.CHUNK_CHARS, resources.getString(R.string.abc_menu_meta_shortcut_label));
                n.c(sb, i11, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                n.c(sb, i11, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                n.c(sb, i11, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                n.c(sb, i11, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                n.c(sb, i11, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                if (c3 == '\b') {
                    sb.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (c3 == '\n') {
                    sb.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (c3 != ' ') {
                    sb.append(c3);
                } else {
                    sb.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.f14433f.getVisibility() != i10) {
            this.f14433f.setVisibility(i10);
        }
        setIcon(nVar.getIcon());
        setEnabled(nVar.isEnabled());
        setSubMenuArrowVisible(nVar.hasSubMenu());
        setContentDescription(nVar.f22673q);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f14435h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f14435h.getLayoutParams();
        rect.top = this.f14435h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // p142n.y
    public n getItemData() {
        return this.f14428a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f14437j);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f14431d = textView;
        int i10 = this.k;
        if (i10 != -1) {
            textView.setTextAppearance(this.f14438l, i10);
        }
        this.f14433f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f14434g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f14440n);
        }
        this.f14435h = (ImageView) findViewById(R.id.group_divider);
        this.f14436i = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.f14429b != null && this.f14439m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f14429b.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        View view;
        if (!z10 && this.f14430c == null && this.f14432e == null) {
            return;
        }
        if ((this.f14428a.f22679x & 4) != 0) {
            if (this.f14430c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f14430c = radioButton;
                LinearLayout linearLayout = this.f14436i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f14430c;
            view = this.f14432e;
        } else {
            if (this.f14432e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f14432e = checkBox;
                LinearLayout linearLayout2 = this.f14436i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f14432e;
            view = this.f14430c;
        }
        if (z10) {
            compoundButton.setChecked(this.f14428a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f14432e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f14430c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if ((this.f14428a.f22679x & 4) != 0) {
            if (this.f14430c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f14430c = radioButton;
                LinearLayout linearLayout = this.f14436i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f14430c;
        } else {
            if (this.f14432e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f14432e = checkBox;
                LinearLayout linearLayout2 = this.f14436i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f14432e;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f14443q = z10;
        this.f14439m = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f14435h;
        if (imageView != null) {
            imageView.setVisibility((this.f14441o || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f14428a.f22670n.getClass();
        boolean z10 = this.f14443q;
        if (z10 || this.f14439m) {
            ImageView imageView = this.f14429b;
            if (imageView == null && drawable == null && !this.f14439m) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f14429b = imageView2;
                LinearLayout linearLayout = this.f14436i;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f14439m) {
                this.f14429b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f14429b;
            if (!z10) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f14429b.getVisibility() != 0) {
                this.f14429b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f14431d.getVisibility() != 8) {
                this.f14431d.setVisibility(8);
            }
        } else {
            this.f14431d.setText(charSequence);
            if (this.f14431d.getVisibility() != 0) {
                this.f14431d.setVisibility(0);
            }
        }
    }
}
