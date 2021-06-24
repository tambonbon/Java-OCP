package Enthuware._10StreamsLambda.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReference3 {
    
    static class Names {
        private List<String> list; 
        public List<String> getList() {
            return list;
        }
        public void setList(List<String> list) {
            this.list = list;
        }
        public void printName() {
            System.out.println(getList());
        }
    } 

    public static void main(String[] args) {
        List<String> list = Arrays.asList(
            "Bob", "Dob", "Hob"
        );

        Names names = new Names();

        names.setList(list.stream().collect(Collectors.toList()));

        names.getList().forEach(Names::printName); // invalid..
        // method printName NOT take any argument..
        // but forEach requires a method taking an argument !
    }
}
