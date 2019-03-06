
package nicole.interessimple.objects;

public class interesSimpleObject {

    private String  m_strCliente;
    private int m_iCapitalInicial;
    private int m_iTasaInteres;
    private int m_iTiempoInversion;

    public interesSimpleObject(String p_strCliente, int p_iCapitalInicial, int p_iTasaInteres, int p_iTiempoInversion) {
        setCliente(p_strCliente);
        setCapitalInicial(p_iCapitalInicial);
        setTasaInteres(p_iTasaInteres);
        setTiempoInversion(p_iTiempoInversion);
    }

    
    public String getCliente() {
        return m_strCliente;
    }

    private void setCliente(String p_strCliente) {
        m_strCliente = p_strCliente;
    }

    public int getCapitalInicial() {
        return m_iCapitalInicial;
    }

    private void setCapitalInicial(int p_iCapitalInicial) {
        m_iCapitalInicial = p_iCapitalInicial;
    }

    public int getTasaInteres() {
        return m_iTasaInteres;
    }

    private void setTasaInteres(int p_iTasaInteres) {
        m_iTasaInteres = p_iTasaInteres;
    }

    public int getTiempoInversion() {
        return m_iTiempoInversion;
    }

    private void setTiempoInversion(int p_iTiempoInversion) {
        m_iTiempoInversion = p_iTiempoInversion;
    }
    
    public int  getiFinal(){
        int valorFuturo = (int) (getCapitalInicial() * (Math.pow(1+m_iTasaInteres, m_iTiempoInversion)));
        int iFinal = valorFuturo - getTasaInteres();
        return iFinal;
    }
}