package builder;

import builder.condition.Condition;
import builder.i.Builder;
import domain.query.Query;
import domain.query.queryPart.Table;

public class FromBuilder implements Builder {
    private SqlQueryBuilder sqlQueryBuilder;
    private Table table;

    public FromBuilder(SqlQueryBuilder sqlQueryBuilder) {
        this.sqlQueryBuilder = sqlQueryBuilder;
    }

    public FromBuilder from(String table) {
        this.table = new Table(table);
        return this;
    }

    public Condition where(String field) {
        return sqlQueryBuilder.where(field);
    }

    protected Table get() {
        return table;
    }
    @Override
    public Query build() {
        return sqlQueryBuilder.build();
    }
}
