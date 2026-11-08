package com.google.android.material.appbar;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class c extends p018b2.b {
    public static final Parcelable.Creator<c> CREATOR = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f18157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f18158e;

    public c(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f18156c = parcel.readInt();
        this.f18157d = parcel.readFloat();
        this.f18158e = parcel.readByte() != 0;
    }

    @Override // p018b2.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f18156c);
        parcel.writeFloat(this.f18157d);
        parcel.writeByte(this.f18158e ? (byte) 1 : (byte) 0);
    }
}
