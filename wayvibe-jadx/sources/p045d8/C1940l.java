package p045d8;

import S5.d;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import io.flutter.embedding.engine.renderer.k;
import io.flutter.embedding.engine.renderer.n;
import java.nio.ByteBuffer;
import java.util.Locale;

/* JADX INFO: renamed from: d8.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1940l extends View implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImageReader f19370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Image f19371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bitmap f19372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k f19373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f19374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final EnumC1939k f19375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f19376g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1940l(Context context, int i10, int i11, EnumC1939k enumC1939k) {
        super(context, null);
        ImageReader imageReaderE = e(i10, i11);
        this.f19374e = false;
        this.f19376g = false;
        this.f19370a = imageReaderE;
        this.f19375f = enumC1939k;
        setAlpha(0.0f);
        this.f19374e = d.G(getContext());
    }

    public static ImageReader e(int i10, int i11) {
        if (i10 <= 0) {
            Locale locale = Locale.US;
            Log.w("FlutterImageView", "ImageReader width must be greater than 0, but given width=" + i10 + ", set width=1");
            i10 = 1;
        }
        if (i11 <= 0) {
            Locale locale2 = Locale.US;
            Log.w("FlutterImageView", "ImageReader height must be greater than 0, but given height=" + i11 + ", set height=1");
            i11 = 1;
        }
        return Build.VERSION.SDK_INT >= 29 ? ImageReader.newInstance(i10, i11, 1, 3, 768L) : ImageReader.newInstance(i10, i11, 1, 3);
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void b(k kVar) {
        if (this.f19375f.ordinal() == 0) {
            Surface surface = this.f19370a.getSurface();
            kVar.f20630c = surface;
            kVar.f20628a.onSurfaceWindowChanged(surface);
        }
        setAlpha(1.0f);
        this.f19373d = kVar;
        this.f19376g = true;
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void c() {
        if (this.f19376g) {
            setAlpha(0.0f);
            d();
            this.f19372c = null;
            Image image = this.f19371b;
            if (image != null) {
                image.close();
                this.f19371b = null;
            }
            invalidate();
            this.f19376g = false;
        }
    }

    public final boolean d() {
        if (!this.f19376g) {
            return false;
        }
        Image imageAcquireLatestImage = this.f19370a.acquireLatestImage();
        if (imageAcquireLatestImage != null) {
            Image image = this.f19371b;
            if (image != null) {
                image.close();
                this.f19371b = null;
            }
            this.f19371b = imageAcquireLatestImage;
            invalidate();
        }
        return imageAcquireLatestImage != null;
    }

    public final void f(int i10, int i11) {
        if (this.f19373d == null) {
            return;
        }
        if (i10 == this.f19370a.getWidth() && i11 == this.f19370a.getHeight()) {
            return;
        }
        Image image = this.f19371b;
        if (image != null) {
            image.close();
            this.f19371b = null;
        }
        this.f19370a.close();
        this.f19370a = e(i10, i11);
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public k getAttachedRenderer() {
        return this.f19373d;
    }

    public ImageReader getImageReader() {
        return this.f19370a;
    }

    public Surface getSurface() {
        return this.f19370a.getSurface();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Image image = this.f19371b;
        if (image != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                HardwareBuffer hardwareBuffer = image.getHardwareBuffer();
                ColorSpace.Named unused = ColorSpace.Named.SRGB;
                this.f19372c = Bitmap.wrapHardwareBuffer(hardwareBuffer, ColorSpace.get(ColorSpace.Named.SRGB));
                hardwareBuffer.close();
            } else {
                Image.Plane[] planes = image.getPlanes();
                if (planes.length == 1) {
                    Image.Plane plane = planes[0];
                    int rowStride = plane.getRowStride() / plane.getPixelStride();
                    int height = this.f19371b.getHeight();
                    Bitmap bitmap = this.f19372c;
                    if (bitmap == null || bitmap.getWidth() != rowStride || this.f19372c.getHeight() != height) {
                        this.f19372c = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
                    }
                    ByteBuffer buffer = plane.getBuffer();
                    buffer.rewind();
                    this.f19372c.copyPixelsFromBuffer(buffer);
                }
            }
        }
        Bitmap bitmap2 = this.f19372c;
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        if (!this.f19374e) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        setMeasuredDimension(Math.max(View.MeasureSpec.getSize(i10), mode == 0 ? 1 : 0), Math.max(View.MeasureSpec.getSize(i11), View.MeasureSpec.getMode(i11) == 0 ? 1 : 0));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (!(i10 == this.f19370a.getWidth() && i11 == this.f19370a.getHeight()) && this.f19375f == EnumC1939k.background && this.f19376g) {
            f(i10, i11);
            k kVar = this.f19373d;
            Surface surface = this.f19370a.getSurface();
            kVar.f20630c = surface;
            kVar.f20628a.onSurfaceWindowChanged(surface);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void a() {
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void pause() {
    }
}
