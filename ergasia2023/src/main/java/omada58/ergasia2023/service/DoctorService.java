package omada58.ergasia2023.service;

import omada58.ergasia2023.entities.Doctor;
import omada58.ergasia2023.entities.Family;
import omada58.ergasia2023.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {

    private final DoctorRepository doctorRepository;

    @Autowired
    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public List<Doctor> getAllDoctors() {
        return (List<Doctor>) doctorRepository.findAll();
    }

    public Optional<Doctor> getDoctorById(Integer id) { return doctorRepository.findById(id); }

    public void saveDoctor(Doctor doctor) {
        doctorRepository.save(doctor);
    }

    public void deleteDoctor(Integer id) {
        doctorRepository.deleteById(id);
    }

    public List<Doctor> getDoctorsInArea(String area) { return doctorRepository.findByArea(area); }

    public List<Family> getFamiliesByDoctorId(Integer doctorId) { return doctorRepository.findFamiliesByDoctorId(doctorId); }

}
