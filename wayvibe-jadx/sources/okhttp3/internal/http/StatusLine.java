package okhttp3.internal.http;

import java.net.ProtocolException;
import kotlin.jvm.internal.m;
import okhttp3.Protocol;
import p097i9.r;

/* JADX INFO: loaded from: classes2.dex */
public final class StatusLine {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Companion f24355d = new Companion(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Protocol f24356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24358c;

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        public static StatusLine a(String statusLine) throws ProtocolException {
            Protocol protocol;
            int i10;
            String strSubstring;
            m.f(statusLine, "statusLine");
            if (r.j0(statusLine, "HTTP/1.", false)) {
                i10 = 9;
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                int iCharAt = statusLine.charAt(7) - '0';
                if (iCharAt == 0) {
                    protocol = Protocol.HTTP_1_0;
                } else {
                    if (iCharAt != 1) {
                        throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                    }
                    protocol = Protocol.HTTP_1_1;
                }
            } else if (r.j0(statusLine, "ICY ", false)) {
                protocol = Protocol.HTTP_1_0;
                i10 = 4;
            } else {
                if (!r.j0(statusLine, "SOURCETABLE ", false)) {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                protocol = Protocol.HTTP_1_1;
                i10 = 12;
            }
            int i11 = i10 + 3;
            if (statusLine.length() < i11) {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            String strSubstring2 = statusLine.substring(i10, i11);
            m.e(strSubstring2, "substring(...)");
            Integer numK0 = r.k0(strSubstring2);
            if (numK0 == null) {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            int iIntValue = numK0.intValue();
            if (statusLine.length() <= i11) {
                strSubstring = "";
            } else {
                if (statusLine.charAt(i11) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                strSubstring = statusLine.substring(i10 + 4);
                m.e(strSubstring, "substring(...)");
            }
            return new StatusLine(protocol, iIntValue, strSubstring);
        }

        private Companion() {
        }
    }

    public StatusLine(Protocol protocol, int i10, String message) {
        m.f(protocol, "protocol");
        m.f(message, "message");
        this.f24356a = protocol;
        this.f24357b = i10;
        this.f24358c = message;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f24356a == Protocol.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.f24357b);
        sb.append(' ');
        sb.append(this.f24358c);
        return sb.toString();
    }
}
