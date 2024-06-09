import java.util.Date;
public class Hospede {

    private int NUMERO_RESERVA;
    private String NOME_HOTEL;
    private int NUMERO_QUARTO;
    private  String DATA_CHECKIN;
    private  String DATA_CHECKOUT;

    public Hospede(int NUMERO_RESERVA,String NOME_HOTEL,int NUMERO_QUARTO,String DATA_CHECKIN,String DATA_CHECKOUT) {
        this.NUMERO_RESERVA = NUMERO_RESERVA;
        this.NOME_HOTEL = NOME_HOTEL;
        this.NUMERO_QUARTO = NUMERO_QUARTO;
        this.DATA_CHECKIN = DATA_CHECKIN;
        this.DATA_CHECKOUT = DATA_CHECKOUT;
    }

    public int getNUMERO_RESERVA() {
        return NUMERO_RESERVA;
    }

    public void setNUMERO_RESERVA(int NUMERO_RESERVA) {
        this.NUMERO_RESERVA = NUMERO_RESERVA;
    }

    public int getNUMERO_QUARTO() {
        return NUMERO_QUARTO;
    }

    public void setNUMERO_QUARTO(int NUMERO_QUARTO) {
        this.NUMERO_QUARTO = NUMERO_QUARTO;
    }

    public String getNOME_HOTEL() {
        return NOME_HOTEL;
    }

    public void setNOME_HOTEL(String NOME_HOTEL) {
        this.NOME_HOTEL = NOME_HOTEL;
    }

    public String getDATA_CHECKIN() {
        return DATA_CHECKIN;
    }

    public void setDATA_CHECKIN(String DATA_CHECKIN) {
        this.DATA_CHECKIN = DATA_CHECKIN;
    }

    public String getDATA_CHECKOUT() {
        return DATA_CHECKOUT;
    }

    public void setDATA_CHECKOUT(String DATA_CHECKOUT) {
        this.DATA_CHECKOUT = DATA_CHECKOUT;
    }

}
