package SQL_LANG.ENTITIES;

public class Category {
    private static int lastId = 0;
    private int id;
    private String name;
    private int tier;

    public int getId() {
        return id;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int category_id) {
        this.tier = category_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Category( String name, int tier) {
        this.id = lastId;
        lastId++;
        this.name = name;
        this.tier = tier;
    }
}
