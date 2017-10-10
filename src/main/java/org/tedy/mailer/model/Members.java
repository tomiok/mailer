package org.tedy.mailer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
 * Created by tedy on 13/1/17.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Members  {
    private List<Member> members;
    private String list_id;
    private int total_items;
    private boolean update_existing;

    public List<Member> getMembers() {
        return members;
    }
    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public String getList_id() {
        return list_id;
    }
    public void setList_id(String list_id) {
        this.list_id = list_id;
    }

    public int getTotal_items() {
        return total_items;
    }
    public void setTotal_items(int total_items) {
        this.total_items = total_items;
    }

    public boolean isUpdate_existing() {
        return update_existing;
    }
    public void setUpdate_existing(boolean update_existing) {
        this.update_existing = update_existing;
    }
}