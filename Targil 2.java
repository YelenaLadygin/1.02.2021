//15
public class Memory {
     public static int number = 2;
     public static float numberf = 7.8f;
     public static String name ;
     
    public static void add(int num){
         number+= num;
     }
     public static void add ( float numf) {
         numberf+=numf;
     }
    public static void add ( String name1){
         name +=name1;
    }
       
    public class Main {
    public static void main(String[] args) {
     addToMemory();
    }
    public static  void addToMemory( ) {
               Memory.add("yelena");
               Memory.add(25);
               Memory.add(4.5f);
           }
}
