package ya;

import android.content.Context;
import android.os.AsyncTask;
import org.maplibre.android.storage.FileSource;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends AsyncTask {
    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        Context[] contextArr = (Context[]) objArr;
        FileSource.d(contextArr[0]);
        FileSource.c(contextArr[0]);
        return null;
    }
}
