package main;

import org.springframework.stereotype.Component;

@Component
public class ComponentTest {
    private int n=10;

   public int getN() {
       return n;
   }
   public void setN(int n) {
       this.n = n;
   }
}