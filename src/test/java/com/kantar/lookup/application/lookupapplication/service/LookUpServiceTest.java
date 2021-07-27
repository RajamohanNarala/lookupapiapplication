package com.kantar.lookup.application.lookupapplication.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;

import com.kantar.lookup.application.lookupapplication.model.LookUp;
import com.kantar.lookup.application.lookupapplication.repository.LookUpRepository;

@RunWith(SpringRunner.class)
public class LookUpServiceTest {
	
	@Mock
	private LookUpRepository lookUpRepository;
	
	@InjectMocks
	private LookUpServiceImpl lookUpService;
	
	@Test
	public void shouldReturnListOfLookUps() {
		
		List<LookUp> lookUpList = new ArrayList<>();

        LookUp lookUp = new LookUp();
        lookUp.setPanelistId(121);
        lookUp.setHouseholdId(121);
        lookUp.setUserName("raj_narala");
        lookUp.setOptinStatus("Opt-In");
        lookUp.setPanelistStatus(true);
        lookUp.setRole("Panelist");
        lookUp.setRole("USER");
        lookUp.setLocal("EN_AU English");
        lookUp.setCurrentOwner("Rj");
        lookUp.setRecruitedBy("Rj");

        LookUp lookUp1 = new LookUp();
        lookUp1.setPanelistId(111);
        lookUp1.setHouseholdId(111);
        lookUp1.setUserName("raj_narala");
        lookUp1.setOptinStatus("Opt-In");
        lookUp1.setPanelistStatus(true);
        lookUp1.setRole("Panelist");
        lookUp1.setRole("USER");
        lookUp1.setLocal("EN_AU English");
        lookUp1.setCurrentOwner("jr");
        lookUp1.setRecruitedBy("jr");

        lookUpList.add(lookUp);
        lookUpList.add(lookUp1);
        
        Mockito.when(lookUpRepository.findAll()).thenReturn(lookUpList);
        
        List<LookUp> expectedList = lookUpService.fetchLooUpData();
        
        assertEquals(expectedList.size(), 2);
		
	}

}
