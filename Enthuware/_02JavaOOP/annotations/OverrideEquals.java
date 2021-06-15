package Enthuware._02JavaOOP.annotations;

public class OverrideEquals {
    private String s;

    @Override
    public boolean equals(OverrideEquals obj) {
        /**
         * This equals NOT overrided correctly
         * The argument to equals should be of type Object and NOT the class to be called
         */
        return this.s != null && this.s.equals(obj.s);
    }
}
