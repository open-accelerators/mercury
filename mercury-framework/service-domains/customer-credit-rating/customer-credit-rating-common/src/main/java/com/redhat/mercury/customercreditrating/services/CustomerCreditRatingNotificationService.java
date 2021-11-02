package com.redhat.mercury.customercreditrating.services;

import org.bian.protobuf.customercreditrating.RatingEvent;

import com.google.protobuf.Message;

import io.smallrye.mutiny.Uni;

public abstract class CustomerCreditRatingNotificationService {

    public Uni<Message> onCreditRatingStateEvent(RatingEvent event) {
        return noOpReply();
    }

    private Uni<Message> noOpReply() {
        return Uni.createFrom()
                .nullItem();
    }
    //TODO: Implement other events
}
