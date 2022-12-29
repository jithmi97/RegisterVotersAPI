package com.voter_api_master.voters_initialization.controller;
import java.util.Optional;
import com.voter_api_master.voters_initialization.model.VotersModel;
import com.voter_api_master.voters_initialization.service_implementation.VotersImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@CrossOrigin("*")
public class VotersController {

    @Autowired
    private VotersImplementation VotersImplementation;

    @PostMapping(value = "saveVoter")
    public VotersModel saveVoter(@RequestBody VotersModel VotersModel){
        System.out.println("Voter is registered successfully");
        VotersImplementation.saveVoter((VotersModel));
        return VotersModel;
    }

    @GetMapping(value = "getAllVoters")
    public List<VotersModel> findAllVoters(){
        return  VotersImplementation.findAllVoters();
    }

    @GetMapping(value = "getVotersData/{id}")
    public VotersModel getSatelliteData(@PathVariable ("id") Long id){
        Optional<VotersModel> dataRow = VotersImplementation.getVotersData(id);
        if(dataRow.isPresent()){
            return dataRow.get();
        }
        return null;
    }

    @PutMapping("updateVoter")
    public VotersModel updateVoter(@RequestBody VotersModel votersModel){
        return VotersImplementation.updateVoter(votersModel);
    }

    @DeleteMapping("deleteVoter")
    public String deleteVoter(@RequestParam long id){
        VotersImplementation.deleteVoter(id);
        return "Voter deleted!";
    }

}

