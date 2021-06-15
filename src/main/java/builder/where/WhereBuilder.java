package builder.where;

import builder.SqlQueryBuilder;
import builder.condition.Condition;
import builder.i.Builder;
import builder.i.ContainsCondition;
import domain.query.Query;

public class WhereBuilder implements ContainsCondition, Builder {
    private SqlQueryBuilder sqlQueryBuilder;


    public WhereBuilder(SqlQueryBuilder sqlQueryBuilder) {
        this.sqlQueryBuilder = sqlQueryBuilder;
    }

    public SqlQueryBuilder subQuery() {
        return new SqlQueryBuilder();
    }

    public Condition field(String field) {
        return new Condition(this, field);
    }

    @Override
    public Query build() {
        return null;
    }
}
