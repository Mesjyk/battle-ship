
package fibonachi;

import java.util.Random;

public class Bouble {
    
    int[] mas=new int[10];
    
    public static void main(String[] args) {
        Bouble bouble=new Bouble();
        bouble.generateArray();
        //bouble.type1(bouble);
        bouble.show();
    }
    
    public void type1(Bouble bouble) {
        for(int i=0;i<mas.length;i++){
            for(int j=0;j<mas.length;j++){
                if(mas[j]>mas[i]){
                    bouble.show();
                    int free=mas[i];
                    mas[i]=mas[j];
                    mas[j]=free;
                }
            }
        }
    }
    
    public void type2(){
        
    }
    
    public void generateArray() {
        Random random=new Random();
        for(int i=0;i<10;i++){
            boolean sign=random.nextBoolean();
            int number=1;
            
            mas[i]=random.nextInt(10)*number;
            System.out.print(mas[i]+" ");
        } 
        System.out.println(" ");
    }
    
    public void show() {
        for(int i=0;i<mas.length;i++){
            System.out.print(mas[i]+" ");
        }
        System.out.println();
    }
}
