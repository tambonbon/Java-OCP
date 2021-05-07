public class Test1 {
    
    static class A {
        public void doA(int k) throws Exception {
           for (int i = 0; i < 10; i++) {
               if (i == k) throw new Exception("Index of k is: " + k);
           } 
        }

        public void doB(boolean f) {
            try {
                if(f) {
                    doA(15);
                }
                else return;
            } catch( Exception exception) {

            }            
        }

        public void doC(boolean f) throws Exception {
            if(f) {
                doA(10);
            } else return;
        }

        public static void main(String[] args) throws Exception {
            // main has to throws Exception because doC declares Exception
            // while doB handles Exception by try/catch ---> NOT required to declare 
            A a = new A();
            a.doB(args.length > 10);
            A a2 = new A();
            a.doC(args.length == 0);
        }
    }
}
