package com.apple.android.music.playback.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new Parcelable.Creator<k>() { // from class: com.apple.android.music.playback.model.k.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k[] newArray(int i10) {
            return new k[i10];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f17456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f17457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f17458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f17459d;

    public k(int i10, int i11, String str) {
        this.f17456a = i10;
        this.f17457b = i11;
        this.f17458c = str;
        this.f17459d = d();
    }

    private String d() {
        int i10 = this.f17456a;
        String displayName = null;
        if (i10 == 3 || i10 == 4) {
            String strC = c();
            if (strC != null) {
                if (strC.contains("cmn")) {
                    strC = strC.replace("cmn", "zh");
                }
                Locale localeForLanguageTag = Locale.forLanguageTag(strC);
                if (localeForLanguageTag != null) {
                    displayName = localeForLanguageTag.getDisplayName();
                }
            }
            if (displayName == null) {
                displayName = strC;
            }
        }
        return displayName != null ? a(displayName) : "";
    }

    public int a() {
        return this.f17456a;
    }

    public int b() {
        return this.f17457b;
    }

    public String c() {
        return this.f17458c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f17456a == kVar.f17456a && (str = this.f17458c) != null && str.equals(kVar.f17458c);
    }

    public int hashCode() {
        int i10 = 527 + this.f17456a;
        String str = this.f17458c;
        if (str == null) {
            return i10;
        }
        return str.hashCode() + (i10 * 31);
    }

    public String toString() {
        return String.format(Locale.getDefault(), "MediaPlayerTrackInfo{type = %s, id = %d, language = %s}", a(this.f17456a), Integer.valueOf(this.f17457b), this.f17458c);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f17456a);
        parcel.writeInt(this.f17457b);
        parcel.writeString(this.f17458c);
        parcel.writeString(this.f17459d);
    }

    private static String a(int i10) {
        if (i10 == 1) {
            return "audio";
        }
        if (i10 == 2) {
            return "video";
        }
        if (i10 == 3) {
            return "closed caption";
        }
        if (i10 != 4) {
            return null;
        }
        return "subtitle";
    }

    public k(Parcel parcel) {
        this.f17456a = parcel.readInt();
        this.f17457b = parcel.readInt();
        this.f17458c = parcel.readString();
        this.f17459d = parcel.readString();
    }

    private static String a(String str) {
        char c3;
        char[] charArray = str.toLowerCase().toCharArray();
        boolean z10 = false;
        for (int i10 = 0; i10 < charArray.length; i10++) {
            if (!z10 && Character.isLetter(charArray[i10])) {
                charArray[i10] = Character.toUpperCase(charArray[i10]);
                z10 = true;
            } else if (Character.isWhitespace(charArray[i10]) || (c3 = charArray[i10]) == '.' || c3 == '\'') {
                z10 = false;
            }
        }
        return String.valueOf(charArray);
    }
}
