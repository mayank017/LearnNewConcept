package POJO;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SerializationAndDeserilization {

    public static void main(String[] args) throws JsonProcessingException {
        EmployeeClass ec = new EmployeeClass();
        ec.setFirstName("Mayank");
        ec.setLastName("Jaiswal");
        ec.setGender("male");
        ec.setAge(34);
        ec.setSalary(500000);

        // serialization
        ObjectMapper objmap = new ObjectMapper();
        String empObj = objmap.writeValueAsString(ec);

        // Deserialization
        EmployeeClass empDes = objmap.readValue(empObj, EmployeeClass.class);
        System.out.println(empDes.getFirstName() + empDes.getLastName() + empDes.getAge() + empDes.getGender() + empDes.getSalary());
    }
}
