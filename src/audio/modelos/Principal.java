package audio.modelos;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setArtista("Kiss");

        for(int i = 0; i < 100; i++){
            minhaMusica.reproduzir();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curtir();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Bolha dev");
        meuPodcast.setHost("Marcus Mendes");

        for (int i = 0; i < 70; i++) {
         meuPodcast.reproduzir();
         meuPodcast.curtir();
        }

        System.out.println(minhaMusica.getTotalCurtidas());
    }
}
