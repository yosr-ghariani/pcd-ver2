package PCD.BACKEND.RECRAFTMARKET.dto.Chat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter @AllArgsConstructor @NoArgsConstructor

public class chatRoomDTO {
    private Long id;
    private Long senderId;
    private Long recipientId;

}
