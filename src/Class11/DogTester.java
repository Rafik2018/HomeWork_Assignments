package Class11;

public class DogTester {
    public static void main(String[] args) {


      Dog Husky = new Dog();
      Husky.name = "Fred";
      Husky.color = "WhiteBlack";
      Husky.size = "Avarage";
      Husky.age = 4;
      Husky.attitude = true;

      System.out.println(Husky.attitude);
      Husky.attitude();

      Dog Bulldog =new Dog();
      Bulldog.name = "Fighter";
      Bulldog.color = "DarkBrown";
      Bulldog.size = "Big";
      Bulldog.age = 5;
      Bulldog.attitude = false;

      System.out.println(Bulldog.attitude);
       Bulldog.bark();

      Dog Labrador = new Dog();
      Labrador.name = "Steel";
      Labrador.color = "Grey";
      Labrador.size = "Huge";
      Labrador.age = 6;
      Labrador.attitude=true;

      System.out.println(Labrador.attitude);
      Labrador.eat();






    }



}
