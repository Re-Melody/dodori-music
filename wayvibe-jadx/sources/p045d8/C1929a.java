package p045d8;

import W4.m;
import android.R;
import android.content.Context;
import android.graphics.Matrix;
import android.util.TypedValue;
import android.view.MotionEvent;
import io.flutter.embedding.engine.renderer.k;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;

/* JADX INFO: renamed from: d8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1929a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Matrix f19340f = new Matrix();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f19341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f19342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f19343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f19344d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19345e;

    public C1929a(k kVar, boolean z10) {
        this.f19341a = kVar;
        if (m.f12823d == null) {
            m.f12823d = new m();
        }
        this.f19342b = m.f12823d;
        this.f19343c = z10;
    }

    public static int b(int i10) {
        if (i10 == 0) {
            return 4;
        }
        if (i10 != 1) {
            if (i10 == 5) {
                return 4;
            }
            if (i10 != 6) {
                if (i10 == 2) {
                    return 5;
                }
                if (i10 != 7) {
                    if (i10 == 3) {
                        return 0;
                    }
                    if (i10 != 8) {
                        return -1;
                    }
                }
                return 3;
            }
        }
        return 6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a3, code lost:
    
        if (r14 == (-1)) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.view.MotionEvent r29, int r30, int r31, int r32, android.graphics.Matrix r33, java.nio.ByteBuffer r34, android.content.Context r35) {
        /*
            Method dump skipped, instruction units count: 644
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p045d8.C1929a.a(android.view.MotionEvent, int, int, int, android.graphics.Matrix, java.nio.ByteBuffer, android.content.Context):void");
    }

    public final int c(Context context) {
        if (this.f19345e == 0) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                return 48;
            }
            this.f19345e = (int) typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f19345e;
    }

    public final void d(MotionEvent motionEvent, Matrix matrix) {
        int actionMasked = motionEvent.getActionMasked();
        int iB = b(motionEvent.getActionMasked());
        char c3 = 5;
        boolean z10 = actionMasked == 0 || actionMasked == 5;
        boolean z11 = !z10 && (actionMasked == 1 || actionMasked == 6);
        int toolType = motionEvent.getToolType(motionEvent.getActionIndex());
        if (toolType == 1) {
            c3 = 0;
        } else if (toolType == 2) {
            c3 = 2;
        } else if (toolType == 3) {
            c3 = 1;
        } else if (toolType == 4) {
            c3 = 3;
        }
        int i10 = (z11 && c3 == 0) ? 1 : 0;
        int pointerCount = motionEvent.getPointerCount();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect((pointerCount + i10) * 288);
        byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        if (z10) {
            a(motionEvent, motionEvent.getActionIndex(), iB, 0, matrix, byteBufferAllocateDirect, null);
        } else if (z11) {
            for (int i11 = 0; i11 < pointerCount; i11++) {
                if (i11 != motionEvent.getActionIndex() && motionEvent.getToolType(i11) == 1) {
                    a(motionEvent, i11, 5, 1, matrix, byteBufferAllocateDirect, null);
                }
            }
            a(motionEvent, motionEvent.getActionIndex(), iB, 0, matrix, byteBufferAllocateDirect, null);
            if (i10 != 0) {
                a(motionEvent, motionEvent.getActionIndex(), 2, 0, matrix, byteBufferAllocateDirect, null);
            }
        } else {
            for (int i12 = 0; i12 < pointerCount; i12++) {
                a(motionEvent, i12, iB, (pointerCount << 8) | 2, matrix, byteBufferAllocateDirect, null);
            }
        }
        if (byteBufferAllocateDirect.position() % 288 != 0) {
            throw new AssertionError("Packet position is not on field boundary");
        }
        this.f19341a.f20628a.dispatchPointerDataPacket(byteBufferAllocateDirect, byteBufferAllocateDirect.position());
    }
}
