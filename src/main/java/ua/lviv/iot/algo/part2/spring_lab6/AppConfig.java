package ua.lviv.iot.algo.part2.spring_lab6;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ua.lviv.iot.algo.part2.spring_lab6")
@PropertySource("classpath:application.yml")
public class AppConfig {
}
