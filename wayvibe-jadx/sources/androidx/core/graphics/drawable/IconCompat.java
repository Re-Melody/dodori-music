package androidx.core.graphics.drawable;

import C1.a;
import C1.b;
import C1.c;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f14980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f14981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Parcelable f14982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14983e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14984f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f14985g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f14986h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f14987i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f14988j;

    public IconCompat() {
        this.f14979a = -1;
        this.f14981c = null;
        this.f14982d = null;
        this.f14983e = 0;
        this.f14984f = 0;
        this.f14985g = null;
        this.f14986h = k;
        this.f14987i = null;
    }

    public static Bitmap c(Bitmap bitmap, boolean z10) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f10 = iMin;
        float f11 = 0.5f * f10;
        float f12 = 0.9166667f * f11;
        if (z10) {
            float f13 = 0.010416667f * f10;
            paint.setColor(0);
            paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, 1023410176);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static IconCompat d(Resources resources, String str, int i10) {
        str.getClass();
        if (i10 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f14983e = i10;
        if (resources != null) {
            try {
                iconCompat.f14980b = resources.getResourceName(i10);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f14980b = str;
        }
        iconCompat.f14988j = str;
        return iconCompat;
    }

    public final int e() {
        int i10 = this.f14979a;
        if (i10 != -1) {
            if (i10 == 2) {
                return this.f14983e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        int i11 = Build.VERSION.SDK_INT;
        Object obj = this.f14980b;
        if (i11 >= 28) {
            return b.f(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (NoSuchMethodException e4) {
            Log.e("IconCompat", "Unable to get icon resource", e4);
            return 0;
        } catch (InvocationTargetException e7) {
            Log.e("IconCompat", "Unable to get icon resource", e7);
            return 0;
        }
    }

    public final Uri f() {
        int i10 = this.f14979a;
        if (i10 != -1) {
            if (i10 == 4 || i10 == 6) {
                return Uri.parse((String) this.f14980b);
            }
            throw new IllegalStateException("called getUri() on " + this);
        }
        int i11 = Build.VERSION.SDK_INT;
        Object obj = this.f14980b;
        if (i11 >= 28) {
            return b.o(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon uri", e2);
            return null;
        } catch (NoSuchMethodException e4) {
            Log.e("IconCompat", "Unable to get icon uri", e4);
            return null;
        } catch (InvocationTargetException e7) {
            Log.e("IconCompat", "Unable to get icon uri", e7);
            return null;
        }
    }

    public final Icon g(Context context) {
        Icon iconCreateWithBitmap;
        String strG;
        InputStream inputStreamOpenInputStream;
        int i10 = Build.VERSION.SDK_INT;
        switch (this.f14979a) {
            case -1:
                return (Icon) this.f14980b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) this.f14980b);
                break;
            case 2:
                int i11 = this.f14979a;
                if (i11 == -1) {
                    int i12 = Build.VERSION.SDK_INT;
                    Object obj = this.f14980b;
                    if (i12 >= 28) {
                        strG = b.g(obj);
                    } else {
                        try {
                            strG = (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
                        } catch (IllegalAccessException e2) {
                            Log.e("IconCompat", "Unable to get icon package", e2);
                            strG = null;
                        } catch (NoSuchMethodException e4) {
                            Log.e("IconCompat", "Unable to get icon package", e4);
                            strG = null;
                        } catch (InvocationTargetException e7) {
                            Log.e("IconCompat", "Unable to get icon package", e7);
                            strG = null;
                        }
                    }
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("called getResPackage() on " + this);
                    }
                    String str = this.f14988j;
                    strG = (str == null || TextUtils.isEmpty(str)) ? ((String) this.f14980b).split(":", -1)[0] : this.f14988j;
                }
                iconCreateWithBitmap = Icon.createWithResource(strG, this.f14983e);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) this.f14980b, this.f14983e, this.f14984f);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) this.f14980b);
                break;
            case 5:
                iconCreateWithBitmap = i10 < 26 ? Icon.createWithBitmap(c((Bitmap) this.f14980b, false)) : a.a((Bitmap) this.f14980b);
                break;
            case 6:
                if (i10 >= 30) {
                    iconCreateWithBitmap = c.b(f());
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + f());
                    }
                    Uri uriF = f();
                    String scheme = uriF.getScheme();
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            inputStreamOpenInputStream = context.getContentResolver().openInputStream(uriF);
                        } catch (Exception e10) {
                            Log.w("IconCompat", "Unable to load image from URI: " + uriF, e10);
                            inputStreamOpenInputStream = null;
                        }
                    } else {
                        try {
                            inputStreamOpenInputStream = new FileInputStream(new File((String) this.f14980b));
                        } catch (FileNotFoundException e11) {
                            Log.w("IconCompat", "Unable to load image from path: " + uriF, e11);
                            inputStreamOpenInputStream = null;
                        }
                    }
                    if (inputStreamOpenInputStream == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + f());
                    }
                    if (i10 < 26) {
                        iconCreateWithBitmap = Icon.createWithBitmap(c(BitmapFactory.decodeStream(inputStreamOpenInputStream), false));
                    } else {
                        iconCreateWithBitmap = a.a(BitmapFactory.decodeStream(inputStreamOpenInputStream));
                    }
                }
                break;
        }
        ColorStateList colorStateList = this.f14985g;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f14986h;
        if (mode != k) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }

    public final String toString() {
        String str;
        if (this.f14979a == -1) {
            return String.valueOf(this.f14980b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f14979a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f14979a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f14980b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f14980b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f14988j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(e())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f14983e);
                if (this.f14984f != 0) {
                    sb.append(" off=");
                    sb.append(this.f14984f);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f14980b);
                break;
        }
        if (this.f14985g != null) {
            sb.append(" tint=");
            sb.append(this.f14985g);
        }
        if (this.f14986h != k) {
            sb.append(" mode=");
            sb.append(this.f14986h);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i10) {
        this.f14981c = null;
        this.f14982d = null;
        this.f14983e = 0;
        this.f14984f = 0;
        this.f14985g = null;
        this.f14986h = k;
        this.f14987i = null;
        this.f14979a = i10;
    }
}
