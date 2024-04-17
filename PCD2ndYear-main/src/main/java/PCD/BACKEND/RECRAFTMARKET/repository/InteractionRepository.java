package PCD.BACKEND.RECRAFTMARKET.repository;


import PCD.BACKEND.RECRAFTMARKET.model.product.Product;
import PCD.BACKEND.RECRAFTMARKET.model.recModel.Interaction;
import PCD.BACKEND.RECRAFTMARKET.model.user.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InteractionRepository extends JpaRepository<Interaction, Integer> {
    List<Interaction> findByUserAndProduct(UserEntity user, Product product);
}
