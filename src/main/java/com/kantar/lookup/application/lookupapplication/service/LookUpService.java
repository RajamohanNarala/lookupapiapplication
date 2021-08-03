package com.kantar.lookup.application.lookupapplication.service;

import java.util.List;
import com.kantar.lookup.application.lookupapplication.model.Lookup;


public interface LookupService {

    public List<Lookup> fetchLooUpData(int id);
}
