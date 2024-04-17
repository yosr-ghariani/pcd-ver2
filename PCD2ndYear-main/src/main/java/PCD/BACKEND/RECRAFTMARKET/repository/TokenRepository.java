package PCD.BACKEND.RECRAFTMARKET.repository;


import PCD.BACKEND.RECRAFTMARKET.model.token.Token;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface TokenRepository extends JpaRepository<Token , Integer> {

    @Query(value = "select t from Token t inner join UserEntity u on t.userEntity.id = u.id where u.id = :userId and (t.expired = false or t.revoked = false)")
    List<Token> fetchAllValidTokenByUserId(@Param("userId") Long userId);

    @Query(value = "select t from Token t where t.token = :token")
    Optional<Token> findByToken(String token);

    @Query(value = "SELECT CASE WHEN COUNT(t) > 0 THEN TRUE ELSE FALSE END FROM Token t WHERE t.token = :token AND t.expired = false AND t.revoked = false")
    boolean isTokenValidAndExist(@Param("token") final String token);

}
