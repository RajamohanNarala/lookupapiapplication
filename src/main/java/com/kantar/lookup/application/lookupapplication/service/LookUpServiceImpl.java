package com.kantar.lookup.application.lookupapplication.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kantar.lookup.application.lookupapplication.model.LookUp;
import com.kantar.lookup.application.lookupapplication.repository.LookUpRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class LookUpServiceImpl implements LookUpService{

	@Autowired
    private LookUpRepository lookUpRepository;

    public List<LookUp> fetchLooUpData() {
    	
    	//List<LookUp> lookUpList = lookUpRepository.findAll();
    	
        List<LookUp> lookUpList = new ArrayList<>();

        LookUp lookUp = new LookUp();
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

        LookUp lookUp1 = new LookUp();
        lookUp1.setPanelistId(131);
        lookUp1.setHouseholdId(131);
        lookUp1.setUserName("Wan_ley");
        lookUp1.setOptinStatus("Opt-In");
        lookUp1.setPanelistStatus(true);
        lookUp1.setRole("Panelist");
        lookUp1.setRole("USER");
        lookUp1.setLocal("EN_AU English");
        lookUp1.setCurrentOwner("Stood");
        lookUp1.setRecruitedBy("Joy");

        lookUpList.add(lookUp);
        lookUpList.add(lookUp1);
        
        return lookUpList;
    }

}
