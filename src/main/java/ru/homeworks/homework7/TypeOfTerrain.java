package src.main.java.ru.homeworks.homework7;

public enum TypeOfTerrain {
    FIELD("равнина"), FOREST("густой лес"), SWAMP("болото");

    TypeOfTerrain(String name) {
        this.name = name;
    }

    private final String name;

    public String getName() {
        return name;
    }
}
