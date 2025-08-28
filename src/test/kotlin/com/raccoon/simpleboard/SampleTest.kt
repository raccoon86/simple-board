package com.raccoon.simpleboard

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class SampleTest : FunSpec({
    test("sample test") {
        1 shouldBe 1
    }
})
