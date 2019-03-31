package edup.ap.entity.enumeration;

public enum  Type {
    ATT("Attacker"), DEF("Defender");

    private String desc;

    Type(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
