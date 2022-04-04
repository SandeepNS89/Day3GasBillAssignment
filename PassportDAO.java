

import java.util.Set;

public interface PassportDAO
{
	void addPassport();
	void modifyPassport();
	void deletePassport();
	Employee findPassport();
	Set<Employee> findAllPassport();
}