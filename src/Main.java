public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        cliente.setEdad(21);
        cliente.setNombre("Alexis");
        cliente.setTelefono("5546374580");
        cliente.setCredito(132567);
        trabajador.setSalario(12000);

        System.out.println("Nombre del cliente: " + cliente.getNombre()
        + "\nEdad del cliente: " + cliente.getEdad() + "\nTeléfono del cliente: "
        + cliente.getTelefono() + "\nNo. de crédito: " + cliente.getCredito()
        + "\nSalario: $" + trabajador.getSalario());
    }
}

class Persona {
    int edad = 0;
    String nombre = "";
    String telefono = "";

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public String getTelefono(){
        return telefono;
    }
}

class Cliente extends Persona {

    int credito = 0;

    public int getCredito() {
        return credito;
    }
    public void setCredito(int credito) {
        this.credito = credito;
    }

}

class Trabajador extends Persona {
    int salario = 0;

    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
}

