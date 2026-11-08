package com.apple.android.music.playback.d;

import android.content.Context;
import android.content.SharedPreferences;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.apache.tika.pipes.pipesiterator.PipesIterator;

/* JADX INFO: loaded from: classes.dex */
public final class a implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile a f17243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f17244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<InterfaceC0015a> f17245c;

    /* JADX INFO: renamed from: com.apple.android.music.playback.d.a$a, reason: collision with other inner class name */
    public interface InterfaceC0015a {
        void o();

        void p();
    }

    private a(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.apple.android.music.playback_preferences", 0);
        this.f17244b = sharedPreferences;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
        this.f17245c = new CopyOnWriteArraySet();
        if (sharedPreferences.getInt(DiagnosticsEntry.VERSION_KEY, 0) != 1) {
            sharedPreferences.edit().putInt(DiagnosticsEntry.VERSION_KEY, 1).apply();
        }
    }

    public static a a(Context context) {
        if (f17243a == null) {
            synchronized (a.class) {
                f17243a = new a(context.getApplicationContext());
            }
        }
        return f17243a;
    }

    public int b() {
        return this.f17244b.getInt("key_eq_current_preset_idx", 0);
    }

    public int c() {
        return this.f17244b.getInt("key_eq_bass_boost", 0);
    }

    public int d() {
        return this.f17244b.getInt("subscription_status", 0);
    }

    public long e() {
        return this.f17244b.getLong("asset_cache_size", 200000000L);
    }

    public boolean f() {
        return this.f17244b.getBoolean("cellular_data_enabled", true);
    }

    public boolean g() {
        return f() && this.f17244b.getBoolean("high_quality_on_cellular_enabled", false);
    }

    public boolean h() {
        return this.f17244b.getBoolean("private_listening_enabled", false);
    }

    public boolean i() {
        return this.f17244b.getBoolean("explicit_content_allowed", true);
    }

    public int j() {
        return this.f17244b.getInt("max_tv_show_rating_allowed", PipesIterator.DEFAULT_QUEUE_SIZE);
    }

    public int k() {
        return this.f17244b.getInt("max_movie_rating_allowed", PipesIterator.DEFAULT_QUEUE_SIZE);
    }

    public boolean l() {
        return this.f17244b.getBoolean("key_renderv2_enabled", true);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("explicit_content_allowed".equals(str) || "max_movie_rating_allowed".equals(str) || "max_tv_show_rating_allowed".equals(str)) {
            Iterator<InterfaceC0015a> it = this.f17245c.iterator();
            while (it.hasNext()) {
                it.next().o();
            }
        } else if ("asset_cache_size".equals(str)) {
            Iterator<InterfaceC0015a> it2 = this.f17245c.iterator();
            while (it2.hasNext()) {
                it2.next().p();
            }
        }
    }

    public boolean a() {
        return this.f17244b.getBoolean("key_eq_enabled", false);
    }

    public void a(InterfaceC0015a interfaceC0015a) {
        this.f17245c.add(interfaceC0015a);
    }
}
