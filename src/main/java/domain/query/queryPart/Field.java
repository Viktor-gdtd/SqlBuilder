package domain.query.queryPart;

public class Field implements QueryPart {
    private String name;

    public Field(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
