## Emoji Logger 😀

### 📁 프로젝트 소개
> Emoji Logger는 로그 메시지에 이모지를 자동으로 추가하여 로그의 가독성과 시각적 매력을 향상시키는 Kotlin 기반 라이브러리입니다. 로그 레벨에 따라 적절한 이모지가 로그 메시지 앞에 붙으며, 개발자가 로그 상태를 한눈에 파악할 수 있도록 도와줍니다.

## 🚀 주요 기능
- 다양한 로그 레벨 지원: TRACE, DEBUG, INFO, WARN, ERROR 로그 레벨에 맞는 이모지 출력.
- 가독성 향상: 메시지 앞에 이모지를 추가해 로그 상태를 시각적으로 빠르게 인식 가능.
- 사용자 정의 모드 지원: 여러 이모지 모드를 설정해 원하는 스타일의 이모지를 출력.

## 💡 사용 예시
```kotlin
import org.slf4j.LoggerFactory

fun main() {
    val logger = LoggerFactory.getLogger("ExampleLogger")
    val emojiLogger = EmojiLoggerFactory(logger)

    emojiLogger.trace("이것은 추적 메시지입니다.")    // 🟣 이것은 추적 메시지입니다.
    emojiLogger.debug("디버그 메시지입니다.")        // 🔵 디버그 메시지입니다.
    emojiLogger.info("정보 메시지입니다.")          // 🟡 정보 메시지입니다.
    emojiLogger.warn("경고 메시지입니다.")          // 🟠 경고 메시지입니다.
    emojiLogger.error("에러 메시지입니다.")         // 🔴 에러 메시지입니다.
}
```

## License

This project is licensed under the MIT License - see the [LICENSE](./LICENSE) file for details.
