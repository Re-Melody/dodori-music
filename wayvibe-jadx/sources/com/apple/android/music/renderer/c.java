package com.apple.android.music.renderer;

import com.apple.android.music.renderer.javanative.SVDecryptor;
import com.apple.android.music.renderer.javanative.SVDecryptorFactory;
import java.nio.ByteBuffer;
import org.bytedeco.javacpp.IntPointer;

/* JADX INFO: loaded from: classes.dex */
public class c implements com.apple.android.music.playback.e.b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f17659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f17660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SVDecryptor.SVDecryptorPtr f17661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private IntPointer f17662d;

    public c(int i10, byte[] bArr, byte[] bArr2, int i11) {
        this(i10, bArr, bArr2, i11, true);
    }

    @Override // com.apple.android.music.playback.e.b.a
    public void a() {
        SVDecryptor.SVDecryptorPtr sVDecryptorPtr = this.f17661c;
        if (sVDecryptorPtr != null) {
            sVDecryptorPtr.deallocate();
            this.f17661c = null;
        }
    }

    public c(int i10, byte[] bArr, byte[] bArr2, int i11, boolean z10) {
        this.f17660b = i10;
        this.f17661c = SVDecryptorFactory.create(i10, bArr != null ? bArr : null, bArr != null ? bArr.length : 0, bArr2 != null ? bArr2 : null, bArr2 != null ? bArr2.length : 0, i11, z10);
        IntPointer intPointer = new IntPointer(1L);
        this.f17662d = intPointer;
        intPointer.put(0);
        this.f17659a = i11;
    }

    @Override // com.apple.android.music.playback.e.b.a
    public int a(ByteBuffer byteBuffer) {
        if (this.f17661c == null || byteBuffer.position() <= 0) {
            return -1;
        }
        int iPosition = byteBuffer.position();
        byteBuffer.position(0);
        this.f17661c.get().decryptSample(byteBuffer, iPosition, this.f17662d);
        int i10 = this.f17662d.get();
        if (i10 < iPosition && i10 > 0) {
            byteBuffer.position(i10);
        } else {
            byteBuffer.position(iPosition);
        }
        this.f17662d.put(0);
        return 0;
    }
}
