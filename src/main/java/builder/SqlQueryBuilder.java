package builder;

import builder.condition.Condition;
import builder.i.Builder;
import builder.where.WhereBuilder;
import domain.query.Query;

public class SqlQueryBuilder implements Builder {
    private final Query query;
    private final FieldBuilder fieldBuilder;
    private final FromBuilder fromBuilder;
    private final WhereBuilder whereBuilder;

    public SqlQueryBuilder() {
        query = new Query();
        fieldBuilder = new FieldBuilder(this);
        fromBuilder = new FromBuilder(this);
        whereBuilder= new WhereBuilder(this);
    }

    public FieldBuilder select(String ... fields) {
        return fieldBuilder.field(fields);
    }

    public FromBuilder from(String table) {
        return fromBuilder.from(table);
    }

    public Condition where(String field) {
        return whereBuilder.field(field);
    }

    @Override
    public Query build() {
        query.setFieldList(fieldBuilder.get());
        query.setTable(fromBuilder.get());
        return query;
    }
}
