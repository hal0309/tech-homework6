package org.homework20241215.house;

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
        if(floors != null) {
            System.out.println("階数:" + floors);
        }
        if(floorMaterial != null) {
            System.out.println("床材:" + floorMaterial);
        }
        if(wallMaterial != null) {
            System.out.println("壁材:" + wallMaterial);
        }
    }
}