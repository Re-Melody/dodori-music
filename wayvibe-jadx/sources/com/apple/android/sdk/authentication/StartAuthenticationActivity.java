package com.apple.android.sdk.authentication;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.util.HashMap;
import p098j.AbstractActivityC1998k;

/* JADX INFO: loaded from: classes.dex */
public class StartAuthenticationActivity extends AbstractActivityC1998k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f17670a = "StartAuthenticationActivity";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f17671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f17672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private HashMap f17673d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Button f17674e;

    @Override // androidx.fragment.app.K, p036d.n, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        String str = f17670a;
        Log.d(str, "onActivityResult: " + i10 + ", data = " + intent + ", resultCode = " + i11);
        if (i10 == 2021) {
            if (i11 == -1 && intent != null) {
                Log.d(str, "onActivityResult: token passed is " + intent.getStringExtra("music_user_token"));
            }
            setResult(i11, intent);
            if (intent != null) {
                finish();
            }
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // p036d.n, android.app.Activity
    public void onBackPressed() {
        b();
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.K, p036d.n, androidx.core.app.AbstractActivityC1038h, android.app.Activity
    public void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        setContentView(R.layout.activity_approve_access);
        Uri data = getIntent().getData();
        if (data != null) {
            a(data);
            return;
        }
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f17671b = extras.getString("developer_token");
            string = extras.getString("custom_prompt_text");
            this.f17672c = extras.getString("contextual_upsell_id");
            if (extras.containsKey("custom_params")) {
                this.f17673d = (HashMap) extras.getSerializable("custom_params");
            }
        } else {
            string = null;
        }
        TextView textView = (TextView) findViewById(R.id.access_request_text1);
        if (TextUtils.isEmpty(string)) {
            textView.setText(Html.fromHtml(getString(R.string.approve_access_main, "<b><font color='black'>" + getPackageManager().getApplicationLabel(getApplicationInfo()).toString() + "</font></b>")));
        } else {
            textView.setText(Html.fromHtml(string));
        }
        ((ImageView) findViewById(R.id.app_logo)).setImageDrawable(a(getPackageManager()));
        Button button = (Button) findViewById(R.id.btn1);
        this.f17674e = button;
        button.setOnClickListener(new c(this));
        findViewById(R.id.close_button).setOnClickListener(new d(this));
    }

    @Override // p036d.n, android.app.Activity
    public void onNewIntent(Intent intent) {
        Log.d(f17670a, "onNewIntent: " + intent);
        super.onNewIntent(intent);
        a(intent.getData());
    }

    @Override // p098j.AbstractActivityC1998k, androidx.fragment.app.K, android.app.Activity
    public void onStart() {
        super.onStart();
        a();
    }

    private void a() {
        int iA = a.a(this);
        Log.d(f17670a, "refreshButton: isAppleMusicInstalled? " + iA);
        if (iA == 0) {
            findViewById(R.id.access_request_text2).setVisibility(8);
            this.f17674e.setText(R.string.btn_continue);
        } else if (iA == 1) {
            this.f17674e.setText(R.string.btn_update);
        } else {
            if (iA != 2) {
                return;
            }
            this.f17674e.setText(R.string.btn_install);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        Intent intent = new Intent();
        intent.putExtra("music_user_token_error", TokenError.USER_CANCELLED.getErrorCode());
        setResult(0, intent);
    }

    private Drawable a(PackageManager packageManager) {
        int i10;
        try {
            ApplicationInfo applicationInfo = getPackageManager().getApplicationInfo(getPackageName(), ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD);
            Resources resourcesForApplication = packageManager.getResourcesForApplication(applicationInfo);
            if (resourcesForApplication == null || (i10 = applicationInfo.icon) == 0) {
                return null;
            }
            return resourcesForApplication.getDrawableForDensity(i10, getResources().getDisplayMetrics().densityDpi);
        } catch (Exception e2) {
            Log.e(f17670a, "getDrawableForDpi: " + e2.getMessage());
            return null;
        }
    }

    private void a(Uri uri) {
        Intent intent = new Intent();
        Log.d(f17670a, "handleIntentData: setting token:" + uri.getQueryParameter("usertoken"));
        intent.putExtra("music_user_token", uri.getQueryParameter("usertoken"));
        setResult(-1, intent);
        finish();
    }
}
