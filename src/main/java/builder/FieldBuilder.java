package builder;

import domain.query.queryPart.Field;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FieldBuilder {
    private SqlQueryBuilder sqlQueryBuilder;
    private List<Field> fields;

    public FieldBuilder(SqlQueryBuilder sqlQueryBuilder) {
        this.sqlQueryBuilder = sqlQueryBuilder;
        fields = new ArrayList<>();
    }

    public FieldBuilder field(String ... fields) {
        Arrays.stream(fields).forEach(this::addField);
        return this;
    }

    public SqlQueryBuilder all() {
        addField("*");
        return sqlQueryBuilder;
    }

    public FromBuilder from(String table) {
        return sqlQueryBuilder.from(table);
    }


    private void addField(String name) {
        fields.add(new Field(name));
    }

    protected List<Field> get() {
        return fields;
    }
}
