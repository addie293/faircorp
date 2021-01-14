package com.emse.spring.faircorp;
import javax.persistence.*;

public class Heater {

    private Long id;


    private String name;

    private Long power;

    private int room;


    private HeaterStatus heaterStatus;


    public Heater() {
    }

    public Heater(String name, HeaterStatus status) {
        this.heaterStatus = status;
        this.name = name;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HeaterStatus getHeaterStatus() {
        return heaterStatus;
    }

    public void setHeaterStatus(HeaterStatus heaterStatus) {
        this.heaterStatus = heaterStatus;
    }

    public Long getPowerStatus(){
        return power;
    }
}