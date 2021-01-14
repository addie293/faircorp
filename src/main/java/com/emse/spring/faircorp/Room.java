package com.emse.spring.faircorp;
import java.util.Set;
import javax.persistence.*;

public class Room {

    private Long id;


    private int floor;

    private String name;

    private double CurrentTemperature;

    private double TargetTemperature;

    @OneToMany(mappedBy = "heater")
    public Set<Heater> heaters;

    @OneToMany(mappedBy = "window")
    public Set<Window> windows;

    public Room() {
    }

    public Room(int floor, String name, Set<Heater> heaters, Set<Window> windows) {
        this.name = name;
        this.heaters = heaters;
        this.windows = windows;
    }

    public Long getId() {
        return this.id;
    }

}
