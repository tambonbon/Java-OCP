package Enthuware._02JavaOOP.fieldsMethods;

public class Test2 {
    void m1(){
        m3();
        this.m3(); // this can only be used in instance methods (not static)
        // Test2.m3(); // WRONG

        m2();
        Test2.m2();       
        this.m2();        
    }

    static void m2(){ 
        new Test2().m1();
        Test2.m4();
    }
    
    void m3() {

    }

    static void m4() { }
}
