package org.tedy.mailer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Created by tedy on 24/01/17.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CampaignContent {
    private String plain_text;
    private String html;
    private String url;

    public String getPlain_text() {
        return plain_text;
    }
    public void setPlain_text(String plain_text) {
        this.plain_text = plain_text;
    }

    public String getHtml() {
        return html;
    }
    public void setHtml(String html) {
        this.html = html;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
}