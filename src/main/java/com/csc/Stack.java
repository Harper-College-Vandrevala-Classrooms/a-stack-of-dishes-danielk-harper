package com.csc;

import java.util.*;

class Stack<T> {
  ArrayList<T> stack;
  
  public Stack() {
    stack = new ArrayList<T>();
  }
  
  public void push(T newElem) {
    stack.add(newElem);
  }
  
  public T pop() {
    T ret = peek();
    stack.remove(stack.size() - 1);
    return ret;
  }
  
  public T peek() {
    return stack.get(stack.size() - 1);
  }
  
  public int size() {
    return stack.size();
  }
}