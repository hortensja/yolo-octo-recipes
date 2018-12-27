package me.krasun.recipes.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "me.krasun.recipes.controller", "me.krasun.recipes.dao", "me.krasun.recipes.service" })
public class AppConfig {
}
