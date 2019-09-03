package OOP;
public class Fan{
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    boolean isOn = false;
    private double radius = 5;
    private String color = "blue";
    private int getSpeed() {
        return this.speed;
    }
    private void setSpeed(int newSpeed) {
            this.speed = newSpeed;
    }
    private double getRadius() {
        return this.radius;
    }
    private void setRadius(double newRadius) {
        this.radius = newRadius;
    }
    private String getColor() {
        return this.color;
    }
    private void setColor (String newColor) {
        this.color = newColor;
    }
    private boolean getIsOn(){
        return this.isOn;
    }
    private void setStatus() {
        this.isOn = !this.isOn;
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setStatus();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        System.out.println("Fan1 is on , color :" + fan1.getColor() +",speed " + fan1.getSpeed() + ",radius " + fan1.getRadius());

        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.MEDIUM);
        System.out.println("Fan2 is off ,color :" + fan2.getColor() + ",speed " + fan2.getSpeed() + ",radius " + fan2.getRadius());



    }



}