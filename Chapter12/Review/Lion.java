package Chapter12.Review;

public class Lion {
    class Cub {}
    static class Den {}
    static void rest() {
        Cub a = Lion.new Cub();
        // Lion cub = new Lion();
        Lion.Cub b = new Lion().Cub();
        Lion.Cub c = new Lion.new Cub();
        var d = new Den();
        var e = Lion.new Cub();
        Lion.Den f = Lion.new Den();
        Lion.Den g = new Lion.Den();
        var h = new Cub();
        var i = new Lion();
        Lion.Cub j = new Lion().Cub;
    }
}
