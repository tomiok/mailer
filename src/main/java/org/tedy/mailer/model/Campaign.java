package org.tedy.mailer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
 * Created by tedy on 21/1/17.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Campaign {
    private String id;
    /**
     *
     regular
     plaintext
     absplit
     rss
     variate
     */
    private String type;
    private String create_time;
    private String archive_url;
    private String long_archive_url;
    private String status;
    private int emails_sent;
    private String send_time;
    private String content_type;
    private Recipient recipients;
    private Setting settings;

    public Campaign() {}

    public Campaign(String title, String type) {
        this.type = type;
        this.recipients = new Recipient();
        this.settings = new Setting(title);
    }

    //    tracking

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getCreate_time() {
        return create_time;
    }
    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getArchive_url() {
        return archive_url;
    }
    public void setArchive_url(String archive_url) {
        this.archive_url = archive_url;
    }

    public String getLong_archive_url() {
        return long_archive_url;
    }
    public void setLong_archive_url(String long_archive_url) {
        this.long_archive_url = long_archive_url;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public int getEmails_sent() {
        return emails_sent;
    }
    public void setEmails_sent(int emails_sent) {
        this.emails_sent = emails_sent;
    }

    public String getSend_time() {
        return send_time;
    }
    public void setSend_time(String send_time) {
        this.send_time = send_time;
    }

    public String getContent_type() {
        return content_type;
    }
    public void setContent_type(String content_type) {
        this.content_type = content_type;
    }

    public Recipient getRecipients() {
        return recipients;
    }
    public void setRecipients(Recipient recipients) {
        this.recipients = recipients;
    }

    public Setting getSettings() {
        return settings;
    }
    public void setSettings(Setting settings) {
        this.settings = settings;
    }
}