package io.flutter.plugins.firebase.auth;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class FlutterFirebaseAuthRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<p023b7.a> getComponents() {
        return Collections.singletonList(p240w9.i.f("flutter-fire-auth", "5.7.0"));
    }
}
