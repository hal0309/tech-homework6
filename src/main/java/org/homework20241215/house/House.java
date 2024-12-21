package org.homework20241215.house;

import java.util.Objects;

public class House {

    public static HouseBuilder builder() {
        return new HouseBuilder();
    }

    private final String address;
    private final Integer floors;
    private final String floorMaterial;
    private final String wallMaterial;

    public House(String adress, Integer floors, String floorMaterial, String wallMaterial) {
        this.address = adress;
        this.floors = floors;
        this.floorMaterial = floorMaterial;
        this.wallMaterial = wallMaterial;
    }

    public void printHouseDetail() {
        System.out.println(address + "の家");
        if(Objects.nonNull(floors)) {
            System.out.println("階数:" + floors);
        }
        if(Objects.nonNull(floorMaterial)) {
            System.out.println("床材:" + floorMaterial);
        }
        if(Objects.nonNull(wallMaterial)) {
            System.out.println("壁材:" + wallMaterial);
        }
    }
}
