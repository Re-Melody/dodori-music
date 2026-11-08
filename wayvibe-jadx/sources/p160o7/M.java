package p160o7;

import android.database.sqlite.SQLiteTransactionListener;

/* JADX INFO: loaded from: classes.dex */
public final class M implements SQLiteTransactionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O f23707a;

    public M(O o10) {
        this.f23707a = o10;
    }

    @Override // android.database.sqlite.SQLiteTransactionListener
    public final void onBegin() {
        this.f23707a.f23715j.j();
    }

    @Override // android.database.sqlite.SQLiteTransactionListener
    public final void onCommit() {
        this.f23707a.f23715j.f();
    }

    @Override // android.database.sqlite.SQLiteTransactionListener
    public final void onRollback() {
    }
}
