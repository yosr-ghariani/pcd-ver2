package PCD.BACKEND.RECRAFTMARKET.controller.RecModel;

/*import PCD.BACKEND.RECRAFTMARKET.model.recModel.RecommendationModel;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recommendations")
public class RecommendationController {

    private final RecommendationModel recommendationModel;

    @Autowired
    public RecommendationController(RecommendationModel recommendationModel) {
        this.recommendationModel = recommendationModel;
    }

    @GetMapping("/{userId}")
    public Dataset<Row> recommendProducts(@PathVariable Long userId) {
        int numRecommendations = 10; // Set the number of recommendations
        return recommendationModel.recommendProductsForUser(userId, numRecommendations);
    }
}*/