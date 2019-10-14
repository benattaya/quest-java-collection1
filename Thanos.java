import java.lang.reflect.Array;
import java.util.Collections;
import java.util.*;


public class Thanos {

    public static void main(String[] args) {


        // TODO 1 : Create an empty heroes list
        ArrayList<Hero> heroes = new ArrayList<Hero>();

        Hero widow = new Hero("Black Widow", 34);
        Hero captain = new Hero("Captain America", 100);
        Hero vision = new Hero("Vision", 3);
        Hero iron = new Hero ("Iron Man", 48);
        Hero witch = new Hero("Scarlet Witch", 29);
        Hero thor = new Hero("Thor", 1500);
        Hero spider = new Hero("Spider-Man", 18);
        Hero hulk = new Hero("Hulk", 49);
        Hero doctor = new Hero("Doctor Strange", 42);

        // TODO 2 : Add those heroes to the list

        heroes.add(widow);
        // name: Captain America, age: 100
        heroes.add(captain);
        // name: Vision, age: 3
        heroes.add(vision);
        // name: Iron Man, age: 48
        heroes.add(iron);
        // name: Scarlet Witch, age: 29
        heroes.add(witch);
        // name: Thor, age: 1500
        heroes.add(thor);
        // name: Spider-Man, age: 18
        heroes.add(spider);
        // name: Hulk, age: 49
        heroes.add(hulk);
        // name: Doctor Strange, age: 42
        heroes.add(doctor);

        // TODO 3 : It's Thor birthday, now he's 1501
        thor.setAge(1501);



        // TODO 4 : Shuffle the heroes list
        Collections.shuffle(heroes);

        // TODO 5 : Keep only the half of the list
            List<Hero> heroestwo = heroes.subList(0, heroes.size()/2);

        // TODO 6 : Loop throught the list and display the name of the remaining heroes
        for (int i = 0; i < heroestwo.size(); i++) {
            Hero current = heroestwo.get(i);
            System.out.println(current.getName());
        }
    }
}