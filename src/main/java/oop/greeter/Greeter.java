package oop.greeter;

public class Greeter {

    private String time = "";
    public String greet(String name) {
        String correctedName = name.trim();
        String result = capitalizeName(correctedName);
        String prefixGreeting = "Hello";
        if (this.time.equals("06:00")) {
            prefixGreeting = "Good morning";
        }
        return String.format("%s %s", prefixGreeting, result);
    }

    private static String capitalizeName(String name) {
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }

    public void setTime(String time) {
        this.time = time;
    }
}
