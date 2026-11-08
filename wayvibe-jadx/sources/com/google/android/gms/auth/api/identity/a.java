package com.google.android.gms.auth.api.identity;

import android.content.Intent;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public interface a {
    Task authorize(AuthorizationRequest authorizationRequest);

    Task clearToken(ClearTokenRequest clearTokenRequest);

    d getAuthorizationResultFromIntent(Intent intent);

    Task revokeAccess(RevokeAccessRequest revokeAccessRequest);
}
