package org.example.locations;

import org.example.chefs.*;

import java.util.ArrayList;
import java.util.List;

public class CulinarySchool {
//    private List<JuniorChef> jrChefs = new ArrayList<>();
//    private List<MasterChef> masterChefs = new ArrayList<>();
//    private List<IntermediateChef> intermediateChefs = new ArrayList<>();
//    private List<SeniorChef> seniorChefs = new ArrayList<>();


    private List<Chef> chefs = new ArrayList<>();

    public CulinarySchool() {}

    public String addChef(Chef chef) {
        this.chefs.add(chef);
        // Master chef has been added
        // Sr chef has been added
        return chef.getRank() + " chef has been added";
    }

    public String addJrChef(JuniorChef chef) {
        this.chefs.add(chef);
        // Master chef has been added
        // Sr chef has been added
        return chef.getRank() + " chef has been added";
    }
}
