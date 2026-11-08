package p196s5;

import S9.b;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.zip.Adler32;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import p138m5.i;
import p205t5.d;
import p205t5.h;
import p236w5.a;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f26127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f26128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f26129c;

    public c(Context context, d dVar, a aVar) {
        this.f26127a = context;
        this.f26128b = dVar;
        this.f26129c = aVar;
    }

    public final void a(i iVar, int i10, boolean z10) {
        Context context = this.f26127a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(iVar.f22327a.getBytes(Charset.forName("UTF-8")));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        p104j5.c cVar = iVar.f22329c;
        adler32.update(byteBufferAllocate.putInt(a.a(cVar)).array());
        byte[] bArr = iVar.f22328b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z10) {
            for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                int i11 = jobInfo.getExtras().getInt("attemptNumber");
                if (jobInfo.getId() == value) {
                    if (i11 < i10) {
                        break;
                    }
                    b.l(iVar, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                    return;
                }
            }
        }
        SQLiteDatabase sQLiteDatabaseB = ((h) this.f26128b).b();
        String strValueOf = String.valueOf(a.a(cVar));
        String str = iVar.f22327a;
        Cursor cursorRawQuery = sQLiteDatabaseB.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, strValueOf});
        try {
            Long lValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            a aVar = this.f26129c;
            builder.setMinimumLatency(aVar.a(cVar, jLongValue, i10));
            Set set = ((b) aVar.f26123b.get(cVar)).f26126c;
            if (set.contains(d.NETWORK_UNMETERED)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(d.DEVICE_CHARGING)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(d.DEVICE_IDLE)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i10);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt(MimeTypesReaderMetKeys.MAGIC_PRIORITY_ATTR, a.a(cVar));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {iVar, Integer.valueOf(value), Long.valueOf(aVar.a(cVar, jLongValue, i10)), lValueOf, Integer.valueOf(i10)};
            String strL = b.L("JobInfoScheduler");
            if (Log.isLoggable(strL, 3)) {
                Log.d(strL, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }
}
