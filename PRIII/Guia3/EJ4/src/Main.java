public class Main {
    public static void main(String[] args)
    {
        Empresa empresa = Empresa.getInstancia();
        Departamentos mantenimiento = new Departamentos("Mantenimiento") ;
        Departamentos contabilidad = new Departamentos("Contabilidad") ;

        mantenimiento.agregarEmpleado(new Intermedio("Juan Perez",1234,"Matheu 2343",12000.0,7) );
        mantenimiento.agregarEmpleado(new Temporarios("Julio Garcia",3209,"Colon 3451",80.0,160));
        mantenimiento.agregarEmpleado(new Temporarios("Martin Rodriguez",3210,"Mitre 3451",70.0,100));

        contabilidad.agregarEmpleado(new Experto("Mara Anchorena",987,"Luro 3489",13000,18));
        contabilidad.agregarEmpleado(new Principiante("Sandra Fernandez",1276,"Córdoba 3843",11500.0,6));
        contabilidad.agregarEmpleado(new Principiante("Luis Gomez",1544,"Formosa 2354",10500.0,1));
        contabilidad.agregarEmpleado(new Intermedio("Lucas Benitez",1634,"Castelli 4563",10500.0,12));

        System.out.println(mantenimiento.toString());
        System.out.println(contabilidad.toString());
    }
}