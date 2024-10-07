import java.util.ArrayList;
import java.util.List;

abstract class Animal {
    public abstract boolean canSwim();
    public abstract boolean canWalk();
    public abstract String getName();
}

class Pig extends Animal {
    @Override
    public boolean canSwim() {
        return false;
    }

    @Override
    public boolean canWalk() {
        return true;
    }

    @Override
    public String getName() {
        return "Pig";
    }
}

class Duck extends Animal {
    @Override
    public boolean canSwim() {
        return true;
    }

    @Override
    public boolean canWalk() {
        return true;
    }

    @Override
    public String getName() {
        return "Duck";
    }
}

class Fish extends Animal {
    @Override
    public boolean canSwim() {
        return true;
    }

    @Override
    public boolean canWalk() {
        return false;
    }

    @Override
    public String getName() {
        return "Fish";
    }
}

class Farm {
    private List<Animal> animals;

    public Farm() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void printAnimalsThatCanSwimOrWalk() {
        for (Animal animal : animals) {
            if (animal.canSwim() || animal.canWalk()) {
                System.out.println(animal.getName());
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Farm farm = new Farm();
        farm.addAnimal(new Pig());
        farm.addAnimal(new Duck());
        farm.addAnimal(new Fish());

        farm.printAnimalsThatCanSwimOrWalk();
    }
}
