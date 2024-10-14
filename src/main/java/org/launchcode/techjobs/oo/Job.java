package org.launchcode.techjobs.oo;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.positionType = positionType;
        this.location = location;
        this.coreCompetency = coreCompetency;

    }
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public Location getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public int getId() {
        return id;
    }


    public String toString() {

        String name = "";
        String employer = "";
        String location = "";
        String position = "";
        String competency = "";
        String id = Integer.toString(this.getId());

        if (!(this.getName() == null || this.getName().isEmpty())) {
            name = this.getName();
        } else {
            name = "Data Not Available";
        }

        if (!(this.getEmployer().toString() == null || this.getEmployer().toString().isEmpty())) {
            employer = this.getEmployer().toString();
        } else {
            employer = "Data Not Available";
        }

        if (!(this.getLocation().toString() == null || this.getLocation().toString().isEmpty())) {
            location = this.getLocation().toString();
        } else {
            location = "Data Not Available";
        }
        if (!(this.getPositionType().toString() == null || this.getPositionType().toString().isEmpty())) {
            position = this.getPositionType().toString();
        } else {
            position = "Data Not Available";
        }
        if (!(this.getCoreCompetency().toString() == null || this.getCoreCompetency().toString().isEmpty())) {
            competency = this.getCoreCompetency().toString();
        } else {
            competency = "Data Not Available";
        }


        return "\n" + "ID : " + id + "\n" + "Name: " + name + "\n" + "Employer: " + employer + "\n" + "Location: " + location + "\n" + "Position Type: " + position + "\n" + "Core Competency: " + competency + "\n";


    }
}



