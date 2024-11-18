package com.csc;

import java.util.*;

class Stack {
  ArrayList<Dish> stack;
  
  public Stack() {
    stack = new ArrayList<Dish>();
  }
  
  public void push(Dish newDish) {
    stack.add(newDish);
  }
  
  public Dish pop() {
    Dish ret = peek();
    stack.remove(stack.size() - 1);
    return ret;
  }
  
  public Dish peek() {
    return stack.get(stack.size() - 1);
  }
  
  public int size() {
    return stack.size();
  }
}