package app;

//import java.lang.annotation.Repeatable;

/**
 * Migration
 */

// @Repeatable(Migrations.class)
public @interface Migration {

    Team team();

    int phase() default 1;

    Class<? extends Throwable>[] allowedExceptions() default { Exception.class };

    String comment() default "Karen";
}