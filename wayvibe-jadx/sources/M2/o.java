package M2;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BufferedReader f8202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f8203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f8204c;

    public /* synthetic */ o(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.f8203b = arrayDeque;
        this.f8202a = bufferedReader;
    }

    public boolean a() throws IOException {
        String strTrim;
        if (this.f8204c == null) {
            ArrayDeque arrayDeque = this.f8203b;
            if (!arrayDeque.isEmpty()) {
                this.f8204c = (String) arrayDeque.poll();
                return true;
            }
            do {
                String line = this.f8202a.readLine();
                this.f8204c = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.f8204c = strTrim;
            } while (strTrim.isEmpty());
        }
        return true;
    }

    public boolean b() throws IOException {
        String strTrim;
        if (this.f8204c == null) {
            ArrayDeque arrayDeque = this.f8203b;
            if (!arrayDeque.isEmpty()) {
                String str = (String) arrayDeque.poll();
                str.getClass();
                this.f8204c = str;
                return true;
            }
            do {
                String line = this.f8202a.readLine();
                this.f8204c = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.f8204c = strTrim;
            } while (strTrim.isEmpty());
        }
        return true;
    }

    public String c() {
        if (!b()) {
            throw new NoSuchElementException();
        }
        String str = this.f8204c;
        this.f8204c = null;
        return str;
    }
}
