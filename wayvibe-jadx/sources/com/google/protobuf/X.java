package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class X extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f18707a;

    public static X f() {
        return new X("Protocol message end-group tag did not match expected tag.");
    }

    public static X g() {
        return new X("Protocol message contained an invalid tag (zero).");
    }

    public static X k() {
        return new X("Protocol message had invalid UTF-8.");
    }

    public static W l() {
        return new W("Protocol message tag had invalid wire type.");
    }

    public static X m() {
        return new X("CodedInputStream encountered a malformed varint.");
    }

    public static X n() {
        return new X("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static X o() {
        return new X("Failed to parse the message.");
    }

    public static X p() {
        return new X("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
