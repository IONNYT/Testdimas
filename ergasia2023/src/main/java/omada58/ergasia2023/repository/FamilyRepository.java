package omada58.ergasia2023.repository;

import omada58.ergasia2023.entities.Family;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FamilyRepository extends JpaRepository<Family, Integer> {
}
