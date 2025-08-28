public class Smartphone implements MusicPlayer {
    @Override
    public void play() {
        System.out.println("O telefone esta tocando música");
    }

    @Override
    public void stop() {
        System.out.println("O telefone esta parando a música");
    }

    @Override
    public void pause() {
        System.out.println("O telefone está pausando a música");
    }
}
