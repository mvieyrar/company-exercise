package principles.abstraction.company.proposal;

public class Programmer implements Employee
{    
	@Override
	public String doWork(String systemName) {
		return "Here's the code for: " + systemName + "\n";
	}
}
