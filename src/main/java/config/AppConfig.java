package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "beans")
public class AppConfig {
    //multiple base packages can be mentioned as (basePackages = {"in.alchemist","in.google"})
}
