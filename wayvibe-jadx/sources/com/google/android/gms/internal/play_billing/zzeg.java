package com.google.android.gms.internal.play_billing;

import B2.AbstractC0112b;
import V0.p;
import com.google.android.gms.internal.play_billing.zzef;
import com.google.android.gms.internal.play_billing.zzeg;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzeg<MessageType extends zzeg<MessageType, BuilderType>, BuilderType extends zzef<MessageType, BuilderType>> implements zzhb {
    protected transient int zza = 0;

    public static void zzk(Iterable iterable, List list) {
        byte[] bArr = zzga.zzb;
        int size = ((Collection) iterable).size();
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + size);
        } else if (list instanceof zzhj) {
            ((zzhj) list).zzf(list.size() + size);
        }
        int size2 = list.size();
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i10 = 0; i10 < size3; i10++) {
            Object obj = list2.get(i10);
            if (obj == null) {
                String strD = AbstractC0112b.d(list.size() - size2, "Element at index ", " is null.");
                int size4 = list.size();
                while (true) {
                    size4--;
                    if (size4 < size2) {
                        throw new NullPointerException(strD);
                    }
                    list.remove(size4);
                }
            } else {
                list.add(obj);
            }
        }
    }

    public final byte[] zzQ() {
        try {
            int iZzn = zzn();
            byte[] bArr = new byte[iZzn];
            int i10 = zzfc.zzb;
            zzez zzezVar = new zzez(bArr, 0, iZzn);
            zzD(zzezVar);
            zzezVar.zzA();
            return bArr;
        } catch (IOException e2) {
            throw new RuntimeException(p.o("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e2);
        }
    }

    public int zzi(zzhl zzhlVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhb
    public final zzev zzj() {
        try {
            int iZzn = zzn();
            zzev zzevVar = zzev.zza;
            byte[] bArr = new byte[iZzn];
            int i10 = zzfc.zzb;
            zzez zzezVar = new zzez(bArr, 0, iZzn);
            zzD(zzezVar);
            return zzer.zza(zzezVar, bArr);
        } catch (IOException e2) {
            throw new RuntimeException(p.o("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e2);
        }
    }
}
