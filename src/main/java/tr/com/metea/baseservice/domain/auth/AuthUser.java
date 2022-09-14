package tr.com.metea.baseservice.domain.auth;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import tr.com.metea.baseservice.util.IdGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

/**
 * @author Mete Aydin
 * @date 23.10.2021
 */
@RequiredArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "auth_user")
public class AuthUser {
    @Id
    @Column(name = "ID", nullable = false, length = 36)
    private String id;
    @Column(name = "ORG_ID", nullable = false, length = 36)
    private String orgId;
    @Column(name = "username", length = 100, unique = true)
    private String username;
    @Column(name = "password", length = 200)
    private String password;
    @Column(name = "email", length = 100, unique = true)
    private String email;
    @Column(name = "auth_type")
    @Enumerated(EnumType.STRING)
    private AuthType type;

    public enum AuthType {
        USER,
        ADMIN
    }

    @PrePersist
    public void onPrePersist() {
        setId(IdGenerator.getUUID());
    }

}
