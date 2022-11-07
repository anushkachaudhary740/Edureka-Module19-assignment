package com.cog.Edureka_Module19_Assignment.controller;

import com.cog.Edureka_Module19_Assignment.model.Country;
import com.cog.Edureka_Module19_Assignment.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CountryController {
    @Autowired
    private CountryService countryService;
    @RequestMapping(value = "/country",method = RequestMethod.GET)
    public String getCountryUsa(){
        return "US";
    }
    @GetMapping("/countries")
    public List<Country> getAllCountryDetails(){
        return this.countryService.getAllCountryDetails();
    }
    @GetMapping("/countries/{code}")
    public Country getCountry(@RequestBody Country country,@PathVariable("code") String code){
        country=countryService.getCountry(code);
        return country;
    }

}
