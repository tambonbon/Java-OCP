package pond.inland;
import pond.shore.Bird;
public class BirdWatcherFromAfar {
        public void watchBird() {
                Bird bird = new Bird();
                bird.floatInWater();
                System.out.println(bird.text);
        }
}
