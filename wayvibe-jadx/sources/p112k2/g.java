package p112k2;

import S9.b;
import V0.p;
import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final String[] f21588E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int[] f21589F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final byte[] f21590G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final d f21591H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final d[][] f21592I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final d[] f21593J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final HashMap[] f21594K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final HashMap[] f21595L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final Set f21596M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final HashMap f21597N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final Charset f21598O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final byte[] f21599P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final byte[] f21600Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileDescriptor f21614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AssetManager.AssetInputStream f21615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap[] f21617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f21618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ByteOrder f21619f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f21620g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f21621h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f21622i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f21623j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f21624l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final boolean f21601m = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final List f21602n = Arrays.asList(1, 6, 3, 8);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final List f21603o = Arrays.asList(2, 7, 4, 5);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[] f21604p = {8, 8, 8};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int[] f21605q = {8};
    public static final byte[] r = {-1, -40, -1};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final byte[] f21606s = {102, 116, 121, 112};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final byte[] f21607t = {109, 105, 102, 49};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final byte[] f21608u = {104, 101, 105, 99};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final byte[] f21609v = {97, 118, 105, 102};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final byte[] f21610w = {97, 118, 105, 115};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final byte[] f21611x = {79, 76, 89, 77, 80, 0};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final byte[] f21612y = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final byte[] f21613z = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final byte[] f21584A = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final byte[] f21585B = {82, 73, 70, 70};

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final byte[] f21586C = {87, 69, 66, 80};

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final byte[] f21587D = {69, 88, 73, 70};

    static {
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f21588E = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f21589F = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f21590G = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", ColorExtractionConstants.COLOR_COMPONENT_MASK, 4), new d(256, 3, 4, "ImageWidth"), new d(257, 3, 4, "ImageLength"), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d(273, 3, 4, "StripOffsets"), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d(278, 3, 4, "RowsPerStrip"), new d(279, 3, 4, "StripByteCounts"), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", ColorExtractionConstants.MAXIMUM_BRIGHTNESS_THRESHOLD, 1)};
        d[] dVarArr2 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d(40962, 3, 4, "PixelXDimension"), new d(40963, 3, 4, "PixelYDimension"), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d(50720, 3, 4, "DefaultCropSize")};
        d[] dVarArr3 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d(2, 5, 10, "GPSLatitude"), new d("GPSLongitudeRef", 3, 2), new d(4, 5, 10, "GPSLongitude"), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        d[] dVarArr4 = {new d("InteroperabilityIndex", 1, 2)};
        d[] dVarArr5 = {new d("NewSubfileType", 254, 4), new d("SubfileType", ColorExtractionConstants.COLOR_COMPONENT_MASK, 4), new d(256, 3, 4, "ThumbnailImageWidth"), new d(257, 3, 4, "ThumbnailImageLength"), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d(273, 3, 4, "StripOffsets"), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d(278, 3, 4, "RowsPerStrip"), new d(279, 3, 4, "StripByteCounts"), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d(50720, 3, 4, "DefaultCropSize")};
        f21591H = new d("StripOffsets", 273, 3);
        f21592I = new d[][]{dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, new d[]{new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)}, new d[]{new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)}, new d[]{new d("AspectFrame", 4371, 3)}, new d[]{new d("ColorSpace", 55, 3)}};
        f21593J = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        f21594K = new HashMap[10];
        f21595L = new HashMap[10];
        f21596M = Collections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        f21597N = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f21598O = charsetForName;
        f21599P = "Exif\u0000\u0000".getBytes(charsetForName);
        f21600Q = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            d[][] dVarArr6 = f21592I;
            if (i10 >= dVarArr6.length) {
                HashMap map = f21597N;
                d[] dVarArr7 = f21593J;
                map.put(Integer.valueOf(dVarArr7[0].f21578a), 5);
                map.put(Integer.valueOf(dVarArr7[1].f21578a), 1);
                map.put(Integer.valueOf(dVarArr7[2].f21578a), 2);
                map.put(Integer.valueOf(dVarArr7[3].f21578a), 3);
                map.put(Integer.valueOf(dVarArr7[4].f21578a), 7);
                map.put(Integer.valueOf(dVarArr7[5].f21578a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f21594K[i10] = new HashMap();
            f21595L[i10] = new HashMap();
            for (d dVar : dVarArr6[i10]) {
                f21594K[i10].put(Integer.valueOf(dVar.f21578a), dVar);
                f21595L[i10].put(dVar.f21579b, dVar);
            }
            i10++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00dd A[Catch: all -> 0x005e, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x005e, blocks: (B:14:0x004f, B:16:0x0052, B:23:0x0067, B:29:0x0084, B:36:0x0097, B:42:0x00aa, B:39:0x009f, B:40:0x00a3, B:41:0x00a7, B:43:0x00b4, B:45:0x00bd, B:47:0x00c3, B:49:0x00c9, B:51:0x00cf, B:56:0x00dd), top: B:68:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    public g(InputStream inputStream) throws IOException {
        d[][] dVarArr = f21592I;
        this.f21617d = new HashMap[dVarArr.length];
        this.f21618e = new HashSet(dVarArr.length);
        this.f21619f = ByteOrder.BIG_ENDIAN;
        boolean z10 = inputStream instanceof AssetManager.AssetInputStream;
        boolean z11 = f21601m;
        if (z10) {
            this.f21615b = (AssetManager.AssetInputStream) inputStream;
            this.f21614a = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                Os.lseek(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.f21615b = null;
                this.f21614a = fileInputStream.getFD();
            } catch (Exception unused) {
                if (z11) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
                this.f21615b = null;
                this.f21614a = null;
            }
        } else {
            this.f21615b = null;
            this.f21614a = null;
        }
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            try {
                try {
                    this.f21617d[i10] = new HashMap();
                } catch (IOException e2) {
                    e = e2;
                    if (z11) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                    }
                    a();
                    if (!z11) {
                        return;
                    }
                } catch (UnsupportedOperationException e4) {
                    e = e4;
                    if (z11) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                    }
                    a();
                    if (!z11) {
                        return;
                    }
                }
            } catch (Throwable th) {
                a();
                if (z11) {
                    q();
                }
                throw th;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        int iG = g(bufferedInputStream);
        this.f21616c = iG;
        if (iG == 4 || iG == 9 || iG == 13 || iG == 14) {
            b bVar = new b(bufferedInputStream);
            int i11 = this.f21616c;
            if (i11 == 4) {
                f(bVar, 0, 0);
            } else if (i11 == 13) {
                i(bVar);
            } else if (i11 == 9) {
                j(bVar);
            } else if (i11 == 14) {
                m(bVar);
            }
        } else {
            f fVar = new f(bufferedInputStream);
            int i12 = this.f21616c;
            if (i12 == 12 || i12 == 15) {
                e(fVar, i12);
            } else if (i12 == 7) {
                h(fVar);
            } else if (i12 == 10) {
                l(fVar);
            } else {
                k(fVar);
            }
            fVar.c(this.f21621h);
            v(fVar);
        }
        a();
        if (!z11) {
            return;
        }
        q();
    }

    public static ByteOrder r(b bVar) throws IOException {
        short s8 = bVar.readShort();
        boolean z10 = f21601m;
        if (s8 == 18761) {
            if (z10) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s8 == 19789) {
            if (z10) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s8));
    }

    public final void a() {
        String strB = b("DateTimeOriginal");
        HashMap[] mapArr = this.f21617d;
        if (strB != null && b("DateTime") == null) {
            HashMap map = mapArr[0];
            byte[] bytes = strB.concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(f21598O);
            map.put("DateTime", new c(bytes, 2, bytes.length));
        }
        if (b("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", c.a(0L, this.f21619f));
        }
        if (b("ImageLength") == null) {
            mapArr[0].put("ImageLength", c.a(0L, this.f21619f));
        }
        if (b("Orientation") == null) {
            mapArr[0].put("Orientation", c.a(0L, this.f21619f));
        }
        if (b("LightSource") == null) {
            mapArr[1].put("LightSource", c.a(0L, this.f21619f));
        }
    }

    public final String b(String str) {
        c cVarD = d(str);
        if (cVarD != null) {
            if (str.equals("GPSTimeStamp")) {
                int i10 = cVarD.f21574a;
                if (i10 != 5 && i10 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i10);
                    return null;
                }
                e[] eVarArr = (e[]) cVarD.g(this.f21619f);
                if (eVarArr == null || eVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                    return null;
                }
                e eVar = eVarArr[0];
                Integer numValueOf = Integer.valueOf((int) (eVar.f21582a / eVar.f21583b));
                e eVar2 = eVarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (eVar2.f21582a / eVar2.f21583b));
                e eVar3 = eVarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (eVar3.f21582a / eVar3.f21583b)));
            }
            if (!f21596M.contains(str)) {
                return cVarD.f(this.f21619f);
            }
            try {
                return Double.toString(cVarD.d(this.f21619f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final int c() {
        c cVarD = d("Orientation");
        if (cVarD == null) {
            return 1;
        }
        try {
            return cVarD.e(this.f21619f);
        } catch (NumberFormatException unused) {
            return 1;
        }
    }

    public final c d(String str) {
        c cVar;
        int i10;
        c cVar2;
        if ("ISOSpeedRatings".equals(str)) {
            if (f21601m) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && (i10 = this.f21616c) != 4 && ((i10 == 9 || i10 == 15 || i10 == 12 || i10 == 13) && (cVar2 = this.f21624l) != null)) {
            return cVar2;
        }
        for (int i11 = 0; i11 < f21592I.length; i11++) {
            c cVar3 = (c) this.f21617d[i11].get(str);
            if (cVar3 != null) {
                return cVar3;
            }
        }
        if (!"Xmp".equals(str) || (cVar = this.f21624l) == null) {
            return null;
        }
        return cVar;
    }

    public final void e(f fVar, int i10) {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i11;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIC files is supported from SDK 28 and above");
        }
        if (i10 == 15 && i12 < 31) {
            throw new UnsupportedOperationException("Reading EXIF from AVIF files is supported from SDK 31 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(new a(fVar));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.f21617d;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", c.c(Integer.parseInt(strExtractMetadata), this.f21619f));
                }
                if (strExtractMetadata3 != null) {
                    mapArr[0].put("ImageLength", c.c(Integer.parseInt(strExtractMetadata3), this.f21619f));
                }
                if (strExtractMetadata2 != null) {
                    int i13 = Integer.parseInt(strExtractMetadata2);
                    if (i13 == 90) {
                        i11 = 6;
                    } else if (i13 != 180) {
                        i11 = i13 != 270 ? 1 : 8;
                    } else {
                        i11 = 3;
                    }
                    mapArr[0].put("Orientation", c.c(i11, this.f21619f));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i14 = Integer.parseInt(strExtractMetadata4);
                    int i15 = Integer.parseInt(strExtractMetadata5);
                    if (i15 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    fVar.c(i14);
                    byte[] bArr = new byte[6];
                    fVar.readFully(bArr);
                    int i16 = i14 + 6;
                    int i17 = i15 - 6;
                    if (!Arrays.equals(bArr, f21599P)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i17];
                    fVar.readFully(bArr2);
                    this.f21621h = i16;
                    s(bArr2, 0);
                }
                String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(41);
                String strExtractMetadata9 = mediaMetadataRetriever.extractMetadata(42);
                if (strExtractMetadata8 != null && strExtractMetadata9 != null) {
                    int i18 = Integer.parseInt(strExtractMetadata8);
                    int i19 = Integer.parseInt(strExtractMetadata9);
                    long j10 = i18;
                    fVar.c(j10);
                    byte[] bArr3 = new byte[i19];
                    fVar.readFully(bArr3);
                    this.f21624l = new c(j10, bArr3, 1, i19);
                }
                if (f21601m) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata3 + ", rotation " + strExtractMetadata2);
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } catch (RuntimeException e2) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e2);
            }
        } catch (Throwable th) {
            try {
                mediaMetadataRetriever.release();
                throw th;
            } catch (IOException unused2) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ac A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:55:0x0158 A[LOOP:0: B:10:0x0034->B:55:0x0158, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x015f A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x009e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00a1. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x00a4. Please report as an issue. */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Unknown Source)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public final void f(p112k2.b r23, int r24, int r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p112k2.g.f(k2.b, int, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0140  */
    /* JADX WARN: Code duplicated, block: B:104:0x0142  */
    /* JADX WARN: Code duplicated, block: B:117:0x015d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:119:0x0160  */
    /* JADX WARN: Code duplicated, block: B:122:0x0167  */
    /* JADX WARN: Code duplicated, block: B:125:0x0170 A[LOOP:2: B:120:0x0162->B:125:0x0170, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:128:0x0176 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:130:0x0179  */
    /* JADX WARN: Code duplicated, block: B:133:0x0180  */
    /* JADX WARN: Code duplicated, block: B:136:0x0189 A[LOOP:3: B:131:0x017b->B:136:0x0189, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:140:0x0193  */
    /* JADX WARN: Code duplicated, block: B:143:0x019d A[LOOP:4: B:138:0x018e->B:143:0x019d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:146:0x01a3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:148:0x01a6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:168:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    /* JADX WARN: Code duplicated, block: B:170:0x012b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x018c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x0186 A[EDGE_INSN: B:183:0x0186->B:135:0x0186 BREAK  A[LOOP:3: B:131:0x017b->B:136:0x0189], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x01a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x0186 A[EDGE_INSN: B:185:0x0186->B:135:0x0186 BREAK  A[LOOP:3: B:131:0x017b->B:136:0x0189], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00f0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:83:0x010e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0129 A[RETURN] */
    public final int g(BufferedInputStream bufferedInputStream) throws Throwable {
        int i10;
        b bVar;
        int i11;
        b bVar2;
        int i12;
        int i13;
        int i14;
        byte[] bArr;
        int i15;
        int i16;
        byte[] bArr2;
        int i17;
        byte[] bArr3;
        int i18;
        b bVar3;
        short s8;
        long j10;
        bufferedInputStream.mark(5000);
        byte[] bArr4 = new byte[5000];
        bufferedInputStream.read(bArr4);
        bufferedInputStream.reset();
        int i19 = 0;
        while (true) {
            byte[] bArr5 = r;
            if (i19 >= bArr5.length) {
                return 4;
            }
            if (bArr4[i19] != bArr5[i19]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i20 = 0; i20 < bytes.length; i20++) {
                    if (bArr4[i20] != bytes[i20]) {
                        b bVar4 = null;
                        try {
                            bVar = new b(bArr4);
                            try {
                                try {
                                    long j11 = bVar.readInt();
                                    byte[] bArr6 = new byte[4];
                                    bVar.readFully(bArr6);
                                    if (Arrays.equals(bArr6, f21606s)) {
                                        if (j11 == 1) {
                                            j11 = bVar.readLong();
                                            j10 = 16;
                                            if (j11 < 16) {
                                                bVar.close();
                                                i10 = 0;
                                                i11 = 0;
                                            }
                                        } else {
                                            j10 = 8;
                                        }
                                        i10 = 0;
                                        long j12 = 5000;
                                        if (j11 > j12) {
                                            j11 = j12;
                                        }
                                        long j13 = j11 - j10;
                                        if (j13 >= 8) {
                                            try {
                                                byte[] bArr7 = new byte[4];
                                                long j14 = 0;
                                                boolean z10 = false;
                                                boolean z11 = false;
                                                boolean z12 = false;
                                                while (true) {
                                                    if (j14 < j13 / 4) {
                                                        try {
                                                            bVar.readFully(bArr7);
                                                            if (j14 != 1) {
                                                                if (Arrays.equals(bArr7, f21607t)) {
                                                                    z10 = true;
                                                                } else if (Arrays.equals(bArr7, f21608u)) {
                                                                    z11 = true;
                                                                } else if (Arrays.equals(bArr7, f21609v) || Arrays.equals(bArr7, f21610w)) {
                                                                    z12 = true;
                                                                }
                                                                if (!z10) {
                                                                    continue;
                                                                } else if (z11) {
                                                                    bVar.close();
                                                                    i11 = 12;
                                                                } else if (z12) {
                                                                    bVar.close();
                                                                    i11 = 15;
                                                                }
                                                            }
                                                            j14++;
                                                        } catch (EOFException unused) {
                                                            bVar.close();
                                                            i11 = i10;
                                                        }
                                                    }
                                                }
                                            } catch (Exception e2) {
                                                e = e2;
                                                if (f21601m) {
                                                    Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                                }
                                                if (bVar != null) {
                                                }
                                                i11 = i10;
                                                if (i11 != 0) {
                                                    return i11;
                                                }
                                                try {
                                                    bVar2 = new b(bArr4);
                                                    try {
                                                        ByteOrder byteOrderR = r(bVar2);
                                                        this.f21619f = byteOrderR;
                                                        bVar2.f21571c = byteOrderR;
                                                        s8 = bVar2.readShort();
                                                        if (s8 != 20306) {
                                                            i12 = 1;
                                                        } else {
                                                            i12 = 1;
                                                        }
                                                        bVar2.close();
                                                    } catch (Exception unused2) {
                                                        if (bVar2 != null) {
                                                            bVar2.close();
                                                        }
                                                        i12 = i10;
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        bVar4 = bVar2;
                                                        if (bVar4 != null) {
                                                            bVar4.close();
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Exception unused3) {
                                                    bVar2 = null;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                }
                                                if (i12 != 0) {
                                                    return 7;
                                                }
                                                try {
                                                    bVar3 = new b(bArr4);
                                                    try {
                                                        ByteOrder byteOrderR2 = r(bVar3);
                                                        this.f21619f = byteOrderR2;
                                                        bVar3.f21571c = byteOrderR2;
                                                        if (bVar3.readShort() == 85) {
                                                            i13 = 1;
                                                        } else {
                                                            i13 = i10;
                                                        }
                                                        bVar3.close();
                                                    } catch (Exception unused4) {
                                                        bVar4 = bVar3;
                                                        if (bVar4 != null) {
                                                            bVar4.close();
                                                        }
                                                        i13 = i10;
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        bVar4 = bVar3;
                                                        if (bVar4 != null) {
                                                            bVar4.close();
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Exception unused5) {
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                }
                                                if (i13 != 0) {
                                                    return 10;
                                                }
                                                i14 = i10;
                                                while (true) {
                                                    bArr = f21613z;
                                                    if (i14 < bArr.length) {
                                                        i15 = 1;
                                                        break;
                                                    }
                                                    if (bArr4[i14] != bArr[i14]) {
                                                        i15 = i10;
                                                        break;
                                                    }
                                                    i14++;
                                                }
                                                if (i15 != 0) {
                                                    return 13;
                                                }
                                                i16 = i10;
                                                while (true) {
                                                    bArr2 = f21585B;
                                                    if (i16 < bArr2.length) {
                                                        i17 = i10;
                                                        while (true) {
                                                            bArr3 = f21586C;
                                                            if (i17 < bArr3.length) {
                                                                i18 = 1;
                                                                break;
                                                            }
                                                            if (bArr4[bArr2.length + i17 + 4] != bArr3[i17]) {
                                                                break;
                                                            }
                                                            i17++;
                                                        }
                                                        if (i18 != 0) {
                                                            return 14;
                                                        }
                                                        return i10;
                                                    }
                                                    if (bArr4[i16] != bArr2[i16]) {
                                                        break;
                                                    }
                                                    i16++;
                                                }
                                                i18 = i10;
                                                if (i18 != 0) {
                                                    return 14;
                                                }
                                                return i10;
                                            }
                                        }
                                        bVar.close();
                                        i11 = i10;
                                    } else {
                                        bVar.close();
                                        i10 = 0;
                                        i11 = 0;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    bVar4 = bVar;
                                    if (bVar4 != null) {
                                        bVar4.close();
                                    }
                                    throw th;
                                }
                            } catch (Exception e4) {
                                e = e4;
                                i10 = 0;
                            }
                        } catch (Exception e7) {
                            e = e7;
                            i10 = 0;
                            bVar = null;
                        } catch (Throwable th6) {
                            th = th6;
                        }
                        if (i11 != 0) {
                            return i11;
                        }
                        bVar2 = new b(bArr4);
                        ByteOrder byteOrderR3 = r(bVar2);
                        this.f21619f = byteOrderR3;
                        bVar2.f21571c = byteOrderR3;
                        s8 = bVar2.readShort();
                        if (s8 != 20306 || s8 == 21330) {
                            i12 = 1;
                        } else {
                            i12 = i10;
                        }
                        bVar2.close();
                        if (i12 != 0) {
                            return 7;
                        }
                        bVar3 = new b(bArr4);
                        ByteOrder byteOrderR4 = r(bVar3);
                        this.f21619f = byteOrderR4;
                        bVar3.f21571c = byteOrderR4;
                        if (bVar3.readShort() == 85) {
                            i13 = 1;
                        } else {
                            i13 = i10;
                        }
                        bVar3.close();
                        if (i13 != 0) {
                            return 10;
                        }
                        i14 = i10;
                        while (true) {
                            bArr = f21613z;
                            if (i14 < bArr.length) {
                                i15 = 1;
                                break;
                            }
                            if (bArr4[i14] != bArr[i14]) {
                                i15 = i10;
                                break;
                            }
                            i14++;
                        }
                        if (i15 != 0) {
                            return 13;
                        }
                        i16 = i10;
                        while (true) {
                            bArr2 = f21585B;
                            if (i16 < bArr2.length) {
                                i17 = i10;
                                while (true) {
                                    bArr3 = f21586C;
                                    if (i17 < bArr3.length) {
                                        i18 = 1;
                                        break;
                                    }
                                    if (bArr4[bArr2.length + i17 + 4] != bArr3[i17]) {
                                        break;
                                        break;
                                    }
                                    i17++;
                                }
                                if (i18 != 0) {
                                    return 14;
                                }
                                return i10;
                            }
                            if (bArr4[i16] != bArr2[i16]) {
                                break;
                                break;
                            }
                            i16++;
                        }
                        i18 = i10;
                        if (i18 != 0) {
                            return 14;
                        }
                        return i10;
                    }
                }
                return 9;
            }
            i19++;
        }
    }

    public final void h(f fVar) throws Throwable {
        int i10;
        int i11;
        k(fVar);
        HashMap[] mapArr = this.f21617d;
        c cVar = (c) mapArr[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.f21577d);
            fVar2.f21571c = this.f21619f;
            byte[] bArr = f21611x;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.c(0L);
            byte[] bArr3 = f21612y;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.c(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.c(12L);
            }
            t(fVar2, 6);
            c cVar2 = (c) mapArr[7].get("PreviewImageStart");
            c cVar3 = (c) mapArr[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", cVar2);
                mapArr[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = (c) mapArr[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.g(this.f21619f);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i12 = iArr[2];
                int i13 = iArr[0];
                if (i12 <= i13 || (i10 = iArr[3]) <= (i11 = iArr[1])) {
                    return;
                }
                int i14 = (i12 - i13) + 1;
                int i15 = (i10 - i11) + 1;
                if (i14 < i15) {
                    int i16 = i14 + i15;
                    i15 = i16 - i15;
                    i14 = i16 - i15;
                }
                c cVarC = c.c(i14, this.f21619f);
                c cVarC2 = c.c(i15, this.f21619f);
                mapArr[0].put("ImageWidth", cVarC);
                mapArr[0].put("ImageLength", cVarC2);
            }
        }
    }

    public final void i(b bVar) throws Throwable {
        if (f21601m) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.f21571c = ByteOrder.BIG_ENDIAN;
        int i10 = bVar.f21570b;
        bVar.b(f21613z.length);
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            if (z10 && z11) {
                return;
            }
            try {
                int i11 = bVar.readInt();
                int i12 = bVar.readInt();
                int i13 = bVar.f21570b;
                int i14 = i13 + i11 + 4;
                int i15 = i13 - i10;
                if (i15 == 16 && i12 != 1229472850) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (i12 == 1229278788) {
                    return;
                }
                if (i12 == 1700284774 && !z10) {
                    this.f21621h = i15;
                    byte[] bArr = new byte[i11];
                    bVar.readFully(bArr);
                    int i16 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(i12 >>> 24);
                    crc32.update(i12 >>> 16);
                    crc32.update(i12 >>> 8);
                    crc32.update(i12);
                    crc32.update(bArr);
                    if (((int) crc32.getValue()) != i16) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i16 + ", calculated CRC value: " + crc32.getValue());
                    }
                    s(bArr, 0);
                    y();
                    v(new b(bArr));
                    z10 = true;
                } else if (i12 == 1767135348 && !z11) {
                    byte[] bArr2 = f21584A;
                    if (i11 >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        bVar.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int i17 = bVar.f21570b - i10;
                            int i18 = i11 - length;
                            byte[] bArr4 = new byte[i18];
                            bVar.readFully(bArr4);
                            this.f21624l = new c(i17, bArr4, 1, i18);
                            z11 = true;
                        }
                    }
                }
                bVar.b(i14 - bVar.f21570b);
            } catch (EOFException e2) {
                throw new IOException("Encountered corrupt PNG file.", e2);
            }
        }
    }

    public final void j(b bVar) throws Throwable {
        boolean z10 = f21601m;
        if (z10) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.b(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        int i12 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i11];
        bVar.b(i10 - bVar.f21570b);
        bVar.readFully(bArr4);
        f(new b(bArr4), i10, 5);
        bVar.b(i12 - bVar.f21570b);
        bVar.f21571c = ByteOrder.BIG_ENDIAN;
        int i13 = bVar.readInt();
        if (z10) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i13);
        }
        for (int i14 = 0; i14 < i13; i14++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == f21591H.f21578a) {
                short s8 = bVar.readShort();
                short s10 = bVar.readShort();
                c cVarC = c.c(s8, this.f21619f);
                c cVarC2 = c.c(s10, this.f21619f);
                HashMap[] mapArr = this.f21617d;
                mapArr[0].put("ImageLength", cVarC);
                mapArr[0].put("ImageWidth", cVarC2);
                if (z10) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s8) + ", width: " + ((int) s10));
                    return;
                }
                return;
            }
            bVar.b(unsignedShort2);
        }
    }

    public final void k(f fVar) throws Throwable {
        p(fVar);
        t(fVar, 0);
        x(fVar, 0);
        x(fVar, 5);
        x(fVar, 4);
        y();
        if (this.f21616c == 8) {
            HashMap[] mapArr = this.f21617d;
            c cVar = (c) mapArr[1].get("MakerNote");
            if (cVar != null) {
                f fVar2 = new f(cVar.f21577d);
                fVar2.f21571c = this.f21619f;
                fVar2.b(6);
                t(fVar2, 9);
                c cVar2 = (c) mapArr[9].get("ColorSpace");
                if (cVar2 != null) {
                    mapArr[1].put("ColorSpace", cVar2);
                }
            }
        }
    }

    public final void l(f fVar) throws Throwable {
        if (f21601m) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + fVar);
        }
        k(fVar);
        HashMap[] mapArr = this.f21617d;
        c cVar = (c) mapArr[0].get("JpgFromRaw");
        if (cVar != null) {
            f(new b(cVar.f21577d), (int) cVar.f21576c, 5);
        }
        c cVar2 = (c) mapArr[0].get("ISO");
        c cVar3 = (c) mapArr[1].get("PhotographicSensitivity");
        if (cVar2 == null || cVar3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", cVar2);
    }

    public final void m(b bVar) throws Throwable {
        if (f21601m) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.f21571c = ByteOrder.LITTLE_ENDIAN;
        bVar.b(f21585B.length);
        int i10 = bVar.readInt() + 8;
        byte[] bArr = f21586C;
        bVar.b(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i11 = bVar.readInt();
                int i12 = length + 8;
                if (Arrays.equals(f21587D, bArr2)) {
                    byte[] bArrCopyOfRange = new byte[i11];
                    bVar.readFully(bArrCopyOfRange);
                    byte[] bArr3 = f21599P;
                    if (b.p0(bArrCopyOfRange, bArr3)) {
                        bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, bArr3.length, i11);
                    }
                    this.f21621h = i12;
                    s(bArrCopyOfRange, 0);
                    v(new b(bArrCopyOfRange));
                    return;
                }
                if (i11 % 2 == 1) {
                    i11++;
                }
                length = i12 + i11;
                if (length == i10) {
                    return;
                }
                if (length > i10) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.b(i11);
            } catch (EOFException e2) {
                throw new IOException("Encountered corrupt WebP file.", e2);
            }
        }
    }

    public final void n(b bVar, HashMap map) throws Throwable {
        c cVar = (c) map.get("JPEGInterchangeFormat");
        c cVar2 = (c) map.get("JPEGInterchangeFormatLength");
        if (cVar == null || cVar2 == null) {
            return;
        }
        int iE = cVar.e(this.f21619f);
        int iE2 = cVar2.e(this.f21619f);
        if (this.f21616c == 7) {
            iE += this.f21622i;
        }
        if (iE > 0 && iE2 > 0 && this.f21615b == null && this.f21614a == null) {
            bVar.b(iE);
            bVar.readFully(new byte[iE2]);
        }
        if (f21601m) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iE + ", length: " + iE2);
        }
    }

    public final boolean o(HashMap map) {
        c cVar = (c) map.get("ImageLength");
        c cVar2 = (c) map.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.e(this.f21619f) <= 512 && cVar2.e(this.f21619f) <= 512;
    }

    public final void p(f fVar) throws IOException {
        ByteOrder byteOrderR = r(fVar);
        this.f21619f = byteOrderR;
        fVar.f21571c = byteOrderR;
        int unsignedShort = fVar.readUnsignedShort();
        int i10 = this.f21616c;
        if (i10 != 7 && i10 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i11 = fVar.readInt();
        if (i11 < 8) {
            throw new IOException(p134m1.b.j(i11, "Invalid first Ifd offset: "));
        }
        int i12 = i11 - 8;
        if (i12 > 0) {
            fVar.b(i12);
        }
    }

    public final void q() {
        int i10 = 0;
        while (true) {
            HashMap[] mapArr = this.f21617d;
            if (i10 >= mapArr.length) {
                return;
            }
            StringBuilder sbP = p134m1.b.p(i10, "The size of tag group[", "]: ");
            sbP.append(mapArr[i10].size());
            Log.d("ExifInterface", sbP.toString());
            for (Map.Entry entry : mapArr[i10].entrySet()) {
                c cVar = (c) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + cVar.toString() + ", tagValue: '" + cVar.f(this.f21619f) + "'");
            }
            i10++;
        }
    }

    public final void s(byte[] bArr, int i10) throws IOException {
        f fVar = new f(bArr);
        p(fVar);
        t(fVar, i10);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0206  */
    /* JADX WARN: Code duplicated, block: B:103:0x020a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0217  */
    /* JADX WARN: Code duplicated, block: B:109:0x021c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0228  */
    /* JADX WARN: Code duplicated, block: B:112:0x022f  */
    /* JADX WARN: Code duplicated, block: B:115:0x024b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:119:0x0253  */
    /* JADX WARN: Code duplicated, block: B:126:0x028f  */
    /* JADX WARN: Code duplicated, block: B:128:0x0297  */
    /* JADX WARN: Code duplicated, block: B:131:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:133:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:136:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:138:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:147:0x031e  */
    /* JADX WARN: Code duplicated, block: B:174:0x0321 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0148  */
    /* JADX WARN: Code duplicated, block: B:72:0x014d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0153  */
    /* JADX WARN: Code duplicated, block: B:76:0x0159  */
    /* JADX WARN: Code duplicated, block: B:77:0x016d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0174  */
    /* JADX WARN: Code duplicated, block: B:82:0x017e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0180  */
    /* JADX WARN: Code duplicated, block: B:84:0x0185  */
    /* JADX WARN: Code duplicated, block: B:86:0x0188  */
    /* JADX WARN: Code duplicated, block: B:90:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:93:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:95:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:99:0x0202  */
    /* JADX WARN: Instruction removed from duplicated block: B:128:0x0297, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:76:0x0159, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:93:0x01e1, please report this as an issue */
    public final void t(f fVar, int i10) throws IOException {
        HashMap[] mapArr;
        HashSet hashSet;
        long j10;
        boolean z10;
        int i11;
        Integer num;
        String str;
        int unsignedShort;
        long j11;
        int i12;
        String strJ;
        int i13;
        Integer numValueOf = Integer.valueOf(fVar.f21570b);
        HashSet hashSet2 = this.f21618e;
        hashSet2.add(numValueOf);
        short s8 = fVar.readShort();
        boolean z11 = f21601m;
        if (z11) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) s8));
        }
        if (s8 <= 0) {
            return;
        }
        short s10 = 0;
        while (true) {
            mapArr = this.f21617d;
            if (s10 >= s8) {
                break;
            }
            int unsignedShort2 = fVar.readUnsignedShort();
            int unsignedShort3 = fVar.readUnsignedShort();
            int i14 = fVar.readInt();
            long j12 = ((long) fVar.f21570b) + 4;
            d dVar = (d) f21594K[i10].get(Integer.valueOf(unsignedShort2));
            if (z11) {
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i10), Integer.valueOf(unsignedShort2), dVar != null ? dVar.f21579b : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i14)));
            }
            if (dVar != null) {
                if (unsignedShort3 > 0) {
                    int[] iArr = f21589F;
                    if (unsignedShort3 < iArr.length) {
                        int i15 = dVar.f21580c;
                        if (i15 == 7 || unsignedShort3 == 7 || i15 == unsignedShort3 || (i11 = dVar.f21581d) == unsignedShort3 || (((i15 == 4 || i11 == 4) && unsignedShort3 == 3) || (((i15 == 9 || i11 == 9) && unsignedShort3 == 8) || ((i15 == 12 || i11 == 12) && unsignedShort3 == 11)))) {
                            if (unsignedShort3 == 7) {
                                unsignedShort3 = i15;
                            }
                            hashSet = hashSet2;
                            j10 = ((long) i14) * ((long) iArr[unsignedShort3]);
                            if (j10 < 0 || j10 > 2147483647L) {
                                if (z11 != 0) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + i14);
                                }
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                        } else if (z11 != 0) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + f21588E[unsignedShort3] + ") is unexpected for tag: " + dVar.f21579b);
                        }
                    }
                    if (z10) {
                        if (j10 > 4) {
                            i13 = fVar.readInt();
                            if (z11 != 0) {
                                Log.d("ExifInterface", "seek to data offset: " + i13);
                            }
                            if (this.f21616c == 7) {
                                if ("MakerNote".equals(dVar.f21579b)) {
                                    this.f21622i = i13;
                                } else if (i10 != 6 && "ThumbnailImage".equals(dVar.f21579b)) {
                                    this.f21623j = i13;
                                    this.k = i14;
                                    c cVarC = c.c(6, this.f21619f);
                                    c cVarA = c.a(this.f21623j, this.f21619f);
                                    c cVarA2 = c.a(this.k, this.f21619f);
                                    mapArr[4].put("Compression", cVarC);
                                    mapArr[4].put("JPEGInterchangeFormat", cVarA);
                                    mapArr[4].put("JPEGInterchangeFormatLength", cVarA2);
                                }
                            }
                            fVar.c(i13);
                        } else {
                            hashSet = hashSet;
                            unsignedShort2 = unsignedShort2;
                            i14 = i14;
                        }
                        num = (Integer) f21597N.get(Integer.valueOf(unsignedShort2));
                        if (z11 != 0) {
                            Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j10);
                        }
                        if (num != null) {
                            if (unsignedShort3 != 3) {
                                if (unsignedShort3 == 4) {
                                    j11 = ((long) fVar.readInt()) & 4294967295L;
                                } else if (unsignedShort3 == 8) {
                                    unsignedShort = fVar.readShort();
                                } else if (unsignedShort3 != 9 || unsignedShort3 == 13) {
                                    unsignedShort = fVar.readInt();
                                } else {
                                    j11 = -1;
                                }
                                if (z11 != 0) {
                                    Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j11), dVar.f21579b));
                                }
                                i12 = fVar.f21573e;
                                if (j11 > 0 || (i12 != -1 && j11 >= i12)) {
                                    hashSet = hashSet;
                                    if (z11 != 0) {
                                        strJ = p.j(j11, "Skip jump into the IFD since its offset is invalid: ");
                                        if (i12 != -1) {
                                            strJ = strJ + " (total length: " + i12 + ")";
                                        }
                                        Log.d("ExifInterface", strJ);
                                    }
                                } else {
                                    hashSet = hashSet;
                                    if (!hashSet.contains(Integer.valueOf((int) j11))) {
                                        fVar.c(j11);
                                        t(fVar, num.intValue());
                                    } else if (z11 != 0) {
                                        Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j11 + ")");
                                    }
                                }
                                fVar.c(j12);
                            } else {
                                unsignedShort = fVar.readUnsignedShort();
                            }
                            j11 = unsignedShort;
                            if (z11 != 0) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j11), dVar.f21579b));
                            }
                            i12 = fVar.f21573e;
                            if (j11 > 0) {
                                hashSet = hashSet;
                                if (z11 != 0) {
                                    strJ = p.j(j11, "Skip jump into the IFD since its offset is invalid: ");
                                    if (i12 != -1) {
                                        strJ = strJ + " (total length: " + i12 + ")";
                                    }
                                    Log.d("ExifInterface", strJ);
                                }
                            } else {
                                hashSet = hashSet;
                                if (z11 != 0) {
                                    strJ = p.j(j11, "Skip jump into the IFD since its offset is invalid: ");
                                    if (i12 != -1) {
                                        strJ = strJ + " (total length: " + i12 + ")";
                                    }
                                    Log.d("ExifInterface", strJ);
                                }
                            }
                            fVar.c(j12);
                        } else {
                            hashSet = hashSet;
                            int i16 = fVar.f21570b + this.f21621h;
                            byte[] bArr = new byte[(int) j10];
                            fVar.readFully(bArr);
                            c cVar = new c(i16, bArr, unsignedShort3, i14);
                            mapArr[i10].put(dVar.f21579b, cVar);
                            str = dVar.f21579b;
                            if ("DNGVersion".equals(str)) {
                                this.f21616c = 3;
                            }
                            if (((!"Make".equals(str) || "Model".equals(str)) && cVar.f(this.f21619f).contains("PENTAX")) || ("Compression".equals(str) && cVar.e(this.f21619f) == 65535)) {
                                this.f21616c = 8;
                            }
                            if (fVar.f21570b != j12) {
                                fVar.c(j12);
                            }
                        }
                    } else {
                        fVar.c(j12);
                    }
                    s10 = (short) (s10 + 1);
                    hashSet2 = hashSet;
                    s8 = s8;
                    z11 = z11;
                }
                hashSet = hashSet2;
                if (z11 != 0) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + unsignedShort3);
                }
                j10 = 0;
                z10 = false;
                if (z10) {
                    fVar.c(j12);
                } else {
                    if (j10 > 4) {
                        i13 = fVar.readInt();
                        if (z11 != 0) {
                            Log.d("ExifInterface", "seek to data offset: " + i13);
                        }
                        if (this.f21616c == 7) {
                            if ("MakerNote".equals(dVar.f21579b)) {
                                this.f21622i = i13;
                            } else if (i10 != 6) {
                            }
                        }
                        fVar.c(i13);
                    } else {
                        hashSet = hashSet;
                        unsignedShort2 = unsignedShort2;
                        i14 = i14;
                    }
                    num = (Integer) f21597N.get(Integer.valueOf(unsignedShort2));
                    if (z11 != 0) {
                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j10);
                    }
                    if (num != null) {
                        if (unsignedShort3 != 3) {
                            if (unsignedShort3 == 4) {
                                j11 = ((long) fVar.readInt()) & 4294967295L;
                            } else if (unsignedShort3 == 8) {
                                if (unsignedShort3 != 9) {
                                }
                                unsignedShort = fVar.readInt();
                            } else {
                                unsignedShort = fVar.readShort();
                            }
                            if (z11 != 0) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j11), dVar.f21579b));
                            }
                            i12 = fVar.f21573e;
                            if (j11 > 0) {
                                hashSet = hashSet;
                                if (z11 != 0) {
                                    strJ = p.j(j11, "Skip jump into the IFD since its offset is invalid: ");
                                    if (i12 != -1) {
                                        strJ = strJ + " (total length: " + i12 + ")";
                                    }
                                    Log.d("ExifInterface", strJ);
                                }
                            } else {
                                hashSet = hashSet;
                                if (z11 != 0) {
                                    strJ = p.j(j11, "Skip jump into the IFD since its offset is invalid: ");
                                    if (i12 != -1) {
                                        strJ = strJ + " (total length: " + i12 + ")";
                                    }
                                    Log.d("ExifInterface", strJ);
                                }
                            }
                            fVar.c(j12);
                        } else {
                            unsignedShort = fVar.readUnsignedShort();
                        }
                        j11 = unsignedShort;
                        if (z11 != 0) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j11), dVar.f21579b));
                        }
                        i12 = fVar.f21573e;
                        if (j11 > 0) {
                            hashSet = hashSet;
                            if (z11 != 0) {
                                strJ = p.j(j11, "Skip jump into the IFD since its offset is invalid: ");
                                if (i12 != -1) {
                                    strJ = strJ + " (total length: " + i12 + ")";
                                }
                                Log.d("ExifInterface", strJ);
                            }
                        } else {
                            hashSet = hashSet;
                            if (z11 != 0) {
                                strJ = p.j(j11, "Skip jump into the IFD since its offset is invalid: ");
                                if (i12 != -1) {
                                    strJ = strJ + " (total length: " + i12 + ")";
                                }
                                Log.d("ExifInterface", strJ);
                            }
                        }
                        fVar.c(j12);
                    } else {
                        hashSet = hashSet;
                        int i17 = fVar.f21570b + this.f21621h;
                        byte[] bArr2 = new byte[(int) j10];
                        fVar.readFully(bArr2);
                        c cVar2 = new c(i17, bArr2, unsignedShort3, i14);
                        mapArr[i10].put(dVar.f21579b, cVar2);
                        str = dVar.f21579b;
                        if ("DNGVersion".equals(str)) {
                            this.f21616c = 3;
                        }
                        if (!"Make".equals(str)) {
                        }
                        this.f21616c = 8;
                        if (fVar.f21570b != j12) {
                            fVar.c(j12);
                        }
                    }
                }
                s10 = (short) (s10 + 1);
                hashSet2 = hashSet;
                s8 = s8;
                z11 = z11;
            } else if (z11) {
                Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + unsignedShort2);
            }
            hashSet = hashSet2;
            j10 = 0;
            z10 = false;
            if (z10) {
                fVar.c(j12);
            } else {
                if (j10 > 4) {
                    i13 = fVar.readInt();
                    if (z11 != 0) {
                        Log.d("ExifInterface", "seek to data offset: " + i13);
                    }
                    if (this.f21616c == 7) {
                        if ("MakerNote".equals(dVar.f21579b)) {
                            this.f21622i = i13;
                        } else if (i10 != 6) {
                        }
                    }
                    fVar.c(i13);
                } else {
                    hashSet = hashSet;
                    unsignedShort2 = unsignedShort2;
                    i14 = i14;
                }
                num = (Integer) f21597N.get(Integer.valueOf(unsignedShort2));
                if (z11 != 0) {
                    Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j10);
                }
                if (num != null) {
                    if (unsignedShort3 != 3) {
                        if (unsignedShort3 == 4) {
                            j11 = ((long) fVar.readInt()) & 4294967295L;
                        } else if (unsignedShort3 == 8) {
                            if (unsignedShort3 != 9) {
                            }
                            unsignedShort = fVar.readInt();
                        } else {
                            unsignedShort = fVar.readShort();
                        }
                        if (z11 != 0) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j11), dVar.f21579b));
                        }
                        i12 = fVar.f21573e;
                        if (j11 > 0) {
                            hashSet = hashSet;
                            if (z11 != 0) {
                                strJ = p.j(j11, "Skip jump into the IFD since its offset is invalid: ");
                                if (i12 != -1) {
                                    strJ = strJ + " (total length: " + i12 + ")";
                                }
                                Log.d("ExifInterface", strJ);
                            }
                        } else {
                            hashSet = hashSet;
                            if (z11 != 0) {
                                strJ = p.j(j11, "Skip jump into the IFD since its offset is invalid: ");
                                if (i12 != -1) {
                                    strJ = strJ + " (total length: " + i12 + ")";
                                }
                                Log.d("ExifInterface", strJ);
                            }
                        }
                        fVar.c(j12);
                    } else {
                        unsignedShort = fVar.readUnsignedShort();
                    }
                    j11 = unsignedShort;
                    if (z11 != 0) {
                        Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j11), dVar.f21579b));
                    }
                    i12 = fVar.f21573e;
                    if (j11 > 0) {
                        hashSet = hashSet;
                        if (z11 != 0) {
                            strJ = p.j(j11, "Skip jump into the IFD since its offset is invalid: ");
                            if (i12 != -1) {
                                strJ = strJ + " (total length: " + i12 + ")";
                            }
                            Log.d("ExifInterface", strJ);
                        }
                    } else {
                        hashSet = hashSet;
                        if (z11 != 0) {
                            strJ = p.j(j11, "Skip jump into the IFD since its offset is invalid: ");
                            if (i12 != -1) {
                                strJ = strJ + " (total length: " + i12 + ")";
                            }
                            Log.d("ExifInterface", strJ);
                        }
                    }
                    fVar.c(j12);
                } else {
                    hashSet = hashSet;
                    int i18 = fVar.f21570b + this.f21621h;
                    byte[] bArr3 = new byte[(int) j10];
                    fVar.readFully(bArr3);
                    c cVar3 = new c(i18, bArr3, unsignedShort3, i14);
                    mapArr[i10].put(dVar.f21579b, cVar3);
                    str = dVar.f21579b;
                    if ("DNGVersion".equals(str)) {
                        this.f21616c = 3;
                    }
                    if (!"Make".equals(str)) {
                    }
                    this.f21616c = 8;
                    if (fVar.f21570b != j12) {
                        fVar.c(j12);
                    }
                }
            }
            s10 = (short) (s10 + 1);
            hashSet2 = hashSet;
            s8 = s8;
            z11 = z11;
        }
        HashSet hashSet3 = hashSet2;
        boolean z12 = z11;
        int i19 = fVar.readInt();
        if (z12) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(i19)));
        }
        long j13 = i19;
        if (j13 <= 0) {
            if (z12) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + i19);
                return;
            }
            return;
        }
        if (hashSet3.contains(Integer.valueOf(i19))) {
            if (z12) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + i19);
                return;
            }
            return;
        }
        fVar.c(j13);
        if (mapArr[4].isEmpty()) {
            t(fVar, 4);
        } else if (mapArr[5].isEmpty()) {
            t(fVar, 5);
        }
    }

    public final void u(int i10, String str, String str2) {
        HashMap[] mapArr = this.f21617d;
        if (mapArr[i10].isEmpty() || mapArr[i10].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i10];
        map.put(str2, (c) map.get(str));
        mapArr[i10].remove(str);
    }

    public final void v(b bVar) throws Throwable {
        c cVar;
        int iE;
        HashMap map = this.f21617d[4];
        c cVar2 = (c) map.get("Compression");
        if (cVar2 == null) {
            n(bVar, map);
            return;
        }
        int iE2 = cVar2.e(this.f21619f);
        if (iE2 != 1) {
            if (iE2 == 6) {
                n(bVar, map);
                return;
            } else if (iE2 != 7) {
                return;
            }
        }
        c cVar3 = (c) map.get("BitsPerSample");
        if (cVar3 != null) {
            int[] iArr = (int[]) cVar3.g(this.f21619f);
            int[] iArr2 = f21604p;
            if (Arrays.equals(iArr2, iArr) || (this.f21616c == 3 && (cVar = (c) map.get("PhotometricInterpretation")) != null && (((iE = cVar.e(this.f21619f)) == 1 && Arrays.equals(iArr, f21605q)) || (iE == 6 && Arrays.equals(iArr, iArr2))))) {
                c cVar4 = (c) map.get("StripOffsets");
                c cVar5 = (c) map.get("StripByteCounts");
                if (cVar4 == null || cVar5 == null) {
                    return;
                }
                long[] jArrJ = b.j(cVar4.g(this.f21619f));
                long[] jArrJ2 = b.j(cVar5.g(this.f21619f));
                if (jArrJ == null || jArrJ.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrJ2 == null || jArrJ2.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrJ.length != jArrJ2.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j10 = 0;
                for (long j11 : jArrJ2) {
                    j10 += j11;
                }
                byte[] bArr = new byte[(int) j10];
                this.f21620g = true;
                int i10 = 0;
                int i11 = 0;
                for (int i12 = 0; i12 < jArrJ.length; i12++) {
                    int i13 = (int) jArrJ[i12];
                    int i14 = (int) jArrJ2[i12];
                    if (i12 < jArrJ.length - 1 && i13 + i14 != jArrJ[i12 + 1]) {
                        this.f21620g = false;
                    }
                    int i15 = i13 - i10;
                    if (i15 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    try {
                        bVar.b(i15);
                        int i16 = i10 + i15;
                        byte[] bArr2 = new byte[i14];
                        try {
                            bVar.readFully(bArr2);
                            i10 = i16 + i14;
                            System.arraycopy(bArr2, 0, bArr, i11, i14);
                            i11 += i14;
                        } catch (EOFException unused) {
                            Log.d("ExifInterface", "Failed to read " + i14 + " bytes.");
                            return;
                        }
                    } catch (EOFException unused2) {
                        Log.d("ExifInterface", "Failed to skip " + i15 + " bytes.");
                        return;
                    }
                }
                if (this.f21620g) {
                    long j12 = jArrJ[0];
                    return;
                }
                return;
            }
        }
        if (f21601m) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void w(int i10, int i11) throws Throwable {
        HashMap[] mapArr = this.f21617d;
        boolean zIsEmpty = mapArr[i10].isEmpty();
        boolean z10 = f21601m;
        if (zIsEmpty || mapArr[i11].isEmpty()) {
            if (z10) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        c cVar = (c) mapArr[i10].get("ImageLength");
        c cVar2 = (c) mapArr[i10].get("ImageWidth");
        c cVar3 = (c) mapArr[i11].get("ImageLength");
        c cVar4 = (c) mapArr[i11].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            if (z10) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (cVar3 == null || cVar4 == null) {
            if (z10) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iE = cVar.e(this.f21619f);
        int iE2 = cVar2.e(this.f21619f);
        int iE3 = cVar3.e(this.f21619f);
        int iE4 = cVar4.e(this.f21619f);
        if (iE >= iE3 || iE2 >= iE4) {
            return;
        }
        HashMap map = mapArr[i10];
        mapArr[i10] = mapArr[i11];
        mapArr[i11] = map;
    }

    public final void x(f fVar, int i10) throws Throwable {
        c cVarC;
        c cVarC2;
        HashMap[] mapArr = this.f21617d;
        c cVar = (c) mapArr[i10].get("DefaultCropSize");
        c cVar2 = (c) mapArr[i10].get("SensorTopBorder");
        c cVar3 = (c) mapArr[i10].get("SensorLeftBorder");
        c cVar4 = (c) mapArr[i10].get("SensorBottomBorder");
        c cVar5 = (c) mapArr[i10].get("SensorRightBorder");
        if (cVar != null) {
            if (cVar.f21574a == 5) {
                e[] eVarArr = (e[]) cVar.g(this.f21619f);
                if (eVarArr == null || eVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                    return;
                }
                cVarC = c.b(eVarArr[0], this.f21619f);
                cVarC2 = c.b(eVarArr[1], this.f21619f);
            } else {
                int[] iArr = (int[]) cVar.g(this.f21619f);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                cVarC = c.c(iArr[0], this.f21619f);
                cVarC2 = c.c(iArr[1], this.f21619f);
            }
            mapArr[i10].put("ImageWidth", cVarC);
            mapArr[i10].put("ImageLength", cVarC2);
            return;
        }
        if (cVar2 != null && cVar3 != null && cVar4 != null && cVar5 != null) {
            int iE = cVar2.e(this.f21619f);
            int iE2 = cVar4.e(this.f21619f);
            int iE3 = cVar5.e(this.f21619f);
            int iE4 = cVar3.e(this.f21619f);
            if (iE2 <= iE || iE3 <= iE4) {
                return;
            }
            c cVarC3 = c.c(iE2 - iE, this.f21619f);
            c cVarC4 = c.c(iE3 - iE4, this.f21619f);
            mapArr[i10].put("ImageLength", cVarC3);
            mapArr[i10].put("ImageWidth", cVarC4);
            return;
        }
        c cVar6 = (c) mapArr[i10].get("ImageLength");
        c cVar7 = (c) mapArr[i10].get("ImageWidth");
        if (cVar6 == null || cVar7 == null) {
            c cVar8 = (c) mapArr[i10].get("JPEGInterchangeFormat");
            c cVar9 = (c) mapArr[i10].get("JPEGInterchangeFormatLength");
            if (cVar8 == null || cVar9 == null) {
                return;
            }
            int iE5 = cVar8.e(this.f21619f);
            int iE6 = cVar8.e(this.f21619f);
            fVar.c(iE5);
            byte[] bArr = new byte[iE6];
            fVar.readFully(bArr);
            f(new b(bArr), iE5, i10);
        }
    }

    public final void y() throws Throwable {
        w(0, 5);
        w(0, 4);
        w(5, 4);
        HashMap[] mapArr = this.f21617d;
        c cVar = (c) mapArr[1].get("PixelXDimension");
        c cVar2 = (c) mapArr[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            mapArr[0].put("ImageWidth", cVar);
            mapArr[0].put("ImageLength", cVar2);
        }
        if (mapArr[4].isEmpty() && o(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!o(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        u(0, "ThumbnailOrientation", "Orientation");
        u(0, "ThumbnailImageLength", "ImageLength");
        u(0, "ThumbnailImageWidth", "ImageWidth");
        u(5, "ThumbnailOrientation", "Orientation");
        u(5, "ThumbnailImageLength", "ImageLength");
        u(5, "ThumbnailImageWidth", "ImageWidth");
        u(4, "Orientation", "ThumbnailOrientation");
        u(4, "ImageLength", "ThumbnailImageLength");
        u(4, "ImageWidth", "ThumbnailImageWidth");
    }
}
