package E8;

import D8.y2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class B {
    static {
        Logger.getLogger(B.class.getName());
    }

    public static byte[][] a(ArrayList arrayList) {
        int size = arrayList.size() * 2;
        byte[][] bArr = new byte[size][];
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            F8.b bVar = (F8.b) it.next();
            int i11 = i10 + 1;
            bArr[i10] = bVar.f4574a.z();
            i10 += 2;
            bArr[i11] = bVar.f4575b.z();
        }
        Logger logger = y2.f2863a;
        int i12 = 0;
        while (i12 < size) {
            byte[] bArr2 = bArr[i12];
            int i13 = i12 + 1;
            byte[] bArr3 = bArr[i13];
            byte[] bArr4 = y2.f2864b;
            if (y2.a(bArr2, bArr4)) {
                for (byte b10 : bArr3) {
                    if (b10 == 44) {
                        ArrayList arrayList2 = new ArrayList(size + 10);
                        for (int i14 = 0; i14 < i12; i14++) {
                            arrayList2.add(bArr[i14]);
                        }
                        while (i12 < size) {
                            byte[] bArr5 = bArr[i12];
                            byte[] bArr6 = bArr[i12 + 1];
                            if (y2.a(bArr5, bArr4)) {
                                int i15 = 0;
                                for (int i16 = 0; i16 <= bArr6.length; i16++) {
                                    if (i16 == bArr6.length || bArr6[i16] == 44) {
                                        byte[] bArrA = B6.e.f713c.a(new String(bArr6, i15, i16 - i15, p267z6.h.f29877a));
                                        arrayList2.add(bArr5);
                                        arrayList2.add(bArrA);
                                        i15 = i16 + 1;
                                    }
                                }
                            } else {
                                arrayList2.add(bArr5);
                                arrayList2.add(bArr6);
                            }
                            i12 += 2;
                        }
                        return (byte[][]) arrayList2.toArray(new byte[0][]);
                    }
                }
                bArr[i13] = B6.e.f713c.a(new String(bArr3, p267z6.h.f29877a));
            }
            i12 += 2;
        }
        return bArr;
    }
}
