package misc.a__xTraining.sql;

/**
 *
 *
 * select * from employee
 * group by salary
 * order by salary desc limit 1,1;
 *
 * SELECT * FROM employee
 * WHERE salary = (SELECT DISTINCT(salary)
 * FROM employee ORDER BY salary LIMIT 3,1);
 *
 */



public class GetSecondHighest {
}
