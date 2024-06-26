package PCD.BACKEND.RECRAFTMARKET.security.utility;


import PCD.BACKEND.RECRAFTMARKET.exceptions.ResourceNotFoundException;
import PCD.BACKEND.RECRAFTMARKET.repository.UserEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService  implements UserDetailsService {


    private final UserEntityRepository userEntityRepository;

    @Autowired
    public CustomUserDetailsService(UserEntityRepository userEntityRepository)
    {
        this.userEntityRepository = userEntityRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return  userEntityRepository.fetchUserWithUsername(username)
                .orElseThrow(()-> new ResourceNotFoundException("The username address provided could not be found in our system."));
    }
}
