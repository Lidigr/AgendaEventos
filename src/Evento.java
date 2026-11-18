import java.time.LocalDateTime;

public class Evento {
    private String nome;
    private LocalDateTime dataHora;
    private DiaDaSemana diaDaSemana;

    public Evento(String nome, LocalDateTime dataHora,  DiaDaSemana diaDaSemana) {

        this.nome = nome;
        this.dataHora = dataHora;
        this .diaDaSemana = diaDaSemana;
    }
    public void exibirEvento() {
        System.out.println("Nome do evento: " + nome);
        System.out.println("Data e hora: " + dataHora);
        System.out.println("Dia da semana: " + diaDaSemana);
    }
    public LocalDateTime getDataHora() {
        return dataHora;
    }
}
