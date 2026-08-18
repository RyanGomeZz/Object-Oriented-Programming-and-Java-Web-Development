public class Main {
    public static void main(String[] args) {


        Aula aula1 = new Aula();
        aula1.titulo = "INtrodução a POO";
        aula1.Conteudo ="PDF";

        Aula aula2 = new Aula();
        aula1.titulo = " POO Avançado";
        aula1.Conteudo ="PDF";


        Curso SistemaDaInformacao = new Curso();
        SistemaDaInformacao.aulas.add(aula1);
        SistemaDaInformacao.titulo = "SI";
        SistemaDaInformacao.descricao = "melhor curso";
        SistemaDaInformacao.instrutor = "lucas";


        Aluno alunos  = new Aluno();
        alunos.email = "aaa@gmail.com";
        alunos.nome = "Ryan";

        Turma siz = new Turma();
        siz.sigla = "2SIZ";
        siz.curso = SistemaDaInformacao;
        siz.alunos.add(alunos);


        Progresso progressoAtual = new Progresso();
        progressoAtual.aulaAtual = aula1;



        System.out.println(siz.alunos.get(0).nome);
        System.out.println(siz.curso.titulo);

    }
}
