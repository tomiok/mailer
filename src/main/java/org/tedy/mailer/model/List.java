package org.tedy.mailer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Created by tedy on 11/1/17.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class List {
    private String id;
    private String name;
    private Contact contact;
    private String permission_reminder;
    private boolean use_archive_bar;
    private CampaignDefaults campaign_defaults;
    private String notify_on_subscribe;
    private String notify_on_unsubscribe;
    private String date_created;
    private int list_rating;
    private boolean email_type_option;
    private String subscribe_url_short;
    private String subscribe_url_long;
    private String beamer_address;
    private String visibility;
    private java.util.List<String> modules;
    private Stats stats;

    public List() {}

    public List(String name) {
        this.name = name;
        this.contact = new Contact();
        this.permission_reminder = "";
        this.campaign_defaults = new CampaignDefaults();
        this.email_type_option = false;
    }

    /**
     * Constructor with required Params
     * @param name
     * @param contact
     * @param permission_reminder
     * @param campaign_defaults
     * @param email_type_option
     */
    public List(String name, Contact contact, String permission_reminder, CampaignDefaults campaign_defaults, boolean email_type_option) {
        this.name = name;
        this.contact = contact;
        this.permission_reminder = permission_reminder;
        this.campaign_defaults = campaign_defaults;
        this.email_type_option = email_type_option;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public String getPermission_reminder() {
        return permission_reminder;
    }

    public void setPermission_reminder(String permission_reminder) {
        this.permission_reminder = permission_reminder;
    }

    public boolean isUse_archive_bar() {
        return use_archive_bar;
    }

    public void setUse_archive_bar(boolean use_archive_bar) {
        this.use_archive_bar = use_archive_bar;
    }

    public CampaignDefaults getCampaign_defaults() {
        return campaign_defaults;
    }

    public void setCampaign_defaults(CampaignDefaults campaign_defaults) {
        this.campaign_defaults = campaign_defaults;
    }

    public String getNotify_on_subscribe() {
        return notify_on_subscribe;
    }

    public void setNotify_on_subscribe(String notify_on_subscribe) {
        this.notify_on_subscribe = notify_on_subscribe;
    }

    public String getNotify_on_unsubscribe() {
        return notify_on_unsubscribe;
    }

    public void setNotify_on_unsubscribe(String notify_on_unsubscribe) {
        this.notify_on_unsubscribe = notify_on_unsubscribe;
    }

    public String getDate_created() {
        return date_created;
    }

    public void setDate_created(String date_created) {
        this.date_created = date_created;
    }

    public int getList_rating() {
        return list_rating;
    }

    public void setList_rating(int list_rating) {
        this.list_rating = list_rating;
    }

    public boolean isEmail_type_option() {
        return email_type_option;
    }

    public void setEmail_type_option(boolean email_type_option) {
        this.email_type_option = email_type_option;
    }

    public String getSubscribe_url_short() {
        return subscribe_url_short;
    }

    public void setSubscribe_url_short(String subscribe_url_short) {
        this.subscribe_url_short = subscribe_url_short;
    }

    public String getSubscribe_url_long() {
        return subscribe_url_long;
    }

    public void setSubscribe_url_long(String subscribe_url_long) {
        this.subscribe_url_long = subscribe_url_long;
    }

    public String getBeamer_address() {
        return beamer_address;
    }

    public void setBeamer_address(String beamer_address) {
        this.beamer_address = beamer_address;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public java.util.List<String> getModules() {
        return modules;
    }

    public void setModules(java.util.List<String> modules) {
        this.modules = modules;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }
}