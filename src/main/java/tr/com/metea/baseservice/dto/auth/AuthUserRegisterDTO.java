package tr.com.metea.baseservice.dto.auth;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import tr.com.metea.baseservice.domain.auth.AuthUser;

/**
 * @author Mete Aydin
 * @date 23.10.2021
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class AuthUserRegisterDTO extends AuthUserLoginDTO {
    private AuthUser.AuthType type;
    private String orgId;
}
