package creational.builder;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class Message {
    private final String text;
    private final String chatId;
    private final String attachment;
    private final int size;
    private final String from;
    private final String to;

    public Message(String text, String chatId, String attachment, int size, String from, String to) {
        this.text = text;
        this.chatId = chatId;
        this.attachment = attachment;
        this.size = size;
        this.from = from;
        this.to = to;
    }


    public static MessageBuilder builder() {
        return new CuteMessageBuilder();
    }
}
