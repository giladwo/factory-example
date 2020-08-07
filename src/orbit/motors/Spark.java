package orbit.motors;

final class Spark implements MotorController {
    @Override
    public void setPower(final float power) {
        System.out.println("I'm a Spark, running @ " + power + "%!");
    }
}
