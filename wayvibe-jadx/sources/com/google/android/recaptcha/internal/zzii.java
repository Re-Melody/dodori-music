package com.google.android.recaptcha.internal;

import M8.l;
import N8.y;
import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzii implements zzih {
    private final Context zza;
    private final Map zzb = y.g0(new l(2, Context.ACTIVITY_SERVICE), new l(3, Context.TELEPHONY_SERVICE), new l(4, Context.INPUT_METHOD_SERVICE), new l(5, Context.AUDIO_SERVICE));

    public zzii(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.recaptcha.internal.zzih
    public final /* synthetic */ Object cs(Object[] objArr) {
        return zzie.zza(this, objArr);
    }

    @Override // com.google.android.recaptcha.internal.zzih
    public final Object zza(Object... objArr) throws zzce {
        Object obj = objArr[0];
        if (true != (obj instanceof Integer)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num == null) {
            throw new zzce(4, 5, null);
        }
        Object obj2 = this.zzb.get(Integer.valueOf(num.intValue()));
        if (obj2 != null) {
            return this.zza.getSystemService((String) obj2);
        }
        throw new zzce(4, 4, null);
    }
}
