package org.maplibre.android.style.types;

import V0.p;
import androidx.annotation.Keep;
import java.util.Arrays;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class Formatted {
    private final FormattedSection[] formattedSections;

    public Formatted(FormattedSection... formattedSections) {
        m.f(formattedSections, "formattedSections");
        this.formattedSections = formattedSections;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Formatted.class.equals(obj.getClass())) {
            return false;
        }
        return Arrays.equals(this.formattedSections, ((Formatted) obj).formattedSections);
    }

    public final FormattedSection[] getFormattedSections() {
        return this.formattedSections;
    }

    public int hashCode() {
        return Arrays.hashCode(this.formattedSections);
    }

    public final Object[] toArray() {
        FormattedSection[] formattedSectionArr = this.formattedSections;
        Object[] objArr = new Object[formattedSectionArr.length];
        int length = formattedSectionArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            objArr[i10] = this.formattedSections[i10].toArray();
        }
        return objArr;
    }

    public String toString() {
        return p.o("Formatted{formattedSections=", Arrays.toString(this.formattedSections), "}");
    }
}
