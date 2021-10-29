package ${package}.${sdNameLowerCase}.services;

import io.smallrye.mutiny.Uni;

import com.google.protobuf.Message;

public abstract class ${sdName}NotificationService {

    private Uni<Message> noOpReply() {
        return Uni.createFrom()
                .nullItem();
    }

    //TODO: Implement events
}
