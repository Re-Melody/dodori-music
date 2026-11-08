package p112k2;

import B2.AbstractC0112b;
import android.util.Log;
import com.amazon.a.a.o.b.f;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f21576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f21577d;

    public c(byte[] bArr, int i10, int i11) {
        this(-1L, bArr, i10, i11);
    }

    public static c a(long j10, ByteOrder byteOrder) {
        long[] jArr = {j10};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[g.f21589F[4]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putInt((int) jArr[0]);
        return new c(byteBufferWrap.array(), 4, 1);
    }

    public static c b(e eVar, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[g.f21589F[5]]);
        byteBufferWrap.order(byteOrder);
        e eVar2 = new e[]{eVar}[0];
        byteBufferWrap.putInt((int) eVar2.f21582a);
        byteBufferWrap.putInt((int) eVar2.f21583b);
        return new c(byteBufferWrap.array(), 5, 1);
    }

    public static c c(int i10, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[g.f21589F[3]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putShort((short) new int[]{i10}[0]);
        return new c(byteBufferWrap.array(), 3, 1);
    }

    public final double d(ByteOrder byteOrder) throws Throwable {
        Object objG = g(byteOrder);
        if (objG == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objG instanceof String) {
            return Double.parseDouble((String) objG);
        }
        if (objG instanceof long[]) {
            long[] jArr = (long[]) objG;
            if (jArr.length == 1) {
                return jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objG instanceof int[]) {
            int[] iArr = (int[]) objG;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objG instanceof double[]) {
            double[] dArr = (double[]) objG;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objG instanceof e[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        e[] eVarArr = (e[]) objG;
        if (eVarArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        e eVar = eVarArr[0];
        return eVar.f21582a / eVar.f21583b;
    }

    public final int e(ByteOrder byteOrder) throws Throwable {
        Object objG = g(byteOrder);
        if (objG == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objG instanceof String) {
            return Integer.parseInt((String) objG);
        }
        if (objG instanceof long[]) {
            long[] jArr = (long[]) objG;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objG instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objG;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final String f(ByteOrder byteOrder) throws Throwable {
        Object objG = g(byteOrder);
        if (objG == null) {
            return null;
        }
        if (objG instanceof String) {
            return (String) objG;
        }
        StringBuilder sb = new StringBuilder();
        int i10 = 0;
        if (objG instanceof long[]) {
            long[] jArr = (long[]) objG;
            while (i10 < jArr.length) {
                sb.append(jArr[i10]);
                i10++;
                if (i10 != jArr.length) {
                    sb.append(f.f16451a);
                }
            }
            return sb.toString();
        }
        if (objG instanceof int[]) {
            int[] iArr = (int[]) objG;
            while (i10 < iArr.length) {
                sb.append(iArr[i10]);
                i10++;
                if (i10 != iArr.length) {
                    sb.append(f.f16451a);
                }
            }
            return sb.toString();
        }
        if (objG instanceof double[]) {
            double[] dArr = (double[]) objG;
            while (i10 < dArr.length) {
                sb.append(dArr[i10]);
                i10++;
                if (i10 != dArr.length) {
                    sb.append(f.f16451a);
                }
            }
            return sb.toString();
        }
        if (!(objG instanceof e[])) {
            return null;
        }
        e[] eVarArr = (e[]) objG;
        while (i10 < eVarArr.length) {
            sb.append(eVarArr[i10].f21582a);
            sb.append('/');
            sb.append(eVarArr[i10].f21583b);
            i10++;
            if (i10 != eVarArr.length) {
                sb.append(f.f16451a);
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:153:0x016d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0033: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:52), block:B:16:0x0033 */
    /* JADX WARN: Type inference failed for: r15v22, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v23, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r15v24, types: [java.io.Serializable, k2.e[]] */
    /* JADX WARN: Type inference failed for: r15v25, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v26, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v27, types: [java.io.Serializable, k2.e[]] */
    /* JADX WARN: Type inference failed for: r15v28, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v29, types: [double[], java.io.Serializable] */
    public final Serializable g(ByteOrder byteOrder) throws Throwable {
        b bVar;
        InputStream inputStream;
        byte b10;
        String string;
        int length = 0;
        byte[] bArr = this.f21577d;
        InputStream inputStream2 = null;
        try {
            try {
                try {
                    bVar = new b(bArr);
                    try {
                        bVar.f21571c = byteOrder;
                        int i10 = this.f21574a;
                        int i11 = this.f21575b;
                        switch (i10) {
                            case 1:
                            case 6:
                                if (bArr.length != 1 || (b10 = bArr[0]) < 0 || b10 > 1) {
                                    String str = new String(bArr, g.f21598O);
                                    try {
                                        bVar.close();
                                        return str;
                                    } catch (IOException e2) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e2);
                                        return str;
                                    }
                                }
                                String str2 = new String(new char[]{(char) (b10 + 48)});
                                try {
                                    bVar.close();
                                    return str2;
                                } catch (IOException e4) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e4);
                                    return str2;
                                }
                            case 2:
                            case 7:
                                if (i11 >= g.f21590G.length) {
                                    int i12 = 0;
                                    while (true) {
                                        byte[] bArr2 = g.f21590G;
                                        if (i12 >= bArr2.length) {
                                            length = bArr2.length;
                                        } else if (bArr[i12] == bArr2[i12]) {
                                            i12++;
                                        }
                                    }
                                }
                                StringBuilder sb = new StringBuilder();
                                try {
                                    while (length < i11) {
                                        byte b11 = bArr[length];
                                        if (b11 == 0) {
                                            string = sb.toString();
                                            bVar.close();
                                            return string;
                                        }
                                        if (b11 >= 32) {
                                            sb.append((char) b11);
                                        } else {
                                            sb.append('?');
                                        }
                                        length++;
                                    }
                                    bVar.close();
                                    return string;
                                } catch (IOException e7) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e7);
                                    return string;
                                }
                                string = sb.toString();
                            case 3:
                                ?? r15 = new int[i11];
                                while (length < i11) {
                                    r15[length] = bVar.readUnsignedShort();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    return r15;
                                } catch (IOException e10) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e10);
                                    return r15;
                                }
                            case 4:
                                ?? r16 = new long[i11];
                                while (length < i11) {
                                    r16[length] = ((long) bVar.readInt()) & 4294967295L;
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    return r16;
                                } catch (IOException e11) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e11);
                                    return r16;
                                }
                            case 5:
                                ?? r17 = new e[i11];
                                while (length < i11) {
                                    r17[length] = new e(((long) bVar.readInt()) & 4294967295L, ((long) bVar.readInt()) & 4294967295L);
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    return r17;
                                } catch (IOException e12) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e12);
                                    return r17;
                                }
                            case 8:
                                ?? r18 = new int[i11];
                                while (length < i11) {
                                    r18[length] = bVar.readShort();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    return r18;
                                } catch (IOException e13) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e13);
                                    return r18;
                                }
                            case 9:
                                ?? r19 = new int[i11];
                                while (length < i11) {
                                    r19[length] = bVar.readInt();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    return r19;
                                } catch (IOException e14) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e14);
                                    return r19;
                                }
                            case 10:
                                ?? r110 = new e[i11];
                                while (length < i11) {
                                    r110[length] = new e(bVar.readInt(), bVar.readInt());
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    return r110;
                                } catch (IOException e15) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e15);
                                    return r110;
                                }
                            case 11:
                                ?? r111 = new double[i11];
                                while (length < i11) {
                                    r111[length] = bVar.readFloat();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    return r111;
                                } catch (IOException e16) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e16);
                                    return r111;
                                }
                            case 12:
                                ?? r112 = new double[i11];
                                while (length < i11) {
                                    r112[length] = bVar.readDouble();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    return r112;
                                } catch (IOException e17) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e17);
                                    return r112;
                                }
                            default:
                                bVar.close();
                                return null;
                        }
                    } catch (IOException e18) {
                        e = e18;
                        Log.w("ExifInterface", "IOException occurred during reading a value", e);
                        if (bVar != null) {
                            bVar.close();
                        }
                        return null;
                    }
                } catch (IOException e19) {
                    e = e19;
                    bVar = null;
                } catch (Throwable th) {
                    th = th;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e20) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e20);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                throw th;
            }
        } catch (IOException e21) {
            Log.e("ExifInterface", "IOException occurred while closing InputStream", e21);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(g.f21588E[this.f21574a]);
        sb.append(", data length:");
        return AbstractC0112b.i(sb, this.f21577d.length, ")");
    }

    public c(long j10, byte[] bArr, int i10, int i11) {
        this.f21574a = i10;
        this.f21575b = i11;
        this.f21576c = j10;
        this.f21577d = bArr;
    }
}
