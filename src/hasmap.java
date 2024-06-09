public class hasmap {
    public hasmap() {
    }

    public static int key(int NUMERO_RESERVA){
        //98% de colisões, é pegar ou largar
        int chave = Math.abs(((((NUMERO_RESERVA/3)+10)/9))%100);
        //System.out.println("Reserva: "+NUMERO_RESERVA);
        //System.out.println("Saida: "+chave);
        return chave;
    }

}
