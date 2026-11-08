package p066g;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.v;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new v(14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Intent f19910b;

    public a(int i10, Intent intent) {
        this.f19909a = i10;
        this.f19910b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String strValueOf;
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i10 = this.f19909a;
        if (i10 != -1) {
            strValueOf = i10 != 0 ? String.valueOf(i10) : "RESULT_CANCELED";
        } else {
            strValueOf = "RESULT_OK";
        }
        sb.append(strValueOf);
        sb.append(", data=");
        sb.append(this.f19910b);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        m.f(dest, "dest");
        dest.writeInt(this.f19909a);
        Intent intent = this.f19910b;
        dest.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(dest, i10);
        }
    }
}
