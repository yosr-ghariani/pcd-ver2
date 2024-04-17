package PCD.BACKEND.RECRAFTMARKET.service.recModel;

import PCD.BACKEND.RECRAFTMARKET.model.product.Product;
import PCD.BACKEND.RECRAFTMARKET.model.recModel.Interaction;
import PCD.BACKEND.RECRAFTMARKET.model.user.UserEntity;
import PCD.BACKEND.RECRAFTMARKET.repository.InteractionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InteractionServiceImpl implements InteractionService{

    private final InteractionRepository interactionRepository;

    @Autowired
    public InteractionServiceImpl(InteractionRepository interactionRepository) {
        this.interactionRepository = interactionRepository;
    }

    @Override
    public List<Interaction> findByUserAndProduct(UserEntity user, Product product) {
        return interactionRepository.findByUserAndProduct(user, product);
    }
    public double calculateInteractionScore(UserEntity user, Product product, List<Interaction> interactions) {
        double interactionScore = 0.0;

        for (Interaction interaction : interactions) {
            if (interaction.getUser().equals(user) && interaction.getProduct().equals(product)) {
                if (interaction.getInteractionType().equals("like")) {
                    interactionScore += 0.4;
                } else if (interaction.getInteractionType().equals("comment")) {
                    interactionScore += 0.1;
                } else if (interaction.getInteractionType().equals("wishlist")) {
                    interactionScore += 0.2;
                } else if (interaction.getInteractionType().equals("buy")) {
                    interactionScore += 0.3;
                }
            }
        }

        return interactionScore;
    }
}
