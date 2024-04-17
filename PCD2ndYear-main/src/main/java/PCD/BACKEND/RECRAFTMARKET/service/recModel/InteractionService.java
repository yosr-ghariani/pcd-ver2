package PCD.BACKEND.RECRAFTMARKET.service.recModel;

import PCD.BACKEND.RECRAFTMARKET.model.product.Product;
import PCD.BACKEND.RECRAFTMARKET.model.recModel.Interaction;
import PCD.BACKEND.RECRAFTMARKET.model.user.UserEntity;

import java.util.List;

public interface InteractionService {
    List<Interaction> findByUserAndProduct(UserEntity user, Product product);
    public double calculateInteractionScore(UserEntity user, Product product, List<Interaction> interactions) ;
}
