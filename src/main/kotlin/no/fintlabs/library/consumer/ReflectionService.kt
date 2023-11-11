package no.fintlabs.library.consumer

import lombok.Getter
import no.fintlabs.model.Identifikator
import no.fintlabs.model.utdanning.vurdering.FintMainObject
import org.reflections.Reflections
import org.springframework.stereotype.Service
import java.lang.reflect.Field

@Service
class ReflectionService(consumerConfig: ConsumerConfig) {

    val resourceMap: Map<String, Set<String>> = introspect()
    val consumerConfig: ConsumerConfig = consumerConfig

    private final fun introspect(): Map<String, Set<String>> {
        val resourceMap = mutableMapOf<String, Set<String>>()
        Reflections("no.fintlabs.model.${consumerConfig.domainName}.${consumerConfig.packageName}")
            .getSubTypesOf(FintMainObject::class.java).forEach { clazz ->
                resourceMap[clazz.simpleName] = clazz.declaredFields
                    .filter { field -> field.type == Identifikator::class.java }
                    .map(Field::getName)
                    .toSet()
            }
        return resourceMap
    }

}