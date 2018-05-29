package com.matterial.messaging.api;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * <strong>Attachment</strong>
 *
 * Please provide one of these:
 * <pre>
 * * url
 * * path
 * * bArray + bMimeType
 * </pre>
 */
@XmlRootElement
public class Attachment implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String description;
    private String url;
    private String path;
    private byte[] byteArray;
    private String byteArrayMimeType;
    private String cid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public byte[] getByteArray() {
        return byteArray;
    }

    public void setByteArray(byte[] byteArray) {
        this.byteArray = byteArray;
    }

    public String getByteArrayMimeType() {
        return byteArrayMimeType;
    }

    public void setByteArrayMimeType(String byteArrayMimeType) {
        this.byteArrayMimeType = byteArrayMimeType;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();

        buffer.append(this.getClass() + "\n");

        buffer.append("Name: " + this.getName() + "\n");
        buffer.append("Description: " + this.getDescription() + "\n");
        buffer.append("Path: " + this.getPath() + "\n");
        buffer.append("Url: " + this.getUrl() + "\n");
        buffer.append("Cid: " + this.getCid() + "\n");

        return buffer.toString();
    }

}
