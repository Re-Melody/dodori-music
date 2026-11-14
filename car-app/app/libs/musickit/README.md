# MusicKit Android SDK

Apple 공식 [MusicKit 페이지](https://developer.apple.com/musickit/)의 **Download the MusicKit SDK for Android**에서
개발자 계정으로 SDK를 다운로드하고, 배포본의 인증·미디어 재생 AAR과 필요한 JAR을 이 폴더에 놓습니다.
배포본 README가 요구하는 의존성도 `app/build.gradle.kts`에 추가합니다.

바이너리는 Git에서 제외됩니다. SDK와 개발자 토큰이 없어도 앱 소스는 컴파일되지만
Apple Music 계정 연결·전체 곡 재생은 활성화되지 않습니다.

설정과 구현 범위: [Apple Music 연동 가이드](../../../docs/APPLE_MUSIC.md).
