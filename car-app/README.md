# 길 위의 음악 — 차량용 음악 지도 프로토타입

현대자동차그룹 공모전용 Kotlin Android 프로젝트. WayVibe의 위치 기반 음악 경험과
RoadyGoat의 지역 추천·지도 표현을 참고해 필요한 동작을 새로 구현했습니다.
추출된 WayVibe Java 코드나 타 앱의 브랜드·이미지·SDK 토큰을 복사하지 않습니다.

## 현재 동작

- 실제 좌표 수신 → 등록 지역 판별 → 장르별 지역 음악 추천 및 추천 이유 표시
- 현재 위치와 음악 지역을 표시하는 네이티브 OpenStreetMap 지도, 확대·축소
- 서울 한강 → 수원 화성 → 용인 호수의 3분 시연 경로 및 다음 지역 이동
- 지역 변경 시 현재 곡을 보존하고 다음 재생 목록만 교체
- 창작 시연곡 6개 오프라인 재생, 일시정지, 이전·다음, 자동 다음 곡
- Android MediaBrowserService / MediaSession을 통한 탐색·시스템 재생 제어·검색 재생
- 포그라운드 서비스, 미디어 알림, 오디오 포커스, 다른 오디오에 의한 일시정지 처리
- 즐겨찾기 로컬 저장, 장르 필터
- AAOS CarUxRestrictions 수신: 제한 활성화 또는 상태 확인 실패 시 목록·필터·지도 조작 제한
- 일반 Android 위치와 Pleos FusedLocation을 소스 세트로 분리

**추천 데이터와 음원은 시연용입니다.** 전국 상용 음악 데이터나 실제 아티스트 추천이 아닙니다.
외부 음악 서비스의 전체곡 스트리밍과 인증은 구현하지 않았습니다.
곡들은 `tools/generate_demo_audio.py`가 직접 합성한 24초 분량의 창작 시연곡입니다.
지도 타일은 인터넷 연결이 필요합니다. 연결이 없으면 현재 좌표·지역 핀·시연 경로를 계속 표시합니다.
점선은 지역 중심을 연결한 시연 경로이며 실제 도로 경로 또는 길 안내가 아닙니다.

## 실행

일반 Android 에뮬레이터를 자동으로 켜고 빌드·설치·실행하려면 PowerShell에서:

```powershell
cd C:\Users\user\OneDrive\dodori-music\car-app
powershell -ExecutionPolicy Bypass -File .\run.ps1
```

`No connected devices`는 빌드 코드 오류가 아니라 설치 대상이 없는 상태입니다.
위 스크립트는 설치된 AVD를 실행하고 Android 부팅 완료를 기다립니다.
기기가 여러 개면 `-Serial emulator-5554`, 특정 AVD는 `-Avd Pixel_2`로 선택합니다.
Pleos에서는 해당 에뮬레이터를 먼저 켜고 `-Variant pleos`를 추가합니다.

Android Studio에서 **이 car-app 폴더**를 프로젝트로 엽니다.
JDK 17 이상(검증 환경 JDK 21), Android SDK 34, 인터넷이 필요합니다.
`local.properties`에 각 PC의 `sdk.dir`를 설정합니다. 이 파일은 Git에 포함하지 않습니다.

```powershell
.\gradlew.bat :app:assembleStandardDebug
.\gradlew.bat :app:assemblePleosDebug
.\gradlew.bat :app:testStandardDebugUnitTest
```

- `standardDebug`: 일반 Android 에뮬레이터 / Android LocationManager 위치 수신
- `pleosDebug`: 공식 `ai.pleos.playground:FusedLocation:1.1.3` 연동 / Pleos 지원 환경 필요
- 두 변형은 같은 applicationId를 사용하므로 동시에 설치하지 않습니다.
- APK: `app/build/outputs/apk/standard/debug/app-standard-debug.apk`
- APK: `app/build/outputs/apk/pleos/debug/app-pleos-debug.apk`

앱 실행 → **시연 시작** → **재생** → **다음 지역** 순서로 누르면
현재 곡이 유지되고 추천이 서울에서 수원, 용인으로 바뀝니다.
실제 위치를 쓰려면 **현재 위치**를 누르고 위치 권한을 허용합니다.
등록 지역 밖에서는 다른 도시의 곡을 임의 추천하지 않습니다.
연결·앱 시작·시연 시작 자체로 음악을 자동 재생하지 않습니다.
**종료**는 재생과 위치 수신을 중지합니다. 앱을 최근 작업에서 제거해도 서비스를 정리합니다.

## 검증

단위 테스트는 지역 경계 유지, 등록되지 않은 지역, 장르 필터, 시연 경로 끝점,
지역 이동 시 기존 곡 유지와 중복 제거를 검사합니다.
실행 테스트는 Android 기기의 실제 MediaBrowser·MediaController·MediaPlayer를 사용합니다.

```powershell
.\gradlew.bat :app:assembleStandardDebug :app:assembleStandardDebugAndroidTest
adb install -r app/build/outputs/apk/standard/debug/app-standard-debug.apk
adb install -r app/build/outputs/apk/androidTest/standard/debug/app-standard-debug-androidTest.apk
python tools/smoke_test.py --adb PATH_TO_ADB
```

테스트는 **폐기 가능한 에뮬레이터 1개**에서 실행합니다. 즐겨찾기·재생 상태를 변경합니다.
재실행 전 해당 에뮬레이터의 앱 데이터는 `adb shell pm clear com.musicmap.car`로 초기화합니다.
실행 결과: `build/verification/smoke-result.txt`.
검증 요약과 남은 범위는 [검증 기록](docs/VALIDATION.md)을 참고합니다.

## 구조

| 파일 | 역할 |
|---|---|
| `Catalog.kt` | 지역·시연곡, 거리와 경계 판별, 추천·다음 곡 구성 |
| `PlaybackService.kt` | 실제 재생, 미디어 탐색·세션, 위치 수명주기, 시연 이동 |
| `PositionSource.kt` | 좌표 수신 인터페이스와 Android 구현 |
| `src/pleos/.../PositionFactory.kt` | 공식 Pleos 위치 SDK 구현 |
| `MainActivity.kt` | 세로 전용 지도·음악 목록, 탐색/보관함, 하단 미니 플레이어와 재생 메뉴 |
| `MusicMapView.kt` | OSM 타일 지도, 지역 핀과 현재 좌표 |
| `CarUxGuard.kt` | AAOS 주행 UX 제한 수신 |

공통 추천·지역 로직은 Android UI와 분리돼 있습니다.
기존 `roadygoat.js`, `roadygoat-out`, `wayvibe-jadx`는 수정하지 않습니다.

## 대회 제출까지 남은 작업

1. Pleos 2.1.0 에뮬레이터와 실제 차량에서 위치·미디어 센터·주행 제한을 검증합니다.
2. Pleos Workspace에서 사용할 SDK의 현재 제공 상태와 권한을 확인합니다.
   FusedLocation 코드가 컴파일된다는 사실만으로 차량 위치 접근 승인·실행을 보장하지 않습니다.
3. 음원 공급 방식과 사용 권한을 확정하고 시연 카탈로그를 실제 지역·음악 데이터로 교체합니다.
4. 차량 카테고리·미디어 센터 노출·주행 UX 심사를 확인합니다.
   `distractionOptimized`는 실차 검증 전 선언하지 않았습니다. 차량이 주행 중 Activity를 차단할 수 있습니다.
5. 앱 이름·패키지명 확정, 본인 릴리스 서명 키로 서명, 실행 가능한 release APK와 기획서·시연 영상 준비.
   현재 자동 생성하는 debug APK는 개발용이며 최종 제출용 서명 APK가 아닙니다.

## 확인한 공식 문서

- [공모전 개발 환경](https://appdevchallenge.auto-hmg.io/guide/development)
- [Pleos Emulator 설치 및 요구사항](https://document.pleos.ai/docs/connect/guide/getting-started/application-development/setup-connect-sdk-emulator)
- [Music/Audio 가이드](https://document.pleos.ai/docs/pleos-only/vehicle-app-developer-guide/music-audio-app-developement-guide)
- [FusedLocation 의존성](https://document.pleos.ai/docs/pleos-only/connect-sdk-pleos/FusedLocation/project-setup)
- [FusedLocation 수신](https://document.pleos.ai/docs/pleos-only/connect-sdk-pleos/FusedLocation/location-data-access)
- [SDK 제공 상태와 신청](https://document.pleos.ai/docs/pleos-only/create-my-project)
- [주행 규제](https://document.pleos.ai/docs/pleos-only/vehicle-app-developer-guide/driving-restriction-development-guide)
- [OpenStreetMap 저작권](https://www.openstreetmap.org/copyright)
- [OSM 타일 사용 정책](https://operations.osmfoundation.org/policies/tiles/)

지도 타일은 OSM 표준 서버를 사용하고 화면에 저작자 표시를 제공합니다.
HTTP 캐시와 앱 User-Agent를 사용하며 다운로드·프리패치 기능은 없습니다.
배포 규모 확대 전 타일 제공자를 검토해야 합니다.
