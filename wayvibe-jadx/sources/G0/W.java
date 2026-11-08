package G0;

import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import org.apache.tika.utils.XMLReaderUtils;

/* JADX INFO: loaded from: classes.dex */
public final class W extends kotlin.jvm.internal.n implements Z8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final W f5131b = new W(0, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final W f5132c = new W(0, 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final W f5133d = new W(0, 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final W f5134e = new W(0, 3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final W f5135f = new W(0, 4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final W f5136g = new W(0, 5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final W f5137h = new W(0, 6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final W f5138i = new W(0, 7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final W f5139j = new W(0, 8);
    public static final W k = new W(0, 9);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final W f5140l = new W(0, 10);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final W f5141m = new W(0, 11);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final W f5142n = new W(0, 12);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final W f5143o = new W(0, 13);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final W f5144p = new W(0, 14);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final W f5145q = new W(0, 15);
    public static final W r = new W(0, 16);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final W f5146s = new W(0, 17);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final W f5147t = new W(0, 18);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final W f5148u = new W(0, 19);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final W f5149v = new W(0, 20);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final W f5150w = new W(0, 21);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final W f5151x = new W(0, 22);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final W f5152y = new W(0, 23);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final W f5153z = new W(0, 24);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final W f5127A = new W(0, 25);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final W f5128B = new W(0, 26);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final W f5129C = new W(0, 27);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final W f5130D = new W(0, 28);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W(int i10, int i11) {
        super(i10);
        this.f5154a = i11;
    }

    @Override // Z8.a
    public final Object invoke() {
        Choreographer choreographer;
        switch (this.f5154a) {
            case 0:
                AndroidCompositionLocals_androidKt.b("LocalConfiguration");
                throw null;
            case 1:
                AndroidCompositionLocals_androidKt.b("LocalContext");
                throw null;
            case 2:
                AndroidCompositionLocals_androidKt.b("LocalImageVectorCache");
                throw null;
            case 3:
                AndroidCompositionLocals_androidKt.b("LocalResourceIdCache");
                throw null;
            case 4:
                AndroidCompositionLocals_androidKt.b("LocalSavedStateRegistryOwner");
                throw null;
            case 5:
                AndroidCompositionLocals_androidKt.b("LocalView");
                throw null;
            case 6:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    r9.f fVar = p119k9.O.f21697a;
                    choreographer = (Choreographer) p119k9.F.A(p9.m.f25335a, new C0464e0(2, null));
                }
                C0473h0 c0473h0 = new C0473h0(choreographer, p242x0.c.i(Looper.getMainLooper()));
                return p025b9.a.Q(c0473h0, c0473h0.f5229l);
            case 7:
            case 8:
                return null;
            case 9:
                AbstractC0507w0.b("LocalAutofillTree");
                throw null;
            case 10:
                AbstractC0507w0.b("LocalClipboardManager");
                throw null;
            case 11:
                AbstractC0507w0.b("LocalDensity");
                throw null;
            case 12:
                AbstractC0507w0.b("LocalFocusManager");
                throw null;
            case 13:
                AbstractC0507w0.b("LocalFontFamilyResolver");
                throw null;
            case 14:
                AbstractC0507w0.b("LocalFontLoader");
                throw null;
            case 15:
                AbstractC0507w0.b("LocalGraphicsContext");
                throw null;
            case 16:
                AbstractC0507w0.b("LocalHapticFeedback");
                throw null;
            case 17:
                AbstractC0507w0.b("LocalInputManager");
                throw null;
            case D7.p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                AbstractC0507w0.b("LocalLayoutDirection");
                throw null;
            case 19:
                return null;
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                return Boolean.FALSE;
            case 21:
            case 22:
                return null;
            case 23:
                AbstractC0507w0.b("LocalTextToolbar");
                throw null;
            case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                AbstractC0507w0.b("LocalUriHandler");
                throw null;
            case 25:
                AbstractC0507w0.b("LocalViewConfiguration");
                throw null;
            case 26:
                AbstractC0507w0.b("LocalWindowInfo");
                throw null;
            case 27:
                return Boolean.FALSE;
            default:
                return null;
        }
    }
}
