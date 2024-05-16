package br.edu.up.models;

public class Segurado {
    private enum Sexo {
        MASCULINO, FEMININO
    }

    private String nome;
    private String RG;
    private String CPF;
    private Sexo sexo;
    private String telefone;
    private String endereco;
    private String CEP;
    private String cidade;

    public String getNome() {
        return nome;
    }

    public String getRG() {
        return RG;
    }

    public String getCPF() {
        return CPF;
    }

    public String getSexo() {
        if (sexo != null) {
            return sexo.name();
        } else {
            return "Sexo não definido";
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCEP() {
        return CEP;
    }

    public String getCidade() {
        return cidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setSexo(String sexo) {
        // Verifica se o sexo fornecido é válido
        if (sexo.equalsIgnoreCase("MASCULINO")) {
            this.sexo = Sexo.MASCULINO;
        } else if (sexo.equalsIgnoreCase("FEMININO")) {
            this.sexo = Sexo.FEMININO;
        } else {
            System.out.println("Sexo inválido");
        }
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getDados() {
        return "Nome: " + this.nome + "\n" +
                "RG: " + this.RG + "\n" +
                "CPF: " + this.CPF + "\n" +
                "Sexo: " + this.getSexo() + "\n" +
                "Telefone: " + this.telefone + "\n" +
                "Endereço: " + this.endereco + "\n" +
                "CEP: " + this.CEP + "\n" +
                "Cidade: " + this.cidade;
    }

}
