package org.apache.tika.metadata.filter;

import com.amazon.a.a.o.b.f;
import org.apache.tika.config.Field;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: loaded from: classes2.dex */
public class GeoPointMetadataFilter extends MetadataFilter {
    String geoPointFieldName = "location";

    @Override // org.apache.tika.metadata.filter.MetadataFilter
    public void filter(Metadata metadata) {
        String str = metadata.get(TikaCoreProperties.LATITUDE);
        if (StringUtils.isEmpty(str)) {
            return;
        }
        String str2 = metadata.get(TikaCoreProperties.LONGITUDE);
        if (StringUtils.isEmpty(str2)) {
            return;
        }
        metadata.set(this.geoPointFieldName, str + f.f16451a + str2);
    }

    public String getGeoPointFieldName() {
        return this.geoPointFieldName;
    }

    @Field
    public void setGeoPointFieldName(String str) {
        this.geoPointFieldName = str;
    }
}
