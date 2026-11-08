package org.apache.tika.mime;

import B2.AbstractC0112b;
import java.util.Iterator;
import java.util.List;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
class MinShouldMatchClause implements Clause {
    private final List<Clause> clauses;
    private final int min;

    public MinShouldMatchClause(int i10, List<Clause> list) {
        if (list == null || list.size() == 0) {
            throw new IllegalArgumentException("clauses must be not null with size > 0");
        }
        if (i10 > list.size()) {
            throw new IllegalArgumentException(AbstractC0112b.f("min (", i10, ") cannot be > clauses.size (", list.size(), ")"));
        }
        if (i10 <= 0) {
            throw new IllegalArgumentException(b.j(i10, "min cannot be <= 0: "));
        }
        this.min = i10;
        this.clauses = list;
    }

    @Override // org.apache.tika.mime.Clause
    public boolean eval(byte[] bArr) {
        Iterator<Clause> it = this.clauses.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (it.next().eval(bArr) && (i10 = i10 + 1) >= this.min) {
                return true;
            }
        }
        return false;
    }

    @Override // org.apache.tika.mime.Clause
    public int size() {
        Iterator<Clause> it = this.clauses.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().size());
        }
        return iMax;
    }

    public String toString() {
        return "minShouldMatch (min: " + this.min + ") " + String.valueOf(this.clauses);
    }
}
