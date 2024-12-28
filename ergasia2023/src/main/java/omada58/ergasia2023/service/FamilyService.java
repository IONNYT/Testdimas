package omada58.ergasia2023.service;

import omada58.ergasia2023.entities.Doctor;
import omada58.ergasia2023.entities.Family;
import omada58.ergasia2023.repository.FamilyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FamilyService {

    private final FamilyRepository familyRepository;

    @Autowired
    public FamilyService(FamilyRepository familyRepository) {
        this.familyRepository = familyRepository;
    }

    public List<Family> getAllFamilies() {
        return (List<Family>) familyRepository.findAll();
    }

    public Optional<Family> getFamilyById(Integer id) { return familyRepository.findById(id); }

    public void saveFamily(Family family) {
        familyRepository.save(family);
    }

    public void deleteFamily(Integer id) {
        familyRepository.deleteById(id);
    }
}
