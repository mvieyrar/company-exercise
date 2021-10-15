package principles.abstraction.company.proposal;

public class SoftwareCompany extends Company{

	public SoftwareCompany(String name) {
		super(name);		
	}

	@Override
	public String createProduct(String systemName) {
		StringBuilder system = new StringBuilder();

        Employee designer = new Designer();
        system.append(designer.doWork(systemName));

        Employee programmer = new Programmer();
        system.append(programmer.doWork(systemName));

        Employee tester = new Tester();
        system.append(tester.doWork(systemName));

        return system.toString();
	}
	
}
