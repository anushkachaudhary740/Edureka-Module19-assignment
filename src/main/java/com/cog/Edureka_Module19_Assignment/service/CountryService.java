package com.cog.Edureka_Module19_Assignment.service;

import com.cog.Edureka_Module19_Assignment.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountryService {
@Autowired
private Country country;
List<Country>list=new ArrayList<>();{
    list.add(new Country("US","USA"));
        list.add(new Country("in","India"));
        list.add(new Country("Ch","China"));
        list.add(new Country("PK","Pakistan"));
    }
    public Country getCountry(String code) {
        Country c1=null;
        c1=list.stream().filter(e->e.getCode().equalsIgnoreCase(code)).findFirst().get();
        return c1;
    }

    public List<Country> getAllCountryDetails() {
    return list;
    }
}
