public class Main {

    //Crear un objeto persona en el main.
    //Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.

    public static void main(String[] args) {
        Persona rodrigo = new Persona();
        rodrigo.setNombre("Rodrigo");
        rodrigo.setEdad(39);
        rodrigo.setTelefono("722537788");
        System.out.printf("%s, %d, %s\n", rodrigo.getNombre(), rodrigo.getEdad(),
                rodrigo.getTelefono());
    }
}


//Crear clase Persona.
//Crear variables las privadas edad, nombre y teléfono de la clase Persona.
//Crear gets y sets de cada propiedad.

class Persona {
    private  int edad;
    private String nombre;
    private String telefono;


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}