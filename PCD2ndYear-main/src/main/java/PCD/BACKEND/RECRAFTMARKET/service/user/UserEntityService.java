package PCD.BACKEND.RECRAFTMARKET.service.user;

import PCD.BACKEND.RECRAFTMARKET.dto.user.UserEntityDTO;
import PCD.BACKEND.RECRAFTMARKET.model.product.Product;
import PCD.BACKEND.RECRAFTMARKET.model.user.UserEntity;

import org.jetbrains.annotations.NotNull;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface UserEntityService {
    //////////////////////all about user /////////////////////////////////////////////////////////////
    public ResponseEntity<Object> fetchUserByUsername(final String username);
    public ResponseEntity<Object> fetchUserEntityById(Long idUserEntity);

    ResponseEntity<Object> fetchAllUserEntity();

    UserEntityDTO mapToDTOItem(UserEntity user);

    List<UserEntityDTO> mapToDTOList(List<UserEntity> users);

    public ResponseEntity<Object> updateUserEntity(Long  idUserEntity,UserEntity userUpdated);
    public List<UserEntityDTO> getAllUserEntity();


    public ResponseEntity<Object> addImageToUser(Long UserId, @NotNull MultipartFile image) throws IOException;
    public ResponseEntity<Object> removeImageFromUser(Long UserId ) throws IOException;
    public  ResponseEntity<byte[]> fetchImageFromUser(final Long UserId) throws IOException;

////////////////////// all about products ///////////////////////////////////////////////////
    public ResponseEntity<Object> addProductToUser(UserDetails userDetails, Long userId, Product product);

    ResponseEntity<Object> addImageToProductUser(UserDetails userDetails,Long userId, Long productId, @NotNull MultipartFile image) throws IOException;

    ResponseEntity<Object> updateProductUser(UserDetails userDetails,Long userId, Long productId, Product productupdated);

    public ResponseEntity<Object> deleteProductFromUser(UserDetails userDetails,Long userId, Long productId)throws IOException;

    public ResponseEntity<Object> getAllProductsOfUser(Long userId);


    UserEntity getUserByUsername(String username);
//////////////////////////////Likes List//////////////////////////////////////////////////
    ResponseEntity<Object> getAllLikesListOfUser(UserDetails userDetails, Long userId)throws IOException;

    ResponseEntity<Object> addProductToLikesListUser(UserDetails userDetails, Long userId, Long productId)throws IOException;

    ResponseEntity<Object> deleteFromLikesListUser(UserDetails userDetails, Long userId, Long productId)throws IOException;


    /////////////////////////////favourite List //////////////////////////////////////////

    ResponseEntity<Object> getAllFavouriteListOfUser(UserDetails userDetails, Long userId)throws IOException;

    ResponseEntity<Object> addProductToFavouriteListUser(UserDetails userDetails, Long userId, Long productId)throws IOException;

    ResponseEntity<Object> deleteFromFavouriteListUser(UserDetails userDetails, Long userId, Long productId)throws IOException;

    UserEntity findById(Long userId);
    /////////////////////////////////////////////////////////////////////////////////////////
}
