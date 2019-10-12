package de.alpharogroup.springbatchkttemplate

import de.alpharogroup.spring.batch.configuration.ApplicationProperties
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.transaction.annotation.EnableTransactionManagement

@EnableBatchProcessing
@EnableTransactionManagement
@EnableConfigurationProperties(ApplicationProperties::class)
@SpringBootApplication
class SpringBatchKtTemplateApplication

fun main(args: Array<String>) {
	runApplication<SpringBatchKtTemplateApplication>(*args)
}
