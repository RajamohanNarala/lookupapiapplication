package com.kantar.lookup.application.lookupapplication.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kantar.lookup.application.lookupapplication.model.Lookup;
import com.kantar.lookup.application.lookupapplication.service.LookupService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/Jade-PanelistManagermentServices")
public class LookupController {
	private static final Logger logger = LoggerFactory.getLogger(LookupController.class);
    @Autowired
    LookupService lookupService;

    @Validated
    @PostMapping("/panelists/{id}")
    public List<Lookup> getLookUps(@PathVariable Integer id) {
        List<Lookup> lookUpList = lookupService.fetchLooUpData(id);
        logger.debug("incontroler",lookUpList);
        return lookUpList;
    }
}
