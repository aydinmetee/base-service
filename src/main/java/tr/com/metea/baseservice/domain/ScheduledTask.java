package tr.com.metea.baseservice.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Mete Aydin
 * <p>
 * 19.08.2022
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString
@Entity
@Table(name = "scheduled_task")
public class ScheduledTask extends BaseEntity{
    @Column(name = "code",unique = true, nullable = false)
    private String code;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "cron_exp", nullable = false)
    private String cronExp;
    @Column(name = "description", nullable = false)
    private String description;
}
