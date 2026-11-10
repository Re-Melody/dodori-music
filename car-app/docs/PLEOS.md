# Pleos Connect에서 실행

`run.ps1`의 기본 빌드는 `pleosDebug`입니다. 설치된 AVD의 시스템 이미지 경로를 확인해 Pleos 기기를 선택하며, 일반 Pixel 에뮬레이터에 Pleos 빌드를 자동 설치하지 않습니다.

## 시스템 이미지 설치

Android Studio → Tools → SDK Manager → SDK Update Sites에 다음 저장소를 추가합니다.

- 이름: `Pleos Connect System Image`
- Windows/Linux URL: `https://nexus-playground.pleos.ai/repository/raw-releases/connect-avd/2.x/crp-sys-img.xml`

SDK Platforms에서 Show Package Details를 켜고 API 34의 **Pleos Connect v2.1.0 APIs**를 설치합니다. Android Studio를 재시작하고 Device Manager에서 Automotive → Pleos Connect v2.1.0으로 AVD를 생성합니다.

- 권장 AVD 이름: `Pleos_Connect_2_1_0`
- RAM: 4 GB
- 부팅: Cold boot (Quick boot에서는 VHAL을 사용할 수 없음)
- 그래픽: Hardware

공식 안내: [설치 및 실행](https://document.pleos.ai/docs/connect/guide/getting-started/application-development/setup-connect-sdk-emulator), [환경 설정](https://document.pleos.ai/docs/connect/guide/getting-started/application-development/configure-pleos-connect-emulator).

## 앱 실행

`car-app` 폴더에서:

```powershell
powershell -ExecutionPolicy Bypass -File .\run.ps1
# 여러 Pleos AVD가 있으면 이름 지정
powershell -ExecutionPolicy Bypass -File .\run.ps1 -Avd Pleos_Connect_2_1_0
# 일반 Android에서 별도로 확인할 때
powershell -ExecutionPolicy Bypass -File .\run.ps1 -Variant standard -Avd Pixel_2
```

두 빌드의 applicationId가 같으므로 같은 기기에 설치하면 기존 앱이 교체됩니다.
현재 앱은 세로 화면을 요청합니다. Pleos의 차량 화면과 멀티윈도우에서 표시되는 실제 크기도 확인해야 합니다.

## 점검 범위

1. 앱 실행과 지도/목록 표시, 시연 시작 시 자동 재생하지 않는지 확인합니다.
2. 재생·일시정지·다음 곡, 지역 이동 중 현재 곡 유지, 보관함을 확인합니다.
3. 차량 미디어 화면의 탐색과 재생 제어를 확인합니다.
4. 현재 위치 권한과 Pleos FusedLocation 콜백을 별도로 확인합니다. 시연 경로는 실제 차량 위치 수신 검증이 아닙니다.
5. 차량 상태에 따른 UX 제한, 오디오 포커스, suspend/resume은 각각 별도로 점검합니다.

기존 `tools/smoke_test.py`는 일반 Android의 테스트 GPS를 주입하므로 Pleos 위치 SDK 검증에 사용하지 않습니다. Pleos에서 실행한 검사와 아직 확인하지 못한 항목을 `VALIDATION.md`에 구분해서 기록합니다.

2026-11-10: 이 PC에서 Pleos AVD 실행, 미디어 관련 42개 계측 검사, Pleos FusedLocation을 통한 가상 GPS 수신을 확인했습니다. [점검 기록과 화면](VALIDATION.md)을 참고합니다.
