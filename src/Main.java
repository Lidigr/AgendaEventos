import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.ZoneOffset;

public class Main {

    public static void main(String[] args) {

        //Data e hora atuais
     LocalDateTime dataAtual = LocalDateTime.now();

       // Obtendo o dia da semana atual
     DiaDaSemana dia = DiaDaSemana.values()[dataAtual.getDayOfWeek().getValue() - 1];

       //Criando o evento
     Evento evento = new Evento("Reunião de Projeto", dataAtual, dia);

       //Exibindo o evento
     System.out.println("===EVENTO===");
     evento.exibirEvento();

       //Adicionando a cinco dias
     LocalDateTime novaData = evento.getDataHora().plusDays(5);

     System.out.println("\n===EVENTO APÓS 5 DIAS===");
     System.out.println("Nova data e hora: " + novaData);

       //Defininddo os fusos horários
        ZoneId saoPaulo = ZoneId.of("America/Sao_Paulo");
        ZoneId gmt = ZoneId.of("GMT");

       //Associando o horário atual ao fuso de São Paulo
        ZonedDateTime horarioSaoPaulo = evento.getDataHora().atZone(saoPaulo);

       //Convertendo para  GMT
        ZonedDateTime horarioGmt = horarioSaoPaulo.withZoneSameInstant(gmt);

       //Exibindo conversões
       System.out.println("\n=== CONVERSÃO DE FUSOS ===");

       System.out.println("Horário de São Paulo: " + horarioSaoPaulo);

       System.out.println("Horário GMT: " + horarioGmt);
    }
}
