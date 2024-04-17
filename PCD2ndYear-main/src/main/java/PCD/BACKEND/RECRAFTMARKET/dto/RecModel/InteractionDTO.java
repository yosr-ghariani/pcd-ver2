package PCD.BACKEND.RECRAFTMARKET.dto.RecModel;


import PCD.BACKEND.RECRAFTMARKET.model.recModel.Interaction;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class InteractionDTO {
    private Long userId;
    private Long productId;
    private List<Interaction> interactions;
}
