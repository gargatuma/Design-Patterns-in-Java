package creational.builder;

public class CuteMessageBuilder implements MessageBuilder{
    private String text;
    private String chatId;
    private String attachement;
    private int size;
    private String from;
    private String to;

    @Override
    public MessageBuilder text(String text) {
        this.text = text;
        return this;
    }

    @Override
    public MessageBuilder chatId(String chatId) {
        this.chatId = chatId;
        return this;
    }

    @Override
    public MessageBuilder attachement(String attachement) {
        this.attachement = attachement;
        return this;
    }

    @Override
    public MessageBuilder size(int size) {
        this.size = size;
        return this;
    }

    @Override
    public MessageBuilder to(String to) {
        this.to = to;
        return this;
    }

    @Override
    public MessageBuilder from(String from) {
        this.from = from;
        return this;
    }

    @Override
    public Message build() {
        return new Message(this.text, this.chatId, this.attachement, this.size, this.from, this.to);
    }
}
