package micro.library.kafka.stream;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

@ConfigurationProperties("service")
public interface EventKafkaStream {

    String INPUT = "event-input";

    String OUTPUT = "event-output";

    @Input(INPUT)
    SubscribableChannel input();

    @Output(OUTPUT)
    MessageChannel output();

}
