package com.google.android.gms.auth.api.identity;

import android.content.Intent;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public interface p {
    Task beginSignIn(i iVar);

    q getSignInCredentialFromIntent(Intent intent);

    Task getSignInIntent(l lVar);

    Task signOut();
}
