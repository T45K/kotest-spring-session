package io.github.t45k.kotestspringsession

import io.kotest.core.config.AbstractProjectConfig
import io.kotest.core.extensions.Extension
import io.kotest.core.spec.IsolationMode
import io.kotest.extensions.spring.SpringExtension

object ProjectConfig : AbstractProjectConfig() {
    // Apply to all specs by default
    override val isolationMode: IsolationMode = IsolationMode.InstancePerLeaf

    // Register SpringExtension globally so @SpringBootTest and Spring wiring work in all specs
    override val extensions: List<Extension> = listOf(SpringExtension())
}