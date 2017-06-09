package com.matterial.messaging.api;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * <strong>MessageContainer</strong>
 */
@XmlRootElement
public class MessageContainer implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private String senderApplication;
    private List<String> receivers;
    private String subject;
    private String message;

    public MessageContainer() {
        // *** do nothing;
    }
    
    public String getSenderApplication() {
        return senderApplication;
    }

    public void setSenderApplication(String senderApplication) {
        this.senderApplication = senderApplication;
    }

    public List<String> getReceivers() {
        if(this.receivers == null) {
            this.receivers = new ArrayList<>();
        }
        return receivers;
    }

    public void setReceivers(List<String> receivers) {
        this.receivers = receivers;
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
        return "MessageContainer{" + 
               "senderApplication=" + senderApplication + 
               ", receivers=" + receivers + 
               ", subject=" + subject + 
               ", message=" + message + 
               "}";
    }
}
