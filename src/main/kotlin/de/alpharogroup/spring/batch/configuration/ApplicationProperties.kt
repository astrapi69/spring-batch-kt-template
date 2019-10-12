package de.alpharogroup.spring.batch.configuration

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "app")
class ApplicationProperties(var name: String, var dbHost: String,
                            var dbName: String, var dbPort: Int,
                            var dbUrlPrefix: String, var dbUsername: String,
                            var dbPassword: String,
                            var dir: String,
                            var csvDir: String)