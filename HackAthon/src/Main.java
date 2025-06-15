public class Main {
    public static void main(String[] args){
        
        //*Cria universidade
        Universidade universidade = new Universidade("Grand Genius University","12.345.678/9123-45");


        //*Adicionar alunos/estudantes(10);
        Estudante estudante = new Estudante("Paulo","000.000.00-00",universidade, "Enegenharia de software", 7);
         Estudante estudante1 = new Estudante("Maria","111.111.11-11",universidade, "Análise e desenvolvimento de sistemas", 2);
        Estudante estudante2 = new Estudante("João","222.222.22-22",universidade, "Sistemas de  informação", 1);
        Estudante estudante3 = new Estudante("Ana","333.333.33-33",universidade, "Sistemas de  informação", 5);
        Estudante estudante4 = new Estudante("Lucas","444.444.44-44",universidade, "Ciencias da computação", 5);
        Estudante estudante5 = new Estudante("Fernanda","555.555.55-55",universidade, "Análise e desenvolvimento de sistemas", 2);
        Estudante estudante6 = new Estudante("Carlos","666.666.66-66",universidade, "Ciencias da computação", 7);
        Estudante estudante7 = new Estudante("Juliana","777.777.77-77",universidade, "Ciencias da computação", 8);
        Estudante estudante8 = new Estudante("Pedro","888.888.88-88",universidade, "Enegenharia de software", 3);
        Estudante estudante9 = new Estudante("Italo","999.999.99-99",universidade, "Enegenharia de software", 3);
        

        //*adicionar Orientadores

        Profissional orientador1 = new Orientador("Daniel", "000.000.000-21", universidade, "Professor", "Ciencias da computação");

        Profissional orientador2 = new Orientador("Gisele", "000.000.000-41", universidade, "Professora", "Engenharia de Software");

        //*criar equipes
        //equipe um
        Equipe equipea = new Equipe("Java-li");
        equipea.adicionarEstudante(estudante2);
        equipea.adicionarEstudante(estudante4);
        equipea.adicionarEstudante(estudante5);
        equipea.adicionarEstudante(estudante8);
        equipea.adicionarEstudante(estudante9);

        //equipe dois
        Equipe equipeb = new Equipe("C-shark");
        equipeb.adicionarEstudante(estudante1);
        equipeb.adicionarEstudante(estudante3);
        equipeb.adicionarEstudante(estudante6);
        equipeb.adicionarEstudante(estudante7);
        equipeb.adicionarEstudante(estudante);
        
        //*Criar projetos
        //Projeto Um
        Projeto projeto1 = new Projeto("ShopMaster", "Aplicativo para gestão de lojas e comércios, com funcionalidades para cadastro de produtos, controle de estoque, registro de vendas, geração de relatórios e gerenciamento de clientes. Perfeito para pequenos e médios negócios que desejam otimizar suas operações comerciais.", orientador1, equipea);

        Projeto projeto2 = new Projeto("EventPlanner", "Um sistema para organização e gerenciamento de eventos, permitindo cadastrar eventos, controlar participantes, agendar datas, reservar salas e enviar notificações automáticas. Ideal para empresas, escolas ou grupos que precisam planejar e acompanhar eventos de forma eficiente.", orientador2, equipeb);

        //*Adicionar jurados
        Jurado jurado1 = new Jurado("Roberto", "111.222.333-44", universidade, "Professor", "Banco de Dados");
        Jurado jurado2 = new Jurado("Patricia", "222.333.444-55", universidade, "Professora", "Redes");
        Jurado jurado3 = new Jurado("Marcos", "333.444.555-66", universidade, "Professor", "Algoritmos");
        Jurado jurado4 = new Jurado("Luciana", "444.555.666-77", universidade, "Professora", "Engenharia de Software");
        Jurado jurado5 = new Jurado("Felipe", "555.666.777-88", universidade, "Professor", "Inteligência Artificial");
        Jurado jurado6 = new Jurado("Renata", "666.777.888-99", universidade, "Professora", "Sistemas Operacionais");
        Jurado jurado7 = new Jurado("Thiago", "777.888.999-00", universidade, "Professor", "Estruturas de Dados");
        Jurado jurado8 = new Jurado("Camila", "888.999.000-11", universidade, "Professora", "Programação Orientada a Objetos");
        

        //*Criando bancas
        Banca banca1 = new Banca(projeto1);
        banca1.adicionarJurado(jurado1, 8);
        banca1.adicionarJurado(jurado2, 9);
        banca1.adicionarJurado(jurado3, 10);
        banca1.adicionarJurado(jurado4, 10);
        Banca banca2 = new Banca(projeto2);
        banca2.adicionarJurado(jurado5, 9);
        banca2.adicionarJurado(jurado6, 9);
        banca2.adicionarJurado(jurado7, 10);
        banca2.adicionarJurado(jurado8, 8);
    
        //*Criando sala
        Sala sala1 = new Sala(101, 30); 
        
        //*Adicionar equipes às coleções Singleton
        Equipes.getInstancia().adicionar(equipea);
        Equipes.getInstancia().adicionar(equipeb);

        //*Criando apresentações e adicionando à coleção Singleton
        Apresentacao apresentacao1 = new Apresentacao(projeto1, banca1, sala1, java.time.LocalDateTime.now());
        Apresentacao apresentacao2 = new Apresentacao(projeto2, banca2, sala1, java.time.LocalDateTime.now());
        Apresentacoes.getInstancia().adicionar(apresentacao1);
        Apresentacoes.getInstancia().adicionar(apresentacao2);

        //*Avaliando as apresentações (isso calcula e define a nota final do projeto)
        apresentacao1.avaliar();
        apresentacao2.avaliar();
        
        //*Listando projetos com nota final >= 7 usando stream
        System.out.println("Projetos aprovados:");
        Apresentacoes.getInstancia().getLista().stream()
            .map(a -> a.getProjeto())
            .filter(p -> p.getNotaFinal() >= 7)
            .forEach(p -> System.out.println(
                p.getTitulo() + " - Equipe: " + p.getEquipe().getNomeEquipe() + " - Nota: " + p.getNotaFinal()
            ));
    }
}
