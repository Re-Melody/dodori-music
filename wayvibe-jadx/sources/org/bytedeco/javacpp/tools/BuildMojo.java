package org.bytedeco.javacpp.tools;

import com.amazon.a.a.o.b;
import com.revenuecat.purchases.common.localrules.DeviceDimensionProvider;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import org.apache.maven.artifact.Artifact;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.descriptor.PluginDescriptor;
import org.apache.maven.plugin.logging.Log;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;
import org.bytedeco.javacpp.Loader;

/* JADX INFO: loaded from: classes2.dex */
@Mojo(defaultPhase = LifecyclePhase.PROCESS_CLASSES, name = "build", threadSafe = true)
public class BuildMojo extends AbstractMojo {

    @Parameter(defaultValue = "${plugin}", readonly = true, required = true)
    PluginDescriptor plugin;

    @Parameter(defaultValue = "${project}", readonly = true, required = true)
    MavenProject project;

    @Parameter(defaultValue = "${project.build.outputDirectory}", property = "javacpp.classPath")
    String classPath = null;

    @Parameter(property = "javacpp.classPaths")
    String[] classPaths = null;

    @Parameter(property = "javacpp.includePath")
    String includePath = null;

    @Parameter(property = "javacpp.includePaths")
    String[] includePaths = null;

    @Parameter(property = "javacpp.includeResource")
    String includeResource = null;

    @Parameter(property = "javacpp.includeResources")
    String[] includeResources = null;

    @Parameter(property = "javacpp.buildPath")
    String buildPath = null;

    @Parameter(property = "javacpp.buildPaths")
    String[] buildPaths = null;

    @Parameter(property = "javacpp.buildResource")
    String buildResource = null;

    @Parameter(property = "javacpp.buildResources")
    String[] buildResources = null;

    @Parameter(property = "javacpp.linkPath")
    String linkPath = null;

    @Parameter(property = "javacpp.linkPaths")
    String[] linkPaths = null;

    @Parameter(property = "javacpp.linkResource")
    String linkResource = null;

    @Parameter(property = "javacpp.linkResources")
    String[] linkResources = null;

    @Parameter(property = "javacpp.preloadPath")
    String preloadPath = null;

    @Parameter(property = "javacpp.preloadPaths")
    String[] preloadPaths = null;

    @Parameter(property = "javacpp.preloadResource")
    String preloadResource = null;

    @Parameter(property = "javacpp.preloadResources")
    String[] preloadResources = null;

    @Parameter(property = "javacpp.resourcePath")
    String resourcePath = null;

    @Parameter(property = "javacpp.resourcePaths")
    String[] resourcePaths = null;

    @Parameter(property = "javacpp.encoding")
    String encoding = null;

    @Parameter(property = "javacpp.outputDirectory")
    File outputDirectory = null;

    @Parameter(property = "javacpp.outputName")
    String outputName = null;

    @Parameter(defaultValue = b.af, property = "javacpp.generate")
    boolean generate = true;

    @Parameter(defaultValue = b.af, property = "javacpp.compile")
    boolean compile = true;

    @Parameter(defaultValue = b.af, property = "javacpp.deleteJniFiles")
    boolean deleteJniFiles = true;

    @Parameter(defaultValue = b.ag, property = "javacpp.header")
    boolean header = false;

    @Parameter(defaultValue = b.ag, property = "javacpp.copyLibs")
    boolean copyLibs = false;

    @Parameter(defaultValue = b.ag, property = "javacpp.copyResources")
    boolean copyResources = false;

    @Parameter(property = "javacpp.jarPrefix")
    String jarPrefix = null;

    @Parameter(property = "javacpp.properties")
    String properties = null;

    @Parameter(property = "javacpp.propertyFile")
    File propertyFile = null;

    @Parameter(property = "javacpp.propertyKeysAndValues")
    Properties propertyKeysAndValues = null;

    @Parameter(property = "javacpp.classOrPackageName")
    String classOrPackageName = null;

    @Parameter(property = "javacpp.classOrPackageNames")
    String[] classOrPackageNames = null;

    @Parameter(property = "javacpp.buildCommand")
    String[] buildCommand = null;

    @Parameter(property = "javacpp.targetDirectory")
    String targetDirectory = null;

    @Parameter(property = "javacpp.workingDirectory")
    File workingDirectory = null;

    @Parameter(property = "javacpp.environmentVariables")
    Map<String, String> environmentVariables = null;

    @Parameter(property = "javacpp.compilerOptions")
    String[] compilerOptions = null;

    @Parameter(defaultValue = b.ag, property = "javacpp.skip")
    boolean skip = false;

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.apache.maven.plugin.MojoExecutionException */
    public void execute() throws MojoExecutionException {
        StringBuilder sb;
        StringBuilder sb2;
        StringBuilder sb3;
        StringBuilder sb4;
        StringBuilder sb5;
        StringBuilder sb6;
        StringBuilder sb7;
        StringBuilder sb8;
        StringBuilder sb9;
        StringBuilder sb10;
        String str = "platform.preloadresource";
        String str2 = "platform.preloadpath";
        String str3 = "platform.linkresource";
        String str4 = "platform.linkpath";
        String str5 = "platform.includeresource";
        String str6 = "platform.includepath";
        String str7 = "platform.buildresource";
        String str8 = "platform.buildpath";
        final Log log = getLog();
        try {
            if (log.isDebugEnabled()) {
                log.debug("classPath: " + this.classPath);
                log.debug("classPaths: " + Arrays.deepToString(this.classPaths));
                log.debug("buildPath: " + this.buildPath);
                log.debug("buildPaths: " + Arrays.deepToString(this.buildPaths));
                log.debug("buildResource: " + this.buildResource);
                log.debug("buildResources: " + Arrays.deepToString(this.buildResources));
                log.debug("includePath: " + this.includePath);
                log.debug("includePaths: " + Arrays.deepToString(this.includePaths));
                log.debug("includeResource: " + this.includeResource);
                log.debug("includeResources: " + Arrays.deepToString(this.includeResources));
                log.debug("linkPath: " + this.linkPath);
                log.debug("linkPaths: " + Arrays.deepToString(this.linkPaths));
                log.debug("linkResource: " + this.linkResource);
                log.debug("linkResources: " + Arrays.deepToString(this.linkResources));
                log.debug("preloadPath: " + this.preloadPath);
                log.debug("preloadPaths: " + Arrays.deepToString(this.preloadPaths));
                log.debug("preloadResource: " + this.preloadResource);
                log.debug("preloadResources: " + Arrays.deepToString(this.preloadResources));
                log.debug("resourcePath: " + this.resourcePath);
                log.debug("resourcePaths: " + Arrays.deepToString(this.resourcePaths));
                log.debug("encoding: " + this.encoding);
                log.debug("outputDirectory: " + this.outputDirectory);
                log.debug("outputName: " + this.outputName);
                log.debug("generate: " + this.generate);
                log.debug("compile: " + this.compile);
                log.debug("deleteJniFiles: " + this.deleteJniFiles);
                log.debug("header: " + this.header);
                log.debug("copyLibs: " + this.copyLibs);
                log.debug("copyResources: " + this.copyResources);
                log.debug("jarPrefix: " + this.jarPrefix);
                log.debug("properties: " + this.properties);
                log.debug("propertyFile: " + this.propertyFile);
                log.debug("propertyKeysAndValues: " + this.propertyKeysAndValues);
                log.debug("classOrPackageName: " + this.classOrPackageName);
                log.debug("classOrPackageNames: " + Arrays.deepToString(this.classOrPackageNames));
                log.debug("buildCommand: " + Arrays.deepToString(this.buildCommand));
                log.debug("targetDirectory: " + Arrays.deepToString(this.buildCommand));
                log.debug("workingDirectory: " + this.workingDirectory);
                log.debug("environmentVariables: " + this.environmentVariables);
                log.debug("compilerOptions: " + Arrays.deepToString(this.compilerOptions));
                log.debug("skip: " + this.skip);
            }
            String str9 = this.targetDirectory;
            if (str9 != null) {
                this.project.addCompileSourceRoot(str9);
            }
            if (this.skip) {
                log.info("Skipping execution of JavaCPP Builder");
                return;
            }
            this.classPaths = merge(this.classPaths, this.classPath);
            this.classOrPackageNames = merge(this.classOrPackageNames, this.classOrPackageName);
            Builder builderCompilerOptions = new Builder(new Logger() { // from class: org.bytedeco.javacpp.tools.BuildMojo.1
                @Override // org.bytedeco.javacpp.tools.Logger
                public void debug(String str10) {
                    log.debug(str10);
                }

                @Override // org.bytedeco.javacpp.tools.Logger
                public void error(String str10) {
                    log.error(str10);
                }

                @Override // org.bytedeco.javacpp.tools.Logger
                public void info(String str10) {
                    log.info(str10);
                }

                @Override // org.bytedeco.javacpp.tools.Logger
                public void warn(String str10) {
                    log.warn(str10);
                }
            }).classPaths(this.classPaths).encoding(this.encoding).outputDirectory(this.outputDirectory).outputName(this.outputName).generate(this.generate).compile(this.compile).deleteJniFiles(this.deleteJniFiles).header(this.header).copyLibs(this.copyLibs).copyResources(this.copyResources).jarPrefix(this.jarPrefix).properties(this.properties).propertyFile(this.propertyFile).properties(this.propertyKeysAndValues).classesOrPackages(this.classOrPackageNames).buildCommand(this.buildCommand).workingDirectory(this.workingDirectory).environmentVariables(this.environmentVariables).compilerOptions(this.compilerOptions);
            Properties properties = builderCompilerOptions.properties;
            String property = properties.getProperty("platform.extension");
            log.info("Detected platform \"" + Loader.getPlatform() + "\"");
            StringBuilder sb11 = new StringBuilder("Building for platform \"");
            sb11.append(properties.get(DeviceDimensionProvider.KEY_PLATFORM));
            sb11.append("\"");
            sb11.append((property == null || property.length() <= 0) ? "" : " with extension \"" + property + "\"");
            log.info(sb11.toString());
            String property2 = properties.getProperty("platform.path.separator");
            String[] strArrMerge = merge(this.buildPaths, this.buildPath);
            int length = strArrMerge.length;
            int i10 = 0;
            while (i10 < length) {
                String str10 = strArrMerge[i10];
                String str11 = str8;
                String property3 = properties.getProperty(str11, "");
                if (property3.length() == 0 || property3.endsWith(property2)) {
                    sb10 = new StringBuilder();
                    sb10.append(property3);
                    sb10.append(str10);
                } else {
                    sb10 = new StringBuilder();
                    sb10.append(property3);
                    sb10.append(property2);
                    sb10.append(str10);
                }
                properties.setProperty(str11, sb10.toString());
                i10++;
                str8 = str11;
            }
            String[] strArrMerge2 = merge(this.buildResources, this.buildResource);
            int length2 = strArrMerge2.length;
            int i11 = 0;
            while (i11 < length2) {
                String str12 = strArrMerge2[i11];
                String str13 = str7;
                String property4 = properties.getProperty(str13, "");
                if (property4.length() == 0 || property4.endsWith(property2)) {
                    sb9 = new StringBuilder();
                    sb9.append(property4);
                    sb9.append(str12);
                } else {
                    sb9 = new StringBuilder();
                    sb9.append(property4);
                    sb9.append(property2);
                    sb9.append(str12);
                }
                properties.setProperty(str13, sb9.toString());
                i11++;
                str7 = str13;
            }
            String[] strArrMerge3 = merge(this.includePaths, this.includePath);
            int length3 = strArrMerge3.length;
            int i12 = 0;
            while (i12 < length3) {
                String str14 = strArrMerge3[i12];
                String str15 = str6;
                String property5 = properties.getProperty(str15, "");
                if (property5.length() == 0 || property5.endsWith(property2)) {
                    sb8 = new StringBuilder();
                    sb8.append(property5);
                    sb8.append(str14);
                } else {
                    sb8 = new StringBuilder();
                    sb8.append(property5);
                    sb8.append(property2);
                    sb8.append(str14);
                }
                properties.setProperty(str15, sb8.toString());
                i12++;
                str6 = str15;
            }
            String[] strArrMerge4 = merge(this.includeResources, this.includeResource);
            int length4 = strArrMerge4.length;
            int i13 = 0;
            while (i13 < length4) {
                String str16 = strArrMerge4[i13];
                String str17 = str5;
                String property6 = properties.getProperty(str17, "");
                if (property6.length() == 0 || property6.endsWith(property2)) {
                    sb7 = new StringBuilder();
                    sb7.append(property6);
                    sb7.append(str16);
                } else {
                    sb7 = new StringBuilder();
                    sb7.append(property6);
                    sb7.append(property2);
                    sb7.append(str16);
                }
                properties.setProperty(str17, sb7.toString());
                i13++;
                str5 = str17;
            }
            String[] strArrMerge5 = merge(this.linkPaths, this.linkPath);
            int length5 = strArrMerge5.length;
            int i14 = 0;
            while (i14 < length5) {
                String str18 = strArrMerge5[i14];
                String str19 = str4;
                String property7 = properties.getProperty(str19, "");
                if (property7.length() == 0 || property7.endsWith(property2)) {
                    sb6 = new StringBuilder();
                    sb6.append(property7);
                    sb6.append(str18);
                } else {
                    sb6 = new StringBuilder();
                    sb6.append(property7);
                    sb6.append(property2);
                    sb6.append(str18);
                }
                properties.setProperty(str19, sb6.toString());
                i14++;
                str4 = str19;
            }
            String[] strArrMerge6 = merge(this.linkResources, this.linkResource);
            int length6 = strArrMerge6.length;
            int i15 = 0;
            while (i15 < length6) {
                String str20 = strArrMerge6[i15];
                String str21 = str3;
                String property8 = properties.getProperty(str21, "");
                if (property8.length() == 0 || property8.endsWith(property2)) {
                    sb5 = new StringBuilder();
                    sb5.append(property8);
                    sb5.append(str20);
                } else {
                    sb5 = new StringBuilder();
                    sb5.append(property8);
                    sb5.append(property2);
                    sb5.append(str20);
                }
                properties.setProperty(str21, sb5.toString());
                i15++;
                str3 = str21;
            }
            String[] strArrMerge7 = merge(this.preloadPaths, this.preloadPath);
            int length7 = strArrMerge7.length;
            int i16 = 0;
            while (i16 < length7) {
                String str22 = strArrMerge7[i16];
                String str23 = str2;
                String property9 = properties.getProperty(str23, "");
                if (property9.length() == 0 || property9.endsWith(property2)) {
                    sb4 = new StringBuilder();
                    sb4.append(property9);
                    sb4.append(str22);
                } else {
                    sb4 = new StringBuilder();
                    sb4.append(property9);
                    sb4.append(property2);
                    sb4.append(str22);
                }
                properties.setProperty(str23, sb4.toString());
                i16++;
                str2 = str23;
            }
            String[] strArrMerge8 = merge(this.preloadResources, this.preloadResource);
            int length8 = strArrMerge8.length;
            int i17 = 0;
            while (i17 < length8) {
                String str24 = strArrMerge8[i17];
                String str25 = str;
                String property10 = properties.getProperty(str25, "");
                if (property10.length() == 0 || property10.endsWith(property2)) {
                    sb3 = new StringBuilder();
                    sb3.append(property10);
                    sb3.append(str24);
                } else {
                    sb3 = new StringBuilder();
                    sb3.append(property10);
                    sb3.append(property2);
                    sb3.append(str24);
                }
                properties.setProperty(str25, sb3.toString());
                i17++;
                str = str25;
            }
            for (String str26 : merge(this.resourcePaths, this.resourcePath)) {
                String property11 = properties.getProperty("platform.resourcepath", "");
                if (property11.length() == 0 || property11.endsWith(property2)) {
                    sb2 = new StringBuilder();
                    sb2.append(property11);
                    sb2.append(str26);
                } else {
                    sb2 = new StringBuilder();
                    sb2.append(property11);
                    sb2.append(property2);
                    sb2.append(str26);
                }
                properties.setProperty("platform.resourcepath", sb2.toString());
            }
            properties.setProperty("platform.artifacts", this.project.getBuild().getOutputDirectory());
            Iterator it = this.plugin.getArtifacts().iterator();
            while (it.hasNext()) {
                String canonicalPath = ((Artifact) it.next()).getFile().getCanonicalPath();
                String property12 = properties.getProperty("platform.artifacts", "");
                if (property12.length() == 0 || property12.endsWith(property2)) {
                    sb = new StringBuilder();
                    sb.append(property12);
                    sb.append(canonicalPath);
                } else {
                    sb = new StringBuilder();
                    sb.append(property12);
                    sb.append(property2);
                    sb.append(canonicalPath);
                }
                properties.setProperty("platform.artifacts", sb.toString());
            }
            Properties properties2 = this.project.getProperties();
            for (String str27 : properties.stringPropertyNames()) {
                properties2.setProperty("javacpp." + str27, properties.getProperty(str27));
            }
            File[] fileArrBuild = builderCompilerOptions.build();
            if (log.isDebugEnabled()) {
                log.debug("outputFiles: " + Arrays.deepToString(fileArrBuild));
            }
        } catch (IOException e2) {
            e = e2;
            log.error("Failed to execute JavaCPP Builder: " + e.getMessage());
            throw new MojoExecutionException("Failed to execute JavaCPP Builder", e);
        } catch (ClassNotFoundException e4) {
            e = e4;
            log.error("Failed to execute JavaCPP Builder: " + e.getMessage());
            throw new MojoExecutionException("Failed to execute JavaCPP Builder", e);
        } catch (InterruptedException e7) {
            e = e7;
            log.error("Failed to execute JavaCPP Builder: " + e.getMessage());
            throw new MojoExecutionException("Failed to execute JavaCPP Builder", e);
        } catch (NoClassDefFoundError e10) {
            e = e10;
            log.error("Failed to execute JavaCPP Builder: " + e.getMessage());
            throw new MojoExecutionException("Failed to execute JavaCPP Builder", e);
        } catch (ParserException e11) {
            e = e11;
            log.error("Failed to execute JavaCPP Builder: " + e.getMessage());
            throw new MojoExecutionException("Failed to execute JavaCPP Builder", e);
        }
    }

    public String[] merge(String[] strArr, String str) {
        if (strArr != null && str != null) {
            strArr = (String[]) Arrays.copyOf(strArr, strArr.length + 1);
            strArr[strArr.length - 1] = str;
        } else if (str != null) {
            strArr = new String[]{str};
        }
        return strArr != null ? strArr : new String[0];
    }
}
