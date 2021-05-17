package Enthuware._01String;

public class SettingLocalRefToNullNotAffect {
    public void reference(String string, StringBuilder stringBuilder) {
        string = string + stringBuilder.toString();
        stringBuilder.append(string);

        string = null;
        stringBuilder = null;
    }

    public static void main(String[] args) {
        String string = "aaa";
        StringBuilder stringBuilder = new StringBuilder("bbb");
        new SettingLocalRefToNullNotAffect().reference(string, stringBuilder);
        System.out.println("string = " + string + " string builder = " + stringBuilder); // aaa bbbaaabbb
        /* 
        Setting local reference in reference method to null...
        ... NOT affect the variables of main method !
         */
    }
}
