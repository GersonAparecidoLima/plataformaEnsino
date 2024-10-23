package plataformaEnsino;


//Classe abstrata Lesson
abstract class Lesson {
 private String title; // Atributo privado para o título

 // Construtor
 public Lesson(String title) {
     this.title = title;
 }

 // Método para obter o título
 public String getTitle() {
     return title;
 }

 // Método abstrato para a duração
 public abstract int duration(); // Deve ser implementado pelas subclasses
}