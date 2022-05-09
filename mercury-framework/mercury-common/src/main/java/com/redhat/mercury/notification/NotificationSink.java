package com.redhat.mercury.notification;

import com.redhat.mercury.model.state.StateNotification;

public interface NotificationSink<T extends StateNotification> {

    void onReceive(T notification);

}
