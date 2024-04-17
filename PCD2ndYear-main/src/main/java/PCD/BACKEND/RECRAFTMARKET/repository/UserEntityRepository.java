package PCD.BACKEND.RECRAFTMARKET.repository;


import PCD.BACKEND.RECRAFTMARKET.model.user.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserEntityRepository extends JpaRepository<UserEntity, Long> {



    @Query(value = "SELECT U FROM UserEntity  U WHERE U.username = :username")
    Optional<UserEntity> fetchUserWithUsername(@Param("username") final String username);

    @Query(value = "SELECT EXISTS(SELECT U FROM UserEntity U WHERE  U.username = :username) AS RESULT")
    Boolean isUsernameRegistered(@Param("username")String username);

    @Query(value = "SELECT U FROM UserEntity U WHERE U.id = :id")
    Optional<UserEntity> fetchUserById(@Param("id") final Long id);


}
