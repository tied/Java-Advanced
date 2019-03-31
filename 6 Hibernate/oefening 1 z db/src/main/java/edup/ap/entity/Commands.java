package edup.ap.entity;

public class Commands {
    private Side side;
    private Character character;

    public Commands() { }

    public Commands(Side side, Character character) {
        this.side = side;
        this.character = character;
    }

    public int getSide() {
        return this.side.getId();
    }

    public void setSide(int side) {
        this.side.setId(side);
    }

    public String getCharacter() {
        return this.character.getName();
    }

    public void setCharacter(String character) {
        this.character.setName(character);
    }
}
