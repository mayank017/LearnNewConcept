package Practicse;

public class test1 {
    static boolean p;

    public static void main(String[] args) {

    }

    public static boolean printHello() {
        System.out.println("hello World");
        return false;
    }

    static {
        p = printHello();
    }

    // select name from emp as e1 where 2 = (Select count(Distinct sal) from emp as e2 where e2.sal > e1.sal);

    /*
    DDL = Data definition language - Create, Drop, alter
    DML - Manupluation - Insert, delete, update
    DQL - Select
    DCL - Grant revoke
    TCL - commit, rollbakc

     */

    /*
    * Joins -
    * Inner Join = Select e1.name, sal.salary from Emp as e1 Inner Join Salary as s2 where e1.id = sal.id;
    *
    *
    *
    * */

}
