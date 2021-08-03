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

import com.kantar.lookup.application.lookupapplication.model.Lookup;
import com.kantar.lookup.application.lookupapplication.repository.PanelistManagermentRepository;


@RunWith(SpringRunner.class)
public class LookupServiceTest {
	
	@Mock
	private PanelistManagermentRepository lookUpRepository;
	
	@InjectMocks
	private LookupServiceImpl lookUpService;
	
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

        lookUpList.add(lookup);
        
        Mockito.when(lookUpRepository.findAll()).thenReturn(lookUpList);
        
        List<Lookup> expectedList = lookUpService.fetchLooUpData(121);
        
        assertEquals(expectedList.size(), 1);
		
	}

}
