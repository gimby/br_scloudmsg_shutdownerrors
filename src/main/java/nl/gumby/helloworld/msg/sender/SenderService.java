package nl.gumby.helloworld.msg.sender;

import lombok.RequiredArgsConstructor;
import nl.gumby.helloworld.msg.receiver.Message;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SenderService {

    private static final String HELLO_WORLD_OUT = "helloWorld-out-0";

    private final StreamBridge streamBridge;

    public void queueHelloWorldMessage(String msgText) {
        Message msg = new Message(msgText);
        streamBridge.send(HELLO_WORLD_OUT, MessageBuilder.withPayload(msg).build());
    }
}
