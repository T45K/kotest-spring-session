package io.github.t45k.kotestspringsession

import io.kotest.core.spec.style.DescribeSpec
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class KotestSpringSessionApplicationTest : DescribeSpec({
    it("check sessionRepository bean registration") { }
})
