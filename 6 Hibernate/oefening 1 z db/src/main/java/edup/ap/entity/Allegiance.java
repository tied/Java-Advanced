package edup.ap.entity;

public class Allegiance {
    private House house;
    private Character character;

    public Allegiance(House house, Character character) {
        this.house = house;
        this.character = character;
    }

    public Allegiance() {
    }

    public String getHouse() {
        return house.getName();
    }

    public void setHouse(String house) {
        this.house.setName(house);
    }

    public String getCharacter() {
        return character.getName();
    }

    public void setCharacter(String character) {
        this.character.setName(character);
    }
}
