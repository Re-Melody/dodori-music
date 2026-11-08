package com.apple.android.music.playback.reporting;

import B2.AbstractC0112b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.apple.android.music.playback.reporting.a.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    };

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final com.apple.android.music.playback.f.c f17554I = new com.apple.android.music.playback.f.c();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    final long f17555A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    final int f17556B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final boolean f17557C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final String f17558D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final byte[] f17559E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    final String f17560F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    final String f17561G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    final Map<?, ?> f17562H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f17563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f17564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final String f17565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f17566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final String f17567e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final String f17568f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final String f17569g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final String f17570h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final int f17571i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final int f17572j;
    final long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final long f17573l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final long f17574m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final String f17575n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final long f17576o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final long f17577p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final long f17578q;
    final int r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final int f17579s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final int f17580t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final boolean f17581u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final boolean f17582v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final String f17583w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    final String f17584x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    final long f17585y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    final UUID f17586z;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f17585y == ((a) obj).f17585y;
    }

    public int hashCode() {
        long j10 = this.f17585y;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PlayActivityEvent{");
        if (this.f17563a != 0) {
            sb.append("containerType=");
            sb.append(this.f17563a);
            sb.append(", ");
        }
        if (this.f17564b != 0) {
            sb.append("containerAdamId=");
            sb.append(this.f17564b);
            sb.append(", ");
        }
        if (this.f17565c != null) {
            sb.append("containerCloudAlbumId=");
            sb.append(this.f17565c);
            sb.append(", ");
        }
        if (this.f17566d != 0) {
            sb.append("playlistCloudId=");
            sb.append(this.f17566d);
            sb.append(", ");
        }
        if (this.f17567e != null) {
            sb.append("playlistGlobalId=");
            sb.append(this.f17567e);
            sb.append(", ");
        }
        if (this.f17568f != null) {
            sb.append("playlistVersionHash=");
            sb.append(this.f17568f);
            sb.append(", ");
        }
        if (this.f17569g != null) {
            sb.append("stationId=");
            sb.append(this.f17569g);
            sb.append(", ");
        }
        if (this.f17570h != null) {
            sb.append("stationHash=");
            sb.append(this.f17570h);
            sb.append(", ");
        }
        if (this.f17571i != 0) {
            sb.append("itemType=");
            sb.append(this.f17571i);
            sb.append(", ");
        }
        sb.append("itemMediaType=");
        sb.append(this.f17572j);
        sb.append(", ");
        if (this.k != 0) {
            sb.append("itemCloudId=");
            sb.append(this.k);
            sb.append(", ");
        }
        if (this.f17573l != 0) {
            sb.append("itemPurchaseId=");
            sb.append(this.f17573l);
            sb.append(", ");
        }
        if (this.f17574m != 0) {
            sb.append("itemSubscriptionId=");
            sb.append(this.f17574m);
            sb.append(", ");
        }
        if (this.f17575n != null) {
            sb.append("itemLyricsId=");
            sb.append(this.f17575n);
            sb.append(", ");
        }
        sb.append("itemDuration=");
        sb.append(this.f17576o);
        sb.append(", itemStartPosition=");
        sb.append(this.f17577p);
        sb.append(", itemEndPosition=");
        sb.append(this.f17578q);
        sb.append(", offline=");
        sb.append(this.f17581u);
        sb.append(", subscriptionEnabled=");
        sb.append(this.f17582v);
        sb.append(", ");
        if (this.f17583w != null) {
            sb.append("featureName=");
            sb.append(this.f17583w);
            sb.append(", ");
        }
        if (this.f17584x != null) {
            sb.append("storeFrontId=");
            sb.append(this.f17584x);
            sb.append(", ");
        }
        sb.append("persistentId=");
        sb.append(this.f17585y);
        sb.append(", timestamp=");
        sb.append(this.f17555A);
        sb.append(", timeZoneOffset=");
        return AbstractC0112b.i(sb, this.f17556B, "}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f17563a);
        parcel.writeLong(this.f17564b);
        parcel.writeString(this.f17565c);
        parcel.writeLong(this.f17566d);
        parcel.writeString(this.f17567e);
        parcel.writeString(this.f17568f);
        parcel.writeString(this.f17569g);
        parcel.writeString(this.f17570h);
        parcel.writeInt(this.f17571i);
        parcel.writeInt(this.f17572j);
        parcel.writeLong(this.k);
        parcel.writeLong(this.f17573l);
        parcel.writeLong(this.f17574m);
        parcel.writeString(this.f17575n);
        parcel.writeLong(this.f17576o);
        parcel.writeLong(this.f17577p);
        parcel.writeLong(this.f17578q);
        parcel.writeInt(this.r);
        parcel.writeInt(this.f17579s);
        parcel.writeInt(this.f17580t);
        parcel.writeInt(this.f17581u ? 1 : 0);
        parcel.writeInt(this.f17582v ? 1 : 0);
        parcel.writeString(this.f17583w);
        parcel.writeString(this.f17584x);
        parcel.writeLong(this.f17585y);
        parcel.writeLong(this.f17586z.getMostSignificantBits());
        parcel.writeLong(this.f17586z.getLeastSignificantBits());
        parcel.writeLong(this.f17555A);
        parcel.writeInt(this.f17556B);
        parcel.writeInt(this.f17557C ? 1 : 0);
        parcel.writeString(this.f17558D);
        parcel.writeMap(this.f17562H);
        byte[] bArr = this.f17559E;
        int length = bArr == null ? 0 : bArr.length;
        parcel.writeInt(length);
        if (length > 0) {
            parcel.writeByteArray(this.f17559E);
        }
        parcel.writeString(this.f17560F);
        parcel.writeString(this.f17561G);
    }

    public a(b bVar) {
        this.f17563a = bVar.f17595a;
        this.f17564b = bVar.f17596b;
        this.f17565c = bVar.f17597c;
        this.f17566d = bVar.f17598d;
        this.f17567e = bVar.f17599e;
        this.f17568f = bVar.f17600f;
        this.f17569g = bVar.f17601g;
        this.f17570h = bVar.f17602h;
        this.f17571i = bVar.f17603i;
        this.f17572j = bVar.f17604j;
        this.k = bVar.k;
        this.f17573l = bVar.f17605l;
        this.f17574m = bVar.f17606m;
        this.f17575n = bVar.f17607n;
        this.f17576o = bVar.f17608o;
        this.f17577p = bVar.f17609p;
        this.f17578q = bVar.f17610q;
        this.r = bVar.r;
        this.f17579s = bVar.f17611s;
        this.f17580t = bVar.f17612t;
        this.f17581u = bVar.f17613u;
        this.f17582v = bVar.f17614v;
        this.f17583w = bVar.f17615w;
        this.f17584x = bVar.f17616x;
        long j10 = bVar.f17617y;
        this.f17585y = j10 == 0 ? f17554I.a() : j10;
        UUID uuid = bVar.f17618z;
        this.f17586z = uuid == null ? UUID.randomUUID() : uuid;
        long j11 = bVar.f17587A;
        this.f17555A = j11 == 0 ? System.currentTimeMillis() : j11;
        int i10 = bVar.f17588B;
        this.f17556B = i10 == 0 ? TimeZone.getDefault().getRawOffset() : i10;
        this.f17557C = bVar.f17589C;
        this.f17558D = bVar.f17590D;
        this.f17562H = bVar.f17591E;
        this.f17559E = bVar.f17592F;
        this.f17560F = bVar.f17593G;
        this.f17561G = bVar.f17594H;
    }

    private a(Parcel parcel) {
        this.f17563a = parcel.readInt();
        this.f17564b = parcel.readLong();
        this.f17565c = parcel.readString();
        this.f17566d = parcel.readLong();
        this.f17567e = parcel.readString();
        this.f17568f = parcel.readString();
        this.f17569g = parcel.readString();
        this.f17570h = parcel.readString();
        this.f17571i = parcel.readInt();
        this.f17572j = parcel.readInt();
        this.k = parcel.readLong();
        this.f17573l = parcel.readLong();
        this.f17574m = parcel.readLong();
        this.f17575n = parcel.readString();
        this.f17576o = parcel.readLong();
        this.f17577p = parcel.readLong();
        this.f17578q = parcel.readLong();
        this.r = parcel.readInt();
        this.f17579s = parcel.readInt();
        this.f17580t = parcel.readInt();
        this.f17581u = parcel.readByte() != 0;
        this.f17582v = parcel.readByte() != 0;
        this.f17583w = parcel.readString();
        this.f17584x = parcel.readString();
        this.f17585y = parcel.readLong();
        this.f17586z = new UUID(parcel.readLong(), parcel.readLong());
        this.f17555A = parcel.readLong();
        this.f17556B = parcel.readInt();
        this.f17557C = parcel.readInt() != 0;
        this.f17558D = parcel.readString();
        HashMap map = new HashMap();
        parcel.readMap(map, a.class.getClassLoader());
        this.f17562H = map;
        int i10 = parcel.readInt();
        if (i10 != 0) {
            byte[] bArr = new byte[i10];
            this.f17559E = bArr;
            parcel.readByteArray(bArr);
        } else {
            this.f17559E = null;
        }
        this.f17560F = parcel.readString();
        this.f17561G = parcel.readString();
    }
}
