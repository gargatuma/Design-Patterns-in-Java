package creational.builder;

public class Main {
    public static void main(String[] args) {
        Message build = Message.builder()
                .chatId("This is chatId")
                .text("This is text")
                .attachement("This is attachement")
                .from("Me")
                .to("you")
                .size(9)
                .build();
    }
}
