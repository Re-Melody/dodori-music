package org.apache.tika.pipes.async;

import B2.AbstractC0112b;
import V0.p;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import org.apache.tika.pipes.PipesResult;
import org.apache.tika.pipes.pipesiterator.TotalCountResult;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
public class AsyncStatus {
    private Instant lastUpdate;
    private final Instant started;
    private TotalCountResult totalCountResult = new TotalCountResult(0, TotalCountResult.STATUS.NOT_COMPLETED);
    private Map<PipesResult.STATUS, Long> statusCounts = new HashMap();
    private ASYNC_STATUS asyncStatus = ASYNC_STATUS.STARTED;
    private String crashMessage = "";

    public enum ASYNC_STATUS {
        STARTED,
        COMPLETED,
        CRASHED
    }

    public AsyncStatus() {
        Instant instantNow = Instant.now();
        this.started = instantNow;
        this.lastUpdate = instantNow;
    }

    public ASYNC_STATUS getAsyncStatus() {
        return this.asyncStatus;
    }

    public String getCrashMessage() {
        return this.crashMessage;
    }

    public Instant getLastUpdate() {
        return this.lastUpdate;
    }

    public Instant getStarted() {
        return this.started;
    }

    public Map<PipesResult.STATUS, Long> getStatusCounts() {
        return this.statusCounts;
    }

    public TotalCountResult getTotalCountResult() {
        return this.totalCountResult;
    }

    public String toString() {
        String strValueOf = String.valueOf(this.started);
        String strValueOf2 = String.valueOf(this.lastUpdate);
        String strValueOf3 = String.valueOf(this.totalCountResult);
        String strValueOf4 = String.valueOf(this.statusCounts);
        String strValueOf5 = String.valueOf(this.asyncStatus);
        String str = this.crashMessage;
        StringBuilder sbQ = b.q("AsyncStatus{started=", strValueOf, ", lastUpdate=", strValueOf2, ", totalCountResult=");
        p.y(sbQ, strValueOf3, ", statusCounts=", strValueOf4, ", asyncStatus=");
        return AbstractC0112b.l(sbQ, strValueOf5, ", crashMessage='", str, "'}");
    }

    public synchronized void update(Map<PipesResult.STATUS, Long> map, TotalCountResult totalCountResult, ASYNC_STATUS async_status) {
        this.lastUpdate = Instant.now();
        this.statusCounts = map;
        this.totalCountResult = totalCountResult;
        this.asyncStatus = async_status;
    }

    public void updateCrash(String str) {
        this.crashMessage = str;
    }
}
