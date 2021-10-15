package principles.abstraction.company.proposal;

public class Tester implements Employee
{    
	@Override
	public String doWork(String systemName) {
		return "Tested: " + systemName + "\n";
	}
}
