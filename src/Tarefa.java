public class Tarefa {

    String nome;
    String descricao;
    int prioridade;
    String responsavel;
    double horasEstimadas;
    int status;

    public Tarefa(String nome, String descricao, int prioridade, String responsavel, double horasEstimadas, int status) {
        this.nome = nome;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.responsavel = responsavel;
        this.horasEstimadas = horasEstimadas;
        this.status = status;
    }

    public void imprimirCartao() {
        IO.println("------ TAREFA CRIADA ------");
        IO.println("Nome: " + nome);
        IO.println("Descricao: " + descricao);
        IO.print("Prioridade: ");
        for (int aux = 0; aux < prioridade; aux++) {
            IO.print("*");
        }
        IO.println();
        IO.println("Responsavel: " + responsavel);
        IO.println("Horas Estimadas: " + horasEstimadas);
        String statusNome;
        switch (status) {
            case 1 -> statusNome = "Pendente";
            case 2 -> statusNome = "Em Andamento";
            case 3 -> statusNome = "Conclu├¡da";
            case 4 -> statusNome = "Cancelada";
            default -> statusNome = "Status Inv├ílido";
        }
        IO.println("Status: " + statusNome);
        IO.println("---------------------------");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public double getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(double horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
