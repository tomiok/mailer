package org.tedy.mailer.service;

import org.tedy.mailer.model.*;
import org.tedy.mailer.model.List;

/**
 * Created by tedy on 20/1/17.
 */
public interface MailerService {

    Lists lists();
    List listById(String id);
    List listAdd (List list);
    void listDel(String id);
//    void listDelByName (String name);


    Members listMembers(String listId);
    Member listMemberById(String listId, String email);
    Member listMemberAdd(String listId, String email);
    MembersList listMemberAdd(String listId, java.util.List<String> emails);
    Member listMemberDel(String listId, String email);


    Campaigns campaigns();
    Campaign campaignById(String id);
    Campaign campaignAdd(Campaign campaign);
    CampaignContent campaignContentUpd(String campaignId, CampaignContent content);
    void sendCampaign(String campaignId);
}