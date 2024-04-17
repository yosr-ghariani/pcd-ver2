package PCD.BACKEND.RECRAFTMARKET.model.recModel;

import PCD.BACKEND.RECRAFTMARKET.model.product.Product;
import PCD.BACKEND.RECRAFTMARKET.model.user.UserEntity;
import jakarta.persistence.*;
import lombok.*;


import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "interactions")
public class Interaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @Column(name = "interaction_type", nullable = false)
    private String interactionType; // like, comment, favorite, buy, etc.

    @Column(name = "interaction_date", nullable = false)
    private Date interactionDate;


}
