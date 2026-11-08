package D2;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class D extends AbstractC0202c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1830e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f1831f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DatagramPacket f1832g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Uri f1833h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public DatagramSocket f1834i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MulticastSocket f1835j;
    public InetAddress k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1836l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1837m;

    public D() {
        super(true);
        this.f1830e = 8000;
        byte[] bArr = new byte[2000];
        this.f1831f = bArr;
        this.f1832g = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // D2.h
    public final void close() {
        this.f1833h = null;
        MulticastSocket multicastSocket = this.f1835j;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.k;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f1835j = null;
        }
        DatagramSocket datagramSocket = this.f1834i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f1834i = null;
        }
        this.k = null;
        this.f1837m = 0;
        if (this.f1836l) {
            this.f1836l = false;
            b();
        }
    }

    @Override // D2.h
    public final long l(k kVar) throws C {
        Uri uri = kVar.f1865a;
        this.f1833h = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f1833h.getPort();
        c();
        try {
            this.k = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.k, port);
            if (this.k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f1835j = multicastSocket;
                multicastSocket.joinGroup(this.k);
                this.f1834i = this.f1835j;
            } else {
                this.f1834i = new DatagramSocket(inetSocketAddress);
            }
            this.f1834i.setSoTimeout(this.f1830e);
            this.f1836l = true;
            e(kVar);
            return -1L;
        } catch (IOException e2) {
            throw new C(2001, e2);
        } catch (SecurityException e4) {
            throw new C(2006, e4);
        }
    }

    @Override // p255y2.InterfaceC2333i
    public final int read(byte[] bArr, int i10, int i11) throws C {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f1837m;
        DatagramPacket datagramPacket = this.f1832g;
        if (i12 == 0) {
            try {
                DatagramSocket datagramSocket = this.f1834i;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f1837m = length;
                a(length);
            } catch (SocketTimeoutException e2) {
                throw new C(2002, e2);
            } catch (IOException e4) {
                throw new C(2001, e4);
            }
        }
        int length2 = datagramPacket.getLength();
        int i13 = this.f1837m;
        int iMin = Math.min(i13, i11);
        System.arraycopy(this.f1831f, length2 - i13, bArr, i10, iMin);
        this.f1837m -= iMin;
        return iMin;
    }

    @Override // D2.h
    public final Uri s() {
        return this.f1833h;
    }
}
