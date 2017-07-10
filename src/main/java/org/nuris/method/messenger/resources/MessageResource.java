package org.nuris.method.messenger.resources;

import org.nuris.method.messenger.model.Message;
import org.nuris.method.messenger.service.MessageService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/messages")
public class MessageResource {

    MessageService messageService = new MessageService();

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Message> getMessages() {
        return messageService.getAllMessages();
    }

    @GET
    @Path("/{messageId}")
    @Produces(MediaType.APPLICATION_XML)
    public Message test(@PathParam("messageId") long messageId){
        return messageService.getMessage(messageId);
    }

    @POST
    @Path("/{messageId}")
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_XML)
    public Message updateMessage(@PathParam("messageId") long  id, Message message){
        message.setId(id);
        return messageService.updateMessage(message);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_XML)
    public Message addMessage(Message message){
        return messageService.addMessage(message);
    }

    @DELETE
    @Path("/{messageId}")
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteMessage(@PathParam("messageId")long id){
        messageService.removeMessage(id);
    }
}

