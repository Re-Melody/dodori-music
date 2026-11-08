package E7;

import com.google.gson.JsonElement;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
public abstract class y {
    public final Object fromJson(Reader reader) {
        return read(new M7.b(reader));
    }

    public final Object fromJsonTree(JsonElement jsonElement) {
        try {
            H7.i iVar = new H7.i(H7.i.f6177t);
            iVar.f6179p = new Object[32];
            iVar.f6180q = 0;
            iVar.r = new String[32];
            iVar.f6181s = new int[32];
            iVar.b0(jsonElement);
            return read(iVar);
        } catch (IOException e2) {
            throw new n(e2);
        }
    }

    public final y nullSafe() {
        return new j(this, 2);
    }

    public abstract Object read(M7.b bVar);

    public final void toJson(Writer writer, Object obj) {
        write(new M7.d(writer), obj);
    }

    public final JsonElement toJsonTree(Object obj) {
        try {
            H7.k kVar = new H7.k();
            write(kVar, obj);
            return kVar.I();
        } catch (IOException e2) {
            throw new n(e2);
        }
    }

    public abstract void write(M7.d dVar, Object obj);

    public final Object fromJson(String str) {
        return fromJson(new StringReader(str));
    }

    public final String toJson(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            toJson(stringWriter, obj);
            return stringWriter.toString();
        } catch (IOException e2) {
            throw new n(e2);
        }
    }
}
