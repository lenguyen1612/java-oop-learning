package lesson07_1.testcases;

import lesson07_1.animals.Bird;
import lesson07_1.animals.Dog;
import lesson07_1.animals.Tiger;
import lesson07_1.imp.BirdBuilder;
import lesson07_1.imp.DogBuilder;
import lesson07_1.imp.TigerBuilder;
import lesson07_1.manager.Manager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Winner {

    public static void main(String[] arg){
        DogBuilder dogBuilder = new DogBuilder();
        TigerBuilder tigerBuilder = new TigerBuilder();
        BirdBuilder birdBuilder = new BirdBuilder();

        Manager manager = new Manager();
        Dog dog = manager.constructDog(dogBuilder);
        Tiger tiger = manager.constructTiger(tigerBuilder);
        Bird bird = manager.constructBird(birdBuilder);

        HashMap<Object,Integer> listAnimal = new HashMap<Object,Integer>();
        listAnimal.put(dog.getName(), dog.getRandomSpeed());
        listAnimal.put(tiger.getName(), tiger.getRandomSpeed());
        listAnimal.put(bird.getName(), bird.getRandomSpeed());

        HashMap<Object,Boolean> listFlyStatus = new HashMap<Object,Boolean>();
        listFlyStatus.put(dog.getName(), dog.isFly());
        listFlyStatus.put(tiger.getName(), tiger.isFly());
        listFlyStatus.put(bird.getName(), bird.isFly());

        System.out.println("randomSpeed: " + listAnimal);

        int max = 0;
        Object winner = null;
        List<Object> invalidAnimal = new ArrayList<Object>();
        for (Map.Entry map : listFlyStatus.entrySet()){
            if((boolean)map.getValue() == true){
                invalidAnimal.add(map.getKey());
            }
        }
        for(Map.Entry map : listAnimal.entrySet()){
            if(max <= (int)map.getValue() && !invalidAnimal.contains(map.getKey())){
                max = (int) map.getValue();
                winner = map.getKey();
            }
        }

        System.out.println("The winner is: " + winner.toString() + " with random speed: " + max);
    }

}
