package com.csc;

import java.lang.*;

public class Main {
  public static void main(String[] args) {
    Stack stack = new Stack();
    Dish oneDish = new Dish("A dish with one fish pattern on it");
    Dish twoDish = new Dish("A dish with two fish patterns on it");
    Dish redDish = new Dish("A dish with a red fish pattern on it");
    Dish blueDish = new Dish("A dish with a blue fish pattern on it");
    
    int stackSize = stack.size();
    System.out.println(stackSize);
    
    stack.push(oneDish);
    stack.push(twoDish);
    stack.push(redDish);
    stack.push(blueDish);

    // The variable sizeAfterPushes should equal four.
    int sizeAfterPushes = stack.size();
    System.out.println(sizeAfterPushes);
    
    // The variable peekedDish should have a description of "A dish with a blue fish pattern on it"
    Dish peekedDish = stack.peek();
    System.out.println(peekedDish.description);

    // The variable poppedDish should have a description of "A dish with a blue fish pattern on it"
    Dish poppedDish = stack.pop();
    System.out.println(poppedDish.description);

    // The variable anotherPoppedDish should have a description of "A dish with a red fish pattern on it"
    Dish anotherPoppedDish = stack.pop();
    System.out.println(anotherPoppedDish.description);

    // The variable finalSize should equal two.
    int finalSize = stack.size();
    System.out.println(finalSize);
  }
}