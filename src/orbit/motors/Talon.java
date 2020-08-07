package orbit.motors;

final class Talon implements MotorController {
    @Override
    public void setPower(final float power) {
        System.out.println("I'm a Talon, running @ " + power + "%!");
    }
}
