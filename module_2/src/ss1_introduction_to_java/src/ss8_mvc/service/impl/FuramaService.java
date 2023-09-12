package ss8_mvc.service.impl;

import ss8_mvc.repository.IEmployeeRepository;
import ss8_mvc.repository.impl.EmployeeRepository;
import ss8_mvc.service.IFuramaService;

public class FuramaService implements IFuramaService {
    private IEmployeeRepository furamaRepository = new EmployeeRepository();
}
