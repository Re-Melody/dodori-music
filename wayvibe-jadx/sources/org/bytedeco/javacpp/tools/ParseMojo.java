package org.bytedeco.javacpp.tools;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

/* JADX INFO: loaded from: classes2.dex */
@Mojo(defaultPhase = LifecyclePhase.GENERATE_SOURCES, name = "parse")
public class ParseMojo extends BuildMojo {
    /* JADX INFO: Thrown type has an unknown type hierarchy: org.apache.maven.plugin.MojoExecutionException */
    @Override // org.bytedeco.javacpp.tools.BuildMojo
    public void execute() throws MojoExecutionException {
        this.generate = false;
        super.execute();
    }
}
