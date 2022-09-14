package tr.com.metea.baseservice.repository;

import org.springframework.data.jpa.repository.Query;
import tr.com.metea.baseservice.domain.ScheduledTask;
import tr.com.metea.baseservice.repository.BaseRepository;

import java.util.List;

/**
 * @author Mete Aydin
 * <p>
 * 19.08.2022
 */
public interface ScheduledTaskRepository extends BaseRepository<ScheduledTask> {
    @Query("SELECT s FROM ScheduledTask s WHERE s.valid = true")
    List<ScheduledTask> findAllValidScheduledTasks();
}
