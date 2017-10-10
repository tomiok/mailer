package org.tedy.mailer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by tedy on 22/1/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Campaigns {
    private java.util.List<Campaign> campaigns;
    private int total_items;

    public java.util.List<Campaign> getCampaigns() {
        return campaigns;
    }
    public void setCampaigns(List<Campaign> campaigns) {
        this.campaigns = campaigns;
    }

    public int getTotal_items() {
        return total_items;
    }
    public void setTotal_items(int total_items) {
        this.total_items = total_items;
    }
}
