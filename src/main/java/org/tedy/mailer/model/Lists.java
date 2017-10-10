package org.tedy.mailer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by tedy on 12/1/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Lists {
    private java.util.List<List> lists;
    private int total_items;

    public java.util.List<List> getLists() {
        return lists;
    }
    public void setLists(java.util.List<List> list) {
        this.lists = list;
    }

    public int getTotal_items() {
        return total_items;
    }
    public void setTotal_items(int total_items) {
        this.total_items = total_items;
    }
}