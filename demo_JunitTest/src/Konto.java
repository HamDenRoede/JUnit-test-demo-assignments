
public class Konto
{

    private String navn;
    private int saldo;

    public Konto(String navn, int saldo)
    {
        this.navn = navn;
        this.saldo = saldo;
    }

    public String getNavn()
    {
        return navn;
    }

    public int getSaldo()
    {
        return saldo;
    }

    public int insert(int i)
    {
        saldo += i;
        return saldo;
    }


}
