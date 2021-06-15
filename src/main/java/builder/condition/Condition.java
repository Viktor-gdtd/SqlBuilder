package builder.condition;

import builder.SqlQueryBuilder;
import builder.i.ContainsCondition;

import java.util.List;

public class Condition {
    private ContainsCondition t;

    List<Expression> expressions;

    public Condition(ContainsCondition t) {
        this.t = t;
    }

    public Expression like (String mask) {
        return t.addCondition(fieldName + " LIKE " + mask);
    }

    public Expression equal (String value) {
        return t.addCondition(fieldName + " = " + value);
    }

    public Expression notEqual (String value) {
        return t.addCondition(fieldName + " <> " + value);
    }

    public Expression equivalent (String value) {
        return t.addCondition(fieldName + " <=> " + value);
    }

    public Expression less (String value) {
        return t.addCondition(fieldName + " < " + value);
    }

    public Expression lessOrEqual (String value) {
        return t.addCondition(fieldName + "<= " + value);
    }

    public Expression more (String value) {
        return t.addCondition(fieldName + " > " + value);
    }

    public Expression moreOrEqual (String value) {
        return t.addCondition(fieldName + " >= " + value);
    }
//
//    public SqlQueryBuilder like () {
//        return new SqlQueryBuilder();
//    }
//
//    public SqlQueryBuilder equal () {
//        return new SqlQueryBuilder();
//    }
//
//    public SqlQueryBuilder notEqual () {
//        return new SqlQueryBuilder();
//    }
//
//    public SqlQueryBuilder equivalent () {
//        return new SqlQueryBuilder();
//    }
//
//    public SqlQueryBuilder less () {
//        return new SqlQueryBuilder();
//    }
//
//    public SqlQueryBuilder lessOrEqual () {
//        return new SqlQueryBuilder();
//    }
//
//    public SqlQueryBuilder more () {
//        return new SqlQueryBuilder();
//    }
//
//    public SqlQueryBuilder moreOrEqual () {
//        return new SqlQueryBuilder();
//    }
}
