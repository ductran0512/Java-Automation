package lab_07_02;

import java.security.SecureRandom;

public class Dog extends Animal {
    public Dog(int maxSpeed) {
        int randomSpeed = new SecureRandom().nextInt(maxSpeed);
        this.name = "Dog";
        this.speed = randomSpeed;
    }
}
