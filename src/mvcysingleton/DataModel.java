
package mvcysingleton;
import java.util.ArrayList;
import java.util.List;

// Clase singleton para el modelo de datos
public class DataModel {
  private static DataModel instance = null;
  private List<String> dataList;

  private DataModel() {
    dataList = new ArrayList<>();
  }

  public static DataModel getInstance() {
      //si es null nos la crea y la retornamos
    if (instance == null) {
      instance = new DataModel();
    }
    //retornamos la instancia
    return instance;
  }

  public List<String> getDataList() {
    return dataList;
  }

  public void setDataList(List<String> dataList) {
    this.dataList = dataList;
  }
}
