package ua.lviv.iot.algo.part1.laptop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ua.lviv.iot.algo.part1.laptop")
@PropertySource("classpath:application.yml")
public class AppConfig {
}
