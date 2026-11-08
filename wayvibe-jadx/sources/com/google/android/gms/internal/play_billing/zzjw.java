package com.google.android.gms.internal.play_billing;

import D7.p1;
import org.apache.tika.utils.XMLReaderUtils;

/* JADX INFO: loaded from: classes.dex */
final class zzjw implements zzfx {
    static final zzfx zza = new zzjw();

    private zzjw() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzfx
    public final boolean zza(int i10) {
        switch (i10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 17:
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
            case 19:
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                return true;
            case 14:
            case 15:
            case 16:
            default:
                return false;
        }
    }
}
