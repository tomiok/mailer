package org.tedy.mailer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Created by tedy on 21/1/17.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Setting {
    /**
     * The subject line for the campaign.
     */
    private String subject_line;
    /**
     * The title of the campaign.
     */
    private String title;
    /**
     * The ‘from’ name on the campaign (not an email address).
     */
    private String from_name;
    private String reply_to;
    private boolean use_conversation = false;
    /**
     * The campaign’s custom ‘To’ name. Typically the first name merge field.
     */
    private String to_name;
    private String folder_id;
    private boolean authenticate = false;
    private boolean auto_footer = false;
    private boolean inline_css = true;
    private boolean auto_tweet = false;
//    private boolean auto_fb_post = false;
    private boolean fb_comments;
    private boolean timewarp = false;
    private int template_id;
    private boolean drag_and_drop = false;

    public Setting() {}

    public Setting(String title) {
        this.title = title;
    }

    public String getSubject_line() {
        return subject_line;
    }
    public void setSubject_line(String subject_line) {
        this.subject_line = subject_line;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getFrom_name() {
        return from_name;
    }
    public void setFrom_name(String from_name) {
        this.from_name = from_name;
    }

    public String getReply_to() {
        return reply_to;
    }
    public void setReply_to(String reply_to) {
        this.reply_to = reply_to;
    }

    public boolean isUse_conversation() {
        return use_conversation;
    }
    public void setUse_conversation(boolean use_conversation) {
        this.use_conversation = use_conversation;
    }

    public String getTo_name() {
        return to_name;
    }
    public void setTo_name(String to_name) {
        this.to_name = to_name;
    }

    public String getFolder_id() {
        return folder_id;
    }
    public void setFolder_id(String folder_id) {
        this.folder_id = folder_id;
    }

    public boolean isAuthenticate() {
        return authenticate;
    }
    public void setAuthenticate(boolean authenticate) {
        this.authenticate = authenticate;
    }

    public boolean isAuto_footer() {
        return auto_footer;
    }
    public void setAuto_footer(boolean auto_footer) {
        this.auto_footer = auto_footer;
    }

    public boolean isInline_css() {
        return inline_css;
    }
    public void setInline_css(boolean inline_css) {
        this.inline_css = inline_css;
    }

    public boolean isAuto_tweet() {
        return auto_tweet;
    }
    public void setAuto_tweet(boolean auto_tweet) {
        this.auto_tweet = auto_tweet;
    }

    public boolean isFb_comments() {
        return fb_comments;
    }
    public void setFb_comments(boolean fb_comments) {
        this.fb_comments = fb_comments;
    }

    public boolean isTimewarp() {
        return timewarp;
    }
    public void setTimewarp(boolean timewarp) {
        this.timewarp = timewarp;
    }

    public int getTemplate_id() {
        return template_id;
    }
    public void setTemplate_id(int template_id) {
        this.template_id = template_id;
    }

    public boolean isDrag_and_drop() {
        return drag_and_drop;
    }
    public void setDrag_and_drop(boolean drag_and_drop) {
        this.drag_and_drop = drag_and_drop;
    }
}