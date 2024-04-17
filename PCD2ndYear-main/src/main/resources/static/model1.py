from pyspark.sql import SparkSession
from pyspark.ml.recommendation import ALS
from pyspark.ml.evaluation import RegressionEvaluator
import org.apache.spark.ml.recommendation.ALS
# Initialize Spark session
spark = SparkSession.builder \
    .appName("RecommendationSystem") \
    .getOrCreate()

# Load data from MySQL database
jdbc_url = "jdbc:mysql://localhost:3306/backend"
table_name = "backend"
properties = {"user": "root", "password": "14278342"}
df = spark.read.jdbc(url=jdbc_url, table=table_name, properties=properties)

# Perform preprocessing (if needed)
# For example, convert categorical variables to numerical format

# Split data into training and testing datasets
(training_data, test_data) = df.randomSplit([0.8, 0.2])

# Train ALS model
als = ALS(maxIter=5, regParam=0.01, userCol="userId", itemCol="idProduct", ratingCol="interactionScore")
model = als.fit(training_data)

# Generate predictions
predictions = model.transform(test_data)

# Evaluate model
evaluator = RegressionEvaluator(metricName="rmse", labelCol="rating", predictionCol="prediction")
rmse = evaluator.evaluate(predictions)
print("Root Mean Squared Error (RMSE):", rmse)

# Stop Spark session
#spark.stop()
