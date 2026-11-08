package org.apache.tika.extractor;

import org.apache.tika.metadata.Metadata;

/* JADX INFO: loaded from: classes2.dex */
public interface DocumentSelector {
    boolean select(Metadata metadata);
}
