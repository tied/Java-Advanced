package edup.ap.entity.enumeration;

public enum Outcome {
    WIN("Win"), LOSE("Lose");

    private String desc;

    Outcome(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
