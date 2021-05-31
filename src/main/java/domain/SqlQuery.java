package domain;

public class SqlQuery {
    private String queryType;
    private String field;
    private String tableName;
    private String where ;
    private String join ;

    public SqlQuery() {
        queryType = "";
        field = "";
        tableName = "";
        where = "";
        join = "";
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public void addFields(String ... fields) {
        joinString(field, fields);
    }

    public void addAlias(String alias) {
        field = field.concat("AS " + alias);
    }

    public void addCondition (String ... conditional) {
        joinString(where, conditional);
    }

    public void dateDiff(String dataFrom, String dataTo) {
        joinString(field," DATEDIFF (hour, " + dataFrom + ", " + dataTo + ")");
    }

    public void joinTable(String tableName, String condition) {
        joinString(join, tableName + " ON " + condition);
    }

    @Override
    public String toString() {
//        String.format("%s %s FROM %s ", queryType, field, tableName);
//        return    String.format("%s %s FROM %s ", queryType, field, tableName);


//        List<String> collect = new ArrayList<String>(){{
//                add(queryType);
//                add(tableName);
//                add(join);
//                add(where);
//            }}.stream().filter(Objects::nonNull).collect(Collectors.toList());
//        return String.join(" ", collect);

        return queryType + field + (join.isEmpty() ? "": "JOIN " + join) + "WHERE " + where;
    }


    private void joinString(String initial, String ... joins) {
        String totalJoin = String.join(", ", joins);
        initial = initial.isEmpty() ? totalJoin : initial.concat(", " + totalJoin);
    }
}
