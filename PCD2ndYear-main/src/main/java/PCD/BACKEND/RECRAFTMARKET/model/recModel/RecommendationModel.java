/*package PCD.BACKEND.RECRAFTMARKET.model.recModel;

import org.apache.spark.ml.recommendation.ALS;
import org.apache.spark.ml.recommendation.ALSModel;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RecommendationModel {
    private final SparkSession sparkSession;
    private final ALSModel model;

    public RecommendationModel(SparkSession sparkSession, String modelPath) {
        this.sparkSession = sparkSession;
        this.model = loadModel(modelPath);
    }

    private ALSModel loadModel(String modelPath) {
        return ALSModel.load(modelPath);
    }

   /* public Dataset<Row> recommendProductsForUser(Long userId, int numRecommendations) {
        Dataset<Row> userRecs = model.recommendForUserSubset(sparkSession.createDataset(Collections.singletonList(userId)), numRecommendations);
        return userRecs.select("recommendations");
    }
    public Dataset<Row> recommendProductsForUser(Long userId, int numRecommendations) {
        // Create a DataFrame with a single column containing the user ID
        List<Long> userIds = Arrays.asList(userId);
        Dataset<Row> userData = sparkSession.createDataFrame(userIds, Integer.class)
                .toDF("userId");

        // Use the DataFrame to recommend products for the user
        Dataset<Row> userRecs = model.recommendForUserSubset(userData, numRecommendations);

        // Select the recommendations column
        return userRecs.select("recommendations");
    }
}*/