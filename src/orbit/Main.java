package orbit;

import orbit.motors.MotorController;
import orbit.motors.MotorControllerFactory;

public final class Main {
    public static void main(final String[] args) {
        final MotorController talon = MotorControllerFactory.talon();
        final MotorController spark = MotorControllerFactory.spark();
        talon.setPower(0.4f);
        spark.setPower(0.2f);
        System.out.println("Success!");
    }
}
