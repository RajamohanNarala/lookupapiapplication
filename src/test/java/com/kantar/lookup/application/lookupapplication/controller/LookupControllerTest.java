package com.kantar.lookup.application.lookupapplication.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;

import com.kantar.lookup.application.lookupapplication.model.Lookup;
import com.kantar.lookup.application.lookupapplication.service.LookupServiceImpl;

@RunWith(SpringRunner.class)
public class LookupControllerTest {
	
	@Mock
	private LookupServiceImpl lookUpService;
	
	@InjectMocks
	private LookupController lookUpController;
	
	@Test
	public void shouldReturnListOfLookUps() {
		
		List<Lookup> lookUpList = new ArrayList<>();

		Lookup lookup = new Lookup();
		lookup.setPanelistId(121);
		lookup.setHouseholdId(121);
		lookup.setUserName("raj_narala");
		lookup.setOptinStatus("Opt-In");
		lookup.setPanelistStatus(true);
		lookup.setRole("Panelist");
		lookup.setRole("USER");
		lookup.setLocal("EN_AU English");
		lookup.setCurrentOwner("Rj");
		lookup.setRecruitedBy("Rj");

        Lookup lookup1 = new Lookup();
        lookup1.setPanelistId(111);
        lookup1.setHouseholdId(111);
        lookup1.setUserName("raj_narala");
        lookup1.setOptinStatus("Opt-In");
        lookup1.setPanelistStatus(true);
        lookup1.setRole("Panelist");
        lookup1.setRole("USER");
        lookup1.setLocal("EN_AU English");
        lookup1.setCurrentOwner("jr");
        lookup1.setRecruitedBy("jr");

        lookUpList.add(lookup);
        lookUpList.add(lookup1);
        
        Mockito.when(lookUpService.fetchLooUpData(121)).thenReturn(lookUpList);
        
        List<Lookup> expectedList = lookUpController.getLookUps(121);
        
        assertEquals(expectedList.size(), 2);
		
	}


}
