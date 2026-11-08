package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class G extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f18379a;

    public static G f() {
        return new G("Protocol message contained an invalid tag (zero).");
    }

    public static G g() {
        return new G("Protocol message had invalid UTF-8.");
    }

    public static F k() {
        return new F("Protocol message tag had invalid wire type.");
    }

    public static G l() {
        return new G("CodedInputStream encountered a malformed varint.");
    }

    public static G m() {
        return new G("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static G n() {
        return new G("Failed to parse the message.");
    }

    public static G o() {
        return new G("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
