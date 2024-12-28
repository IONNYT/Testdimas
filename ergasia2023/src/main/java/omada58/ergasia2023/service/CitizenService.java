package omada58.ergasia2023.service;

import omada58.ergasia2023.entities.Citizen;
import omada58.ergasia2023.repository.CitizenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CitizenService {

    private CitizenRepository citizenRepository;

    @Autowired
    public CitizenService(CitizenRepository citizenRepository) { this.citizenRepository = citizenRepository; }

    public List<Citizen> getAllCitizens() { return citizenRepository.findAll(); }

    public Optional<Citizen> getCitizenById(Integer id) {
        return citizenRepository.findById(id);
    }

    public void saveCitizen(Citizen citizen) { citizenRepository.save(citizen); }

    public void deleteCitizenById(Integer id) {
        citizenRepository.deleteById(id);
    }

}
