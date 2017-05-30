package com.matterial.messaging.api;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MessageContainer {

    private static final long serialVersionUID = 1L;
    
    public static enum MESSAGE_TYPE {EMAIL};
    
    private String senderApplication;
    private String sender;
    private String receiver;
    
    private MESSAGE_TYPE type;
    private String subject;
    private String message;

    public MessageContainer(){}
    
    public String getSenderApplication() {
        return senderApplication;
    }

    public void setSenderApplication(String senderApplication) {
        this.senderApplication = senderApplication;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public MESSAGE_TYPE getType() {
        return type;
    }

    public void setType(MESSAGE_TYPE type) {
        this.type = type;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "MessageContainer{" + "senderApplication=" + senderApplication + ", sender=" + sender + ", receiver=" + receiver + ", type=" + type + ", subject=" + subject + ", message=" + message + '}';
    }
}
