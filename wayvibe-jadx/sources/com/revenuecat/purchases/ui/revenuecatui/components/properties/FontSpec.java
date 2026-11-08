package com.revenuecat.purchases.ui.revenuecatui.components.properties;

import B2.AbstractC0112b;
import T0.AbstractC0818v;
import com.revenuecat.purchases.paywalls.DownloadedFontFamily;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public interface FontSpec {

    public static final class Asset implements FontSpec {
        public static final int $stable = 0;
        private final AbstractC0818v fontFamily;

        public Asset(AbstractC0818v fontFamily) {
            m.f(fontFamily, "fontFamily");
            this.fontFamily = fontFamily;
        }

        public static /* synthetic */ Asset copy$default(Asset asset, AbstractC0818v abstractC0818v, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                abstractC0818v = asset.fontFamily;
            }
            return asset.copy(abstractC0818v);
        }

        public final AbstractC0818v component1() {
            return this.fontFamily;
        }

        public final Asset copy(AbstractC0818v fontFamily) {
            m.f(fontFamily, "fontFamily");
            return new Asset(fontFamily);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Asset) && m.b(this.fontFamily, ((Asset) obj).fontFamily);
        }

        public final /* synthetic */ AbstractC0818v getFontFamily() {
            return this.fontFamily;
        }

        public int hashCode() {
            return this.fontFamily.hashCode();
        }

        public String toString() {
            return "Asset(fontFamily=" + this.fontFamily + ')';
        }
    }

    public static final class Downloaded implements FontSpec {
        public static final int $stable = 8;
        private final DownloadedFontFamily downloadedFontFamily;

        public Downloaded(DownloadedFontFamily downloadedFontFamily) {
            m.f(downloadedFontFamily, "downloadedFontFamily");
            this.downloadedFontFamily = downloadedFontFamily;
        }

        public static /* synthetic */ Downloaded copy$default(Downloaded downloaded, DownloadedFontFamily downloadedFontFamily, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                downloadedFontFamily = downloaded.downloadedFontFamily;
            }
            return downloaded.copy(downloadedFontFamily);
        }

        public final DownloadedFontFamily component1() {
            return this.downloadedFontFamily;
        }

        public final Downloaded copy(DownloadedFontFamily downloadedFontFamily) {
            m.f(downloadedFontFamily, "downloadedFontFamily");
            return new Downloaded(downloadedFontFamily);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Downloaded) && m.b(this.downloadedFontFamily, ((Downloaded) obj).downloadedFontFamily);
        }

        public final /* synthetic */ DownloadedFontFamily getDownloadedFontFamily() {
            return this.downloadedFontFamily;
        }

        public int hashCode() {
            return this.downloadedFontFamily.hashCode();
        }

        public String toString() {
            return "Downloaded(downloadedFontFamily=" + this.downloadedFontFamily + ')';
        }
    }

    public interface Generic extends FontSpec {

        public static final class Monospace implements Generic {
            public static final int $stable = 0;
            public static final Monospace INSTANCE = new Monospace();

            private Monospace() {
            }
        }

        public static final class SansSerif implements Generic {
            public static final int $stable = 0;
            public static final SansSerif INSTANCE = new SansSerif();

            private SansSerif() {
            }
        }

        public static final class Serif implements Generic {
            public static final int $stable = 0;
            public static final Serif INSTANCE = new Serif();

            private Serif() {
            }
        }
    }

    public static final class Google implements FontSpec {
        public static final int $stable = 0;
        private final String name;

        public Google(String name) {
            m.f(name, "name");
            this.name = name;
        }

        public static /* synthetic */ Google copy$default(Google google, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = google.name;
            }
            return google.copy(str);
        }

        public final String component1() {
            return this.name;
        }

        public final Google copy(String name) {
            m.f(name, "name");
            return new Google(name);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Google) && m.b(this.name, ((Google) obj).name);
        }

        public final /* synthetic */ String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        public String toString() {
            return AbstractC0112b.j(new StringBuilder("Google(name="), this.name, ')');
        }
    }

    public static final class Resource implements FontSpec {
        public static final int $stable = 0;
        private final AbstractC0818v fontFamily;

        public Resource(AbstractC0818v fontFamily) {
            m.f(fontFamily, "fontFamily");
            this.fontFamily = fontFamily;
        }

        public static /* synthetic */ Resource copy$default(Resource resource, AbstractC0818v abstractC0818v, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                abstractC0818v = resource.fontFamily;
            }
            return resource.copy(abstractC0818v);
        }

        public final AbstractC0818v component1() {
            return this.fontFamily;
        }

        public final Resource copy(AbstractC0818v fontFamily) {
            m.f(fontFamily, "fontFamily");
            return new Resource(fontFamily);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Resource) && m.b(this.fontFamily, ((Resource) obj).fontFamily);
        }

        public final /* synthetic */ AbstractC0818v getFontFamily() {
            return this.fontFamily;
        }

        public int hashCode() {
            return this.fontFamily.hashCode();
        }

        public String toString() {
            return "Resource(fontFamily=" + this.fontFamily + ')';
        }
    }

    public static final class System implements FontSpec {
        public static final int $stable = 0;
        private final String name;

        public System(String name) {
            m.f(name, "name");
            this.name = name;
        }

        public static /* synthetic */ System copy$default(System system, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = system.name;
            }
            return system.copy(str);
        }

        public final String component1() {
            return this.name;
        }

        public final System copy(String name) {
            m.f(name, "name");
            return new System(name);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof System) && m.b(this.name, ((System) obj).name);
        }

        public final /* synthetic */ String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        public String toString() {
            return AbstractC0112b.j(new StringBuilder("System(name="), this.name, ')');
        }
    }
}
