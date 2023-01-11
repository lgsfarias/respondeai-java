public class Module {
  String name;
  String code;
  String description;

  public Module(String name, String code, String description) {
    this.name = name;
    this.code = code;
    this.description = description;
  }

  public String getName() {
    return name;
  }

  public String getCode() {
    return code;
  }

  public String getDescription() {
    return description;
  }
}
