package site.mikee.myblog.services;

import site.mikee.myblog.models.Message;

import java.util.ArrayList;
import java.util.List;

public class MessageService {
    public static List<Message> lMyList = new ArrayList<>();
    public static boolean init = true;
    public MessageService() {
        if (init) {
            Message m1 = new Message(1, "First", "Hamilton");
            Message m2 = new Message(2, "Second", "Santa Claus");
            lMyList.add(m1);
            lMyList.add(m2);
            init = false; // makes sure that the array is populated only once
        }
    }
    public List<Message> getAllMessages() {
        return lMyList;
    }
    public Message getMessage(int id) {
        return lMyList.get(id-1);
    }
}
