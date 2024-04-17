package PCD.BACKEND.RECRAFTMARKET.controller.chat;

import PCD.BACKEND.RECRAFTMARKET.dto.Chat.chatRoomDTO;
import PCD.BACKEND.RECRAFTMARKET.model.chatRoom.chatRoom;
import PCD.BACKEND.RECRAFTMARKET.service.chatRoom.chatRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/chatrooms")
public class chatRoomController {
    @Autowired
    private chatRoomService chatRoomService;

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<chatRoom>> getChatRoomsByUserId(@PathVariable Long userId) {
        List<chatRoom> chatRooms = chatRoomService.findChatRoomsByUserId(userId);
        return ResponseEntity.ok(chatRooms);
    }

    @GetMapping("/{roomId}")
    public ResponseEntity<chatRoomDTO> getChatRoomById(@PathVariable Long roomId) {
        chatRoomDTO chatRoom = chatRoomService.getChatRoomById(roomId);
        if (chatRoom != null) {
            return ResponseEntity.ok(chatRoom);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
