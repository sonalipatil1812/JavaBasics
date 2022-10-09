package com.techno.javabasic.abstraction;

public interface Car {
          void brake();
          void acc();
          void gear();
         default void gps() {
        	 
         }
}
