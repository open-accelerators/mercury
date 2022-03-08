package com.redhat.mercury.customercreditrating.services;

import com.google.protobuf.Message;
import com.redhat.mercury.model.StateChangeNotification;

import io.smallrye.mutiny.Uni;

public interface CustomerCreditRatingNotificationService {

    default Uni<Message> onCreditRatingStateEvent(StateChangeNotification notification) {
        return noOpReply();
    }

    private Uni<Message> noOpReply() {
        return Uni.createFrom()
                .nullItem();
    }
    //TODO: Implement other events
}
