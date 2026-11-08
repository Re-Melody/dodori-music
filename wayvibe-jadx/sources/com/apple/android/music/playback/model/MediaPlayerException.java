package com.apple.android.music.playback.model;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class MediaPlayerException extends Exception implements Externalizable {
    public static final int ERROR_UNKNOWN = Integer.MIN_VALUE;
    public static final int TYPE_CHROMECAST_ERROR = 5;
    public static final int TYPE_DRM = 2;
    public static final int TYPE_EXPLICIT_VERIFY_AGE = 6;
    public static final int TYPE_IO = 1;
    public static final int TYPE_PLAYBACK_LEASE = 4;
    public static final int TYPE_PLAYBACK_QUEUE = 3;
    public static final int TYPE_UNKNOWN = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f17436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, String> f17437b;

    public MediaPlayerException() {
        this.f17436a = 0;
    }

    public void a(String str, String str2) {
        if (this.f17437b == null) {
            this.f17437b = new HashMap();
        }
        this.f17437b.put(str, str2);
    }

    public int getComponentErrorCode() {
        Throwable cause = getCause();
        return (this.f17436a == 2 && (cause instanceof e)) ? ((e) cause).a() : ERROR_UNKNOWN;
    }

    public int getErrorCode() {
        Throwable cause = getCause();
        int i10 = this.f17436a;
        if (i10 == 2) {
            return cause instanceof e ? ((e) cause).b() : ERROR_UNKNOWN;
        }
        if (i10 != 3) {
            if (i10 != 6) {
                return cause instanceof ErrorConditionException ? ((ErrorConditionException) cause).getErrorCode() : ERROR_UNKNOWN;
            }
            return cause instanceof ErrorConditionException ? ((ErrorConditionException) cause).getErrorCode() : ERROR_UNKNOWN;
        }
        if (cause instanceof f) {
            return ((f) cause).a();
        }
        return cause instanceof o ? ((o) cause).a() : ERROR_UNKNOWN;
    }

    public int getType() {
        return this.f17436a;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        this.f17436a = objectInput.readInt();
        try {
            Throwable th = (Throwable) objectInput.readObject();
            this.f17437b = (HashMap) objectInput.readObject();
            if (th != null) {
                initCause(th);
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeInt(this.f17436a);
        try {
            objectOutput.writeObject(getCause());
            objectOutput.writeObject(this.f17437b);
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    public MediaPlayerException(int i10, Throwable th) {
        super(th);
        this.f17436a = i10;
    }
}
