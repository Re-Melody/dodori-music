package org.apache.tika.pipes.fetcher;

import java.io.Serializable;
import java.util.Objects;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
public class FetchKey implements Serializable {
    private static final long serialVersionUID = -3861669115439125268L;
    private String fetchKey;
    private String fetcherName;
    private long rangeEnd;
    private long rangeStart;

    public FetchKey() {
        this.rangeStart = -1L;
        this.rangeEnd = -1L;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            FetchKey fetchKey = (FetchKey) obj;
            if (this.rangeStart == fetchKey.rangeStart && this.rangeEnd == fetchKey.rangeEnd && Objects.equals(this.fetcherName, fetchKey.fetcherName) && Objects.equals(this.fetchKey, fetchKey.fetchKey)) {
                return true;
            }
        }
        return false;
    }

    public String getFetchKey() {
        return this.fetchKey;
    }

    public String getFetcherName() {
        return this.fetcherName;
    }

    public long getRangeEnd() {
        return this.rangeEnd;
    }

    public long getRangeStart() {
        return this.rangeStart;
    }

    public boolean hasRange() {
        return this.rangeStart > -1 && this.rangeEnd > -1;
    }

    public int hashCode() {
        return Objects.hash(this.fetcherName, this.fetchKey, Long.valueOf(this.rangeStart), Long.valueOf(this.rangeEnd));
    }

    public String toString() {
        String str = this.fetcherName;
        String str2 = this.fetchKey;
        long j10 = this.rangeStart;
        long j11 = this.rangeEnd;
        StringBuilder sbQ = b.q("FetchKey{fetcherName='", str, "', fetchKey='", str2, "', rangeStart=");
        sbQ.append(j10);
        sbQ.append(", rangeEnd=");
        sbQ.append(j11);
        sbQ.append("}");
        return sbQ.toString();
    }

    public FetchKey(String str, String str2) {
        this(str, str2, -1L, -1L);
    }

    public FetchKey(String str, String str2, long j10, long j11) {
        this.fetcherName = str;
        this.fetchKey = str2;
        this.rangeStart = j10;
        this.rangeEnd = j11;
    }
}
