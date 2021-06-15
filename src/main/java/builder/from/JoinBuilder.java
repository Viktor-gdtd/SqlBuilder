package builder.from;

import builder.FromBuilder;
import builder.condition.Condition;
import builder.i.Builder;
import builder.i.ContainsCondition;
import domain.query.Query;

public class JoinBuilder implements ContainsCondition, Builder {
    private FromBuilder fromBuilder;
    private String tableName;

    public JoinBuilder(FromBuilder fromBuilder, String tableName) {
        this.fromBuilder = fromBuilder;
        this.tableName = tableName;
    }

    @Override
    public Condition field(String field) {
        return new Condition(this, field);
    }

    @Override
    public Query build() {
        return fromBuilder.build();
    }

    public Condition on (String field) {
        return new Condition(this, field);
    }

}
