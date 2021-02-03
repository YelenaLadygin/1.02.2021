public class Main {
    public static void main(String[] args) {
        //4-5,7
        Dog juliya = new Dog();
        juliya.name = "juliya";
        juliya.gil = 5;
        juliya.geza_dog = "pudel";
        juliya.bark();
        System.out.println(juliya.toString());
}

public class Dog {
    public  String name;
    public  int gil;
    public  String geza_dog;

    public void bark () {
     System.out.println(String.format("Dog named %s",name +" says woof,woof!" ));
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", gil=" + gil +
                ", geza_dog='" + geza_dog + '\'' +
                '}';
    }
}
 //8
      public static void main(String[] args) {
        String[] team = {" moshe ", "dan", " elly", "igor", "slava", "dror"};
        FootbalTeam makabi = new FootbalTeam();
        makabi.replacePlayer(team, "dan", "sasha");
        for (int i = 0; i < team.length; i++) {
            System.out.print(team[i]);
     }       
 public class FootbalTeam {
    public String team_name;
    public String country;
    public String[] name_players = new String[11];
    public int grade;

    public void changeRating(int y) {
        grade = y;
    }
    public void replacePlayer(String[] array, String a, String b) {
        for (int i = 0; i < array.length; i++) {
            if (a.equals(array[i])) {
                array[i] = b;
            }
        }
    }
 //9-10
  public static void main(String[] args){
            Meal salad = new Meal("salad", true, 25);
            Meal meat = new Meal("meat", false, 125);
            System.out.println(salad);
            System.out.println(meat);
}
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
class Meal {
    public  String nameMeal;
    public  boolean vegeterian;
    public  float price;
}

//12
 private static void createHouses() {
        House h1 = new House("Yelena");
        System.out.println(h1);
        House h2 = new House("Sapir");
        System.out.println(h2);
    }
    import lombok.ToString;

@ToString
public class House {
    public final String address = "Rehovot";
    public final float area = 125 ;
    public String owners ;

    public House( String owners) {
        this.owners = owners;
    }
}
    //13
     public static void main(String[] args){
            Weather today = new Weather();
            today.temperatura = 23;
            today.changeChanceOfRain(105);
            today.printTempFahrenheit();   
            mport lombok.AllArgsConstructor;
          }
          
import lombok.ToString;
@ToString
public class Weather {
    public float temperatura  ;
    public int humidity ;
    public boolean cloudy ;
    public int chanceOfRain ;

  public void changeChanceOfRain ( int changeRain){
     if ( changeRain >0 && changeRain < 100)
         chanceOfRain=changeRain;
  }
   public void printTempFahrenheit() {
      System.out.println(String.format("The temperatura is %.2f C and %.2f F",temperatura, temperatura*1.8+32));
   }
}

//14
public class Movie {
    public final String filmName;
    public final Date dateOffilm;
    public int grade;
    public String genre;
    public static int movieCounter;
    public static final int ratingForOscar = 9;

    public Movie(String filmName, Date dateOffilm, int grade, String genre) {
        this.filmName = filmName;
        this.dateOffilm = dateOffilm;
        this.grade = grade;
        this.genre = genre;
    }

    public void resetCounter (){
        movieCounter=0;
    }
    public boolean isWonOscar(){
        if (grade > ratingForOscar){
            return true;}
        else return false;
    }
}
