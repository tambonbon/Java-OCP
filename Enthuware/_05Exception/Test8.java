public class Test8 {
    public static void main(String[] args) throws Exception {
        int[] array = null;
        int i = array[m1()];
        // NullPointerExcep NEVER OCCURS bc index expression MUST completely evaluated
        // before any part of indexing operation occurs
        // If array reference expression produces null instead of a reference to array,
        // then NPE is thrown at RT, BUT ONLY AFTER all parts of array reference expr been evaluated
        // and only if these evaluations completed normally.

        // The expr. to the LEFT of brackets appears to be fully evaluated BEFORE any part
        // of the expr. within brackets is evaluated
        // If evaluation of expr. to the left of bracket completes abrubtly
        // ---> no part of expr. within the blankets evaluated

        // Here, m1() is called first ---> throws Exception ---> array is never accessed
        // -----> NPE NEVER THROWN !!!! <-----
    }
    public static int m1() throws Exception {
        throw new Exception("Some exception");
    }
    /* Meaning of "expr. to the left of brackets appears to be fully evaluated":
    Consider:
    Object o = getArray()[getIndex()];
    1. Expr. to the left of brackets eval first ---> getArray() will be called
        ---> gives reference to array
        * It could be null as well
        * If getArray() throws exception ---> rest of stmt NOT eval
    2. Now, the expr. in bracket is evaluated ---> getIndex() will be called
        * If getIndex() throws exception ---> 3 NOT happen
    3. Finally, index will be applied on array (whose reference was returned in 1)
        * If array reference is NULL ---> get NPE 
        
    */
}
