package com.kantar.lookup.application.lookupapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kantar.lookup.application.lookupapplication.model.LookUp;
import com.kantar.lookup.application.lookupapplication.service.LookUpService;

import java.util.List;

@RestController
@RequestMapping("/jadepanelist")
public class LookUpController {

    @Autowired
    LookUpService lookUpService;

    @GetMapping("/lookupInfo")
    public List<LookUp> getLookUps() {
    	
        List<LookUp> lookUpList = lookUpService.fetchLooUpData();
        
        return lookUpList;
    }
}
