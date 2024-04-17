package PCD.BACKEND.RECRAFTMARKET.dto.Chat;

import PCD.BACKEND.RECRAFTMARKET.model.chatRoom.MessageStatus;
import lombok.*;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ChatMessageDTO {
    private Long id;
    private String content;
    private MessageStatus status;
    private Long senderId;
    private Long recipientId;
    private LocalDateTime createdAt;

}