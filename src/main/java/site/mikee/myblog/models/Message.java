package site.mikee.myblog.models;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement
public class Message {
    private int iId;
    private String sMessage;
    private Date dCreated;
    private String sAuthor;

    public Message() {
    }

    public Message(int iId, String sMessage, String sAuthor) {
        this.iId = iId;
        this.sMessage = sMessage;
        this.dCreated = new Date();
        this.sAuthor = sAuthor;
    }

    public int getiId() {
        return iId;
    }

    public void setiId(int iId) {
        this.iId = iId;
    }

    public String getsMessage() {
        return sMessage;
    }

    public void setsMessage(String sMessage) {
        this.sMessage = sMessage;
    }

    public Date getdCreated() {
        return dCreated;
    }

    public void setdCreated(Date dCreated) {
        this.dCreated = dCreated;
    }

    public String getsAuthor() {
        return sAuthor;
    }

    public void setsAuthor(String sAuthor) {
        this.sAuthor = sAuthor;
    }
}
