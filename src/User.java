public class User {
  private String name;
  private String email;
  private String password;
  private String phone;
  private Module[] modules;

  public User(String name, String email, String password, String phone, Module[] modules) {
    this.name = name;
    this.email = email;
    this.password = password;
    this.phone = phone;
    this.modules = modules;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public String getPassword() {
    return password;
  }

  public String getPhone() {
    return phone;
  }

  public Module[] getModules() {
    return modules;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public void newModule(Module module) {
    Module[] newModules = new Module[modules.length + 1];
    for (int i = 0; i < modules.length; i++) {
      newModules[i] = modules[i];
    }
    newModules[modules.length] = module;
    modules = newModules;
  }

  public void removeModule(String code) {
    Module[] newModules = new Module[modules.length - 1];
    int j = 0;
    for (int i = 0; i < modules.length; i++) {
      if (modules[i].getCode() != code) {
        newModules[j] = modules[i];
        j++;
      }
    }
    modules = newModules;
  }
}