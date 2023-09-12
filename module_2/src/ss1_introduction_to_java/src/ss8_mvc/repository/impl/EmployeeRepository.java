package ss8_mvc.repository.impl;

import ss8_mvc.model.Furama;
import ss8_mvc.repository.IEmployeeRepository;

import java.util.ArrayList;

public class EmployeeRepository implements IEmployeeRepository {
    private static ArrayList<Furama> employee = new ArrayList<>();

    static {
       employee.add(new Furama("test","mot thang",500000,5,100,1));
       employee.add(new Furama("test2","mot tuan",200000,5,100,2));
       employee.add(new Furama("test3","mot nam",5000000,5,200,3));
    }

    @Override
    public ArrayList getListEmployee() {
        return employee;
    }

    @Override
    public void addEmployee() {

    }
}
