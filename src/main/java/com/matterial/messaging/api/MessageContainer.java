package com.matterial.messaging.api;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * <strong>MessageContainer</strong>
 */
@XmlRootElement
public class MessageContainer implements Serializable {

    private static final long serialVersionUID = 1L;

    private String senderApplication;
    private String from;
    private List<String> receivers;
    private List<Attachment> attachments;
    private String subject;
    private String message;
    private String templateNameSubject;
    private String templateNameMessage;
    private Map<String, Object> templateContextObjects;

    public MessageContainer() {
        // *** do nothing;
    }

    public String getSenderApplication() {
        return senderApplication;
    }

    public void setSenderApplication(String senderApplication) {
        this.senderApplication = senderApplication;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public List<Attachment> getAttachments() {
        if(this.attachments == null) {
            this.attachments = new ArrayList<>();
        }
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
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

    public String getTemplateNameSubject() {
        return templateNameSubject;
    }

    public void setTemplateNameSubject(String templateNameSubject) {
        this.templateNameSubject = templateNameSubject;
    }

    public String getTemplateNameMessage() {
        return templateNameMessage;
    }

    public void setTemplateNameMessage(String templateNameMessage) {
        this.templateNameMessage = templateNameMessage;
    }

    public Map<String, Object> getTemplateContextObjects() {
        if(this.templateContextObjects == null) {
            this.templateContextObjects = new HashMap<>();
        }
        return this.templateContextObjects;
    }

    public void setTemplateContextObjects(Map<String, Object> templateContextObjects) {
        this.templateContextObjects = templateContextObjects;
    }

    @Override
    public String toString() {
        return "MessageContainer{" +
               "senderApplication=" + this.getSenderApplication() +
               ", from=" + this.getFrom() +
               ", receivers=" + this.getReceivers() +
               ", subject=" + this.getSubject() +
               ", message=" + this.getMessage() +
               ", templateNameSubject=" + this.getTemplateNameSubject() +
               ", templateNameMessage=" + this.getTemplateNameMessage() +
               ", templateContextObjects=" + this.getTemplateContextObjects() +
               "}";
    }

}
