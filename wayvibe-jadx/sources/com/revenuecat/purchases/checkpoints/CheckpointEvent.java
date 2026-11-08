package com.revenuecat.purchases.checkpoints;

import com.revenuecat.purchases.common.events.FeatureEvent;
import java.util.Date;
import java.util.UUID;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class CheckpointEvent implements FeatureEvent {
    private final UUID id;
    private final String identifier;
    private final Date timestamp;

    public CheckpointEvent(String identifier, UUID id, Date timestamp) {
        m.f(identifier, "identifier");
        m.f(id, "id");
        m.f(timestamp, "timestamp");
        this.identifier = identifier;
        this.id = id;
        this.timestamp = timestamp;
    }

    public static /* synthetic */ CheckpointEvent copy$default(CheckpointEvent checkpointEvent, String str, UUID uuid, Date date, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = checkpointEvent.identifier;
        }
        if ((i10 & 2) != 0) {
            uuid = checkpointEvent.id;
        }
        if ((i10 & 4) != 0) {
            date = checkpointEvent.timestamp;
        }
        return checkpointEvent.copy(str, uuid, date);
    }

    public final String component1() {
        return this.identifier;
    }

    public final UUID component2() {
        return this.id;
    }

    public final Date component3() {
        return this.timestamp;
    }

    public final CheckpointEvent copy(String identifier, UUID id, Date timestamp) {
        m.f(identifier, "identifier");
        m.f(id, "id");
        m.f(timestamp, "timestamp");
        return new CheckpointEvent(identifier, id, timestamp);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckpointEvent)) {
            return false;
        }
        CheckpointEvent checkpointEvent = (CheckpointEvent) obj;
        return m.b(this.identifier, checkpointEvent.identifier) && m.b(this.id, checkpointEvent.id) && m.b(this.timestamp, checkpointEvent.timestamp);
    }

    public final UUID getId() {
        return this.id;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final Date getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return this.timestamp.hashCode() + ((this.id.hashCode() + (this.identifier.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "CheckpointEvent(identifier=" + this.identifier + ", id=" + this.id + ", timestamp=" + this.timestamp + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CheckpointEvent(String str, UUID uuid, Date date, int i10, f fVar) {
        if ((i10 & 2) != 0) {
            uuid = UUID.randomUUID();
            m.e(uuid, "randomUUID()");
        }
        this(str, uuid, (i10 & 4) != 0 ? new Date() : date);
    }
}
