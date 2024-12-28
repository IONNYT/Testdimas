package omada58.ergasia2023.repository;

import omada58.ergasia2023.entities.Doctor;
import omada58.ergasia2023.entities.Family;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
    List<Doctor> findByArea(String area);
    List<Family> findFamiliesByDoctorId(Integer doctorId);
}


