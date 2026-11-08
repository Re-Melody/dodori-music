package org.maplibre.android.util;

import B5.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultStyle implements Parcelable {
    public static final Parcelable.Creator<DefaultStyle> CREATOR = new c(5);

    @Keep
    private String name;

    @Keep
    private String url;

    @Keep
    private int version;

    @Keep
    public DefaultStyle(String str, String str2, int i10) {
        this.url = str;
        this.name = str2;
        this.version = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getName() {
        return this.name;
    }

    public final String getUrl() {
        return this.url;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.url);
        parcel.writeString(this.name);
        parcel.writeInt(this.version);
    }

    public DefaultStyle(Parcel parcel) {
        this.url = parcel.readString();
        this.name = parcel.readString();
        this.version = parcel.readInt();
    }
}
