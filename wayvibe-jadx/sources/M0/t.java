package M0;

import D7.W;
import O0.C0678g;
import kotlin.jvm.internal.z;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ p075g9.j[] f8107a;

    static {
        kotlin.jvm.internal.p pVar = new kotlin.jvm.internal.p(t.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1);
        z.f21874a.getClass();
        f8107a = new p075g9.j[]{pVar, new kotlin.jvm.internal.p(t.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1), new kotlin.jvm.internal.p(t.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), new kotlin.jvm.internal.p(t.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new kotlin.jvm.internal.p(t.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new kotlin.jvm.internal.p(t.class, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new kotlin.jvm.internal.p(t.class, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new kotlin.jvm.internal.p(t.class, "contentType", "getContentType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;", 1), new kotlin.jvm.internal.p(t.class, "contentDataType", "getContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new kotlin.jvm.internal.p(t.class, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1), new kotlin.jvm.internal.p(t.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1), new kotlin.jvm.internal.p(t.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1), new kotlin.jvm.internal.p(t.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new kotlin.jvm.internal.p(t.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), new kotlin.jvm.internal.p(t.class, "textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), new kotlin.jvm.internal.p(t.class, "isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new kotlin.jvm.internal.p(t.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), new kotlin.jvm.internal.p(t.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1), new kotlin.jvm.internal.p(t.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new kotlin.jvm.internal.p(t.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new kotlin.jvm.internal.p(t.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1), new kotlin.jvm.internal.p(t.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1), new kotlin.jvm.internal.p(t.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1), new kotlin.jvm.internal.p(t.class, "isEditable", "isEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new kotlin.jvm.internal.p(t.class, "maxTextLength", "getMaxTextLength(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new kotlin.jvm.internal.p(t.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1)};
        u uVar = r.f8082a;
        u uVar2 = i.f8023a;
    }

    public static final u a(String str) {
        u uVar = new u(str);
        uVar.f8110c = true;
        return uVar;
    }

    public static final u b(String str, Z8.e eVar) {
        return new u(str, true, eVar);
    }

    public static void c(v vVar, Z8.c cVar) {
        ((j) vVar).c(i.f8023a, new a(null, cVar));
    }

    public static final void d(v vVar, String str) {
        u uVar = r.f8082a;
        ((j) vVar).c(r.f8082a, W.T(str));
    }

    public static final void e(v vVar, int i10) {
        u uVar = r.f8098s;
        p075g9.j jVar = f8107a[12];
        uVar.a(vVar, new g(i10));
    }

    public static final void f(v vVar, boolean z10) {
        u uVar = r.f8075A;
        p075g9.j jVar = f8107a[19];
        uVar.a(vVar, Boolean.valueOf(z10));
    }

    public static final void g(v vVar, C0678g c0678g) {
        u uVar = r.f8082a;
        ((j) vVar).c(r.f8100u, W.T(c0678g));
    }
}
