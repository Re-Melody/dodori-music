package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.InterfaceC1162d;
import com.google.android.gms.common.internal.InterfaceC1163e;
import com.google.android.gms.common.internal.InterfaceC1172n;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface g extends InterfaceC1132b {
    void connect(InterfaceC1162d interfaceC1162d);

    void disconnect();

    void disconnect(String str);

    H5.d[] getAvailableFeatures();

    String getEndpointPackageName();

    String getLastDisconnectMessage();

    int getMinApkVersion();

    void getRemoteService(InterfaceC1172n interfaceC1172n, Set set);

    Set getScopesForConnectionlessNonSignIn();

    boolean isConnected();

    boolean isConnecting();

    void onUserSignOut(InterfaceC1163e interfaceC1163e);

    boolean requiresGooglePlayServices();

    boolean requiresSignIn();
}
