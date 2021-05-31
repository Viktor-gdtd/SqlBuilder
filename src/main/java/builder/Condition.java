package builder;

public class Condition {
    private ContainsCondition t;
    private String fieldName;

    public Condition(ContainsCondition t, String fieldName) {
        this.fieldName = fieldName;
        this.t = t;
    }

    public SqlQueryBuilder like (String mask) {
        return t.addCondition(fieldName + " LIKE " + mask);
    }

    public SqlQueryBuilder equal (String value) {
        return t.addCondition(fieldName + " = " + value);
    }

    public SqlQueryBuilder notEqual (String value) {
        return t.addCondition(fieldName + " <> " + value);
    }

    public SqlQueryBuilder equivalent (String value) {
        return t.addCondition(fieldName + " <=> " + value);
    }

    public SqlQueryBuilder less (String value) {
        return t.addCondition(fieldName + " < " + value);
    }

    public SqlQueryBuilder lessOrEqual (String value) {
        return t.addCondition(fieldName + "<= " + value);
    }

    public SqlQueryBuilder more (String value) {
        return t.addCondition(fieldName + " > " + value);
    }

    public SqlQueryBuilder moreOrEqual (String value) {
        return t.addCondition(fieldName + " >= " + value);
    }
}
