package lab_07_02;

import java.security.SecureRandom;

public class Tiger extends Animal {
    public Tiger(int maxSpeed) {
        int randomSpeed = new SecureRandom().nextInt(maxSpeed);
        this.name = "Tiger";
        this.speed = randomSpeed;
    }
}
