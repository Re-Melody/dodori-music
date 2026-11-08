package org.maplibre.android.maps;

/* JADX INFO: loaded from: classes2.dex */
public class NativeMapOptions {
    private final boolean actionJournalEnabled;
    private final long actionJournalLogFileCount;
    private final long actionJournalLogFileSize;
    private final String actionJournalPath;
    private final int actionJournalRenderingReportInterval;
    private final boolean crossSourceCollisions;
    private final float pixelRatio;

    public NativeMapOptions(x xVar) {
        this.pixelRatio = xVar.f25038J;
        this.crossSourceCollisions = xVar.f25039K;
        this.actionJournalEnabled = xVar.f25040L;
        this.actionJournalPath = xVar.f25041M;
        this.actionJournalLogFileSize = xVar.f25042N;
        this.actionJournalLogFileCount = xVar.f25043O;
        this.actionJournalRenderingReportInterval = xVar.f25044P;
    }

    public boolean actionJournalEnabled() {
        return this.actionJournalEnabled;
    }

    public long actionJournalLogFileCount() {
        return this.actionJournalLogFileCount;
    }

    public long actionJournalLogFileSize() {
        return this.actionJournalLogFileSize;
    }

    public String actionJournalPath() {
        return this.actionJournalPath;
    }

    public int actionJournalRenderingReportInterval() {
        return this.actionJournalRenderingReportInterval;
    }

    public boolean crossSourceCollisions() {
        return this.crossSourceCollisions;
    }

    public float pixelRatio() {
        return this.pixelRatio;
    }

    public NativeMapOptions(float f10, boolean z10) {
        this.pixelRatio = f10;
        this.crossSourceCollisions = z10;
        this.actionJournalEnabled = false;
        this.actionJournalPath = "";
        this.actionJournalLogFileSize = 0L;
        this.actionJournalLogFileCount = 0L;
        this.actionJournalRenderingReportInterval = 0;
    }
}
