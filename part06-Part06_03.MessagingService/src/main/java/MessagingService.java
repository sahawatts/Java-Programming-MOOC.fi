
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sahaw
 */
public class MessagingService {
    ArrayList<Message> service;
    
    public MessagingService() {
        service = new ArrayList<>();
    }
    
    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            service.add(message);
        }
    }
    
    public ArrayList<Message> getMessages() {
        return service;
    }
}
