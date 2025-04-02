import Agenda.Agenda;

public class Main {
    public static void main(String[] args)
    {
        Agenda agenda = Agenda.getInstancia();


        agenda.agregaContacto("Patroclo");
        agenda.actualizarFijo("Patroclo",456789);
        agenda.actualizarCelular("Patroclo",153456792);
        agenda.actualizarCelular("Patroclo",152436792);
        agenda.actualizarCelular("Patroclo",155456855);

        agenda.agregaContacto("Jack");
        agenda.actualizarFijo("Jack",456788);
        agenda.actualizarCelular("Jack",155456792);

        agenda.agregaContacto("Paris");
        agenda.actualizarFijo("Paris",456787);
        agenda.actualizarCelular("Paris",156456795);
        agenda.actualizarCelular("Paris",155456895);

        agenda.agregaContacto("Jack");

        System.out.println(agenda.busquedaContacto("Patroclo"));
        System.out.println(agenda.busquedaContacto("Mandarina"));

        agenda.todosContactos();
    }
}