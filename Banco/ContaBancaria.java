public class ContaBancaria {
    private String nome;
    private double saldo = 0.0;
    private int ID;
    public ContaBancaria(String nome, double saldo, int id) {
        this.nome = nome;
        this.saldo = saldo;
        this.ID = id;

    }
    public String getNome() {
        return nome;
    }
    public double getSaldo() {
        return saldo;
    }
    public int getID() {
        return ID;
    }
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
        else {
            System.out.println("valor invalido");
        }

    }

    public void sacar(double valor) {
            if (valor > 0 && valor <= saldo) {
                saldo -= valor;
            }
            else{
                System.out.println("valor invalido");
            }
        }
    }


