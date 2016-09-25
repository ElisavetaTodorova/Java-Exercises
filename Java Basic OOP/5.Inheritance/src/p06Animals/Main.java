package p06Animals;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String input=reader.readLine();
        while (!input.equals("Beast!")){
            String [] params=reader.readLine().split("\\s+");
            try {

                switch (input) {
                    case "Dog":
                        String dogName=params[0];
                        int dogAge=Integer.parseInt(params[1]);
                        String dogGender=params[2];
                        Dog dog=new Dog(dogName,dogAge,dogGender);
                        System.out.println("Dog");
                        System.out.println(dog.toString());
                        dog.produceSound();
                        break;
                    case "Cat":
                        String catName=params[0];
                        int catAge=Integer.parseInt(params[1]);
                        String catGender=params[2];
                        Cat cat=new Cat(catName,catAge,catGender);
                        System.out.println("Cat");
                        System.out.println(cat.toString());
                        cat.produceSound();
                        break;
                    case "Frog":
                        String frogName=params[0];
                        int frogAge=Integer.parseInt(params[1]);
                        String frogGender=params[2];
                        Frog frog=new Frog(frogName,frogAge,frogGender);
                        System.out.println("Frog");
                        System.out.println(frog.toString());
                        frog.produceSound();
                        break;
                    case "Kittens":
                        String kittensName=params[0];
                        int kittensAge=Integer.parseInt(params[1]);
                        String kittensGender=params[2];
                        Kittens kitten=new Kittens(kittensName,kittensAge,kittensGender);
                        System.out.println("Kittens");
                        System.out.println(kitten.toString());
                        kitten.produceSound();
                        break;

                    case "Tomcat":
                        String tomcatName=params[0];
                        int tomcatAge=Integer.parseInt(params[1]);
                        String tomcatGender=params[2];
                        Tomcat tomcat=new Tomcat(tomcatName,tomcatAge,tomcatGender);
                        System.out.println("Tomcat");
                        System.out.println(tomcat.toString());
                        tomcat.produceSound();
                        break;
                    case "Animal":
                        String animalName=params[0];
                        int animalAge=Integer.parseInt(params[1]);
                        String animalGender=params[2];
                        Animal animal=new Animal(animalName,animalAge,animalGender);
                        System.out.println("Animal");
                        System.out.println(animal.toString());
                        animal.produceSound();
                    default:throw new Exception();
                }
            }catch (Exception ex){
                System.out.println("Invalid input!");
            }
            input=reader.readLine();
        }
    }

}
