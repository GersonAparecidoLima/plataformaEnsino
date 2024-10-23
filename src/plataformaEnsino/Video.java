package plataformaEnsino;

class Video extends Lesson {
    private String url;   // Atributo privado para URL
    private int seconds;  // Atributo privado para duração em segundos

    // Construtor
    public Video(String title, String url, int seconds) {
        super(title); // Chama o construtor da classe pai
        this.url = url;
        this.seconds = seconds;
    }

    // Método para obter a URL
    public String getUrl() {
        return url;
    }

    // Implementação do método abstrato duration da classe Lesson
    @Override
    public int duration() {
        return seconds; // Retorna a duração do vídeo em segundos
    }
}
