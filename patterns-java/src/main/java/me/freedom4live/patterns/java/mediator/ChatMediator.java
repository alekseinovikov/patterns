package me.freedom4live.patterns.java.mediator;

public interface ChatMediator {
    void sendMessage(String msg, User user);

    void addUser(User user);
}
