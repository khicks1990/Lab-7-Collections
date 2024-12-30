/**
   Chapter 18, Programming Challenge 3
   EmployeeMapDemo program
*/

public class Main
{
   public static void main(String[] args)
   {
      // Create an instance of EmployeeMap.
      EmployeeMap emap = new EmployeeMap();

      // Create an array of employees.
      Employee employees[] =
            {    
                new Employee("123", "Jack Shepard"),
                new Employee("234", "Charlie Pace"),
                new Employee("345", "Hugo Reyes"),
                new Employee("456", "Sun Kwon"),
                new Employee("567", "Claire Littleton"),
                new Employee("678", "Ana Lucia Cortez")
            };

      // Add the employees to the EmployeeMap.
      for (int index = 0; index < employees.length; index++)
         emap.add(employees[index]);

      // Search for the mappings that we just added.
      searchEmployee(emap, "123");
      searchEmployee(emap, "234");
      searchEmployee(emap, "345");
      searchEmployee(emap, "456");
      searchEmployee(emap, "567");
      searchEmployee(emap, "678");

      // Now search for a mapping that does not exist.
      searchEmployee(emap, "999");
   }

   public static void searchEmployee(EmployeeMap emap, String id)
   {
      // Get the Employee object associated with id.
      Employee e = emap.get(id);

      // If an Employee was returned, display it.
      if (e != null)
         System.out.println(e);
      else
         System.out.println(id + " is not found in the map.");
   }
}
