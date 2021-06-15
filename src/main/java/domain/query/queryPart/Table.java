package domain.query.queryPart;

public class Table implements QueryPart {
    private String name;

    public Table(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
