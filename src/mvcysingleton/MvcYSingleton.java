
package mvcysingleton;

// Clase principal para ejecutar el proyecto
public class MvcYSingleton {
    public static void main(String[] args) {
    // Obtenemos la instancia única del modelo
    DataModel model = DataModel.getInstance();
    
    // Creamos el controlador y la vista
    DataController controller = new DataController(model);
    DataView view = new DataView(controller);
    
    // Agregamos algunos datos al modelo
    controller.addData("Este es el dato numero 1");
    controller.addData("Este es el dato numero 2");
    controller.addData("Este es el dato numero 3");

    // Mostramos los datos usando la vista
    view.printDataList();
    }
    
}
