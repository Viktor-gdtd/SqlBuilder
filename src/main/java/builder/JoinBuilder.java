package builder;

public class JoinBuilder extends ContainsCondition {
    private SqlQueryBuilder sqlQueryBuilder;
    private String tableName;

    public JoinBuilder(SqlQueryBuilder sqlQueryBuilder, String tableName) {
        this.sqlQueryBuilder = sqlQueryBuilder;
        this.tableName = tableName;
    }

    @Override
    SqlQueryBuilder addCondition(String condition) {
        return sqlQueryBuilder.applyJoin(tableName, condition);
    }

    public Condition on (String fieldName) {
        return new Condition(this, fieldName);
    }

}
