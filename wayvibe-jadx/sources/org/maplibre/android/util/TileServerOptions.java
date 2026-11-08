package org.maplibre.android.util;

import B5.c;
import B8.V;
import Ba.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import p046da.e;

/* JADX INFO: loaded from: classes2.dex */
public class TileServerOptions implements Parcelable {
    public static final Parcelable.Creator<TileServerOptions> CREATOR = new c(6);

    @Keep
    private String apiKeyParameterName;

    @Keep
    private boolean apiKeyRequired;

    @Keep
    private String baseURL;

    @Keep
    private String defaultStyle;

    @Keep
    private DefaultStyle[] defaultStyles;

    @Keep
    private String glyphsDomainName;

    @Keep
    private String glyphsTemplate;

    @Keep
    private String glyphsVersionPrefix;

    @Keep
    private String sourceDomainName;

    @Keep
    private String sourceTemplate;

    @Keep
    private String sourceVersionPrefix;

    @Keep
    private String spritesDomainName;

    @Keep
    private String spritesTemplate;

    @Keep
    private String spritesVersionPrefix;

    @Keep
    private String styleDomainName;

    @Keep
    private String styleTemplate;

    @Keep
    private String styleVersionPrefix;

    @Keep
    private String tileDomainName;

    @Keep
    private String tileTemplate;

    @Keep
    private String tileVersionPrefix;

    @Keep
    private String uriSchemeAlias;

    @Keep
    public TileServerOptions(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, boolean z10, String str19, DefaultStyle[] defaultStyleArr) {
        this.baseURL = str;
        this.uriSchemeAlias = str2;
        this.sourceTemplate = str3;
        this.sourceDomainName = str4;
        this.sourceVersionPrefix = str5;
        this.styleTemplate = str6;
        this.styleDomainName = str7;
        this.styleVersionPrefix = str8;
        this.spritesTemplate = str9;
        this.spritesDomainName = str10;
        this.spritesVersionPrefix = str11;
        this.glyphsTemplate = str12;
        this.glyphsDomainName = str13;
        this.glyphsVersionPrefix = str14;
        this.tileTemplate = str15;
        this.tileDomainName = str16;
        this.tileVersionPrefix = str17;
        this.apiKeyParameterName = str18;
        this.defaultStyles = defaultStyleArr;
        this.defaultStyle = str19;
        this.apiKeyRequired = z10;
    }

    public static TileServerOptions a(e eVar) {
        int i10 = a.f908a[eVar.ordinal()];
        if (i10 == 1) {
            return mapboxConfiguration();
        }
        if (i10 == 2) {
            return mapTilerConfiguration();
        }
        if (i10 == 3) {
            return mapLibreConfiguration();
        }
        throw new V("Unknown tile server");
    }

    @Keep
    private static native TileServerOptions defaultConfiguration();

    @Keep
    private static native TileServerOptions mapLibreConfiguration();

    @Keep
    private static native TileServerOptions mapTilerConfiguration();

    @Keep
    private static native TileServerOptions mapboxConfiguration();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final DefaultStyle[] g() {
        return this.defaultStyles;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.baseURL);
        parcel.writeString(this.uriSchemeAlias);
        parcel.writeString(this.sourceTemplate);
        parcel.writeString(this.sourceDomainName);
        parcel.writeString(this.sourceVersionPrefix);
        parcel.writeString(this.styleTemplate);
        parcel.writeString(this.styleDomainName);
        parcel.writeString(this.styleVersionPrefix);
        parcel.writeString(this.spritesTemplate);
        parcel.writeString(this.spritesDomainName);
        parcel.writeString(this.spritesVersionPrefix);
        parcel.writeString(this.glyphsTemplate);
        parcel.writeString(this.glyphsDomainName);
        parcel.writeString(this.glyphsVersionPrefix);
        parcel.writeString(this.tileTemplate);
        parcel.writeString(this.tileDomainName);
        parcel.writeString(this.tileVersionPrefix);
        parcel.writeString(this.apiKeyParameterName);
        parcel.writeByte(this.apiKeyRequired ? (byte) 1 : (byte) 0);
        parcel.writeString(this.defaultStyle);
        parcel.writeTypedArray(this.defaultStyles, 0);
    }

    public TileServerOptions(Parcel parcel) {
        this.baseURL = parcel.readString();
        this.uriSchemeAlias = parcel.readString();
        this.sourceTemplate = parcel.readString();
        this.sourceDomainName = parcel.readString();
        this.sourceVersionPrefix = parcel.readString();
        this.styleTemplate = parcel.readString();
        this.styleDomainName = parcel.readString();
        this.styleVersionPrefix = parcel.readString();
        this.spritesTemplate = parcel.readString();
        this.spritesDomainName = parcel.readString();
        this.spritesVersionPrefix = parcel.readString();
        this.glyphsTemplate = parcel.readString();
        this.glyphsDomainName = parcel.readString();
        this.glyphsVersionPrefix = parcel.readString();
        this.tileTemplate = parcel.readString();
        this.tileDomainName = parcel.readString();
        this.tileVersionPrefix = parcel.readString();
        this.apiKeyParameterName = parcel.readString();
        this.apiKeyRequired = parcel.readByte() != 0;
        this.defaultStyle = parcel.readString();
        parcel.createTypedArray(DefaultStyle.CREATOR);
    }
}
