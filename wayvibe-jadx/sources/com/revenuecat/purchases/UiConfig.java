package com.revenuecat.purchases;

import B2.AbstractC0112b;
import M8.InterfaceC0641c;
import N8.t;
import com.revenuecat.purchases.paywalls.components.common.LocaleId;
import com.revenuecat.purchases.paywalls.components.common.LocalizedVariableLocalizationKeyMapSerializer;
import com.revenuecat.purchases.paywalls.components.common.VariableLocalizationKey;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.FontStyle;
import com.revenuecat.purchases.paywalls.components.properties.FontStyleDeserializer;
import java.lang.annotation.Annotation;
import java.util.Map;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import p240w9.g;
import p260y9.E;
import p260y9.G;
import p260y9.O;
import p260y9.Y;
import p260y9.c0;

/* JADX INFO: loaded from: classes.dex */
public final class UiConfig {

    /* JADX INFO: renamed from: app, reason: collision with root package name */
    private final AppConfig f18841app;
    private final Map<String, CustomVariableDefinition> customVariables;
    private final Map<LocaleId, Map<VariableLocalizationKey, String>> localizations;
    private final VariableConfig variableConfig;
    public static final Companion Companion = new Companion(null);
    private static final p219u9.a[] $childSerializers = {null, null, null, new G(c0.f29272a, CustomVariableDefinitionSerializer.INSTANCE)};

    public static final class AppConfig {
        private final Map<ColorAlias, ColorScheme> colors;
        private final Map<FontAlias, FontsConfig> fonts;
        public static final Companion Companion = new Companion(null);
        private static final p219u9.a[] $childSerializers = {new G(ColorAlias$$serializer.INSTANCE, ColorScheme$$serializer.INSTANCE), new G(FontAlias$$serializer.INSTANCE, UiConfig$AppConfig$FontsConfig$$serializer.INSTANCE)};

        public static final class Companion {
            public /* synthetic */ Companion(f fVar) {
                this();
            }

            public final p219u9.a serializer() {
                return UiConfig$AppConfig$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public static final class FontsConfig {

            /* JADX INFO: renamed from: android, reason: collision with root package name */
            private final FontInfo f18842android;
            public static final Companion Companion = new Companion(null);
            private static final p219u9.a[] $childSerializers = {new p219u9.d("com.revenuecat.purchases.UiConfig.AppConfig.FontsConfig.FontInfo", z.a(FontInfo.class), new p075g9.c[]{z.a(FontInfo.GoogleFonts.class), z.a(FontInfo.Name.class)}, new p219u9.a[]{UiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts$$serializer.INSTANCE, UiConfig$AppConfig$FontsConfig$FontInfo$Name$$serializer.INSTANCE}, new Annotation[0])};

            public static final class Companion {
                public /* synthetic */ Companion(f fVar) {
                    this();
                }

                public final p219u9.a serializer() {
                    return UiConfig$AppConfig$FontsConfig$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public interface FontInfo {
                public static final Companion Companion = Companion.$$INSTANCE;

                public static final class Companion {
                    static final /* synthetic */ Companion $$INSTANCE = new Companion();

                    private Companion() {
                    }

                    public final p219u9.a serializer() {
                        return new p219u9.d("com.revenuecat.purchases.UiConfig.AppConfig.FontsConfig.FontInfo", z.a(FontInfo.class), new p075g9.c[]{z.a(GoogleFonts.class), z.a(Name.class)}, new p219u9.a[]{UiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts$$serializer.INSTANCE, UiConfig$AppConfig$FontsConfig$FontInfo$Name$$serializer.INSTANCE}, new Annotation[0]);
                    }
                }

                public static final class GoogleFonts implements FontInfo {
                    public static final Companion Companion = new Companion(null);
                    private final String value;

                    public static final class Companion {
                        public /* synthetic */ Companion(f fVar) {
                            this();
                        }

                        public final p219u9.a serializer() {
                            return UiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts$$serializer.INSTANCE;
                        }

                        private Companion() {
                        }
                    }

                    @InterfaceC0641c
                    public /* synthetic */ GoogleFonts(int i10, String str, Y y6) {
                        if (1 == (i10 & 1)) {
                            this.value = str;
                        } else {
                            O.g(i10, 1, UiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts$$serializer.INSTANCE.getDescriptor());
                            throw null;
                        }
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof GoogleFonts) && m.b(this.value, ((GoogleFonts) obj).value);
                    }

                    public final /* synthetic */ String getValue() {
                        return this.value;
                    }

                    public int hashCode() {
                        return this.value.hashCode();
                    }

                    public String toString() {
                        return AbstractC0112b.j(new StringBuilder("GoogleFonts(value="), this.value, ')');
                    }

                    public GoogleFonts(String value) {
                        m.f(value, "value");
                        this.value = value;
                    }
                }

                public static final class Name implements FontInfo {
                    public static final Companion Companion = new Companion(null);
                    private final String family;
                    private final String hash;
                    private final FontStyle style;
                    private final String url;
                    private final String value;
                    private final Integer weight;

                    public static final class Companion {
                        public /* synthetic */ Companion(f fVar) {
                            this();
                        }

                        public final p219u9.a serializer() {
                            return UiConfig$AppConfig$FontsConfig$FontInfo$Name$$serializer.INSTANCE;
                        }

                        private Companion() {
                        }
                    }

                    @InterfaceC0641c
                    public /* synthetic */ Name(int i10, String str, String str2, String str3, String str4, Integer num, FontStyle fontStyle, Y y6) {
                        if (1 != (i10 & 1)) {
                            O.g(i10, 1, UiConfig$AppConfig$FontsConfig$FontInfo$Name$$serializer.INSTANCE.getDescriptor());
                            throw null;
                        }
                        this.value = str;
                        if ((i10 & 2) == 0) {
                            this.url = null;
                        } else {
                            this.url = str2;
                        }
                        if ((i10 & 4) == 0) {
                            this.hash = null;
                        } else {
                            this.hash = str3;
                        }
                        if ((i10 & 8) == 0) {
                            this.family = null;
                        } else {
                            this.family = str4;
                        }
                        if ((i10 & 16) == 0) {
                            this.weight = null;
                        } else {
                            this.weight = num;
                        }
                        if ((i10 & 32) == 0) {
                            this.style = null;
                        } else {
                            this.style = fontStyle;
                        }
                    }

                    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(Name name, p251x9.b bVar, g gVar) {
                        bVar.u(gVar, 0, name.value);
                        if (bVar.l(gVar) || name.url != null) {
                            bVar.t(gVar, 1, c0.f29272a, name.url);
                        }
                        if (bVar.l(gVar) || name.hash != null) {
                            bVar.t(gVar, 2, c0.f29272a, name.hash);
                        }
                        if (bVar.l(gVar) || name.family != null) {
                            bVar.t(gVar, 3, c0.f29272a, name.family);
                        }
                        if (bVar.l(gVar) || name.weight != null) {
                            bVar.t(gVar, 4, E.f29225a, name.weight);
                        }
                        if (!bVar.l(gVar) && name.style == null) {
                            return;
                        }
                        bVar.t(gVar, 5, FontStyleDeserializer.INSTANCE, name.style);
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Name)) {
                            return false;
                        }
                        Name name = (Name) obj;
                        return m.b(this.value, name.value) && m.b(this.url, name.url) && m.b(this.hash, name.hash) && m.b(this.family, name.family) && m.b(this.weight, name.weight) && this.style == name.style;
                    }

                    public final /* synthetic */ String getFamily() {
                        return this.family;
                    }

                    public final /* synthetic */ String getHash() {
                        return this.hash;
                    }

                    public final /* synthetic */ FontStyle getStyle() {
                        return this.style;
                    }

                    public final /* synthetic */ String getUrl() {
                        return this.url;
                    }

                    public final /* synthetic */ String getValue() {
                        return this.value;
                    }

                    public final /* synthetic */ Integer getWeight() {
                        return this.weight;
                    }

                    public int hashCode() {
                        int iHashCode = this.value.hashCode() * 31;
                        String str = this.url;
                        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                        String str2 = this.hash;
                        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                        String str3 = this.family;
                        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                        Integer num = this.weight;
                        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
                        FontStyle fontStyle = this.style;
                        return iHashCode5 + (fontStyle != null ? fontStyle.hashCode() : 0);
                    }

                    public String toString() {
                        return "Name(value=" + this.value + ", url=" + this.url + ", hash=" + this.hash + ", family=" + this.family + ", weight=" + this.weight + ", style=" + this.style + ')';
                    }

                    public Name(String value, String str, String str2, String str3, Integer num, FontStyle fontStyle) {
                        m.f(value, "value");
                        this.value = value;
                        this.url = str;
                        this.hash = str2;
                        this.family = str3;
                        this.weight = num;
                        this.style = fontStyle;
                    }

                    public /* synthetic */ Name(String str, String str2, String str3, String str4, Integer num, FontStyle fontStyle, int i10, f fVar) {
                        this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : num, (i10 & 32) != 0 ? null : fontStyle);
                    }
                }
            }

            @InterfaceC0641c
            public /* synthetic */ FontsConfig(int i10, FontInfo fontInfo, Y y6) {
                if (1 == (i10 & 1)) {
                    this.f18842android = fontInfo;
                } else {
                    O.g(i10, 1, UiConfig$AppConfig$FontsConfig$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FontsConfig) && m.b(this.f18842android, ((FontsConfig) obj).f18842android);
            }

            public final /* synthetic */ FontInfo getAndroid() {
                return this.f18842android;
            }

            public int hashCode() {
                return this.f18842android.hashCode();
            }

            public String toString() {
                return "FontsConfig(android=" + this.f18842android + ')';
            }

            public FontsConfig(FontInfo android2) {
                m.f(android2, "android");
                this.f18842android = android2;
            }
        }

        @InterfaceC0641c
        public /* synthetic */ AppConfig(int i10, Map map, Map map2, Y y6) {
            if (3 != (i10 & 3)) {
                O.g(i10, 3, UiConfig$AppConfig$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.colors = map;
            this.fonts = map2;
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsRelease(AppConfig appConfig, p251x9.b bVar, g gVar) {
            p219u9.a[] aVarArr = $childSerializers;
            bVar.m(gVar, 0, aVarArr[0], appConfig.colors);
            bVar.m(gVar, 1, aVarArr[1], appConfig.fonts);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppConfig)) {
                return false;
            }
            AppConfig appConfig = (AppConfig) obj;
            return m.b(this.colors, appConfig.colors) && m.b(this.fonts, appConfig.fonts);
        }

        public final /* synthetic */ Map getColors() {
            return this.colors;
        }

        public final /* synthetic */ Map getFonts() {
            return this.fonts;
        }

        public int hashCode() {
            return this.fonts.hashCode() + (this.colors.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("AppConfig(colors=");
            sb.append(this.colors);
            sb.append(", fonts=");
            return p134m1.b.n(sb, this.fonts, ')');
        }

        public AppConfig(Map<ColorAlias, ColorScheme> colors, Map<FontAlias, FontsConfig> fonts) {
            m.f(colors, "colors");
            m.f(fonts, "fonts");
            this.colors = colors;
            this.fonts = fonts;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final p219u9.a serializer() {
            return UiConfig$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static final class CustomVariableDefinition {
        public static final Companion Companion = new Companion(null);
        private final Object defaultValue;
        private final String type;

        public static final class Companion {
            public /* synthetic */ Companion(f fVar) {
                this();
            }

            public final p219u9.a serializer() {
                return CustomVariableDefinitionSerializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public CustomVariableDefinition(String type, Object defaultValue) {
            m.f(type, "type");
            m.f(defaultValue, "defaultValue");
            this.type = type;
            this.defaultValue = defaultValue;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CustomVariableDefinition)) {
                return false;
            }
            CustomVariableDefinition customVariableDefinition = (CustomVariableDefinition) obj;
            return m.b(this.type, customVariableDefinition.type) && m.b(this.defaultValue, customVariableDefinition.defaultValue);
        }

        public final /* synthetic */ Object getDefaultValue() {
            return this.defaultValue;
        }

        public final /* synthetic */ String getType() {
            return this.type;
        }

        public int hashCode() {
            return this.defaultValue.hashCode() + (this.type.hashCode() * 31);
        }

        public String toString() {
            return "CustomVariableDefinition(type=" + this.type + ", defaultValue=" + this.defaultValue + ')';
        }
    }

    public static final class VariableConfig {
        private static final p219u9.a[] $childSerializers;
        public static final Companion Companion = new Companion(null);
        private final Map<String, String> functionCompatibilityMap;
        private final Map<String, String> variableCompatibilityMap;

        public static final class Companion {
            public /* synthetic */ Companion(f fVar) {
                this();
            }

            public final p219u9.a serializer() {
                return UiConfig$VariableConfig$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        static {
            c0 c0Var = c0.f29272a;
            $childSerializers = new p219u9.a[]{new G(c0Var, c0Var), new G(c0Var, c0Var)};
        }

        @InterfaceC0641c
        public /* synthetic */ VariableConfig(int i10, Map map, Map map2, Y y6) {
            if (3 != (i10 & 3)) {
                O.g(i10, 3, UiConfig$VariableConfig$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.variableCompatibilityMap = map;
            this.functionCompatibilityMap = map2;
        }

        public static /* synthetic */ void getFunctionCompatibilityMap$annotations() {
        }

        public static /* synthetic */ void getVariableCompatibilityMap$annotations() {
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsRelease(VariableConfig variableConfig, p251x9.b bVar, g gVar) {
            p219u9.a[] aVarArr = $childSerializers;
            bVar.m(gVar, 0, aVarArr[0], variableConfig.variableCompatibilityMap);
            bVar.m(gVar, 1, aVarArr[1], variableConfig.functionCompatibilityMap);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VariableConfig)) {
                return false;
            }
            VariableConfig variableConfig = (VariableConfig) obj;
            return m.b(this.variableCompatibilityMap, variableConfig.variableCompatibilityMap) && m.b(this.functionCompatibilityMap, variableConfig.functionCompatibilityMap);
        }

        public final /* synthetic */ Map getFunctionCompatibilityMap() {
            return this.functionCompatibilityMap;
        }

        public final /* synthetic */ Map getVariableCompatibilityMap() {
            return this.variableCompatibilityMap;
        }

        public int hashCode() {
            return this.functionCompatibilityMap.hashCode() + (this.variableCompatibilityMap.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("VariableConfig(variableCompatibilityMap=");
            sb.append(this.variableCompatibilityMap);
            sb.append(", functionCompatibilityMap=");
            return p134m1.b.n(sb, this.functionCompatibilityMap, ')');
        }

        public VariableConfig(Map<String, String> variableCompatibilityMap, Map<String, String> functionCompatibilityMap) {
            m.f(variableCompatibilityMap, "variableCompatibilityMap");
            m.f(functionCompatibilityMap, "functionCompatibilityMap");
            this.variableCompatibilityMap = variableCompatibilityMap;
            this.functionCompatibilityMap = functionCompatibilityMap;
        }
    }

    @InterfaceC0641c
    public /* synthetic */ UiConfig(int i10, AppConfig appConfig, Map map, VariableConfig variableConfig, Map map2, Y y6) {
        if (7 != (i10 & 7)) {
            O.g(i10, 7, UiConfig$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f18841app = appConfig;
        this.localizations = map;
        this.variableConfig = variableConfig;
        if ((i10 & 8) == 0) {
            this.customVariables = t.f8651a;
        } else {
            this.customVariables = map2;
        }
    }

    public static /* synthetic */ void getCustomVariables$annotations() {
    }

    public static /* synthetic */ void getLocalizations$annotations() {
    }

    public static /* synthetic */ void getVariableConfig$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(UiConfig uiConfig, p251x9.b bVar, g gVar) {
        p219u9.a[] aVarArr = $childSerializers;
        bVar.m(gVar, 0, UiConfig$AppConfig$$serializer.INSTANCE, uiConfig.f18841app);
        bVar.m(gVar, 1, LocalizedVariableLocalizationKeyMapSerializer.INSTANCE, uiConfig.localizations);
        bVar.m(gVar, 2, UiConfig$VariableConfig$$serializer.INSTANCE, uiConfig.variableConfig);
        if (!bVar.l(gVar) && m.b(uiConfig.customVariables, t.f8651a)) {
            return;
        }
        bVar.m(gVar, 3, aVarArr[3], uiConfig.customVariables);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UiConfig)) {
            return false;
        }
        UiConfig uiConfig = (UiConfig) obj;
        return m.b(this.f18841app, uiConfig.f18841app) && m.b(this.localizations, uiConfig.localizations) && m.b(this.variableConfig, uiConfig.variableConfig) && m.b(this.customVariables, uiConfig.customVariables);
    }

    public final /* synthetic */ AppConfig getApp() {
        return this.f18841app;
    }

    public final /* synthetic */ Map getCustomVariables() {
        return this.customVariables;
    }

    public final /* synthetic */ Map getLocalizations() {
        return this.localizations;
    }

    public final /* synthetic */ VariableConfig getVariableConfig() {
        return this.variableConfig;
    }

    public int hashCode() {
        return this.customVariables.hashCode() + ((this.variableConfig.hashCode() + p134m1.b.e(this.f18841app.hashCode() * 31, 31, this.localizations)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UiConfig(app=");
        sb.append(this.f18841app);
        sb.append(", localizations=");
        sb.append(this.localizations);
        sb.append(", variableConfig=");
        sb.append(this.variableConfig);
        sb.append(", customVariables=");
        return p134m1.b.n(sb, this.customVariables, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UiConfig(AppConfig app2, Map<LocaleId, ? extends Map<VariableLocalizationKey, String>> localizations, VariableConfig variableConfig, Map<String, CustomVariableDefinition> customVariables) {
        m.f(app2, "app");
        m.f(localizations, "localizations");
        m.f(variableConfig, "variableConfig");
        m.f(customVariables, "customVariables");
        this.f18841app = app2;
        this.localizations = localizations;
        this.variableConfig = variableConfig;
        this.customVariables = customVariables;
    }

    public /* synthetic */ UiConfig(AppConfig appConfig, Map map, VariableConfig variableConfig, Map map2, int i10, f fVar) {
        this(appConfig, map, variableConfig, (i10 & 8) != 0 ? t.f8651a : map2);
    }
}
