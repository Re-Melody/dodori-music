package com.amazon.c.a.a;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f16613a = "A valid instance of e is required to have at least one non-blank ID, either developerId or certificateId, and at least one non-blank name, either developerName or commonName.";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f16614b = "A valid instance of e is required to have a certificate ID.";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f16615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f16616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f16617e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f16618f;

    public static String a() {
        return f16613a;
    }

    public static String b() {
        return f16614b;
    }

    public boolean c() {
        return (StringUtils.isBlank(e()) || StringUtils.isBlank(f())) ? false : true;
    }

    public boolean d() {
        return !StringUtils.isBlank(e());
    }

    public String e() {
        return StringUtils.isBlank(this.f16617e) ? this.f16615c : this.f16617e;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return new EqualsBuilder().append(this.f16617e, eVar.f16617e).append(this.f16618f, eVar.f16618f).append(this.f16615c, eVar.f16615c).append(this.f16616d, eVar.f16616d).isEquals();
    }

    public String f() {
        return StringUtils.isBlank(this.f16618f) ? this.f16616d : this.f16618f;
    }

    public String g() {
        return this.f16615c;
    }

    public String h() {
        return this.f16616d;
    }

    public int hashCode() {
        return new HashCodeBuilder().append(this.f16617e).append(this.f16618f).append(this.f16615c).append(this.f16616d).toHashCode();
    }

    public String i() {
        return this.f16617e;
    }

    public String j() {
        return this.f16618f;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public e a(String str) {
        this.f16615c = str;
        return this;
    }

    public void b(String str) {
        this.f16615c = str;
    }

    public e c(String str) {
        this.f16616d = str;
        return this;
    }

    public void d(String str) {
        this.f16616d = str;
    }

    public e g(String str) {
        this.f16618f = str;
        return this;
    }

    public void h(String str) {
        this.f16618f = str;
    }

    public e e(String str) {
        this.f16617e = str;
        return this;
    }

    public void f(String str) {
        this.f16617e = str;
    }
}
