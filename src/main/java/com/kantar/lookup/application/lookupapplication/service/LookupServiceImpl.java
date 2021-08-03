package com.kantar.lookup.application.lookupapplication.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kantar.lookup.application.lookupapplication.model.Lookup;
import com.kantar.lookup.application.lookupapplication.repository.PanelistManagermentRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class LookupServiceImpl implements LookupService{
	
	private static final Logger LOGGER=LoggerFactory.getLogger(LookupServiceImpl.class);

	@Autowired
    private PanelistManagermentRepository lookupRepository;

    public List<Lookup> fetchLooUpData(int id) {
    	
    	//List<LookUp> lookUpList = lookupRepository.findAll();
    	
        List<Lookup> lookUpList = new ArrayList<>();
        
        LOGGER.debug("service method");

        Lookup lookUp = new Lookup();
        lookUp.setPanelistId(121);
        lookUp.setHouseholdId(121);
        lookUp.setUserName("stan_lie");
        lookUp.setOptinStatus("Opt-In");
        lookUp.setPanelistStatus(true);
        lookUp.setRole("Panelist");
        lookUp.setRole("USER");
        lookUp.setLocal("EN_AU English");
        lookUp.setCurrentOwner("Dev");
        lookUp.setRecruitedBy("Root");


        lookUpList.add(lookUp);
       
        
        return lookUpList;
    }

}
