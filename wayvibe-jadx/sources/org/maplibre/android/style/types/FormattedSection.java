package org.maplibre.android.style.types;

import androidx.annotation.Keep;
import java.util.Arrays;
import java.util.HashMap;
import org.slf4j.helpers.i;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class FormattedSection {
    private Number fontScale;
    private String[] fontStack;
    private String text;
    private String textColor;

    public FormattedSection(String str) {
        this(str, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            FormattedSection formattedSection = (FormattedSection) obj;
            String str = this.text;
            if (str == null ? formattedSection.text != null : !str.equals(formattedSection.text)) {
                return false;
            }
            Number number = this.fontScale;
            if (number == null ? formattedSection.fontScale != null : !number.equals(formattedSection.fontScale)) {
                return false;
            }
            if (!Arrays.equals(this.fontStack, formattedSection.fontStack)) {
                return false;
            }
            String str2 = this.textColor;
            String str3 = formattedSection.textColor;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
        }
        return false;
    }

    public Number getFontScale() {
        return this.fontScale;
    }

    public String[] getFontStack() {
        return this.fontStack;
    }

    public String getText() {
        return this.text;
    }

    public String getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        String str = this.text;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Number number = this.fontScale;
        int iHashCode2 = (((iHashCode + (number != null ? number.hashCode() : 0)) * 31) + Arrays.hashCode(this.fontStack)) * 31;
        String str2 = this.textColor;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public void setFontScale(Number number) {
        this.fontScale = number;
    }

    public void setFontStack(String[] strArr) {
        this.fontStack = strArr;
    }

    public void setTextColor(String str) {
        this.textColor = str;
    }

    public Object[] toArray() {
        HashMap map = new HashMap();
        map.put("font-scale", this.fontScale);
        map.put("text-font", this.fontStack);
        map.put("text-color", this.textColor);
        return new Object[]{this.text, map};
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FormattedSection{text='");
        sb.append(this.text);
        sb.append("', fontScale=");
        sb.append(this.fontScale);
        sb.append(", fontStack=");
        sb.append(Arrays.toString(this.fontStack));
        sb.append(", textColor='");
        return b.m(sb, this.textColor, "'}");
    }

    public FormattedSection(String str, Number number, String[] strArr, String str2) {
        this.text = str;
        this.fontScale = number;
        this.fontStack = strArr;
        this.textColor = str2;
    }

    public void setTextColor(int i10) {
        this.textColor = i.o(i10);
    }

    public void setTextColor(Object obj) {
        setTextColor((String) obj);
    }

    @Deprecated
    public FormattedSection(String str, Number number, String[] strArr) {
        this(str, number, strArr, null);
    }

    @Deprecated
    public FormattedSection(String str, Number number) {
        this(str, number, null, null);
    }

    @Deprecated
    public FormattedSection(String str, String[] strArr) {
        this(str, null, strArr, null);
    }
}
