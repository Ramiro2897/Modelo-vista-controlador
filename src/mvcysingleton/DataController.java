
package mvcysingleton;

import java.util.List;

// Clase controlador
public class DataController {
    private DataModel model;

  public DataController(DataModel model) {
    this.model = model;
  }

  public void addData(String data) {
    model.getDataList().add(data);
  }

  public List<String> getDataList() {
    return model.getDataList();
  }
}
