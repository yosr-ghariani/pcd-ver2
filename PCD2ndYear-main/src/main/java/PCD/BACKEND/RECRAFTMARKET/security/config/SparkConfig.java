/*package PCD.BACKEND.RECRAFTMARKET.security.config;

import PCD.BACKEND.RECRAFTMARKET.model.recModel.RecommendationModel;
import org.apache.spark.sql.SparkSession;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SparkConfig {
    @Bean
    public SparkSession sparkSession() {
        return SparkSession.builder()
                .appName("RecommendationService")
                .master("local[*]") // Set the Spark master URL
                .getOrCreate();
    }

    @Bean
    public RecommendationModel recommendationModel(SparkSession sparkSession) {
        String modelPath = "src/main/resources/static/model1.py"; // Set the path to your saved model
        return new RecommendationModel(sparkSession, modelPath);
    }
}*/