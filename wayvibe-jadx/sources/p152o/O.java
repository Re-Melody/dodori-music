package p152o;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import p146n3.b;

/* JADX INFO: loaded from: classes.dex */
public final class O extends View.BaseSavedState {
    public static final Parcelable.Creator<O> CREATOR = new b(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f23249a;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeByte(this.f23249a ? (byte) 1 : (byte) 0);
    }
}
