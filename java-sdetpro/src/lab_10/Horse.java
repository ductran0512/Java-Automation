package lab_10;

import java.security.SecureRandom;

public class Horse extends Animal {
    public Horse(int maxSpeed) {
        int randomSpeed = new SecureRandom().nextInt(maxSpeed);
        this.name = "Horse";
        this.speed = randomSpeed;
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }
}
