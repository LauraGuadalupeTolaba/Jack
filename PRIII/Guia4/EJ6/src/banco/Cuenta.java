package banco;

public abstract class Cuenta {

        private double saldo;
        private final String nombre;

        public Cuenta(String nombre)
        {
            this.saldo = 0.0 ;
            this.nombre = nombre;
        }

        public String getNombre()
        {
            return nombre;
        }

        public double getSaldo()
        {
            return saldo;
        }
        public void depositar(double importe)
        {
            this.saldo += importe;
        }

        public void setSaldo(double saldo)
        {
            this.saldo = saldo;
        }

        public final void Extraer(double UnMonto)
        {
            if(validaExtraccion(UnMonto))

                extraer(UnMonto);

            else

                System.out.println("No se puede extraer :)");

        }

        protected abstract void extraer(double importe);

        protected abstract boolean validaExtraccion(double Unmonto);

}

