
package mvcysingleton;


public class DataView {
    private DataController controller;

  public DataView(DataController controller) {
    this.controller = controller;
  }

  public void printDataList() {
    for (String data : controller.getDataList()) {
      System.out.println(data);
    }
  }
}
