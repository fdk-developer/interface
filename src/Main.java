//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // nao pode fazer isso pois é uma interface, e elas são abstratas
        //var musica = new MusicPlayer()
        var musica = MusicPlayer.music;

        // estancia declarada em runtime
        /*
        var musicPlayer1 = new MusicPlayer() {
            @Override
            public void play() {
                System.out.print("Tocando a música");
            }

            @Override
            public void stop() {
                System.out.println("Parando a música");

            }

            @Override
            public void pause() {
                System.out.println("Pausando a música");

            }
        };
        musicPlayer1.play();
        */

        MusicPlayer telefone1 = new Smartphone();
        runMusic(telefone1);

    }

    public static void runMusic(MusicPlayer musicPlayer1) {
        musicPlayer1.play();
    }


}