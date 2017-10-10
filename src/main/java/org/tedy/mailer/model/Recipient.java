package org.tedy.mailer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Created by tedy on 21/1/17.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Recipient {
    private String list_id;
    private String list_name;
    private String segment_text;
    private int recipient_count;
//    private SegmentOpt segment_opts;


    public Recipient() {}

    public Recipient(String list_id) {
        this.list_id = list_id;
    }

    public String getList_id() {
        return list_id;
    }
    public void setList_id(String list_id) {
        this.list_id = list_id;
    }

    public String getList_name() {
        return list_name;
    }
    public void setList_name(String list_name) {
        this.list_name = list_name;
    }

    public String getSegment_text() {
        return segment_text;
    }
    public void setSegment_text(String segment_text) {
        this.segment_text = segment_text;
    }

    public int getRecipient_count() {
        return recipient_count;
    }
    public void setRecipient_count(int recipient_count) {
        this.recipient_count = recipient_count;
    }
}