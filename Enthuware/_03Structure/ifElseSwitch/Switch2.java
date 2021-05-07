package Enthuware._03Structure.ifElseSwitch;

public class Switch2 {
    public void switchString(String input) {
        switch (input) {
            case "a": System.out.println("apple");
            case "b": System.out.println("bat");
                break;
            default: System.out.println("none"); break;
            case "B": System.out.println("big bat"); 
            case "c": System.out.println("cat");
        }
    }

    public static void main(String[] args) {
        var sw = new Switch2();
        sw.switchString("B"); // big bat cat
    }

    /**
     * Basically, it looks for a matching case, or if no match is found...
     * .. ---> it goes to default (if default is also not found, does nothing)
     * .. ---> then execute the statements till it reaches a break, or end the switch statement
      */
}
