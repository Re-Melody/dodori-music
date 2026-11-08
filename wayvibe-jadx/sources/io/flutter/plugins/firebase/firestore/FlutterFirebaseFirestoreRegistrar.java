package io.flutter.plugins.firebase.firestore;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class FlutterFirebaseFirestoreRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<p023b7.a> getComponents() {
        return Collections.singletonList(p240w9.i.f("flutter-fire-fst", "5.6.12"));
    }
}
