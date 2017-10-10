package org.tedy.mailer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;
import java.util.Map;

/**
 * Created by tedy on 23/2/17.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class MembersList {
    private List<Member> new_members;
    private List<Member> updated_members;
    private List<MemberError> errors;
    private int total_created;
    private int total_updated;
    private int error_count;

    public List<Member> getNew_members() {
        return new_members;
    }
    public void setNew_members(List<Member> new_members) {
        this.new_members = new_members;
    }

    public List<Member> getUpdated_members() {
        return updated_members;
    }
    public void setUpdated_members(List<Member> updated_members) {
        this.updated_members = updated_members;
    }

    public List<MemberError> getErrors() {
        return errors;
    }
    public void setErrors(List<MemberError> errors) {
        this.errors = errors;
    }

    public int getTotal_created() {
        return total_created;
    }
    public void setTotal_created(int total_created) {
        this.total_created = total_created;
    }

    public int getTotal_updated() {
        return total_updated;
    }
    public void setTotal_updated(int total_updated) {
        this.total_updated = total_updated;
    }

    public int getError_count() {
        return error_count;
    }
    public void setError_count(int error_count) {
        this.error_count = error_count;
    }
}