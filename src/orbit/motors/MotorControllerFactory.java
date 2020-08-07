package orbit.motors;

public final class MotorControllerFactory {
    public static MotorController spark() {
        return new Spark();
    }

    public static MotorController talon() {
        return new Talon();
    }
}
