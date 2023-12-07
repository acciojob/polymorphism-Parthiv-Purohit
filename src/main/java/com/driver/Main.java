package com.driver;
public class Product
    {
      public int product(int x, int y) 
      {
        return x + y;
      }
      public int product(int x, int y, int z) 
      {
        return x + y + z;
      }
      public double product(double x, double y) 
      {
        return x + y;
      }
    }
public class Main {
  Product p = new Product();
  System.out.println(p.product(1,2));
  System.out.println(p.product(1,2,3));
  System.out.pritnln(p.product(1.0,2.0);
}
