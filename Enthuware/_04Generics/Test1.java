package Enthuware._04Generics;

    
class Game {}
class Cricket extends Game {}
class Instrument {}
class Guitar extends Instrument {}

interface Player<E> {
    void play(E e);   // because play is not a generic method 
    // (if it was, it MUST have <E> before void)
    // so E here refers to the same type from interface Player
     
    // void run(E e);
    // <E> void jump(E e);
}

interface GamePlayer<E extends Game> extends Player<E> { }
// GamePlayer stipulates that it be typed with a class extending Game (e.g. E)
// and that Player be typed to EXACT same type E

interface MusicPlayer<E extends Instrument> extends Player { } // raw types
// MusicPlayer extends plain untyped Player
// ---> it gets abstract method play(Object j)
// ---> any  non-abstract class implementing MusicPlayer MUST have play(Object) method

interface MusicPlayer2<E extends Instrument> extends Player<Instrument> { }
// Look, the method extends Player<Instrument>
// so it MUST implement play(Instrument) from Player
interface MusicPlayer3<E extends Instrument> extends Player<E> { }

class Batman1 implements MusicPlayer<Guitar> {
    @Override
    public void play(Object e) {
    }
}

class Batman2 implements GamePlayer<Cricket> {
    @Override
    public void play(Cricket e) {
    }
}

class Batman3 implements GamePlayer<Game> {
    @Override
    public void play(Game e) {
    }
}

class Batman4 implements MusicPlayer2<Guitar> {
    @Override
    public void play(Instrument e) { // CANT be Guitar
    }
}