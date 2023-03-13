import java.util.ArrayList;

public class Main {

//    Instanciação dos Objetos
    public static void main(String[] args){
        Filme film1 = new Filme(1,"Cada um Tem a Gêmea que Merece", "Jack, um publicitário de sucesso com uma linda família, enlouquece com a visita de sua irmã gêmea Jill no dia de Ação de Graças. As coisas ficam ainda mais fora de controle quando Jill decide ficar mais tempo.", "comédia", 90, 2011, "", "Dennis Dugan", new String[]{"Adam Sandler", "Al Pacino", "Katie Holmes"});
        Filme film2 = new Filme(2, "High School Musical", "Estudantes conspiram contra uma estrela do basquete e uma tímida novata, para evitar que eles cantem em uma produção musical.", "Musical/Comédia", 90, 2006, "", "Kenny Ortega", new String[]{"Zac Efron", "Vanessa Hudgens", "Ashley Tisdale", "Corbin Blue", "Lucas Grabeel"});
        Filme film3 = new Filme(3,"As Branquelas", "Dois irmãos agentes do FBI, Marcus e Kevin Copeland, acidentalmente evitam que bandidos sejam presos em uma apreensão de drogas. Como castigo, eles são forçados a escoltar um par de socialites nos Hamptons. Quando as meninas descobrem o plano da agência, elas se recusam a ir. Sem opções, Marcus e Kevin, dois homens negros, decidem fingir que são as irmãs e se transformam em um par de loiras.","Comédia", 109, 2004, "", "Keenen Ivory Wayans", new String[]{"Marlon Wayans", "Shawn Waynes", "Terry Crews"});
        Filme film4 = new Filme(4, "Se Beber Não Case", "ois dias antes de seu casamento, Doug e três amigos vão de carro até Las Vegas para uma louca e memorável despedida de solteiro. Quando os três padrinhos acordam na manhã seguinte, eles não conseguem se lembrar de nada e notam que Doug desapareceu. Com pouco tempo de sobra, os amigos tentam refazer a noite anterior e encontrar Doug para que possam levá-lo de volta a Los Angeles a tempo de chegar ao altar.", "Comédia", 100, 2009, "",  "Todd Phillips", new String[]{"Bradley Cooper", "Zach Galifianakis", "Ed Helms", "Justin Bartha", "Ken Jeong"});

        Musica music1 = new Musica(1, "Partilhar", "Música romântica", "Indie", 7, 2019, new String[]{"Anavitória", "Rubel"}, 5);
        Musica music2 = new Musica(2, "Ponto de Exclamação", "Remix", "Eletrônica/Indie", 4, 2020, new String[]{"Vintage Culture", "Future Class", "Jovem Dionisio"}, 4);
        Musica music3 = new Musica(3, "When I Was Your Man", "Música Romântica tocada no piano", "Romântica", 4, 2012, new String[]{"Bruno Mars"}, 5);
        Musica music4 = new Musica(4, "Sweater Weather", "Música Sobre um casal", "Indie Rock", 4, 2013, new String[]{"The Neighbourhood"}, 4);

        Ator ator1 = new Ator(1, "Adam Sandler", 1966, "Prêmio Independent Spirit de Melhor Ator", "Masculino", "Adam Richard Sandler é um ator, comediante, produtor, roteirista, dublador e músico norte-americano, de origem judaica. Depois de entrar para o elenco do Saturday Night Live, Sandler passou a estrelar vários filmes de Hollywood que juntos arrecadaram mais de US$ 2 bilhões de dólares nas bilheterias.", "Cinema");
        Ator ator2 = new Ator(2, "Al Pacino", 1940, "Oscar de Melhor Ator", "Masculino", "Alfredo James Pacino é um ator, produtor, roteirista e cineasta norte-americano de origem italiana. É conhecido especialmente por interpretar Michael Corleone na trilogia O Poderoso Chefão e Tony Montana em Scarface.", "Cinema");
        Ator ator3 = new Ator(3, "Ashley Tisdale", 1985, "Sem Premiações", "Feminino", "Ashley Michelle Tisdale é uma atriz, cantora, compositora, produtora, dubladora e modelo norte-americana. Ashley ganhou notoriedade atuando na série The Suite Life of Zack & Cody, do canal Disney Channel, como Maddie Fitzpatrick, ao longo de quatro anos.", "Cinema");
        Ator ator4 = new Ator(4, "Bradley Cooper", 1975, "Sem Premiações", "Masculino", "Bradley Charles Cooper é um ator, cineasta e produtor americano. Começou sua carreira como convidado na série de televisão Sex and the City em 1999.", "Cinema");

        Musico musico1 = new Musico(1, "Ana Clara Caetano Costa", 1994, "Prêmio Multishow de Música Brasileira", "Feminino", "Ana Clara Caetano Costa é uma cantora, atriz, compositora e multi-instrumentista brasileira, integrante do duo musical Anavitória, com Vitória Falcão.", "Vocal");
        Musico musico2 = new Musico(2, "Vitória Fernandes Falcão", 1995, "Prêmio Multishow de Música Brasileira", "Feminino", "Vitória Fernandes Falcão é uma cantora e atriz brasileira.", "Vocal");
        Musico musico3 = new Musico(3,"Lukas Ruiz Hespanhol (Vintage Culture)", 1993, "Melhor DJ de House Music", "Masculino", "Lukas Ruiz Hespanhol, mais conhecido como Vintage Culture, é um DJ, empresário e produtor brasileiro de música eletrônica do gênero house music.", "DJ");
        Musico musico4 = new Musico(3, "Bruno Mars",1985, "Grammy Award: Canção do Ano, Gravação do Ano, Álbum do Ano...", "Masculino", "Peter Gene Hernandez, mais conhecido pelo nome artístico Bruno Mars é um cantor, compositor, produtor musical, dançarino e multi-instrumentista americano, nascido e criado no Havaí. Vindo de uma família com uma grande tradição musical, Mars começou a cantar e a se apresentar como um artista amador durante a infância.", "Vocal e Piano");

        Biblioteca minhaBiblioteca = new Biblioteca("Lígia");
        Playlist romanticas = new Playlist("romanticas");

        romanticas.adicionar_midia(music1);
        romanticas.adicionar_midia(music2);

        System.out.println(film2.getTipo());
    }


}