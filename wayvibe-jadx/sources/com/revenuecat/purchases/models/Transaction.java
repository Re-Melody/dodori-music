package com.revenuecat.purchases.models;

import B2.AbstractC0112b;
import M8.InterfaceC0641c;
import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.JsonTools;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.common.responses.SubscriptionInfoResponse;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import org.json.JSONException;
import org.json.JSONObject;
import p097i9.k;
import p134m1.b;
import p270z9.AbstractC2449b;

/* JADX INFO: loaded from: classes2.dex */
public final class Transaction implements Parcelable {
    public static final Parcelable.Creator<Transaction> CREATOR = new Creator();
    private final String displayName;
    private final boolean isSandbox;
    private final Date originalPurchaseDate;
    private final Price price;
    private final String productId;
    private final String productIdentifier;
    private final Date purchaseDate;
    private final String revenuecatId;
    private final Store store;
    private final String storeTransactionId;
    private final String transactionIdentifier;

    public static final class Creator implements Parcelable.Creator<Transaction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Transaction createFromParcel(Parcel parcel) {
            m.f(parcel, "parcel");
            return new Transaction(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Date) parcel.readSerializable(), parcel.readString(), Store.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0, (Date) parcel.readSerializable(), parcel.readInt() == 0 ? null : Price.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Transaction[] newArray(int i10) {
            return new Transaction[i10];
        }
    }

    public Transaction(String transactionIdentifier, String revenuecatId, String productIdentifier, String productId, Date purchaseDate, String str, Store store, String str2, boolean z10, Date date, Price price) {
        m.f(transactionIdentifier, "transactionIdentifier");
        m.f(revenuecatId, "revenuecatId");
        m.f(productIdentifier, "productIdentifier");
        m.f(productId, "productId");
        m.f(purchaseDate, "purchaseDate");
        m.f(store, "store");
        this.transactionIdentifier = transactionIdentifier;
        this.revenuecatId = revenuecatId;
        this.productIdentifier = productIdentifier;
        this.productId = productId;
        this.purchaseDate = purchaseDate;
        this.storeTransactionId = str;
        this.store = store;
        this.displayName = str2;
        this.isSandbox = z10;
        this.originalPurchaseDate = date;
        this.price = price;
    }

    @InterfaceC0641c
    public static /* synthetic */ void getProductId$annotations() {
    }

    @InterfaceC0641c
    public static /* synthetic */ void getRevenuecatId$annotations() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Transaction)) {
            return false;
        }
        Transaction transaction = (Transaction) obj;
        return m.b(this.transactionIdentifier, transaction.transactionIdentifier) && m.b(this.revenuecatId, transaction.revenuecatId) && m.b(this.productIdentifier, transaction.productIdentifier) && m.b(this.productId, transaction.productId) && m.b(this.purchaseDate, transaction.purchaseDate) && m.b(this.storeTransactionId, transaction.storeTransactionId) && this.store == transaction.store && m.b(this.displayName, transaction.displayName) && this.isSandbox == transaction.isSandbox && m.b(this.originalPurchaseDate, transaction.originalPurchaseDate) && m.b(this.price, transaction.price);
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final Date getOriginalPurchaseDate() {
        return this.originalPurchaseDate;
    }

    public final Price getPrice() {
        return this.price;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getProductIdentifier() {
        return this.productIdentifier;
    }

    public final Date getPurchaseDate() {
        return this.purchaseDate;
    }

    public final String getRevenuecatId() {
        return this.revenuecatId;
    }

    public final Store getStore() {
        return this.store;
    }

    public final String getStoreTransactionId() {
        return this.storeTransactionId;
    }

    public final String getTransactionIdentifier() {
        return this.transactionIdentifier;
    }

    public int hashCode() {
        int iHashCode = (this.purchaseDate.hashCode() + AbstractC0112b.a(AbstractC0112b.a(AbstractC0112b.a(this.transactionIdentifier.hashCode() * 31, 31, this.revenuecatId), 31, this.productIdentifier), 31, this.productId)) * 31;
        String str = this.storeTransactionId;
        int iHashCode2 = (this.store.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.displayName;
        int iF = b.f((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.isSandbox);
        Date date = this.originalPurchaseDate;
        int iHashCode3 = (iF + (date == null ? 0 : date.hashCode())) * 31;
        Price price = this.price;
        return iHashCode3 + (price != null ? price.hashCode() : 0);
    }

    public final boolean isSandbox() {
        return this.isSandbox;
    }

    public String toString() {
        return "Transaction(transactionIdentifier=" + this.transactionIdentifier + ", revenuecatId=" + this.revenuecatId + ", productIdentifier=" + this.productIdentifier + ", productId=" + this.productId + ", purchaseDate=" + this.purchaseDate + ", storeTransactionId=" + this.storeTransactionId + ", store=" + this.store + ", displayName=" + this.displayName + ", isSandbox=" + this.isSandbox + ", originalPurchaseDate=" + this.originalPurchaseDate + ", price=" + this.price + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i10) {
        m.f(out, "out");
        out.writeString(this.transactionIdentifier);
        out.writeString(this.revenuecatId);
        out.writeString(this.productIdentifier);
        out.writeString(this.productId);
        out.writeSerializable(this.purchaseDate);
        out.writeString(this.storeTransactionId);
        out.writeString(this.store.name());
        out.writeString(this.displayName);
        out.writeInt(this.isSandbox ? 1 : 0);
        out.writeSerializable(this.originalPurchaseDate);
        Price price = this.price;
        if (price == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            price.writeToParcel(out, i10);
        }
    }

    public /* synthetic */ Transaction(String str, String str2, String str3, String str4, Date date, String str5, Store store, String str6, boolean z10, Date date2, Price price, int i10, f fVar) {
        this(str, str2, str3, str4, date, str5, store, str6, (i10 & 256) != 0 ? false : z10, date2, price);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC0641c
    public Transaction(String transactionIdentifier, String revenuecatId, String productIdentifier, String productId, Date purchaseDate, String str, Store store) {
        this(transactionIdentifier, revenuecatId, productIdentifier, productId, purchaseDate, str, store, null, false, null, null);
        m.f(transactionIdentifier, "transactionIdentifier");
        m.f(revenuecatId, "revenuecatId");
        m.f(productIdentifier, "productIdentifier");
        m.f(productId, "productId");
        m.f(purchaseDate, "purchaseDate");
        m.f(store, "store");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Transaction(String str, JSONObject jSONObject, Locale locale, int i10, f fVar) {
        if ((i10 & 4) != 0) {
            locale = Locale.getDefault();
            m.e(locale, "getDefault()");
        }
        this(str, jSONObject, locale);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Transaction(String productId, JSONObject jsonObject, Locale locale) throws JSONException {
        String string;
        m.f(productId, "productId");
        m.f(jsonObject, "jsonObject");
        m.f(locale, "locale");
        String string2 = jsonObject.getString(DiagnosticsEntry.ID_KEY);
        m.e(string2, "jsonObject.getString(\"id\")");
        String string3 = jsonObject.getString(DiagnosticsEntry.ID_KEY);
        m.e(string3, "jsonObject.getString(\"id\")");
        Date date = JSONObjectExtensionsKt.getDate(jsonObject, "purchase_date");
        String it = jsonObject.optString("store_transaction_id");
        m.e(it, "it");
        Price price = null;
        it = k.x0(it) ? null : it;
        String it2 = jsonObject.getString(ProductResponseJsonKeys.STORE);
        Store.Companion companion = Store.Companion;
        m.e(it2, "it");
        Store storeFromString = companion.fromString(it2);
        String it3 = jsonObject.optString("display_name");
        m.e(it3, "it");
        String str = !k.x0(it3) ? it3 : null;
        boolean zOptBoolean = jsonObject.optBoolean(ProductResponseJsonKeys.IS_SANDBOX, false);
        Date dateOptDate = JSONObjectExtensionsKt.optDate(jsonObject, "original_purchase_date");
        JSONObject jSONObjectOptJSONObject = jsonObject.optJSONObject(com.amazon.a.a.o.b.f16423x);
        if (jSONObjectOptJSONObject != null && (string = jSONObjectOptJSONObject.toString()) != null) {
            AbstractC2449b json = JsonTools.INSTANCE.getJson();
            json.getClass();
            price = ((SubscriptionInfoResponse.PriceResponse) json.b(string, SubscriptionInfoResponse.PriceResponse.Companion.serializer())).toPrice(locale);
        }
        this(string2, string3, productId, productId, date, it, storeFromString, str, zOptBoolean, dateOptDate, price);
    }
}
