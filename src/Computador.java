public class Computador implements MusicPlayer {
    @Override
    public void play() {
        System.out.println("O computador esta tocando música");
    }

    @Override
    public void stop() {
        System.out.println("O computador esta parando a música");
    }

    @Override
    public void pause() {
        System.out.println("O computador está pausando a música");
    }
}
