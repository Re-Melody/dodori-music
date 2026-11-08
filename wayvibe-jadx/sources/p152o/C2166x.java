package p152o;

import A6.G;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;

/* JADX INFO: renamed from: o.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2166x extends ImageButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2149o f23463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G f23464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f23465c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2166x(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        T0.a(context);
        this.f23465c = false;
        S0.a(this, getContext());
        C2149o c2149o = new C2149o(this);
        this.f23463a = c2149o;
        c2149o.d(attributeSet, i10);
        G g3 = new G(this);
        this.f23464b = g3;
        g3.o(attributeSet, i10);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2149o c2149o = this.f23463a;
        if (c2149o != null) {
            c2149o.a();
        }
        G g3 = this.f23464b;
        if (g3 != null) {
            g3.g();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2149o c2149o = this.f23463a;
        if (c2149o != null) {
            return c2149o.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2149o c2149o = this.f23463a;
        if (c2149o != null) {
            return c2149o.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        U0 u10;
        G g3 = this.f23464b;
        if (g3 == null || (u10 = (U0) g3.f306d) == null) {
            return null;
        }
        return (ColorStateList) u10.f23282c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        U0 u10;
        G g3 = this.f23464b;
        if (g3 == null || (u10 = (U0) g3.f306d) == null) {
            return null;
        }
        return (PorterDuff.Mode) u10.f23283d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f23464b.f304b).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2149o c2149o = this.f23463a;
        if (c2149o != null) {
            c2149o.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C2149o c2149o = this.f23463a;
        if (c2149o != null) {
            c2149o.f(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        G g3 = this.f23464b;
        if (g3 != null) {
            g3.g();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        G g3 = this.f23464b;
        if (g3 != null && drawable != null && !this.f23465c) {
            g3.f305c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (g3 != null) {
            g3.g();
            if (this.f23465c) {
                return;
            }
            ImageView imageView = (ImageView) g3.f304b;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(g3.f305c);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f23465c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        this.f23464b.t(i10);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        G g3 = this.f23464b;
        if (g3 != null) {
            g3.g();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2149o c2149o = this.f23463a;
        if (c2149o != null) {
            c2149o.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2149o c2149o = this.f23463a;
        if (c2149o != null) {
            c2149o.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        G g3 = this.f23464b;
        if (g3 != null) {
            if (((U0) g3.f306d) == null) {
                g3.f306d = new U0();
            }
            U0 u10 = (U0) g3.f306d;
            u10.f23282c = colorStateList;
            u10.f23281b = true;
            g3.g();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        G g3 = this.f23464b;
        if (g3 != null) {
            if (((U0) g3.f306d) == null) {
                g3.f306d = new U0();
            }
            U0 u10 = (U0) g3.f306d;
            u10.f23283d = mode;
            u10.f23280a = true;
            g3.g();
        }
    }
}
