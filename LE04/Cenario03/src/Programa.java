import br.edu.up.models.*;

public class Programa {
    public static void main(String[] args) {
        // Criando uma agenda
        Agenda agenda = new Agenda();

        // Adicionando compromissos
        agenda.adicionarCompromisso(new Compromisso("Reunião de Projeto", "Sala de Conferência", "João", 10, 15, 5, 2024));
        agenda.adicionarCompromisso(new Compromisso("Almoço com Cliente", "Restaurante X", "Maria", 12, 20, 5, 2024));
        agenda.adicionarCompromisso(new Compromisso("Visita Técnica", "Empresa Y", "Carlos", 14, 25, 5, 2024));

        // Listando compromissos
        agenda.listarCompromissos();
    }
}
