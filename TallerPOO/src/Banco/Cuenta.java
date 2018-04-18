package Banco;

/**
 *
 * @author bollo
 */
public class Cuenta {
    private double saldo = 0;

    public Cuenta(double saldoInicial) {
        if(saldoInicial > 0)
        {
            this.saldo = saldoInicial;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void abonar(double monto)
    {
        saldo += monto;
    }
    
    
    
}
