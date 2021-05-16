package Enthuware._01String;

public class Trim1 {
    public static void main(String[] args) {
        String blank = " ";
        String line = blank + "hello" + blank + blank;
        line.concat("world");
        System.out.println(line); //  hello , as `line` is NOT changed when concat
        System.out.println((int)line.length()); // 8

        String newLine = line.trim(); 

        System.out.println(newLine); // hello, as `line` is NOT changed when concat
        System.out.println((int)newLine.length()); // 5
        System.out.println((int) (line.length() + newLine.length())); // 13 = 5+8

        String lineStripLead = line.stripLeading();
        System.out.println((int) lineStripLead.length()); // 7 (hello  )

        String lineStripTail = line.stripTrailing();
        System.out.println((int) lineStripTail.length()); // 6 ( hello)
    }
}
