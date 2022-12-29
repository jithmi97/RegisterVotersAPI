package com.voter_api_master.voters_initialization.service_interface;
import java.util.Optional;
import com.voter_api_master.voters_initialization.model.VotersModel;
import java.util.List;

public interface VotersInterface {

    public VotersModel saveVoter(VotersModel votersModel);

    public VotersModel updateVoter(VotersModel votersModel);

    public List<VotersModel> findAllVoters();

    public Optional<VotersModel> getVotersData(long id);

    public void deleteVoter(long id);
}