package no.fintlabs.library.consumer

import lombok.Data
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration

@Data
@Configuration
class ConsumerConfig {

    @Value("\${fint.consumer.domain}")
    lateinit var domainName: String

    @Value("\${fint.consumer.package}")
    lateinit var packageName: String

    @Value("\${fint.consumer.org-id}")
    lateinit var orgId: String

}