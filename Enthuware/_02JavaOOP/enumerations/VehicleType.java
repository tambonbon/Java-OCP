package Enthuware._02JavaOOP.enumerations;

public enum VehicleType {
    SUV, SEDAN, VAN, SPORTSCAR;

    public VehicleType() { } 
    /**
     * 1. Enum constructors is always private
     * 2. An enum is implicitly final
     * 3. CANT extend enum from another enum or class 
     * 4. Provide 2 public static methods automatically: values() and valueOf(String)
     * values(): return array of its constants
     * valueOf(): tries to match the String argument exactly with enum constant...
     * ... and returns that constant if successful or throw IllegalArgumentExcep
     * 5. CAN implement interface and Serializable
      */

      /** java.lang.Enum:
       * 1. Implements java.lang.Comparable ---> can be added to sort collections e.g. SortedSet, TreeSet
       * 2. Has method ordinal(), returns the index (starting with 0)
       * 3. Has method name(), returns name of this enum constant
       * 4. Clone method: final
        */
}
