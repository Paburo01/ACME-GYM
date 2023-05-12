
package repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import domain.GYM;

@Repository
public interface GYMRepository extends JpaRepository<GYM, Integer> {

	List<GYM> findByActive(boolean active);
}
