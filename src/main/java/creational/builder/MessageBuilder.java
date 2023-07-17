package creational.builder;

public interface MessageBuilder {

    MessageBuilder text(String text);
    MessageBuilder chatId(String chatId);
    MessageBuilder attachment(String chatId);
    MessageBuilder size(int size);
    MessageBuilder to(String to);
    MessageBuilder from(String from);
    Message build();
}
