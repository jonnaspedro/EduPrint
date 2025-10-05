public class Main {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Havana Alves", "havana@ifpe.com");
        Professor prof2 = new Professor("Carolina Torres", "carolinatorres@ifpe.com");
        
        Disciplina d1 = new Disciplina("Programação Orientada a Objetos", 80);
        Disciplina d2 = new Disciplina("Banco de Dados", 60);
        
        d1.setProfessor(prof1);
        d2.setProfessor(prof2);
        
        prof1.setDisciplinaResponsavel(d1);
        prof2.setDisciplinaResponsavel(d2);

        Material m1 = new Material("Apostila Java", "PDF");
        Material m2 = new Material("Slides Banco de Dados", "PPT");
        Material m3 = new Material("Exercícios de POO", "DOCX");
        Material m4 = new Material("Modelo de ER", "Imagem");

        d1.adicionarMaterial(m1);
        d1.adicionarMaterial(m3);
        d2.adicionarMaterial(m2);
        d2.adicionarMaterial(m4);

        Curso curso1 = new Curso("Desenvolvimento de Sistemas");
        Curso curso2 = new Curso("Informática para Internet");
        
        curso1.adicionarDisciplina(d1);
        curso1.adicionarDisciplina(d2);
        curso2.adicionarDisciplina(d2);

        Aluno a1 = new Aluno("João Pedro", "joao@aluno.com", "2025001");
        Aluno a2 = new Aluno("Maria Fernanda", "maria@aluno.com", "2025002");

        a1.getDisciplinas().add(d1);
        a1.getDisciplinas().add(d2);

        a2.getDisciplinas().add(d2);

        AlunoDisciplina ad1 = new AlunoDisciplina(a1, d1, 8.5);
        AlunoDisciplina ad2 = new AlunoDisciplina(a1, d2, 9.0);
        AlunoDisciplina ad3 = new AlunoDisciplina(a2, d2, 7.5);

        System.out.println("professores");
        prof1.imprimirDados();
        prof2.imprimirDados();

        System.out.println("\nDisciplinas");
        System.out.println("Disciplina: " + d1.getNomeDisciplina() + " | Professor: " + d1.getProfessor().getNome());
        System.out.println("Materiais:");
        for (Material m : d1.getMateriais()) {
            System.out.println(" - " + m.getNomeMaterial() + " (" + m.getTipo() + ")");
        }
        System.out.println();

        System.out.println("Disciplina: " + d2.getNomeDisciplina() + " | Professor: " + d2.getProfessor().getNome());
        System.out.println("Materiais:");
        for (Material m : d2.getMateriais()) {
            System.out.println(" - " + m.getNomeMaterial() + " (" + m.getTipo() + ")");
        }

        System.out.println("\nAlunos");
        a1.imprimirDados();
        System.out.println();
        a2.imprimirDados();

        System.out.println("\nNotas");
        System.out.println(a1.getNome() + " - " + ad1.getDisciplina().getNomeDisciplina() + ": " + ad1.getNota());
        System.out.println(a1.getNome() + " - " + ad2.getDisciplina().getNomeDisciplina() + ": " + ad2.getNota());
        System.out.println(a2.getNome() + " - " + ad3.getDisciplina().getNomeDisciplina() + ": " + ad3.getNota());
    }
}
