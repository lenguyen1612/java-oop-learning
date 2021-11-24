package lesson07_1.manager;

import lesson07_1.animals.Bird;
import lesson07_1.animals.Dog;
import lesson07_1.animals.Tiger;
import lesson07_1.components.KindsOfDog;
import lesson07_1.imp.BirdBuilder;
import lesson07_1.imp.DogBuilder;
import lesson07_1.imp.TigerBuilder;

public class Manager {

    public Dog constructDog(DogBuilder animalBuilder) {
        animalBuilder.setName("Tô");
        animalBuilder.setFly(false);
        animalBuilder.setMaxSpeed(60);
        animalBuilder.setKindOfDog(KindsOfDog.BULLDOG);
        return animalBuilder.defineDog();
    }

    public Tiger constructTiger(TigerBuilder animalBuilder) {
        animalBuilder.setName("Jiba");
        animalBuilder.setFly(false);
        animalBuilder.setMaxSpeed(100);
        animalBuilder.setLeaving("Zoo");
        return animalBuilder.defineTiger();
    }

    public Bird constructBird(BirdBuilder animalBuilder) {
        animalBuilder.setName("Crow");
        animalBuilder.setFly(true);
        animalBuilder.setMaxSpeed(100);
        animalBuilder.setColor("Black");
        return animalBuilder.defineBird();
    }
}
