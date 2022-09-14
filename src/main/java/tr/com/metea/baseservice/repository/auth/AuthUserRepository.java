package tr.com.metea.baseservice.repository.auth;

import org.springframework.data.jpa.repository.JpaRepository;
import tr.com.metea.baseservice.domain.auth.AuthUser;

/**
 * @author Mete Aydin
 * @date 23.10.2021
 */
public interface AuthUserRepository extends JpaRepository<AuthUser, String> {
    AuthUser findAuthUserByUsername(String username);
}
