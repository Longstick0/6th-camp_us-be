package couch.camping.domain.camp.repository;

import couch.camping.domain.camp.entity.Camp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampRepository extends JpaRepository<Camp, Long>, CampCustomRepository{
}
