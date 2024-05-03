public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Posnet posnet = new Posnet();
        Persona persona1 = new Persona("9534238", "Roberto", "Caceres", "3207794883", "caceresrobert@gmail.com");
        TarjetaDeCredito tarjetaDeCredito1 = new TarjetaDeCredito("FakeBank", "4811119527637890", 15000, EntidadFinanciera.BIZA, persona1);

        System.out.println("Tarjeta antes del Pago");
        System.out.println(tarjetaDeCredito1);

        System.out.println("Ticket tras pagar...");
        Ticket ticketGenerado = posnet.efectuarPago(tarjetaDeCredito1, 10000, 5);
        System.out.println(ticketGenerado);

        System.out.println("Tarjeta despues del pago");
        System.out.println(tarjetaDeCredito1);





    }
}