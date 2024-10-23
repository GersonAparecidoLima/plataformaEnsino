package plataformaEnsino;

class Task extends Lesson {
    private String description;   // Atributo privado para a descrição
    private int questionCount;     // Atributo privado para o número de questões

    // Construtor
    public Task(String title, String description, int questionCount) {
        super(title); // Chama o construtor da classe pai
        this.description = description;
        this.questionCount = questionCount;
    }

    // Método para obter a descrição
    public String getDescription() {
        return description;
    }

    // Implementação do método abstrato duration da classe Lesson
    @Override
    public int duration() {
        return questionCount * 300; // Cada questão leva 5 minutos (300 segundos)
    }
}