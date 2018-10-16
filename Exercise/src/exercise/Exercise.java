
package exercise;

public class Exercise {
    
    public static void main(String[] args) {
        Employee jora = new Employee();
        jora.setName("Жора");
        jora.setAge(21);
        
        Employee petr = new Employee("Петр", 18);
        
        Employee[] employes = new Employee[2];
        employes[0] = jora;
        employes[1] = petr;
        
        Department pochvaDep = new Department();
        pochvaDep.setName("Почвоведение");
        pochvaDep.setArrayOfEmployes(employes);
        pochvaDep.printEmployes();
    }
    
}
