package p152o;

import W4.m;
import Y7.e;
import android.R;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p078h2.g;
import p101j2.b;
import p101j2.d;
import p101j2.h;
import p150n8.a;

/* JADX INFO: loaded from: classes.dex */
public class B {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f23175d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23176a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f23177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f23178c;

    public B(AbsSeekBar absSeekBar) {
        this.f23177b = absSeekBar;
    }

    public KeyListener a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((m) ((e) this.f23178c).f13395b).getClass();
        if (keyListener instanceof d) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new d(keyListener);
    }

    public void b(AttributeSet attributeSet, int i10) {
        switch (this.f23176a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f23177b;
                a aVarQ0 = a.q0(absSeekBar.getContext(), attributeSet, f23175d, i10);
                Drawable drawableI0 = aVarQ0.i0(0);
                if (drawableI0 != null) {
                    if (drawableI0 instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) drawableI0;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i11 = 0; i11 < numberOfFrames; i11++) {
                            Drawable drawableE = e(animationDrawable.getFrame(i11), true);
                            drawableE.setLevel(10000);
                            animationDrawable2.addFrame(drawableE, animationDrawable.getDuration(i11));
                        }
                        animationDrawable2.setLevel(10000);
                        drawableI0 = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(drawableI0);
                }
                Drawable drawableI1 = aVarQ0.i0(1);
                if (drawableI1 != null) {
                    absSeekBar.setProgressDrawable(e(drawableI1, false));
                }
                aVarQ0.v0();
                return;
            default:
                TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f23177b).getContext().obtainStyledAttributes(attributeSet, p087i.a.f20375i, i10, 0);
                try {
                    boolean z10 = true;
                    if (typedArrayObtainStyledAttributes.hasValue(14)) {
                        z10 = typedArrayObtainStyledAttributes.getBoolean(14, true);
                        break;
                    }
                    typedArrayObtainStyledAttributes.recycle();
                    d(z10);
                    return;
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public b c(InputConnection inputConnection, EditorInfo editorInfo) {
        e eVar = (e) this.f23178c;
        if (inputConnection == null) {
            eVar.getClass();
            inputConnection = null;
        } else {
            m mVar = (m) eVar.f13395b;
            mVar.getClass();
            if (!(inputConnection instanceof b)) {
                inputConnection = new b((EditText) mVar.f12825b, inputConnection, editorInfo);
            }
        }
        return (b) inputConnection;
    }

    public void d(boolean z10) {
        h hVar = (h) ((m) ((e) this.f23178c).f13395b).f12826c;
        if (hVar.f21450c != z10) {
            if (hVar.f21449b != null) {
                g gVarA = g.a();
                p101j2.g gVar = hVar.f21449b;
                gVarA.getClass();
                J1.e.b(gVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = gVarA.f20181a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    gVarA.f20182b.remove(gVar);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
            hVar.f21450c = z10;
            if (z10) {
                h.a(hVar.f21448a, g.a().b());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable e(Drawable drawable, boolean z10) {
        if (drawable instanceof C1.d) {
            ((C1.e) ((C1.d) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i10 = 0; i10 < numberOfLayers; i10++) {
                    int id = layerDrawable.getId(i10);
                    drawableArr[i10] = e(layerDrawable.getDrawable(i10), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i11 = 0; i11 < numberOfLayers; i11++) {
                    layerDrawable2.setId(i11, layerDrawable.getId(i11));
                    layerDrawable2.setLayerGravity(i11, layerDrawable.getLayerGravity(i11));
                    layerDrawable2.setLayerWidth(i11, layerDrawable.getLayerWidth(i11));
                    layerDrawable2.setLayerHeight(i11, layerDrawable.getLayerHeight(i11));
                    layerDrawable2.setLayerInsetLeft(i11, layerDrawable.getLayerInsetLeft(i11));
                    layerDrawable2.setLayerInsetRight(i11, layerDrawable.getLayerInsetRight(i11));
                    layerDrawable2.setLayerInsetTop(i11, layerDrawable.getLayerInsetTop(i11));
                    layerDrawable2.setLayerInsetBottom(i11, layerDrawable.getLayerInsetBottom(i11));
                    layerDrawable2.setLayerInsetStart(i11, layerDrawable.getLayerInsetStart(i11));
                    layerDrawable2.setLayerInsetEnd(i11, layerDrawable.getLayerInsetEnd(i11));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.f23178c) == null) {
                    this.f23178c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z10 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    public B(EditText editText) {
        this.f23177b = editText;
        this.f23178c = new e(editText);
    }
}
