package org.tedy.mailer.model;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Created by tadeo on 1/19/17.
 */
public enum MemberStatus {
    SUBSCRIBED,
    UNSUBSCRIBED,
    CLEANED,
    PENDING,
    TRANSACTIONAL;

    @JsonValue
    public String toJson() {
        return name().toLowerCase();
    }
}
