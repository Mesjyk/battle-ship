
package fibonachi;

public class Dog {
    static{
        System.out.println("roloc5 ");
        
    }
    private String color;
    public static String roloc="color";
    private static int intro;
    static{
        intro=1;
        System.out.println("roloc1 "+roloc);
        
    }
    public Dog(){
        //setColor("orange");
        System.out.println("color2 "+color);
        color="ornage";
        System.out.println("color3 "+color);
    }
    static{
        System.out.println("roloc111 ");
        
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public static int getIntro(){
        return intro;
    }
}
