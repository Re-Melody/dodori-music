package za;

import E7.l;
import E7.o;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.util.ArrayList;
import java.util.HashMap;
import org.maplibre.geojson.Geometry;
import org.maplibre.geojson.Polygon;
import org.maplibre.geojson.gson.GeometryGeoJson;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f29957a = new l();

    public static g a(JsonArray jsonArray) {
        if (jsonArray.size() == 0) {
            throw new IllegalArgumentException("Can't convert empty jsonArray expressions");
        }
        String asString = jsonArray.get(0).getAsString();
        ArrayList arrayList = new ArrayList();
        if (asString.equals("within")) {
            Polygon polygonFromJson = Polygon.fromJson(jsonArray.get(1).toString());
            HashMap map = new HashMap();
            map.put("type", new b(polygonFromJson.type()));
            map.put("json", new b(polygonFromJson.toJson()));
            return new g("within", new d(map));
        }
        if (asString.equals("distance")) {
            Geometry geometryFromJson = GeometryGeoJson.fromJson(jsonArray.get(1).toString());
            HashMap map2 = new HashMap();
            map2.put("json", new b(geometryFromJson.toJson()));
            return new g("distance", new d(map2));
        }
        for (int i10 = 1; i10 < jsonArray.size(); i10++) {
            JsonElement jsonElement = jsonArray.get(i10);
            if (asString.equals("literal") && (jsonElement instanceof JsonArray)) {
                JsonArray jsonArray2 = (JsonArray) jsonElement;
                Object[] objArr = new Object[jsonArray2.size()];
                for (int i11 = 0; i11 < jsonArray2.size(); i11++) {
                    JsonElement jsonElement2 = jsonArray2.get(i11);
                    if (!(jsonElement2 instanceof JsonPrimitive)) {
                        throw new IllegalArgumentException("Nested literal arrays are not supported.");
                    }
                    objArr[i11] = c((JsonPrimitive) jsonElement2);
                }
                arrayList.add(new c(objArr));
            } else {
                arrayList.add(b(jsonElement));
            }
        }
        return new g(asString, (g[]) arrayList.toArray(new g[arrayList.size()]));
    }

    public static g b(JsonElement jsonElement) {
        if (jsonElement instanceof JsonArray) {
            return a((JsonArray) jsonElement);
        }
        if (jsonElement instanceof JsonPrimitive) {
            return new b(c((JsonPrimitive) jsonElement));
        }
        if (jsonElement instanceof o) {
            return new b("");
        }
        if (!(jsonElement instanceof JsonObject)) {
            throw new RuntimeException("Unsupported expression conversion for " + jsonElement.getClass());
        }
        HashMap map = new HashMap();
        JsonObject jsonObject = (JsonObject) jsonElement;
        for (String str : jsonObject.keySet()) {
            map.put(str, b(jsonObject.get(str)));
        }
        return new d(map);
    }

    public static Object c(JsonPrimitive jsonPrimitive) {
        if (jsonPrimitive.isBoolean()) {
            return Boolean.valueOf(jsonPrimitive.getAsBoolean());
        }
        if (jsonPrimitive.isNumber()) {
            return Float.valueOf(jsonPrimitive.getAsFloat());
        }
        if (jsonPrimitive.isString()) {
            return jsonPrimitive.getAsString();
        }
        throw new RuntimeException("Unsupported literal expression conversion for " + JsonPrimitive.class);
    }
}
