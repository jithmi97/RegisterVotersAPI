package com.voter_api_master.voters_initialization.service_implementation;
import java.util.Optional;
import com.voter_api_master.voters_initialization.model.VotersModel;
import com.voter_api_master.voters_initialization.repository.VotersRepository;
import com.voter_api_master.voters_initialization.service_interface.VotersInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VotersImplementation implements VotersInterface {

    @Autowired
    private VotersRepository votersRepository;
    @Override
    public VotersModel saveVoter(VotersModel votersModel) {
        return votersRepository.save(votersModel);
    }

    @Override
    public VotersModel updateVoter(VotersModel votersModel) {
        VotersModel existingVotersModel = votersRepository.findById(votersModel.getVoters_NIC()).orElse(null);
        existingVotersModel.setVotersName(votersModel.getVotersName());
        existingVotersModel.setDateOfBirth(votersModel.getDateOfBirth());
        existingVotersModel.setAddress(votersModel.getAddress());
        existingVotersModel.setCity(votersModel.getCity());
        existingVotersModel.setState(votersModel.getState());
        existingVotersModel.setRegisterDate(votersModel.getRegisterDate());
        return votersRepository.save(existingVotersModel);
    }

    @Override
    public List<VotersModel> findAllVoters() {
        return (List<VotersModel>) votersRepository.findAll();
    }

    @Override
    public Optional<VotersModel> getVotersData(long id) {
        return (Optional<VotersModel>) votersRepository.findById(id);
    }

    @Override
    public void deleteVoter(long id) {
        votersRepository.deleteById(id);

    }
}
