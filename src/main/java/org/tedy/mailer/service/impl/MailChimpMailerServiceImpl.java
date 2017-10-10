package org.tedy.mailer.service.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.tedy.mailer.RestTemplateFactory;
import org.tedy.mailer.model.List;
import org.tedy.mailer.service.MailerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.tedy.mailer.model.*;

import java.util.Properties;
import java.util.stream.Collectors;

/**
 * Created by tedy on 20/1/17.
 */
@Service
public class MailChimpMailerServiceImpl implements MailerService {

    /*@Autowired
    @Qualifier("mailer")
    private Properties props;*/

    @Autowired
    private RestTemplateFactory restTemplateFactory;


    // Lists
    @Override
    public Lists lists() {
        return restTemplateFactory.getObject().getForObject("lists", Lists.class);
    }

    @Override
    public List listById(String id) {
        return restTemplateFactory.getObject().getForObject("lists/"+id, List.class);
    }

    @Override
    public List listAdd (List list) {
        return restTemplateFactory.getObject().postForObject("lists", new HttpEntity(list), List.class);
    }

    @Override
    public void listDel (String id) {
        restTemplateFactory.getObject().delete("lists/"+id);
    }

    /*@Override
    public void listDelByName (String name) {
        Lists lists = restTemplateFactory.getObject().getForObject("lists", Lists.class);
        java.util.List<List> lists = this.lists.stream().filter(l -> l.getName().equals(name)).collect(Collectors.toList());

        restTemplateFactory.getObject().delete("lists/"+id);
    }*/

    // Members of a List
    @Override
    public Members listMembers(String listId) {
        return restTemplateFactory.getObject().getForObject("lists/"+listId+"/members", Members.class);
    }

    @Override
    public Member listMemberById(String listId, String email) {
        Member member = restTemplateFactory.getObject().getForObject("lists/"+listId +"/members/"+ Member.getSubscriberHash(email), Member.class);
        return member;
    }

    @Override
    public Member listMemberAdd(String listId, String email) {
        return restTemplateFactory.getObject().postForObject("lists/"+listId+"/members", new HttpEntity(new Member(email)), Member.class);
    }

    @Override
    public MembersList listMemberAdd(String listId, java.util.List<String> emails) {
        java.util.List<Member> list = emails.parallelStream().map(e -> new Member(e)).collect(Collectors.toList());
        /*member.putMergeField("FNAME","Tedy");
        member.putMergeField("LNAME","AR");*/
        Members members = new Members();
        members.setMembers(list);
        members.setUpdate_existing(false);
        return restTemplateFactory.getObject().postForObject("lists/"+listId, new HttpEntity(members), MembersList.class);
    }


    @Override
    public Member listMemberDel(String listId, String email) {
        Member member = restTemplateFactory.getObject().getForObject("lists/"+listId +"/members/"+Member.getSubscriberHash(email), Member.class);
        restTemplateFactory.getObject().delete("lists/"+listId +"/members/"+Member.getSubscriberHash(email));
        member.setStatus(MemberStatus.CLEANED);
        return member;
    }

    @Override
    public Campaigns campaigns() {
        return restTemplateFactory.getObject().getForObject("campaigns", Campaigns.class);
    }

    @Override
    public Campaign campaignById(String id) {
        return restTemplateFactory.getObject().getForObject("campaigns/"+id, Campaign.class);
    }


    @Override
    public Campaign campaignAdd(Campaign campaign) {
        return restTemplateFactory.getObject().postForObject("campaigns", new HttpEntity(campaign), Campaign.class);
    }

    @Override
    public CampaignContent campaignContentUpd(String campaignId, CampaignContent content) {
        restTemplateFactory.getObject().put("campaigns/"+campaignId+"/content", new HttpEntity(content));
        return null;
    }

    @Override
    public void sendCampaign(String campaignId) {
        restTemplateFactory.getObject().postForLocation("campaigns/"+campaignId+"/actions/send", null);
    }
}