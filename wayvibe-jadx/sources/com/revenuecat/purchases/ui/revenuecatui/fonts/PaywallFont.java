package com.revenuecat.purchases.ui.revenuecatui.fonts;

import T0.I;
import V0.p;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PaywallFont implements Parcelable {
    public static final int $stable = 0;

    public /* synthetic */ PaywallFont(f fVar) {
        this();
    }

    private PaywallFont() {
    }

    public static final class AssetFont extends PaywallFont {
        public static final int $stable = 0;
        public static final Parcelable.Creator<AssetFont> CREATOR = new Creator();
        private final int fontStyle;
        private final I fontWeight;
        private final String path;

        public static final class Creator implements Parcelable.Creator<AssetFont> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AssetFont createFromParcel(Parcel parcel) {
                m.f(parcel, "parcel");
                return new AssetFont(parcel.readString(), FontWeightParceler.INSTANCE.m826create(parcel), parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AssetFont[] newArray(int i10) {
                return new AssetFont[i10];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public AssetFont(String str, I i10, int i11, int i12, f fVar) {
            if ((i12 & 2) != 0) {
                I i13 = I.f11451b;
                i10 = I.f11457h;
            }
            this(str, i10, (i12 & 4) != 0 ? 0 : i11);
        }

        public static /* synthetic */ void getFontWeight$annotations() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AssetFont)) {
                return false;
            }
            AssetFont assetFont = (AssetFont) obj;
            return m.b(this.path, assetFont.path) && m.b(this.fontWeight, assetFont.fontWeight) && this.fontStyle == assetFont.fontStyle;
        }

        public final int getFontStyle() {
            return this.fontStyle;
        }

        public final I getFontWeight() {
            return this.fontWeight;
        }

        public final String getPath() {
            return this.path;
        }

        public int hashCode() {
            return (((this.path.hashCode() * 31) + this.fontWeight.f11463a) * 31) + this.fontStyle;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("AssetFont(path=");
            sb.append(this.path);
            sb.append(", fontWeight=");
            sb.append(this.fontWeight);
            sb.append(", fontStyle=");
            return p.q(sb, this.fontStyle, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i10) {
            m.f(out, "out");
            out.writeString(this.path);
            FontWeightParceler.INSTANCE.write(this.fontWeight, out, i10);
            out.writeInt(this.fontStyle);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AssetFont(String path, I fontWeight, int i10) {
            super(null);
            m.f(path, "path");
            m.f(fontWeight, "fontWeight");
            this.path = path;
            this.fontWeight = fontWeight;
            this.fontStyle = i10;
        }
    }

    public static final class GoogleFont extends PaywallFont {
        public static final int $stable = 0;
        public static final Parcelable.Creator<GoogleFont> CREATOR = new Creator();
        private final String fontName;
        private final GoogleFontProvider fontProvider;
        private final int fontStyle;
        private final I fontWeight;

        public static final class Creator implements Parcelable.Creator<GoogleFont> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GoogleFont createFromParcel(Parcel parcel) {
                m.f(parcel, "parcel");
                return new GoogleFont(parcel.readString(), GoogleFontProvider.CREATOR.createFromParcel(parcel), FontWeightParceler.INSTANCE.m826create(parcel), parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GoogleFont[] newArray(int i10) {
                return new GoogleFont[i10];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public GoogleFont(String str, GoogleFontProvider googleFontProvider, I i10, int i11, int i12, f fVar) {
            if ((i12 & 4) != 0) {
                I i13 = I.f11451b;
                i10 = I.f11457h;
            }
            this(str, googleFontProvider, i10, (i12 & 8) != 0 ? 0 : i11);
        }

        public static /* synthetic */ void getFontWeight$annotations() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GoogleFont)) {
                return false;
            }
            GoogleFont googleFont = (GoogleFont) obj;
            return m.b(this.fontName, googleFont.fontName) && m.b(this.fontProvider, googleFont.fontProvider) && m.b(this.fontWeight, googleFont.fontWeight) && this.fontStyle == googleFont.fontStyle;
        }

        public final String getFontName() {
            return this.fontName;
        }

        public final GoogleFontProvider getFontProvider() {
            return this.fontProvider;
        }

        public final int getFontStyle() {
            return this.fontStyle;
        }

        public final I getFontWeight() {
            return this.fontWeight;
        }

        public int hashCode() {
            return ((((this.fontProvider.hashCode() + (this.fontName.hashCode() * 31)) * 31) + this.fontWeight.f11463a) * 31) + this.fontStyle;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("GoogleFont(fontName=");
            sb.append(this.fontName);
            sb.append(", fontProvider=");
            sb.append(this.fontProvider);
            sb.append(", fontWeight=");
            sb.append(this.fontWeight);
            sb.append(", fontStyle=");
            return p.q(sb, this.fontStyle, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i10) {
            m.f(out, "out");
            out.writeString(this.fontName);
            this.fontProvider.writeToParcel(out, i10);
            FontWeightParceler.INSTANCE.write(this.fontWeight, out, i10);
            out.writeInt(this.fontStyle);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GoogleFont(String fontName, GoogleFontProvider fontProvider, I fontWeight, int i10) {
            super(null);
            m.f(fontName, "fontName");
            m.f(fontProvider, "fontProvider");
            m.f(fontWeight, "fontWeight");
            this.fontName = fontName;
            this.fontProvider = fontProvider;
            this.fontWeight = fontWeight;
            this.fontStyle = i10;
        }
    }

    public static final class ResourceFont extends PaywallFont {
        public static final int $stable = 0;
        public static final Parcelable.Creator<ResourceFont> CREATOR = new Creator();
        private final int fontStyle;
        private final I fontWeight;
        private final int resourceId;

        public static final class Creator implements Parcelable.Creator<ResourceFont> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ResourceFont createFromParcel(Parcel parcel) {
                m.f(parcel, "parcel");
                return new ResourceFont(parcel.readInt(), FontWeightParceler.INSTANCE.m826create(parcel), parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ResourceFont[] newArray(int i10) {
                return new ResourceFont[i10];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public ResourceFont(int i10, I i11, int i12, int i13, f fVar) {
            if ((i13 & 2) != 0) {
                I i14 = I.f11451b;
                i11 = I.f11457h;
            }
            this(i10, i11, (i13 & 4) != 0 ? 0 : i12);
        }

        public static /* synthetic */ void getFontWeight$annotations() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResourceFont)) {
                return false;
            }
            ResourceFont resourceFont = (ResourceFont) obj;
            return this.resourceId == resourceFont.resourceId && m.b(this.fontWeight, resourceFont.fontWeight) && this.fontStyle == resourceFont.fontStyle;
        }

        public final int getFontStyle() {
            return this.fontStyle;
        }

        public final I getFontWeight() {
            return this.fontWeight;
        }

        public final int getResourceId() {
            return this.resourceId;
        }

        public int hashCode() {
            return (((this.resourceId * 31) + this.fontWeight.f11463a) * 31) + this.fontStyle;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ResourceFont(resourceId=");
            sb.append(this.resourceId);
            sb.append(", fontWeight=");
            sb.append(this.fontWeight);
            sb.append(", fontStyle=");
            return p.q(sb, this.fontStyle, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i10) {
            m.f(out, "out");
            out.writeInt(this.resourceId);
            FontWeightParceler.INSTANCE.write(this.fontWeight, out, i10);
            out.writeInt(this.fontStyle);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResourceFont(int i10, I fontWeight, int i11) {
            super(null);
            m.f(fontWeight, "fontWeight");
            this.resourceId = i10;
            this.fontWeight = fontWeight;
            this.fontStyle = i11;
        }
    }
}
