package nl.gumby.helloworld.msg.sender;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import nl.gumby.helloworld.msg.receiver.Message;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sender")
@RequiredArgsConstructor
@Slf4j
public class SenderController {

    private final SenderService senderService;

    @PostMapping(path="/msg")
    public void send(@RequestBody Message msg) {

        senderService.queueHelloWorldMessage(msg.getMsg());
    }
}
