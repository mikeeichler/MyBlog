package site.mikee.myblog.resources;

import site.mikee.myblog.models.Message;
import site.mikee.myblog.services.MessageService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/messages")
public class MessageResource {

    MessageService messageService = new MessageService();
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Message> getMessagesXML() {
        return messageService.getAllMessages();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Message> getMessagesJSON() {
        return messageService.getAllMessages();
    }
    @GET
    @Path("/{messageId}")
    @Produces(MediaType.APPLICATION_XML)
        public Message
        getMessageXML(@PathParam("messageId") int iId) {
        return messageService.getMessage(iId);
    }
    @GET
    @Path("/j/{messageId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Message
    getMessageJSON(@PathParam("messageId") int iId) {
        return messageService.getMessage(iId);
    }
}
