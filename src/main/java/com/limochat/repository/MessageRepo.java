package com.limochat.repository;

import com.limochat.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface MessageRepo extends JpaRepository<Message, Long>{

    List<Message> findBySenderIdAndReceiverIdOrderByCreatedAtAsc(
            Long senderId,
            Long receiverId
    );

}
