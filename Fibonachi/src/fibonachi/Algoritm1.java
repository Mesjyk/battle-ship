
package fibonachi;

import java.util.Arrays;
import java.util.Random;

public class Algoritm1 {
    int[] mas=new int[10];
    
    public static void main(String[] args){
       //Algoritm1 algoritm=new Algoritm1();
        //generateArray(algoritm);
        //Dog.getIntro();
        new Dog();
        //System.out.println(Dog.roloc);
        //sort(algoritm);
        //show(algoritm);
        //type1(algoritm);
        //type2(algoritm);
        //type3(algoritm);
        //type4(algoritm);
        //show(algoritm);
    }

    public static void type1(Algoritm1 algoritm) {
        int current=1;
        for(int i=0;i<10;i++){
            for(int j=1;j<10;j++){
                if(algoritm.mas[j]==current){
                    current++;     
                }
            }
        }
        //2 5 1 0 0 7 3 4 1 3
        System.out.println(current);
    }
    
    public static void type2(Algoritm1 algoritm) {
        boolean flag=true;
        int carrent=1;
        while(flag){
            for(int i=0;i<10;i++){
                if(algoritm.mas[i]==carrent){
                    carrent++;
                }else{
                    flag=false;
                }
            } 
        }
        System.out.println(carrent);
    }
    
    public static void type3(Algoritm1 algoritm){
        for(int i=0;i<algoritm.mas.length;i++){
            if(algoritm.mas[i]>=0 && (i==algoritm.mas.length-1 | algoritm.mas[i+1]-algoritm.mas[i]>1)){
                System.out.println(algoritm.mas[i]+1);
                break;
            }else{
                
            }
        }
    }
    
    public static void type4(Algoritm1 algoritm){
        for(int i=0;i<algoritm.mas.length;i++){
            swap(algoritm, i);
        }
        for(int i=1;i<algoritm.mas.length;i++){
            if(algoritm.mas[i]!=i){
                System.out.println("Answer "+i);
                break;
            }
            
        }
    }

    public static void swap(Algoritm1 algoritm, int i) {
        if((algoritm.mas[i]!=i)&&(algoritm.mas[algoritm.mas[i]]!=algoritm.mas[i])){
            
            int x=algoritm.mas[algoritm.mas[i]];
            algoritm.mas[algoritm.mas[i]]=algoritm.mas[i];
            algoritm.mas[i]=x;
            
            show(algoritm);
            swap(algoritm, i);
        }else{
            return;
        }
    }
    
    public static void sort(Algoritm1 algoritm){
        Arrays.sort(algoritm.mas);
    }

    public static void generateArray(Algoritm1 algoritm) {
        Random random=new Random();
        for(int i=0;i<10;i++){
            boolean sign=random.nextBoolean();
            int number=1;
            
            algoritm.mas[i]=random.nextInt(10)*number;
            System.out.print(algoritm.mas[i]+" ");
        } 
        System.out.println(" ");
    }
    
    public static void show(Algoritm1 algoritm) {
        for(int i=0;i<algoritm.mas.length;i++){
            System.out.print(algoritm.mas[i]+" ");
        }
        System.out.println();
    }
}
