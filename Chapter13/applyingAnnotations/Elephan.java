package Chapter13.applyingAnnotations;

public abstract class Elephan {
    @Injured("leg") public void fallDown() {}
    @Injured(value = "hand")
    public void fallUp() {}
}
