package PCD.BACKEND.RECRAFTMARKET.model.file;

import PCD.BACKEND.RECRAFTMARKET.model.product.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Builder
@AllArgsConstructor
@Data
@Entity
@Table(name = "Product_files")
public class FileData {

        @SequenceGenerator(
                name = "file_product_sequence",
                sequenceName = "file_product_sequence",
                allocationSize = 1
        )

        @Id
        @GeneratedValue(
                strategy = GenerationType.SEQUENCE,
                generator = "file_product_sequence"
        )
        @Column(name = "id")
        private long id;
        @Column(name ="name")
        private String name;
        @Column(name ="type")
        private String type;
        @Column(name ="file_path")
        private String filePath;

        @ManyToOne(cascade = CascadeType.REMOVE)
        @JoinColumn(name = "idProduct")
        private Product product;

    }
