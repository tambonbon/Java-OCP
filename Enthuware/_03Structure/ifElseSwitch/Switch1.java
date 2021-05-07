package Enthuware._03Structure.ifElseSwitch;

public class Switch1 {
    public void switchString(String input) {
        switch (input) {
            case "b": System.out.println("bat");
                break;
            case "B": System.out.println("big bat"); 
            
            // since there is no break after this case and next case ...
            // .. the control will fall through the next one (which is default: )
            case "c": System.out.println("cat");
            default: System.out.println("none");
            case "a": System.out.println("apple");

        }
    }

    public static void main(String[] args) {
        var sw = new Switch1();
        sw.switchString("B"); // big bat cat none apple
    }
}


