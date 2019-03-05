package htmlconnect.demo.repository;

import htmlconnect.demo.module.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Myrepository extends JpaRepository<Worker,Long> {
}
