package PCD.BACKEND.RECRAFTMARKET.controller.RecModel;
import PCD.BACKEND.RECRAFTMARKET.dto.RecModel.InteractionDTO;
import PCD.BACKEND.RECRAFTMARKET.model.product.Product;
import PCD.BACKEND.RECRAFTMARKET.model.recModel.Interaction;
import PCD.BACKEND.RECRAFTMARKET.model.user.UserEntity;
import PCD.BACKEND.RECRAFTMARKET.repository.InteractionRepository;
import PCD.BACKEND.RECRAFTMARKET.service.product.ProductService;
import PCD.BACKEND.RECRAFTMARKET.service.recModel.InteractionService;
import PCD.BACKEND.RECRAFTMARKET.service.user.UserEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/interaction")
public class InteractionController {
    @Autowired
    private InteractionService interactionService;
    @Autowired
    private UserEntityService userEntityService;
    @Autowired
    private ProductService productService;
    @Autowired
    private InteractionRepository interactionRepository;

    @PostMapping("/calculateInteractionScore")
    public double calculateInteractionScore(@RequestBody InteractionDTO interactionDTO) {
        UserEntity user = userEntityService.findById(interactionDTO.getUserId());
        Product product = productService.getProductById(interactionDTO.getProductId());
        List<Interaction> interactions = interactionRepository.findByUserAndProduct(user, product);
        return interactionService.calculateInteractionScore(user, product, interactions);
    }
}

