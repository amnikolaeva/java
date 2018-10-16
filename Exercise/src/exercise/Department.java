package exercise;

public class Department {
    
    private String name;
    private Employee[] arrayOfEmployes;
    
    public Department() {
        ;
    }
    
    public Department(String name, Employee[] arrayOfEmployes) {
        this.name = name;
        this.arrayOfEmployes = arrayOfEmployes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee[] getArrayOfEmployes() {
        return arrayOfEmployes;
    }

    public void setArrayOfEmployes(Employee[] arrayOfEmployes) {
        this.arrayOfEmployes = arrayOfEmployes;
    }
    
    public void printEmployes() {
        for (int i = 0; i < arrayOfEmployes.length; i++) {
            String name = arrayOfEmployes[i].getName();
            int age = arrayOfEmployes[i].getAge();
            System.out.println("Имя сотрудника " + name);
            System.out.println("Возраст сотрудника " + age + " лет");
            System.out.println();
        }
    }
    
}
