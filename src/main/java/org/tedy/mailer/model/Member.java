package org.tedy.mailer.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.apache.commons.codec.binary.Hex;

import java.security.MessageDigest;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by tedy on 12/1/17.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Member {
    public static enum EmailType {
        html, text
    }

    /**
     * The MD5 hash of the lowercase version of the list member’s email address.
     */
    private String id;
    /**
     * Email address for a subscriber.
     */
    private String email_address;
    private String unique_email_id;
    private EmailType email_type;
    private MemberStatus status;
    private MemberStatus status_if_new;
    private Map<String, String> merge_fields = new HashMap<>();
    private Map<String, String> interests;
    private Stats stats;
    private String ip_signup;
    private Date timestamp_signup;
    private String ip_opt;
    private String timestamp_opt;
    private int member_rating;
    private String last_changed;
    private String language;
    private boolean vip;
    private String email_client;
    private Location location;
    private Note last_note;
    private String list_id;


    public Member() {
        this.interests = new HashMap<>();
    }
    public Member(String email_address) {
        this.email_address = email_address;
        this.status = MemberStatus.SUBSCRIBED;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getEmail_address() {
        return email_address;
    }
    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public String getUnique_email_id() {
        return unique_email_id;
    }
    public void setUnique_email_id(String unique_email_id) {
        this.unique_email_id = unique_email_id;
    }

    public EmailType getEmail_type() {
        return email_type;
    }
    public void setEmail_type(EmailType email_type) {
        this.email_type = email_type;
    }

    public MemberStatus getStatus() {
        return status;
    }
    public void setStatus(MemberStatus status) {
        this.status = status;
    }

    public MemberStatus getStatus_if_new() {
        return status_if_new;
    }
    public void setStatus_if_new(MemberStatus status_if_new) {
        this.status_if_new = status_if_new;
    }

    public Map<String, String> getMerge_fields() {
        return merge_fields;
    }
    public void setMerge_fields(Map<String, String> merge_fields) {
        this.merge_fields = merge_fields;
    }

    public Stats getStats() {
        return stats;
    }
    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public Map<String, String> getInterests() {
        return interests;
    }
    public void setInterests(Map<String, String> interests) {
        this.interests = interests;
    }

    public String getIp_signup() {
        return ip_signup;
    }
    public void setIp_signup(String ip_signup) {
        this.ip_signup = ip_signup;
    }

    public Date getTimestamp_signup() {
        return timestamp_signup;
    }
    public void setTimestamp_signup(Date timestamp_signup) {
        this.timestamp_signup = timestamp_signup;
    }

    public String getIp_opt() {
        return ip_opt;
    }
    public void setIp_opt(String ip_opt) {
        this.ip_opt = ip_opt;
    }

    public String getTimestamp_opt() {
        return timestamp_opt;
    }
    public void setTimestamp_opt(String timestamp_opt) {
        this.timestamp_opt = timestamp_opt;
    }

    public int getMember_rating() {
        return member_rating;
    }
    public void setMember_rating(int member_rating) {
        this.member_rating = member_rating;
    }

    public String getLast_changed() {
        return last_changed;
    }
    public void setLast_changed(String last_changed) {
        this.last_changed = last_changed;
    }

    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }

    public boolean isVip() {
        return vip;
    }
    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public String getEmail_client() {
        return email_client;
    }
    public void setEmail_client(String email_client) {
        this.email_client = email_client;
    }

    public Location getLocation() {
        return location;
    }
    public void setLocation(Location location) {
        this.location = location;
    }

    public Note getLast_note() {
        return last_note;
    }
    public void setLast_note(Note last_note) {
        this.last_note = last_note;
    }

    public String getList_id() {
        return list_id;
    }
    public void setList_id(String list_id) {
        this.list_id = list_id;
    }

    public boolean hasMergeField(String name) {
        return this.merge_fields.containsKey(name);
    }
    public String getMergeField(String name) {
        return this.merge_fields.get(name);
    }
    public void putMergeField(String name, String value) {
        this.merge_fields.put(name, value);
    }

    @JsonIgnore
    public String getSubscriberHash() {
        return getSubscriberHash(this.email_address);
    }

    @JsonIgnore
    public static String getSubscriberHash(String email) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            return Hex.encodeHexString(md.digest(email.toLowerCase().getBytes("UTF-8")));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}