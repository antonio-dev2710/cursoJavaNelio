package expressaoLabda.exercicio02;

public class Dados {
    String name;
    String email;

    Double salario;

    public Dados(String name, String email, Double salario) {
        this.name = name;
        this.email = email;
        this.salario = salario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Dados [name=" + name + ", salario=" + salario + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    
}
