package com;
import java.util.*;

public class test
{


public void conflict2()
{

System.out.println("This is Conflict 1");

}

public void conflict1()
{

System.out.println("This is Conflict 1");

}

public static void main(String[] args)
{

System.out.println("Welcome to Java Conflict  2");


conflict1();
conflict2();
}
}
