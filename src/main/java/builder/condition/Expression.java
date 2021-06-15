package builder.condition;

import domain.query.queryPart.Field;

public class Expression {
    private Condition condition;
    private Field first, second;
    private String fieldComparisonOperator, conditionOperator;

    public Expression(Condition condition) {
        this.condition = condition;
    }

    public Condition or (String field) {
        return new Condition(t, field);
    }
    public Condition and (String field) {
        return new Condition(t, field);
    }
}
