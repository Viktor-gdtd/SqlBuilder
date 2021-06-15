package builder.i;

import builder.condition.Condition;

public abstract class ContainsCondition {
     Condition condition;

     abstract Condition field(String field);
}
