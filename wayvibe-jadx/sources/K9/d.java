package K9;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d extends c {
    private final Serializable tag;

    public d(InputStream inputStream) {
        super(inputStream);
        this.tag = UUID.randomUUID();
    }

    @Override // K9.c
    public void handleIOException(IOException iOException) throws G9.e {
        throw new G9.e(iOException, this.tag);
    }

    public boolean isCauseOf(Throwable th) {
        Serializable serializable = this.tag;
        int i10 = G9.e.f5699b;
        return serializable != null && (th instanceof G9.e) && serializable.equals(((G9.e) th).f5700a);
    }

    public void throwIfCauseOf(Throwable th) throws IOException {
        Serializable serializable = this.tag;
        int i10 = G9.e.f5699b;
        if (serializable != null && (th instanceof G9.e) && serializable.equals(((G9.e) th).f5700a)) {
            throw ((G9.e) th).getCause();
        }
    }
}
