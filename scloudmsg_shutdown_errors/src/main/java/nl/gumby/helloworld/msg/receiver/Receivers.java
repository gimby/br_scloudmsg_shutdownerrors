package nl.gumby.helloworld.msg.receiver;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
@RequiredArgsConstructor
@Slf4j
public class Receivers {

    @Bean
    public Consumer<Message> helloWorld() {
        return message -> log.info("Received <" + message.getMsg() +">");
    }
}