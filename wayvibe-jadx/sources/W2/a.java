package W2;

import android.os.SystemClock;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import org.apache.tika.fork.ForkServer;
import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f12776a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f12777b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f12778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static long f12779d;

    public static long a() throws UnknownHostException {
        synchronized (f12777b) {
        }
        InetAddress byName = InetAddress.getByName("time.android.com");
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jCurrentTimeMillis == 0) {
                Arrays.fill(bArr, 40, 48, (byte) 0);
            } else {
                long j10 = jCurrentTimeMillis / 1000;
                long j11 = jCurrentTimeMillis - (j10 * 1000);
                long j12 = j10 + 2208988800L;
                bArr[40] = (byte) (j12 >> 24);
                bArr[41] = (byte) (j12 >> 16);
                bArr[42] = (byte) (j12 >> 8);
                bArr[43] = (byte) j12;
                long j13 = (j11 * 4294967296L) / 1000;
                bArr[44] = (byte) (j13 >> 24);
                bArr[45] = (byte) (j13 >> 16);
                bArr[46] = (byte) (j13 >> 8);
                bArr[47] = (byte) (Math.random() * 255.0d);
            }
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            long j14 = (jElapsedRealtime2 - jElapsedRealtime) + jCurrentTimeMillis;
            byte b10 = bArr[0];
            int i10 = bArr[1] & ForkServer.ERROR;
            long jD = d(bArr, 24);
            long jD2 = d(bArr, 32);
            long jD3 = d(bArr, 40);
            b((byte) ((b10 >> 6) & 3), (byte) (b10 & 7), i10, jD3);
            long j15 = (j14 + (((jD3 - j14) + (jD2 - jD)) / 2)) - jElapsedRealtime2;
            datagramSocket.close();
            return j15;
        } catch (Throwable th) {
            try {
                datagramSocket.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public static void b(byte b10, byte b11, int i10, long j10) throws IOException {
        if (b10 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b11 != 4 && b11 != 5) {
            throw new IOException(b.j(b11, "SNTP: Untrusted mode: "));
        }
        if (i10 == 0 || i10 > 15) {
            throw new IOException(b.j(i10, "SNTP: Untrusted stratum: "));
        }
        if (j10 == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    public static long c(byte[] bArr, int i10) {
        int i11 = bArr[i10];
        int i12 = bArr[i10 + 1];
        int i13 = bArr[i10 + 2];
        int i14 = bArr[i10 + 3];
        if ((i11 & ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD) == 128) {
            i11 = (i11 & 127) + ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD;
        }
        if ((i12 & ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD) == 128) {
            i12 = (i12 & 127) + ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD;
        }
        if ((i13 & ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD) == 128) {
            i13 = (i13 & 127) + ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD;
        }
        if ((i14 & ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD) == 128) {
            i14 = (i14 & 127) + ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD;
        }
        return (((long) i11) << 24) + (((long) i12) << 16) + (((long) i13) << 8) + ((long) i14);
    }

    public static long d(byte[] bArr, int i10) {
        long jC = c(bArr, i10);
        long jC2 = c(bArr, i10 + 4);
        if (jC == 0 && jC2 == 0) {
            return 0L;
        }
        return ((jC2 * 1000) / 4294967296L) + ((jC - 2208988800L) * 1000);
    }
}
