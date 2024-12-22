package org.homework20241215.house;

public class HouseBuilder {

    private String address;
    private Integer floors;
    private String floorMaterial;
    private String wallMaterial;

    public HouseBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public HouseBuilder setFloors(Integer floors) {
        this.floors = floors;
        return this;
    }

    public HouseBuilder setFloorMaterial(String floorMaterial) {
        this.floorMaterial = floorMaterial;
        return this;
    }

    public HouseBuilder setWallMaterial(String wallMaterial) {
        this.wallMaterial = wallMaterial;
        return this;
    }

    public House build() {
        if (address == null) {
            throw new IllegalStateException("addressが未設定です");
        }
        return new House(address, floors, floorMaterial, wallMaterial);
    }
}