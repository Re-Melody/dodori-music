package p066g;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.v;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new v(15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IntentSender f19931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Intent f19932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19934d;

    public l(IntentSender intentSender, Intent intent, int i10, int i11) {
        m.f(intentSender, "intentSender");
        this.f19931a = intentSender;
        this.f19932b = intent;
        this.f19933c = i10;
        this.f19934d = i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        m.f(dest, "dest");
        dest.writeParcelable(this.f19931a, i10);
        dest.writeParcelable(this.f19932b, i10);
        dest.writeInt(this.f19933c);
        dest.writeInt(this.f19934d);
    }
}
