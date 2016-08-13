package com;
import java.util.*;

public class test
{


public void conflict1()
{
System.out.println("Conflict 1");
}
public void conflict2()
{
System.out.println("This is Conflict 2");
}
public static void main(String[] args)
{
System.out.println("Welcome to Java Merged feature  1");
System.out.println("Welcome to Java Merged feature  2");
conflict2();
conflict1();
}
}
