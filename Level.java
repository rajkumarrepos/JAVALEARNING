enum Level {
    LOW("L"), MEDIUM("M"), HIGH("H");

    private String abbr;

    Level(String ab) {
        abbr = ab;
    }

    public String getAbbr() {
        return abbr;
    }

}
