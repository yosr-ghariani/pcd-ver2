package PCD.BACKEND.RECRAFTMARKET.service.chatRoom;

import PCD.BACKEND.RECRAFTMARKET.dto.Chat.chatRoomDTO;
import PCD.BACKEND.RECRAFTMARKET.model.chatRoom.chatRoom;
import PCD.BACKEND.RECRAFTMARKET.model.user.UserEntity;

import java.util.List;

public interface chatRoomService {
    chatRoom save(chatRoom chatRoom);
    chatRoom findBySenderAndRecipient(UserEntity sender, UserEntity recipient);
    List<chatRoom> findChatRoomsByUserId(Long userId);
    chatRoomDTO getChatRoomById(Long roomId);

}
