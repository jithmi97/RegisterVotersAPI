package com.voter_api_master.voters_initialization.repository;


import com.voter_api_master.voters_initialization.model.VotersModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VotersRepository extends CrudRepository<VotersModel,Long> {
}